package com.planner5d.library.engine.libgdx.rendering.graphics.shadows;

import ac.g;
import ac.i;
import android.content.Context;
import android.opengl.GLES20;
import com.badlogic.gdx.math.Matrix4;
import com.planner5d.library.engine.libgdx.rendering.graphics.h;
import com.planner5d.library.engine.util.math.n;
import com.planner5d.library.math.m;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class a extends com.badlogic.gdx.graphics.g3d.f implements com.badlogic.gdx.graphics.g3d.environment.f, g<com.planner5d.library.engine.g> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f160880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final gc.a f160881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m f160882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C1545a f160883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f160884l;

    /* JADX INFO: renamed from: com.planner5d.library.engine.libgdx.rendering.graphics.shadows.a$a, reason: collision with other inner class name */
    private static class C1545a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f160885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m f160886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final m f160887c;

        public boolean d(com.planner5d.library.engine.g gVar) {
            return this.f160886b.equals(gVar.getPosition()) && this.f160887c.equals(gVar.Q1());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1545a)) {
                return false;
            }
            C1545a c1545a = (C1545a) obj;
            if (this.f160885a != c1545a.f160885a || !c1545a.f160886b.equals(this.f160886b) || !c1545a.f160887c.equals(this.f160887c)) {
                return false;
            }
            int i10 = 1 >> 1;
            return true;
        }

        private C1545a(com.planner5d.library.engine.g gVar, float f10) {
            m mVar = new m();
            this.f160886b = mVar;
            m mVar2 = new m();
            this.f160887c = mVar2;
            mVar.A0(gVar.getPosition());
            mVar2.A0(gVar.Q1());
            this.f160885a = f10;
        }
    }

    public a(Context context, com.planner5d.library.engine.a aVar, i iVar, gc.g gVar) throws ErrorMessageException {
        super(new f(context, aVar, iVar, gVar));
        this.f160882j = new m();
        this.f160883k = null;
        this.f160884l = new Object();
        IntBuffer intBufferAsIntBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asIntBuffer();
        GLES20.glGetIntegerv(3379, intBufferAsIntBuffer);
        int iMin = Math.min(intBufferAsIntBuffer.get(0), 4096);
        this.f160880h = new c(aVar.m(), iMin, iMin);
        float f10 = iMin;
        com.planner5d.library.engine.libgdx.rendering.graphics.c cVar = new com.planner5d.library.engine.libgdx.rendering.graphics.c(new h(f10, f10));
        this.f160881i = cVar;
        cVar.c2(2.0f);
        cVar.N1(60.0f);
        invalidate();
    }

    private double E(m mVar, m mVar2) {
        return Math.acos(mVar.X(mVar2) / (mVar.t() * mVar2.t())) * 57.29577951308232d;
    }

    private void J(C1545a c1545a) {
        this.f160881i.U1().X(-c1545a.f160885a, c1545a.f160885a, -c1545a.f160885a, c1545a.f160885a, 0.0f, 80.0f);
        n.e(n.e(this.f160881i.Q1().y0(0.0f, -40.0f, 0.0f), 9.0f, 1.0f, 0.0f, 0.0f), -7.0f, 0.0f, 0.0f, 1.0f);
        n.e(n.e(this.f160881i.z().y0(1.0f, 0.0f, 0.0f), 9.0f, 1.0f, 0.0f, 0.0f), -7.0f, 0.0f, 0.0f, 1.0f);
        if (c1545a.f160885a == 40.0f) {
            this.f160882j.y0(40.0f, 0.0f, 40.0f);
        } else {
            this.f160882j.y0(c1545a.f160887c.f180482a, 0.0f, c1545a.f160887c.f180484c).u0().v0(10.0f).Q(c1545a.f160886b.f180482a, 0.0f, c1545a.f160886b.f180484c);
        }
        this.f160881i.getPosition().A0(this.f160882j).H0(this.f160881i.Q1());
        this.f160881i.getView().W(this.f160881i.getPosition(), this.f160882j, this.f160881i.z());
        this.f160881i.Y1().M(this.f160881i.U1());
        Matrix4.mul(this.f160881i.Y1().f165412a, this.f160881i.getView().f165412a);
    }

    public void F(m mVar) {
        mVar.A0(this.f160881i.Q1()).u0();
    }

    public i G() {
        return ((f) this.f94410f).f160898c;
    }

    public int H() {
        return this.f160880h.a().f94685a.o();
    }

    @Override // ac.g
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public boolean D(com.planner5d.library.engine.g gVar) {
        synchronized (this.f160884l) {
            try {
                C1545a c1545a = this.f160883k;
                if (c1545a != null && c1545a.d(gVar)) {
                    return false;
                }
                double dPow = gVar.Q1().f180483b < 0.0f ? Math.pow(1.0d - (E(gVar.Q1(), this.f160882j.y0(gVar.Q1().f180482a, 0.0f, gVar.Q1().f180484c)) / 90.0d), 2.0d) : 1.0d;
                float fCeil = (float) (Math.ceil(Math.max(gVar.getPosition().f180483b, 10.0f) / 10.0f) * 10.0d);
                float fMin = Math.min(30.0f, fCeil + ((float) (dPow * 1.5d * ((double) (fCeil < 20.0f ? 1 : 4)))));
                if (fMin >= 30.0f) {
                    fMin = 40.0f;
                }
                synchronized (this.f160884l) {
                    C1545a c1545a2 = new C1545a(gVar, fMin);
                    this.f160883k = c1545a2;
                    J(c1545a2);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.environment.f
    public com.badlogic.gdx.graphics.g3d.utils.m a() {
        return this.f160880h.a();
    }

    @Override // com.badlogic.gdx.graphics.g3d.environment.f
    public float[] b() {
        return this.f160881i.Y1().f165412a;
    }

    @Override // com.badlogic.gdx.graphics.g3d.f, gc.e
    public void dispose() {
        super.dispose();
        this.f160880h.dispose();
    }

    @Override // com.badlogic.gdx.graphics.g3d.f
    public void end() {
        super.end();
        this.f160880h.end();
    }

    @Override // com.badlogic.gdx.graphics.g3d.f
    public void f(com.planner5d.library.engine.g gVar) {
        this.f160880h.s();
        super.f(this.f160881i);
    }

    @Override // ac.g
    public void invalidate() {
        synchronized (this.f160884l) {
            this.f160883k = null;
        }
    }
}
