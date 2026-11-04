package com.planner5d.library.spaces.data;

import androidx.annotation.v;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f230128c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f230129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f230130b;

    public i(@v int i10, boolean z10) {
        this.f230129a = i10;
        this.f230130b = z10;
    }

    public static /* synthetic */ i d(i iVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iVar.f230129a;
        }
        if ((i11 & 2) != 0) {
            z10 = iVar.f230130b;
        }
        return iVar.c(i10, z10);
    }

    public final int a() {
        return this.f230129a;
    }

    public final boolean b() {
        return this.f230130b;
    }

    @NotNull
    public final i c(@v int i10, boolean z10) {
        return new i(i10, z10);
    }

    public final int e() {
        return this.f230129a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f230129a == iVar.f230129a && this.f230130b == iVar.f230130b;
    }

    public final boolean f() {
        return this.f230130b;
    }

    public final void g(boolean z10) {
        this.f230130b = z10;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f230129a) * 31) + Boolean.hashCode(this.f230130b);
    }

    @NotNull
    public String toString() {
        return "SurveyStepStyleData(image=" + this.f230129a + ", selected=" + this.f230130b + ")";
    }

    public /* synthetic */ i(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? false : z10);
    }
}
