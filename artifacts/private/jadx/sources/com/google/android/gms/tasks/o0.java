package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class o0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f111007a = new m6.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f111007a.post(runnable);
    }
}
