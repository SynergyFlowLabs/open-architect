package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class s<Data> implements n<Integer, Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f96889c = "ResourceLoader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n<Uri, Data> f96890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f96891b;

    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f96892a;

        public a(Resources resources) {
            this.f96892a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        public n<Integer, AssetFileDescriptor> c(r rVar) {
            return new s(this.f96892a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f96893a;

        public b(Resources resources) {
            this.f96893a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<Integer, ParcelFileDescriptor> c(r rVar) {
            return new s(this.f96893a, rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o<Integer, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f96894a;

        public c(Resources resources) {
            this.f96894a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<Integer, InputStream> c(r rVar) {
            return new s(this.f96894a, rVar.d(Uri.class, InputStream.class));
        }
    }

    public static class d implements o<Integer, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f96895a;

        public d(Resources resources) {
            this.f96895a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<Integer, Uri> c(r rVar) {
            return new s(this.f96895a, v.c());
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f96891b = resources;
        this.f96890a = nVar;
    }

    @p0
    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f96891b.getResourcePackageName(num.intValue()) + '/' + this.f96891b.getResourceTypeName(num.intValue()) + '/' + this.f96891b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> a(@NonNull Integer num, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.f96890a.a(uriD, i10, i11, jVar);
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Integer num) {
        return true;
    }
}
