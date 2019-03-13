package com.fit.fitsys.service;

import com.fit.fitsys.dto.PageResponse;
import com.fit.fitsys.entity.TbCheck;

import java.util.List;

/**
 * 考勤Service接口
 */
public interface CheckService {

    int add(TbCheck check);

    int delete(String[] ids);

    int update(TbCheck check);

    PageResponse findPage(TbCheck check, int pageNum, int pageSize);
}
