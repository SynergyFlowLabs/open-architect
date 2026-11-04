package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
final class i0 implements h0, c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d0 f16086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f16087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f16088c;

    public /* synthetic */ i0(androidx.compose.ui.unit.d dVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j10);
    }

    private final androidx.compose.ui.unit.d l() {
        return this.f16087b;
    }

    public static /* synthetic */ i0 o(i0 i0Var, androidx.compose.ui.unit.d dVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = i0Var.f16087b;
        }
        if ((i10 & 2) != 0) {
            j10 = i0Var.f16088c;
        }
        return i0Var.n(dVar, j10);
    }

    @Override // androidx.compose.foundation.layout.c0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.e eVar) {
        return this.f16086a.b(a0Var, eVar);
    }

    @Override // androidx.compose.foundation.layout.h0
    public float c() {
        return androidx.compose.ui.unit.b.j(h()) ? this.f16087b.D3(androidx.compose.ui.unit.b.p(h())) : androidx.compose.ui.unit.h.f42689b.c();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (Intrinsics.areEqual(this.f16087b, i0Var.f16087b) && androidx.compose.ui.unit.b.g(this.f16088c, i0Var.f16088c)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.h0
    public float g() {
        return androidx.compose.ui.unit.b.i(h()) ? this.f16087b.D3(androidx.compose.ui.unit.b.o(h())) : androidx.compose.ui.unit.h.f42689b.c();
    }

    @Override // androidx.compose.foundation.layout.h0
    public long h() {
        return this.f16088c;
    }

    public int hashCode() {
        return (this.f16087b.hashCode() * 31) + androidx.compose.ui.unit.b.t(this.f16088c);
    }

    @Override // androidx.compose.foundation.layout.h0
    public float i() {
        return this.f16087b.D3(androidx.compose.ui.unit.b.r(h()));
    }

    @Override // androidx.compose.foundation.layout.c0
    @androidx.compose.runtime.k7
    @NotNull
    public androidx.compose.ui.a0 j(@NotNull androidx.compose.ui.a0 a0Var) {
        return this.f16086a.j(a0Var);
    }

    @Override // androidx.compose.foundation.layout.h0
    public float k() {
        return this.f16087b.D3(androidx.compose.ui.unit.b.q(h()));
    }

    public final long m() {
        return this.f16088c;
    }

    @NotNull
    public final i0 n(@NotNull androidx.compose.ui.unit.d dVar, long j10) {
        return new i0(dVar, j10, null);
    }

    @NotNull
    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f16087b + ", constraints=" + ((Object) androidx.compose.ui.unit.b.w(this.f16088c)) + ')';
    }

    private i0(androidx.compose.ui.unit.d dVar, long j10) {
        this.f16086a = d0.f15956a;
        this.f16087b = dVar;
        this.f16088c = j10;
    }
}
