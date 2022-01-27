package com.shtf.edu.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Date;
import java.io.Serializable;
import lombok.Data;

/**
 * SysRoleManage class
 *
 * 角色分配管理表
 *
 * id,uuid,role_uuid,manage_role_uuid,del_flag,created_by,created_time,updated_by,updated_time,
 * @author luobo
 * @date 2021-04-29
 */
@Data
public class SysRoleManage implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * UUID UUID
     */
    private String uuid;

    /**
     * 角色UUID
     */
    private String roleUuid;

    /**
     * 可分配角色UUID
     */
    private String manageRoleUuid;

    /**
     * 删除标记 删除标记
     */
    private Integer delFlag;

    /**
     * 创建人 创建人
     */
    private String createdBy;

    /**
     * 创建时间 创建时间
     */
    private Date createdTime;

    /**
     * 更新人 更新人
     */
    private String updatedBy;

    /**
     * 更新时间 更新时间
     */
    private Date updatedTime;


}
