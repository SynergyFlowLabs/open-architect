package com.bumptech.glide.load.model.stream;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import com.superwall.sdk.network.Api;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class c implements n<Uri, InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f96901b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", Api.scheme)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n<com.bumptech.glide.load.model.g, InputStream> f96902a;

    public static class a implements o<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<Uri, InputStream> c(r rVar) {
            return new c(rVar.d(com.bumptech.glide.load.model.g.class, InputStream.class));
        }
    }

    public c(n<com.bumptech.glide.load.model.g, InputStream> nVar) {
        this.f96902a = nVar;
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> a(@NonNull Uri uri, int i10, int i11, @NonNull j jVar) {
        return this.f96902a.a(new com.bumptech.glide.load.model.g(uri.toString()), i10, i11, jVar);
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return f96901b.contains(uri.getScheme());
    }
}
