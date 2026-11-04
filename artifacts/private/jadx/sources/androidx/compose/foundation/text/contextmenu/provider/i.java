package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.x;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.m4;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n4;
import androidx.compose.runtime.o;
import androidx.compose.runtime.p;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.q1;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBasicTextContextMenuProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextContextMenuProvider.kt\nandroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,160:1\n1282#2,6:161\n1282#2,6:167\n1282#2,6:173\n85#3:179\n117#3,2:180\n66#4,5:182\n*S KotlinDebug\n*F\n+ 1 BasicTextContextMenuProvider.kt\nandroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProviderKt\n*L\n82#1:161,6\n108#1:167,6\n109#1:173,6\n82#1:179\n82#1:180,2\n109#1:182,5\n*E\n"})
public final class i {

    @SourceDebugExtension({"SMAP\nBasicTextContextMenuProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextContextMenuProvider.kt\nandroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProviderKt$ProvideBasicTextContextMenu$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,160:1\n1282#2,6:161\n1282#2,6:204\n70#3:167\n67#3,9:168\n77#3:213\n80#4,6:177\n87#4,3:192\n90#4,2:201\n94#4:212\n391#5,9:183\n400#5:203\n401#5,2:210\n4360#6,6:195\n85#7,5:214\n*S KotlinDebug\n*F\n+ 1 BasicTextContextMenuProvider.kt\nandroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProviderKt$ProvideBasicTextContextMenu$2\n*L\n90#1:161,6\n93#1:204,6\n88#1:167\n88#1:168,9\n88#1:213\n88#1:177,6\n88#1:192,3\n88#1:201,2\n88#1:212\n88#1:183,9\n88#1:203\n88#1:210,2\n88#1:195,6\n93#1:214,5\n*E\n"})
    static final class a implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0 f19040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n3<g0> f19041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<c0, Integer, Unit> f19042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f19043d;

