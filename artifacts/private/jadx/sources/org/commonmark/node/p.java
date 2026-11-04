package org.commonmark.node;

/* JADX INFO: loaded from: classes14.dex */
public class p extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f337731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f337732g;

    public p() {
    }

    @Override // org.commonmark.node.v
    public void c(c0 c0Var) {
        c0Var.C(this);
    }

    @Override // org.commonmark.node.v
    protected String n() {
        return "destination=" + this.f337731f + ", title=" + this.f337732g;
    }

    public String p() {
        return this.f337731f;
    }

    public String q() {
        return this.f337732g;
    }

    public void r(String str) {
        this.f337731f = str;
    }

    public void s(String str) {
        this.f337732g = str;
    }

    public p(String str, String str2) {
        this.f337731f = str;
        this.f337732g = str2;
    }
}
