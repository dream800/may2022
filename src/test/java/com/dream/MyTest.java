package com.dream;

//import com.dream.model.Category;
//import com.dream.repository.CategoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = MayApplication.class)
public class MyTest {


//    @Autowired
//    private CategoryRepository categoryRepository;
//
//
//
//    @Test
//    public void test()
//    {
//
//        List<Category> roots = categoryRepository.findAllByIsRootOrderByIndexAsc(true);
//        List<Category> subs = categoryRepository.findAllByIsRootOrderByIndexAsc(false);
//
//        for (Category root : roots) {
//            System.out.println(root);
//        }
//        subs.forEach(System.out::println);
//    }

    @Test
    public void test2()
    {
        RestTemplate rest = new RestTemplate();
        String forObject = rest.getForObject("https://www.baidu.com", String.class);
        System.out.println(forObject);
//        rest.execute("http://localhost:8081/api/v1/banner/name?name=love", HttpMethod.GET, )
    }


    @Test
    public void test3() throws IOException {
        URL url = new URL("https://www.baidu.com");

        String path = url.getPath();
        System.out.println(path);

        Object content = url.getContent();
        System.out.println(content);

        URLConnection urlConnection = url.openConnection();
        System.out.println(urlConnection);


        Object content1 = urlConnection.getContent();
        System.out.println(content1.toString());




    }


}
