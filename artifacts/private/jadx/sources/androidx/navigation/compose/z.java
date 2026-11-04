package androidx.navigation.compose;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.q3;
import androidx.navigation.r2;
import androidx.navigation.y1;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavHostController.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostController.android.kt\nandroidx/navigation/compose/NavHostControllerKt__NavHostController_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n77#2:60\n1225#3,6:61\n1#4:67\n*S KotlinDebug\n*F\n+ 1 NavHostController.android.kt\nandroidx/navigation/compose/NavHostControllerKt__NavHostController_androidKt\n*L\n35#1:60\n36#1:61,6\n*E\n"})
final /* synthetic */ class z {
    private static final androidx.compose.runtime.saveable.c0<r2, ?> d(final Context context) {
        return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.navigation.compose.x
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return z.e((androidx.compose.runtime.saveable.g0) obj, (r2) obj2);
            }
        }, new Function1() { // from class: androidx.navigation.compose.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.f(context, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle e(androidx.compose.runtime.saveable.g0 g0Var, r2 r2Var) {
        return r2Var.T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r2 f(Context context, Bundle bundle) {
        r2 r2VarG = g(context);
        r2VarG.S0(bundle);
        return r2VarG;
    }

    private static final r2 g(Context context) {
        r2 r2Var = new r2(context);
        r2Var.P().b(new d(r2Var.P()));
        r2Var.P().b(new e());
        r2Var.P().b(new n());
        return r2Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final r2 h(@NotNull q3<? extends y1>[] q3VarArr, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-342848815, i10, -1, "androidx.navigation.compose.rememberNavController (NavHostController.android.kt:33)");
        }
        final Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
        Object[] objArrCopyOf = Arrays.copyOf(q3VarArr, q3VarArr.length);
        androidx.compose.runtime.saveable.c0<r2, ?> c0VarD = d(context);
        boolean zK0 = c0Var.k0(context);
        Object objI0 = c0Var.i0();
        if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.navigation.compose.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return z.i(context);
                }
            };
            c0Var.Y(objI0);
        }
        r2 r2Var = (r2) androidx.compose.runtime.saveable.i.i(objArrCopyOf, c0VarD, null, (Function0) objI0, c0Var, 0, 4);
        for (q3<? extends y1> q3Var : q3VarArr) {
            r2Var.P().b(q3Var);
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r2 i(Context context) {
        return g(context);
    }
}
