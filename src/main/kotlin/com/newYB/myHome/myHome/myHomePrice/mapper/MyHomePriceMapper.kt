package com.newYB.myHome.myHome.myHomePrice.mapper

import org.apache.ibatis.annotations.Mapper

@Mapper
interface MyHomePriceMapper {
    fun <JSONObject> selectMyHomePriceList(param: JSONObject): List<JSONObject> {
        return listOf(param)
    }
}