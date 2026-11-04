package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements com.bumptech.glide.gifdecoder.a.InterfaceC0851a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f97128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f97129b;

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this(eVar, null);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0851a
    @NonNull
    public byte[] a(int i10) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f97129b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.a(i10, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0851a
    @NonNull
    public Bitmap b(int i10, int i11, @NonNull Bitmap.Config config) {
        return this.f97128a.g(i10, i11, config);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0851a
    public void c(@NonNull Bitmap bitmap) {
        this.f97128a.e(bitmap);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0851a
    @NonNull
    public int[] d(int i10) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f97129b;
        return bVar == null ? new int[i10] : (int[]) bVar.a(i10, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0851a
    public void e(@NonNull byte[] bArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f97129b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0851a
    public void f(@NonNull int[] iArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f97129b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @p0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f97128a = eVar;
        this.f97129b = bVar;
    }
}
