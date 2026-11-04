package com.google.android.gms.ads.identifier;

import androidx.annotation.l1;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@l1
final class b extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f105039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f105040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final CountDownLatch f105041c;

    public b(AdvertisingIdClient advertisingIdClient, long j10) {
        super("AdIdClientAutoDisconnectThread");
        this.f105039a = new WeakReference(advertisingIdClient);
        this.f105040b = j10;
        this.f105041c = new CountDownLatch(1);
        start();
    }

    private final void a() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f105039a.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.e();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (!this.f105041c.await(this.f105040b, TimeUnit.MILLISECONDS)) {
                a();
            }
        } catch (InterruptedException unused) {
            a();
        }
    }
}
