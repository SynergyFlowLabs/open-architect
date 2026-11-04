package ef;

import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.core.graphics.j;
import androidx.core.view.b1;
import androidx.core.view.g3;
import androidx.core.view.u1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f274872a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f274873b = 0;

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g3 c(View view, View view2, g3 insets) {
        Intrinsics.checkNotNullParameter(view2, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        j jVarF = insets.f(g3.m.i());
        Intrinsics.checkNotNullExpressionValue(jVarF, "getInsets(...)");
        int i10 = jVarF.f47826d;
        if (i10 != 0) {
            view.setPadding(0, 0, 0, i10);
        }
        return insets;
    }

    public final void b(@NotNull View rootView, @NotNull final View targetView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        u1.j2(rootView, new b1() { // from class: ef.d
            @Override // androidx.core.view.b1
            public final g3 b(View view, g3 g3Var) {
                return e.c(targetView, view, g3Var);
            }
        });
    }
}
