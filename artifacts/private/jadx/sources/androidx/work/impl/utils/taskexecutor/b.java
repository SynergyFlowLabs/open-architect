package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.util.concurrent.Executor;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.n0;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface b {
    @NonNull
    default n0 a() {
        return b2.c(d());
    }

    default void b(@NonNull Runnable runnable) {
        d().execute(runnable);
    }

    @NonNull
    Executor c();

    @NonNull
    a d();
}
