package com.facebook.login;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public enum b {
    S256(net.openid.appauth.f.f332949o),
    PLAIN(net.openid.appauth.f.f332950p);

    b(String str) {
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        b[] bVarArrValuesCustom = values();
        return (b[]) Arrays.copyOf(bVarArrValuesCustom, bVarArrValuesCustom.length);
    }

    /* synthetic */ b(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? net.openid.appauth.f.f332949o : str);
    }
}
