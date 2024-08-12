package com.tangzw.shortlink.project.dto.resp;

import lombok.Data;

/**
 * 短链接分组查询响应DTO
 */
@Data
public class ShortLinkGroupCountQueryRespDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 短链接数量
     */
    private Integer shortLinkCount;
}
