package org.commonmark.internal;

/* JADX INFO: loaded from: classes14.dex */
public class g extends org.commonmark.parser.block.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.commonmark.node.i f337593a = new org.commonmark.node.i();

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean b() {
        return true;
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.parser.block.c c(org.commonmark.parser.block.h hVar) {
        return org.commonmark.parser.block.c.b(hVar.getIndex());
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void f(CharSequence charSequence) {
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean g(org.commonmark.node.b bVar) {
        return true;
    }

    @Override // org.commonmark.parser.block.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public org.commonmark.node.i e() {
        return this.f337593a;
    }
}
