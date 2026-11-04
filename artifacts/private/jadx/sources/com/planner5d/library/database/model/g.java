package com.planner5d.library.database.model;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum g {
    TYPE_UNKNOWN(0),
    TYPE_PROJECTS(1),
    TYPE_SNAPSHOTS(2),
    TYPE_DOCUMENTS(3),
    TYPE_DYNAMIC_FOLDERS_ALL(-1),
    TYPE_DYNAMIC_PROJECTS_ALL(-10),
    TYPE_DYNAMIC_PROJECTS_TODAY(-11),
    TYPE_DYNAMIC_SNAPSHOTS_ALL(-20),
    TYPE_DYNAMIC_SNAPSHOTS_TODAY(-21);


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f154184l = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f154185a;

    static {
        int i10 = 4 ^ 1;
        int i11 = 4 | 7;
    }

    g(int i10) {
        this.f154185a = i10;
    }

    @NotNull
    public static kotlin.enums.a<g> l() {
        return f154184l;
    }

    public final int n() {
        return this.f154185a;
    }
}
