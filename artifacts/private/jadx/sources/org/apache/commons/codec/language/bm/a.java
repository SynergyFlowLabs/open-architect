package org.apache.commons.codec.language.bm;

import nk.j;

/* JADX INFO: loaded from: classes9.dex */
public class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f335299a = new e(d.GENERIC, h.APPROX, true);

    @Override // nk.g
    public Object a(Object obj) throws nk.h {
        if (obj instanceof String) {
            return f((String) obj);
        }
        throw new nk.h("BeiderMorseEncoder encode parameter is not of type String");
    }

    public d b() {
        return this.f335299a.f();
    }

    public h c() {
        return this.f335299a.g();
    }

    public boolean d() {
        return this.f335299a.h();
    }

    @Override // nk.j
    public String f(String str) throws nk.h {
        if (str == null) {
            return null;
        }
        return this.f335299a.b(str);
    }

    public void g(boolean z10) {
        this.f335299a = new e(this.f335299a.f(), this.f335299a.g(), z10, this.f335299a.e());
    }

    public void h(int i10) {
        this.f335299a = new e(this.f335299a.f(), this.f335299a.g(), this.f335299a.h(), i10);
    }

    public void i(d dVar) {
        this.f335299a = new e(dVar, this.f335299a.g(), this.f335299a.h(), this.f335299a.e());
    }

    public void j(h hVar) {
        this.f335299a = new e(this.f335299a.f(), hVar, this.f335299a.h(), this.f335299a.e());
    }
}
