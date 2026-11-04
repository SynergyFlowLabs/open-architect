package com.rabbitmq.client;

/* JADX INFO: loaded from: classes13.dex */
public enum i {
    DIRECT(com.google.android.gms.fido.fido2.api.common.b.f107262q1),
    FANOUT("fanout"),
    TOPIC("topic"),
    HEADERS("headers");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f265106a;

    i(String str) {
        this.f265106a = str;
    }

    public String k() {
        return this.f265106a;
    }
}
