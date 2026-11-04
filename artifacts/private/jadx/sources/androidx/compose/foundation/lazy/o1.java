package androidx.compose.foundation.lazy;

import androidx.compose.foundation.b2;
import androidx.compose.foundation.gestures.q3;
import androidx.media3.exoplayer.a5;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,719:1\n1282#2,6:720\n1282#2,6:726\n1282#2,6:732\n1282#2,6:738\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListStateKt\n*L\n79#1:720,6\n101#1:726,6\n103#1:732,6\n131#1:738,6\n*E\n"})
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final m0 f17689a = new m0(null, 0, false, 0.0f, new a(), 0.0f, false, kotlinx.coroutines.t0.a(kotlin.coroutines.h.f312451a), androidx.compose.ui.unit.f.b(1.0f, 0.0f, 2, null), androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null), CollectionsKt.emptyList(), 0, 0, 0, false, q3.Vertical, 0, 0, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f17690b = 100;

    public static final class a implements androidx.compose.ui.layout.b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f17692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<androidx.compose.ui.layout.a, Integer> f17693c = MapsKt.emptyMap();

        a() {
        }

        public static /* synthetic */ void a() {
        }

        @Override // androidx.compose.ui.layout.b1
        public int getHeight() {
            return this.f17692b;
        }

        @Override // androidx.compose.ui.layout.b1
        public int getWidth() {
            return this.f17691a;
        }

        @Override // androidx.compose.ui.layout.b1
        public Map<androidx.compose.ui.layout.a, Integer> x() {
            return this.f17693c;
        }

        @Override // androidx.compose.ui.layout.b1
        public void y() {
        }
    }

    @androidx.compose.runtime.o
    @b2
    @NotNull
    public static final j1 e(final int i10, final int i11, @Nullable final t0 t0Var, @Nullable androidx.compose.runtime.c0 c0Var, int i12, int i13) {
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
                objI0 = u0.b(0, 1, null);
                c0Var.Y(objI0);
            }
            t0Var = (t0) objI0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1287535208, i12, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:101)");
        }
        Object[] objArr = {t0Var};
        androidx.compose.runtime.saveable.c0<j1, ?> c0VarF = j1.f17169y.f(t0Var);
        boolean z11 = ((((i12 & 14) ^ 6) > 4 && c0Var.K(i10)) || (i12 & 6) == 4) | ((((i12 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.K(i11)) || (i12 & 48) == 32);
        if ((((i12 & 896) ^ a5.S0) <= 256 || !c0Var.k0(t0Var)) && (i12 & a5.S0) != 256) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function0() { // from class: androidx.compose.foundation.lazy.m1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o1.i(i10, i11, t0Var);
                }
            };
            c0Var.Y(objI1);
        }
        j1 j1Var = (j1) androidx.compose.runtime.saveable.i.j(objArr, c0VarF, (Function0) objI1, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j1Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final j1 f(final int i10, final int i11, @Nullable androidx.compose.runtime.c0 c0Var, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1470655220, i12, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:77)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<j1, ?> c0VarE = j1.f17169y.e();
        boolean z10 = true;
        boolean z11 = (((i12 & 14) ^ 6) > 4 && c0Var.K(i10)) || (i12 & 6) == 4;
        if ((((i12 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0Var.K(i11)) && (i12 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objI0 = c0Var.i0();
        if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.compose.foundation.lazy.l1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o1.h(i10, i11);
                }
            };
            c0Var.Y(objI0);
        }
        j1 j1Var = (j1) androidx.compose.runtime.saveable.i.j(objArr, c0VarE, (Function0) objI0, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j1Var;
    }

    @androidx.compose.runtime.o
    @b2
    @NotNull
    public static final j1 g(@NotNull final androidx.compose.foundation.lazy.layout.w wVar, final int i10, final int i11, @Nullable androidx.compose.runtime.c0 c0Var, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1588550476, i12, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:129)");
        }
        Object[] objArr = {wVar};
        androidx.compose.runtime.saveable.c0<j1, ?> c0VarG = j1.f17169y.g(wVar);
        boolean z10 = true;
        boolean z11 = ((((i12 & 14) ^ 6) > 4 && c0Var.D(wVar)) || (i12 & 6) == 4) | ((((i12 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.K(i10)) || (i12 & 48) == 32);
        if ((((i12 & 896) ^ a5.S0) <= 256 || !c0Var.K(i11)) && (i12 & a5.S0) != 256) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objI0 = c0Var.i0();
        if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.compose.foundation.lazy.n1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return o1.j(wVar, i10, i11);
                }
            };
            c0Var.Y(objI0);
        }
        j1 j1Var = (j1) androidx.compose.runtime.saveable.i.j(objArr, c0VarG, (Function0) objI0, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j1 h(int i10, int i11) {
        return new j1(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j1 i(int i10, int i11, t0 t0Var) {
        return new j1(i10, i11, t0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j1 j(androidx.compose.foundation.lazy.layout.w wVar, int i10, int i11) {
        return new j1(wVar, i10, i11);
    }
}
