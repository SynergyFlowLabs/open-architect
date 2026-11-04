package org.commonmark.node;

/* JADX INFO: loaded from: classes14.dex */
public class a0 extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f337719f;

    public a0() {
    }

    @Override // org.commonmark.node.v
    public void c(c0 c0Var) {
        c0Var.A(this);
    }

    @Override // org.commonmark.node.v
    protected String n() {
        return "literal=" + this.f337719f;
    }

    public String p() {
        return this.f337719f;
    }

    public void q(String str) {
        this.f337719f = str;
    }

    public a0(String str) {
        this.f337719f = str;
    }
}
