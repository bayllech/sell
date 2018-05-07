package com.bayllech.sell.repository;

import com.bayllech.sell.pojo.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {

    @Autowired
    ProductCategoryMapper productCategoryMapper;

    @Test
    public void insert() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("最受欢迎");
        productCategory.setCategoryType(1);
        Integer result = productCategoryMapper.insert(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void selectByPrimaryKey() {
        ProductCategory productCategory = productCategoryMapper.selectByPrimaryKey(1);
        Assert.assertNotNull(productCategory);
    }

    @Test
    public void deleteByPrimaryKey() {
        Integer result = productCategoryMapper.deleteByPrimaryKey(3);
        Assert.assertEquals((long)result, 1L);
    }

    @Test
    public void update() {
        ProductCategory productCategory = productCategoryMapper.selectByPrimaryKey(4);
//        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(4);
        productCategory.setCategoryName("最受欢迎的");
        long result = productCategoryMapper.updateByPrimaryKeySelective(productCategory);
        Assert.assertEquals(result,1);
    }
}