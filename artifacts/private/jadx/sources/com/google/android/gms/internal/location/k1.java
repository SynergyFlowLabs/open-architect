package com.google.android.gms.internal.location;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class k1 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ k1 f108136a = new k1();

    private /* synthetic */ k1() {
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        runnable.run();
    }
}
