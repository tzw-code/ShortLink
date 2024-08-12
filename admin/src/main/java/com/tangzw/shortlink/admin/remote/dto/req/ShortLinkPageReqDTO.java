package com.tangzw.shortlink.admin.remote.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

/**
 * 短链接分页查询请求DTO
 */
@Data
public class ShortLinkPageReqDTO extends Page {
    /**
     * 分组标识
     */
    private String gid;

    /**
     * 排序标识
     */
    private String orderTag;
}
