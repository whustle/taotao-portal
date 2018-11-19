package com.taotao.portal.web.controller;

import com.taotao.portal.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * PageController class
 *
 * @author wjh
 * @date 2018/11/15
 */
@Controller
public class PageController {
	@Autowired
	private ContentService contentService;
	@RequestMapping("/index")
	public String index(Model model){
		String adJson = contentService.getContentList();
		model.addAttribute("ad1", adJson);
		return "index";
	}
}
