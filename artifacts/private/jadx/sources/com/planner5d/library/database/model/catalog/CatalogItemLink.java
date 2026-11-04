package com.planner5d.library.database.model.catalog;

import androidx.annotation.m1;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Table(name = "catalog_item")
public final class CatalogItemLink extends Model {

    @Column(name = "catalog_id")
    @Nullable
    private Long catalogId;

    @Column(name = "category_id")
    @Nullable
    private Long categoryId;

    @Column(name = "free")
    private boolean free;

    @Column(name = FirebaseAnalytics.d.f120673q)
    @Nullable
    private String itemId;

    @m1
    public CatalogItemLink() {
    }

    public final void A(@Nullable String str) {
        this.itemId = str;
    }

    @Nullable
    public final Long s() {
        return this.catalogId;
    }

    @Nullable
    public final Long u() {
        return this.categoryId;
    }

    public final boolean v() {
        return this.free;
    }

    @Nullable
    public final String w() {
        return this.itemId;
    }

    public final void x(@Nullable Long l10) {
        this.catalogId = l10;
    }

    public final void y(@Nullable Long l10) {
        this.categoryId = l10;
    }

    public final void z(boolean z10) {
        this.free = z10;
    }
}
