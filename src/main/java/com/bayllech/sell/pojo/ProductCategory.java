package com.bayllech.sell.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * product_category
 * @author 
 */
@Data
@NoArgsConstructor
public class ProductCategory implements Serializable {
    /**
     * 类目id
     */
    private Integer category_id;

    /**
     * 名称
     */
    private String category_name;

    /**
     * 编号
     */
    private Integer category_type;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 更新时间
     */
    private Date update_time;

    private static final long serialVersionUID = 1L;

}