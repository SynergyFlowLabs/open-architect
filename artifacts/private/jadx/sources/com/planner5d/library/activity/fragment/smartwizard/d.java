package com.planner5d.library.activity.fragment.smartwizard;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public enum d {
    Idle(false, null, 2, null),
    Error(false, null, 2, null),
    Designing(true, Integer.valueOf(com.planner5d.library.f.s.f169221k6)),
    Furnishing(true, Integer.valueOf(com.planner5d.library.f.s.Wc)),
    Finalising(true, Integer.valueOf(com.planner5d.library.f.s.F1));


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f135395i = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f135396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f135397b;

    d(boolean z10, Integer num) {
        this.f135396a = z10;
        this.f135397b = num;
    }

    @NotNull
    public static kotlin.enums.a<d> l() {
        return f135395i;
    }

    public final boolean n() {
        return this.f135396a;
    }

    @Nullable
    public final Integer o() {
        return this.f135397b;
    }

    /* synthetic */ d(boolean z10, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? null : num);
    }
}
