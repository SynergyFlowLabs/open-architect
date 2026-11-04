package androidx.compose.material3.internal;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
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
@SourceDebugExtension({"SMAP\nAccessibilityServiceStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/AccessibilityServiceStateProvider_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,208:1\n75#2:209\n75#2:216\n1282#3,6:210\n1282#3,6:217\n1282#3,6:223\n1282#3,6:229\n1282#3,6:235\n1282#3,6:241\n66#4,5:247\n*S KotlinDebug\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/AccessibilityServiceStateProvider_androidKt\n*L\n48#1:209\n66#1:216\n53#1:210,6\n67#1:217,6\n72#1:223,6\n81#1:229,6\n82#1:235,6\n84#1:241,6\n87#1:247,5\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f28896a = "SwitchAccess";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f28897b = "VoiceAccess";

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/AccessibilityServiceStateProvider_androidKt\n*L\n1#1,69:1\n88#2,3:70\n*E\n"})
    public static final class a implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f28898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.o0 f28899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.j0 f28900c;

        public a(Function0 function0, androidx.lifecycle.o0 o0Var, androidx.lifecycle.j0 j0Var) {
            this.f28898a = function0;
            this.f28899b = o0Var;
            this.f28900c = j0Var;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f28898a.invoke();
            this.f28899b.getLifecycle().g(this.f28900c);
        }
    }

    @androidx.compose.runtime.o
    private static final void h(final androidx.lifecycle.o0 o0Var, final Function1<? super androidx.lifecycle.c0.a, Unit> function1, final Function0<Unit> function0, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1868327245);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(o0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function1) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.k0(function0) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (i13 != 0) {
                Object objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.internal.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return h.l((androidx.lifecycle.c0.a) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                function1 = (Function1) objI0;
            }
            if (i14 != 0) {
                Object objI1 = c0VarR.i0();
                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new Function0() { // from class: androidx.compose.material3.internal.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return h.m();
                        }
                    };
                    c0VarR.Y(objI1);
                }
                function0 = (Function0) objI1;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1868327245, i12, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:82)");
            }
            boolean zK0 = ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) | c0VarR.k0(o0Var) | ((i12 & 896) == 256);
            Object objI2 = c0VarR.i0();
            if (zK0 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new Function1() { // from class: androidx.compose.material3.internal.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return h.i(o0Var, function1, function0, (androidx.compose.runtime.v1) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            androidx.compose.runtime.b2.d(o0Var, (Function1) objI2, c0VarR, i12 & 14);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final Function1<? super androidx.lifecycle.c0.a, Unit> function2 = function1;
        final Function0<Unit> function3 = function0;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h.k(o0Var, function2, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 i(androidx.lifecycle.o0 o0Var, final Function1 function1, Function0 function0, androidx.compose.runtime.v1 v1Var) {
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0() { // from class: androidx.compose.material3.internal.a
            @Override // androidx.lifecycle.j0
            public final void e(androidx.lifecycle.o0 o0Var2, androidx.lifecycle.c0.a aVar) {
                h.j(function1, o0Var2, aVar);
            }
        };
        o0Var.getLifecycle().c(j0Var);
        return new a(function0, o0Var, j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Function1 function1, androidx.lifecycle.o0 o0Var, androidx.lifecycle.c0.a aVar) {
        function1.invoke(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(androidx.lifecycle.o0 o0Var, Function1 function1, Function0 function0, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        h(o0Var, function1, function0, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(androidx.lifecycle.c0.a aVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m() {
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n7<Boolean> n(boolean z10, boolean z11, boolean z12, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        boolean z13 = true;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(432241692, i10, -1, "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)");
        }
        Object systemService = ((Context) c0Var.W(AndroidCompositionLocals_androidKt.g())).getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        final AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        boolean z14 = ((((i10 & 14) ^ 6) > 4 && c0Var.G(z10)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.G(z11)) || (i10 & 48) == 32);
        if ((((i10 & 896) ^ a5.S0) <= 256 || !c0Var.G(z12)) && (i10 & a5.S0) != 256) {
            z13 = false;
        }
        boolean z15 = z14 | z13;
        Object objI0 = c0Var.i0();
        if (z15 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new x2(z10, z11, z12);
            c0Var.Y(objI0);
        }
        final x2 x2Var = (x2) objI0;
        androidx.lifecycle.o0 o0Var = (androidx.lifecycle.o0) c0Var.W(androidx.lifecycle.compose.d0.c());
        boolean zD = c0Var.D(x2Var) | c0Var.k0(accessibilityManager);
        Object objI1 = c0Var.i0();
        if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function1() { // from class: androidx.compose.material3.internal.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h.o(x2Var, accessibilityManager, (androidx.lifecycle.c0.a) obj);
                }
            };
            c0Var.Y(objI1);
        }
        Function1 function1 = (Function1) objI1;
        boolean zD2 = c0Var.D(x2Var) | c0Var.k0(accessibilityManager);
        Object objI2 = c0Var.i0();
        if (zD2 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
            objI2 = new Function0() { // from class: androidx.compose.material3.internal.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.p(x2Var, accessibilityManager);
                }
            };
            c0Var.Y(objI2);
        }
        h(o0Var, function1, (Function0) objI2, c0Var, 0, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return x2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(x2 x2Var, AccessibilityManager accessibilityManager, androidx.lifecycle.c0.a aVar) {
        if (aVar == androidx.lifecycle.c0.a.ON_RESUME) {
            x2Var.A(accessibilityManager);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(x2 x2Var, AccessibilityManager accessibilityManager) {
        x2Var.F(accessibilityManager);
        return Unit.f312394a;
    }
}
