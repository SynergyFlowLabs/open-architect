package com.planner5d.library.database.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Table(name = "auto_style")
public final class AutoStyle extends Model {

    @Column(name = "created")
    @Nullable
    private Date created;

    @Column(name = "cropped_image")
    @Nullable
    private String croppedImageUri;

    @Column(name = "progress")
    @Nullable
    private Float progress;

    @Column(name = "renders_count")
    private int rendersCount;

    @Column(name = "room_style_ids")
    @Nullable
    private String roomStyleIds;

    @Column(name = "room_type")
    @Nullable
    private Integer roomTypeId;

    @Column(name = "selected_image")
    @Nullable
    private String selectedImageUri;

    @Column(name = "status")
    private int status = a.New.n();

    @Column(name = "visited")
    private boolean visited;

    @Nullable
    public final String A() {
        return this.selectedImageUri;
    }

    public final boolean B() {
        return this.visited;
    }

    public final boolean C() {
        return this.status == a.Error.n();
    }

    @NotNull
    public final List<AutoStyleImage> D() {
        List<AutoStyleImage> many = getMany(AutoStyleImage.class, "auto_style");
        Intrinsics.checkNotNullExpressionValue(many, "getMany(...)");
        return many;
    }

    public final boolean E() {
        return !this.visited && s();
    }

    public final boolean F() {
        return this.status == a.New.n() && this.rendersCount > 0 && D().isEmpty();
    }

    public final void G(@Nullable Date date) {
        this.created = date;
    }

    public final void H(@Nullable String str) {
        this.croppedImageUri = str;
    }

    public final void I(@Nullable Float f10) {
        this.progress = f10;
    }

    public final void J(int i10) {
        this.rendersCount = i10;
    }

    public final void K(@Nullable String str) {
        this.roomStyleIds = str;
    }

    public final void L(@Nullable Integer num) {
        this.roomTypeId = num;
    }

    public final void M(@Nullable String str) {
        this.selectedImageUri = str;
    }

    public final void N(int i10) {
        this.status = i10;
    }

    public final void O(boolean z10) {
        this.visited = z10;
    }

    public final boolean s() {
        return D().size() == this.rendersCount;
    }

    public final int t() {
        return this.status;
    }

    @Nullable
    public final Date u() {
        return this.created;
    }

    @Nullable
    public final String v() {
        return this.croppedImageUri;
    }

    @Nullable
    public final Float w() {
        return this.progress;
    }

    public final int x() {
        return this.rendersCount;
    }

    @Nullable
    public final String y() {
        return this.roomStyleIds;
    }

    @Nullable
    public final Integer z() {
        return this.roomTypeId;
    }
}
