package chapter3;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

// WebServletAnnotation(アノーテーション)
// URLの指定
// ※クラス定義の直前に記述！
@WebServlet( urlPatterns = {"/chapter3/hello"} )

// extends               = 定義
public class Hello extends HttpServlet {
    public void doGet (
        // リクエストを渡す ↓
        HttpServletRequest  request ,
        // レスポンス生成して渡す ↑
        HttpServletResponse response

        // ServletException  : サーブレットでの問題
        // IOException       : javaでの問題
    ) throws ServletException , IOException {
        PrintWriter out  = response.getWriter();

        out.println("Hello こんにちは!");
        out.println(new java.util.Date());
    }
}
