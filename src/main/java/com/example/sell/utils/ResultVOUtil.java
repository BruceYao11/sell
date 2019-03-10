package com.example.sell.utils;

import com.example.sell.VO.ResultVO;

/**
 * @program: sell
 * @description:ResultVOUtil
 * @author: Bruce
 * @create: 2019-03-07 15:48
 **/
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success(){

        return success(null);
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}