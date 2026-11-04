package androidx.compose.ui.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f42129b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o3 f42130a;

    public r(@NotNull o3 o3Var) {
        this.f42130a = o3Var;
    }

    @NotNull
    public final o3 a() {
        return this.f42130a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        o3 o3Var = this.f42130a;
        r rVar = (r) obj;
        return Intrinsics.areEqual(o3Var.n(), rVar.f42130a.n()) && o3Var.m().a0(rVar.f42130a.m()) && Intrinsics.areEqual(o3Var.i(), rVar.f42130a.i()) && o3Var.g() == rVar.f42130a.g() && o3Var.l() == rVar.f42130a.l() && androidx.compose.ui.text.style.v.i(o3Var.h(), rVar.f42130a.h()) && Intrinsics.areEqual(o3Var.d(), rVar.f42130a.d()) && o3Var.f() == rVar.f42130a.f() && o3Var.e() == rVar.f42130a.e() && androidx.compose.ui.unit.b.g(o3Var.c(), rVar.f42130a.c());
    }

    public int hashCode() {
        o3 o3Var = this.f42130a;
        return (((((((((((((((((o3Var.n().hashCode() * 31) + o3Var.m().b0()) * 31) + o3Var.i().hashCode()) * 31) + o3Var.g()) * 31) + Boolean.hashCode(o3Var.l())) * 31) + androidx.compose.ui.text.style.v.j(o3Var.h())) * 31) + o3Var.d().hashCode()) * 31) + o3Var.f().hashCode()) * 31) + o3Var.e().hashCode()) * 31) + androidx.compose.ui.unit.b.t(o3Var.c());
    }
}
