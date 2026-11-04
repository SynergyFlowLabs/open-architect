package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import com.bumptech.glide.load.resource.bitmap.j0;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class e implements n<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f96905a;

    public static class a implements o<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f96906a;

        public a(Context context) {
            this.f96906a = context;
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<Uri, InputStream> c(r rVar) {
            return new e(this.f96906a);
        }
    }

    public e(Context context) {
        this.f96905a = context.getApplicationContext();
    }

    private boolean e(j jVar) {
        Long l10 = (Long) jVar.c(j0.f97001g);
        return l10 != null && l10.longValue() == -1;
    }

    @Override // com.bumptech.glide.load.model.n
    @p0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> a(@NonNull Uri uri, int i10, int i11, @NonNull j jVar) {
        if (com.bumptech.glide.load.data.mediastore.b.d(i10, i11) && e(jVar)) {
            return new n.a<>(new com.bumptech.glide.signature.e(uri), com.bumptech.glide.load.data.mediastore.c.f(this.f96905a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.c(uri);
    }
}
