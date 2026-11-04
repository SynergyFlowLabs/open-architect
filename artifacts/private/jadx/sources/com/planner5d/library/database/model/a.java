package com.planner5d.library.database.model;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum a {
    New(0),
    InProgress(1),
    Ready(2),
    Error(4);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f154102g = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f154103a;

    static {
        int i10 = 0 & 3;
    }

    a(int i10) {
        this.f154103a = i10;
    }

    @NotNull
    public static kotlin.enums.a<a> l() {
        return f154102g;
    }

    public final int n() {
        return this.f154103a;
    }
}
