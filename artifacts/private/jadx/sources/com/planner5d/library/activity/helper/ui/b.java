package com.planner5d.library.activity.helper.ui;

import com.planner5d.library.services.utility.k3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oj.j;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f137129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final k3 f137130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f137131c;

    @j
    public b(boolean z10) {
        this(z10, null, false, 6, null);
    }

    public final boolean a() {
        return this.f137129a;
    }

    @Nullable
    public final k3 b() {
        return this.f137130b;
    }

    public final boolean c() {
        return this.f137129a && this.f137131c;
    }

    @j
    public b(boolean z10, @Nullable k3 k3Var) {
        this(z10, k3Var, false, 4, null);
    }

    @j
    public b(boolean z10, @Nullable k3 k3Var, boolean z11) {
        this.f137129a = z10;
        this.f137130b = k3Var;
        this.f137131c = z11;
    }

    public /* synthetic */ b(boolean z10, k3 k3Var, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? null : k3Var, (i10 & 4) != 0 ? false : z11);
    }
}
