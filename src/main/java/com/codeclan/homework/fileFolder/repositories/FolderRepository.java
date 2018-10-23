package com.codeclan.homework.fileFolder.repositories;

import com.codeclan.homework.fileFolder.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
