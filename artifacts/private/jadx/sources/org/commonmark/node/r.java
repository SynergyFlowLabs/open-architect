package org.commonmark.node;

/* JADX INFO: loaded from: classes14.dex */
public class r extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f337734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f337735g;

    public r() {
    }

    @Override // org.commonmark.node.v
    public void c(c0 c0Var) {
        c0Var.q(this);
    }

    @Override // org.commonmark.node.v
    protected String n() {
        return "destination=" + this.f337734f + ", title=" + this.f337735g;
    }

    public String p() {
        return this.f337734f;
    }

    public String q() {
        return this.f337735g;
    }

    public void r(String str) {
        this.f337734f = str;
    }

    public void s(String str) {
        this.f337735g = str;
    }

    public r(String str, String str2) {
        this.f337734f = str;
        this.f337735g = str2;
    }
}
