package com.google.zxing.qrcode.decoder;

import com.google.zxing.t;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f130921a;

    i(boolean z10) {
        this.f130921a = z10;
    }

    public void a(t[] tVarArr) {
        if (!this.f130921a || tVarArr == null || tVarArr.length < 3) {
            return;
        }
        t tVar = tVarArr[0];
        tVarArr[0] = tVarArr[2];
        tVarArr[2] = tVar;
    }

    public boolean b() {
        return this.f130921a;
    }
}
