package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,41:1\n75#2:42\n75#2:43\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n*L\n27#1:42\n28#1:43\n*E\n"})
public final class ug {
    @androidx.compose.runtime.o
    @NotNull
    public static final String a(int i10, @Nullable androidx.compose.runtime.c0 c0Var, int i11) {
        String string;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-726638443, i11, -1, "androidx.compose.material.getString (Strings.android.kt:25)");
        }
        c0Var.W(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) c0Var.W(AndroidCompositionLocals_androidKt.g())).getResources();
        tg.a aVar = tg.f25008b;
        if (tg.l(i10, aVar.e())) {
            string = resources.getString(androidx.compose.ui.d0.c.f37157i);
        } else if (tg.l(i10, aVar.a())) {
            string = resources.getString(androidx.compose.ui.d0.c.f37150b);
        } else if (tg.l(i10, aVar.b())) {
            string = resources.getString(androidx.compose.ui.d0.c.f37151c);
        } else if (tg.l(i10, aVar.c())) {
            string = resources.getString(androidx.compose.ui.d0.c.f37152d);
        } else if (tg.l(i10, aVar.d())) {
            string = resources.getString(androidx.compose.ui.d0.c.f37154f);
        } else if (tg.l(i10, aVar.g())) {
            string = resources.getString(androidx.compose.ui.d0.c.f37160l);
        } else if (tg.l(i10, aVar.f())) {
            string = resources.getString(androidx.compose.ui.d0.c.f37159k);
        } else {
            string = tg.l(i10, aVar.h()) ? resources.getString(ld.a.f23678a) : "";
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return string;
    }
}
