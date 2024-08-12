package com.tangzw.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 回收站移除请求DTO
 */
@Data
public class RecycleBinRemoveReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 完整短链接
     */
    private String fullShortUrl;
}
