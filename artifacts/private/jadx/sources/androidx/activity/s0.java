package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@oj.i(name = "ViewTreeFullyDrawnReporterOwner")
public final class s0 {
    @oj.i(name = "get")
    @Nullable
    public static final g0 a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(q0.a.f9987a);
            g0 g0Var = tag instanceof g0 ? (g0) tag : null;
            if (g0Var != null) {
                return g0Var;
            }
            Object objA = q1.b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    @oj.i(name = "set")
    public static final void b(@NotNull View view, @NotNull g0 fullyDrawnReporterOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(q0.a.f9987a, fullyDrawnReporterOwner);
    }
}
