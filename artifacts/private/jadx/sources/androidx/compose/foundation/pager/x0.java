package androidx.compose.foundation.pager;

import androidx.compose.runtime.e6;
import androidx.compose.runtime.g4;
import androidx.compose.runtime.k3;
import androidx.compose.runtime.l3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPagerScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPositionKt\n*L\n1#1,137:1\n78#2:138\n111#2,2:139\n81#3:141\n114#3,2:142\n127#4,4:144\n*S KotlinDebug\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n*L\n37#1:138\n37#1:139,2\n40#1:141\n40#1:142,2\n106#1:144,4\n*E\n"})
public final class x0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f18489g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i1 f18490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l3 f18491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final k3 f18492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Object f18494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.c1 f18495f;

    public x0(int i10, float f10, @NotNull i1 i1Var) {
        this.f18490a = i1Var;
        this.f18491b = e6.b(i10);
        this.f18492c = g4.b(f10);
        this.f18495f = new androidx.compose.foundation.lazy.layout.c1(i10, 30, 100);
    }

    private final void h(int i10) {
        this.f18491b.j(i10);
    }

    private final void i(float f10) {
        this.f18492c.q(f10);
    }

    private final void j(int i10, float f10) {
        h(i10);
        this.f18495f.d(i10);
        i(f10);
    }

    public final void a(int i10) {
        i(c() + (this.f18490a.X() == 0 ? 0.0f : i10 / this.f18490a.X()));
    }

    public final int b() {
        return this.f18491b.m1();
    }

    public final float c() {
        return this.f18492c.V0();
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.c1 d() {
        return this.f18495f;
    }

    @NotNull
    public final i1 e() {
        return this.f18490a;
    }

    public final int f(@NotNull l0 l0Var, int i10) {
        int iA = androidx.compose.foundation.lazy.layout.m0.a(l0Var, this.f18494e, i10);
        if (i10 != iA) {
            h(iA);
            this.f18495f.d(i10);
        }
        return iA;
    }

    public final void g(int i10, float f10) {
        j(i10, f10);
        this.f18494e = null;
    }

    public final void k(float f10) {
        i(f10);
    }

    public final void l(@NotNull u0 u0Var) {
        m mVarL = u0Var.l();
        this.f18494e = mVarL != null ? mVarL.getKey() : null;
        if (!this.f18493d && u0Var.w1().isEmpty()) {
            return;
        }
        this.f18493d = true;
        m mVarL2 = u0Var.l();
        j(mVarL2 != null ? mVarL2.getIndex() : 0, u0Var.m());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ x0(int i10, float f10, i1 i1Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        i10 = (i11 & 1) != 0 ? 0 : i10;
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
            int i12 = 7 >> 0;
        }
        this(i10, f10, i1Var);
    }
}
