package web;

import service.test1.demo1;
import service.test2.demo2;
import service.test3.demo3;
import service.test4.demo4;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.awt.Desktop;

/**
 * @program: SA2
 * @description:
 * @author: lydms
 * @create: 2022-10-17 10:09
 **/
public class Servlet1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String demoNum = req.getParameter("demo");
        if (demoNum.equals("demo1")){
            demo1 demo1 = new demo1();
            demo1.main1();
        }
        else if (demoNum.equals("demo2")){
            demo2 demo2 = new demo2();
            demo2.main2();
        }
        else if (demoNum.equals("demo3")){
            demo3 demo3 = new demo3();
            demo3.main3();
        }
        else{
            demo4 demo4 = new demo4();
            demo4.main4();
        }
        resp.sendRedirect("http://localhost:8080/SA/pages/jieguo.html");
    }



}
