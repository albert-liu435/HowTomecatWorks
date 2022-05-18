package ex03.pyrmont.startup;

import ex03.pyrmont.connector.http.HttpConnector;

/**
 * 应用程序启动类，负责启动后台应用程序
 * http://localhost:8080/index.html
 * http://localhost:8080/abc.html
 * http://localhost:8080/servlet/PrimitiveServlet
 *
 *
 * http://localhost:8080/servlet/ModernServlet?userName=tarzan&password=pwd
 */
public final class Bootstrap {
    public static void main(String[] args) {
        HttpConnector connector = new HttpConnector();
        connector.start();
    }
}