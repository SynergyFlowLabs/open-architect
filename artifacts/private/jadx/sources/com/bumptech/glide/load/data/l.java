package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l<T> implements d<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f96335d = "LocalUriFetcher";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f96336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f96337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T f96338c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f96337b = contentResolver;
        this.f96336a = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t10 = this.f96338c;
        if (t10 != null) {
            try {
                d(t10);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void c(@NonNull com.bumptech.glide.h hVar, @NonNull d.a<? super T> aVar) {
        try {
            T tE = e(this.f96336a, this.f96337b);
            this.f96338c = tE;
            aVar.d(tE);
        } catch (FileNotFoundException e10) {
            aVar.e(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    protected abstract void d(T t10) throws IOException;

    protected abstract T e(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.LOCAL;
    }
}
