package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static Function1<? super View, ? extends v> f19521a = new Function1() { // from class: androidx.compose.foundation.text.input.internal.c0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return d0.c((View) obj);
        }
    };

    @NotNull
    public static final v b(@NotNull View view) {
        return f19521a.invoke(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v c(View view) {
        return Build.VERSION.SDK_INT >= 34 ? new b0(view) : new y(view);
    }

    @androidx.annotation.l1
    @lm.n
    @NotNull
    public static final Function1<View, v> d(@NotNull Function1<? super View, ? extends v> function1) {
        Function1 function2 = f19521a;
        f19521a = function1;
        return function2;
    }
}
