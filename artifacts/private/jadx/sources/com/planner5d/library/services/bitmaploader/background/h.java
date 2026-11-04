package com.planner5d.library.services.bitmaploader.background;

import android.graphics.Bitmap;
import android.net.LocalSocket;
import android.os.AsyncTask;
import android.util.LongSparseArray;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
class h extends AsyncTask<Object, Void, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f224082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocalSocket f224083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.buffers.b f224084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LongSparseArray<Integer> f224085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LongSparseArray<Bitmap> f224086e;

    public h(LocalSocket socket, Object lockLoading, com.planner5d.library.services.bitmaploader.buffers.b bufferManager, LongSparseArray<Integer> loading, LongSparseArray<Bitmap> loadedBitmaps) {
        this.f224082a = lockLoading;
        this.f224083b = socket;
        this.f224084c = bufferManager;
        this.f224085d = loading;
        this.f224086e = loadedBitmaps;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:53:0x0093 A[EXC_TOP_SPLITTER, PHI: r6
      0x0093: PHI (r6v3 android.net.LocalSocket) = (r6v2 android.net.LocalSocket), (r6v4 android.net.LocalSocket) binds: [B:45:0x00b1, B:31:0x0091] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(Object... params) throws Throwable {
        com.planner5d.library.services.bitmaploader.buffers.b.a aVarG;
        Throwable th2;
        LocalSocket localSocket;
        Bitmap bitmap;
        try {
            long j10 = new DataInputStream(this.f224083b.getInputStream()).readLong();
            synchronized (this.f224082a) {
                try {
                    bitmap = (this.f224085d.get(j10) != null ? this.f224085d.get(j10).intValue() : -1) == 2 ? this.f224086e.get(j10) : null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (bitmap != null) {
                aVarG = this.f224084c.g(Integer.valueOf(bitmap.getByteCount()));
                try {
                    aVarG.f224105a.rewind();
                    bitmap.copyPixelsToBuffer(aVarG.f224105a);
                    this.f224083b.getOutputStream().write(aVarG.f224105a.array(), 0, bitmap.getByteCount());
                } catch (IOException unused) {
                    if (aVarG != null) {
                        this.f224084c.h(aVarG);
                    }
                    localSocket = this.f224083b;
                    if (localSocket != null) {
                        try {
                            localSocket.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    if (aVarG != null) {
                        this.f224084c.h(aVarG);
                    }
                    LocalSocket localSocket2 = this.f224083b;
                    if (localSocket2 != null) {
                        try {
                            localSocket2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th2;
                }
            } else {
                aVarG = null;
            }
            if (aVarG != null) {
                this.f224084c.h(aVarG);
            }
            localSocket = this.f224083b;
            if (localSocket != null) {
                localSocket.close();
            }
        } catch (IOException unused4) {
            aVarG = null;
        } catch (Throwable th5) {
            aVarG = null;
            th2 = th5;
        }
        return null;
    }
}
