package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    // MVC
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello!!");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        //http://localhost:8080/hello-mvc?name=soyoon 이런식으로 ?다음에 파라미터 전달
        model.addAttribute("name",name);
        return "hello-template";
    }

    // API

    @GetMapping("hello-api-string")
    @ResponseBody
    public String helloApiString(@RequestParam("name") String name){
        return "hello! "+name;
    }
    //문자 반환
    //HTTP의 BODY에 문자 직접 반환
    //viewResolver 대신에 HttpMessageConverter 동작

    @GetMapping("hello-api-object")
    @ResponseBody
    public Hello helloApiObject(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }
    //객체 반환하면 객체가 JSON으로 자동 변환됨
    //HTTP의 BODY에 문자 직접 반환
    //viewResolver 대신에 HttpMessageConverter 동작

    static class Hello{
        private String name;
        //Getter and Setter은 Alt+Insert 단축키를 치면 나온다.
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}
