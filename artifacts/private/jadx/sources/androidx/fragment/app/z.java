package androidx.fragment.app;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class z {
    public static final void b(@NotNull Fragment fragment, @NotNull String str) {
        fragment.getParentFragmentManager().d(str);
    }

    public static final void c(@NotNull Fragment fragment, @NotNull String str) {
        fragment.getParentFragmentManager().b(str);
    }

    public static final void d(@NotNull Fragment fragment, @NotNull String str, @NotNull Bundle bundle) {
        fragment.getParentFragmentManager().a(str, bundle);
    }

    public static final void e(@NotNull Fragment fragment, @NotNull String str, @NotNull final Function2<? super String, ? super Bundle, Unit> function2) {
        fragment.getParentFragmentManager().c(str, fragment, new o0() { // from class: androidx.fragment.app.y
            @Override // androidx.fragment.app.o0
            public final void a(String str2, Bundle bundle) {
                z.f(function2, str2, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Function2 function2, String str, Bundle bundle) {
        function2.invoke(str, bundle);
    }
}
