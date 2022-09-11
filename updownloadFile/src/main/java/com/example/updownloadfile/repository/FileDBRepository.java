package com.example.updownloadfile.repository;

import com.example.updownloadfile.entity.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB,String> {
}
