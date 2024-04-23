package com.china.springbootcli.demos.web;



import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class RestfulController {
    @RequestMapping(value = "/userinfo/str/{name}",method = RequestMethod.GET)
    public String getInfo(@PathVariable("name") String name){
        return "name:"+name;
    }

    @RequestMapping(value = "/userinfo",method = RequestMethod.GET)
    @CrossOrigin(origins = "*") // 设置允许跨域的源
    public ResponseEntity getInfo2(@RequestParam("name") String name){
        Map map =new HashMap();
        map.put("name",name);
        map.put("origins","*");
        return ResponseEntity.ok(map);
    }

    @RequestMapping(value = "/userinfo",method = RequestMethod.POST)
    public ResponseEntity getInfo3(@RequestParam String name){
        Map map =new HashMap();
        map.put("name",name);
        map.put("age",18);
        map.put("address","上海市松江区");
        return ResponseEntity.ok(map);
    }

    @RequestMapping(value = "/userinfo4",method = RequestMethod.POST)
    public ResponseEntity getInfo4(@RequestBody User user){
        User user1 = new User();
        user1.setName(user.getName());
        user1.setAge(22);
        return ResponseEntity.ok(user1);
    }
}
