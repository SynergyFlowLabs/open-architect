package androidx.compose.animation;

import androidx.compose.animation.core.l3;
import androidx.compose.animation.core.q2;
import androidx.compose.animation.core.w3;
import androidx.compose.animation.core.z3;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,119:1\n1282#2,6:120\n1282#2,3:133\n1285#2,3:143\n1282#2,6:157\n1282#2,6:166\n1839#3,7:126\n1846#3,11:146\n1857#3,3:163\n604#4,7:136\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n*L\n69#1:120,6\n71#1:133,3\n71#1:143,3\n71#1:157,6\n99#1:166,6\n71#1:126,7\n71#1:146,11\n71#1:163,3\n71#1:136,7\n*E\n"})
public final class s1 {

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class a<S> implements Function0<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3 f13717a;

        public a(l3 l3Var) {
            this.f13717a = l3Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final S invoke() {
            return (S) this.f13717a.y();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class b<S> implements Function0<l3.b<S>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l3 f13718a;

        public b(l3 l3Var) {
            this.f13718a = l3Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l3.b<S> invoke() {
            return this.f13718a.w();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class c<S> extends kotlin.jvm.internal.l0 implements pj.n<l3.b<S>, androidx.compose.runtime.c0, Integer, q2<androidx.compose.ui.graphics.q0>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f13719a = new c();

        public c() {
            super(3);
        }

        @androidx.compose.runtime.o
        public final q2<androidx.compose.ui.graphics.q0> c(l3.b<S> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-781456724);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-781456724, i10, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:62)");
            }
            q2<androidx.compose.ui.graphics.q0> q2VarR = androidx.compose.animation.core.p.r(0.0f, 0.0f, null, 7, null);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return q2VarR;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ q2<androidx.compose.ui.graphics.q0> invoke(Object obj, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c((l3.b) obj, c0Var, num.intValue());
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0][0]]")
    @NotNull
    public static final <S> n7<androidx.compose.ui.graphics.q0> a(@NotNull l3<S> l3Var, @Nullable pj.n<? super l3.b<S>, ? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.animation.core.y0<androidx.compose.ui.graphics.q0>> nVar, @Nullable String str, @NotNull pj.n<? super S, ? super androidx.compose.runtime.c0, ? super Integer, androidx.compose.ui.graphics.q0> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        Object objP;
        if ((i11 & 1) != 0) {
            nVar = c.f13719a;
        }
        if ((i11 & 2) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        androidx.compose.ui.graphics.colorspace.c cVarE = androidx.compose.ui.graphics.q0.E(nVar2.invoke(l3Var.y(), c0Var, Integer.valueOf((i10 >> 6) & com.planner5d.library.engine.input.f.b.B)).M());
        boolean zD = c0Var.D(cVarE);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = (z3) v.a(androidx.compose.ui.graphics.q0.f38131b).invoke(cVarE);
            c0Var.Y(objI0);
        }
        z3 z3Var = (z3) objI0;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        if (l3Var.E()) {
            c0Var.E(1666853325);
            c0Var.A();
            objP = l3Var.p();
        } else {
            c0Var.E(1666599280);
            boolean z10 = (((i14 & 14) ^ 6) > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
            objP = c0Var.i0();
            if (z10 || objP == androidx.compose.runtime.c0.f35327a.a()) {
                androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
                androidx.compose.runtime.snapshots.m mVarG = aVar.g();
                Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
                androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
                try {
                    S sP = l3Var.p();
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    c0Var.Y(sP);
                    objP = sP;
                } catch (Throwable th2) {
                    kotlin.jvm.internal.h0.d(1);
                    aVar.x(mVarG, mVarM, function1L);
                    kotlin.jvm.internal.h0.c(1);
                    throw th2;
                }
            }
            c0Var.A();
        }
        int i15 = (i14 >> 9) & com.planner5d.library.engine.input.f.b.B;
        androidx.compose.ui.graphics.q0 q0VarInvoke = nVar2.invoke(objP, c0Var, Integer.valueOf(i15));
        int i16 = i14 & 14;
        int i17 = i16 ^ 6;
        boolean z11 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI1 = c0Var.i0();
        if (z11 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = w6.e(new a(l3Var));
            c0Var.Y(objI1);
        }
        androidx.compose.ui.graphics.q0 q0VarInvoke2 = nVar2.invoke((Object) ((n7) objI1).getValue(), c0Var, Integer.valueOf(i15));
        boolean z12 = (i17 > 4 && c0Var.D(l3Var)) || (i14 & 6) == 4;
        Object objI2 = c0Var.i0();
        if (z12 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
            objI2 = w6.e(new b(l3Var));
            c0Var.Y(objI2);
        }
        return w3.D(l3Var, q0VarInvoke, q0VarInvoke2, nVar.invoke((Object) ((n7) objI2).getValue(), c0Var, Integer.valueOf((i14 >> 3) & com.planner5d.library.engine.input.f.b.B)), z3Var, str2, c0Var, i16 | ((i14 << 6) & 458752));
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n7<androidx.compose.ui.graphics.q0> b(@NotNull androidx.compose.animation.core.i1 i1Var, long j10, long j11, @NotNull androidx.compose.animation.core.g1<androidx.compose.ui.graphics.q0> g1Var, @Nullable String str, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        androidx.compose.runtime.c0 c0Var2;
        String str2 = (i11 & 8) != 0 ? "ColorAnimation" : str;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1901963533, i10, -1, "androidx.compose.animation.animateColor (Transition.kt:97)");
        }
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = (z3) v.a(androidx.compose.ui.graphics.q0.f38131b).invoke(androidx.compose.ui.graphics.q0.E(j11));
            c0Var2 = c0Var;
            c0Var2.Y(objI0);
        } else {
            c0Var2 = c0Var;
        }
        int i12 = i10 << 3;
        n7<androidx.compose.ui.graphics.q0> n7VarF = androidx.compose.animation.core.n1.f(i1Var, androidx.compose.ui.graphics.q0.n(j10), androidx.compose.ui.graphics.q0.n(j11), (z3) objI0, g1Var, str2, c0Var2, androidx.compose.animation.core.i1.f13005f | (i10 & 14) | (i10 & com.planner5d.library.engine.input.f.b.B) | (i10 & 896) | (androidx.compose.animation.core.g1.f12967d << 12) | (57344 & i12) | (i12 & 458752), 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarF;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "animateColor APIs now have a new label parameter added.")
    public static final /* synthetic */ n7 c(androidx.compose.animation.core.i1 i1Var, long j10, long j11, androidx.compose.animation.core.g1 g1Var, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1400583834, i10, -1, "androidx.compose.animation.animateColor (Transition.kt:112)");
        }
        n7<androidx.compose.ui.graphics.q0> n7VarB = b(i1Var, j10, j11, g1Var, "ColorAnimation", c0Var, androidx.compose.animation.core.i1.f13005f | 24576 | (i10 & 14) | (i10 & com.planner5d.library.engine.input.f.b.B) | (i10 & 896) | (androidx.compose.animation.core.g1.f12967d << 9) | (i10 & 7168), 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarB;
    }
}
