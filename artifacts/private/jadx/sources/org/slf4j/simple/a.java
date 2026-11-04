package org.slf4j.simple;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes14.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f339684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final PrintStream f339685b;

    /* JADX INFO: renamed from: org.slf4j.simple.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C2443a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339686a;

        static {
            int[] iArr = new int[b.values().length];
            f339686a = iArr;
            try {
                iArr[b.SYS_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339686a[b.SYS_ERR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339686a[b.CACHED_SYS_ERR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f339686a[b.CACHED_SYS_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f339686a[b.FILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        SYS_OUT,
        CACHED_SYS_OUT,
        SYS_ERR,
        CACHED_SYS_ERR,
        FILE
    }

    a(b bVar) {
        if (bVar == b.FILE) {
            throw new IllegalArgumentException();
        }
        this.f339684a = bVar;
        if (bVar == b.CACHED_SYS_OUT) {
            this.f339685b = System.out;
        } else if (bVar == b.CACHED_SYS_ERR) {
            this.f339685b = System.err;
        } else {
            this.f339685b = null;
        }
    }

    PrintStream a() {
        int i10 = C2443a.f339686a[this.f339684a.ordinal()];
        if (i10 == 1) {
            return System.out;
        }
        if (i10 == 2) {
            return System.err;
        }
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            return this.f339685b;
        }
        throw new IllegalArgumentException();
    }

    a(PrintStream printStream) {
        this.f339684a = b.FILE;
        this.f339685b = printStream;
    }
}
