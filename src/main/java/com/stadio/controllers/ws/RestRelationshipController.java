package com.stadio.controllers.ws;

import com.stadio.controllers.BaseController;
import com.stadio.model.ResponseObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/relationship")
public class RestRelationshipController extends BaseController {

    /**
     * Lay danh sach moi ban be
     * @return
     */
    @GetMapping(value = "/invite/list")
    public ResponseObject inviteList() {
        return ResponseObject.success(null);
    }

    /**
     * Gui yeu ket ban
     * @return
     */
    @GetMapping(value = "/request")
    public ResponseObject request() {
        return ResponseObject.success(null);
    }

    /**
     * Huy yeu cau ket ban
     * @return
     */
    @GetMapping(value = "/request/cancel")
    public ResponseObject requestCancel() {
        return ResponseObject.success(null);
    }

    /**
     * Danh sach ban be
     * @return
     */
    @GetMapping(value = "/friend/list")
    public ResponseObject friendList() {
        return ResponseObject.success(null);
    }

    /**
     * Xoa ban be
     * @return
     */
    @GetMapping(value = "/friend/remove")
    public ResponseObject friendRemove() {
        return ResponseObject.success(null);
    }

}
