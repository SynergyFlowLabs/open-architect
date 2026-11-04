package com.facebook.share.internal;

import com.facebook.internal.w0;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum h implements com.facebook.internal.i {
    SHARE_DIALOG(w0.f100187n),
    PHOTOS(w0.f100196q),
    VIDEO(w0.f100207v),
    MULTIMEDIA(w0.A),
    HASHTAG(w0.A),
    LINK_SHARE_QUOTES(w0.A);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f101885a;

    h(int i10) {
        this.f101885a = i10;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static h[] valuesCustom() {
        h[] hVarArrValuesCustom = values();
        return (h[]) Arrays.copyOf(hVarArrValuesCustom, hVarArrValuesCustom.length);
    }

    @Override // com.facebook.internal.i
    @NotNull
    public String k0() {
        return w0.f100173i0;
    }

    @Override // com.facebook.internal.i
    public int l0() {
        return this.f101885a;
    }
}
