/**
 * 
 */
package com.easy.buy.masters.product.item.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.buy.masters.product.item.dto.Item;
import com.easy.buy.masters.product.item.repository.ItemRepository;

/**
 * @author Sambaiah
 *
 */
@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepository;
	public List<Item> findByName(String name) {
		return itemRepository.findByName(name);
	}

	public List<Item> findAll() {
		return itemRepository.findAll();
	}
}
