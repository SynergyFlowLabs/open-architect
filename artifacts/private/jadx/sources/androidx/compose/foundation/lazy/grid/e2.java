package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.q3;
import androidx.media3.exoplayer.a5;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,733:1\n1282#2,6:734\n1282#2,6:740\n1282#2,6:746\n1282#2,6:752\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridStateKt\n*L\n79#1:734,6\n101#1:740,6\n103#1:746,6\n131#1:752,6\n*E\n"})
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final u0 f16792a;

    public static final class a implements androidx.compose.ui.layout.b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<androidx.compose.ui.layout.a, Integer> f16795c = MapsKt.emptyMap();

        a() {
        }

        public static /* synthetic */ void a() {
        }

        @Override // androidx.compose.ui.layout.b1
        public int getHeight() {
            return this.f16794b;
        }

        @Override // androidx.compose.ui.layout.b1
        public int getWidth() {
            return this.f16793a;
        }

        @Override // androidx.compose.ui.layout.b1
        public Map<androidx.compose.ui.layout.a, Integer> x() {
            return this.f16795c;
        }

        @Override // androidx.compose.ui.layout.b1
        public void y() {
        }
    }

    static {
        a aVar = new a();
        List listEmptyList = CollectionsKt.emptyList();
        q3 q3Var = q3.Vertical;
        f16792a = new u0(null, 0, false, 0.0f, aVar, 0.0f, false, kotlinx.coroutines.t0.a(kotlin.coroutines.h.f312451a), androidx.compose.ui.unit.f.b(1.0f, 0.0f, 2, null), 0, new Function1() { // from class: androidx.compose.foundation.lazy.grid.c2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e2.f(((Integer) obj).intValue());
            }
        }, new Function1() { // from class: androidx.compose.foundation.lazy.grid.d2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(e2.g(((Integer) obj).intValue()));
            }
        }, listEmptyList, 0, 0, 0, false, q3Var, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(int i10) {
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i10) {
        return -1;
    }

    @androidx.compose.runtime.o
    @androidx.compose.foundation.b2
    @NotNull
    public static final x1 i(final int i10, final int i11, @Nullable final d1 d1Var, @Nullable androidx.compose.runtime.c0 c0Var, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        boolean z10 = true;
        if ((i13 & 4) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = e1.b(0, 1, null);
                c0Var.Y(objI0);
            }
            d1Var = (d1) objI0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-20335728, i12, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:101)");
        }
        Object[] objArr = {d1Var};
        androidx.compose.runtime.saveable.c0<x1, ?> c0VarF = x1.f17061y.f(d1Var);
        boolean z11 = ((((i12 & 14) ^ 6) > 4 && c0Var.K(i10)) || (i12 & 6) == 4) | ((((i12 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.K(i11)) || (i12 & 48) == 32);
        if ((((i12 & 896) ^ a5.S0) <= 256 || !c0Var.k0(d1Var)) && (i12 & a5.S0) != 256) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function0() { // from class: androidx.compose.foundation.lazy.grid.b2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e2.m(i10, i11, d1Var);
                }
            };
            c0Var.Y(objI1);
        }
        x1 x1Var = (x1) androidx.compose.runtime.saveable.i.j(objArr, c0VarF, (Function0) objI1, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return x1Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final x1 j(final int i10, final int i11, @Nullable androidx.compose.runtime.c0 c0Var, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(29186956, i12, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:77)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<x1, ?> c0VarE = x1.f17061y.e();
        boolean z10 = true;
        boolean z11 = (((i12 & 14) ^ 6) > 4 && c0Var.K(i10)) || (i12 & 6) == 4;
        if ((((i12 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0Var.K(i11)) && (i12 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objI0 = c0Var.i0();
        if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.compose.foundation.lazy.grid.a2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e2.l(i10, i11);
                }
            };
            c0Var.Y(objI0);
        }
        x1 x1Var = (x1) androidx.compose.runtime.saveable.i.j(objArr, c0VarE, (Function0) objI0, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return x1Var;
    }

    @androidx.compose.runtime.o
    @androidx.compose.foundation.b2
    @NotNull
    public static final x1 k(@NotNull final androidx.compose.foundation.lazy.layout.w wVar, final int i10, final int i11, @Nullable androidx.compose.runtime.c0 c0Var, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1537306572, i12, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:129)");
        }
        Object[] objArr = {wVar};
        androidx.compose.runtime.saveable.c0<x1, ?> c0VarG = x1.f17061y.g(wVar);
        boolean z10 = true;
        boolean z11 = ((((i12 & 14) ^ 6) > 4 && c0Var.D(wVar)) || (i12 & 6) == 4) | ((((i12 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.K(i10)) || (i12 & 48) == 32);
        if ((((i12 & 896) ^ a5.S0) <= 256 || !c0Var.K(i11)) && (i12 & a5.S0) != 256) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objI0 = c0Var.i0();
        if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.compose.foundation.lazy.grid.z1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e2.n(wVar, i10, i11);
                }
            };
            c0Var.Y(objI0);
        }
        x1 x1Var = (x1) androidx.compose.runtime.saveable.i.j(objArr, c0VarG, (Function0) objI0, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return x1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x1 l(int i10, int i11) {
        return new x1(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x1 m(int i10, int i11, d1 d1Var) {
        return new x1(i10, i11, d1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x1 n(androidx.compose.foundation.lazy.layout.w wVar, int i10, int i11) {
        return new x1(wVar, i10, i11);
    }
}
