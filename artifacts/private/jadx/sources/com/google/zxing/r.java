package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f130984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f130985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t[] f130987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f130988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<s, Object> f130989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f130990g;

    public r(String str, byte[] bArr, t[] tVarArr, a aVar) {
        this(str, bArr, tVarArr, aVar, System.currentTimeMillis());
    }

    public void a(t[] tVarArr) {
        t[] tVarArr2 = this.f130987d;
        if (tVarArr2 == null) {
            this.f130987d = tVarArr;
            return;
        }
        if (tVarArr != null && tVarArr.length > 0) {
            t[] tVarArr3 = new t[tVarArr2.length + tVarArr.length];
            System.arraycopy(tVarArr2, 0, tVarArr3, 0, tVarArr2.length);
            System.arraycopy(tVarArr, 0, tVarArr3, tVarArr2.length, tVarArr.length);
            this.f130987d = tVarArr3;
        }
    }

    public a b() {
        return this.f130988e;
    }

    public int c() {
        return this.f130986c;
    }

    public byte[] d() {
        return this.f130985b;
    }

    public Map<s, Object> e() {
        return this.f130989f;
    }

    public t[] f() {
        return this.f130987d;
    }

    public String g() {
        return this.f130984a;
    }

    public long h() {
        return this.f130990g;
    }

    public void i(Map<s, Object> map) {
        if (map != null) {
            Map<s, Object> map2 = this.f130989f;
            if (map2 == null) {
                this.f130989f = map;
                return;
            }
            map2.putAll(map);
        }
    }

    public void j(s sVar, Object obj) {
        if (this.f130989f == null) {
            this.f130989f = new EnumMap(s.class);
        }
        this.f130989f.put(sVar, obj);
    }

    public String toString() {
        return this.f130984a;
    }

    public r(String str, byte[] bArr, t[] tVarArr, a aVar, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, tVarArr, aVar, j10);
    }

    public r(String str, byte[] bArr, int i10, t[] tVarArr, a aVar, long j10) {
        this.f130984a = str;
        this.f130985b = bArr;
        this.f130986c = i10;
        this.f130987d = tVarArr;
        this.f130988e = aVar;
        this.f130989f = null;
        this.f130990g = j10;
    }
}
