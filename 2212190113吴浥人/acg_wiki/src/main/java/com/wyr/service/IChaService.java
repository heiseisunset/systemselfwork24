package com.wyr.service;

import com.wyr.pojo.Charactor;
import com.wyr.pojo.dto.CharactorDTO;
import org.springframework.stereotype.Service;

@Service
public interface IChaService {
    Charactor add(CharactorDTO cha);

    Charactor getCha(Integer chaId);

    Charactor editCha(CharactorDTO cha);

    void deleteCha(Integer chaId);
}
