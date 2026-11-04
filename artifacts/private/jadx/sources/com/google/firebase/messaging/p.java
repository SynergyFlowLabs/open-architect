package com.google.firebase.messaging;

import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f123691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f123692b;

    public /* synthetic */ p(q qVar, Intent intent) {
        this.f123691a = qVar;
        this.f123692b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f123691a.b(this.f123692b);
    }
}
