package com.google.firebase.analytics.connector;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class e implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ e f120713a = new e();

    private /* synthetic */ e() {
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        runnable.run();
    }
}
