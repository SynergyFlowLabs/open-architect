package com.google.api.client.googleapis.services.json;

import com.google.api.client.http.q;
import com.google.api.client.http.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b<T> extends com.google.api.client.googleapis.services.b<T> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f115522s;

    /* JADX WARN: Illegal instructions before constructor call */
    protected b(a aVar, String str, String str2, Object obj, Class<T> cls) {
        p7.a aVarL = null;
        if (obj != null) {
            aVarL = new p7.a(aVar.o(), obj).l(aVar.f().f().isEmpty() ? null : "data");
        }
        super(aVar, str, str2, aVarL, cls);
        this.f115522s = obj;
    }

    @Override // com.google.api.client.googleapis.services.b
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public a w() {
        return (a) super.w();
    }

    public Object U() {
        return this.f115522s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.api.client.googleapis.services.b
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public o7.c L(x xVar) {
        return o7.c.h(w().o(), xVar);
    }

    public final void W(com.google.api.client.googleapis.batch.b bVar, m7.a<T> aVar) throws IOException {
        super.M(bVar, o7.b.class, aVar);
    }

    @Override // com.google.api.client.googleapis.services.b, com.google.api.client.util.s
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b<T> j0(String str, Object obj) {
        return (b) super.j0(str, obj);
    }

    @Override // com.google.api.client.googleapis.services.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b<T> P(boolean z10) {
        return (b) super.P(z10);
    }

    @Override // com.google.api.client.googleapis.services.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public b<T> Q(q qVar) {
        return (b) super.Q(qVar);
    }
}
