package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import android.view.View;
import androidx.compose.foundation.n4;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPrefetchScheduler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/PrefetchScheduler_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,302:1\n75#2:303\n1282#3,6:304\n*S KotlinDebug\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/PrefetchScheduler_androidKt\n*L\n41#1:303\n42#1:304,6\n*E\n"})
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private static final a f17602a;

    public static final class a implements u2 {
        a() {
        }

        @Override // androidx.compose.foundation.lazy.layout.u2
        public void a(s2 s2Var) {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        f17602a = Intrinsics.areEqual(lowerCase, "robolectric") ? new a() : null;
    }

    @androidx.compose.foundation.b2
    private static /* synthetic */ void a() {
    }

    @androidx.compose.runtime.o
    @androidx.compose.foundation.b2
    @NotNull
    public static final u2 b(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1141871251, i10, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:36)");
        }
        u2 u2Var = f17602a;
        if (u2Var != null) {
            c0Var.E(1345648624);
            c0Var.A();
        } else {
            c0Var.E(1345697697);
            View view = (View) c0Var.W(AndroidCompositionLocals_androidKt.m());
            boolean zD = c0Var.D(view);
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                Object tag = view.getTag(n4.a.f18123a);
                Object bVar = tag instanceof u2 ? (u2) tag : null;
                if (bVar == null) {
                    bVar = new b(view);
                    view.setTag(n4.a.f18123a, bVar);
                }
                objI0 = bVar;
                c0Var.Y(objI0);
            }
            u2Var = (u2) objI0;
            c0Var.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return u2Var;
    }
}
