package com.planner5d.library.database.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Table(name = "room_style")
public final class RoomStyle extends Model {

    @Column(name = "created")
    @NotNull
    private Date created = new Date();

    @Column(name = "image_uri")
    @Nullable
    private String imageUri;

    @Column(name = "name")
    @Nullable
    private String name;

    @Column(name = "remote_id", onUniqueConflict = Column.ConflictAction.REPLACE, unique = true)
    private long remoteId;

    @Column(name = "title_ar")
    @Nullable
    private String titleAr;

    @Column(name = "title_de")
    @Nullable
    private String titleDe;

    @Column(name = "title_en")
    @Nullable
    private String titleEn;

    @Column(name = "title_es")
    @Nullable
    private String titleEs;

    @Column(name = "title_fr")
    @Nullable
    private String titleFr;

    @Column(name = "title_it")
    @Nullable
    private String titleIt;

    @Column(name = "title_jp")
    @Nullable
    private String titleJp;

    @Column(name = "title_pt")
    @Nullable
    private String titlePt;

    @Column(name = "title_ru")
    @Nullable
    private String titleRu;

    @Column(name = "title_zh_hans")
    @Nullable
    private String titleZhHans;

    @Column(name = "title_zh_hant")
    @Nullable
    private String titleZhHant;

    @Column(name = "used_in_ai_design_generator")
    private boolean usedInAiDesignGenerator;

    @Column(name = "used_in_ai_smart_wizard")
    private boolean usedInAiSmartWizard;

    @Nullable
    public final String A() {
        return this.titleEs;
    }

    @Nullable
    public final String B() {
        return this.titleFr;
    }

    @Nullable
    public final String C() {
        return this.titleIt;
    }

    @Nullable
    public final String D() {
        return this.titleJp;
    }

    @Nullable
    public final String E() {
        return this.titlePt;
    }

    @Nullable
    public final String F() {
        return this.titleRu;
    }

    @Nullable
    public final String G() {
        return this.titleZhHans;
    }

    @Nullable
    public final String H() {
        return this.titleZhHant;
    }

    public final boolean I() {
        return this.usedInAiDesignGenerator;
    }

    public final boolean J() {
        return this.usedInAiSmartWizard;
    }

    public final void K(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.created = date;
    }

    public final void L(@Nullable String str) {
        this.imageUri = str;
    }

    public final void M(@Nullable String str) {
        this.name = str;
    }

    public final void N(long j10) {
        this.remoteId = j10;
    }

    public final void O(@Nullable String str) {
        this.titleAr = str;
    }

    public final void P(@Nullable String str) {
        this.titleDe = str;
    }

    public final void Q(@Nullable String str) {
        this.titleEn = str;
    }

    public final void R(@Nullable String str) {
        this.titleEs = str;
    }

    public final void S(@Nullable String str) {
        this.titleFr = str;
    }

    public final void T(@Nullable String str) {
        this.titleIt = str;
    }

    public final void U(@Nullable String str) {
        this.titleJp = str;
    }

    public final void V(@Nullable String str) {
        this.titlePt = str;
    }

    public final void W(@Nullable String str) {
        this.titleRu = str;
    }

    public final void X(@Nullable String str) {
        this.titleZhHans = str;
    }

    public final void Y(@Nullable String str) {
        this.titleZhHant = str;
    }

    public final void Z(boolean z10) {
        this.usedInAiDesignGenerator = z10;
    }

    public final void a0(boolean z10) {
        this.usedInAiSmartWizard = z10;
    }

    @NotNull
    public final Date s() {
        return this.created;
    }

    @Nullable
    public final String u() {
        return this.imageUri;
    }

    @Nullable
    public final String v() {
        return this.name;
    }

    public final long w() {
        return this.remoteId;
    }

    @Nullable
    public final String x() {
        return this.titleAr;
    }

    @Nullable
    public final String y() {
        return this.titleDe;
    }

    @Nullable
    public final String z() {
        return this.titleEn;
    }
}
