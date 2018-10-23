package com.codeclan.homework.fileFolder.components;

import com.codeclan.homework.fileFolder.models.File;
import com.codeclan.homework.fileFolder.models.Folder;
import com.codeclan.homework.fileFolder.models.User;
import com.codeclan.homework.fileFolder.repositories.FileRepository;
import com.codeclan.homework.fileFolder.repositories.FolderRepository;
import com.codeclan.homework.fileFolder.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;

public class DataLoader {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;


    public void run(ApplicationArguments args) {
        User user1 = new User("Joy");
        userRepository.save(user1);
        User user2 = new User("Hope");
        userRepository.save(user2);
        Folder folder1 = new Folder("Rubyfolder", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("PowerPointfolder", user2);
        folderRepository.save(folder2);
        File file1 = new File("Rubyfile", "RB", 10, folder1);
        fileRepository.save(file1);
        File file2 = new File("Presentation", "PPT", 30, folder2);
        fileRepository.save(file2);
    }
}
