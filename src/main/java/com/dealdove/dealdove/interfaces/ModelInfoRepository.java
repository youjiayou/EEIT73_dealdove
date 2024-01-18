package com.dealdove.dealdove.interfaces;


import com.dealdove.dealdove.model.ModelInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelInfoRepository extends JpaRepository<ModelInfo, Long> {

}
