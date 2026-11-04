package com.google.android.material.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.appcompat.graphics.drawable.c;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f112539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f112540c;

    public b(@NonNull Drawable drawable, int i10, int i11) {
        super(drawable);
        this.f112539b = i10;
        this.f112540c = i11;
    }

    @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f112540c;
    }

    @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f112539b;
    }
}
