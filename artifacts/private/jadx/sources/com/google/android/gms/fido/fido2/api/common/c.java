package com.google.android.gms.fido.fido2.api.common;

/* JADX INFO: loaded from: classes4.dex */
public enum c implements a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ES384(-35),
    ES512(-36);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f107270a;

    c(int i10) {
        this.f107270a = i10;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.a
    public int k() {
        return this.f107270a;
    }
}
