package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.bumptech.glide.h;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
@w0(29)
public final class f<DataT> implements n<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f96907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n<File, DataT> f96908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n<Uri, DataT> f96909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class<DataT> f96910d;

    private static abstract class a<DataT> implements o<Uri, DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f96911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<DataT> f96912b;

        a(Context context, Class<DataT> cls) {
            this.f96911a = context;
            this.f96912b = cls;
        }

        @Override // com.bumptech.glide.load.model.o
        public final void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public final n<Uri, DataT> c(@NonNull r rVar) {
            return new f(this.f96911a, rVar.d(File.class, this.f96912b), rVar.d(Uri.class, this.f96912b), this.f96912b);
        }
    }

    @w0(29)
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @w0(29)
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    private static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String[] f96913k = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f96914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n<File, DataT> f96915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n<Uri, DataT> f96916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f96917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f96918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f96919f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final j f96920g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Class<DataT> f96921h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f96922i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @p0
        private volatile com.bumptech.glide.load.data.d<DataT> f96923j;

        d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i10, int i11, j jVar, Class<DataT> cls) {
            this.f96914a = context.getApplicationContext();
            this.f96915b = nVar;
            this.f96916c = nVar2;
            this.f96917d = uri;
            this.f96918e = i10;
            this.f96919f = i11;
            this.f96920g = jVar;
            this.f96921h = cls;
        }

        @p0
        private n.a<DataT> d() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f96915b.a(g(this.f96917d), this.f96918e, this.f96919f, this.f96920g);
            }
            return this.f96916c.a(f() ? MediaStore.setRequireOriginal(this.f96917d) : this.f96917d, this.f96918e, this.f96919f, this.f96920g);
        }

        @p0
        private com.bumptech.glide.load.data.d<DataT> e() throws FileNotFoundException {
            n.a<DataT> aVarD = d();
            if (aVarD != null) {
                return aVarD.f96866c;
            }
            return null;
        }

        private boolean f() {
            return this.f96914a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        @NonNull
        private File g(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f96914a.getContentResolver().query(uri, f96913k, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th2;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<DataT> a() {
            return this.f96921h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f96923j;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void c(@NonNull h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> dVarE = e();
                if (dVarE == null) {
                    aVar.e(new IllegalArgumentException("Failed to build fetcher for: " + this.f96917d));
                    return;
                }
                this.f96923j = dVarE;
                if (this.f96922i) {
                    cancel();
                } else {
                    dVarE.c(hVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.e(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f96922i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f96923j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public com.bumptech.glide.load.a getDataSource() {
            return com.bumptech.glide.load.a.LOCAL;
        }
    }

    f(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f96907a = context.getApplicationContext();
        this.f96908b = nVar;
        this.f96909c = nVar2;
        this.f96910d = cls;
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<DataT> a(@NonNull Uri uri, int i10, int i11, @NonNull j jVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(uri), new d(this.f96907a, this.f96908b, this.f96909c, uri, i10, i11, jVar, this.f96910d));
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        if (!com.bumptech.glide.load.data.mediastore.b.b(uri)) {
            return false;
        }
        int i10 = 6 << 1;
        return true;
    }
}
