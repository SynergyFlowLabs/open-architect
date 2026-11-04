package com.google.vr.sdk.base;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f127586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f127587b;

    public h(m mVar, g gVar) {
        this.f127586a = mVar;
        this.f127587b = gVar;
    }

    public g a() {
        return this.f127587b;
    }

    public m b() {
        return this.f127586a;
    }

    public void c(g gVar) {
        this.f127587b = new g(gVar);
    }

    public void d(m mVar) {
        this.f127586a = new m(mVar);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f127586a.equals(hVar.f127586a) && this.f127587b.equals(hVar.f127587b);
    }

    public h(h hVar) {
        this.f127586a = new m(hVar.f127586a);
        this.f127587b = new g(hVar.f127587b);
    }
}
