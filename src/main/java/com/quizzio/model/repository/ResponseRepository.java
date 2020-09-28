package com.quizzio.model.repository;


import com.quizzio.model.entities.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cloarec1 on 19/12/2017.
 */

@Repository
public interface ResponseRepository extends JpaRepository<Response, Integer> {

}
