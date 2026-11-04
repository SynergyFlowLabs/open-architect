package com.google.android.gms.fido.fido2.api.common;

/* JADX INFO: loaded from: classes4.dex */
public enum f implements a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f107288a;

    f(int i10) {
        this.f107288a = i10;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.a
    public int k() {
        return this.f107288a;
    }
}
