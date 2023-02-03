package com.jihye.MarimoOrder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageController {

    // 메인 페이지
    @GetMapping("/")
    public String getMainPage(){ return "main";}

    // 굿즈 리스트 페이지
    @GetMapping("/goods")
    public String getGoodsPage(){
        return "goodsList";
    }

    // 굿즈 상세 페이지 and 굿즈를 찾을 수 없습니다 페이지
    @GetMapping("/goods/{goodsNumber}")
    public String getDetailGoodsPage(@PathVariable("goodsNumber") String goodsNumber){

        /***
         * 굿즈가 없어서 굿즈를 찾을 수 없다는 페이지 출력
         */
        if(goodsNumber.equals("none")) return "goodsNotFound";

        return "goodsDetail";
    }

    // 장바구니 페이지
    @GetMapping("/cart")
    public String getCartPage(){
        return "cart";
    }

    // 주문 요청 페이지
    @GetMapping("/order")
    public String getOrderPage(){
        return "orderRequest";
    }

    // 주문 목록 페이지
    @GetMapping("/order/list")
    public String getOrderListPage(){
        return "orderList";
    }

    // 주문 상세 페이지
    @GetMapping("/order/list/{orderNumber}")
    public String getDetailOrderPage(@PathVariable("orderNumber") String orderNumber){

        /***
         * 주문번호에 해당하는 주문이 없다는 페이지 출력
         */
        return "orderDetail";
    }
}
