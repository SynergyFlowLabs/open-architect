package com.google.common.cache;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@i
abstract class b0 extends Number {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final ThreadLocal<int[]> f116728d = new ThreadLocal<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Random f116729e = new Random();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f116730f = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Unsafe f116731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f116732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f116733i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.a
    volatile transient b[] f116734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile transient long f116735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile transient int f116736c;

    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static final class b {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final Unsafe f116737p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final long f116738q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile long f116739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile long f116740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile long f116741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile long f116742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f116743e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile long f116744f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile long f116745g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile long f116746h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile long f116747i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile long f116748j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile long f116749k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile long f116750l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        volatile long f116751m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        volatile long f116752n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        volatile long f116753o;

        static {
            try {
                Unsafe unsafeF = b0.f();
                f116737p = unsafeF;
                f116738q = unsafeF.objectFieldOffset(b.class.getDeclaredField(androidx.media3.exoplayer.upstream.h.f65993g));
            } catch (Exception e10) {
                throw new Error(e10);
            }
        }

        b(long x10) {
            this.f116746h = x10;
        }

        final boolean a(long cmp, long val) {
            return f116737p.compareAndSwapLong(this, f116738q, cmp, val);
        }
    }

    static {
        try {
            Unsafe unsafeF = f();
            f116731g = unsafeF;
            f116732h = unsafeF.objectFieldOffset(b0.class.getDeclaredField("b"));
            f116733i = unsafeF.objectFieldOffset(b0.class.getDeclaredField("c"));
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    b0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe f() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new a());
            }
        } catch (PrivilegedActionException e10) {
            throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
        }
    }

    final boolean c(long cmp, long val) {
        return f116731g.compareAndSwapLong(this, f116732h, cmp, val);
    }

    final boolean d() {
        return f116731g.compareAndSwapInt(this, f116733i, 0, 1);
    }

    abstract long e(long currentValue, long newValue);

    final void g(long initialValue) {
        b[] bVarArr = this.f116734a;
        this.f116735b = initialValue;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    bVar.f116746h = initialValue;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    final void h(long x10, @fj.a int[] hc2, boolean wasUncontended) {
        int iNextInt;
        int[] iArr;
        boolean z10;
        int length;
        boolean z11;
        int length2;
        if (hc2 == null) {
            iArr = new int[1];
            f116728d.set(iArr);
            iNextInt = f116729e.nextInt();
            if (iNextInt == 0) {
                iNextInt = 1;
            }
            iArr[0] = iNextInt;
        } else {
            iNextInt = hc2[0];
            iArr = hc2;
        }
        boolean z12 = false;
        int i10 = iNextInt;
        boolean z13 = wasUncontended;
        while (true) {
            b[] bVarArr = this.f116734a;
            if (bVarArr != null && (length = bVarArr.length) > 0) {
                b bVar = bVarArr[(length - 1) & i10];
                if (bVar == null) {
                    if (this.f116736c == 0) {
                        b bVar2 = new b(x10);
                        if (this.f116736c == 0 && d()) {
                            try {
                                b[] bVarArr2 = this.f116734a;
                                if (bVarArr2 == null || (length2 = bVarArr2.length) <= 0) {
                                    z11 = false;
                                } else {
                                    int i11 = (length2 - 1) & i10;
                                    if (bVarArr2[i11] == null) {
                                        bVarArr2[i11] = bVar2;
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                }
                                this.f116736c = 0;
                                if (z11) {
                                    return;
                                }
                            } catch (Throwable th2) {
                                this.f116736c = 0;
                                throw th2;
                            }
                        }
                    }
                    z12 = false;
                    int i12 = i10 ^ (i10 << 13);
                    int i13 = i12 ^ (i12 >>> 17);
                    i10 = i13 ^ (i13 << 5);
                    iArr[0] = i10;
                } else {
                    if (z13) {
                        long j10 = bVar.f116746h;
                        if (bVar.a(j10, e(j10, x10))) {
                            return;
                        }
                        if (length >= f116730f || this.f116734a != bVarArr) {
                            z12 = false;
                        } else if (!z12) {
                            z12 = true;
                        } else if (this.f116736c == 0 && d()) {
                            try {
                                if (this.f116734a == bVarArr) {
                                    b[] bVarArr3 = new b[length << 1];
                                    for (int i14 = 0; i14 < length; i14++) {
                                        bVarArr3[i14] = bVarArr[i14];
                                    }
                                    this.f116734a = bVarArr3;
                                }
                                this.f116736c = 0;
                                z12 = false;
                            } catch (Throwable th3) {
                                this.f116736c = 0;
                                throw th3;
                            }
                        }
                    } else {
                        z13 = true;
                    }
                    int i15 = i10 ^ (i10 << 13);
                    int i16 = i15 ^ (i15 >>> 17);
                    i10 = i16 ^ (i16 << 5);
                    iArr[0] = i10;
                }
            } else if (this.f116736c == 0 && this.f116734a == bVarArr && d()) {
                try {
                    if (this.f116734a == bVarArr) {
                        b[] bVarArr4 = new b[2];
                        bVarArr4[i10 & 1] = new b(x10);
                        this.f116734a = bVarArr4;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f116736c = 0;
                    if (z10) {
                        return;
                    }
                } catch (Throwable th4) {
                    this.f116736c = 0;
                    throw th4;
                }
            } else {
                long j11 = this.f116735b;
                if (c(j11, e(j11, x10))) {
                    return;
                }
            }
        }
    }
}
