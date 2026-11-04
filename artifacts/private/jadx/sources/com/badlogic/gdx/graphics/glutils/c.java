package com.badlogic.gdx.graphics.glutils;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class c implements gc.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f94700l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.badlogic.gdx.graphics.k f94702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f94703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f94704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f94705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f94706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f94707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final boolean f94708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final boolean f94709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final com.badlogic.gdx.graphics.i.c f94710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.planner5d.library.engine.a f94711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<com.planner5d.library.engine.a, com.badlogic.gdx.utils.b<c>> f94699k = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f94701m = false;

    public c(com.planner5d.library.engine.a aVar, com.badlogic.gdx.graphics.i.c cVar, int i10, int i11, boolean z10) {
        this(aVar, cVar, i10, i11, z10, false);
    }

    public static void L() {
        GLES20.glBindFramebuffer(36160, f94700l);
    }

    private static void a(com.planner5d.library.engine.a aVar, c cVar) {
        Map<com.planner5d.library.engine.a, com.badlogic.gdx.utils.b<c>> map = f94699k;
        com.badlogic.gdx.utils.b<c> bVar = map.get(aVar);
        if (bVar == null) {
            bVar = new com.badlogic.gdx.utils.b<>();
        }
        bVar.c(cVar);
        map.put(aVar, bVar);
    }

    private void b() {
        if (!f94701m) {
            f94701m = true;
            f94700l = 0;
        }
        q();
        this.f94703b = d.f();
        if (this.f94708g) {
            this.f94704c = d.g();
        }
        if (this.f94709h) {
            this.f94705d = d.g();
        }
        GLES20.glBindTexture(3553, this.f94702a.i());
        if (this.f94708g) {
            GLES20.glBindRenderbuffer(36161, this.f94704c);
            GLES20.glRenderbufferStorage(36161, 33189, this.f94702a.o(), this.f94702a.f());
        }
        if (this.f94709h) {
            GLES20.glBindRenderbuffer(36161, this.f94705d);
            GLES20.glRenderbufferStorage(36161, 36168, this.f94702a.o(), this.f94702a.f());
        }
        GLES20.glBindFramebuffer(36160, this.f94703b);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f94702a.i(), 0);
        if (this.f94708g) {
            GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f94704c);
        }
        if (this.f94709h) {
            GLES20.glFramebufferRenderbuffer(36160, 36128, 36161, this.f94705d);
        }
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        GLES20.glBindRenderbuffer(36161, 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, f94700l);
        if (iGlCheckFramebufferStatus != 36053) {
            this.f94702a.dispose();
            if (this.f94708g) {
                d.b(this.f94704c);
            }
            if (this.f94709h) {
                d.b(this.f94705d);
            }
            d.a(this.f94703b);
            if (iGlCheckFramebufferStatus == 36054) {
                throw new IllegalStateException("frame buffer couldn't be constructed: incomplete attachment");
            }
            if (iGlCheckFramebufferStatus == 36057) {
                throw new IllegalStateException("frame buffer couldn't be constructed: incomplete dimensions");
            }
            if (iGlCheckFramebufferStatus == 36055) {
                throw new IllegalStateException("frame buffer couldn't be constructed: missing attachment");
            }
            if (iGlCheckFramebufferStatus == 36061) {
                throw new IllegalStateException("frame buffer couldn't be constructed: unsupported combination of formats");
            }
            throw new IllegalStateException("frame buffer couldn't be constructed: unknown error " + iGlCheckFramebufferStatus);
        }
    }

    public static void e(com.planner5d.library.engine.a aVar) {
        f94699k.remove(aVar);
    }

    public static void j(com.planner5d.library.engine.a aVar) {
        com.badlogic.gdx.utils.b<c> bVar = f94699k.get(aVar);
        if (bVar != null) {
            for (int i10 = 0; i10 < bVar.f95174b; i10++) {
                bVar.get(i10).b();
            }
        }
    }

    @Override // gc.e
    public void dispose() {
        this.f94702a.dispose();
        boolean z10 = true;
        if (this.f94708g) {
            GLES20.glDeleteRenderbuffers(1, new int[]{this.f94704c}, 0);
        }
        if (this.f94709h) {
            GLES20.glDeleteRenderbuffers(1, new int[]{this.f94705d}, 0);
        }
        GLES20.glDeleteFramebuffers(1, new int[]{this.f94703b}, 0);
        com.badlogic.gdx.utils.b<c> bVar = f94699k.get(this.f94711j);
        if (bVar != null) {
            bVar.C(this, true);
        }
    }

    public void end() {
        L();
        m();
    }

    public void f(int i10, int i11, int i12, int i13) {
        L();
        GLES20.glViewport(i10, i11, i12, i13);
    }

    public com.badlogic.gdx.graphics.k g() {
        return this.f94702a;
    }

    public int h() {
        return this.f94702a.f();
    }

    public int i() {
        return this.f94702a.o();
    }

    public void i0() {
        GLES20.glBindFramebuffer(36160, this.f94703b);
    }

    protected void m() {
        GLES20.glViewport(0, 0, this.f94711j.m().getWidth(), this.f94711j.m().getHeight());
    }

    protected void o() {
        GLES20.glViewport(0, 0, this.f94702a.o(), this.f94702a.f());
    }

    protected void q() {
        com.badlogic.gdx.graphics.k kVar = new com.badlogic.gdx.graphics.k(this.f94711j, this.f94706e, this.f94707f, this.f94710i);
        this.f94702a = kVar;
        com.badlogic.gdx.graphics.k.a aVar = com.badlogic.gdx.graphics.k.a.Linear;
        kVar.x(aVar, aVar);
        com.badlogic.gdx.graphics.k kVar2 = this.f94702a;
        com.badlogic.gdx.graphics.k.b bVar = com.badlogic.gdx.graphics.k.b.ClampToEdge;
        kVar2.y(bVar, bVar);
    }

    public void s() {
        i0();
        o();
    }

    public c(com.planner5d.library.engine.a aVar, com.badlogic.gdx.graphics.i.c cVar, int i10, int i11, boolean z10, boolean z11) {
        this.f94711j = aVar;
        this.f94706e = i10;
        this.f94707f = i11;
        this.f94710i = cVar;
        this.f94708g = z10;
        this.f94709h = z11;
        b();
        a(aVar, this);
    }
}
