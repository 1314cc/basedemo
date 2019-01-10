package com.black.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`t_style`")
public class Style {
    /**
     * 风格id
     */
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     *  风格名称
     */
    @Column(name = "`style_name`")
    private String styleName;

    /**
     * 风格描述
     */
    @Column(name = "`style_desc`")
    private String styleDesc;

    /**
     * 风格图标url
     */
    @Column(name = "`style_icon`")
    private String styleIcon;

    /**
     * 权重
     */
    @Column(name = "`weight`")
    private Integer weight;

    /**
     * 创建人
     */
    @Column(name = "`create_by`")
    private String createBy;

    /**
     * 更新人
     */
    @Column(name = "`update_by`")
    private String updateBy;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;

    /**
     * 是否删除 1删除, 0 未删除
     */
    @Column(name = "`is_delete`")
    private Byte isDelete;

    /**
     * 获取风格id
     *
     * @return id - 风格id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置风格id
     *
     * @param id 风格id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 风格名称
     *
     * @return style_name -  风格名称
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * 设置 风格名称
     *
     * @param styleName  风格名称
     */
    public void setStyleName(String styleName) {
        this.styleName = styleName == null ? null : styleName.trim();
    }

    /**
     * 获取风格描述
     *
     * @return style_desc - 风格描述
     */
    public String getStyleDesc() {
        return styleDesc;
    }

    /**
     * 设置风格描述
     *
     * @param styleDesc 风格描述
     */
    public void setStyleDesc(String styleDesc) {
        this.styleDesc = styleDesc == null ? null : styleDesc.trim();
    }

    /**
     * 获取风格图标url
     *
     * @return style_icon - 风格图标url
     */
    public String getStyleIcon() {
        return styleIcon;
    }

    /**
     * 设置风格图标url
     *
     * @param styleIcon 风格图标url
     */
    public void setStyleIcon(String styleIcon) {
        this.styleIcon = styleIcon == null ? null : styleIcon.trim();
    }

    /**
     * 获取权重
     *
     * @return weight - 权重
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置权重
     *
     * @param weight 权重
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 获取更新人
     *
     * @return update_by - 更新人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新人
     *
     * @param updateBy 更新人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否删除 1删除, 0 未删除
     *
     * @return is_delete - 是否删除 1删除, 0 未删除
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除 1删除, 0 未删除
     *
     * @param isDelete 是否删除 1删除, 0 未删除
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}