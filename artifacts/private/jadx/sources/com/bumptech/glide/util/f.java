package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class f<T> implements com.bumptech.glide.e.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f97475a;

    public f(int i10, int i11) {
        this.f97475a = new int[]{i10, i11};
    }

    @Override // com.bumptech.glide.e.b
    @p0
    public int[] a(@NonNull T t10, int i10, int i11) {
        return this.f97475a;
    }
}
