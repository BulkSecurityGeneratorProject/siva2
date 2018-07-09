package com.stpl.itemmaster.cucumber.stepdefs;

import com.stpl.itemmaster.SampleappApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SampleappApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
