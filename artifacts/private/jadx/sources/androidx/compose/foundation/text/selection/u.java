package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.x6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate\n+ 2 Synchronization.android.kt\nandroidx/compose/foundation/platform/Synchronization_androidKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,366:1\n26#2:367\n32#2:368\n59#3:369\n59#3:371\n90#4:370\n90#4:372\n278#5:373\n*S KotlinDebug\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate\n*L\n36#1:367\n52#1:368\n59#1:369\n68#1:371\n59#1:370\n68#1:372\n87#1:373\n*E\n"})
public final class u implements e0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21381g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<androidx.compose.ui.layout.g0> f21383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<androidx.compose.ui.text.p3> f21384c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.text.p3 f21386e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f21385d = this;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21387f = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public u(long j10, @NotNull Function0<? extends androidx.compose.ui.layout.g0> function0, @NotNull Function0<androidx.compose.ui.text.p3> function1) {
        this.f21382a = j10;
        this.f21383b = function0;
        this.f21384c = function1;
    }

    private final int a(androidx.compose.ui.text.p3 p3Var) {
        int i10;
        int iO;
        synchronized (this.f21385d) {
            try {
                if (this.f21386e != p3Var) {
                    if (!p3Var.f() || p3Var.x().i()) {
                        iO = p3Var.o() - 1;
                    } else {
                        int iB = kotlin.ranges.r.B(p3Var.s((int) (p3Var.C() & com.rabbitmq.client.k0.f265952a)), p3Var.o() - 1);
                        while (iB >= 0 && p3Var.w(iB) >= ((int) (p3Var.C() & com.rabbitmq.client.k0.f265952a))) {
                            iB--;
                        }
                        iO = kotlin.ranges.r.u(iB, 0);
                    }
                    this.f21387f = p3Var.p(iO, true);
                    this.f21386e = p3Var;
                }
                i10 = this.f21387f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // androidx.compose.foundation.text.selection.e0
    @Nullable
    public androidx.compose.ui.layout.g0 M() {
        androidx.compose.ui.layout.g0 g0VarInvoke = this.f21383b.invoke();
        if (g0VarInvoke == null || !g0VarInvoke.I()) {
            return null;
        }
        return g0VarInvoke;
    }

    @Override // androidx.compose.foundation.text.selection.e0
    public float c(int i10) {
        androidx.compose.ui.text.p3 p3VarInvoke = this.f21384c.invoke();
        if (p3VarInvoke != null) {
            return x6.b(p3VarInvoke, i10);
        }
        return 0.0f;
    }

    @Override // androidx.compose.foundation.text.selection.e0
    public float d(int i10) {
        int iR;
        androidx.compose.ui.text.p3 p3VarInvoke = this.f21384c.invoke();
        if (p3VarInvoke != null && (iR = p3VarInvoke.r(i10)) < p3VarInvoke.o()) {
            return p3VarInvoke.t(iR);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.e0
    @NotNull
    public androidx.compose.ui.text.f getText() {
        androidx.compose.ui.text.p3 p3VarInvoke = this.f21384c.invoke();
        return p3VarInvoke == null ? new androidx.compose.ui.text.f("", null, 2, null) : p3VarInvoke.l().n();
    }

    @Override // androidx.compose.foundation.text.selection.e0
    public float h(int i10) {
        int iR;
        androidx.compose.ui.text.p3 p3VarInvoke = this.f21384c.invoke();
        if (p3VarInvoke != null && (iR = p3VarInvoke.r(i10)) < p3VarInvoke.o()) {
            return p3VarInvoke.u(iR);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.e0
    @NotNull
    public n0.j j(int i10) {
        int length;
        androidx.compose.ui.text.p3 p3VarInvoke = this.f21384c.invoke();
        if (p3VarInvoke != null && (length = p3VarInvoke.l().n().length()) >= 1) {
            return p3VarInvoke.d(kotlin.ranges.r.I(i10, 0, length - 1));
        }
        return n0.j.f332705e.a();
    }

    @Override // androidx.compose.foundation.text.selection.e0
    @Nullable
    public androidx.compose.ui.text.p3 k() {
        return this.f21384c.invoke();
    }

    @Override // androidx.compose.foundation.text.selection.e0
    public long l(@NotNull h0 h0Var, boolean z10) {
        androidx.compose.ui.text.p3 p3VarInvoke;
        if ((z10 && h0Var.h().h() != o()) || (!z10 && h0Var.f().h() != o())) {
            return n0.g.f332700b.c();
        }
        if (M() != null && (p3VarInvoke = this.f21384c.invoke()) != null) {
            return z4.b(p3VarInvoke, kotlin.ranges.r.I((z10 ? h0Var.h() : h0Var.f()).g(), 0, a(p3VarInvoke)), z10, h0Var.g());
        }
        return n0.g.f332700b.c();
    }

    @Override // androidx.compose.foundation.text.selection.e0
    public int m() {
        androidx.compose.ui.text.p3 p3VarInvoke = this.f21384c.invoke();
        if (p3VarInvoke == null) {
            return 0;
        }
        return a(p3VarInvoke);
    }

    @Override // androidx.compose.foundation.text.selection.e0
    public float n(int i10) {
        int iR;
        androidx.compose.ui.text.p3 p3VarInvoke = this.f21384c.invoke();
        if (p3VarInvoke == null || (iR = p3VarInvoke.r(i10)) >= p3VarInvoke.o()) {
            return -1.0f;
        }
        float fW = p3VarInvoke.w(iR);
        return ((p3VarInvoke.n(iR) - fW) / 2) + fW;
    }

    @Override // androidx.compose.foundation.text.selection.e0
    public long o() {
        return this.f21382a;
    }

    @Override // androidx.compose.foundation.text.selection.e0
    @Nullable
    public h0 p() {
        androidx.compose.ui.text.p3 p3VarInvoke = this.f21384c.invoke();
        if (p3VarInvoke == null) {
            return null;
        }
        int length = p3VarInvoke.l().n().length();
        return new h0(new h0.a(p3VarInvoke.c(0), 0, o()), new h0.a(p3VarInvoke.c(Math.max(length - 1, 0)), length, o()), false);
    }

    @Override // androidx.compose.foundation.text.selection.e0
    public void q(@NotNull p1 p1Var) {
        androidx.compose.ui.text.p3 p3VarInvoke;
        androidx.compose.ui.layout.g0 g0VarM = M();
        if (g0VarM != null && (p3VarInvoke = this.f21384c.invoke()) != null) {
            androidx.compose.ui.layout.g0 g0VarC = p1Var.c();
            n0.g.a aVar = n0.g.f332700b;
            long jR0 = g0VarC.r0(g0VarM, aVar.e());
            v.a(p1Var, p3VarInvoke, n0.g.v(p1Var.d(), jR0), (p1Var.e() & 9223372034707292159L) == n0.d.f332689d ? aVar.c() : n0.g.v(p1Var.e(), jR0), o());
        }
    }

    @Override // androidx.compose.foundation.text.selection.e0
    public long r(int i10) {
        int iA;
        androidx.compose.ui.text.p3 p3VarInvoke = this.f21384c.invoke();
        if (p3VarInvoke != null && (iA = a(p3VarInvoke)) >= 1) {
            int iR = p3VarInvoke.r(kotlin.ranges.r.I(i10, 0, iA - 1));
            return androidx.compose.ui.text.x3.b(p3VarInvoke.v(iR), p3VarInvoke.p(iR, true));
        }
        return androidx.compose.ui.text.w3.f42333b.a();
    }
}
