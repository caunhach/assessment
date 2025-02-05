package com.kbtg.bootcamp.posttest.Controller;

import com.kbtg.bootcamp.posttest.Service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/lotteries")
public class LotteryController {

    @Autowired
    private final LotteryService lotteryService;

    public LotteryController(LotteryService lotteryService) {
        this.lotteryService = lotteryService;
    }

    @GetMapping("")
    public ResponseEntity<Map<String, List<String>>> getLottery() {

        return ResponseEntity.ok(Collections.singletonMap("tickets", lotteryService.getLottery()));
    }
}

