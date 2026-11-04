package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.common.x;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f106922a;

    @g6.a
    public a(@NonNull Looper looper) {
        this.f106922a = new x(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f106922a.post(runnable);
    }
}
