package cn.liweifa.springboot.webdemo02.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by josli on 17/10/19.
 * 定义自己的sevlet
 */
@WebServlet(urlPatterns = "/us/myServlet")
public class MyServlet extends HttpServlet{
    Logger logger = LoggerFactory.getLogger(MyServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info(MyServlet.class.getName()+"  "+System.currentTimeMillis());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
