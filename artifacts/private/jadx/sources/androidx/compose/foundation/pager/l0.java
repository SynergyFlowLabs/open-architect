package androidx.compose.foundation.pager;

import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class l0 implements androidx.compose.foundation.lazy.layout.l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f18353e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i1 f18354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.y<w> f18355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.o0 f18356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final w0 f18357d = w0.f18484a;

    @SourceDebugExtension({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider$Item$1\n+ 2 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,410:1\n50#2,3:411\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider$Item$1\n*L\n212#1:411,3\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18359b;

        a(int i10) {
            this.f18359b = i10;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1142237095, i10, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:211)");
            }
            androidx.compose.foundation.lazy.layout.y yVar = l0.this.f18355b;
            int i11 = this.f18359b;
            l0 l0Var = l0.this;
            androidx.compose.foundation.lazy.layout.m.a aVar = yVar.E().get(i11);
            ((w) aVar.c()).a().invoke(l0Var.f18357d, Integer.valueOf(i11 - aVar.b()), c0Var, 0);
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

    public l0(@NotNull i1 i1Var, @NotNull androidx.compose.foundation.lazy.layout.y<w> yVar, @NotNull androidx.compose.foundation.lazy.layout.o0 o0Var) {
        this.f18354a = i1Var;
        this.f18355b = yVar;
        this.f18356c = o0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(l0 l0Var, int i10, Object obj, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        l0Var.i(i10, obj, c0Var, t4.a(i11 | 1));
        return Unit.f312394a;
    }

    @Override // androidx.compose.foundation.lazy.layout.l0
    public int a() {
        return this.f18355b.F();
    }

    @Override // androidx.compose.foundation.lazy.layout.l0
    public int c(@NotNull Object obj) {
        return this.f18356c.c(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.l0
    @NotNull
    public Object d(int i10) {
        Object objD = this.f18356c.d(i10);
        return objD == null ? this.f18355b.G(i10) : objD;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            return Intrinsics.areEqual(this.f18355b, ((l0) obj).f18355b);
        }
        return false;
    }

    public int hashCode() {
        return this.f18355b.hashCode();
    }

    @Override // androidx.compose.foundation.lazy.layout.l0
    @androidx.compose.runtime.o
    public void i(int i10, @NotNull Object obj, @Nullable androidx.compose.runtime.c0 c0Var, final int i11) {
        int i12;
        final int i13;
        final Object obj2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1201380429);
        if ((i11 & 6) == 0) {
            i12 = (c0VarR.K(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0VarR.k0(obj) ? 32 : 16;
        }
        if ((i11 & a5.S0) == 0) {
            i12 |= c0VarR.D(this) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                int i14 = 6 & (-1);
                androidx.compose.runtime.m0.A0(-1201380429, i12, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:209)");
            }
            i13 = i10;
            obj2 = obj;
            androidx.compose.foundation.lazy.layout.g1.c(obj2, i13, this.f18354a.Z(), androidx.compose.runtime.internal.w.e(1142237095, true, new a(i10), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & com.planner5d.library.engine.input.f.b.B));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            i13 = i10;
            obj2 = obj;
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.pager.k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return l0.l(this.f18344a, i13, obj2, i11, (androidx.compose.runtime.c0) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }
}
