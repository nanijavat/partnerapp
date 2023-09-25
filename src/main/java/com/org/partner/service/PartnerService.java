package com.org.partner.service;

import com.org.partner.model.PartnerModel;

import java.util.List;

public interface PartnerService {

    public void createPartner(PartnerModel partnerModel);

    public List<PartnerModel> getAllRecords();
}
