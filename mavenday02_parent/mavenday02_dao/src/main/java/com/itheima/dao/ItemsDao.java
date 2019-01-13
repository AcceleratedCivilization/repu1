package com.itheima.dao;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsDao {
    /**
     * 根据ID查询信息
     * @param id
     * @return
     */
    @Select("select * from items where id = #{id}")
    public Items findById(Integer id);

    /**
     * 查询所有
     * @return
     */
    @Select("select * from items")
    public List<Items> findAll();

    /**
     * 删除ITEMS
     * @param id
     */
    @Delete("delete from items where id=#{id}")
    public void deleteItemById(Integer id);

    /**
     * 添加产品
     * @param items
     */
    @Insert("insert into items(name,price,pic,createtime,detail) values(#{name},#{price},#{pic},#{createtime},#{detail})")
    public void addItem(Items items);
}
