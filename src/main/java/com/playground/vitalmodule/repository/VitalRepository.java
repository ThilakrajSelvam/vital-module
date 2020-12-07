package com.playground.vitalmodule.repository;

import com.playground.vitalmodule.entity.Vital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * VitalRepository provides methods to interact with database table
 *
 * @author thilak
 * @created 12/4/20
 */
@Repository
public interface VitalRepository extends JpaRepository<Vital, UUID> {

}
