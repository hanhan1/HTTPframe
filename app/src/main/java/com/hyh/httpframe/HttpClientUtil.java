package com.hyh.httpframe;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * 作者：hyh on 2017/3/16 16:33
 * github: https://github.com/hanhan1
 * QQ:549551740
 * 邮箱：hyh5878@163.com
 * 作用：
 */
public class HttpClientUtil {

    public void execute(RequestUtil requestUtil)throws Exception{
        switch (requestUtil.method){
            case GET:
                get();
                break;
            case POST:
                post();
                break;
            case DELETE:
                delete();
                break;
            case PUT:
                put();
                break;
            default:
                break;
        }
    }

    public void get(RequestUtil requestUtil)throws  Exception{
        HttpClient client = new DefaultHttpClient();
        HttpGet get = new HttpGet();
        HttpResponse response = client.execute(get);
    }

    public void post(RequestUtil requestUtil)throws Exception{
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost();

        HttpResponse response = client.execute(post);
    }

    public void delete(RequestUtil requestUtil)throws Exception{
        HttpClient client = new DefaultHttpClient();
        HttpDelete delete = new HttpDelete();
        HttpResponse response = client.execute(delete);
    }

    public void put(RequestUtil requestUtil)throws Exception{
        HttpClient client = new DefaultHttpClient();
        HttpPut put = new HttpPut();
        HttpResponse response = client.execute(put);
        return;
    }


}
