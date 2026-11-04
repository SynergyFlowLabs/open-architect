package com.badlogic.gdx.graphics.g3d.attributes;

/* JADX INFO: loaded from: classes3.dex */
public class k extends j {
    public final float H1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public final float f94367g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public final float f94368h3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public final float f94369p2;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(com.badlogic.gdx.graphics.k kVar, com.planner5d.library.engine.rendering.util.g gVar) {
        Float fValueOf;
        com.planner5d.library.engine.rendering.util.i iVarF = gVar.k().f();
        com.planner5d.library.engine.rendering.util.i iVar = com.planner5d.library.engine.rendering.util.i.NoRepeat;
        float fJ = iVarF == iVar ? 1.0f : gVar.j();
        if (gVar.i() == null) {
            fValueOf = null;
        } else {
            fValueOf = Float.valueOf(gVar.k().f() == iVar ? 0.0f : gVar.i().floatValue());
        }
        this(kVar, fJ, fValueOf, Float.valueOf(gVar.h()), Float.valueOf(gVar.l()));
    }

    public com.planner5d.library.engine.rendering.util.g S(com.planner5d.library.engine.rendering.util.j jVar) {
        return new com.planner5d.library.engine.rendering.util.g(this.f94369p2, Float.valueOf(this.H1), jVar, this.f94367g3, this.f94368h3);
    }

    @Override // com.badlogic.gdx.graphics.g3d.attributes.j, com.badlogic.gdx.graphics.g3d.a
    public com.badlogic.gdx.graphics.g3d.a k() {
        return new k(this);
    }

    public k(j jVar) {
        this(jVar, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    public k(j jVar, float f10, float f11, float f12, float f13) {
        this((com.badlogic.gdx.graphics.k) jVar.f94361d.f94685a, f10, Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13));
    }

    public k(com.badlogic.gdx.graphics.k kVar, float f10, Float f11) {
        super(j.f94350k, kVar);
        this.f94369p2 = f10;
        this.H1 = f11 == null ? 0.0f : f11.floatValue();
        this.f94367g3 = 0.0f;
        this.f94368h3 = 0.0f;
    }

    public k(com.badlogic.gdx.graphics.k kVar, float f10, Float f11, Float f12, Float f13) {
        super(j.f94350k, kVar);
        this.f94369p2 = f10;
        this.H1 = f11 == null ? 0.0f : f11.floatValue();
        this.f94367g3 = f12 == null ? 0.0f : f12.floatValue();
        this.f94368h3 = f13 != null ? f13.floatValue() : 0.0f;
    }

    public k(k kVar) {
        this((com.badlogic.gdx.graphics.k) kVar.f94361d.f94685a, kVar.f94369p2, Float.valueOf(kVar.H1), Float.valueOf(kVar.f94367g3), Float.valueOf(kVar.f94368h3));
    }
}
