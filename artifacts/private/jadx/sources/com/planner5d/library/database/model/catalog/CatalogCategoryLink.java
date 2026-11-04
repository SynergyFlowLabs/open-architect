package com.planner5d.library.database.model.catalog;

import androidx.annotation.m1;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Table(name = "catalog_category")
public final class CatalogCategoryLink extends Model {

    @Column(name = "catalog_id")
    @Nullable
    private Long catalogId;

    @Column(name = "category_id")
    @Nullable
    private Long categoryId;

    @Column(name = "parent_category_id")
    @Nullable
    private Long parentCategoryId;

    @m1
    public CatalogCategoryLink() {
    }

    @Nullable
    public final Long s() {
        return this.catalogId;
    }

    @Nullable
    public final Long u() {
        return this.categoryId;
    }

    @Nullable
    public final Long v() {
        return this.parentCategoryId;
    }

    public final void w(@Nullable Long l10) {
        this.catalogId = l10;
    }

    public final void x(@Nullable Long l10) {
        this.categoryId = l10;
    }

    public final void y(@Nullable Long l10) {
        this.parentCategoryId = l10;
    }
}
