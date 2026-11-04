package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.o0;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.badlogic.gdx.utils.b<o> f94926a = new com.badlogic.gdx.utils.b<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0<o> f94927b = new a();

    class a extends o0<o> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.badlogic.gdx.utils.o0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public o e() {
            return new o();
        }
    }

    public com.badlogic.gdx.utils.b<o> a(int i10, int i11, int i12, int i13) {
        this.f94927b.c(this.f94926a);
        this.f94926a.clear();
        return b(i10, i11, i12, i13, this.f94927b, this.f94926a);
    }

    public com.badlogic.gdx.utils.b<o> b(int i10, int i11, int i12, int i13, o0<o> o0Var, com.badlogic.gdx.utils.b<o> bVar) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = -1;
        int i17 = i14 < 0 ? -1 : i14 > 0 ? 1 : 0;
        int i18 = i17;
        int i19 = i15 < 0 ? -1 : i15 > 0 ? 1 : 0;
        int iAbs = Math.abs(i14);
        int iAbs2 = Math.abs(i15);
        if (iAbs <= iAbs2) {
            iAbs = Math.abs(i15);
            iAbs2 = Math.abs(i14);
            if (i15 >= 0) {
                i16 = i15 > 0 ? 1 : 0;
            }
            i18 = 0;
        } else {
            i16 = 0;
        }
        int i20 = iAbs >> 1;
        for (int i21 = 0; i21 <= iAbs; i21++) {
            o oVarF = o0Var.f();
            oVarF.a(i10, i11);
            bVar.c(oVarF);
            i20 += iAbs2;
            if (i20 > iAbs) {
                i20 -= iAbs;
                i10 += i17;
                i11 += i19;
            } else {
                i10 += i18;
                i11 += i16;
            }
        }
        return bVar;
    }

    public com.badlogic.gdx.utils.b<o> c(o oVar, o oVar2) {
        return a(oVar.f95002a, oVar.f95003b, oVar2.f95002a, oVar2.f95003b);
    }
}
