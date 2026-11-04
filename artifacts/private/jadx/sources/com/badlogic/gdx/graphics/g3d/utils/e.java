package com.badlogic.gdx.graphics.g3d.utils;

import android.opengl.GLES20;
import com.badlogic.gdx.utils.t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f94620l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f94621m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f94622n = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f94623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f94624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f94625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.badlogic.gdx.graphics.e[] f94626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f94627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f94628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f94629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f94630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f94631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m f94632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f94633k;

    public e(int i10) {
        this(i10, 0);
    }

    private final int f(m mVar, boolean z10) {
        int i10;
        int iG;
        com.badlogic.gdx.graphics.e eVar = mVar.f94685a;
        this.f94629g = false;
        int i11 = this.f94628f;
        if (i11 == 0) {
            i10 = this.f94623a;
            iG = g(eVar);
        } else {
            if (i11 != 1) {
                return -1;
            }
            i10 = this.f94623a;
            iG = h(eVar);
        }
        int i12 = i10 + iG;
        if (this.f94629g) {
            this.f94630h++;
            if (z10) {
                eVar.a(i12);
            } else {
                GLES20.glActiveTexture(33984 + i12);
            }
        } else {
            this.f94631i++;
        }
        eVar.B(mVar.f94688d, mVar.f94689e);
        eVar.z(mVar.f94686b, mVar.f94687c);
        return i12;
    }

    private final int g(com.badlogic.gdx.graphics.e eVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f94624b;
            if (i10 >= i11) {
                int i12 = (this.f94633k + 1) % i11;
                this.f94633k = i12;
                this.f94626d[i12] = eVar;
                eVar.a(this.f94623a + i12);
                return this.f94633k;
            }
            int i13 = (this.f94633k + i10) % i11;
            if (this.f94626d[i13] == eVar) {
                this.f94629g = true;
                return i13;
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    private final int h(com.badlogic.gdx.graphics.e eVar) {
        int i10 = this.f94627e[0];
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f94624b; i13++) {
            if (this.f94626d[i13] == eVar) {
                int[] iArr = this.f94627e;
                iArr[i13] = iArr[i13] + this.f94625c;
                i11 = i13;
            } else {
                int[] iArr2 = this.f94627e;
                int i14 = iArr2[i13];
                if (i14 >= 0) {
                    int i15 = i14 - 1;
                    iArr2[i13] = i15;
                    if (i15 < i10) {
                        i10 = iArr2[i13];
                        i12 = i13;
                    }
                } else {
                    i10 = iArr2[i13];
                    i12 = i13;
                }
            }
        }
        if (i11 >= 0) {
            this.f94629g = true;
            return i11;
        }
        this.f94626d[i12] = eVar;
        this.f94627e[i12] = 100;
        eVar.a(this.f94623a + i12);
        return i12;
    }

    private static int i() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(64);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        IntBuffer intBufferAsIntBuffer = byteBufferAllocateDirect.asIntBuffer();
        GLES20.glGetIntegerv(34930, intBufferAsIntBuffer);
        return intBufferAsIntBuffer.get(0);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.l
    public final int a(com.badlogic.gdx.graphics.e eVar) {
        this.f94632j.c(eVar, null, null, null, null);
        return f(this.f94632j, false);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.l
    public final int b() {
        return this.f94630h;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.l
    public final void c() {
        this.f94630h = 0;
        this.f94631i = 0;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.l
    public final int d(m mVar) {
        return f(mVar, false);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.l
    public final int e() {
        return this.f94631i;
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.l
    public void end() {
        GLES20.glActiveTexture(33984);
    }

    @Override // com.badlogic.gdx.graphics.g3d.utils.l
    public void s() {
        for (int i10 = 0; i10 < this.f94624b; i10++) {
            this.f94626d[i10] = null;
            int[] iArr = this.f94627e;
            if (iArr != null) {
                iArr[i10] = 0;
            }
        }
    }

    public e(int i10, int i11) {
        this(i10, i11, -1);
    }

    public e(int i10, int i11, int i12) {
        this(i10, i11, i12, 10);
    }

    public e(int i10, int i11, int i12, int i13) {
        this.f94630h = 0;
        this.f94631i = 0;
        this.f94632j = new m();
        this.f94633k = 0;
        int iMin = Math.min(i(), 32);
        i12 = i12 < 0 ? iMin - i11 : i12;
        if (i11 >= 0 && i12 >= 0 && i11 + i12 <= iMin && i13 >= 1) {
            this.f94628f = i10;
            this.f94623a = i11;
            this.f94624b = i12;
            this.f94626d = new com.badlogic.gdx.graphics.e[i12];
            this.f94625c = i13;
            this.f94627e = i10 == 1 ? new int[i12] : null;
            return;
        }
        throw new t("Illegal arguments");
    }
}
