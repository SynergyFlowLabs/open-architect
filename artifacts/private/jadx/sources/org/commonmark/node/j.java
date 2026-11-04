package org.commonmark.node;

/* JADX INFO: loaded from: classes14.dex */
public class j extends v implements h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f337722f;

    public j() {
    }

    @Override // org.commonmark.node.h
    public String a() {
        return this.f337722f;
    }

    @Override // org.commonmark.node.h
    public String b() {
        return this.f337722f;
    }

    @Override // org.commonmark.node.v
    public void c(c0 c0Var) {
        c0Var.K(this);
    }

    public void p(String str) {
        this.f337722f = str;
    }

    public j(String str) {
        this.f337722f = str;
    }
}
