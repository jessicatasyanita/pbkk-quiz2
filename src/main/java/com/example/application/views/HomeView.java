package com.example.application.views;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;

@Route(value = "", layout = MainLayout.class)
@PageTitle("Home | MyContact")
@PermitAll
public class HomeView extends VerticalLayout{

    public HomeView(){
        addClassName("home-view");
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        add(
                new H2("Hi"),
                new H1("Welcome, To MyContact")
        );
    }
}
