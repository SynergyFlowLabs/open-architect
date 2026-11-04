package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
abstract class z0 extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final WeakReference f106994c = new WeakReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f106995b;

    z0(byte[] bArr) {
        super(bArr);
        this.f106995b = f106994c;
    }

    @Override // com.google.android.gms.common.x0
    final byte[] p() {
        byte[] bArrS;
        synchronized (this) {
            try {
                bArrS = (byte[]) this.f106995b.get();
                if (bArrS == null) {
                    bArrS = s();
                    this.f106995b = new WeakReference(bArrS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrS;
    }

    protected abstract byte[] s();
}
