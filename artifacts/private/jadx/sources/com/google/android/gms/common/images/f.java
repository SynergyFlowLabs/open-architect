package com.google.android.gms.common.images;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.p0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f106444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final AssetFileDescriptor f106445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ImageManager f106446c;

    public f(ImageManager imageManager, @p0 Uri uri, AssetFileDescriptor assetFileDescriptor) {
        this.f106446c = imageManager;
        this.f106444a = uri;
        this.f106445b = assetFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.d.b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        AssetFileDescriptor assetFileDescriptor = this.f106445b;
        boolean z10 = false;
        Bitmap bitmapDecodeStream = null;
        if (assetFileDescriptor != null) {
            try {
                FileInputStream fileInputStreamCreateInputStream = assetFileDescriptor.createInputStream();
                if (fileInputStreamCreateInputStream != null) {
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStreamCreateInputStream);
                    } catch (Throwable th2) {
                        try {
                            fileInputStreamCreateInputStream.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
                if (fileInputStreamCreateInputStream != null) {
                    fileInputStreamCreateInputStream.close();
                }
            } catch (IOException | OutOfMemoryError e10) {
                "Error loading bitmap for uri: ".concat(String.valueOf(this.f106444a));
                z10 = e10 instanceof OutOfMemoryError;
            }
        }
        boolean z11 = z10;
        Bitmap bitmap = bitmapDecodeStream;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.f106446c;
        imageManager.f106429b.post(new h(imageManager, this.f106444a, bitmap, z11, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            "Latch interrupted while posting ".concat(String.valueOf(this.f106444a));
        }
    }
}
