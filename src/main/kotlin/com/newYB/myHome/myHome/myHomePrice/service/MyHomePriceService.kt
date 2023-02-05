package com.newYB.myHome.myHome.myHomePrice.service

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpSession
import org.springframework.ui.ModelMap

interface MyHomePriceService {

    fun myHomePriceView(request: HttpServletRequest, model: ModelMap, session: HttpSession): String

    fun <JSONObject> myHomePriceList(param: JSONObject): List<JSONObject>
}