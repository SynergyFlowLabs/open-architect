package com.badlogic.gdx.graphics.g3d.attributes;

import com.badlogic.gdx.graphics.g3d.utils.m;
import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes3.dex */
public class c extends com.badlogic.gdx.graphics.g3d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f94321e = "environmentMapTexture";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f94322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static long f94323g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m<com.badlogic.gdx.graphics.c> f94324d;

    static {
        long jP = com.badlogic.gdx.graphics.g3d.a.p(f94321e);
        f94322f = jP;
        f94323g = jP;
    }

    public c(long j10) {
        super(j10);
        if (!r(j10)) {
            throw new t("Invalid type specified");
        }
        this.f94324d = new m<>();
    }

    public static final boolean r(long j10) {
        return (j10 & f94323g) != 0;
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    public int hashCode() {
        return (super.hashCode() * 967) + this.f94324d.hashCode();
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    public com.badlogic.gdx.graphics.g3d.a k() {
        return new c(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.badlogic.gdx.graphics.g3d.a aVar) {
        long j10 = this.f94297a;
        long j11 = aVar.f94297a;
        return j10 != j11 ? (int) (j10 - j11) : this.f94324d.compareTo(((c) aVar).f94324d);
    }

    public <T extends com.badlogic.gdx.graphics.c> c(long j10, m<T> mVar) {
        this(j10);
        this.f94324d.d(mVar);
    }

    public c(long j10, com.badlogic.gdx.graphics.c cVar) {
        this(j10);
        this.f94324d.f94685a = cVar;
    }

    public c(c cVar) {
        this(cVar.f94297a, cVar.f94324d);
    }
}
