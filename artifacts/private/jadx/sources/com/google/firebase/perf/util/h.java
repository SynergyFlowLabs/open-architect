package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f124238d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f124239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f124240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeUnit f124241c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f124242a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f124242a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124242a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124242a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h(long j10, long j11, TimeUnit timeUnit) {
        this.f124239a = j10;
        this.f124240b = j11;
        this.f124241c = timeUnit;
    }

    public double a() {
        int i10 = a.f124242a[this.f124241c.ordinal()];
        if (i10 == 1) {
            return (this.f124239a / this.f124240b) * TimeUnit.SECONDS.toNanos(1L);
        }
        if (i10 != 2) {
            return i10 != 3 ? this.f124239a / this.f124241c.toSeconds(this.f124240b) : (this.f124239a / this.f124240b) * TimeUnit.SECONDS.toMillis(1L);
        }
        return (this.f124239a / this.f124240b) * TimeUnit.SECONDS.toMicros(1L);
    }
}
