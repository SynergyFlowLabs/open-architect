package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.p0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class m implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f267171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f267172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String[] f267173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f267174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f267175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f267176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<Class<?>, Object> f267177g;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f267178a;

        static {
            int[] iArr = new int[c.values().length];
            f267178a = iArr;
            try {
                iArr[c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f267178a[c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f267178a[c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f267178a[c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f267178a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f267178a[c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String[] f267179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final p0 f267180b;

        private b(String[] strArr, p0 p0Var) {
            this.f267179a = strArr;
            this.f267180b = p0Var;
        }

        @fj.c
        public static b a(String... strArr) {
            try {
                okio.o[] oVarArr = new okio.o[strArr.length];
                okio.l lVar = new okio.l();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    p.H0(lVar, strArr[i10]);
                    lVar.readByte();
                    oVarArr[i10] = lVar.r7();
                }
                return new b((String[]) strArr.clone(), p0.n(oVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        public List<String> b() {
            return Collections.unmodifiableList(Arrays.asList(this.f267179a));
        }
    }

    public enum c {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    m() {
        this.f267172b = new int[32];
        this.f267173c = new String[32];
        this.f267174d = new int[32];
    }

    @fj.c
    public static m e(okio.n nVar) {
        return new o(nVar);
    }

    public final void C1(boolean z10) {
        this.f267175e = z10;
    }

    final j E(@fj.h Object obj, Object obj2) {
        if (obj == null) {
            return new j("Expected " + obj2 + " but was null at path " + S());
        }
        return new j("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + S());
    }

    public abstract void F0() throws IOException;

    public abstract void F1() throws IOException;

    public abstract void J0() throws IOException;

    @fj.c
    public final String S() {
        return n.a(this.f267171a, this.f267172b, this.f267173c, this.f267174d);
    }

    @fj.c
    public final boolean a() {
        return this.f267176f;
    }

    public abstract void a9() throws IOException;

    @fj.c
    public final boolean b() {
        return this.f267175e;
    }

    @fj.h
    public abstract <T> T c() throws IOException;

    public abstract okio.n d() throws IOException;

    @fj.c
    public abstract c f() throws IOException;

    @fj.c
    public abstract m g();

    public abstract void h() throws IOException;

    @fj.c
    public abstract boolean hasNext() throws IOException;

    final void j(int i10) {
        int i11 = this.f267171a;
        int[] iArr = this.f267172b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new j("Nesting too deep at " + S());
            }
            this.f267172b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f267173c;
            this.f267173c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f267174d;
            this.f267174d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f267172b;
        int i12 = this.f267171a;
        this.f267171a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract String jc() throws IOException;

    @fj.h
    public final Object l() throws IOException {
        switch (a.f267178a[f().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                J0();
                while (hasNext()) {
                    arrayList.add(l());
                }
                F0();
                return arrayList;
            case 2:
                u uVar = new u();
                m1();
                while (hasNext()) {
                    String strNa = na();
                    Object objL = l();
                    Object objPut = uVar.put(strNa, objL);
                    if (objPut != null) {
                        throw new j("Map key '" + strNa + "' has multiple values at path " + S() + ": " + objPut + " and " + objL);
                    }
                }
                F1();
                return uVar;
            case 3:
                return jc();
            case 4:
                return Double.valueOf(nextDouble());
            case 5:
                return Boolean.valueOf(nextBoolean());
            case 6:
                return c();
            default:
                throw new IllegalStateException("Expected a value but was " + f() + " at path " + S());
        }
    }

    @fj.c
    public abstract int m(b bVar) throws IOException;

    public abstract void m1() throws IOException;

    @fj.c
    public abstract String na() throws IOException;

    public abstract boolean nextBoolean() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract long nextLong() throws IOException;

    @fj.c
    public abstract int o(b bVar) throws IOException;

    public final void q(boolean z10) {
        this.f267176f = z10;
    }

    public final <T> void r(Class<T> cls, T t10) {
        if (cls.isAssignableFrom(t10.getClass())) {
            if (this.f267177g == null) {
                this.f267177g = new LinkedHashMap();
            }
            this.f267177g.put(cls, t10);
        } else {
            throw new IllegalArgumentException("Tag value must be of type " + cls.getName());
        }
    }

    public abstract void t() throws IOException;

    final k x(String str) throws k {
        throw new k(str + " at path " + S());
    }

    @fj.h
    @fj.c
    public final <T> T y(Class<T> cls) {
        Map<Class<?>, Object> map = this.f267177g;
        if (map == null) {
            return null;
        }
        return (T) map.get(cls);
    }

    m(m mVar) {
        this.f267171a = mVar.f267171a;
        this.f267172b = (int[]) mVar.f267172b.clone();
        this.f267173c = (String[]) mVar.f267173c.clone();
        this.f267174d = (int[]) mVar.f267174d.clone();
        this.f267175e = mVar.f267175e;
        this.f267176f = mVar.f267176f;
    }
}
