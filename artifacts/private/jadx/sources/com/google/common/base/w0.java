package com.google.common.base;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b
@k
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w0 f116716a = new a();

    class a extends w0 {
        a() {
        }

        @Override // com.google.common.base.w0
        public long a() {
            return System.nanoTime();
        }
    }

    protected w0() {
    }

    public static w0 b() {
        return f116716a;
    }

    public abstract long a();
}
