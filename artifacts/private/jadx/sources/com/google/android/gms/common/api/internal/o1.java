package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o1 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f106158a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f106158a.post(runnable);
    }
}
