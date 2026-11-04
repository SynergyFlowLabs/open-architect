package com.planner5d.library.activity.fragment.dialog.projectsettings;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public enum x0 {
    small(com.planner5d.library.model.p.b.small),
    normal(com.planner5d.library.model.p.b.normal),
    big(com.planner5d.library.model.p.b.big);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f132462f = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.p.b f132463a;

    x0(com.planner5d.library.model.p.b bVar) {
        this.f132463a = bVar;
    }

    @NotNull
    public static kotlin.enums.a<x0> l() {
        return f132462f;
    }

    @NotNull
    public final com.planner5d.library.model.p.b n() {
        return this.f132463a;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return String.valueOf(this.f132463a.f222457a);
    }
}
