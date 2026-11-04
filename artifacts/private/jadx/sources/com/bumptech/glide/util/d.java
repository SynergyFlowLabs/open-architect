package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class d extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Queue<d> f97469c = m.f(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f97470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f97471b;

    d() {
    }

    static void a() {
        while (true) {
            Queue<d> queue = f97469c;
            if (queue.isEmpty()) {
                return;
            } else {
                queue.remove();
            }
        }
    }

    @NonNull
    public static d c(@NonNull InputStream inputStream) {
        d dVarPoll;
        Queue<d> queue = f97469c;
        synchronized (queue) {
            dVarPoll = queue.poll();
        }
        if (dVarPoll == null) {
            dVarPoll = new d();
        }
        dVarPoll.d(inputStream);
        return dVarPoll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f97470a.available();
    }

    @p0
    public IOException b() {
        return this.f97471b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f97470a.close();
    }

    void d(@NonNull InputStream inputStream) {
        this.f97470a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f97470a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f97470a.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f97470a.read(bArr);
        } catch (IOException e10) {
            this.f97471b = e10;
            return -1;
        }
    }

    public void release() {
        this.f97471b = null;
        this.f97470a = null;
        Queue<d> queue = f97469c;
        synchronized (queue) {
            try {
                queue.offer(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            this.f97470a.reset();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            return this.f97470a.skip(j10);
        } catch (IOException e10) {
            this.f97471b = e10;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f97470a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f97471b = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f97470a.read();
        } catch (IOException e10) {
            this.f97471b = e10;
            return -1;
        }
    }
}
