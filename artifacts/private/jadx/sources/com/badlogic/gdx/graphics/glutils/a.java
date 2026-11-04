package com.badlogic.gdx.graphics.glutils;

import android.opengl.GLES20;
import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes3.dex */
public class a implements com.badlogic.gdx.graphics.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.badlogic.gdx.graphics.l[] f94690a;

    public a() {
        this((com.badlogic.gdx.graphics.l) null, (com.badlogic.gdx.graphics.l) null, (com.badlogic.gdx.graphics.l) null, (com.badlogic.gdx.graphics.l) null, (com.badlogic.gdx.graphics.l) null, (com.badlogic.gdx.graphics.l) null);
    }

    @Override // com.badlogic.gdx.graphics.d
    public void A() {
        if (!e()) {
            throw new t("You need to complete your cubemap data before using it");
        }
        int i10 = 0;
        while (true) {
            com.badlogic.gdx.graphics.l[] lVarArr = this.f94690a;
            if (i10 >= lVarArr.length) {
                return;
            }
            if (!lVarArr[i10].b()) {
                this.f94690a[i10].A();
            }
            i10++;
        }
    }

    @Override // com.badlogic.gdx.graphics.d
    public boolean a() {
        for (com.badlogic.gdx.graphics.l lVar : this.f94690a) {
            if (!lVar.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.badlogic.gdx.graphics.d
    public boolean b() {
        return false;
    }

    @Override // com.badlogic.gdx.graphics.d
    public void c() {
        int i10 = 0;
        while (true) {
            com.badlogic.gdx.graphics.l[] lVarArr = this.f94690a;
            if (i10 >= lVarArr.length) {
                return;
            }
            if (lVarArr[i10].c() == com.badlogic.gdx.graphics.l.b.Custom) {
                this.f94690a[i10].d(34069 + i10);
            } else {
                com.badlogic.gdx.graphics.i iVarE = this.f94690a[i10].e();
                this.f94690a[i10].g();
                if (this.f94690a[i10].getFormat() != iVarE.o()) {
                    com.badlogic.gdx.graphics.i iVar = new com.badlogic.gdx.graphics.i(iVarE.v(), iVarE.s(), this.f94690a[i10].getFormat());
                    com.badlogic.gdx.graphics.i.a aVarN = com.badlogic.gdx.graphics.i.n();
                    com.badlogic.gdx.graphics.i.w(com.badlogic.gdx.graphics.i.a.None);
                    iVar.g(iVarE, 0, 0, 0, 0, iVarE.v(), iVarE.s());
                    com.badlogic.gdx.graphics.i.w(aVarN);
                    if (this.f94690a[i10].g()) {
                        iVarE.a();
                    }
                    iVarE = iVar;
                }
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(i10 + 34069, 0, iVarE.q(), iVarE.v(), iVarE.s(), 0, iVarE.p(), iVarE.r(), iVarE.u());
            }
            i10++;
        }
    }

    public com.badlogic.gdx.graphics.l d(com.badlogic.gdx.graphics.c.a aVar) {
        return this.f94690a[aVar.f94199a];
    }

    public boolean e() {
        int i10 = 0;
        while (true) {
            com.badlogic.gdx.graphics.l[] lVarArr = this.f94690a;
            if (i10 >= lVarArr.length) {
                return true;
            }
            if (lVarArr[i10] == null) {
                return false;
            }
            i10++;
        }
    }

    public void f(com.badlogic.gdx.graphics.c.a aVar, com.badlogic.gdx.files.a aVar2) {
        this.f94690a[aVar.f94199a] = com.badlogic.gdx.graphics.l.a.b(aVar2, false);
    }

    public void g(com.badlogic.gdx.graphics.c.a aVar, com.badlogic.gdx.graphics.i iVar) {
        this.f94690a[aVar.f94199a] = iVar != null ? new i(iVar, null, false, false) : null;
    }

    @Override // com.badlogic.gdx.graphics.d
    public int getHeight() {
        int height;
        int height2;
        int height3;
        int height4;
        com.badlogic.gdx.graphics.l lVar = this.f94690a[com.badlogic.gdx.graphics.c.a.PositiveZ.f94199a];
        if (lVar == null || (height = lVar.getHeight()) <= 0) {
            height = 0;
        }
        com.badlogic.gdx.graphics.l lVar2 = this.f94690a[com.badlogic.gdx.graphics.c.a.NegativeZ.f94199a];
        if (lVar2 != null && (height4 = lVar2.getHeight()) > height) {
            height = height4;
        }
        com.badlogic.gdx.graphics.l lVar3 = this.f94690a[com.badlogic.gdx.graphics.c.a.PositiveX.f94199a];
        if (lVar3 != null && (height3 = lVar3.getHeight()) > height) {
            height = height3;
        }
        com.badlogic.gdx.graphics.l lVar4 = this.f94690a[com.badlogic.gdx.graphics.c.a.NegativeX.f94199a];
        return (lVar4 == null || (height2 = lVar4.getHeight()) <= height) ? height : height2;
    }

    @Override // com.badlogic.gdx.graphics.d
    public int getWidth() {
        int width;
        int width2;
        int width3;
        int width4;
        com.badlogic.gdx.graphics.l lVar = this.f94690a[com.badlogic.gdx.graphics.c.a.PositiveZ.f94199a];
        if (lVar == null || (width = lVar.getWidth()) <= 0) {
            width = 0;
        }
        com.badlogic.gdx.graphics.l lVar2 = this.f94690a[com.badlogic.gdx.graphics.c.a.NegativeZ.f94199a];
        if (lVar2 != null && (width4 = lVar2.getWidth()) > width) {
            width = width4;
        }
        com.badlogic.gdx.graphics.l lVar3 = this.f94690a[com.badlogic.gdx.graphics.c.a.PositiveY.f94199a];
        if (lVar3 != null && (width3 = lVar3.getWidth()) > width) {
            width = width3;
        }
        com.badlogic.gdx.graphics.l lVar4 = this.f94690a[com.badlogic.gdx.graphics.c.a.NegativeY.f94199a];
        return (lVar4 == null || (width2 = lVar4.getWidth()) <= width) ? width : width2;
    }

    public a(com.badlogic.gdx.files.a aVar, com.badlogic.gdx.files.a aVar2, com.badlogic.gdx.files.a aVar3, com.badlogic.gdx.files.a aVar4, com.badlogic.gdx.files.a aVar5, com.badlogic.gdx.files.a aVar6) {
        this(com.badlogic.gdx.graphics.l.a.b(aVar, false), com.badlogic.gdx.graphics.l.a.b(aVar2, false), com.badlogic.gdx.graphics.l.a.b(aVar3, false), com.badlogic.gdx.graphics.l.a.b(aVar4, false), com.badlogic.gdx.graphics.l.a.b(aVar5, false), com.badlogic.gdx.graphics.l.a.b(aVar6, false));
    }

    public a(com.badlogic.gdx.files.a aVar, com.badlogic.gdx.files.a aVar2, com.badlogic.gdx.files.a aVar3, com.badlogic.gdx.files.a aVar4, com.badlogic.gdx.files.a aVar5, com.badlogic.gdx.files.a aVar6, boolean z10) {
        this(com.badlogic.gdx.graphics.l.a.b(aVar, z10), com.badlogic.gdx.graphics.l.a.b(aVar2, z10), com.badlogic.gdx.graphics.l.a.b(aVar3, z10), com.badlogic.gdx.graphics.l.a.b(aVar4, z10), com.badlogic.gdx.graphics.l.a.b(aVar5, z10), com.badlogic.gdx.graphics.l.a.b(aVar6, z10));
    }

    public a(com.badlogic.gdx.graphics.i iVar, com.badlogic.gdx.graphics.i iVar2, com.badlogic.gdx.graphics.i iVar3, com.badlogic.gdx.graphics.i iVar4, com.badlogic.gdx.graphics.i iVar5, com.badlogic.gdx.graphics.i iVar6) {
        this(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, false);
    }

    public a(com.badlogic.gdx.graphics.i iVar, com.badlogic.gdx.graphics.i iVar2, com.badlogic.gdx.graphics.i iVar3, com.badlogic.gdx.graphics.i iVar4, com.badlogic.gdx.graphics.i iVar5, com.badlogic.gdx.graphics.i iVar6, boolean z10) {
        this(iVar == null ? null : new i(iVar, null, z10, false), iVar2 == null ? null : new i(iVar2, null, z10, false), iVar3 == null ? null : new i(iVar3, null, z10, false), iVar4 == null ? null : new i(iVar4, null, z10, false), iVar5 == null ? null : new i(iVar5, null, z10, false), iVar6 == null ? null : new i(iVar6, null, z10, false));
    }

    public a(int i10, int i11, int i12, com.badlogic.gdx.graphics.i.c cVar) {
        this(new i(new com.badlogic.gdx.graphics.i(i12, i11, cVar), null, false, true), new i(new com.badlogic.gdx.graphics.i(i12, i11, cVar), null, false, true), new i(new com.badlogic.gdx.graphics.i(i10, i12, cVar), null, false, true), new i(new com.badlogic.gdx.graphics.i(i10, i12, cVar), null, false, true), new i(new com.badlogic.gdx.graphics.i(i10, i11, cVar), null, false, true), new i(new com.badlogic.gdx.graphics.i(i10, i11, cVar), null, false, true));
    }

    public a(com.badlogic.gdx.graphics.l lVar, com.badlogic.gdx.graphics.l lVar2, com.badlogic.gdx.graphics.l lVar3, com.badlogic.gdx.graphics.l lVar4, com.badlogic.gdx.graphics.l lVar5, com.badlogic.gdx.graphics.l lVar6) {
        this.f94690a = new com.badlogic.gdx.graphics.l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6};
    }
}
