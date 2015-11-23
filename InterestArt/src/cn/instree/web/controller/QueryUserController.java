package cn.instree.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.instree.domain.User;
import cn.instree.service.UserService;

@Controller
public class QueryUserController{
	@Autowired
	private UserService userService;
	@RequestMapping("/queryUser")
	public ModelAndView queryItems(HttpServletRequest request) throws Exception{
		List<User> list = userService.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("usersList", list);
		modelAndView.setViewName("userList");
		return modelAndView;
	}
	/*private ItemsService itemService;
	
	@RequestMapping("/queryItems")
	public ModelAndView queryItems(HttpServletRequest request) throws Exception{
		List<ItemsCustom> list = itemService.findItemsList(null);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", list);
		modelAndView.setViewName("items");
		return modelAndView;
	}
	
	@RequestMapping("/editItem")
	public String editItems(Model model,@RequestParam(value="id")Integer items_id) throws Exception{
		ItemsCustom itemsCustom = itemService.findItemsById(items_id);
		model.addAttribute("itemsCustom", itemsCustom);
		return "editItems";
	}
	
	@RequestMapping("/updateItems")
	public String updateItems(HttpServletRequest request,ItemsCustom itemsCustom,Integer id) throws Exception{
		itemService.updateItems(id, itemsCustom);
		return "forward:queryItems.action";
	}*/
}
