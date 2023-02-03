package com.codestates.chapter2.di.controller;

import com.codestates.chapter2.di.Menu;
import com.codestates.chapter2.di.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MenuController {
  @Autowired private MenuService menuService;
  
  public MenuController(MenuService menuService) {
    this.menuService = menuService;
  }
  
  public List<Menu> getMenus() {
    return menuService.getMenuList();
  }
}
