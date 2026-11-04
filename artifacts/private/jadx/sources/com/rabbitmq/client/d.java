package com.rabbitmq.client;

/* JADX INFO: loaded from: classes13.dex */
public class d extends l1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f265041f = 1;

    public d(l1 l1Var) {
        this(l1Var, null);
    }

    private static String g(l1 l1Var) {
        return (l1Var.d() ? "connection " : "channel ") + "is already closed due to ";
    }

    public d(l1 l1Var, Throwable th2) {
        super(l1Var.d(), l1Var.e(), l1Var.b(), l1Var.c(), g(l1Var), th2 == null ? l1Var.getCause() : th2);
    }
}
