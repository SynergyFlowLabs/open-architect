package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<T> implements d<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f96305d = "AssetPathFetcher";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f96306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AssetManager f96307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T f96308c;

    public b(AssetManager assetManager, String str) {
        this.f96307b = assetManager;
        this.f96306a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t10 = this.f96308c;
        if (t10 == null) {
            return;
        }
        try {
            d(t10);
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void c(@NonNull com.bumptech.glide.h hVar, @NonNull d.a<? super T> aVar) {
        try {
            T tE = e(this.f96307b, this.f96306a);
            this.f96308c = tE;
            aVar.d(tE);
        } catch (IOException e10) {
            aVar.e(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    protected abstract void d(T t10) throws IOException;

    protected abstract T e(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.LOCAL;
    }
}
