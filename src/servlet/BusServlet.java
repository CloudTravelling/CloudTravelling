package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 亚中 on 2016-05-23.
 */
@WebServlet("/getBusData")
public class BusServlet extends HttpServlet {
    private final static String url = "http://apis.juhe.cn/szbusline/bus?key=bd30189240cb12d2bc3babe6e54e0b24&station=%E7%BA%B3%E7%B1%B3&dtype=json";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
//        String result = Service.getData(url);
        String result = "{\"resultcode\":\"200\",\"reason\":\"Success\",\"result\":[{\"stationName\":\"月亮湾首末站南\",\"stationCode\":\"MFB\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"独墅湖邻里中心东\",\"stationCode\":\"B3H\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"菁英公寓\",\"stationCode\":\"RBV\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"腾飞创新园\",\"stationCode\":\"RET\",\"carCode\":\"苏E-2U590\",\"ArrivalTime\":\"22:32:17\"},{\"stationName\":\"中科院纳米所西\",\"stationCode\":\"JGN\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"生物纳米园\",\"stationCode\":\"EFP\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"创意产业园\",\"stationCode\":\"KFM\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"独墅湖体育馆\",\"stationCode\":\"EUN\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"独墅湖体育馆东\",\"stationCode\":\"GCS\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"苏大公寓北区南\",\"stationCode\":\"RBF\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"西交大南\",\"stationCode\":\"ETZ\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"东大研究院\",\"stationCode\":\"GSP\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"翰林邻里中心\",\"stationCode\":\"FCS\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"西交大\",\"stationCode\":\"DHB\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"南大研究生院\",\"stationCode\":\"HGA\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"人大国际学院\",\"stationCode\":\"RBG\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"中科大\",\"stationCode\":\"ENT\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"独墅湖图书馆\",\"stationCode\":\"NRD\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"荣域花园\",\"stationCode\":\"CWP\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"塘浦路东\",\"stationCode\":\"DVA\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"金鸡湖学校\",\"stationCode\":\"RNN\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"邻瑞广场\",\"stationCode\":\"RNK\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"金湖\",\"stationCode\":\"GPJ\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"金鸡湖大酒店\",\"stationCode\":\"CBF\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"李公堤南\",\"stationCode\":\"MNH\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"高尔夫花园\",\"stationCode\":\"DVY\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"城邦花园\",\"stationCode\":\"CWH\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"水坊路西\",\"stationCode\":\"NFM\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"馨都广场\",\"stationCode\":\"FSD\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"嘉怡苑\",\"stationCode\":\"JMS\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"四季家园\",\"stationCode\":\"FXJ\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"师惠坊\",\"stationCode\":\"CVF\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"中央公园\",\"stationCode\":\"DXY\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"苏茜路\",\"stationCode\":\"AGE\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"欧莱雅\",\"stationCode\":\"DJH\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"欧尚超市\",\"stationCode\":\"SNY\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"夏园新村\",\"stationCode\":\"BPN\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"徐家浜\",\"stationCode\":\"EMX\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"苏大北校区\",\"stationCode\":\"DDY\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"苏大理想眼科医院\",\"stationCode\":\"RWF\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"相门\",\"stationCode\":\"GZU\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"市一中\",\"stationCode\":\"GXV\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"乐桥\",\"stationCode\":\"BGA\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"养育巷\",\"stationCode\":\"GYS\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"景德路\",\"stationCode\":\"FTJ\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"宋仙洲巷\",\"stationCode\":\"FWA\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"中市桥\",\"stationCode\":\"GBV\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"桃花坞\",\"stationCode\":\"BCA\",\"carCode\":\"苏E-2U190\",\"ArrivalTime\":\"22:35:17\"},{\"stationName\":\"惠济桥\",\"stationCode\":\"BZW\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"清塘新村\",\"stationCode\":\"FSX\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"塔影河桥\",\"stationCode\":\"EYT\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"蒲庵路\",\"stationCode\":\"BCD\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"虎阜大桥\",\"stationCode\":\"BTM\",\"carCode\":\"\",\"ArrivalTime\":\"\"},{\"stationName\":\"虎丘首末站\",\"stationCode\":\"HXE\",\"carCode\":\"苏E-2U057\",\"ArrivalTime\":\"22:32:56\"}],\"error_code\":0}";
        PrintWriter printWriter = response.getWriter();
        printWriter.print(result);
        printWriter.flush();
        printWriter.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
