package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f125047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f125048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f125049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f125050d;

    public k0(@NotNull String processName, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.f125047a = processName;
        this.f125048b = i10;
        this.f125049c = i11;
        this.f125050d = z10;
    }

    public static /* synthetic */ k0 f(k0 k0Var, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = k0Var.f125047a;
        }
        if ((i12 & 2) != 0) {
            i10 = k0Var.f125048b;
        }
        if ((i12 & 4) != 0) {
            i11 = k0Var.f125049c;
        }
        if ((i12 & 8) != 0) {
            z10 = k0Var.f125050d;
        }
        return k0Var.e(str, i10, i11, z10);
    }

    @NotNull
    public final String a() {
        return this.f125047a;
    }

    public final int b() {
        return this.f125048b;
    }

    public final int c() {
        return this.f125049c;
    }

    public final boolean d() {
        return this.f125050d;
    }

    @NotNull
    public final k0 e(@NotNull String processName, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return new k0(processName, i10, i11, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.areEqual(this.f125047a, k0Var.f125047a) && this.f125048b == k0Var.f125048b && this.f125049c == k0Var.f125049c && this.f125050d == k0Var.f125050d;
    }

    public final int g() {
        return this.f125049c;
    }

    public final int h() {
        return this.f125048b;
    }

    public int hashCode() {
        return (((((this.f125047a.hashCode() * 31) + Integer.hashCode(this.f125048b)) * 31) + Integer.hashCode(this.f125049c)) * 31) + Boolean.hashCode(this.f125050d);
    }

    @NotNull
    public final String i() {
        return this.f125047a;
    }

    public final boolean j() {
        return this.f125050d;
    }

    @NotNull
    public String toString() {
        return "ProcessDetails(processName=" + this.f125047a + ", pid=" + this.f125048b + ", importance=" + this.f125049c + ", isDefaultProcess=" + this.f125050d + ')';
    }
}
