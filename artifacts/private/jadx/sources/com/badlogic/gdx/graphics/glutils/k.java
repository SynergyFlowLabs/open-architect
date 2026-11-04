package com.badlogic.gdx.graphics.glutils;

import android.opengl.GLES20;
import com.badlogic.gdx.graphics.m;
import com.badlogic.gdx.graphics.n;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.t;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f94755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FloatBuffer f94756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer f94757c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f94759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f94760f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f94761g = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f94758d = d.e();

    public k(boolean z10, int i10, n nVar) {
        ByteBuffer byteBufferC = BufferUtils.c(nVar.f94833b * i10);
        this.f94757c = byteBufferC;
        byteBufferC.limit(0);
        int iLimit = this.f94757c.limit();
        ByteBuffer byteBuffer = this.f94757c;
        byteBuffer.limit(byteBuffer.capacity());
        this.f94756b = this.f94757c.asFloatBuffer();
        this.f94757c.limit(iLimit);
        this.f94756b.limit(iLimit / 4);
        this.f94755a = nVar;
        e(z10 ? 35044 : 35048);
    }

    private void a() {
        if (this.f94761g) {
            GLES20.glBufferData(34962, this.f94757c.limit(), this.f94757c, this.f94759e);
            this.f94760f = false;
        }
    }

    @Override // com.badlogic.gdx.graphics.glutils.l
    public int A0() {
        return (this.f94756b.limit() * 4) / this.f94755a.f94833b;
    }

    @Override // com.badlogic.gdx.graphics.glutils.l
    public void I1(j jVar) {
        t1(jVar, null);
    }

    @Override // com.badlogic.gdx.graphics.glutils.l
    public void K0(j jVar, int[] iArr) {
        int size = this.f94755a.size();
        if (iArr == null) {
            for (int i10 = 0; i10 < size; i10++) {
                jVar.h(this.f94755a.p(i10).f94829f);
            }
        } else {
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    jVar.g(i12);
                }
            }
        }
        GLES20.glBindBuffer(34962, 0);
        this.f94761g = false;
    }

    @Override // com.badlogic.gdx.graphics.glutils.l
    public void N1(float[] fArr, int i10, int i11) {
        this.f94760f = true;
        BufferUtils.a(fArr, this.f94756b, i11, i10);
        boolean z10 = true & false;
        this.f94756b.position(0);
        this.f94756b.limit(i11);
        a();
    }

    protected int b() {
        return this.f94759e;
    }

    @Override // gc.e
    public void dispose() {
        d.d(34962, this.f94758d);
        this.f94758d = 0;
        BufferUtils.b(this.f94757c);
    }

    protected void e(int i10) {
        if (this.f94761g) {
            throw new t("Cannot change usage while VBO is bound");
        }
        this.f94759e = i10;
    }

    @Override // com.badlogic.gdx.graphics.glutils.l
    public n getAttributes() {
        return this.f94755a;
    }

    @Override // com.badlogic.gdx.graphics.glutils.l
    public void invalidate() {
        d.d(34962, this.f94758d);
        this.f94758d = d.e();
        this.f94760f = true;
    }

    @Override // com.badlogic.gdx.graphics.glutils.l
    public void m0(j jVar) {
        K0(jVar, null);
    }

    @Override // com.badlogic.gdx.graphics.glutils.l
    public FloatBuffer n() {
        this.f94760f = true;
        return this.f94756b;
    }

    @Override // com.badlogic.gdx.graphics.glutils.l
    public int q0() {
        return this.f94757c.capacity() / this.f94755a.f94833b;
    }

    @Override // com.badlogic.gdx.graphics.glutils.l
    public void t1(j jVar, int[] iArr) {
        GLES20.glBindBuffer(34962, this.f94758d);
        if (this.f94760f) {
            this.f94757c.limit(this.f94756b.limit() * 4);
            GLES20.glBufferData(34962, this.f94757c.limit(), this.f94757c, this.f94759e);
            this.f94760f = false;
        }
        int size = this.f94755a.size();
        if (iArr == null) {
            for (int i10 = 0; i10 < size; i10++) {
                m mVarP = this.f94755a.p(i10);
                int iY = jVar.y(mVarP.f94829f);
                if (iY >= 0) {
                    jVar.i(iY);
                    jVar.T1(iY, mVarP.f94825b, mVarP.f94827d, mVarP.f94826c, this.f94755a.f94833b, mVarP.f94828e);
                }
            }
        } else {
            for (int i11 = 0; i11 < size; i11++) {
                m mVarP2 = this.f94755a.p(i11);
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    jVar.i(i12);
                    jVar.T1(i12, mVarP2.f94825b, mVarP2.f94827d, mVarP2.f94826c, this.f94755a.f94833b, mVarP2.f94828e);
                }
            }
        }
        this.f94761g = true;
    }
}
