package com.example.sandbox.hibernatespringboot.repo.mapsid;


import com.example.sandbox.hibernatespringboot.model.common.mapsid.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, String> {

}