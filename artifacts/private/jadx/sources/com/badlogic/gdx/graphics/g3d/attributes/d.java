package com.badlogic.gdx.graphics.g3d.attributes;

import com.badlogic.gdx.math.s;
import com.badlogic.gdx.utils.h0;
import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes3.dex */
public class d extends com.badlogic.gdx.graphics.g3d.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f94325h = "depthStencil";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f94326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static long f94327j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f94328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f94329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f94330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f94331g;

    static {
        long jP = com.badlogic.gdx.graphics.g3d.a.p(f94325h);
        f94326i = jP;
        f94327j = jP;
    }

    public d() {
        this(com.badlogic.gdx.graphics.g3d.shaders.b.f94481i4);
    }

    public static final boolean r(long j10) {
        return (j10 & f94327j) != 0;
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    public int hashCode() {
        return (((((((super.hashCode() * 971) + this.f94328d) * 971) + h0.d(this.f94329e)) * 971) + h0.d(this.f94330f)) * 971) + (this.f94331g ? 1 : 0);
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    public com.badlogic.gdx.graphics.g3d.a k() {
        return new d(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.badlogic.gdx.graphics.g3d.a aVar) {
        long j10 = this.f94297a;
        long j11 = aVar.f94297a;
        if (j10 != j11) {
            return (int) (j10 - j11);
        }
        d dVar = (d) aVar;
        int i10 = this.f94328d;
        int i11 = dVar.f94328d;
        if (i10 != i11) {
            return i10 - i11;
        }
        boolean z10 = this.f94331g;
        if (z10 != dVar.f94331g) {
            return z10 ? -1 : 1;
        }
        if (!s.m(this.f94329e, dVar.f94329e)) {
            return this.f94329e < dVar.f94329e ? -1 : 1;
        }
        if (s.m(this.f94330f, dVar.f94330f)) {
            return 0;
        }
        return this.f94330f < dVar.f94330f ? -1 : 1;
    }

    public d(boolean z10) {
        this(com.badlogic.gdx.graphics.g3d.shaders.b.f94481i4, z10);
    }

    public d(int i10) {
        this(i10, true);
    }

    public d(int i10, boolean z10) {
        this(i10, 0.0f, 1.0f, z10);
    }

    public d(int i10, float f10, float f11) {
        this(i10, f10, f11, true);
    }

    public d(int i10, float f10, float f11, boolean z10) {
        this(f94326i, i10, f10, f11, z10);
    }

    public d(long j10, int i10, float f10, float f11, boolean z10) {
        super(j10);
        if (r(j10)) {
            this.f94328d = i10;
            this.f94329e = f10;
            this.f94330f = f11;
            this.f94331g = z10;
            return;
        }
        throw new t("Invalid type specified");
    }

    public d(d dVar) {
        this(dVar.f94297a, dVar.f94328d, dVar.f94329e, dVar.f94330f, dVar.f94331g);
    }
}
