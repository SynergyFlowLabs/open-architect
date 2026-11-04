package com.google.android.gms.internal.location;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class j1 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ j1 f108128a = new j1();

    private /* synthetic */ j1() {
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        runnable.run();
    }
}
