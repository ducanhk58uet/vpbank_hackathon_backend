package com.stadio.controllers.ws;

import com.stadio.controllers.BaseController;
import com.stadio.model.ResponseObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/group")
public class RestGroupController extends BaseController {

    /**
     * Dang ky tao group
     * @param name
     * @return
     */
    @PostMapping(value = "/create")
    public ResponseObject create(@RequestParam(value = "name") String name) {
        return ResponseObject.success(null);
    }

    /**
     * Danh sach cac group ma khach hang tham gia
     * @return
     */
    @GetMapping(value = "/list")
    public ResponseObject list() {
        return ResponseObject.success(null);
    }

    /**
     * Xoa group cua khach hang
     * @return
     */
    @DeleteMapping(value = "/remove")
    public ResponseObject remove(@RequestParam(value = "groupId") String groupId) {
        return ResponseObject.success(null);
    }

    /**
     * Thoat mot group da tham gia
     * @param groupId
     * @return
     */
    @PostMapping(value = "/cancel")
    public ResponseObject cancelGroup(@RequestParam(value = "groupId") String groupId) {
        return ResponseObject.success(null);
    }

    /**
     * Moi nguoi choi vao group
     * @param customerId
     * @return
     */
    @GetMapping(value = "/invite")
    public ResponseObject invite(@RequestParam(value = "customerId") String customerId,
                                 @RequestParam(value = "groupId") String groupId){
        return ResponseObject.success(null);
    }

    /**
     * Chap nhan loi moi vao group
     * @return
     */
    @GetMapping(value = "/invite/accept")
    public ResponseObject inviteAccept(@RequestParam(value = "inviteId") String inviteId) {
        return ResponseObject.success(null);
    }

    /**
     * Chap nhan loi moi vao group
     * @return
     */
    @GetMapping(value = "/invite/cancel")
    public ResponseObject inviteCancel(@RequestParam(value = "inviteId") String inviteId) {
        return ResponseObject.success(null);
    }

    /**
     * Danh sach thanh vien trong mot group
     * @param groupId
     * @return
     */
    @GetMapping(value = "/member/list")
    public ResponseObject memberList(@RequestParam(value = "groupId") String groupId) {
        return ResponseObject.success(null);
    }

    /**
     * Xoa ban be co trong group cua minh
     * @param groupId
     * @param memberId
     * @return
     */
    @DeleteMapping(value = "/member/remove")
    public ResponseObject memberRemove(@RequestParam(value = "groupId") String groupId,
                                       @RequestParam(value = "memberId") String memberId) {
        return ResponseObject.success(null);
    }

}
