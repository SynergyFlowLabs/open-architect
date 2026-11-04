package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.runtime.n7;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {
    @NotNull
    public static final y.b a(@NotNull Context context) {
        return new f0(new f(context), i.a(context), null, null, null, 28, null);
    }

    @NotNull
    public static final y.b b(@NotNull Context context, @NotNull CoroutineContext coroutineContext) {
        return new f0(new f(context), i.a(context), g0.b(), new m0(g0.a(), coroutineContext), null, 16, null);
    }

    @androidx.compose.ui.text.x
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final y.b c(@NotNull Context context) {
        return new f0(new f(context), null, new t1(), new m0(new o(), null, 2, null), null, 18, null);
    }

    @NotNull
    public static final n7<Typeface> d(@NotNull y.b bVar, @Nullable y yVar, @NotNull v0 v0Var, int i10, int i11) {
        n7 n7VarB = bVar.b(yVar, v0Var, i10, i11);
        Intrinsics.checkNotNull(n7VarB, "null cannot be cast to non-null type androidx.compose.runtime.State<android.graphics.Typeface>");
        return n7VarB;
    }

    public static /* synthetic */ n7 e(y.b bVar, y yVar, v0 v0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            yVar = null;
        }
        if ((i12 & 2) != 0) {
            v0Var = v0.f41742b.m();
        }
        if ((i12 & 4) != 0) {
            i10 = q0.f41690b.c();
        }
        if ((i12 & 8) != 0) {
            i11 = r0.f41699b.a();
        }
        return d(bVar, yVar, v0Var, i10, i11);
    }
}
