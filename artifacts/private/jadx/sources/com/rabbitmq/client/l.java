package com.rabbitmq.client;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes13.dex */
public class l extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f265955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f265956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f265957c;

    public l(TimeoutException timeoutException, Object obj, int i10, o0 o0Var) {
        super("Continuation call for method " + o0Var + " on channel " + obj + " (#" + i10 + ") timed out", timeoutException);
        this.f265955a = obj;
        this.f265956b = i10;
        this.f265957c = o0Var;
    }

    public Object a() {
        return this.f265955a;
    }

    public int b() {
        return this.f265956b;
    }

    public o0 c() {
        return this.f265957c;
    }
}