        /* JADX WARN: Multi-variable type inference failed */
        a(a0 a0Var, n3<g0> n3Var, Function2<? super c0, ? super Integer, Unit> function2, c cVar) {
            this.f19040a = a0Var;
            this.f19041b = n3Var;
            this.f19042c = function2;
            this.f19043d = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit i(n3 n3Var, g0 g0Var) {
            i.h(n3Var, g0Var);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g0 k(n3 n3Var) {
            g0 g0VarG = i.g(n3Var);
            if (g0VarG != null) {
                return g0VarG;
            }
            androidx.compose.foundation.internal.e.j("Required value was null.");
            throw new kotlin.a0();
        }

        @o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void f(c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(274270255, i10, -1, "androidx.compose.foundation.text.contextmenu.provider.ProvideBasicTextContextMenu.<anonymous> (BasicTextContextMenuProvider.kt:87)");
            }
            a0 a0Var = this.f19040a;
            final n3<g0> n3Var = this.f19041b;
            Object objI0 = c0Var.i0();
            c0.a aVar = c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.text.contextmenu.provider.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i.a.i(n3Var, (g0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            a0 a0VarA = q1.a(a0Var, (Function1) objI0);
            Function2<c0, Integer, Unit> function2 = this.f19042c;
            c cVar = this.f19043d;
            final n3<g0> n3Var2 = this.f19041b;
            a1 a1VarK = x.k(androidx.compose.ui.e.f37317a.C(), true);
            int iHashCode = Long.hashCode(v.l(c0Var, 0));
            b1 b1VarK = c0Var.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarA);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            d0 d0Var = d0.f15956a;
            function2.invoke(c0Var, 0);
            Object objI1 = c0Var.i0();
            if (objI1 == aVar.a()) {
                objI1 = new Function0() { // from class: androidx.compose.foundation.text.contextmenu.provider.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i.a.k(n3Var2);
                    }
                };
                c0Var.Y(objI1);
            }
            cVar.d((Function0) objI1, c0Var, 6);
            c0Var.o();
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            f(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BasicTextContextMenuProvider.kt\nandroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProviderKt\n*L\n1#1,69:1\n109#2:70\n*E\n"})
    public static final class b implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f19044a;

        public b(c cVar) {
            this.f19044a = cVar;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f19044a.h();
        }
    }

    @o
    @p(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable]]")
    public static final void d(@NotNull m4<k> m4Var, @NotNull pj.p<? super b0.g, ? super j, ? super Function0<? extends g0>, ? super c0, ? super Integer, Unit> pVar, @NotNull Function2<? super c0, ? super Integer, Unit> function2, @Nullable c0 c0Var, final int i10) {
        int i11;
        final m4<k> m4Var2;
        final pj.p<? super b0.g, ? super j, ? super Function0<? extends g0>, ? super c0, ? super Integer, Unit> pVar2;
        final Function2<? super c0, ? super Integer, Unit> function3;
        c0 c0VarR = c0Var.R(2072681886);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(m4Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(pVar) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (m0.l0()) {
                int i12 = 7 & (-1);
                m0.A0(2072681886, i11, -1, "androidx.compose.foundation.text.contextmenu.provider.ProvideBasicTextContextMenu (BasicTextContextMenuProvider.kt:64)");
            }
            int i13 = i11 << 3;
            m4Var2 = m4Var;
            pVar2 = pVar;
            function3 = function2;
            e(a0.E, m4Var2, pVar2, function3, c0VarR, (i13 & com.planner5d.library.engine.input.f.b.B) | 6 | (i13 & 896) | (i13 & 7168));
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            m4Var2 = m4Var;
            pVar2 = pVar;
            function3 = function2;
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.contextmenu.provider.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.f(m4Var2, pVar2, function3, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @o
    @p(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable]]")
    public static final void e(@NotNull final a0 a0Var, @NotNull final m4<k> m4Var, @NotNull final pj.p<? super b0.g, ? super j, ? super Function0<? extends g0>, ? super c0, ? super Integer, Unit> pVar, @NotNull final Function2<? super c0, ? super Integer, Unit> function2, @Nullable c0 c0Var, final int i10) {
        int i11;
        c0 c0VarR = c0Var.R(-714464401);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(m4Var) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.k0(pVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.k0(function2) ? 2048 : 1024;
        }
        if (c0VarR.h((i11 & 1171) != 1170, i11 & 1)) {
            if (m0.l0()) {
                m0.A0(-714464401, i11, -1, "androidx.compose.foundation.text.contextmenu.provider.ProvideBasicTextContextMenu (BasicTextContextMenuProvider.kt:80)");
            }
            Object objI0 = c0VarR.i0();
            if (objI0 == c0.f35327a.a()) {
                objI0 = w6.k(null, w6.o());
                c0VarR.Y(objI0);
            }
            c cVarL = l(pVar, c0VarR, (i11 >> 6) & 14);
            androidx.compose.runtime.a1.e(m4Var.f(cVarL), w.e(274270255, true, new a(a0Var, (n3) objI0, function2, cVarL), c0VarR, 54), c0VarR, n4.f36267i | 48);
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.contextmenu.provider.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.i(a0Var, m4Var, pVar, function2, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(m4 m4Var, pj.p pVar, Function2 function2, int i10, c0 c0Var, int i11) {
        d(m4Var, pVar, function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 g(n3<g0> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(n3<g0> n3Var, g0 g0Var) {
        n3Var.setValue(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(a0 a0Var, m4 m4Var, pj.p pVar, Function2 function2, int i10, c0 c0Var, int i11) {
        e(a0Var, m4Var, pVar, function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @o
    @NotNull
    public static final c l(@NotNull pj.p<? super b0.g, ? super j, ? super Function0<? extends g0>, ? super c0, ? super Integer, Unit> pVar, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            int i11 = 1 ^ (-1);
            m0.A0(100861460, i10, -1, "androidx.compose.foundation.text.contextmenu.provider.basicTextContextMenuProvider (BasicTextContextMenuProvider.kt:106)");
        }
        int i12 = 4 ^ 0;
        boolean z10 = (((i10 & 14) ^ 6) > 4 && c0Var.D(pVar)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == c0.f35327a.a()) {
            objI0 = new c(pVar);
            c0Var.Y(objI0);
        }
        final c cVar = (c) objI0;
        boolean zD = c0Var.D(cVar);
        Object objI1 = c0Var.i0();
        if (zD || objI1 == c0.f35327a.a()) {
            objI1 = new Function1() { // from class: androidx.compose.foundation.text.contextmenu.provider.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i.m(cVar, (v1) obj);
                }
            };
            c0Var.Y(objI1);
        }
        b2.d(cVar, (Function1) objI1, c0Var, 0);
        if (m0.l0()) {
            m0.z0();
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 m(c cVar, v1 v1Var) {
        return new b(cVar);
    }
}
