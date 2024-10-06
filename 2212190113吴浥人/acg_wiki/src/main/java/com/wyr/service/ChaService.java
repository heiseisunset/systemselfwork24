package com.wyr.service;

import com.wyr.pojo.Charactor;
import com.wyr.pojo.dto.CharactorDTO;
import com.wyr.repository.ChaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChaService implements IChaService{

    @Autowired
    ChaRepository chaRepository;


    @Override
    public Charactor add(CharactorDTO cha) {

        Charactor chaPojo=new Charactor();

        BeanUtils.copyProperties(cha,chaPojo);

        return chaRepository.save(chaPojo);
    }

    @Override
    public Charactor getCha(Integer chaId) {
        return chaRepository.findById(chaId).orElseThrow(()->{
            throw new IllegalArgumentException("未查询到相关角色");
        });

    }

    @Override
    public Charactor editCha(CharactorDTO cha) {
        Charactor chaPojo=new Charactor();

        BeanUtils.copyProperties(cha,chaPojo);

        return chaRepository.save(chaPojo);
    }

    @Override
    public void deleteCha(Integer chaId) {
        chaRepository.deleteById(chaId);
    }
}
