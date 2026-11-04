package org.commonmark.internal;

import org.commonmark.node.u;
import org.commonmark.node.w;

/* JADX INFO: loaded from: classes14.dex */
public class p extends org.commonmark.parser.block.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.commonmark.node.t f337673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f337674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f337675c;

    public static class a extends org.commonmark.parser.block.b {
        @Override // org.commonmark.parser.block.e
        public org.commonmark.parser.block.f a(org.commonmark.parser.block.h hVar, org.commonmark.parser.block.g gVar) {
            org.commonmark.parser.block.d dVarA = gVar.a();
            if (hVar.a() >= org.commonmark.internal.util.d.f337718k) {
                return org.commonmark.parser.block.f.c();
            }
            b bVarN = p.n(hVar.c(), hVar.d(), hVar.f() + hVar.a(), gVar.b() != null);
            if (bVarN == null) {
                return org.commonmark.parser.block.f.c();
            }
            int i10 = bVarN.f337677b;
            q qVar = new q(i10 - hVar.f());
            if ((dVarA instanceof p) && p.m((org.commonmark.node.t) dVarA.e(), bVarN.f337676a)) {
                return org.commonmark.parser.block.f.d(qVar).a(i10);
            }
            p pVar = new p(bVarN.f337676a);
            bVarN.f337676a.r(true);
            return org.commonmark.parser.block.f.d(pVar, qVar).a(i10);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.commonmark.node.t f337676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f337677b;

        b(org.commonmark.node.t tVar, int i10) {
            this.f337676a = tVar;
            this.f337677b = i10;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.commonmark.node.t f337678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f337679b;

        c(org.commonmark.node.t tVar, int i10) {
            this.f337678a = tVar;
            this.f337679b = i10;
        }
    }

    public p(org.commonmark.node.t tVar) {
        this.f337673a = tVar;
    }

    private static boolean k(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static boolean l(CharSequence charSequence, int i10) {
        char cCharAt;
        return i10 >= charSequence.length() || (cCharAt = charSequence.charAt(i10)) == '\t' || cCharAt == ' ';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(org.commonmark.node.t tVar, org.commonmark.node.t tVar2) {
        if ((tVar instanceof org.commonmark.node.d) && (tVar2 instanceof org.commonmark.node.d)) {
            return k(Character.valueOf(((org.commonmark.node.d) tVar).s()), Character.valueOf(((org.commonmark.node.d) tVar2).s()));
        }
        if ((tVar instanceof w) && (tVar2 instanceof w)) {
            return k(Character.valueOf(((w) tVar).s()), Character.valueOf(((w) tVar2).s()));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b n(CharSequence charSequence, int i10, int i11, boolean z10) {
        boolean z11;
        c cVarO = o(charSequence, i10);
        if (cVarO == null) {
            return null;
        }
        org.commonmark.node.t tVar = cVarO.f337678a;
        int i12 = cVarO.f337679b;
        int i13 = i11 + (i12 - i10);
        int length = charSequence.length();
        int iA = i13;
        while (true) {
            if (i12 >= length) {
                z11 = false;
                break;
            }
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt != '\t') {
                if (cCharAt != ' ') {
                    z11 = true;
                    break;
                }
                iA++;
            } else {
                iA += org.commonmark.internal.util.d.a(iA);
            }
            i12++;
        }
        if (z10 && (((tVar instanceof w) && ((w) tVar).t() != 1) || !z11)) {
            return null;
        }
        if (!z11 || iA - i13 > org.commonmark.internal.util.d.f337718k) {
            iA = i13 + 1;
        }
        return new b(tVar, iA);
    }

    private static c o(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt != '*' && cCharAt != '+' && cCharAt != '-') {
            return p(charSequence, i10);
        }
        int i11 = i10 + 1;
        if (!l(charSequence, i11)) {
            return null;
        }
        org.commonmark.node.d dVar = new org.commonmark.node.d();
        dVar.t(cCharAt);
        return new c(dVar, i11);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    /* JADX WARN: Code duplicated, block: B:5:0x000a  */
    private static c p(CharSequence charSequence, int i10) {
        int i11;
        int length = charSequence.length();
        int i12 = 0;
        for (int i13 = i10; i13 < length; i13++) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt != ')' || cCharAt == '.') {
                if (i12 >= 1) {
                    i11 = i13 + 1;
                    if (l(charSequence, i11)) {
                        String string = charSequence.subSequence(i10, i13).toString();
                        w wVar = new w();
                        wVar.v(Integer.parseInt(string));
                        wVar.u(cCharAt);
                        return new c(wVar, i11);
                    }
                }
                return null;
            }
            switch (cCharAt) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                    i12++;
                    if (i12 > 9) {
                        return null;
                    }
                    break;
                    break;
                default:
                    return null;
            }
            while (i13 < length) {
                char cCharAt2 = charSequence.charAt(i13);
                if (cCharAt2 != ')') {
                }
                if (i12 >= 1) {
                    i11 = i13 + 1;
                    if (l(charSequence, i11)) {
                        String string2 = charSequence.subSequence(i10, i13).toString();
                        w wVar2 = new w();
                        wVar2.v(Integer.parseInt(string2));
                        wVar2.u(cCharAt2);
                        return new c(wVar2, i11);
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean b() {
        return true;
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.parser.block.c c(org.commonmark.parser.block.h hVar) {
        if (hVar.b()) {
            this.f337674b = true;
            this.f337675c = 0;
        } else if (this.f337674b) {
            this.f337675c++;
        }
        return org.commonmark.parser.block.c.b(hVar.getIndex());
    }

    @Override // org.commonmark.parser.block.d
    public org.commonmark.node.b e() {
        return this.f337673a;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean g(org.commonmark.node.b bVar) {
        if (!(bVar instanceof u)) {
            return false;
        }
        if (this.f337674b && this.f337675c == 1) {
            this.f337673a.r(false);
            this.f337674b = false;
        }
        return true;
    }
}
