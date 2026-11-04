package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class a<Data> implements n<Uri, Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f96804c = "android_asset";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f96805d = "file:///android_asset/";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f96806e = 22;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f96807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0864a<Data> f96808b;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.a$a, reason: collision with other inner class name */
    public interface InterfaceC0864a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC0864a<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f96809a;

        public b(AssetManager assetManager) {
            this.f96809a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.a.InterfaceC0864a
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<Uri, ParcelFileDescriptor> c(r rVar) {
            return new a(this.f96809a, this);
        }
    }

    public static class c implements o<Uri, InputStream>, InterfaceC0864a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f96810a;

        public c(AssetManager assetManager) {
            this.f96810a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.a.InterfaceC0864a
        public com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.n(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<Uri, InputStream> c(r rVar) {
            return new a(this.f96810a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0864a<Data> interfaceC0864a) {
        this.f96807a = assetManager;
        this.f96808b = interfaceC0864a;
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> a(@NonNull Uri uri, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(uri), this.f96808b.a(this.f96807a, uri.toString().substring(f96806e)));
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return com.facebook.share.internal.k.f101891c.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
