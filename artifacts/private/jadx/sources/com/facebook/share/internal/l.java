package com.facebook.share.internal;

import com.facebook.internal.w0;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum l implements com.facebook.internal.i {
    SHARE_STORY_ASSET(w0.E);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f101895a;

    l(int i10) {
        this.f101895a = i10;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static l[] valuesCustom() {
        l[] lVarArrValuesCustom = values();
        return (l[]) Arrays.copyOf(lVarArrValuesCustom, lVarArrValuesCustom.length);
    }

    @Override // com.facebook.internal.i
    @NotNull
    public String k0() {
        return w0.f100194p0;
    }

    @Override // com.facebook.internal.i
    public int l0() {
        return this.f101895a;
    }
}
