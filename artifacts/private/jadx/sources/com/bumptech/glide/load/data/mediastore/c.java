package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f96343d = "MediaStoreThumbFetcher";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f96344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f96345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f96346c;

    static class a implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f96347b = {"_data"};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f96348c = "kind = 1 AND image_id = ?";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f96349a;

        a(ContentResolver contentResolver) {
            this.f96349a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public Cursor a(Uri uri) {
            return this.f96349a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f96347b, f96348c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class b implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f96350b = {"_data"};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f96351c = "kind = 1 AND video_id = ?";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f96352a;

        b(ContentResolver contentResolver) {
            this.f96352a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public Cursor a(Uri uri) {
            return this.f96352a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f96350b, f96351c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @l1
    c(Uri uri, e eVar) {
        this.f96344a = uri;
        this.f96345b = eVar;
    }

    private static c d(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.d(context).m().g(), dVar, com.bumptech.glide.b.d(context).f(), context.getContentResolver()));
    }

    public static c e(Context context, Uri uri) {
        return d(context, uri, new a(context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return d(context, uri, new b(context.getContentResolver()));
    }

    private InputStream g() throws Throwable {
        InputStream inputStreamD = this.f96345b.d(this.f96344a);
        int iA = inputStreamD != null ? this.f96345b.a(this.f96344a) : -1;
        return iA != -1 ? new g(inputStreamD, iA) : inputStreamD;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f96346c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void c(@NonNull h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamG = g();
            this.f96346c = inputStreamG;
            aVar.d(inputStreamG);
        } catch (FileNotFoundException e10) {
            aVar.e(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.LOCAL;
    }
}
