package app.bootproj.controller;

import lombok.Data;

import java.util.regex.Pattern;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.bootproj.pojo.FanList;
import app.bootproj.pojo.TestTable;
import app.bootproj.service.FanListService;
import app.bootproj.service.TestTableService;

@RestController
// @Validated
@CrossOrigin
@RequestMapping("/")
public class HelloController {
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    FanListService fanListService;

    @Autowired
    TestTableService testTableService;

    @RequestMapping("/")
    String hello() {
        String res = "Hello World~~~";
        
        return res;
    }

    @RequestMapping("/testjpa")
    List<TestTable> TestJPA(){
        return testTableService.getAll();
    }

    @RequestMapping("/testjpa/{id}")
    TestTable TestJPA(@PathVariable int id){
        return testTableService.getById(id);
    }

    @Data
    static class Result {
        public Result(int left2, int right2, long long1) {
        }
        private  int left;
        private  int right;
        private  long answer;

    }

    
}
