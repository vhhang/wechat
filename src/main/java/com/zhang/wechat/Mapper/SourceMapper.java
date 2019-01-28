package com.zhang.wechat.Mapper;

import com.zhang.wechat.Entity.Source;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SourceMapper {

    /**
     * 通过收到的消息内容查询出资源
     * @param reqContent
     * @return
     */
    Source querySourceByReqContent(String reqContent);

    List<Source> findAllSource();

    void add(Source source);

    boolean addSource(List<Source> sources);
}
