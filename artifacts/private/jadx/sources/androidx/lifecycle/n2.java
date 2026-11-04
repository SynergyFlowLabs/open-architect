package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@oj.i(name = "ViewTreeLifecycleOwner")
public final class n2 {
    @oj.i(name = "get")
    @Nullable
    public static final o0 a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(s2.a.C2502a.f366968a);
            o0 o0Var = tag instanceof o0 ? (o0) tag : null;
            if (o0Var != null) {
                return o0Var;
            }
            Object objA = q1.b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    @oj.i(name = "set")
    public static final void b(@NotNull View view, @Nullable o0 o0Var) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(s2.a.C2502a.f366968a, o0Var);
    }
}
