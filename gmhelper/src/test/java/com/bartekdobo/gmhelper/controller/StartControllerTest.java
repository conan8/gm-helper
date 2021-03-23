//package com.bartekdobo.gmhelper.controller;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(controllers = HomeController.class)
//public class StartControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    List<String> expectedList = Arrays.asList("a", "b", "c", "d");
//
//    @Test
//    public void main() throws Exception {
//	// ResultActions resultActions =
//
//	mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("welcome"))
//		.andExpect(model().attribute("message", equalTo("Bart")))
//		.andExpect(model().attribute("tasks", is(expectedList)))
//		.andExpect(content().string(containsString("Hello Bart")));
//
//	// MvcResult mvcResult = resultActions.andReturn();
//	// ModelAndView mv = mvcResult.getModelAndView();
//    }
//
//    // Get request with Param
//    @Test
//    public void hello() throws Exception {
//	mockMvc.perform(get("/hello").param("name", "This is Gm Helper!")).andExpect(status().isOk())
//		.andExpect(view().name("welcome"))
//		.andExpect(model().attribute("message", equalTo("This is Gm Helper!")))
//		.andExpect(content().string(containsString("Hello, his is Gm Helper!")));
//    }
//
//}
