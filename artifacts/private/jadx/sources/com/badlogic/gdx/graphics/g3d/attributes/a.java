package com.badlogic.gdx.graphics.g3d.attributes;

import com.badlogic.gdx.math.s;
import com.badlogic.gdx.utils.h0;

/* JADX INFO: loaded from: classes3.dex */
public class a extends com.badlogic.gdx.graphics.g3d.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f94299h = "blended";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f94300i = com.badlogic.gdx.graphics.g3d.a.p(f94299h);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f94301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f94302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f94303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f94304g;

    public a() {
        this((a) null);
    }

    public static final boolean s(long j10) {
        return (f94300i & j10) == j10;
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    public int hashCode() {
        return (((((((super.hashCode() * 947) + (this.f94301d ? 1 : 0)) * 947) + this.f94302e) * 947) + this.f94303f) * 947) + h0.d(this.f94304g);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.badlogic.gdx.graphics.g3d.a aVar) {
        long j10 = this.f94297a;
        long j11 = aVar.f94297a;
        if (j10 != j11) {
            return (int) (j10 - j11);
        }
        a aVar2 = (a) aVar;
        boolean z10 = this.f94301d;
        if (z10 != aVar2.f94301d) {
            return z10 ? 1 : -1;
        }
        int i10 = this.f94302e;
        int i11 = aVar2.f94302e;
        if (i10 != i11) {
            return i10 - i11;
        }
        int i12 = this.f94303f;
        int i13 = aVar2.f94303f;
        if (i12 != i13) {
            return i12 - i13;
        }
        if (s.m(this.f94304g, aVar2.f94304g)) {
            return 0;
        }
        return this.f94304g < aVar2.f94304g ? 1 : -1;
    }

    @Override // com.badlogic.gdx.graphics.g3d.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public a k() {
        return new a(this);
    }

    public a(boolean z10, int i10, int i11, float f10) {
        super(f94300i);
        this.f94301d = z10;
        this.f94302e = i10;
        this.f94303f = i11;
        this.f94304g = f10;
    }

    public a(int i10, int i11, float f10) {
        this(true, i10, i11, f10);
    }

    public a(int i10, int i11) {
        this(i10, i11, 1.0f);
    }

    public a(boolean z10, float f10) {
        this(z10, 770, 771, f10);
    }

    public a(float f10) {
        this(true, f10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(a aVar) {
        boolean z10;
        if (aVar == null) {
            z10 = true;
            int i10 = 2 & 1;
        } else {
            z10 = aVar.f94301d;
        }
        this(z10, aVar == null ? 770 : aVar.f94302e, aVar == null ? 771 : aVar.f94303f, aVar == null ? 1.0f : aVar.f94304g);
    }
}
