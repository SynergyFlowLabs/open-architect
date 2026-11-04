package com.planner5d.library.project.fragment.roomtype;

import com.planner5d.library.model.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a0 f223837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f223838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f223839c;

    public j(@NotNull a0 title, @Nullable Integer num, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f223837a = title;
        this.f223838b = num;
        this.f223839c = action;
    }

    @NotNull
    public final Function0<Unit> a() {
        return this.f223839c;
    }

    @Nullable
    public final Integer b() {
        return this.f223838b;
    }

    @NotNull
    public final a0 c() {
        return this.f223837a;
    }
}
