package com.fit.fitsys.controller;

import com.fit.fitsys.dto.PageResponse;
import com.fit.fitsys.entity.TbCheck;
import com.fit.fitsys.entity.TbUser;
import com.fit.fitsys.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("check")
public class CheckController {
    @Autowired
    private CheckService checkService;

    /**
     * 新增考勤记录
     * @param check
     * @return
     */
    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> add(TbCheck check){
        Map<String, Object> result = new HashMap<>();

        int count = checkService.add(check);
        if (count == 1){
            result.put("success",true);
            return result;
        }else {
            result.put("errorMsg","新增失败");
            return result;
        }
    }

    /**
     * 删除考勤记录
     * @param ids
     * @return
     */
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> delete(String[] ids){
        Map<String, Object> result = new HashMap<>();
        int delete = checkService.delete(ids);
        if (delete > 0){
            result.put("success",true);
            return result;
        }else {
            result.put("errorMsg","删除失败");
            return result;
        }
    }

    /**
     * 更新考勤记录
     * @param check
     * @return
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> update(TbCheck check){
        Map<String, Object> result = new HashMap<>();
        int update = checkService.update(check);
        if (update > 0){
            result.put("success",true);
            return result;
        }else {
            result.put("errorMsg","修改失败");
            return result;
        }
    }

    /**
     * 分页查询考勤记录
     * @param check
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "findPage",method = RequestMethod.GET)
    @ResponseBody
    public PageResponse findPage(TbCheck check, @RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize")Integer pageSize){
        return checkService.findPage(check, pageNum, pageSize);
    }
}
