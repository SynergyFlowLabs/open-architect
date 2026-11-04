package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.d;
import com.google.firebase.messaging.r0;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f123773b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.messaging.reporting.a f123774a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.firebase.messaging.reporting.a f123775a = null;

        a() {
        }

        public b a() {
            return new b(this.f123775a);
        }

        public a b(com.google.firebase.messaging.reporting.a aVar) {
            this.f123775a = aVar;
            return this;
        }
    }

    b(com.google.firebase.messaging.reporting.a aVar) {
        this.f123774a = aVar;
    }

    public static b a() {
        return f123773b;
    }

    public static a d() {
        return new a();
    }

    @k8.a.b
    public com.google.firebase.messaging.reporting.a b() {
        com.google.firebase.messaging.reporting.a aVarF = this.f123774a;
        if (aVarF == null) {
            aVarF = com.google.firebase.messaging.reporting.a.f();
        }
        return aVarF;
    }

    @d(tag = 1)
    @k8.a.InterfaceC2244a(name = "messagingClientEvent")
    public com.google.firebase.messaging.reporting.a c() {
        return this.f123774a;
    }

    public byte[] e() {
        return r0.b(this);
    }

    public void f(OutputStream outputStream) throws IOException {
        r0.a(this, outputStream);
    }
}
