package com.rabbitmq.client;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class l2 extends IOException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f265964c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f265965d = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f265967b;

    public l2(int i10) {
        this(i10, -1);
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (this.f265967b == -1) {
            return super.toString() + "<" + this.f265966a + ">";
        }
        return super.toString() + "<" + this.f265966a + "." + this.f265967b + ">";
    }

    public l2(int i10, int i11) {
        this.f265966a = i10;
        this.f265967b = i11;
    }
}
