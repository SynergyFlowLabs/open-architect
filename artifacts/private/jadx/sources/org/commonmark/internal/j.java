package org.commonmark.internal;

/* JADX INFO: loaded from: classes14.dex */
public class j extends org.commonmark.parser.block.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.commonmark.node.m f337616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f337617b;

    public static class a extends org.commonmark.parser.block.b {
        @Override // org.commonmark.parser.block.e
        public org.commonmark.parser.block.f a(org.commonmark.parser.block.h hVar, org.commonmark.parser.block.g gVar) {
            CharSequence charSequenceB;
            if (hVar.a() >= org.commonmark.internal.util.d.f337718k) {
                return org.commonmark.parser.block.f.c();
            }
            CharSequence charSequenceC = hVar.c();
            int iD = hVar.d();
            j jVarK = j.k(charSequenceC, iD);
            if (jVarK != null) {
                return org.commonmark.parser.block.f.d(jVarK).b(charSequenceC.length());
            }
            int iL = j.l(charSequenceC, iD);
            return (iL <= 0 || (charSequenceB = gVar.b()) == null) ? org.commonmark.parser.block.f.c() : org.commonmark.parser.block.f.d(new j(iL, charSequenceB.toString())).b(charSequenceC.length()).e();
        }
    }

    public j(int i10, String str) {
        org.commonmark.node.m mVar = new org.commonmark.node.m();
        this.f337616a = mVar;
        mVar.r(i10);
        this.f337617b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j k(CharSequence charSequence, int i10) {
        int iK = org.commonmark.internal.util.d.k('#', charSequence, i10, charSequence.length()) - i10;
        if (iK != 0 && iK <= 6) {
            int i11 = i10 + iK;
            if (i11 >= charSequence.length()) {
                return new j(iK, "");
            }
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return null;
            }
            int iN = org.commonmark.internal.util.d.n(charSequence, charSequence.length() - 1, i11);
            int iL = org.commonmark.internal.util.d.l('#', charSequence, iN, i11);
            int iN2 = org.commonmark.internal.util.d.n(charSequence, iL, i11);
            return iN2 != iL ? new j(iK, charSequence.subSequence(i11, iN2 + 1).toString()) : new j(iK, charSequence.subSequence(i11, iN + 1).toString());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    public static int l(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt == '-') {
            if (m(charSequence, i10 + 1, org.apache.commons.codec.language.l.f335457d)) {
                return 2;
            }
        } else if (cCharAt == '=') {
            if (m(charSequence, i10 + 1, '=')) {
                return 1;
            }
            if (m(charSequence, i10 + 1, org.apache.commons.codec.language.l.f335457d)) {
                return 2;
            }
        }
        return 0;
    }

    private static boolean m(CharSequence charSequence, int i10, char c10) {
        return org.commonmark.internal.util.d.m(charSequence, org.commonmark.internal.util.d.k(c10, charSequence, i10, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void a(org.commonmark.parser.a aVar) {
        aVar.a(this.f337617b, this.f337616a);
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.parser.block.c c(org.commonmark.parser.block.h hVar) {
        return org.commonmark.parser.block.c.d();
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.node.b e() {
        return this.f337616a;
    }
}
