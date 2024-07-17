package com.sitinuraisha.ayambertelur.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sitinuraisha.ayambertelur.model.EggRecord;
import com.sitinuraisha.ayambertelur.repositories.EggRecordRepository;

@Service
public class IncomeService {
    @Autowired
    private EggRecordRepository eggRecordRepository;

    public int calculateTotalEggs() {
        return eggRecordRepository.findAll().stream()
                .mapToInt(EggRecord::getEggCount)
                .sum();
    }
}