package com.stadio.controllers.ws;

import com.stadio.controllers.BaseController;
import com.stadio.model.ResponseObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "api/gift")
@RestController
public class RestGiftController extends BaseController {

    /**
     * Lay toan bo danh sach qua tang thuoc quyen so huu cua mot users, ruong cua mot users
     * @return
     */
    @GetMapping(value = "/me")
    public ResponseObject me() {
        return ResponseObject.success(null);
    }

    /**
     * Kich hoat qua tang
     * @return
     */
    @GetMapping(value = "/active")
    public ResponseObject active()  {
        return ResponseObject.success(null);
    }

    /**
     * Lay danh sach lich su su dung qua tang
     * @return
     */
    @GetMapping(value = "/history")
    public ResponseObject history() {
        return ResponseObject.success(null);
    }
}
