package com.tangzw.shortlink.admin.remote.dto.req;

import lombok.Data;

/**
 * 分组短链接监控请求DTO
 */
@Data
public class ShortLinkGroupStatsReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 开始日期
     */
    private String startDate;

    /**
     * 结束日期
     */
    private String endDate;
}
