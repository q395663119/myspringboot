package controller;

import entity.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import serviceImpl.ComputerServiceImpl;

@RestController
public class ComputerController {

  @Autowired
    ComputerServiceImpl csi;
  @RequestMapping("/insert")
   public int  insert(){
     Computer computer = new Computer(1,"戴尔","笔记本",5690.0);
     return csi.insert(computer);
   }


}
