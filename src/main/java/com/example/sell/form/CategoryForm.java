package com.example.sell.form;

import lombok.Data;

/**
 * @program: sell
 * @description: 类目表单提交
 * @author: Bruce
 * @create: 2019-04-03 11:47
 **/
@Data
public class CategoryForm {

    private Integer categoryId;

    /*类目名字*/
    private String categoryName;

    /*类目编号*/
    private Integer categoryType;
}