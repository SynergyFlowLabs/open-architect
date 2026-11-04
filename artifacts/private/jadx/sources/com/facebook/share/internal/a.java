package com.facebook.share.internal;

import com.facebook.internal.w0;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum a implements com.facebook.internal.i {
    SHARE_CAMERA_EFFECT(w0.E);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f101815a;

    a(int i10) {
        this.f101815a = i10;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        a[] aVarArrValuesCustom = values();
        return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
    }

    @Override // com.facebook.internal.i
    @NotNull
    public String k0() {
        return w0.f100191o0;
    }

    @Override // com.facebook.internal.i
    public int l0() {
        return this.f101815a;
    }
}
