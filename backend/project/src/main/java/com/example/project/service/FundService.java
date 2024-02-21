package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Fund;
import com.example.project.repository.FundRepo;

@Service
public class FundService {
    @Autowired
    private final FundRepo fundRepositry;

    public FundService(FundRepo fundRepositry) {
        this.fundRepositry = fundRepositry;
    }

    public Fund createFund(Fund fund) {
        return fundRepositry.save(fund);
    }

    public List<Fund> getAllFund() {
        return fundRepositry.findAll();
    }

    public Fund getFundId(int fundId) {
        return fundRepositry.findById(fundId).orElse(null);
    }

}