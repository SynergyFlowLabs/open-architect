package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
class n implements com.bumptech.glide.load.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f96680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f96681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f96682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class<?> f96683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class<?> f96684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.g f96685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<Class<?>, com.bumptech.glide.load.n<?>> f96686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.j f96687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f96688k;

    n(Object obj, com.bumptech.glide.load.g gVar, int i10, int i11, Map<Class<?>, com.bumptech.glide.load.n<?>> map, Class<?> cls, Class<?> cls2, com.bumptech.glide.load.j jVar) {
        this.f96680c = com.bumptech.glide.util.k.d(obj);
        this.f96685h = (com.bumptech.glide.load.g) com.bumptech.glide.util.k.e(gVar, "Signature must not be null");
        this.f96681d = i10;
        this.f96682e = i11;
        this.f96686i = (Map) com.bumptech.glide.util.k.d(map);
        this.f96683f = (Class) com.bumptech.glide.util.k.e(cls, "Resource class must not be null");
        this.f96684g = (Class) com.bumptech.glide.util.k.e(cls2, "Transcode class must not be null");
        this.f96687j = (com.bumptech.glide.load.j) com.bumptech.glide.util.k.d(jVar);
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f96680c.equals(nVar.f96680c) && this.f96685h.equals(nVar.f96685h) && this.f96682e == nVar.f96682e && this.f96681d == nVar.f96681d && this.f96686i.equals(nVar.f96686i) && this.f96683f.equals(nVar.f96683f) && this.f96684g.equals(nVar.f96684g) && this.f96687j.equals(nVar.f96687j)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        if (this.f96688k == 0) {
            int iHashCode = this.f96680c.hashCode();
            this.f96688k = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f96685h.hashCode()) * 31) + this.f96681d) * 31) + this.f96682e;
            this.f96688k = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f96686i.hashCode();
            this.f96688k = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f96683f.hashCode();
            this.f96688k = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f96684g.hashCode();
            this.f96688k = iHashCode5;
            this.f96688k = (iHashCode5 * 31) + this.f96687j.hashCode();
        }
        return this.f96688k;
    }

    public String toString() {
        return "EngineKey{model=" + this.f96680c + ", width=" + this.f96681d + ", height=" + this.f96682e + ", resourceClass=" + this.f96683f + ", transcodeClass=" + this.f96684g + ", signature=" + this.f96685h + ", hashCode=" + this.f96688k + ", transformations=" + this.f96686i + ", options=" + this.f96687j + AbstractJsonLexerKt.END_OBJ;
    }
}
