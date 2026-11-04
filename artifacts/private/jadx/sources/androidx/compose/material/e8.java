package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenu_android\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,94:1\n75#2:95\n75#2:102\n1282#3,6:96\n1282#3,6:103\n66#4,5:109\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenu_android\n*L\n37#1:95\n43#1:102\n38#1:96,6\n44#1:103,6\n46#1:109,5\n*E\n"})
@oj.i(name = "ExposedDropdownMenu_android")
public final class e8 {

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenu_android\n*L\n1#1,69:1\n46#2:70\n*E\n"})
    public static final class a implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tb f22604a;

        public a(tb tbVar) {
            this.f22604a = tbVar;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f22604a.a();
        }
    }

    @androidx.compose.runtime.o
    public static final void c(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1063434120);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1063434120, i11, -1, "androidx.compose.material.OnPlatformWindowBoundsChange (ExposedDropdownMenu.android.kt:41)");
            }
            final View view = (View) c0VarR.W(AndroidCompositionLocals_androidKt.m());
            boolean zK0 = c0VarR.k0(view) | ((i11 & 14) == 4);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.c8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e8.d(view, function0, (androidx.compose.runtime.v1) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.runtime.b2.d(view, (Function1) objI0, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.d8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e8.e(function0, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 d(View view, Function0 function0, androidx.compose.runtime.v1 v1Var) {
        return new a(new tb(view, function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function0 function0, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        c(function0, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.s g(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return androidx.compose.ui.graphics.c3.d(rect);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final fl h(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1216067952, i10, -1, "androidx.compose.material.platformWindowBoundsCalculator (ExposedDropdownMenu.android.kt:35)");
        }
        View view = (View) c0Var.W(AndroidCompositionLocals_androidKt.m());
        boolean zD = c0Var.D(view);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new fl(view);
            c0Var.Y(objI0);
        }
        fl flVar = (fl) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return flVar;
    }
}
