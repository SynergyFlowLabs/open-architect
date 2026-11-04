package com.planner5d.library.services.utility;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class u2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f229762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f229763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f229764c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public u2(int i10) {
        this(i10, 0, 0, 6, null);
        int i11 = 0 << 0;
    }

    public final int a() {
        return this.f229764c;
    }

    public final int b() {
        return this.f229763b;
    }

    public final int c() {
        return this.f229762a;
    }

    @NotNull
    public final Bundle d() {
        return new i().f(com.planner5d.library.services.r.position, this.f229762a).f(com.planner5d.library.services.r.offset, this.f229763b).f(com.planner5d.library.services.r.lastVisibleItemPosition, this.f229764c).a();
    }

    @oj.j
    public u2(int i10, int i11) {
        this(i10, i11, 0, 4, null);
    }

    public u2(@Nullable Bundle bundle) {
        j jVar = new j(bundle);
        this.f229762a = jVar.c(com.planner5d.library.services.r.position, 0);
        this.f229763b = jVar.c(com.planner5d.library.services.r.offset, 0);
        this.f229764c = jVar.c(com.planner5d.library.services.r.lastVisibleItemPosition, 0);
    }

    public /* synthetic */ u2(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12);
    }

    @oj.j
    public u2(int i10, int i11, int i12) {
        this.f229762a = i10;
        this.f229763b = i11;
        this.f229764c = i12;
    }
}
