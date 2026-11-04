package com.badlogic.gdx.graphics;

import android.opengl.GLES20;
import com.badlogic.gdx.utils.t;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class k extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final Map<com.planner5d.library.engine.a, com.badlogic.gdx.utils.b<k>> f94804i = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    l f94805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.engine.a f94806h;

    public enum a {
        Nearest(9728),
        Linear(androidx.media3.common.j.I3),
        MipMap(androidx.media3.common.j.J3),
        MipMapNearestNearest(9984),
        MipMapLinearNearest(9985),
        MipMapNearestLinear(9986),
        MipMapLinearLinear(androidx.media3.common.j.J3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f94815a;

        static {
            int i10 = 4 >> 6;
        }

        a(int i10) {
            this.f94815a = i10;
        }

        public int l() {
            return this.f94815a;
        }

        public boolean n() {
            int i10 = this.f94815a;
            return (i10 == 9728 || i10 == 9729) ? false : true;
        }
    }

    public enum b {
        MirroredRepeat(33648),
        ClampToEdge(33071),
        Repeat(10497);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f94820a;

        b(int i10) {
            this.f94820a = i10;
        }

        public int l() {
            return this.f94820a;
        }
    }

    public k(com.planner5d.library.engine.a aVar, com.badlogic.gdx.files.a aVar2) {
        this(aVar, aVar2, (i.c) null, false);
    }

    private static void F(com.planner5d.library.engine.a aVar, k kVar) {
        Map<com.planner5d.library.engine.a, com.badlogic.gdx.utils.b<k>> map = f94804i;
        com.badlogic.gdx.utils.b<k> bVar = map.get(aVar);
        if (bVar == null) {
            bVar = new com.badlogic.gdx.utils.b<>();
        }
        bVar.c(kVar);
        map.put(aVar, bVar);
    }

    public static void G(com.planner5d.library.engine.a aVar) {
        f94804i.remove(aVar);
    }

    public static void J(com.planner5d.library.engine.a aVar) {
        com.badlogic.gdx.utils.b<k> bVar = f94804i.get(aVar);
        if (bVar == null) {
            return;
        }
        for (int i10 = 0; i10 < bVar.f95174b; i10++) {
            bVar.get(i10).u();
        }
    }

    public void H(i iVar, int i10, int i11) {
        if (this.f94805g.a()) {
            throw new t("can't draw to a managed texture");
        }
        i0();
        GLES20.glTexSubImage2D(this.f94201a, 0, i10, i11, iVar.v(), iVar.s(), iVar.p(), iVar.r(), iVar.u());
    }

    public l I() {
        return this.f94805g;
    }

    public void K(l lVar) {
        if (this.f94805g != null && lVar.a() != this.f94805g.a()) {
            throw new t("New data must have the same managed status as the old data");
        }
        this.f94805g = lVar;
        if (!lVar.b()) {
            lVar.A();
        }
        i0();
        e.D(3553, lVar);
        x(this.f94203c, this.f94204d);
        y(this.f94205e, this.f94206f);
        GLES20.glBindTexture(this.f94201a, 0);
    }

    @Override // com.badlogic.gdx.graphics.e, gc.e
    public void dispose() {
        com.badlogic.gdx.utils.b<k> bVar;
        if (this.f94202b != 0) {
            b();
            this.f94202b = 0;
            if (this.f94805g.a() && (bVar = f94804i.get(this.f94806h)) != null) {
                bVar.C(this, true);
            }
        }
    }

    @Override // com.badlogic.gdx.graphics.e
    public int e() {
        return 0;
    }

    @Override // com.badlogic.gdx.graphics.e
    public int f() {
        return this.f94805g.getHeight();
    }

    @Override // com.badlogic.gdx.graphics.e
    public int o() {
        return this.f94805g.getWidth();
    }

    @Override // com.badlogic.gdx.graphics.e
    public boolean q() {
        return this.f94805g.a();
    }

    @Override // com.badlogic.gdx.graphics.e
    protected void u() {
        if (!q()) {
            throw new t("Tried to reload unmanaged Texture");
        }
        this.f94202b = com.badlogic.gdx.graphics.glutils.d.h();
        K(this.f94805g);
    }

    public k(com.planner5d.library.engine.a aVar, com.badlogic.gdx.files.a aVar2, boolean z10) {
        this(aVar, aVar2, (i.c) null, z10);
    }

    public k(com.planner5d.library.engine.a aVar, com.badlogic.gdx.files.a aVar2, i.c cVar, boolean z10) {
        this(aVar, l.a.a(aVar2, cVar, z10));
    }

    public k(com.planner5d.library.engine.a aVar, i iVar) {
        this(aVar, new com.badlogic.gdx.graphics.glutils.i(iVar, null, false, false));
    }

    public k(com.planner5d.library.engine.a aVar, i iVar, boolean z10) {
        this(aVar, new com.badlogic.gdx.graphics.glutils.i(iVar, null, z10, false));
    }

    public k(com.planner5d.library.engine.a aVar, i iVar, i.c cVar, boolean z10) {
        this(aVar, new com.badlogic.gdx.graphics.glutils.i(iVar, cVar, z10, false));
    }

    public k(com.planner5d.library.engine.a aVar, int i10, int i11, i.c cVar) {
        this(aVar, new com.badlogic.gdx.graphics.glutils.i(new i(i10, i11, cVar), null, false, true));
    }

    public k(com.planner5d.library.engine.a aVar, l lVar) {
        super(3553, com.badlogic.gdx.graphics.glutils.d.h());
        this.f94806h = aVar;
        K(lVar);
        if (lVar.a()) {
            F(aVar, this);
        }
    }
}
