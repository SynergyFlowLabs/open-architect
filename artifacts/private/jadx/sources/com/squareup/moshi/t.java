package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class t implements Closeable, Flushable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f267267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f267268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f267269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f267270h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<Class<?>, Object> f267272j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f267263a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f267264b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String[] f267265c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f267266d = new int[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f267271i = -1;

    t() {
    }

    @fj.c
    public static t r(okio.m mVar) {
        return new p(mVar);
    }

    public final void C1(boolean z10) {
        this.f267268f = z10;
    }

    final void E(int i10) {
        this.f267264b[this.f267263a - 1] = i10;
    }

    public void H(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f267267e = str;
    }

    public final void I(boolean z10) {
        this.f267269g = z10;
    }

    public final <T> void N(Class<T> cls, T t10) {
        if (cls.isAssignableFrom(t10.getClass())) {
            if (this.f267272j == null) {
                this.f267272j = new LinkedHashMap();
            }
            this.f267272j.put(cls, t10);
        } else {
            throw new IllegalArgumentException("Tag value must be of type " + cls.getName());
        }
    }

    @fj.h
    @fj.c
    public final <T> T R(Class<T> cls) {
        Map<Class<?>, Object> map = this.f267272j;
        if (map == null) {
            return null;
        }
        return (T) map.get(cls);
    }

    @fj.c
    public final String S() {
        return n.a(this.f267263a, this.f267264b, this.f267265c, this.f267266d);
    }

    public abstract t T(double d10) throws IOException;

    public abstract t X(long j10) throws IOException;

    public abstract t Y(@fj.h Boolean bool) throws IOException;

    public abstract t a() throws IOException;

    @fj.c
    public final int b() {
        int iT = t();
        if (iT != 5 && iT != 3 && iT != 2 && iT != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f267271i;
        this.f267271i = this.f267263a;
        return i10;
    }

    public abstract t c() throws IOException;

    final boolean d() {
        int i10 = this.f267263a;
        int[] iArr = this.f267264b;
        if (i10 != iArr.length) {
            return false;
        }
        if (i10 == 256) {
            throw new j("Nesting too deep at " + S() + ": circular reference?");
        }
        this.f267264b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f267265c;
        this.f267265c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f267266d;
        this.f267266d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (this instanceof s) {
            s sVar = (s) this;
            Object[] objArr = sVar.f267259k;
            sVar.f267259k = Arrays.copyOf(objArr, objArr.length * 2);
        }
        return true;
    }

    public abstract t d0(@fj.h Number number) throws IOException;

    public abstract t e() throws IOException;

    public final void f(int i10) {
        this.f267271i = i10;
    }

    public abstract t f0(@fj.h String str) throws IOException;

    public abstract t g() throws IOException;

    public final t g0(okio.n nVar) throws IOException {
        if (this.f267270h) {
            throw new IllegalStateException("BufferedSource cannot be used as a map key in JSON at path " + S());
        }
        okio.m mVarK0 = k0();
        try {
            nVar.g8(mVarK0);
            if (mVarK0 != null) {
                mVarK0.close();
            }
            return this;
        } catch (Throwable th2) {
            if (mVarK0 != null) {
                try {
                    mVarK0.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @fj.c
    public final String h() {
        String str = this.f267267e;
        return str != null ? str : "";
    }

    @fj.c
    public final boolean j() {
        return this.f267269g;
    }

    public abstract t j0(boolean z10) throws IOException;

    @fj.c
    public abstract okio.m k0() throws IOException;

    @fj.c
    public final boolean l() {
        return this.f267268f;
    }

    public final t m(@fj.h Object obj) throws IOException {
        if (obj instanceof Map) {
            c();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(key == null ? "Map keys must be non-null" : "Map keys must be of type String: " + key.getClass().getName());
                }
                o((String) key);
                m(entry.getValue());
            }
            g();
            return this;
        }
        if (obj instanceof List) {
            a();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m(it.next());
            }
            e();
            return this;
        }
        if (obj instanceof String) {
            f0((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            j0(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Double) {
            T(((Double) obj).doubleValue());
            return this;
        }
        if (obj instanceof Long) {
            X(((Long) obj).longValue());
            return this;
        }
        if (obj instanceof Number) {
            d0((Number) obj);
            return this;
        }
        if (obj == null) {
            q();
            return this;
        }
        throw new IllegalArgumentException("Unsupported type: " + obj.getClass().getName());
    }

    public abstract t o(String str) throws IOException;

    public abstract t q() throws IOException;

    final int t() {
        int i10 = this.f267263a;
        if (i10 != 0) {
            return this.f267264b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void x() throws IOException {
        int iT = t();
        if (iT != 5 && iT != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f267270h = true;
    }

    final void y(int i10) {
        int[] iArr = this.f267264b;
        int i11 = this.f267263a;
        this.f267263a = i11 + 1;
        iArr[i11] = i10;
    }
}
