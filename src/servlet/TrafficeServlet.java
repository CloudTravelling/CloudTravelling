package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by 亚中 on 2016-05-22.
 */
@WebServlet("/getTrafficData")
public class TrafficeServlet extends HttpServlet {
    private final static String url = "http://115.182.0.157/trafficInfo/getTrafficInfoByName?key=6401a620fbe582b3f6f348ce4dbd57bf&longitude=121.35&latitude=31.22&cityName=%E4%B8%8A%E6%B5%B7%E5%B8%82&roadName=%E5%8D%97%E4%BA%AC%E4%B8%9C%E8%B7%AF&dtype=json";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
//        String result = Service.getData(url);
        String result = "{\"reason\":\"查询成功\",\"result\":{\"roadInfo\":{\"roadLength\":546,\"roadName\":\"南京东路\",\"cityName\":\"上海市\"},\"traffic\":{\"trendInfo\":[[{\"RL\":247,\"IL\":121.483195,\"AS\":18,\"SGID\":1195654001,\"TT\":4,\"CT\":1464509681,\"PT\":49,\"HT\":1,\"IN\":\"四川中路\",\"IB\":31.240451,\"MS\":23,\"IR\":2},{\"RL\":126,\"IL\":121.482011,\"AS\":13,\"SGID\":1195654002,\"TT\":4,\"CT\":1464509766,\"PT\":34,\"HT\":1,\"IN\":\"江西中路\",\"IB\":31.240051,\"MS\":19,\"IR\":2},{\"RL\":175,\"IL\":121.48035,\"AS\":16,\"SGID\":1195654003,\"TT\":4,\"CT\":1464509796,\"PT\":39,\"HT\":1,\"IN\":\"河南中路\",\"IB\":31.239535,\"MS\":21,\"IR\":1}],[{\"RL\":175,\"IL\":121.482011,\"AS\":26,\"SGID\":1195655001,\"TT\":4,\"CT\":1464489713,\"PT\":24,\"HT\":1,\"IN\":\"江西中路\",\"IB\":31.240051,\"MS\":32,\"IR\":2},{\"RL\":126,\"IL\":121.483195,\"AS\":13,\"SGID\":1195655002,\"TT\":4,\"CT\":1464489157,\"PT\":34,\"HT\":1,\"IN\":\"四川中路\",\"IB\":31.240451,\"MS\":30,\"IR\":2},{\"RL\":245,\"IL\":121.485583,\"AS\":18,\"SGID\":1195655003,\"TT\":4,\"CT\":1464489814,\"PT\":49,\"HT\":1,\"IN\":\"中山东一路\",\"IB\":31.240905,\"MS\":30,\"IR\":1}]],\"trafficText\":[{\"textInfo\":[],\"trend\":\"由东向西\"},{\"textInfo\":[],\"trend\":\"由西向东\"}]}},\"error_code\":0}";
        PrintWriter printWriter = response.getWriter();
        printWriter.print(result);
        printWriter.flush();
        printWriter.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
