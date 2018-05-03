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
        productCategory.setCategory_name("最受欢迎");
        productCategory.setCategory_type(1);
        Integer result = productCategoryMapper.insert(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void selectByPrimaryKey() {
    }
}