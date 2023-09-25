package com.org.partner.controller;

import com.org.partner.model.PartnerModel;
import com.org.partner.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PartnerController {

    @Autowired
    private PartnerService partnerService;

    @PostMapping("/create")
    public String createPartner(@RequestBody PartnerModel partnerModel){
        partnerService.createPartner(partnerModel);
        return "successfully created record";
    }

    @GetMapping("/allRecords")
    public List<PartnerModel> getPartnerFromTheDb(){
       List<PartnerModel>list= partnerService.getAllRecords();
        return list;
    }

}
