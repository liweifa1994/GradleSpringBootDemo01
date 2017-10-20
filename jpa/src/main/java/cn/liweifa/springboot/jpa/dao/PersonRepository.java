package cn.liweifa.springboot.jpa.dao;

import cn.liweifa.springboot.jpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PersonRepository extends JpaRepository<Person,Long>{

    List<Person> findByAddress(String address);

    Person findByAddressAndName(String address,String name);
//    @Query("select p from Person p where p.name= :name and p.address= :address")
//    withNameAndAddressNameQuery()

    List<Person> withNameAndAddressNameQuery(String name,String address);
}
