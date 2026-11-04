package androidx.compose.animation.core;

import androidx.compose.animation.core.i1.a;
import androidx.compose.runtime.n7;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,345:1\n1282#2,6:346\n1282#2,6:352\n1282#2,6:358\n1282#2,6:364\n66#3,5:370\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n*L\n46#1:346,6\n247#1:352,6\n251#1:358,6\n264#1:364,6\n266#1:370,5\n*E\n"})
public final class n1 {

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n*L\n1#1,69:1\n266#2:70\n*E\n"})
    public static final class a implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1 f13213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1.a f13214b;

        public a(i1 i1Var, i1.a aVar) {
            this.f13213a = i1Var;
            this.f13214b = aVar;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f13213a.m(this.f13214b);
        }
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "animateFloat APIs now have a new label parameter added.")
    public static final /* synthetic */ n7 c(i1 i1Var, float f10, float f11, g1 g1Var, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(469472752, i10, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:336)");
        }
        n7<Float> n7VarD = d(i1Var, f10, f11, g1Var, "FloatAnimation", c0Var, (i10 & 14) | 24576 | (i10 & com.planner5d.library.engine.input.f.b.B) | (i10 & 896) | (i10 & 7168), 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarD;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n7<Float> d(@NotNull i1 i1Var, float f10, float f11, @NotNull g1<Float> g1Var, @Nullable String str, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-644770905, i10, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:296)");
        }
        int i12 = i10 << 3;
        n7<Float> n7VarF = f(i1Var, Float.valueOf(f10), Float.valueOf(f11), t4.P(kotlin.jvm.internal.z.f312833a), g1Var, str2, c0Var, (i10 & androidx.media3.exoplayer.analytics.b.f62802b0) | (57344 & i12) | (i12 & 458752), 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarF;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "animateValue APIs now have a new label parameter added.")
    public static final /* synthetic */ n7 e(i1 i1Var, Object obj, Object obj2, z3 z3Var, g1 g1Var, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1695411770, i10, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:317)");
        }
        int i11 = (i10 >> 3) & 8;
        n7 n7VarF = f(i1Var, obj, obj2, z3Var, g1Var, "ValueAnimation", c0Var, (i10 & 14) | androidx.profileinstaller.n.c.f73814m | (i11 << 3) | (i10 & com.planner5d.library.engine.input.f.b.B) | (i11 << 6) | (i10 & 896) | (i10 & 7168) | (i10 & 57344), 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarF;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <T, V extends w> n7<T> f(@NotNull i1 i1Var, T t10, T t11, @NotNull z3<T, V> z3Var, @NotNull g1<T> g1Var, @Nullable String str, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        final i1 i1Var2;
        final Object obj;
        final Object obj2;
        final g1<T> g1Var2;
        if ((i11 & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1062847727, i10, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:245)");
        }
        Object objI0 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            i1Var2 = i1Var;
            obj = t10;
            obj2 = t11;
            g1Var2 = g1Var;
            i1.a aVar2 = i1Var2.new a(obj, obj2, z3Var, g1Var2, str2);
            c0Var.Y(aVar2);
            objI0 = aVar2;
        } else {
            i1Var2 = i1Var;
            obj = t10;
            obj2 = t11;
            g1Var2 = g1Var;
        }
        final i1.a aVar3 = (i1.a) objI0;
        boolean z10 = true;
        boolean z11 = ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.k0(obj)) || (i10 & 48) == 32) | ((((i10 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.k0(obj2)) || (i10 & androidx.media3.exoplayer.a5.S0) == 256);
        if ((((57344 & i10) ^ 24576) <= 16384 || !c0Var.k0(g1Var2)) && (i10 & 24576) != 16384) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == aVar.a()) {
            objI1 = new Function0() { // from class: androidx.compose.animation.core.l1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n1.g(obj, aVar3, obj2, g1Var2);
                }
            };
            c0Var.Y(objI1);
        }
        androidx.compose.runtime.b2.m((Function0) objI1, c0Var, 0);
        boolean zK0 = c0Var.k0(i1Var2);
        Object objI2 = c0Var.i0();
        if (zK0 || objI2 == aVar.a()) {
            objI2 = new Function1() { // from class: androidx.compose.animation.core.m1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return n1.h(i1Var2, aVar3, (androidx.compose.runtime.v1) obj3);
                }
            };
            c0Var.Y(objI2);
        }
        androidx.compose.runtime.b2.d(aVar3, (Function1) objI2, c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Object obj, i1.a aVar, Object obj2, g1 g1Var) {
        if (!Intrinsics.areEqual(obj, aVar.d()) || !Intrinsics.areEqual(obj2, aVar.h())) {
            aVar.K(obj, obj2, g1Var);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 h(i1 i1Var, i1.a aVar, androidx.compose.runtime.v1 v1Var) {
        i1Var.g(aVar);
        return new a(i1Var, aVar);
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "rememberInfiniteTransition APIs now have a new label parameter added.")
    public static final /* synthetic */ i1 i(androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-840193660, i10, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:303)");
        }
        i1 i1VarJ = j("InfiniteTransition", c0Var, 6, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return i1VarJ;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final i1 j(@Nullable String str, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1013651573, i10, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new i1(str);
            c0Var.Y(objI0);
        }
        i1 i1Var = (i1) objI0;
        i1Var.n(c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return i1Var;
    }
}
