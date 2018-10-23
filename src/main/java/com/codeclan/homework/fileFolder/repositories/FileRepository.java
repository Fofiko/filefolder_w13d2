package com.codeclan.homework.fileFolder.repositories;

import com.codeclan.homework.fileFolder.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
