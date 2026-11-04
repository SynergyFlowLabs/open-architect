package com.planner5d.library.database.model.catalog;

import androidx.annotation.m1;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Table(name = "catalog")
public final class Catalog extends Model {

    @Column(name = "aliases")
    @Nullable
    private String aliases;

    @Column(name = "articles")
    @Nullable
    private String articles;

    @Column(name = "name")
    @Nullable
    private String name;

    @m1
    public Catalog() {
    }

    @Nullable
    public final String s() {
        return this.aliases;
    }

    @Nullable
    public final String u() {
        return this.articles;
    }

    @Nullable
    public final String v() {
        return this.name;
    }

    public final void w(@Nullable String str) {
        this.aliases = str;
    }

    public final void x(@Nullable String str) {
        this.articles = str;
    }

    public final void y(@Nullable String str) {
        this.name = str;
    }
}
