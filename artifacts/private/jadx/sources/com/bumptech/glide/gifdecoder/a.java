package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f96041a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f96042b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f96043c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f96044d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f96045e = 0;

    /* JADX INFO: renamed from: com.bumptech.glide.gifdecoder.a$a, reason: collision with other inner class name */
    public interface InterfaceC0851a {
        @NonNull
        byte[] a(int i10);

        @NonNull
        Bitmap b(int i10, int i11, @NonNull Bitmap.Config config);

        void c(@NonNull Bitmap bitmap);

        @NonNull
        int[] d(int i10);

        void e(@NonNull byte[] bArr);

        void f(@NonNull int[] iArr);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    int a(@p0 InputStream inputStream, int i10);

    int b(int i10);

    void c(@NonNull Bitmap.Config config);

    void clear();

    @Deprecated
    int d();

    void e(@NonNull c cVar, @NonNull byte[] bArr);

    void f();

    int g();

    @NonNull
    ByteBuffer getData();

    int getHeight();

    int getWidth();

    int h();

    @p0
    Bitmap i();

    void j();

    int k();

    int l();

    int m();

    void n(@NonNull c cVar, @NonNull ByteBuffer byteBuffer);

    void o(@NonNull c cVar, @NonNull ByteBuffer byteBuffer, int i10);

    int p();

    int read(@p0 byte[] bArr);

    int t();
}
