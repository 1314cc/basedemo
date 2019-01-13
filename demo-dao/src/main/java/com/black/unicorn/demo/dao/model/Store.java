package com.black.unicorn.demo.dao.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`t_test_store`")
public class Store {
    /**
     * 店铺id,自增 
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     *  店铺名称
     */
    @Column(name = "`store_name`")
    private String storeName;

    /**
     * 店铺描述
     */
    @Column(name = "`store_desc`")
    private String storeDesc;

    /**
     * 首字母
     */
    @Column(name = "`store_first_letter`")
    private String storeFirstLetter;

    /**
     * 商场id
     */
    @Column(name = "`mall_id`")
    private String mallId;

    /**
     * 楼层
     */
    @Column(name = "`floor_no`")
    private String floorNo;

    /**
     * 地图区域id
     */
    @Column(name = "`map_area_id`")
    private String mapAreaId;

    /**
     * 店铺系统关联ID
     */
    @Column(name = "`shop_id`")
    private String shopId;

    /**
     * 分类风格展示
     */
    @Column(name = "`category_display`")
    private String categoryDisplay;

    /**
     * 权重,默认为0
     */
    @Column(name = "`weights`")
    private Integer weights;

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
     * 获取店铺id,自增 
     *
     * @return id - 店铺id,自增 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置店铺id,自增 
     *
     * @param id 店铺id,自增 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 店铺名称
     *
     * @return store_name -  店铺名称
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 设置 店铺名称
     *
     * @param storeName  店铺名称
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * 获取店铺描述
     *
     * @return store_desc - 店铺描述
     */
    public String getStoreDesc() {
        return storeDesc;
    }

    /**
     * 设置店铺描述
     *
     * @param storeDesc 店铺描述
     */
    public void setStoreDesc(String storeDesc) {
        this.storeDesc = storeDesc == null ? null : storeDesc.trim();
    }

    /**
     * 获取首字母
     *
     * @return store_first_letter - 首字母
     */
    public String getStoreFirstLetter() {
        return storeFirstLetter;
    }

    /**
     * 设置首字母
     *
     * @param storeFirstLetter 首字母
     */
    public void setStoreFirstLetter(String storeFirstLetter) {
        this.storeFirstLetter = storeFirstLetter == null ? null : storeFirstLetter.trim();
    }

    /**
     * 获取商场id
     *
     * @return mall_id - 商场id
     */
    public String getMallId() {
        return mallId;
    }

    /**
     * 设置商场id
     *
     * @param mallId 商场id
     */
    public void setMallId(String mallId) {
        this.mallId = mallId == null ? null : mallId.trim();
    }

    /**
     * 获取楼层
     *
     * @return floor_no - 楼层
     */
    public String getFloorNo() {
        return floorNo;
    }

    /**
     * 设置楼层
     *
     * @param floorNo 楼层
     */
    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo == null ? null : floorNo.trim();
    }

    /**
     * 获取地图区域id
     *
     * @return map_area_id - 地图区域id
     */
    public String getMapAreaId() {
        return mapAreaId;
    }

    /**
     * 设置地图区域id
     *
     * @param mapAreaId 地图区域id
     */
    public void setMapAreaId(String mapAreaId) {
        this.mapAreaId = mapAreaId == null ? null : mapAreaId.trim();
    }

    /**
     * 获取店铺系统关联ID
     *
     * @return shop_id - 店铺系统关联ID
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * 设置店铺系统关联ID
     *
     * @param shopId 店铺系统关联ID
     */
    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    /**
     * 获取分类风格展示
     *
     * @return category_display - 分类风格展示
     */
    public String getCategoryDisplay() {
        return categoryDisplay;
    }

    /**
     * 设置分类风格展示
     *
     * @param categoryDisplay 分类风格展示
     */
    public void setCategoryDisplay(String categoryDisplay) {
        this.categoryDisplay = categoryDisplay == null ? null : categoryDisplay.trim();
    }

    /**
     * 获取权重,默认为0
     *
     * @return weights - 权重,默认为0
     */
    public Integer getWeights() {
        return weights;
    }

    /**
     * 设置权重,默认为0
     *
     * @param weights 权重,默认为0
     */
    public void setWeights(Integer weights) {
        this.weights = weights;
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