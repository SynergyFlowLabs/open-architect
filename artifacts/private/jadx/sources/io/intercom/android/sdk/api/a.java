package io.intercom.android.sdk.api;

import io.intercom.android.sdk.IntercomStatusCallback;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntercomStatusCallback f291514a;

    @Override // java.lang.Runnable
    public final void run() {
        this.f291514a.onSuccess();
    }
}
