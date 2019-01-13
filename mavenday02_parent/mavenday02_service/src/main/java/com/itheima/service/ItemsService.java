package com.itheima.service;

import com.itheima.domain.Items;

import java.util.List;


public interface ItemsService {
    /**
     * 根据ID查询items
     * @param id
     * @return
     */
    public Items findById(Integer id);

    /**
     * 查询所有items
     * @return
     */
    public List<Items> findAll();

    /**
     * 根据ID删除items
     * @param id
     */
    public void deleteItemById(Integer id);

    /**
     * 添加产品
     * @param items
     */
      public void addItem(Items items);
}
