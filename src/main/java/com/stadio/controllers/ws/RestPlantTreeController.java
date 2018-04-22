package com.stadio.controllers.ws;

import com.stadio.controllers.BaseController;
import com.stadio.model.ResponseObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/plant")
public class RestPlantTreeController extends BaseController {


    /**
     * Khach hang chon va kich hoat cay trong.
     * @param treeId
     * @return
     */
    @GetMapping(value = "/active")
    public ResponseObject activeTree(@RequestParam(value = "treeId") String treeId) {
        return ResponseObject.success(null);
    }

    /**
     * Lay trang thai hien tai cua cay
     * @param treeId
     * @return
     */
    @PostMapping(value = "/status")
    public ResponseObject treeStatus(@RequestParam(value = "treeId") String treeId) {
       return ResponseObject.success(null);
    }

    /**
     * Lay cac cap do phat trien cua mot cay
     * @param treeId
     * @return
     */
    @PostMapping(value = "/level")
    public ResponseObject levelAll(@RequestParam(value = "treeId") String treeId) {
        return ResponseObject.success(null);
    }

    /**
     * Hoat dong hai qua, tra ve list danh sach cac qua tang cho customer (gift)
     * @param treeId
     * @return
     */
    @GetMapping(value = "/pick")
    public ResponseObject pickTree(@RequestParam(value = "treeId") String treeId) {
        return ResponseObject.success(null);
    }

}
