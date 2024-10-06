package com.wyr.controller;


import com.wyr.pojo.Charactor;
import com.wyr.pojo.ResponseMessage;
import com.wyr.pojo.dto.CharactorDTO;
import com.wyr.service.IChaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/character") //url:"localhost:8080/character"
public class ChaController {

    @Autowired
    IChaService chaService;


    //增
    @PostMapping
    public ResponseMessage<Charactor> add(@Validated @RequestBody CharactorDTO cha){
        Charactor chaNew = chaService.add(cha);
        return ResponseMessage.success(chaNew);
    }

    //删
    @DeleteMapping ("/{chaId}")
    public ResponseMessage<Charactor> delete(@PathVariable Integer chaId){
        chaService.deleteCha(chaId);
        return ResponseMessage.success();
    }
    //改
    @PutMapping
    public ResponseMessage<Charactor> edit(@Validated @RequestBody CharactorDTO cha){
        Charactor chaNew = chaService.editCha(cha);
        return ResponseMessage.success(chaNew);
    }
    //查
    @GetMapping("/{chaId}")
    public ResponseMessage<Charactor> get(@PathVariable Integer chaId){
        Charactor chaNew = chaService.getCha(chaId);
        return ResponseMessage.success(chaNew);
    }
}


