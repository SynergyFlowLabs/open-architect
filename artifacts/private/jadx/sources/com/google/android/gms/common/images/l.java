package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i f106456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f106457b;

    public l(Uri uri, int i10) {
        this.f106457b = 0;
        this.f106456a = new i(uri);
        this.f106457b = i10;
    }

    protected abstract void a(@p0 Drawable drawable, boolean z10, boolean z11, boolean z12);

    final void b(Context context, com.google.android.gms.internal.base.k kVar, boolean z10) {
        int i10 = this.f106457b;
        a(i10 != 0 ? context.getResources().getDrawable(i10) : null, z10, false, false);
    }

    final void c(Context context, Bitmap bitmap, boolean z10) {
        com.google.android.gms.common.internal.d.c(bitmap);
        a(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
