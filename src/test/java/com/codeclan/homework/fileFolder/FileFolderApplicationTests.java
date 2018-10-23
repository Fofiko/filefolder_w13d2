package com.codeclan.homework.fileFolder;

import com.codeclan.homework.fileFolder.models.File;
import com.codeclan.homework.fileFolder.models.Folder;
import com.codeclan.homework.fileFolder.models.User;
import com.codeclan.homework.fileFolder.repositories.FileRepository;
import com.codeclan.homework.fileFolder.repositories.FolderRepository;
import com.codeclan.homework.fileFolder.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileFolderApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddAndSave(){
		File file = new File("Rubyfile", "RB", 10);
		fileRepository.save(file);
		Folder folder = new Folder("Rubyfolder");
		folderRepository.save(folder);
		User user = new User("Joy");
		userRepository.save(user);

	}

}
