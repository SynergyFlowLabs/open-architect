package org.commonmark.internal;

/* JADX INFO: loaded from: classes14.dex */
public class c extends org.commonmark.parser.block.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.commonmark.node.c f337573a = new org.commonmark.node.c();

    public static class a extends org.commonmark.parser.block.b {
        @Override // org.commonmark.parser.block.e
        public org.commonmark.parser.block.f a(org.commonmark.parser.block.h hVar, org.commonmark.parser.block.g gVar) {
            int iD = hVar.d();
            if (!c.k(hVar, iD)) {
                return org.commonmark.parser.block.f.c();
            }
            int iF = hVar.f() + hVar.a();
            int i10 = iF + 1;
            if (org.commonmark.internal.util.d.i(hVar.c(), iD + 1)) {
                i10 = iF + 2;
            }
            return org.commonmark.parser.block.f.d(new c()).a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(org.commonmark.parser.block.h hVar, int i10) {
        CharSequence charSequenceC = hVar.c();
        return hVar.a() < org.commonmark.internal.util.d.f337718k && i10 < charSequenceC.length() && charSequenceC.charAt(i10) == '>';
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean b() {
        return true;
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.parser.block.c c(org.commonmark.parser.block.h hVar) {
        int iD = hVar.d();
        if (!k(hVar, iD)) {
            return org.commonmark.parser.block.c.d();
        }
        int iF = hVar.f() + hVar.a();
        int i10 = iF + 1;
        if (org.commonmark.internal.util.d.i(hVar.c(), iD + 1)) {
            i10 = iF + 2;
        }
        return org.commonmark.parser.block.c.a(i10);
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean g(org.commonmark.node.b bVar) {
        return true;
    }

    @Override // org.commonmark.parser.block.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public org.commonmark.node.c e() {
        return this.f337573a;
    }
}
