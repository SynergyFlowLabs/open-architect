package androidx.core.os;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    private static class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f48043a;

        a(@NonNull Handler handler) {
            this.f48043a = (Handler) androidx.core.util.t.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (this.f48043a.post((Runnable) androidx.core.util.t.l(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f48043a + " is shutting down");
        }
    }

    private j() {
    }

    @NonNull
    public static Executor a(@NonNull Handler handler) {
        return new a(handler);
    }
}
