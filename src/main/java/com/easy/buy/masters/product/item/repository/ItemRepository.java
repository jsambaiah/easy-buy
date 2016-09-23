/**
 * 
 */
package com.easy.buy.masters.product.item.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.easy.buy.masters.product.item.dto.Item;

/**
 * @author Sambaiah
 *
 */
public interface ItemRepository extends MongoRepository<Item, String> {
	public List<Item> findByName(String name);
}
