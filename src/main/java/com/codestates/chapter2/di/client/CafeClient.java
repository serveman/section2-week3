package com.codestates.chapter2.di.client;

import com.codestates.chapter2.di.Config;
import com.codestates.chapter2.di.controller.MenuController;
import com.codestates.chapter2.di.Menu;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;

public class CafeClient {
  public static void main(String[] args) {
    GenericApplicationContext context =
        new AnnotationConfigApplicationContext(Config.class);
    MenuController controller = context.getBean(MenuController.class);
    
    List<Menu> menuList = controller.getMenus();
  }
}
