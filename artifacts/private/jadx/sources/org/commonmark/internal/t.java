package org.commonmark.internal;

import org.commonmark.node.b0;

/* JADX INFO: loaded from: classes14.dex */
public class t extends org.commonmark.parser.block.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f337695a = new b0();

    public static class a extends org.commonmark.parser.block.b {
        @Override // org.commonmark.parser.block.e
        public org.commonmark.parser.block.f a(org.commonmark.parser.block.h hVar, org.commonmark.parser.block.g gVar) {
            if (hVar.a() >= 4) {
                return org.commonmark.parser.block.f.c();
            }
            int iD = hVar.d();
            CharSequence charSequenceC = hVar.c();
            return t.j(charSequenceC, iD) ? org.commonmark.parser.block.f.d(new t()).b(charSequenceC.length()) : org.commonmark.parser.block.f.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    i13++;
                } else if (cCharAt == '-') {
                    i11++;
                } else {
                    if (cCharAt != '_') {
                        return false;
                    }
                    i12++;
                }
            }
            i10++;
        }
        return (i11 >= 3 && i12 == 0 && i13 == 0) || (i12 >= 3 && i11 == 0 && i13 == 0) || (i13 >= 3 && i11 == 0 && i12 == 0);
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.parser.block.c c(org.commonmark.parser.block.h hVar) {
        return org.commonmark.parser.block.c.d();
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.node.b e() {
        return this.f337695a;
    }
}
