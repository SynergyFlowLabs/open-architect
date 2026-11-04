package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ViewGroup.LayoutParams f40444a = new ViewGroup.LayoutParams(-2, -2);

    @NotNull
    public static final androidx.compose.runtime.a<androidx.compose.ui.node.l0> a(@NotNull androidx.compose.ui.node.l0 l0Var) {
        return new androidx.compose.ui.node.r2(l0Var);
    }

    @androidx.compose.runtime.p(scheme = "[0[0]]")
    private static final androidx.compose.runtime.o0 b(AndroidComposeView androidComposeView, androidx.compose.runtime.p0 p0Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        if (r2.e() && androidComposeView.getTag(androidx.compose.ui.d0.b.K) == null) {
            androidComposeView.setTag(androidx.compose.ui.d0.b.K, Collections.newSetFromMap(new WeakHashMap()));
        }
        Object tag = androidComposeView.getView().getTag(androidx.compose.ui.d0.b.L);
        d5 d5Var = tag instanceof d5 ? (d5) tag : null;
        if (d5Var == null) {
            d5Var = new d5(androidComposeView, androidx.compose.runtime.t0.a(new androidx.compose.ui.node.r2(androidComposeView.getRoot()), p0Var));
            androidComposeView.getView().setTag(androidx.compose.ui.d0.b.L, d5Var);
        }
        d5Var.l(function2);
        if (!Intrinsics.areEqual(androidComposeView.getCoroutineContext(), p0Var.k())) {
            androidComposeView.setCoroutineContext(p0Var.k());
        }
        return d5Var;
    }

    @androidx.compose.runtime.p(scheme = "[0[0]]")
    @NotNull
    public static final androidx.compose.runtime.o0 c(@NotNull a aVar, @NotNull androidx.compose.runtime.p0 p0Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        i2.f40511a.b();
        AndroidComposeView androidComposeView = null;
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            aVar.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(aVar.getContext(), p0Var.k());
            aVar.addView(androidComposeView.getView(), f40444a);
        }
        return b(androidComposeView, p0Var, function2);
    }
}
