package org.msgpack.core;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes14.dex */
public class f extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BigInteger f339261b;

    public f(BigInteger bigInteger) {
        this.f339261b = bigInteger;
    }

    public BigInteger b() {
        return this.f339261b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f339261b.toString();
    }

    public f(long j10) {
        this(BigInteger.valueOf(j10));
    }

    public f(String str, BigInteger bigInteger) {
        super(str);
        this.f339261b = bigInteger;
    }
}
