package org.elevenfifty.shoppinglist.repositories;

import org.elevenfifty.shoppinglist.beans.ShoppingListItemPriority;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingListItemPriorityRepository extends CrudRepository<ShoppingListItemPriority, Long> {

}
