package org.commonmark.internal;

/* JADX INFO: loaded from: classes14.dex */
public class i extends org.commonmark.parser.block.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.commonmark.node.k f337612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f337613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f337614c;

    public static class a extends org.commonmark.parser.block.b {
        @Override // org.commonmark.parser.block.e
        public org.commonmark.parser.block.f a(org.commonmark.parser.block.h hVar, org.commonmark.parser.block.g gVar) {
            int iA = hVar.a();
            if (iA >= org.commonmark.internal.util.d.f337718k) {
                return org.commonmark.parser.block.f.c();
            }
            int iD = hVar.d();
            i iVarK = i.k(hVar.c(), iD, iA);
            if (iVarK == null) {
                return org.commonmark.parser.block.f.c();
            }
            int i10 = 2 & 1;
            return org.commonmark.parser.block.f.d(iVarK).b(iD + iVarK.f337612a.s());
        }
    }

    public i(char c10, int i10, int i11) {
        org.commonmark.node.k kVar = new org.commonmark.node.k();
        this.f337612a = kVar;
        this.f337614c = new StringBuilder();
        kVar.v(c10);
        kVar.x(i10);
        kVar.w(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i k(CharSequence charSequence, int i10, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i10; i14 < length; i14++) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt == '`') {
                i12++;
            } else {
                if (cCharAt != '~') {
                    break;
                }
                i13++;
            }
        }
        if (i12 >= 3 && i13 == 0) {
            if (org.commonmark.internal.util.d.b('`', charSequence, i10 + i12) != -1) {
                return null;
            }
            return new i('`', i12, i11);
        }
        if (i13 < 3 || i12 != 0) {
            return null;
        }
        return new i('~', i13, i11);
    }

    private boolean l(CharSequence charSequence, int i10) {
        char cQ = this.f337612a.q();
        int iS = this.f337612a.s();
        int iK = org.commonmark.internal.util.d.k(cQ, charSequence, i10, charSequence.length()) - i10;
        return iK >= iS && org.commonmark.internal.util.d.m(charSequence, i10 + iK, charSequence.length()) == charSequence.length();
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.parser.block.c c(org.commonmark.parser.block.h hVar) {
        int iD = hVar.d();
        int index = hVar.getIndex();
        CharSequence charSequenceC = hVar.c();
        if (hVar.a() < org.commonmark.internal.util.d.f337718k && l(charSequenceC, iD)) {
            return org.commonmark.parser.block.c.c();
        }
        int length = charSequenceC.length();
        for (int iR = this.f337612a.r(); iR > 0 && index < length && charSequenceC.charAt(index) == ' '; iR--) {
            index++;
        }
        return org.commonmark.parser.block.c.b(index);
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.node.b e() {
        return this.f337612a;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void f(CharSequence charSequence) {
        if (this.f337613b == null) {
            this.f337613b = charSequence.toString();
        } else {
            this.f337614c.append(charSequence);
            this.f337614c.append('\n');
        }
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void h() {
        this.f337612a.y(org.commonmark.internal.util.a.g(this.f337613b.trim()));
        this.f337612a.z(this.f337614c.toString());
    }
}
