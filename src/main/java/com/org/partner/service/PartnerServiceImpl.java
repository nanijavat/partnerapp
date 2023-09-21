package com.org.partner.service;

import com.org.partner.model.PartnerModel;
import com.org.partner.repository.PartnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartnerServiceImpl implements PartnerService{

    @Autowired
    private PartnerRepo partnerRepo;
    @Override
    public void createPartner(PartnerModel partnerModel) {
        partnerRepo.save(partnerModel);
    }
}
