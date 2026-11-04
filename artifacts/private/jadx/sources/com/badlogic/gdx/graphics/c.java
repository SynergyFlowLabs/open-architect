package com.badlogic.gdx.graphics;

import android.opengl.GLES20;
import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes3.dex */
public class c extends e implements bc.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected d f94191g;

    public enum a {
        PositiveX(0, 34069),
        NegativeX(1, 34070),
        PositiveY(2, 34071),
        NegativeY(3, 34072),
        PositiveZ(4, 34073),
        NegativeZ(5, 34074);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f94199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f94200b;

        a(int i10, int i11) {
            this.f94199a = i10;
            this.f94200b = i11;
        }

        public int l() {
            return this.f94200b;
        }
    }

    public c(d dVar) {
        super(34067);
        this.f94191g = dVar;
        F(dVar);
    }

    public void F(d dVar) {
        if (!dVar.b()) {
            dVar.A();
        }
        i0();
        A(this.f94203c, this.f94204d, true);
        C(this.f94205e, this.f94206f, true);
        dVar.c();
        GLES20.glBindTexture(this.f94201a, 0);
    }

    @Override // com.badlogic.gdx.graphics.e, gc.e
    public void dispose() {
        if (this.f94202b == 0) {
            return;
        }
        b();
    }

    @Override // com.badlogic.gdx.graphics.e
    public int e() {
        return 0;
    }

    @Override // com.badlogic.gdx.graphics.e
    public int f() {
        return this.f94191g.getHeight();
    }

    @Override // com.badlogic.gdx.graphics.e
    public int o() {
        return this.f94191g.getWidth();
    }

    @Override // com.badlogic.gdx.graphics.e
    public boolean q() {
        return this.f94191g.a();
    }

    @Override // com.badlogic.gdx.graphics.e
    protected void u() {
        if (!q()) {
            throw new t("Tried to reload an unmanaged Cubemap");
        }
        this.f94202b = com.badlogic.gdx.graphics.glutils.d.h();
        F(this.f94191g);
    }

    public c(com.badlogic.gdx.files.a aVar, com.badlogic.gdx.files.a aVar2, com.badlogic.gdx.files.a aVar3, com.badlogic.gdx.files.a aVar4, com.badlogic.gdx.files.a aVar5, com.badlogic.gdx.files.a aVar6) {
        this(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, false);
    }

    public c(com.badlogic.gdx.files.a aVar, com.badlogic.gdx.files.a aVar2, com.badlogic.gdx.files.a aVar3, com.badlogic.gdx.files.a aVar4, com.badlogic.gdx.files.a aVar5, com.badlogic.gdx.files.a aVar6, boolean z10) {
        this(l.a.b(aVar, z10), l.a.b(aVar2, z10), l.a.b(aVar3, z10), l.a.b(aVar4, z10), l.a.b(aVar5, z10), l.a.b(aVar6, z10));
    }

    public c(i iVar, i iVar2, i iVar3, i iVar4, i iVar5, i iVar6) {
        this(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, false);
    }

    public c(i iVar, i iVar2, i iVar3, i iVar4, i iVar5, i iVar6, boolean z10) {
        this(iVar == null ? null : new com.badlogic.gdx.graphics.glutils.i(iVar, null, z10, false), iVar2 == null ? null : new com.badlogic.gdx.graphics.glutils.i(iVar2, null, z10, false), iVar3 == null ? null : new com.badlogic.gdx.graphics.glutils.i(iVar3, null, z10, false), iVar4 == null ? null : new com.badlogic.gdx.graphics.glutils.i(iVar4, null, z10, false), iVar5 == null ? null : new com.badlogic.gdx.graphics.glutils.i(iVar5, null, z10, false), iVar6 == null ? null : new com.badlogic.gdx.graphics.glutils.i(iVar6, null, z10, false));
    }

    public c(int i10, int i11, int i12, i.c cVar) {
        this(new com.badlogic.gdx.graphics.glutils.i(new i(i12, i11, cVar), null, false, true), new com.badlogic.gdx.graphics.glutils.i(new i(i12, i11, cVar), null, false, true), new com.badlogic.gdx.graphics.glutils.i(new i(i10, i12, cVar), null, false, true), new com.badlogic.gdx.graphics.glutils.i(new i(i10, i12, cVar), null, false, true), new com.badlogic.gdx.graphics.glutils.i(new i(i10, i11, cVar), null, false, true), new com.badlogic.gdx.graphics.glutils.i(new i(i10, i11, cVar), null, false, true));
    }

    public c(l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6) {
        super(34067);
        k.a aVar = k.a.Nearest;
        this.f94203c = aVar;
        this.f94204d = aVar;
        k.b bVar = k.b.ClampToEdge;
        this.f94205e = bVar;
        this.f94206f = bVar;
        com.badlogic.gdx.graphics.glutils.a aVar2 = new com.badlogic.gdx.graphics.glutils.a(lVar, lVar2, lVar3, lVar4, lVar5, lVar6);
        this.f94191g = aVar2;
        F(aVar2);
    }
}
