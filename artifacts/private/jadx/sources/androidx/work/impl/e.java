package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public class e implements androidx.work.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f76818a = androidx.core.os.k.a(Looper.getMainLooper());

    @Override // androidx.work.h0
    public void a(@NonNull Runnable runnable) {
        this.f76818a.removeCallbacks(runnable);
    }

    @Override // androidx.work.h0
    public void b(long delayInMillis, @NonNull Runnable runnable) {
        this.f76818a.postDelayed(runnable, delayInMillis);
    }

    @NonNull
    public Handler c() {
        return this.f76818a;
    }
}
