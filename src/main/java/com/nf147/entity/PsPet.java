package com.nf147.entity;

public class PsPet {
    private Integer id;

    private Integer categoryId;

    private PsCategory psCategory;

    private String name;

    private String photoUrls;

    private Integer tagsId;

    private PsTag psTag;

    private String status;

    public PsCategory getPsCategory() {
        return psCategory;
    }

    public void setPsCategory(PsCategory psCategory) {
        this.psCategory = psCategory;
    }

    public PsTag getPsTag() {
        return psTag;
    }

    public void setPsTag(PsTag psTag) {
        this.psTag = psTag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(String photoUrls) {
        this.photoUrls = photoUrls == null ? null : photoUrls.trim();
    }

    public Integer getTagsId() {
        return tagsId;
    }

    public void setTagsId(Integer tagsId) {
        this.tagsId = tagsId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}