package com.black.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`t_category`")
public class Category {
    /**
     * 分类id
     */
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 分类名称
     */
    @Column(name = "`category_name`")
    private String categoryName;

    /**
     * 分类描述
     */
    @Column(name = "`category_desc`")
    private String categoryDesc;

    /**
     * 分类图标url
     */
    @Column(name = "`category_icon`")
    private String categoryIcon;

    /**
     * 权重
     */
    @Column(name = "`weights`")
    private Integer weights;

    /**
     * 父类 id,默认为0,0为顶级id
     */
    @Column(name = "`super_id`")
    private Long superId;

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
     * 获取分类id
     *
     * @return id - 分类id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置分类id
     *
     * @param id 分类id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取分类名称
     *
     * @return category_name - 分类名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 设置分类名称
     *
     * @param categoryName 分类名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * 获取分类描述
     *
     * @return category_desc - 分类描述
     */
    public String getCategoryDesc() {
        return categoryDesc;
    }

    /**
     * 设置分类描述
     *
     * @param categoryDesc 分类描述
     */
    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc == null ? null : categoryDesc.trim();
    }

    /**
     * 获取分类图标url
     *
     * @return category_icon - 分类图标url
     */
    public String getCategoryIcon() {
        return categoryIcon;
    }

    /**
     * 设置分类图标url
     *
     * @param categoryIcon 分类图标url
     */
    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon == null ? null : categoryIcon.trim();
    }

    /**
     * 获取权重
     *
     * @return weights - 权重
     */
    public Integer getWeights() {
        return weights;
    }

    /**
     * 设置权重
     *
     * @param weights 权重
     */
    public void setWeights(Integer weights) {
        this.weights = weights;
    }

    /**
     * 获取父类 id,默认为0,0为顶级id
     *
     * @return super_id - 父类 id,默认为0,0为顶级id
     */
    public Long getSuperId() {
        return superId;
    }

    /**
     * 设置父类 id,默认为0,0为顶级id
     *
     * @param superId 父类 id,默认为0,0为顶级id
     */
    public void setSuperId(Long superId) {
        this.superId = superId;
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