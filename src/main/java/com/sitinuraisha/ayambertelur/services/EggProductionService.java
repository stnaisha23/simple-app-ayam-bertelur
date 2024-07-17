package com.sitinuraisha.ayambertelur.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sitinuraisha.ayambertelur.model.EggRecord;
import com.sitinuraisha.ayambertelur.repositories.EggRecordRepository;

@Service
public class EggProductionService {
    @Autowired
    private EggRecordRepository eggRecordRepository;

    public EggRecord recordEggProduction(String chickenName, int eggCount) {
        EggRecord record = new EggRecord();
        record.setChickenName(chickenName);
        record.setEggCount(eggCount);
        return eggRecordRepository.save(record);
    }
}
