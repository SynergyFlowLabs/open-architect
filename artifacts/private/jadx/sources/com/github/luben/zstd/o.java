package com.github.luben.zstd;

/* JADX INFO: loaded from: classes4.dex */
public class o extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f103051a;

    public o(long j10) {
        this(Zstd.getErrorCode(j10), Zstd.getErrorName(j10));
    }

    public long a() {
        return this.f103051a;
    }

    public o(long j10, String str) {
        super(str);
        this.f103051a = j10;
    }
}
