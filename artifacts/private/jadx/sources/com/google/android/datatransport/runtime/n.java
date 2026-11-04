package com.google.android.datatransport.runtime;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
@k8.a
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.encoders.proto.h f103585a = com.google.firebase.encoders.proto.h.a().e(a.f103426b).d();

    private n() {
    }

    public static void a(Object obj, OutputStream outputStream) throws IOException {
        f103585a.b(obj, outputStream);
    }

    public static byte[] b(Object obj) {
        return f103585a.c(obj);
    }

    public abstract com.google.android.datatransport.runtime.firebase.transport.a c();
}
