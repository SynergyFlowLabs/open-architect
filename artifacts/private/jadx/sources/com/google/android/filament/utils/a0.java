package com.google.android.filament.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private f f104812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private f f104813b;

    public a0(@NotNull f origin, @NotNull f direction) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f104812a = origin;
        this.f104813b = direction;
    }

    public static /* synthetic */ a0 d(a0 a0Var, f fVar, f fVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = a0Var.f104812a;
        }
        if ((i10 & 2) != 0) {
            fVar2 = a0Var.f104813b;
        }
        return a0Var.c(fVar, fVar2);
    }

    @NotNull
    public final f a() {
        return this.f104812a;
    }

    @NotNull
    public final f b() {
        return this.f104813b;
    }

    @NotNull
    public final a0 c(@NotNull f origin, @NotNull f direction) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new a0(origin, direction);
    }

    @NotNull
    public final f e() {
        return this.f104813b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.areEqual(this.f104812a, a0Var.f104812a) && Intrinsics.areEqual(this.f104813b, a0Var.f104813b);
    }

    @NotNull
    public final f f() {
        return this.f104812a;
    }

    public final void g(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f104813b = fVar;
    }

    public final void h(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f104812a = fVar;
    }

    public int hashCode() {
        return (this.f104812a.hashCode() * 31) + this.f104813b.hashCode();
    }

    @NotNull
    public String toString() {
        return "Ray(origin=" + this.f104812a + ", direction=" + this.f104813b + ")";
    }

    public /* synthetic */ a0(f fVar, f fVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new f(0.0f, 0.0f, 0.0f, 7, null) : fVar, fVar2);
    }
}
