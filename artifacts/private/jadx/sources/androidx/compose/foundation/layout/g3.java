package androidx.compose.foundation.layout;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class g3 implements b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q.e f16033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q.m f16034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f16035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final k1 f16036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f16037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f16038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f16039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f16040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final y2 f16041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final List<Function2<androidx.compose.runtime.c0, Integer, Unit>> f16042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final pj.o<Integer, z2, androidx.compose.runtime.c0, Integer, Unit> f16043l;

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f16045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z2 f16046c;

        a(int i10, z2 z2Var) {
            this.f16045b = i10;
            this.f16046c = z2Var;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-195060736, i10, -1, "androidx.compose.foundation.layout.FlowMeasureLazyPolicy.measure.<anonymous>.<anonymous> (ContextualFlowLayout.kt:486)");
            }
            g3.this.f16043l.invoke(Integer.valueOf(this.f16045b), this.f16046c, c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    public /* synthetic */ g3(boolean z10, q.e eVar, q.m mVar, float f10, k1 k1Var, float f11, int i10, int i11, int i12, y2 y2Var, List list, pj.o oVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, eVar, mVar, f10, k1Var, f11, i10, i11, i12, y2Var, list, oVar);
    }

    private final float A() {
        return this.f16037f;
    }

    private final int B() {
        return this.f16038g;
    }

    private final int C() {
        return this.f16039h;
    }

    private final int D() {
        return this.f16040i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g3 F(g3 g3Var, boolean z10, q.e eVar, q.m mVar, float f10, k1 k1Var, float f11, int i10, int i11, int i12, y2 y2Var, List list, pj.o oVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = g3Var.f16032a;
        }
        if ((i13 & 2) != 0) {
            eVar = g3Var.f16033b;
        }
        if ((i13 & 4) != 0) {
            mVar = g3Var.f16034c;
        }
        if ((i13 & 8) != 0) {
            f10 = g3Var.f16035d;
        }
        if ((i13 & 16) != 0) {
            k1Var = g3Var.f16036e;
        }
        if ((i13 & 32) != 0) {
            f11 = g3Var.f16037f;
        }
        if ((i13 & 64) != 0) {
            i10 = g3Var.f16038g;
        }
        if ((i13 & 128) != 0) {
            i11 = g3Var.f16039h;
        }
        if ((i13 & 256) != 0) {
            i12 = g3Var.f16040i;
        }
        if ((i13 & 512) != 0) {
            y2Var = g3Var.f16041j;
        }
        if ((i13 & 1024) != 0) {
            list = g3Var.f16042k;
        }
        if ((i13 & 2048) != 0) {
            oVar = g3Var.f16043l;
        }
        List list2 = list;
        pj.o oVar2 = oVar;
        int i14 = i12;
        y2 y2Var2 = y2Var;
        int i15 = i10;
        int i16 = i11;
        k1 k1Var2 = k1Var;
        float f12 = f11;
        return g3Var.E(z10, eVar, mVar, f10, k1Var2, f12, i15, i16, i14, y2Var2, list2, oVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 H(g3 g3Var, androidx.compose.ui.layout.b3 b3Var, androidx.compose.ui.unit.b bVar) {
        return g3Var.I(b3Var, bVar.x());
    }

    private final androidx.compose.ui.layout.b1 I(final androidx.compose.ui.layout.b3 b3Var, long j10) {
        if (this.f16038g <= 0 || this.f16039h == 0 || this.f16040i == 0 || (androidx.compose.ui.unit.b.o(j10) == 0 && this.f16041j.p() != u2.a.Visible)) {
            return androidx.compose.ui.layout.c1.h6(b3Var, 0, 0, null, new Function1() { // from class: androidx.compose.foundation.layout.d3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g3.J((androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
        y0 y0Var = new y0(this.f16038g, new Function2() { // from class: androidx.compose.foundation.layout.e3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g3.K(b3Var, this, ((Integer) obj).intValue(), (z2) obj2);
            }
        });
        this.f16041j.q(this.f16038g);
        this.f16041j.u(this, j10, new Function2() { // from class: androidx.compose.foundation.layout.f3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g3.L(this.f16012a, b3Var, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue());
            }
        });
        return t2.q(b3Var, this, y0Var, this.f16035d, this.f16037f, x4.d(j10, i() ? i4.Horizontal : i4.Vertical), this.f16040i, this.f16039h, this.f16041j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(androidx.compose.ui.layout.i2.a aVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List K(androidx.compose.ui.layout.b3 b3Var, g3 g3Var, int i10, z2 z2Var) {
        return b3Var.S4(Integer.valueOf(i10), androidx.compose.runtime.internal.w.c(-195060736, true, g3Var.new a(i10, z2Var)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.z0 L(g3 g3Var, androidx.compose.ui.layout.b3 b3Var, boolean z10, int i10) {
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2 = (Function2) CollectionsKt.getOrNull(g3Var.f16042k, !z10 ? 1 : 0);
        if (function2 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10);
        sb2.append(g3Var.f16038g);
        sb2.append(i10);
        return (androidx.compose.ui.layout.z0) CollectionsKt.getOrNull(b3Var.S4(sb2.toString(), function2), 0);
    }

    private final y2 o() {
        return this.f16041j;
    }

    private final List<Function2<androidx.compose.runtime.c0, Integer, Unit>> s() {
        return this.f16042k;
    }

    private final pj.o<Integer, z2, androidx.compose.runtime.c0, Integer, Unit> v() {
        return this.f16043l;
    }

    private final float y() {
        return this.f16035d;
    }

    @NotNull
    public final g3 E(boolean z10, @NotNull q.e eVar, @NotNull q.m mVar, float f10, @NotNull k1 k1Var, float f11, int i10, int i11, int i12, @NotNull y2 y2Var, @NotNull List<? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> list, @NotNull pj.o<? super Integer, ? super z2, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        return new g3(z10, eVar, mVar, f10, k1Var, f11, i10, i11, i12, y2Var, list, oVar, null);
    }

    @NotNull
    public final Function2<androidx.compose.ui.layout.b3, androidx.compose.ui.unit.b, androidx.compose.ui.layout.b1> G() {
        return new Function2() { // from class: androidx.compose.foundation.layout.c3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g3.H(this.f15945a, (androidx.compose.ui.layout.b3) obj, (androidx.compose.ui.unit.b) obj2);
            }
        };
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        return this.f16032a == g3Var.f16032a && Intrinsics.areEqual(this.f16033b, g3Var.f16033b) && Intrinsics.areEqual(this.f16034c, g3Var.f16034c) && androidx.compose.ui.unit.h.x(this.f16035d, g3Var.f16035d) && Intrinsics.areEqual(this.f16036e, g3Var.f16036e) && androidx.compose.ui.unit.h.x(this.f16037f, g3Var.f16037f) && this.f16038g == g3Var.f16038g && this.f16039h == g3Var.f16039h && this.f16040i == g3Var.f16040i && Intrinsics.areEqual(this.f16041j, g3Var.f16041j) && Intrinsics.areEqual(this.f16042k, g3Var.f16042k) && Intrinsics.areEqual(this.f16043l, g3Var.f16043l);
    }

    public int hashCode() {
        return (((((((((((((((((((((Boolean.hashCode(this.f16032a) * 31) + this.f16033b.hashCode()) * 31) + this.f16034c.hashCode()) * 31) + androidx.compose.ui.unit.h.D(this.f16035d)) * 31) + this.f16036e.hashCode()) * 31) + androidx.compose.ui.unit.h.D(this.f16037f)) * 31) + Integer.hashCode(this.f16038g)) * 31) + Integer.hashCode(this.f16039h)) * 31) + Integer.hashCode(this.f16040i)) * 31) + this.f16041j.hashCode()) * 31) + this.f16042k.hashCode()) * 31) + this.f16043l.hashCode();
    }

    @Override // androidx.compose.foundation.layout.b3
    public boolean i() {
        return this.f16032a;
    }

    @Override // androidx.compose.foundation.layout.b3
    @NotNull
    public k1 l() {
        return this.f16036e;
    }

    public final boolean m() {
        return this.f16032a;
    }

    @Override // androidx.compose.foundation.layout.b3
    @NotNull
    public q.m q() {
        return this.f16034c;
    }

    @NotNull
    public String toString() {
        return "FlowMeasureLazyPolicy(isHorizontal=" + this.f16032a + ", horizontalArrangement=" + this.f16033b + ", verticalArrangement=" + this.f16034c + ", mainAxisSpacing=" + ((Object) androidx.compose.ui.unit.h.M(this.f16035d)) + ", crossAxisAlignment=" + this.f16036e + ", crossAxisArrangementSpacing=" + ((Object) androidx.compose.ui.unit.h.M(this.f16037f)) + ", itemCount=" + this.f16038g + ", maxLines=" + this.f16039h + ", maxItemsInMainAxis=" + this.f16040i + ", overflow=" + this.f16041j + ", overflowComposables=" + this.f16042k + ", getComposable=" + this.f16043l + ')';
    }

    @Override // androidx.compose.foundation.layout.b3
    @NotNull
    public q.e u() {
        return this.f16033b;
    }

    @NotNull
    public final q.e w() {
        return this.f16033b;
    }

    @NotNull
    public final q.m x() {
        return this.f16034c;
    }

    @NotNull
    public final k1 z() {
        return this.f16036e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g3(boolean z10, q.e eVar, q.m mVar, float f10, k1 k1Var, float f11, int i10, int i11, int i12, y2 y2Var, List<? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> list, pj.o<? super Integer, ? super z2, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        this.f16032a = z10;
        this.f16033b = eVar;
        this.f16034c = mVar;
        this.f16035d = f10;
        this.f16036e = k1Var;
        this.f16037f = f11;
        this.f16038g = i10;
        this.f16039h = i11;
        this.f16040i = i12;
        this.f16041j = y2Var;
        this.f16042k = list;
        this.f16043l = oVar;
    }
}
