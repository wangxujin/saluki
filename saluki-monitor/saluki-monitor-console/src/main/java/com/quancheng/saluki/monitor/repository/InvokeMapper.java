package com.quancheng.saluki.monitor.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.quancheng.saluki.boot.domain.GrpcInvoke;
import com.quancheng.saluki.boot.domain.GrpcnvokeStatistics;

@Mapper
public interface InvokeMapper {

    void addInvoke(List<GrpcInvoke> invokes);

    List<GrpcnvokeStatistics> queryData(Map<String, String> paramter);

    List<Map<String, String>> queryConsumer();

    Map<String, String> queryProvider(Map<String, String> paramter);

}