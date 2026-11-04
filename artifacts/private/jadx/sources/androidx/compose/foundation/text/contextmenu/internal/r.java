package androidx.compose.foundation.text.contextmenu.internal;

import android.view.View;
import androidx.annotation.l1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n4;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.q1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
@SourceDebugExtension({"SMAP\nAndroidTextContextMenuToolbarProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextContextMenuToolbarProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 6 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,495:1\n1282#2,6:496\n1282#2,6:502\n1282#2,6:509\n1282#2,6:515\n75#3:508\n85#4:521\n117#4,2:522\n85#5,5:524\n66#6,5:529\n*S KotlinDebug\n*F\n+ 1 AndroidTextContextMenuToolbarProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider_androidKt\n*L\n85#1:496,6\n93#1:502,6\n114#1:509,6\n118#1:515,6\n112#1:508\n85#1:521\n85#1:522,2\n93#1:524,5\n120#1:529,5\n*E\n"})
public final class r {

    @SourceDebugExtension({"SMAP\nAndroidTextContextMenuToolbarProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextContextMenuToolbarProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider_androidKt$ProvidePlatformTextContextMenuToolbar$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,495:1\n1282#2,6:496\n70#3:502\n67#3,9:503\n77#3:542\n80#4,6:512\n87#4,3:527\n90#4,2:536\n94#4:541\n391#5,9:518\n400#5,3:538\n4360#6,6:530\n*S KotlinDebug\n*F\n+ 1 AndroidTextContextMenuToolbarProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider_androidKt$ProvidePlatformTextContextMenuToolbar$2\n*L\n100#1:496,6\n98#1:502\n98#1:503,9\n98#1:542\n98#1:512,6\n98#1:527,3\n98#1:536,2\n98#1:541\n98#1:518,9\n98#1:538,3\n98#1:530,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f18922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n3<androidx.compose.ui.layout.g0> f18923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f18924c;

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.a0 a0Var, n3<androidx.compose.ui.layout.g0> n3Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f18922a = a0Var;
            this.f18923b = n3Var;
            this.f18924c = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(n3 n3Var, androidx.compose.ui.layout.g0 g0Var) {
            r.i(n3Var, g0Var);
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
                androidx.compose.runtime.m0.A0(-291176396, i10, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvidePlatformTextContextMenuToolbar.<anonymous> (AndroidTextContextMenuToolbarProvider.android.kt:97)");
            }
            androidx.compose.ui.a0 a0Var = this.f18922a;
            final n3<androidx.compose.ui.layout.g0> n3Var = this.f18923b;
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.text.contextmenu.internal.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.a.f(n3Var, (androidx.compose.ui.layout.g0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarA = q1.a(a0Var, (Function1) objI0);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f18924c;
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

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidTextContextMenuToolbarProvider.android.kt\nandroidx/compose/foundation/text/contextmenu/internal/AndroidTextContextMenuToolbarProvider_androidKt\n*L\n1#1,69:1\n120#2:70\n*E\n"})
    public static final class b implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f18925a;

        public b(k kVar) {
            this.f18925a = kVar;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f18925a.v();
        }
    }

    @androidx.compose.runtime.o
    @l1
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void e(@Nullable androidx.compose.ui.a0 a0Var, @Nullable final Function1<? super m0, ? extends m0> function1, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(771959668);
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
            i12 |= c0VarR.k0(function1) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(771959668, i12, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvidePlatformTextContextMenuToolbar (AndroidTextContextMenuToolbarProvider.android.kt:83)");
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
                objI1 = new Function0() { // from class: androidx.compose.foundation.text.contextmenu.internal.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.j(n3Var);
                    }
                };
                c0VarR.Y(objI1);
            }
            androidx.compose.runtime.a1.e(androidx.compose.foundation.text.contextmenu.provider.n.f().f(m((Function0) objI1, function1, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | 6, 0)), androidx.compose.runtime.internal.w.e(-291176396, true, new a(a0Var, n3Var, function2), c0VarR, 54), c0VarR, n4.f36267i | 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.k(a0Var2, function1, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void f(@Nullable final androidx.compose.ui.a0 a0Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2064964257);
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
                androidx.compose.runtime.m0.A0(2064964257, i12, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvidePlatformTextContextMenuToolbar (AndroidTextContextMenuToolbarProvider.android.kt:66)");
            }
            int i14 = (i12 & 14) | 48 | ((i12 << 3) & 896);
            androidx.compose.ui.a0 a0Var2 = a0Var;
            function3 = function2;
            e(a0Var2, null, function3, c0VarR, i14, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var = a0Var2;
        } else {
            function3 = function2;
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.g(a0Var, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(androidx.compose.ui.a0 a0Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        f(a0Var, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final androidx.compose.ui.layout.g0 h(n3<androidx.compose.ui.layout.g0> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(n3<androidx.compose.ui.layout.g0> n3Var, androidx.compose.ui.layout.g0 g0Var) {
        n3Var.setValue(g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.g0 j(n3 n3Var) {
        androidx.compose.ui.layout.g0 g0VarH = h(n3Var);
        if (g0VarH != null) {
            return g0VarH;
        }
        androidx.compose.foundation.internal.e.j("Required value was null.");
        throw new kotlin.a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(androidx.compose.ui.a0 a0Var, Function1 function1, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        e(a0Var, function1, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.foundation.text.contextmenu.provider.k m(@NotNull Function0<? extends androidx.compose.ui.layout.g0> function0, @Nullable Function1<? super m0, ? extends m0> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(549805508, i10, -1, "androidx.compose.foundation.text.contextmenu.internal.platformTextContextMenuToolbarProvider (AndroidTextContextMenuToolbarProvider.android.kt:110)");
        }
        View view = (View) c0Var.W(AndroidCompositionLocals_androidKt.m());
        boolean zD = c0Var.D(view);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new k(view, function1, function0);
            c0Var.Y(objI0);
        }
        final k kVar = (k) objI0;
        boolean zK0 = c0Var.k0(kVar);
        Object objI1 = c0Var.i0();
        if (zK0 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function1() { // from class: androidx.compose.foundation.text.contextmenu.internal.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return r.n(kVar, (v1) obj);
                }
            };
            c0Var.Y(objI1);
        }
        b2.d(kVar, (Function1) objI1, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 n(k kVar, v1 v1Var) {
        kVar.G();
        return new b(kVar);
    }
}
