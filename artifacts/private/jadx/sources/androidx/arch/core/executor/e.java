package androidx.arch.core.executor;

import androidx.annotation.NonNull;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public abstract class e {
    public abstract void a(@NonNull Runnable runnable);

    public void b(@NonNull Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            d(runnable);
        }
    }

    public abstract boolean c();

    public abstract void d(@NonNull Runnable runnable);
}
