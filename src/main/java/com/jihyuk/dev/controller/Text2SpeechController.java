package com.jihyuk.dev.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;

@Controller
public class Text2SpeechController {

	// method 단위로 분할 할 수 있다!! 

	@RequestMapping("hello")
	public ModelAndView hello() {
		return new ModelAndView("hello", "msg", "Hello MVC");
		
	}
	
	@RequestMapping("display")
	public ModelAndView display_voice() {
		TextToSpeech service = new TextToSpeech("af1a2b59-4af4-43ce-b653-62b6451bc3b1", "SkzS3u4egqCC");

		List<Voice> voices = service.getVoices().execute();
		
		return new ModelAndView("hello","voices",voices);
	}
}
