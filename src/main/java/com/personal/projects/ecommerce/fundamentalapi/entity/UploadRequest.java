package com.personal.projects.ecommerce.fundamentalapi.entity;

import org.springframework.web.multipart.MultipartFile;

public class UploadRequest {
    
    private String Supplier;
    private Boolean SkipApproval;
    private Boolean ActivateAutomatically;
    private Boolean SendForApproval;
    private MultipartFile CatalogItem;
    private MultipartFile Images;
    public String getSupplier() {
        return Supplier;
    }
    public void setSupplier(String supplier) {
        Supplier = supplier;
    }
    public Boolean getSkipApproval() {
        return SkipApproval;
    }
    public void setSkipApproval(Boolean skipApproval) {
        SkipApproval = skipApproval;
    }
    public Boolean getActivateAutomatically() {
        return ActivateAutomatically;
    }
    public void setActivateAutomatically(Boolean activateAutomatically) {
        ActivateAutomatically = activateAutomatically;
    }
    public Boolean getSendForApproval() {
        return SendForApproval;
    }
    public void setSendForApproval(Boolean sendForApproval) {
        SendForApproval = sendForApproval;
    }
    public MultipartFile getCatalogItem() {
        return CatalogItem;
    }
    public void setCatalogItem(MultipartFile catalogItem) {
        CatalogItem = catalogItem;
    }
    public MultipartFile getImages() {
        return Images;
    }
    public void setImages(MultipartFile images) {
        Images = images;
    }

    

}
