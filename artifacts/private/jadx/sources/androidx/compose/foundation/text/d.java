package androidx.compose.foundation.text;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,107:1\n1282#2,6:108\n113#3:114\n66#4:115\n58#4:116\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n*L\n54#1:108,6\n44#1:114\n45#1:115\n45#1:116\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f19047a = 1.4142135f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f19048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f19049c;

    @SourceDebugExtension({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$CursorHandle$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,107:1\n363#2:108\n70#3:109\n68#3,8:110\n77#3:148\n80#4,6:118\n87#4,3:133\n90#4,2:142\n94#4:147\n391#5,9:124\n400#5,3:144\n4360#6,6:136\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$CursorHandle$1\n*L\n64#1:108\n65#1:109\n65#1:110,8\n65#1:148\n65#1:118,6\n65#1:133,3\n65#1:142,2\n65#1:147\n65#1:124,9\n65#1:144,3\n65#1:136,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f19050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f19051b;

        a(long j10, androidx.compose.ui.a0 a0Var) {
            this.f19050a = j10;
            this.f19051b = a0Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1653527038, i10, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:63)");
            }
            if (this.f19050a != n0.d.f332689d) {
                c0Var.E(-1244013944);
                androidx.compose.ui.a0 a0VarS = androidx.compose.foundation.layout.i6.s(this.f19051b, androidx.compose.ui.unit.l.p(this.f19050a), androidx.compose.ui.unit.l.m(this.f19050a), 0.0f, 0.0f, 12, null);
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.y(), false);
                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarS);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar.a();
                if (c0Var.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var.q();
                if (c0Var.P()) {
                    c0Var.q0(function0A);
                } else {
                    c0Var.l();
                }
                androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                d.g(null, c0Var, 0, 1);
                c0Var.o();
                c0Var.A();
            } else {
                c0Var.E(-1243644858);
                d.g(this.f19051b, c0Var, 0, 0);
                c0Var.A();
            }
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

    @SourceDebugExtension({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,107:1\n75#2:108\n1282#3,6:109\n249#4,14:115\n57#5:129\n60#6:130\n22#7:131\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n*L\n88#1:108\n90#1:109,6\n97#1:115,14\n92#1:129\n92#1:130\n92#1:131\n*E\n"})
    static final class b implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f19052a = new b();

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.draw.o i(long j10, androidx.compose.ui.draw.i iVar) {
            final float fIntBitsToFloat = Float.intBitsToFloat((int) (iVar.d() >> 32)) / 2.0f;
            final androidx.compose.ui.graphics.t1 t1VarL = androidx.compose.foundation.text.selection.g.l(iVar, fIntBitsToFloat);
            final androidx.compose.ui.graphics.r0 r0VarD = androidx.compose.ui.graphics.r0.a.d(androidx.compose.ui.graphics.r0.f38151b, j10, 0, 2, null);
            return iVar.N(new Function1() { // from class: androidx.compose.foundation.text.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d.b.k(fIntBitsToFloat, t1VarL, r0VarD, (androidx.compose.ui.graphics.drawscope.c) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(float f10, androidx.compose.ui.graphics.t1 t1Var, androidx.compose.ui.graphics.r0 r0Var, androidx.compose.ui.graphics.drawscope.c cVar) {
            cVar.E4();
            androidx.compose.ui.graphics.drawscope.d dVarZ3 = cVar.Z3();
            long jD = dVarZ3.d();
            dVarZ3.f().save();
            try {
                androidx.compose.ui.graphics.drawscope.j jVarI = dVarZ3.i();
                androidx.compose.ui.graphics.drawscope.j.j(jVarI, f10, 0.0f, 2, null);
                jVarI.h(45.0f, n0.g.f332700b.e());
                androidx.compose.ui.graphics.drawscope.f.G2(cVar, t1Var, 0L, 0.0f, null, r0Var, 0, 46, null);
                return Unit.f312394a;
            } finally {
                dVarZ3.f().B();
                dVarZ3.g(jD);
            }
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 f(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-2126899193);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2126899193, i10, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
            }
            final long jB = ((androidx.compose.foundation.text.selection.w4) c0Var.W(androidx.compose.foundation.text.selection.y4.d())).b();
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            boolean zL = c0Var.L(jB);
            Object objI0 = c0Var.i0();
            if (zL || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.text.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d.b.i(jB, (androidx.compose.ui.draw.i) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarB2 = a0Var.B2(androidx.compose.ui.draw.n.c(aVar, (Function1) objI0));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarB2;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return f(a0Var, c0Var, num.intValue());
        }
    }

    static {
        float fR = androidx.compose.ui.unit.h.r(25);
        f19048b = fR;
        f19049c = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(fR * 2.0f) / 2.4142137f);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void d(@NotNull final androidx.compose.foundation.text.selection.w wVar, @NotNull final androidx.compose.ui.a0 a0Var, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1776202187);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c0VarR.D(wVar) : c0VarR.k0(wVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= ((i11 & 4) == 0 && c0VarR.L(j10)) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0 && !c0VarR.y()) {
                c0VarR.u();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            } else if ((i11 & 4) != 0) {
                j10 = androidx.compose.ui.unit.l.f42704b.a();
                i12 &= -897;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1776202187, i12, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:51)");
            }
            int i13 = i12 & 14;
            boolean z10 = i13 == 4 || ((i12 & 8) != 0 && c0VarR.k0(wVar));
            Object objI0 = c0VarR.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.text.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d.e(wVar, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.foundation.text.selection.g.e(wVar, androidx.compose.ui.e.f37317a.y(), androidx.compose.runtime.internal.w.e(-1653527038, true, new a(j10, androidx.compose.ui.semantics.t.f(a0Var, false, (Function1) objI0, 1, null)), c0VarR, 54), c0VarR, i13 | 432);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final long j11 = j10;
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.f(wVar, a0Var, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(androidx.compose.foundation.text.selection.w wVar, androidx.compose.ui.semantics.e0 e0Var) {
        e0Var.c(androidx.compose.foundation.text.selection.m1.d(), new androidx.compose.foundation.text.selection.l1(k3.Cursor, wVar.a(), androidx.compose.foundation.text.selection.k1.Middle, true, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(androidx.compose.foundation.text.selection.w wVar, androidx.compose.ui.a0 a0Var, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        d(wVar, a0Var, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void g(final androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(694251107);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if (c0VarR.h((i12 & 3) != 2, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(694251107, i12, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            androidx.compose.foundation.layout.l6.a(j(androidx.compose.foundation.layout.i6.y(a0Var, f19049c, f19048b)), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.h(a0Var, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        g(a0Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final androidx.compose.ui.a0 j(androidx.compose.ui.a0 a0Var) {
        return androidx.compose.ui.m.k(a0Var, null, b.f19052a, 1, null);
    }

    public static final float k() {
        return f19048b;
    }

    public static final float l() {
        return f19049c;
    }
}
