package com.planner5d.library.database.model;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum f {
    GALLERY_PROJECTS(1),
    GALLERY_SNAPSHOTS(2);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f154172e = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f154173a;

    f(int i10) {
        this.f154173a = i10;
    }

    @NotNull
    public static kotlin.enums.a<f> n() {
        return f154172e;
    }

    public final int l() {
        return this.f154173a;
    }
}
