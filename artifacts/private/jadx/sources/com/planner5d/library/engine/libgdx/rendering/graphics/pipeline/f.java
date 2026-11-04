package com.planner5d.library.engine.libgdx.rendering.graphics.pipeline;

import com.badlogic.gdx.graphics.glutils.j;
import com.badlogic.gdx.math.d0;

/* JADX INFO: loaded from: classes5.dex */
class f extends com.badlogic.gdx.graphics.g3d.shaders.a.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float[] f160875d = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated(since = "Use com.planner5d.library.math.Vector3 instead")
    private static final d0 f160876e = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.badlogic.gdx.graphics.g3d.environment.a f160877a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f160878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f160879c;

    private static class a extends com.badlogic.gdx.graphics.g3d.environment.a {
        @Override // com.badlogic.gdx.graphics.g3d.environment.a
        public com.badlogic.gdx.graphics.g3d.environment.a m(float f10, float f11, float f12) {
            int i10 = 0;
            while (true) {
                float[] fArr = this.f94390a;
                if (i10 >= fArr.length) {
                    return this;
                }
                fArr[i10] = f10;
                fArr[i10 + 1] = f11;
                fArr[i10 + 2] = f12;
                i10 += 3;
            }
        }

        private a() {
        }
    }

    f(com.badlogic.gdx.graphics.g3d.shaders.b.a aVar) {
        this.f160878b = aVar.f94520c;
        this.f160879c = aVar.f94521d;
    }

    @Override // com.badlogic.gdx.graphics.g3d.shaders.a.c
    public void b(com.badlogic.gdx.graphics.g3d.shaders.a aVar, int i10, com.badlogic.gdx.graphics.g3d.h hVar, com.badlogic.gdx.graphics.g3d.b bVar) {
        com.badlogic.gdx.graphics.g3d.attributes.b bVar2;
        if (hVar.f94428g == null) {
            j jVar = aVar.f94469h;
            int iH = aVar.h(i10);
            float[] fArr = f160875d;
            jVar.h0(iH, fArr, 0, fArr.length);
            return;
        }
        d0 d0Var = f160876e;
        d0Var.L(hVar.f94422a.r(d0Var));
        long j10 = com.badlogic.gdx.graphics.g3d.attributes.b.f94316s;
        if (bVar.a2(j10) && (bVar2 = (com.badlogic.gdx.graphics.g3d.attributes.b) bVar.W1(j10)) != null) {
            this.f160877a.n(bVar2.f94320d);
        }
        long j11 = com.badlogic.gdx.graphics.g3d.attributes.e.f94333f;
        if (bVar.a2(j11)) {
            com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.environment.c> bVar3 = ((com.badlogic.gdx.graphics.g3d.attributes.e) bVar.W1(j11)).f94334d;
            for (int i11 = this.f160878b; i11 < bVar3.f95174b; i11++) {
                com.badlogic.gdx.graphics.g3d.environment.c cVar = bVar3.get(i11);
                this.f160877a.f(cVar.f94391a, cVar.f94392b);
            }
        }
        long j12 = com.badlogic.gdx.graphics.g3d.attributes.h.f94344f;
        if (bVar.a2(j12)) {
            com.badlogic.gdx.utils.b<com.badlogic.gdx.graphics.g3d.environment.e> bVar4 = ((com.badlogic.gdx.graphics.g3d.attributes.h) bVar.W1(j12)).f94345d;
            for (int i12 = this.f160879c; i12 < bVar4.f95174b; i12++) {
                com.badlogic.gdx.graphics.g3d.environment.e eVar = bVar4.get(i12);
                this.f160877a.h(eVar.f94391a, eVar.f94399b, f160876e, eVar.f94400c);
            }
        }
        this.f160877a.j();
        j jVar2 = aVar.f94469h;
        int iH2 = aVar.h(i10);
        float[] fArr2 = this.f160877a.f94390a;
        jVar2.h0(iH2, fArr2, 0, fArr2.length);
    }
}
