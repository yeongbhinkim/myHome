package com.newYB.myHome.myHome.myHomePrice.controller

import com.newYB.myHome.myHome.myHomePrice.service.MyHomePriceService
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpSession
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/myHomePrice")
class MyHomePriceController{

    @Autowired
    private lateinit var MyHomePriceService: MyHomePriceService

    @GetMapping("/myHomePriceView")
    fun myHomePriceView(request: HttpServletRequest, model: ModelMap, session: HttpSession): String {
        return MyHomePriceService.myHomePriceView(request, model, session)
    }

    @RequestMapping("/myHomePriceList")
    @ResponseBody
    fun <JSONObject> myHomePriceList(@RequestBody param: JSONObject): List<JSONObject> {
        return MyHomePriceService.myHomePriceList(param)
    }

}

