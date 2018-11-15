package com.taotao.portal.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * PageController class
 *
 * @author wjh
 * @date 2018/11/15
 */
@Controller
public class PageController {
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
