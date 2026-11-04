package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class u<Data> implements n<String, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n<Uri, Data> f96927a;

    public static final class a implements o<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        public n<String, AssetFileDescriptor> c(@NonNull r rVar) {
            return new u(rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<String, ParcelFileDescriptor> c(@NonNull r rVar) {
            return new u(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o<String, InputStream> {
        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<String, InputStream> c(@NonNull r rVar) {
            return new u(rVar.d(Uri.class, InputStream.class));
        }
    }

    public u(n<Uri, Data> nVar) {
        this.f96927a = nVar;
    }

    @p0
    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? f(str) : uri;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> a(@NonNull String str, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
        Uri uriE = e(str);
        if (uriE != null && this.f96927a.b(uriE)) {
            return this.f96927a.a(uriE, i10, i11, jVar);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull String str) {
        return true;
    }
}
