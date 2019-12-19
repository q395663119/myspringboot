package controller;

import entity.student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//@RestController
@Controller
public class myController {

    @RequestMapping("/hello")//是之前//@RestController暂时是用不了
    public  String hello(){
        return "hello";
    }
//就是springboot不适用jsp,跳转不是交给服务器,而是交给我们前段页面跳转,不使用controller,不需要回到会页面,
    //想回页面也是可以的,配置一下,掉一个接口,主要就是负责return



    /*
    * similif代替了jsp,就是原生的html,就是要配置一下原生的就支持thymeleaf,也是是vue,就是
    * 1.当我访问某个请求,跳转页面,并给值,
    * */

    @RequestMapping("/stu")
 public String student(Model model){
        student stu1 = new student("庄三",23,"男");
        student stu2 = new student("庄",22,"男");
        List<student> list = new ArrayList<student>();
        list.add(stu1);
        list.add(stu2);

        model.addAttribute("my",list);

        return "my";//返回一个页面
 }
 @RequestMapping("/p")
    public  String p(Model model){
        model.addAttribute("name","hlll");
        return "my";
 }


    /**
     * //model
     *      //Model And View
     *      * Model是每次请求中都存在的默认参数，利用其addAttribute()方法即可将服务器的值传递到jsp页面中；
     *      * ModelAndView包含model和view两部分，使用时需要自己实例化，利用ModelMap用来传值，也可以设置view的名
     */
    //这个是传你一个String字符串在页面接受
    @RequestMapping("/mv")
    public  String  mod(Model mv){
        //ModelAndView 数据+模型对象.可以绑定数据制定页面,
        mv.addAttribute("name","helloword");
        //本来就是会一个String字符串 ,这个就是会没有,jsp如果就是会你的数据,?怎么办
        return "my";
    }

    //这就是之前的转发
    @RequestMapping("hello2")
    public ModelAndView hello2(ModelAndView mv){
        mv.addObject("name","hlll");
        mv.setViewName("my");

        //看得上数据也有了,也设置到页面上面的就最后返回一个mv对象
        return  mv ;
    }

    @RequestMapping("hello3")
    public String  hello4(Map<String,String> map){
        //返回的是ModelAndView对象
      /*  ModelAndView mv = new ModelAndView("my");//my是view的名称
        return mv;折磨是报错的*/
        map.put("name","andy");
        return "my";
    }

}
