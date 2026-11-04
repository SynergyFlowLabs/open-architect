package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes4.dex */
public enum o8 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f110319a;

    o8(String str) {
        this.f110319a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f110319a;
    }
}
