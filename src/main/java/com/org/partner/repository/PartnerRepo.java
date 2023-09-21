package com.org.partner.repository;

import com.org.partner.model.PartnerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PartnerRepo extends JpaRepository<PartnerModel,Integer> {
}
