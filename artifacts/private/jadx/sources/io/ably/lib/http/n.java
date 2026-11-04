package io.ably.lib.http;

import io.ably.lib.types.a0;
import io.ably.lib.types.b0;

/* JADX INFO: loaded from: classes13.dex */
public class n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<T> f287423a;

    public n(f fVar, String str, b0[] b0VarArr, b0[] b0VarArr2, i.b<T> bVar) {
        this(fVar, str, b0VarArr, b0VarArr2, null, bVar);
    }

    public a0<T> a() throws io.ably.lib.types.a {
        return this.f287423a.h().b();
    }

    public n(f fVar, String str, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.b<T> bVar) {
        this.f287423a = new d<>(fVar, str, b0VarArr, b0VarArr2, cVar, bVar);
    }
}
