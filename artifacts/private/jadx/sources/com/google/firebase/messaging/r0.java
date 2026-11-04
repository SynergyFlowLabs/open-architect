package com.google.firebase.messaging;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
@k8.a
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.encoders.proto.h f123716a = com.google.firebase.encoders.proto.h.a().e(a.f123395b).d();

    private r0() {
    }

    public static void a(Object obj, OutputStream outputStream) throws IOException {
        f123716a.b(obj, outputStream);
    }

    public static byte[] b(Object obj) {
        return f123716a.c(obj);
    }

    public abstract com.google.firebase.messaging.reporting.b c();
}
