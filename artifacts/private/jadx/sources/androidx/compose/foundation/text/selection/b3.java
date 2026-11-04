package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.view.KeyEvent;
import androidx.compose.foundation.text.h5;
import androidx.compose.runtime.d7;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt\n+ 2 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n*L\n1#1,126:1\n202#2,7:127\n*S KotlinDebug\n*F\n+ 1 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt\n*L\n80#1:127,7\n*E\n"})
public final class b3 {

    @SourceDebugExtension({"SMAP\nSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,126:1\n75#2:127\n1282#3,6:128\n1282#3,6:134\n1282#3,6:140\n85#4:146\n117#4,2:147\n30#5:149\n80#6:150\n*S KotlinDebug\n*F\n+ 1 SelectionManager.android.kt\nandroidx/compose/foundation/text/selection/SelectionManager_androidKt$selectionMagnifier$1\n*L\n55#1:127\n56#1:128,6\n58#1:134,6\n59#1:140,6\n56#1:146\n56#1:147,2\n65#1:149\n65#1:150\n*E\n"})
    static final class a implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m2 f21009a;

        a(m2 m2Var) {
            this.f21009a = m2Var;
        }

        private static final long m(androidx.compose.runtime.n3<androidx.compose.ui.unit.u> n3Var) {
            return n3Var.getValue().q();
        }

        private static final void n(androidx.compose.runtime.n3<androidx.compose.ui.unit.u> n3Var, long j10) {
            n3Var.setValue(androidx.compose.ui.unit.u.b(j10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n0.g s(m2 m2Var, androidx.compose.runtime.n3 n3Var) {
            return n0.g.d(n2.c(m2Var, m(n3Var)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.a0 v(final androidx.compose.ui.unit.d dVar, final androidx.compose.runtime.n3 n3Var, final Function0 function0) {
            return androidx.compose.foundation.g3.h(androidx.compose.ui.a0.E, new Function1() { // from class: androidx.compose.foundation.text.selection.x2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b3.a.x(function0, (androidx.compose.ui.unit.d) obj);
                }
            }, null, new Function1() { // from class: androidx.compose.foundation.text.selection.y2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b3.a.y(dVar, n3Var, (androidx.compose.ui.unit.l) obj);
                }
            }, 0.0f, true, 0L, 0.0f, 0.0f, false, androidx.compose.foundation.d4.f14136a.a(), 490, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n0.g x(Function0 function0, androidx.compose.ui.unit.d dVar) {
            return (n0.g) function0.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit y(androidx.compose.ui.unit.d dVar, androidx.compose.runtime.n3 n3Var, androidx.compose.ui.unit.l lVar) {
            n(n3Var, androidx.compose.ui.unit.u.e((((long) dVar.g6(androidx.compose.ui.unit.l.p(lVar.x()))) << 32) | (((long) dVar.g6(androidx.compose.ui.unit.l.m(lVar.x()))) & com.rabbitmq.client.k0.f265952a)));
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return k(a0Var, c0Var, num.intValue());
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 k(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-1914520728);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1914520728, i10, -1, "androidx.compose.foundation.text.selection.selectionMagnifier.<anonymous> (SelectionManager.android.kt:54)");
            }
            final androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
            Object objI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = d7.g(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.f42720b.a()), null, 2, null);
                c0Var.Y(objI0);
            }
            final androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI0;
            boolean zK0 = c0Var.k0(this.f21009a);
            final m2 m2Var = this.f21009a;
            Object objI1 = c0Var.i0();
            if (zK0 || objI1 == aVar.a()) {
                objI1 = new Function0() { // from class: androidx.compose.foundation.text.selection.z2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b3.a.s(m2Var, n3Var);
                    }
                };
                c0Var.Y(objI1);
            }
            Function0 function0 = (Function0) objI1;
            boolean zD = c0Var.D(dVar);
            Object objI2 = c0Var.i0();
            if (zD || objI2 == aVar.a()) {
                objI2 = new Function1() { // from class: androidx.compose.foundation.text.selection.a3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b3.a.v(dVar, n3Var, (Function0) obj);
                    }
                };
                c0Var.Y(objI2);
            }
            androidx.compose.ui.a0 a0VarG = v1.g(a0Var, function0, (Function1) objI2);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarG;
        }
    }

