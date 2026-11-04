package com.google.zxing.qrcode.decoder;

/* JADX INFO: loaded from: classes5.dex */
public enum f {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f[] f130901f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f130903a;

    static {
        f fVar = L;
        f fVar2 = M;
        f fVar3 = Q;
        f130901f = new f[]{fVar2, fVar, H, fVar3};
    }

    f(int i10) {
        this.f130903a = i10;
    }

    public static f b(int i10) {
        if (i10 >= 0) {
            f[] fVarArr = f130901f;
            if (i10 < fVarArr.length) {
                return fVarArr[i10];
            }
        }
        throw new IllegalArgumentException();
    }

    public int k() {
        return this.f130903a;
    }
}
