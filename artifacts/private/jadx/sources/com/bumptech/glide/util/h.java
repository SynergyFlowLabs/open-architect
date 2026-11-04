package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class h<T, Y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<T, Y> f97477a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f97478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f97479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f97480d;

    public h(long j10) {
        this.f97478b = j10;
        this.f97479c = j10;
    }

    private void j() {
        q(this.f97479c);
    }

    public synchronized long a() {
        return this.f97479c;
    }

    public void c() {
        q(0L);
    }

    public synchronized void d(float f10) {
        try {
            if (f10 < 0.0f) {
                throw new IllegalArgumentException("Multiplier must be >= 0");
            }
            this.f97479c = Math.round(this.f97478b * f10);
            j();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long e() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f97480d;
    }

    public synchronized boolean i(@NonNull T t10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f97477a.containsKey(t10);
    }

    @p0
    public synchronized Y k(@NonNull T t10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f97477a.get(t10);
    }

    protected synchronized int l() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f97477a.size();
    }

    protected int m(@p0 Y y10) {
        return 1;
    }

    protected void n(@NonNull T t10, @p0 Y y10) {
    }

    @p0
    public synchronized Y o(@NonNull T t10, @p0 Y y10) {
        long jM = m(y10);
        if (jM >= this.f97479c) {
            n(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f97480d += jM;
        }
        Y yPut = this.f97477a.put(t10, y10);
        if (yPut != null) {
            this.f97480d -= (long) m(yPut);
            if (!yPut.equals(y10)) {
                n(t10, yPut);
            }
        }
        j();
        return yPut;
    }

    @p0
    public synchronized Y p(@NonNull T t10) {
        Y yRemove;
        try {
            yRemove = this.f97477a.remove(t10);
            if (yRemove != null) {
                this.f97480d -= (long) m(yRemove);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return yRemove;
    }

    protected synchronized void q(long j10) {
        while (this.f97480d > j10) {
            try {
                Iterator<Map.Entry<T, Y>> it = this.f97477a.entrySet().iterator();
                Map.Entry<T, Y> next = it.next();
                Y value = next.getValue();
                this.f97480d -= (long) m(value);
                T key = next.getKey();
                it.remove();
                n(key, value);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
