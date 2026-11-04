package com.bumptech.glide.load.model;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.superwall.sdk.network.Api;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class x<Data> implements n<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f96936b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", Api.scheme)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n<g, Data> f96937a;

    public static class a implements o<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.o
        public void b() {
        }

        @Override // com.bumptech.glide.load.model.o
        @NonNull
        public n<Uri, InputStream> c(r rVar) {
            return new x(rVar.d(g.class, InputStream.class));
        }
    }

    public x(n<g, Data> nVar) {
        this.f96937a = nVar;
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> a(@NonNull Uri uri, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) {
        return this.f96937a.a(new g(uri.toString()), i10, i11, jVar);
    }

    @Override // com.bumptech.glide.load.model.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return f96936b.contains(uri.getScheme());
    }
}
