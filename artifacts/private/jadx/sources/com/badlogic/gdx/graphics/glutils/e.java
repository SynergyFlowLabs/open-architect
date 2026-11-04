package com.badlogic.gdx.graphics.glutils;

import android.opengl.GLES20;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.r;
import com.badlogic.gdx.utils.t;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ShortBuffer f94714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ByteBuffer f94715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f94716c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f94719f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f94721h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f94717d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f94718e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f94720g = false;

    public e(boolean z10, int i10) {
        boolean z11 = i10 == 0;
        this.f94721h = z11;
        ByteBuffer byteBufferC = BufferUtils.c((z11 ? 1 : i10) * 2);
        this.f94715b = byteBufferC;
        ShortBuffer shortBufferAsShortBuffer = byteBufferC.asShortBuffer();
        this.f94714a = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.flip();
        this.f94715b.flip();
        this.f94716c = d.e();
        this.f94719f = z10 ? 35044 : 35048;
    }

    @Override // com.badlogic.gdx.graphics.glutils.f
    public void L() {
        GLES20.glBindBuffer(34963, 0);
        this.f94718e = false;
    }

    @Override // com.badlogic.gdx.graphics.glutils.f
    public void P1(ShortBuffer shortBuffer) {
        this.f94717d = true;
        int iPosition = shortBuffer.position();
        this.f94714a.clear();
        this.f94714a.put(shortBuffer);
        this.f94714a.flip();
        shortBuffer.position(iPosition);
        this.f94715b.position(0);
        this.f94715b.limit(this.f94714a.limit() << 1);
        if (this.f94718e) {
            GLES20.glBufferData(34963, this.f94715b.limit(), this.f94715b, this.f94719f);
            this.f94717d = false;
        }
    }

    @Override // com.badlogic.gdx.graphics.glutils.f
    public void S0(short[] sArr, int i10, int i11) {
        this.f94717d = true;
        this.f94714a.clear();
        this.f94714a.put(sArr, i10, i11);
        this.f94714a.flip();
        this.f94715b.position(0);
        this.f94715b.limit(i11 << 1);
        if (this.f94718e) {
            GLES20.glBufferData(34963, this.f94715b.limit(), this.f94715b, this.f94719f);
            this.f94717d = false;
        }
    }

    @Override // com.badlogic.gdx.graphics.glutils.f
    public int a1() {
        if (this.f94721h) {
            return 0;
        }
        return this.f94714a.capacity();
    }

    @Override // gc.e
    public void dispose() {
        d.d(34963, this.f94716c);
        this.f94720g = true;
        this.f94716c = 0;
        BufferUtils.b(this.f94715b);
    }

    @Override // com.badlogic.gdx.graphics.glutils.f
    public void i0() {
        int i10 = this.f94716c;
        if (i10 == 0) {
            if (!this.f94720g) {
                throw new t("No buffer allocated!");
            }
            throw new r("Buffer was disposed");
        }
        GLES20.glBindBuffer(34963, i10);
        if (this.f94717d) {
            this.f94715b.limit(this.f94714a.limit() * 2);
            GLES20.glBufferData(34963, this.f94715b.limit(), this.f94715b, this.f94719f);
            int i11 = 4 & 0;
            this.f94717d = false;
        }
        this.f94718e = true;
    }

    @Override // com.badlogic.gdx.graphics.glutils.f
    public void invalidate() {
        d.d(34963, this.f94716c);
        this.f94716c = d.e();
        this.f94717d = true;
    }

    @Override // com.badlogic.gdx.graphics.glutils.f
    public ShortBuffer n() {
        this.f94717d = true;
        return this.f94714a;
    }

    @Override // com.badlogic.gdx.graphics.glutils.f
    public int v1() {
        if (this.f94721h) {
            return 0;
        }
        return this.f94714a.limit();
    }
}
