package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class i<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b<Object> f96795e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f96796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b<T> f96797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f96798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile byte[] f96799d;

    class a implements b<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.i.b
        public void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(@NonNull byte[] bArr, @NonNull T t10, @NonNull MessageDigest messageDigest);
    }

    private i(@NonNull String str, @p0 T t10, @NonNull b<T> bVar) {
        this.f96798c = com.bumptech.glide.util.k.b(str);
        this.f96796a = t10;
        this.f96797b = (b) com.bumptech.glide.util.k.d(bVar);
    }

    @NonNull
    public static <T> i<T> a(@NonNull String str, @NonNull b<T> bVar) {
        return new i<>(str, null, bVar);
    }

    @NonNull
    public static <T> i<T> b(@NonNull String str, @p0 T t10, @NonNull b<T> bVar) {
        return new i<>(str, t10, bVar);
    }

    @NonNull
    private static <T> b<T> c() {
        return (b<T>) f96795e;
    }

    @NonNull
    private byte[] e() {
        if (this.f96799d == null) {
            this.f96799d = this.f96798c.getBytes(g.f96793b);
        }
        return this.f96799d;
    }

    @NonNull
    public static <T> i<T> f(@NonNull String str) {
        return new i<>(str, null, c());
    }

    @NonNull
    public static <T> i<T> g(@NonNull String str, @NonNull T t10) {
        return new i<>(str, t10, c());
    }

    @p0
    public T d() {
        return this.f96796a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f96798c.equals(((i) obj).f96798c);
        }
        return false;
    }

    public void h(@NonNull T t10, @NonNull MessageDigest messageDigest) {
        this.f96797b.a(e(), t10, messageDigest);
    }

    public int hashCode() {
        return this.f96798c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f96798c + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
