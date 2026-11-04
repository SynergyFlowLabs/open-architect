package com.google.vr.sdk.deps;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
abstract class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e4 f129352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e4 f129353b;

    static {
        byte b10 = 0;
        f129352a = new g4(b10);
        f129353b = new h4(b10);
    }

    private e4() {
    }

    static e4 a() {
        return f129352a;
    }

    static e4 d() {
        return f129353b;
    }

    abstract <L> List<L> b(Object obj, long j10);

    abstract <L> void c(Object obj, Object obj2, long j10);

    abstract void e(Object obj, long j10);

    /* synthetic */ e4(byte b10) {
        this();
    }
}
