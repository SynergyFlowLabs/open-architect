package com.google.api.client.json;

import com.google.api.client.util.p0;
import com.google.api.client.util.s;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class b extends s implements Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f115762c;

    @Override // com.google.api.client.util.s, java.util.AbstractMap
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return (b) super.clone();
    }

    public final d h() {
        return this.f115762c;
    }

    @Override // com.google.api.client.util.s
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b e(String str, Object obj) {
        return (b) super.e(str, obj);
    }

    public final void j(d dVar) {
        this.f115762c = dVar;
    }

    public String k() throws IOException {
        d dVar = this.f115762c;
        return dVar != null ? dVar.n(this) : super.toString();
    }

    @Override // java.util.AbstractMap
    public String toString() {
        d dVar = this.f115762c;
        if (dVar == null) {
            return super.toString();
        }
        try {
            return dVar.o(this);
        } catch (IOException e10) {
            throw p0.a(e10);
        }
    }
}
