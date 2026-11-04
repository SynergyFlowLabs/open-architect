package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class f3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final f3 f109114d = new f3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.a
    final Runnable f109115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    final Executor f109116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.a
    f3 f109117c;

    f3() {
        this.f109115a = null;
        this.f109116b = null;
    }

    f3(Runnable runnable, Executor executor) {
        this.f109115a = runnable;
        this.f109116b = executor;
    }
}
