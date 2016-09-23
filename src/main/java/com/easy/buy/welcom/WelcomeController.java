/**
 * 
 */
package com.easy.buy.welcom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easy.buy.masters.product.item.dto.Item;
import com.easy.buy.masters.product.item.services.ItemService;

/**
 * @author Sambaiah
 *
 */
@Controller
public class WelcomeController {
	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "/getWelcomeItems", method = RequestMethod.GET)
	public @ResponseBody List<Item> getWelcomeItems() {
		return itemService.findAll();
	}
}
