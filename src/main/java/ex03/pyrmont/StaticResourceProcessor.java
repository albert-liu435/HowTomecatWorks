package ex03.pyrmont;

import ex03.pyrmont.connector.http.HttpRequest;
import ex03.pyrmont.connector.http.HttpResponse;

import java.io.IOException;

/**
 * 静态资源处理器
 */
public class StaticResourceProcessor {

    public void process(HttpRequest request, HttpResponse response) {
        try {
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
