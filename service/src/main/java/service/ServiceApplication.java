package service;

import com.doctorai.test.Result;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mr.J on 2018/7/24.
 */

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServiceApplication {

    @GetMapping("/getMsg")
    public String getMsg(){
        return "Hello SpringCloud!";
    }

    @GetMapping("/getResult")
    public Result getResult(){

        Result result = new Result();
        try {
            Map map = new HashMap<String,String>();
            map.put("key1","hello,github!");
            map.put("key2","Hi,everyone ,Nice to meet you !");
            result.setDate(map);


        }catch (Exception e){
            e.printStackTrace();
            result.setState(0);
            return result;
        }
        result.setState(1);
        return result;

    }

    @RequestMapping("/getInfo")
    public String getInfo(){
        return "Hello SpringCloud!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
