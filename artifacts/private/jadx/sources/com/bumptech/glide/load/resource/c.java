package com.bumptech.glide.load.resource;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.n;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> implements n<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n<?> f97108c = new c();

    private c() {
    }

    @NonNull
    public static <T> c<T> c() {
        return (c) f97108c;
    }

    @Override // com.bumptech.glide.load.n
    @NonNull
    public v<T> a(@NonNull Context context, @NonNull v<T> vVar, int i10, int i11) {
        return vVar;
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
    }
}
