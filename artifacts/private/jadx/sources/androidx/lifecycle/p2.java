package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@oj.i(name = "ViewTreeViewModelStoreOwner")
public final class p2 {
    @oj.i(name = "get")
    @Nullable
    public static final m2 a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(v2.g.a.f381330a);
            m2 m2Var = tag instanceof m2 ? (m2) tag : null;
            if (m2Var != null) {
                return m2Var;
            }
            Object objA = q1.b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    @oj.i(name = "set")
    public static final void b(@NotNull View view, @Nullable m2 m2Var) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(v2.g.a.f381330a, m2Var);
    }
}
