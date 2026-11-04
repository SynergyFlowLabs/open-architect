package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
class n4<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o6 f129490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f129491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o6 f129492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V f129493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t2 f129494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f129495f;

    private n4(int i10) {
        byte[] bArr = new byte[i10];
        this.f129495f = bArr;
        this.f129494e = t2.f(bArr);
    }

    public k2 a() {
        if (this.f129494e.D0() == 0) {
            return new r2(this.f129495f);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public t2 b() {
        return this.f129494e;
    }

    /* synthetic */ n4(int i10, byte b10) {
        this(i10);
    }
}
