package com.planner5d.library.model.item.catalog;

import com.planner5d.library.model.manager.builtin.f1;

/* JADX INFO: loaded from: classes7.dex */
public class CatalogItem implements f1 {
    public final long categoryId;
    public final byte[] dataItem;
    private final boolean editableMaterials;
    private final boolean editablePosition;
    private final boolean editableRotation;
    private final boolean editableSize;
    private boolean free;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f180761id;
    public final CatalogItemMetadata metadata;
    private final boolean visible;

    public CatalogItem(String str, boolean z10, long j10, byte[] bArr, CatalogItemMetadata catalogItemMetadata, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f180761id = str;
        this.free = z10;
        this.categoryId = j10;
        this.dataItem = bArr;
        this.metadata = catalogItemMetadata;
        this.visible = z11;
        this.editableMaterials = z12;
        this.editablePosition = z13;
        this.editableRotation = z14;
        this.editableSize = z15;
    }

    public boolean isEditableMaterials() {
        return this.editableMaterials;
    }

    public boolean isEditablePosition() {
        return this.editablePosition;
    }

    public boolean isEditableRotation() {
        return this.editableRotation;
    }

    public boolean isEditableSize() {
        return this.editableSize;
    }

    @Override // com.planner5d.library.model.manager.builtin.f1
    public boolean isFree() {
        return this.free;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setFree(boolean z10) {
        this.free = z10;
    }
}
