package org.commonmark.node;

/* JADX INFO: loaded from: classes14.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f337740a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f337741b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v f337742c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v f337743d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v f337744e = null;

    public abstract void c(c0 c0Var);

    public void d(v vVar) {
        vVar.o();
        vVar.m(this);
        v vVar2 = this.f337742c;
        if (vVar2 == null) {
            this.f337741b = vVar;
            this.f337742c = vVar;
        } else {
            vVar2.f337744e = vVar;
            vVar.f337743d = vVar2;
            this.f337742c = vVar;
        }
    }

    public v e() {
        return this.f337741b;
    }

    public v f() {
        return this.f337742c;
    }

    public v g() {
        return this.f337744e;
    }

    public v h() {
        return this.f337740a;
    }

    public v i() {
        return this.f337743d;
    }

    public void j(v vVar) {
        vVar.o();
        v vVar2 = this.f337744e;
        vVar.f337744e = vVar2;
        if (vVar2 != null) {
            vVar2.f337743d = vVar;
        }
        vVar.f337743d = this;
        this.f337744e = vVar;
        v vVar3 = this.f337740a;
        vVar.f337740a = vVar3;
        if (vVar.f337744e == null) {
            vVar3.f337742c = vVar;
        }
    }

    public void k(v vVar) {
        vVar.o();
        v vVar2 = this.f337743d;
        vVar.f337743d = vVar2;
        if (vVar2 != null) {
            vVar2.f337744e = vVar;
        }
        vVar.f337744e = this;
        this.f337743d = vVar;
        v vVar3 = this.f337740a;
        vVar.f337740a = vVar3;
        if (vVar.f337743d == null) {
            vVar3.f337741b = vVar;
        }
    }

    public void l(v vVar) {
        vVar.o();
        vVar.m(this);
        v vVar2 = this.f337741b;
        if (vVar2 == null) {
            this.f337741b = vVar;
            this.f337742c = vVar;
        } else {
            vVar2.f337743d = vVar;
            vVar.f337744e = vVar2;
            this.f337741b = vVar;
        }
    }

    protected void m(v vVar) {
        this.f337740a = vVar;
    }

    protected String n() {
        return "";
    }

    public void o() {
        v vVar = this.f337743d;
        if (vVar != null) {
            vVar.f337744e = this.f337744e;
        } else {
            v vVar2 = this.f337740a;
            if (vVar2 != null) {
                vVar2.f337741b = this.f337744e;
            }
        }
        v vVar3 = this.f337744e;
        if (vVar3 != null) {
            vVar3.f337743d = vVar;
        } else {
            v vVar4 = this.f337740a;
            if (vVar4 != null) {
                vVar4.f337742c = vVar;
            }
        }
        this.f337740a = null;
        this.f337744e = null;
        this.f337743d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + n() + "}";
    }
}
