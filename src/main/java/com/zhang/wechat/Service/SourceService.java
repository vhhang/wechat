package com.zhang.wechat.Service;

import com.zhang.wechat.Entity.Source;

import java.util.List;

public interface SourceService {

    List<Source> findSource();

    void add(Source source);

    boolean addSource(String textarea);
}
