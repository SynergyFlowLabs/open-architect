package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes5.dex */
public class l0 implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f123660d = 1048576;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f123661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private volatile Future<?> f123662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private Task<Bitmap> f123663c;

    private l0(URL url) {
        this.f123661a = url;
    }

    public static /* synthetic */ void a(l0 l0Var, com.google.android.gms.tasks.l lVar) {
        l0Var.getClass();
        try {
            lVar.c(l0Var.b());
        } catch (Exception e10) {
            lVar.b(e10);
        }
    }

    private byte[] c() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f123661a.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrE = c.e(c.c(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable(e.f123469a, 2)) {
                int length = bArrE.length;
                Objects.toString(this.f123661a);
            }
            if (bArrE.length <= 1048576) {
                return bArrE;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @androidx.annotation.p0
    public static l0 d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new l0(new URL(str));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public Bitmap b() throws IOException {
        if (Log.isLoggable(e.f123469a, 4)) {
            Objects.toString(this.f123661a);
        }
        byte[] bArrC = c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrC, 0, bArrC.length);
        if (bitmapDecodeByteArray != null) {
            if (Log.isLoggable(e.f123469a, 3)) {
                Objects.toString(this.f123661a);
            }
            return bitmapDecodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f123661a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f123662b.cancel(true);
    }

    public Task<Bitmap> e() {
        return (Task) com.google.android.gms.common.internal.w.r(this.f123663c);
    }

    public void f(ExecutorService executorService) {
        final com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        this.f123662b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.k0
            @Override // java.lang.Runnable
            public final void run() {
                l0.a(this.f123645a, lVar);
            }
        });
        this.f123663c = lVar.a();
    }
}
