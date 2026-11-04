package com.planner5d.library.database.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Table(name = "auto_style_image")
public final class AutoStyleImage extends Model {

    @Column(name = "auto_style", onDelete = Column.ForeignKeyAction.CASCADE, onUpdate = Column.ForeignKeyAction.CASCADE)
    @Nullable
    private AutoStyle autoStyle;

    @Column(name = "room_style_id")
    @Nullable
    private Long roomStyleId;

    @Column(name = "image_uri")
    @Nullable
    private String uri;

    @Nullable
    public final AutoStyle s() {
        return this.autoStyle;
    }

    @Nullable
    public final Long u() {
        return this.roomStyleId;
    }

    @Nullable
    public final String v() {
        return this.uri;
    }

    public final void w(@Nullable AutoStyle autoStyle) {
        this.autoStyle = autoStyle;
    }

    public final void x(@Nullable Long l10) {
        this.roomStyleId = l10;
    }

    public final void y(@Nullable String str) {
        this.uri = str;
    }
}
