package com.planner5d.library.services.bitmaploader.background;

import android.app.Application;
import android.graphics.Bitmap;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import androidx.annotation.m1;
import com.planner5d.library.services.backgroundexecutor.BackgroundExecutorService;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
@ij.f
public class b extends com.planner5d.library.services.backgroundexecutor.b<d, Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.cache.a f224047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.buffers.b f224048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f224049d;

    @ij.a
    public b(Application application, com.planner5d.library.services.bitmaploader.cache.a cache, com.planner5d.library.services.backgroundexecutor.g messageSender) {
        super(messageSender);
        this.f224048c = new com.planner5d.library.services.bitmaploader.buffers.b(3);
        this.f224049d = BackgroundExecutorService.i(application);
        this.f224047b = cache;
    }

    @m1
    public Bitmap e(int source, String uri, int width, int height, long cacheExpire, com.planner5d.library.services.bitmaploader.background.postprocess.a postProcess) throws Throwable {
        return b(new d(a(), source, uri, width, height, cacheExpire, postProcess), 30000L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.services.backgroundexecutor.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Bitmap c(d message) throws Exception {
        com.planner5d.library.services.bitmaploader.buffers.b.a aVarG;
        Bitmap bitmapB;
        int i10;
        if (message.f224061g != null) {
            throw new Exception(message.f224061g);
        }
        LocalSocket localSocket = new LocalSocket();
        try {
            localSocket.connect(new LocalSocketAddress(this.f224049d));
            new DataOutputStream(localSocket.getOutputStream()).writeLong(message.f224017a);
            aVarG = this.f224048c.g(Integer.valueOf(message.f224062h));
            try {
                InputStream inputStream = localSocket.getInputStream();
                int i11 = 0;
                while (i11 < message.f224062h && (i10 = inputStream.read(aVarG.f224105a.array(), i11, message.f224062h - i11)) >= 0) {
                    i11 += i10;
                }
                if (i11 == message.f224062h) {
                    bitmapB = this.f224047b.b(message.f224058d, message.f224059e);
                    if (bitmapB == null) {
                        try {
                            localSocket.close();
                        } catch (IOException unused) {
                        }
                        if (aVarG != null) {
                            this.f224048c.h(aVarG);
                        }
                        d(new d(message.f224017a, null));
                        return null;
                    }
                    aVarG.f224105a.rewind();
                    bitmapB.copyPixelsFromBuffer(aVarG.f224105a);
                } else {
                    bitmapB = null;
                }
                this.f224048c.h(aVarG);
                try {
                    localSocket.close();
                } catch (IOException unused2) {
                }
                d(new d(message.f224017a, null));
                return bitmapB;
            } catch (Throwable th2) {
                th = th2;
                try {
                    localSocket.close();
                } catch (IOException unused3) {
                }
                if (aVarG != null) {
                    this.f224048c.h(aVarG);
                }
                d(new d(message.f224017a, null));
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            aVarG = null;
        }
    }
}
