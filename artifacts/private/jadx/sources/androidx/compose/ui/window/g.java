package androidx.compose.ui.window;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(33)
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f42927a = new g();

    private g() {
    }

    @oj.n
    @NotNull
    public static final OnBackInvokedCallback b(@Nullable final Function0<Unit> function0) {
        return new OnBackInvokedCallback() { // from class: androidx.compose.ui.window.f
            public final void onBackInvoked() {
                g.c(function0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @oj.n
    public static final void d(@NotNull View view, @Nullable Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    @oj.n
    public static final void e(@NotNull View view, @Nullable Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if ((obj instanceof OnBackInvokedCallback) && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }
}
