package androidx.activity.compose;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.p0;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.n2;
import androidx.lifecycle.p2;
import androidx.savedstate.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ViewGroup.LayoutParams f9815a = new ViewGroup.LayoutParams(-2, -2);

    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void a(@NotNull androidx.activity.l lVar, @Nullable p0 p0Var, @NotNull Function2<? super c0, ? super Integer, Unit> function2) {
        View childAt = ((ViewGroup) lVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(p0Var);
            composeView.setContent(function2);
            return;
        }
        ComposeView composeView2 = new ComposeView(lVar, null, 0, 6, null);
        composeView2.setParentCompositionContext(p0Var);
        composeView2.setContent(function2);
        c(lVar);
        lVar.setContentView(composeView2, f9815a);
    }

    public static /* synthetic */ void b(androidx.activity.l lVar, p0 p0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            p0Var = null;
        }
        a(lVar, p0Var, function2);
    }

    private static final void c(androidx.activity.l lVar) {
        View decorView = lVar.getWindow().getDecorView();
        if (n2.a(decorView) == null) {
            n2.b(decorView, lVar);
        }
        if (p2.a(decorView) == null) {
            p2.b(decorView, lVar);
        }
        if (r.a(decorView) == null) {
            r.b(decorView, lVar);
        }
    }
}
