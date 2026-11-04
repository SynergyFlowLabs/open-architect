package com.google.api.client.googleapis.notifications;

import com.google.api.client.http.s;
import com.google.api.client.util.e0;
import com.google.api.client.util.h0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public abstract class f<T> implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f115480a = 1;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.api.client.googleapis.notifications.h
    public final void B2(d dVar, g gVar) throws IOException {
        e eVar = new e(gVar);
        String strS = gVar.s();
        if (strS != null) {
            eVar.w(b().a(gVar.r(), new s(strS).f(), (Class) h0.d(a())));
        }
        c(dVar, eVar);
    }

    protected abstract Class<T> a() throws IOException;

    protected abstract e0 b() throws IOException;

    protected abstract void c(d dVar, e<T> eVar) throws IOException;
}
