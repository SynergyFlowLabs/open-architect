package com.google.android.gms.fido.fido2.api.common;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends Exception {
    public b0(String str) {
        super(String.format("User verification requirement %s not supported", str));
    }
}
