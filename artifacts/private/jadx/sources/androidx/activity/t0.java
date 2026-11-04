package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@oj.i(name = "ViewTreeOnBackPressedDispatcherOwner")
public final class t0 {
    @oj.i(name = "get")
    @Nullable
    public static final m0 a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(q0.a.f9988b);
            m0 m0Var = tag instanceof m0 ? (m0) tag : null;
            if (m0Var != null) {
                return m0Var;
            }
            Object objA = q1.b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    @oj.i(name = "set")
    public static final void b(@NotNull View view, @NotNull m0 onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(q0.a.f9988b, onBackPressedDispatcherOwner);
    }
}
