package com.org.partner.controller;

import com.org.partner.model.PartnerModel;
import com.org.partner.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
