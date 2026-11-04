package androidx.compose.foundation.lazy.grid;

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
final class b0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x1 f16772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final w f16773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.o0 f16774c;

    @SourceDebugExtension({"SMAP\nLazyGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderImpl$Item$1\n+ 2 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,106:1\n50#2,3:107\n*S KotlinDebug\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderImpl$Item$1\n*L\n82#1:107,3\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f16776b;

        a(int i10) {
            this.f16776b = i10;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                int i11 = 1 & (-1);
                androidx.compose.runtime.m0.A0(726189336, i10, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:81)");
            }
            w wVar = b0.this.f16773b;
            int i12 = this.f16776b;
            androidx.compose.foundation.lazy.layout.m.a<q> aVar = wVar.E().get(i12);
            aVar.c().a().invoke(g0.f16802a, Integer.valueOf(i12 - aVar.b()), c0Var, 6);
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

    public b0(@NotNull x1 x1Var, @NotNull w wVar, @NotNull androidx.compose.foundation.lazy.layout.o0 o0Var) {
        this.f16772a = x1Var;
        this.f16773b = wVar;
        this.f16774c = o0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(b0 b0Var, int i10, Object obj, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        b0Var.i(i10, obj, c0Var, t4.a(i11 | 1));
        return Unit.f312394a;
    }

    @Override // androidx.compose.foundation.lazy.layout.l0
    public int a() {
        return this.f16773b.F();
    }

    @Override // androidx.compose.foundation.lazy.grid.z
    @NotNull
    public androidx.compose.foundation.lazy.layout.o0 b() {
        return this.f16774c;
    }

    @Override // androidx.compose.foundation.lazy.layout.l0
    public int c(@NotNull Object obj) {
        return b().c(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.l0
    @NotNull
    public Object d(int i10) {
        Object objD = b().d(i10);
        return objD == null ? this.f16773b.G(i10) : objD;
    }

    @Override // androidx.compose.foundation.lazy.grid.z
    @NotNull
    public androidx.collection.f0 e() {
        return this.f16773b.Q();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return Intrinsics.areEqual(this.f16773b, ((b0) obj).f16773b);
        }
        return false;
    }

    @Override // androidx.compose.foundation.lazy.layout.l0
    @Nullable
    public Object f(int i10) {
        return this.f16773b.D(i10);
    }

    public int hashCode() {
        return this.f16773b.hashCode();
    }

    @Override // androidx.compose.foundation.lazy.layout.l0
    @androidx.compose.runtime.o
    public void i(int i10, @NotNull Object obj, @Nullable androidx.compose.runtime.c0 c0Var, final int i11) {
        int i12;
        final int i13;
        final Object obj2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1493551140);
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
                androidx.compose.runtime.m0.A0(1493551140, i12, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:79)");
            }
            i13 = i10;
            obj2 = obj;
            androidx.compose.foundation.lazy.layout.g1.c(obj2, i13, this.f16772a.R(), androidx.compose.runtime.internal.w.e(726189336, true, new a(i10), c0VarR, 54), c0VarR, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & com.planner5d.library.engine.input.f.b.B));
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
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return b0.l(this.f16760a, i13, obj2, i11, (androidx.compose.runtime.c0) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.z
    @NotNull
    public o1 j() {
        return this.f16773b.S();
    }
}
