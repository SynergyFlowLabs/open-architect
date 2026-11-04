package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.runtime.n3;
import androidx.compose.runtime.n4;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPlatformDefaultTextContextMenuProviders.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformDefaultTextContextMenuProviders.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/PlatformDefaultTextContextMenuProviders_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,86:1\n75#2:87\n75#2:88\n70#3:89\n67#3,9:90\n77#3:129\n80#4,6:99\n87#4,3:114\n90#4,2:123\n94#4:128\n391#5,9:105\n400#5,3:125\n4360#6,6:117\n1282#7,6:130\n1282#7,6:136\n85#8:142\n117#8,2:143\n85#9,5:145\n*S KotlinDebug\n*F\n+ 1 PlatformDefaultTextContextMenuProviders.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/PlatformDefaultTextContextMenuProviders_androidKt\n*L\n39#1:87\n40#1:88\n44#1:89\n44#1:90,9\n44#1:129\n44#1:99,6\n44#1:114,3\n44#1:123,2\n44#1:128\n44#1:105,9\n44#1:125,3\n44#1:117,6\n60#1:130,6\n66#1:136,6\n60#1:142\n60#1:143,2\n67#1:145,5\n*E\n"})
public final class k0 {

    @SourceDebugExtension({"SMAP\nPlatformDefaultTextContextMenuProviders.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformDefaultTextContextMenuProviders.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/PlatformDefaultTextContextMenuProviders_androidKt$ProvideBothDefaultProviders$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,86:1\n1282#2,6:87\n70#3:93\n67#3,9:94\n77#3:133\n80#4,6:103\n87#4,3:118\n90#4,2:127\n94#4:132\n391#5,9:109\n400#5,3:129\n4360#6,6:121\n*S KotlinDebug\n*F\n+ 1 PlatformDefaultTextContextMenuProviders.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/PlatformDefaultTextContextMenuProviders_androidKt$ProvideBothDefaultProviders$1\n*L\n79#1:87,6\n77#1:93\n77#1:94,9\n77#1:133\n77#1:103,6\n77#1:118,3\n77#1:127,2\n77#1:132\n77#1:109,9\n77#1:129,3\n77#1:121,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f18898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n3<androidx.compose.ui.layout.g0> f18899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f18900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.contextmenu.provider.c f18901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<androidx.compose.ui.layout.g0> f18902e;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.a0 a0Var, n3<androidx.compose.ui.layout.g0> n3Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.foundation.text.contextmenu.provider.c cVar, Function0<? extends androidx.compose.ui.layout.g0> function0) {
            this.f18898a = a0Var;
            this.f18899b = n3Var;
            this.f18900c = function2;
            this.f18901d = cVar;
            this.f18902e = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(n3 n3Var, androidx.compose.ui.layout.g0 g0Var) {
            k0.f(n3Var, g0Var);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1070596993, i10, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideBothDefaultProviders.<anonymous> (PlatformDefaultTextContextMenuProviders.android.kt:76)");
            }
            androidx.compose.ui.a0 a0Var = this.f18898a;
            final n3<androidx.compose.ui.layout.g0> n3Var = this.f18899b;
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.text.contextmenu.internal.j0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k0.a.f(n3Var, (androidx.compose.ui.layout.g0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarA = q1.a(a0Var, (Function1) objI0);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f18900c;
            androidx.compose.foundation.text.contextmenu.provider.c cVar = this.f18901d;
            Function0<androidx.compose.ui.layout.g0> function0 = this.f18902e;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarA);
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
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0Var, 0);
            cVar.d(function0, c0Var, 6);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void d(final androidx.compose.ui.a0 a0Var, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(790527681);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(790527681, i11, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideBothDefaultProviders (PlatformDefaultTextContextMenuProviders.android.kt:58)");
            }
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = w6.k(null, w6.o());
                c0VarR.Y(objI0);
            }
            final n3 n3Var = (n3) objI0;
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.g0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k0.g(n3Var);
                    }
                };
                c0VarR.Y(objI1);
            }
            Function0 function0 = (Function0) objI1;
            androidx.compose.foundation.text.contextmenu.provider.c cVarC = d0.C(c0VarR, 0);
            androidx.compose.runtime.a1.f(new n4[]{androidx.compose.foundation.text.contextmenu.provider.n.f().f(r.m(function0, null, c0VarR, 6, 2)), androidx.compose.foundation.text.contextmenu.provider.n.e().f(cVarC)}, androidx.compose.runtime.internal.w.e(1070596993, true, new a(a0Var, n3Var, function2, cVarC, function0), c0VarR, 54), c0VarR, n4.f36267i | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k0.h(a0Var, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final androidx.compose.ui.layout.g0 e(n3<androidx.compose.ui.layout.g0> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(n3<androidx.compose.ui.layout.g0> n3Var, androidx.compose.ui.layout.g0 g0Var) {
        n3Var.setValue(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.g0 g(n3 n3Var) {
        androidx.compose.ui.layout.g0 g0VarE = e(n3Var);
        if (g0VarE != null) {
            return g0VarE;
        }
        androidx.compose.foundation.internal.e.j("Required value was null.");
        throw new kotlin.a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(androidx.compose.ui.a0 a0Var, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        d(a0Var, function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void i(@Nullable final androidx.compose.ui.a0 a0Var, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(155925518);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if (c0VarR.h((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(155925518, i12, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultPlatformTextContextMenuProviders (PlatformDefaultTextContextMenuProviders.android.kt:37)");
            }
            boolean z10 = c0VarR.W(androidx.compose.foundation.text.contextmenu.provider.n.e()) != null;
            boolean z11 = c0VarR.W(androidx.compose.foundation.text.contextmenu.provider.n.f()) != null;
            if (z10 && z11) {
                c0VarR.E(-1977156178);
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK, aVar.e());
                y7.n(c0VarD, b1VarK, aVar.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                function2.invoke(c0VarR, Integer.valueOf((i12 >> 3) & 14));
                c0VarR.o();
                c0VarR.A();
            } else if (z10) {
                c0VarR.E(-1976965962);
                r.f(a0Var, function2, c0VarR, i12 & okhttp3.internal.ws.g.f334652s, 0);
                c0VarR.A();
            } else if (z11) {
                c0VarR.E(-1976815178);
                d0.v(a0Var, function2, c0VarR, i12 & okhttp3.internal.ws.g.f334652s);
                c0VarR.A();
            } else {
                c0VarR.E(-1976684761);
                d(a0Var, function2, c0VarR, i12 & okhttp3.internal.ws.g.f334652s);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k0.j(a0Var, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(androidx.compose.ui.a0 a0Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        i(a0Var, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
