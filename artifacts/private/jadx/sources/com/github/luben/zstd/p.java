package com.github.luben.zstd;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class p extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f103052a;

    public p(long j10) {
        this(Zstd.getErrorCode(j10), Zstd.getErrorName(j10));
    }

    public long a() {
        return this.f103052a;
    }

    public p(long j10, String str) {
        super(str);
        this.f103052a = j10;
    }
}
