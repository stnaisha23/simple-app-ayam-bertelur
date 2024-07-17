package com.sitinuraisha.ayambertelur.controller;

import com.sitinuraisha.ayambertelur.model.EggRecord;
import com.sitinuraisha.ayambertelur.services.EggProductionService;
import com.sitinuraisha.ayambertelur.services.IncomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eggs")
public class EggProductionController {
    @Autowired
    private EggProductionService eggProductionService;

    @Autowired
    private IncomeService incomeService;

    @PostMapping("/ayambertelur")
    public EggRecord recordEggProduction(@RequestParam String chickenName, @RequestParam int eggCount) {
        return eggProductionService.recordEggProduction(chickenName, eggCount);
    }

    @GetMapping("/total")
    public String getTotalEggs() {
        int totalEggs = incomeService.calculateTotalEggs();
        return "Rekapitulasi penghasilan ayam bertelur adalah " + totalEggs + " telur.";
    }
}
