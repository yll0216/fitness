package com.fit.fitsys.service.impl;

import com.fit.fitsys.dto.PageResponse;
import com.fit.fitsys.entity.TbCheck;
import com.fit.fitsys.mapper.TbCheckMapper;
import com.fit.fitsys.service.CheckService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class CheckServiceImpl implements CheckService {
    @Autowired
    private TbCheckMapper checkMapper;
    @Override
    public int add(TbCheck check) {
        return checkMapper.insert(check);
    }

    @Override
    public int delete(String[] ids) {
        StringBuffer sb = new StringBuffer();
        for (String id : ids) {
            sb.append(id);
        }
        return checkMapper.deleteByIds(sb.toString());
    }

    @Override
    public int update(TbCheck check) {
        return checkMapper.updateByPrimaryKeySelective(check);
    }

    @Override
    public PageResponse findPage(TbCheck check, int pageNum, int pageSize) {
        // 分页
        PageHelper.startPage(pageNum,pageSize);
        Example example = new Example(TbCheck.class);
        Example.Criteria criteria = example.createCriteria();
        if (check != null){
            if (check.getCoachId() != null){
                criteria.andLike("coach_id","%"+check.getCoachId()+"%");
            }
        }
        List<TbCheck> checkList = checkMapper.selectByExample(example);
        PageInfo<TbCheck> pageInfo = PageInfo.of(checkList);
        return new PageResponse(pageInfo.getList(),pageInfo.getTotal());
    }
}
