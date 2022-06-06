package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ScreenRepo;
import com.example.demo.modal.Screen;



@Service
public class ScreenService
{

@Autowired
ScreenRepo repo;

public Screen addScreen(Screen screen)
{
return this.repo.save(screen);
}

public List<Screen> getScreenList()
{

return repo.findAll();

}


}

