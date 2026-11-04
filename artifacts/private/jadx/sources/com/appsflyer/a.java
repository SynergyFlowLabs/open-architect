package com.appsflyer;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f89658a;

    public /* synthetic */ a(Function1 function1) {
        this.f89658a = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFLogger.getMediationNetwork(this.f89658a);
    }
}
