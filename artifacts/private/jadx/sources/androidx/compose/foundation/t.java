package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1073:1\n75#2:1074\n75#2:1075\n75#2:1076\n75#2:1077\n75#2:1078\n1282#3,6:1079\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n*L\n87#1:1074\n88#1:1075\n109#1:1076\n110#1:1077\n111#1:1078\n115#1:1079,6\n*E\n"})
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f18748a = 4.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f18749b = androidx.compose.ui.graphics.s0.d(4284900966L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f18750c = androidx.compose.foundation.layout.d5.h(0.0f, 0.0f, 3, null);

    @Nullable
    public static final y3 d(@NotNull androidx.compose.runtime.v0 v0Var) {
        Context context = (Context) v0Var.H0(AndroidCompositionLocals_androidKt.g());
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) v0Var.H0(androidx.compose.ui.platform.q1.m());
        u3 u3Var = (u3) v0Var.H0(w3.c());
        if (u3Var == null) {
            return null;
        }
        return new f(context, dVar, u3Var.b(), u3Var.a(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(int i10) {
        return androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.g()) ? 4.0f : 1.0f;
    }

    @androidx.compose.runtime.o
    @Nullable
    public static final x3 f(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        e eVar;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1569526143, i10, -1, "androidx.compose.foundation.rememberPlatformOverscrollEffect (AndroidOverscroll.android.kt:107)");
        }
        Context context = (Context) c0Var.W(AndroidCompositionLocals_androidKt.g());
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
        u3 u3Var = (u3) c0Var.W(w3.c());
        if (u3Var == null) {
            c0Var.E(-1555310353);
            c0Var.A();
            eVar = null;
        } else {
            c0Var.E(-1555277648);
            boolean zD = c0Var.D(context) | c0Var.D(dVar) | c0Var.D(u3Var);
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                Object eVar2 = new e(context, dVar, u3Var.b(), u3Var.a(), null);
                c0Var.Y(eVar2);
                objI0 = eVar2;
            }
            c0Var.A();
            eVar = (e) objI0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return eVar;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final y3 g(long j10, @Nullable androidx.compose.foundation.layout.g5 g5Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = f18749b;
        }
        long j11 = j10;
        if ((i11 & 2) != 0) {
            g5Var = f18750c;
        }
        androidx.compose.foundation.layout.g5 g5Var2 = g5Var;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2017030679, i10, -1, "androidx.compose.foundation.rememberPlatformOverscrollFactory (AndroidOverscroll.android.kt:85)");
        }
        f fVar = new f((Context) c0Var.W(AndroidCompositionLocals_androidKt.g()), (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m()), j11, g5Var2, null);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return fVar;
    }
}
