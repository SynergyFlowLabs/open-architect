package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements n<Uri, File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f96852a;

    public static final class a implements o<Uri, File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f96853a;

        public a(Context context) {
            this.f96853a = context;
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<Uri, File> c(r rVar) {
            return new k(this.f96853a);
        }
    }

    private static class b implements com.bumptech.glide.load.data.d<File> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f96854c = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f96855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f96856b;

        b(Context context, Uri uri) {
            this.f96855a = context;
            this.f96856b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void c(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super File> aVar) {
            boolean z10 = false;
            Cursor cursorQuery = this.f96855a.getContentResolver().query(this.f96856b, f96854c, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.d(new File(string));
                return;
            }
            aVar.e(new FileNotFoundException("Failed to find file path for: " + this.f96856b));
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

    public k(Context context) {
        this.f96852a = context;
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<File> a(@NonNull Uri uri, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(uri), new b(this.f96852a, uri));
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.b(uri);
    }
}
