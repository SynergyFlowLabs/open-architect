package com.google.android.gms.internal.location;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class h1 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ h1 f108116a = new h1();

    private /* synthetic */ h1() {
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        runnable.run();
    }
}
