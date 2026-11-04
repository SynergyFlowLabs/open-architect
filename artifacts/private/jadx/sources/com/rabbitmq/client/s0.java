package com.rabbitmq.client;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class s0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f266050a = 1;

    public s0(Throwable th2) {
        super("Possibly caused by authentication failure");
        super.initCause(th2);
    }

    public s0(String str) {
        super(str);
    }
}