    @NotNull
    public static final androidx.compose.ui.a0 j(@NotNull androidx.compose.ui.a0 a0Var, @NotNull final m2 m2Var) {
        return androidx.compose.foundation.text.contextmenu.modifier.k.a(a0Var, new Function2() { // from class: androidx.compose.foundation.text.selection.s2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return b3.k(m2Var, (a0.a) obj, (Context) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(final m2 m2Var, a0.a aVar, final Context context) {
        Pair<androidx.compose.ui.text.f, androidx.compose.ui.text.w3> pairT = m2Var.T();
        d0.f(aVar, context, false, pairT != null ? pairT.getFirst() : null, pairT != null ? pairT.getSecond() : null, m2Var.i0(), new Function1() { // from class: androidx.compose.foundation.text.selection.r2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b3.l(m2Var, context, (a0.a) obj);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(final m2 m2Var, Context context, a0.a aVar) {
        aVar.d();
        q(aVar, context, h5.f19339e, m2Var.A0(), null, new Function0() { // from class: androidx.compose.foundation.text.selection.u2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b3.m(m2Var);
            }
        }, 8, null);
        p(aVar, context, h5.f19341g, !m2Var.y0(), new Function0() { // from class: androidx.compose.foundation.text.selection.v2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(b3.n(m2Var));
            }
        }, new Function0() { // from class: androidx.compose.foundation.text.selection.w2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b3.o(m2Var);
            }
        });
        aVar.d();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(m2 m2Var) {
        m2Var.M();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(m2 m2Var) {
        return (m2Var.q0() && m2Var.z0()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(m2 m2Var) {
        m2Var.H0();
        return Unit.f312394a;
    }

    private static final void p(a0.a aVar, Context context, h5 h5Var, boolean z10, final Function0<Boolean> function0, final Function0<Unit> function1) {
        androidx.compose.foundation.text.l2.y(aVar, context.getResources(), h5Var, z10, new Function1() { // from class: androidx.compose.foundation.text.selection.t2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b3.r(function1, function0, (b0.g) obj);
            }
        });
    }

    static /* synthetic */ void q(a0.a aVar, Context context, h5 h5Var, boolean z10, Function0 function0, Function0 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function0 = null;
        }
        p(aVar, context, h5Var, z10, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function0 function0, Function0 function1, b0.g gVar) {
        function0.invoke();
        if (function1 != null ? ((Boolean) function1.invoke()).booleanValue() : true) {
            gVar.close();
        }
        return Unit.f312394a;
    }

    @NotNull
    public static final Function1<androidx.compose.foundation.contextmenu.p, Unit> s(@NotNull final m2 m2Var, @NotNull final androidx.compose.foundation.contextmenu.r rVar) {
        return new Function1() { // from class: androidx.compose.foundation.text.selection.o2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b3.t(m2Var, rVar, (androidx.compose.foundation.contextmenu.p) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(final m2 m2Var, androidx.compose.foundation.contextmenu.r rVar, androidx.compose.foundation.contextmenu.p pVar) {
        w(pVar, rVar, h5.f19339e, m2Var.A0(), new Function0() { // from class: androidx.compose.foundation.text.selection.p2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b3.u(m2Var);
            }
        });
        Unit unit = Unit.f312394a;
        w(pVar, rVar, h5.f19341g, !m2Var.y0(), new Function0() { // from class: androidx.compose.foundation.text.selection.q2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b3.v(m2Var);
            }
        });
        CollectionsKt.listOf((Object[]) new Unit[]{unit, unit});
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(m2 m2Var) {
        m2Var.M();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(m2 m2Var) {
        m2Var.H0();
        return Unit.f312394a;
    }

    private static final void w(androidx.compose.foundation.contextmenu.p pVar, androidx.compose.foundation.contextmenu.r rVar, h5 h5Var, boolean z10, Function0<Unit> function0) {
        if (z10) {
            androidx.compose.foundation.contextmenu.p.f(pVar, new androidx.compose.foundation.text.l2.e(h5Var), null, false, null, new androidx.compose.foundation.text.l2.f(function0, rVar), 14, null);
        }
    }

    public static final boolean x(@NotNull KeyEvent keyEvent) {
        return androidx.compose.foundation.text.w3.a().a(keyEvent) == androidx.compose.foundation.text.s3.COPY;
    }

    @NotNull
    public static final androidx.compose.ui.a0 y(@NotNull androidx.compose.ui.a0 a0Var, @NotNull m2 m2Var) {
        return !androidx.compose.foundation.g3.d(0, 1, null) ? a0Var : androidx.compose.ui.m.k(a0Var, null, new a(m2Var), 1, null);
    }
}
