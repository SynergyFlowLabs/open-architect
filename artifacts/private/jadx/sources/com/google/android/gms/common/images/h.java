package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f106449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final Bitmap f106450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CountDownLatch f106451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ImageManager f106452d;

    public h(ImageManager imageManager, @p0 Uri uri, Bitmap bitmap, boolean z10, CountDownLatch countDownLatch) {
        this.f106452d = imageManager;
        this.f106449a = uri;
        this.f106450b = bitmap;
        this.f106451c = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.d.a("OnBitmapLoadedRunnable must be executed in the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f106452d.f106433f.remove(this.f106449a);
        if (imageReceiver != null) {
            ArrayList arrayList = imageReceiver.f106436b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                l lVar = (l) arrayList.get(i10);
                Bitmap bitmap = this.f106450b;
                if (bitmap != null) {
                    lVar.c(this.f106452d.f106428a, bitmap, false);
                } else {
                    this.f106452d.f106434g.put(this.f106449a, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.f106452d;
                    lVar.b(imageManager.f106428a, imageManager.f106431d, false);
                }
                if (!(lVar instanceof k)) {
                    this.f106452d.f106432e.remove(lVar);
                }
            }
        }
        this.f106451c.countDown();
        synchronized (ImageManager.f106425h) {
            try {
                ImageManager.f106426i.remove(this.f106449a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
