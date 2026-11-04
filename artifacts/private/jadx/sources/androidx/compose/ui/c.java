package androidx.compose.ui;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Handler f37074a = new Handler(Looper.getMainLooper());

    public static final long b() {
        return System.currentTimeMillis();
    }

    @NotNull
    public static final Object c(long j10, @NotNull final Function0<Unit> function0) {
        Runnable runnable = new Runnable() { // from class: androidx.compose.ui.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(function0);
            }
        };
        f37074a.postDelayed(runnable, j10);
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function0 function0) {
        function0.invoke();
    }

    public static final void e(@Nullable Object obj) {
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        f37074a.removeCallbacks((Runnable) obj);
    }
}
