package com.ksc.cdn.model.statistic.dir.flow;

import com.ksc.cdn.model.statistic.CommonFieldResult;

import lombok.Data;

/**
 * 获取某段时间内按一级目录为维度下消耗的流量，单位byte
 *
 * @author zr
 * @date 2017/03/7
 */
@Data
public class FlowDataByDirResult extends CommonFieldResult {

    /**
     * 输入需要查询的域名ID，只允许输入一个
     */
    private String DomainId;
    
    /**
     * 目录名称，无一级目录以“\/”表示
     */
    private String Dir;
    
    /**
     * 区域，逗号（半角）间隔
     */
    private String Regions;
    
    /**
     * 非必须
     * 统计粒度,单位分钟,缺省为5
     * 粒度均取该粒度时间段的峰值
     */
    private String Granularity;
    /**
     * 每个时间粒度的独立请求的IP数据
     * 
     */
    
    /**
     * 0:多域名多计费区域数据做合并
     * 1：每个域名每个计费区域的数据分别返回
     */
    private String ResultType;
    
    /**
     * 每个时间粒度的流量数据
     */
    private FlowDataByTime[] Datas;
}
