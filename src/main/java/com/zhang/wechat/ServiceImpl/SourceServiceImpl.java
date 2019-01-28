package com.zhang.wechat.ServiceImpl;

import com.github.pagehelper.PageHelper;
import com.zhang.wechat.Entity.Source;
import com.zhang.wechat.Mapper.SourceMapper;
import com.zhang.wechat.Service.SourceService;
import com.zhang.wechat.Utils.splitUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SourceServiceImpl implements SourceService {

    @Autowired
    private SourceMapper sourceMapper;

    @Override
    public List<Source> findSource() {
        List<Source> sourceList = sourceMapper.findAllSource();
        return sourceList;
    }

    @Override
    public void add(Source source) {
        sourceMapper.add(source);
    }

    @Override
    public boolean addSource(String textarea) {
        List<Source> sources = splitUtil.splitUtil(textarea);
        boolean b = sourceMapper.addSource(sources);
        return false;
    }


}
