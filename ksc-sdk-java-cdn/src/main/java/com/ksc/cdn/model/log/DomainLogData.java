package com.ksc.cdn.model.log;

import lombok.Data;

/**
 * DomainLogData
 *
 * @author qichao@kingsoft.com
 * @date 2017/02/27
 */
@Data
public class DomainLogData {

    /**
     * 日志开始时间
     */
    private String StartTime;

    /**
     * 日志结束时间
     */
    private String EndTime;

    /**
     * 日志名称
     */
    private String LogName;

    /**
     * 日志下载地址，30分钟后过期
     */
    private String LogUrl;

    /**
     * 日志大小，单位Byte
     */
    private String LogSize;
}
