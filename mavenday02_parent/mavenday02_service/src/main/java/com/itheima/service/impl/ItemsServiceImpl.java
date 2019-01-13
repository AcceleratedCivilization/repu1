package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    /**
     * 根据ID查询items
     * @param id
     * @return
     */
    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }

    /**
     * 查询所有items
     * @return
     */
    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    /**
     * 根据ID删除items
     * @param id
     */
    @Override
    public void deleteItemById(Integer id) {
        itemsDao.deleteItemById(id);
    }

    @Override
    public void addItem(Items items) {
        itemsDao.addItem(items);
    }

}
