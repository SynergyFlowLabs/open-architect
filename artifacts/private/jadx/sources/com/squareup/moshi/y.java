package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f267330b = "Expected %s but was %s at path %s";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.squareup.moshi.h.e f267329a = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final com.squareup.moshi.h<Boolean> f267331c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final com.squareup.moshi.h<Byte> f267332d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final com.squareup.moshi.h<Character> f267333e = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final com.squareup.moshi.h<Double> f267334f = new g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final com.squareup.moshi.h<Float> f267335g = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final com.squareup.moshi.h<Integer> f267336h = new i();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final com.squareup.moshi.h<Long> f267337i = new j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final com.squareup.moshi.h<Short> f267338j = new k();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final com.squareup.moshi.h<String> f267339k = new a();

    class a extends com.squareup.moshi.h<String> {
        a() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public String b(com.squareup.moshi.m mVar) throws IOException {
            return mVar.jc();
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(t tVar, String str) throws IOException {
            tVar.f0(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f267340a;

        static {
            int[] iArr = new int[com.squareup.moshi.m.c.values().length];
            f267340a = iArr;
            try {
                iArr[com.squareup.moshi.m.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f267340a[com.squareup.moshi.m.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f267340a[com.squareup.moshi.m.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f267340a[com.squareup.moshi.m.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f267340a[com.squareup.moshi.m.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f267340a[com.squareup.moshi.m.c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    class c implements com.squareup.moshi.h.e {
        c() {
        }

        @Override // com.squareup.moshi.h.e
        public com.squareup.moshi.h<?> a(Type type, Set<? extends Annotation> set, w wVar) throws NoSuchMethodException {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return y.f267331c;
            }
            if (type == Byte.TYPE) {
                return y.f267332d;
            }
            if (type == Character.TYPE) {
                return y.f267333e;
            }
            if (type == Double.TYPE) {
                return y.f267334f;
            }
            if (type == Float.TYPE) {
                return y.f267335g;
            }
            if (type == Integer.TYPE) {
                return y.f267336h;
            }
            if (type == Long.TYPE) {
                return y.f267337i;
            }
            if (type == Short.TYPE) {
                return y.f267338j;
            }
            if (type == Boolean.class) {
                return y.f267331c.j();
            }
            if (type == Byte.class) {
                return y.f267332d.j();
            }
            if (type == Character.class) {
                return y.f267333e.j();
            }
            if (type == Double.class) {
                return y.f267334f.j();
            }
            if (type == Float.class) {
                return y.f267335g.j();
            }
            if (type == Integer.class) {
                return y.f267336h.j();
            }
            if (type == Long.class) {
                return y.f267337i.j();
            }
            if (type == Short.class) {
                return y.f267338j.j();
            }
            if (type == String.class) {
                return y.f267339k.j();
            }
            if (type == Object.class) {
                return new m(wVar).j();
            }
            Class<?> clsJ = a0.j(type);
            com.squareup.moshi.h<?> hVarF = Util.f(wVar, type, clsJ);
            if (hVarF != null) {
                return hVarF;
            }
            if (clsJ.isEnum()) {
                return new l(clsJ).j();
            }
            return null;
        }
    }

    class d extends com.squareup.moshi.h<Boolean> {
        d() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Boolean b(com.squareup.moshi.m mVar) throws IOException {
            return Boolean.valueOf(mVar.nextBoolean());
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(t tVar, Boolean bool) throws IOException {
            tVar.j0(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    class e extends com.squareup.moshi.h<Byte> {
        e() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Byte b(com.squareup.moshi.m mVar) throws IOException {
            return Byte.valueOf((byte) y.a(mVar, "a byte", -128, 255));
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(t tVar, Byte b10) throws IOException {
            tVar.X(b10.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    class f extends com.squareup.moshi.h<Character> {
        f() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Character b(com.squareup.moshi.m mVar) throws IOException {
            String strJc = mVar.jc();
            if (strJc.length() <= 1) {
                return Character.valueOf(strJc.charAt(0));
            }
            throw new com.squareup.moshi.j(String.format(y.f267330b, "a char", '\"' + strJc + '\"', mVar.S()));
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(t tVar, Character ch2) throws IOException {
            tVar.f0(ch2.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    class g extends com.squareup.moshi.h<Double> {
        g() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Double b(com.squareup.moshi.m mVar) throws IOException {
            return Double.valueOf(mVar.nextDouble());
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(t tVar, Double d10) throws IOException {
            tVar.T(d10.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    class h extends com.squareup.moshi.h<Float> {
        h() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Float b(com.squareup.moshi.m mVar) throws IOException {
            float fNextDouble = (float) mVar.nextDouble();
            if (mVar.b() || !Float.isInfinite(fNextDouble)) {
                return Float.valueOf(fNextDouble);
            }
            throw new com.squareup.moshi.j("JSON forbids NaN and infinities: " + fNextDouble + " at path " + mVar.S());
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(t tVar, Float f10) throws IOException {
            f10.getClass();
            tVar.d0(f10);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    class i extends com.squareup.moshi.h<Integer> {
        i() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Integer b(com.squareup.moshi.m mVar) throws IOException {
            return Integer.valueOf(mVar.nextInt());
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(t tVar, Integer num) throws IOException {
            tVar.X(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    class j extends com.squareup.moshi.h<Long> {
        j() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Long b(com.squareup.moshi.m mVar) throws IOException {
            return Long.valueOf(mVar.nextLong());
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(t tVar, Long l10) throws IOException {
            tVar.X(l10.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    class k extends com.squareup.moshi.h<Short> {
        k() {
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Short b(com.squareup.moshi.m mVar) throws IOException {
            return Short.valueOf((short) y.a(mVar, "a short", -32768, 32767));
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(t tVar, Short sh2) throws IOException {
            tVar.X(sh2.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    static final class l<T extends Enum<T>> extends com.squareup.moshi.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f267341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f267342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final T[] f267343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.squareup.moshi.m.b f267344d;

        l(Class<T> cls) {
            this.f267341a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f267343c = enumConstants;
                this.f267342b = new String[enumConstants.length];
                int i10 = 0;
                while (true) {
                    T[] tArr = this.f267343c;
                    if (i10 >= tArr.length) {
                        this.f267344d = com.squareup.moshi.m.b.a(this.f267342b);
                        return;
                    } else {
                        String strName = tArr[i10].name();
                        this.f267342b[i10] = Util.q(strName, cls.getField(strName));
                        i10++;
                    }
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError("Missing field in " + cls.getName(), e10);
            }
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public T b(com.squareup.moshi.m mVar) throws IOException {
            int iO = mVar.o(this.f267344d);
            if (iO != -1) {
                return this.f267343c[iO];
            }
            String strS = mVar.S();
            throw new com.squareup.moshi.j("Expected one of " + Arrays.asList(this.f267342b) + " but was " + mVar.jc() + " at path " + strS);
        }

        @Override // com.squareup.moshi.h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(t tVar, T t10) throws IOException {
            tVar.f0(this.f267342b[t10.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f267341a.getName() + ")";
        }
    }

    static final class m extends com.squareup.moshi.h<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w f267345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.squareup.moshi.h<List> f267346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.squareup.moshi.h<Map> f267347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.squareup.moshi.h<String> f267348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.squareup.moshi.h<Double> f267349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.squareup.moshi.h<Boolean> f267350f;

        m(w wVar) {
            this.f267345a = wVar;
            this.f267346b = wVar.c(List.class);
            this.f267347c = wVar.c(Map.class);
            this.f267348d = wVar.c(String.class);
            this.f267349e = wVar.c(Double.class);
            this.f267350f = wVar.c(Boolean.class);
        }

        private Class<?> p(Class<?> cls) {
            if (Map.class.isAssignableFrom(cls)) {
                return Map.class;
            }
            return Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // com.squareup.moshi.h
        public Object b(com.squareup.moshi.m mVar) throws IOException {
            switch (b.f267340a[mVar.f().ordinal()]) {
                case 1:
                    return this.f267346b.b(mVar);
                case 2:
                    return this.f267347c.b(mVar);
                case 3:
                    return this.f267348d.b(mVar);
                case 4:
                    return this.f267349e.b(mVar);
                case 5:
                    return this.f267350f.b(mVar);
                case 6:
                    return mVar.c();
                default:
                    throw new IllegalStateException("Expected a value but was " + mVar.f() + " at path " + mVar.S());
            }
        }

        @Override // com.squareup.moshi.h
        public void m(t tVar, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls != Object.class) {
                this.f267345a.f(p(cls), Util.f267158a).m(tVar, obj);
            } else {
                tVar.c();
                tVar.g();
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    private y() {
    }

    static int a(com.squareup.moshi.m mVar, String str, int i10, int i11) throws IOException {
        int iNextInt = mVar.nextInt();
        if (iNextInt < i10 || iNextInt > i11) {
            throw new com.squareup.moshi.j(String.format(f267330b, str, Integer.valueOf(iNextInt), mVar.S()));
        }
        return iNextInt;
    }
}
