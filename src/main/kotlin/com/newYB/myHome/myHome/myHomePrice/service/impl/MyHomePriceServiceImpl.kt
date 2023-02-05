package com.newYB.myHome.myHome.myHomePrice.service.impl

import com.newYB.myHome.myHome.myHomePrice.mapper.MyHomePriceMapper
import com.newYB.myHome.myHome.myHomePrice.service.MyHomePriceService
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpSession
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.ui.ModelMap

@Service
class MyHomePriceServiceImpl() : MyHomePriceService {

    @Autowired
    private lateinit var myHomePriceMapper: MyHomePriceMapper

    override fun myHomePriceView(request: HttpServletRequest, model: ModelMap, session: HttpSession): String {
        return "/myHomePrice/myHomePriceView"
    }

    override fun <JSONObject> myHomePriceList(param: JSONObject): List<JSONObject> {
        println(param)

        return myHomePriceMapper.selectMyHomePriceList(param)
    }

}
