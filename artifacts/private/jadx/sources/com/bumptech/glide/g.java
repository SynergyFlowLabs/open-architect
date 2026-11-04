package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.u0;
import androidx.annotation.v;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
interface g<T> {
    @NonNull
    @androidx.annotation.j
    T c(@p0 String str);

    @androidx.annotation.j
    @Deprecated
    T e(@p0 URL url);

    @NonNull
    @androidx.annotation.j
    T f(@p0 File file);

    @NonNull
    @androidx.annotation.j
    T g(@p0 Drawable drawable);

    @NonNull
    @androidx.annotation.j
    T j(@p0 Object obj);

    @NonNull
    @androidx.annotation.j
    T k(@p0 Uri uri);

    @NonNull
    @androidx.annotation.j
    T l(@p0 byte[] bArr);

    @NonNull
    @androidx.annotation.j
    T o(@p0 Bitmap bitmap);

    @NonNull
    @androidx.annotation.j
    T r(@u0 @v @p0 Integer num);
}
