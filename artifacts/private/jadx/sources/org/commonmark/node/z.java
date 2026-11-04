package org.commonmark.node;

/* JADX INFO: loaded from: classes14.dex */
public class z extends v implements h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f337747f;

    public z() {
    }

    @Override // org.commonmark.node.h
    public String a() {
        return this.f337747f;
    }

    @Override // org.commonmark.node.h
    public String b() {
        return this.f337747f;
    }

    @Override // org.commonmark.node.v
    public void c(c0 c0Var) {
        c0Var.G(this);
    }

    public void p(String str) {
        this.f337747f = str;
    }

    public z(String str) {
        this.f337747f = str;
    }
}
