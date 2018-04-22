package com.stadio.controllers.ws;

import com.stadio.controllers.BaseController;
import com.stadio.model.ResponseObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/task")
public class RestTaskController extends BaseController {

    /**
     * Danh sach nhiem vu theo tung customer
     * @return
     */
    @GetMapping(value = "/me")
    public ResponseObject me() {
        return ResponseObject.success(null);
    }

    /**
     * Lay danh sach nhiem vu da hoan thanh
     * @return
     */
    @GetMapping(value = "/history")
    public ResponseObject history() {
        return ResponseObject.success(null);
    }

}
