package io.ably.lib.util;

import com.google.gson.r;
import io.ably.lib.types.c0;
import io.ably.lib.types.e0;
import io.ably.lib.types.m0;
import io.ably.lib.types.u;
import io.ably.lib.types.x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.msgpack.value.z;

/* JADX INFO: loaded from: classes13.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.gson.q f288248a = new com.google.gson.q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.gson.g f288249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.gson.f f288250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final org.msgpack.core.h.b f288251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final org.msgpack.core.h.c f288252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static d<com.google.gson.l> f288253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static c<com.google.gson.l> f288254g;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f288255a;

        static {
            int[] iArr = new int[z.values().length];
            f288255a = iArr;
            try {
                iArr[z.NIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f288255a[z.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f288255a[z.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f288255a[z.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f288255a[z.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f288255a[z.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f288255a[z.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f288255a[z.MAP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f288255a[z.EXTENSION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public interface b<T> {
        T a(com.google.gson.l lVar);
    }

    static {
        com.google.gson.g gVar = new com.google.gson.g();
        f288249b = gVar;
        gVar.o(u.class, new u.c());
        gVar.o(x.class, new x.a());
        gVar.o(c0.class, new c0.c());
        gVar.o(c0.a.class, new c0.b());
        gVar.o(e0.a.class, new e0.b());
        gVar.o(io.ably.lib.types.b.class, new io.ably.lib.types.b.C1946b());
        gVar.o(io.ably.lib.types.c.class, new io.ably.lib.types.b.a());
        gVar.o(m0.class, new m0.a());
        f288250c = gVar.f();
        f288251d = org.msgpack.core.h.f339263b;
        f288252e = org.msgpack.core.h.f339264c;
        f288253f = new d<>();
        f288254g = new c<>();
    }

    private static void a(com.google.gson.i iVar, org.msgpack.core.j jVar) {
        try {
            jVar.g(iVar.size());
            Iterator<com.google.gson.l> it = iVar.iterator();
            while (it.hasNext()) {
                b(it.next(), jVar);
            }
        } catch (IOException unused) {
        }
    }

    public static void b(com.google.gson.l lVar, org.msgpack.core.j jVar) {
        if (lVar.F()) {
            a((com.google.gson.i) lVar, jVar);
            return;
        }
        if (lVar.J()) {
            d((com.google.gson.o) lVar, jVar);
        } else if (lVar.G()) {
            c((com.google.gson.n) lVar, jVar);
        } else {
            if (!lVar.K()) {
                throw new RuntimeException("unreachable");
            }
            e((r) lVar, jVar);
        }
    }

    private static void c(com.google.gson.n nVar, org.msgpack.core.j jVar) {
        try {
            jVar.E();
        } catch (IOException unused) {
        }
    }

    private static void d(com.google.gson.o oVar, org.msgpack.core.j jVar) {
        try {
            Set<Map.Entry<String, com.google.gson.l>> setEntrySet = oVar.entrySet();
            jVar.y(setEntrySet.size());
            for (Map.Entry<String, com.google.gson.l> entry : setEntrySet) {
                jVar.N(entry.getKey());
                b(entry.getValue(), jVar);
            }
        } catch (IOException unused) {
        }
    }

    private static void e(r rVar, org.msgpack.core.j jVar) {
        try {
            if (rVar.M()) {
                jVar.l(rVar.l());
                return;
            }
            if (!rVar.O()) {
                jVar.N(rVar.D());
                return;
            }
            Number numberB = rVar.B();
            if (!(numberB instanceof BigDecimal) && !(numberB instanceof Double)) {
                if (numberB instanceof Float) {
                    jVar.r(numberB.floatValue());
                    return;
                }
                if (!(numberB instanceof BigInteger) && !(numberB instanceof Long)) {
                    if (numberB instanceof Integer) {
                        jVar.t(numberB.intValue());
                        return;
                    }
                    if (numberB instanceof Short) {
                        jVar.I(numberB.shortValue());
                        return;
                    } else if (numberB instanceof Byte) {
                        jVar.m(numberB.byteValue());
                        return;
                    } else {
                        jVar.N(rVar.D());
                        return;
                    }
                }
                jVar.x(numberB.longValue());
                return;
            }
            jVar.o(numberB.doubleValue());
        } catch (IOException unused) {
        }
    }

    public static byte[] f(com.google.gson.l lVar) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            org.msgpack.core.j jVarG = f288251d.g(byteArrayOutputStream);
            b(lVar, jVarG);
            jVarG.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    public static com.google.gson.l g(byte[] bArr) {
        return (com.google.gson.l) h(bArr, com.google.gson.l.class);
    }

    public static <T> T h(byte[] bArr, Class<T> cls) {
        try {
            return (T) f288250c.r(new String(bArr, "UTF-8"), cls);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static com.google.gson.l i(org.msgpack.value.x xVar) {
        switch (a.f288255a[xVar.i1().ordinal()]) {
            case 1:
                return com.google.gson.n.f125555a;
            case 2:
                return new r(Boolean.valueOf(xVar.s().Q()));
            case 3:
                return new r(Long.valueOf(xVar.l().m()));
            case 4:
                return new r(Double.valueOf(xVar.w().R()));
            case 5:
                return new r(xVar.r().u());
            case 6:
                return new r(io.ably.lib.util.b.l(xVar.n().k()));
            case 7:
                com.google.gson.i iVar = new com.google.gson.i();
                Iterator<org.msgpack.value.x> it = xVar.t().iterator();
                while (it.hasNext()) {
                    iVar.L(i(it.next()));
                }
                return iVar;
            case 8:
                com.google.gson.o oVar = new com.google.gson.o();
                for (Map.Entry<org.msgpack.value.x, org.msgpack.value.x> entry : xVar.i().entrySet()) {
                    oVar.L(entry.getKey().r().u(), i(entry.getValue()));
                }
                return oVar;
            default:
                return null;
        }
    }

    public static com.google.gson.l j(byte[] bArr) {
        try {
            return i(f288252e.n(bArr).j1());
        } catch (IOException unused) {
            return null;
        }
    }

    public static class c<T> implements io.ably.lib.http.i.b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T[]> f288256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b<T> f288257b;

        public c(Class<T[]> cls, b<T> bVar) {
            this.f288256a = cls;
            this.f288257b = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.ably.lib.http.i.b
        public T[] a(String str, byte[] bArr) throws io.ably.lib.types.a {
            com.google.gson.i iVar;
            if ("application/json".equals(str)) {
                Class<T[]> cls = this.f288256a;
                if (cls != null) {
                    return (T[]) ((Object[]) p.h(bArr, cls));
                }
                iVar = (com.google.gson.i) p.h(bArr, com.google.gson.i.class);
            } else {
                if (!"application/x-msgpack".equals(str)) {
                    throw io.ably.lib.types.a.c(new Exception("unknown content type " + str));
                }
                iVar = (com.google.gson.i) p.j(bArr);
            }
            Class<T[]> cls2 = this.f288256a;
            T[] tArrCast = cls2.cast(Array.newInstance(cls2.getComponentType(), iVar.size()));
            int i10 = 0;
            for (com.google.gson.l lVar : iVar) {
                b<T> bVar = this.f288257b;
                if (bVar != null) {
                    tArrCast[i10] = bVar.a(lVar);
                } else {
                    tArrCast[i10] = lVar;
                }
                i10++;
            }
            return tArrCast;
        }

        public <U extends com.google.gson.l> c() {
            this(null, null);
        }
    }

    public static class d<T> implements io.ably.lib.http.i.e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f288258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b<T> f288259b;

        public d(Class<T> cls, b<T> bVar) {
            this.f288258a = cls;
            this.f288259b = bVar;
        }

        @Override // io.ably.lib.http.i.e
        public T a(io.ably.lib.http.i.d dVar, io.ably.lib.types.r rVar) throws io.ably.lib.types.a {
            if (rVar != null) {
                throw io.ably.lib.types.a.a(rVar);
            }
            if ("application/json".equals(dVar.f287359d)) {
                Class<T> cls = this.f288258a;
                return cls != null ? (T) p.h(dVar.f287361f, cls) : (T) p.g(dVar.f287361f);
            }
            if ("application/x-msgpack".equals(dVar.f287359d)) {
                b<T> bVar = this.f288259b;
                return bVar != null ? bVar.a(p.j(dVar.f287361f)) : (T) p.j(dVar.f287361f);
            }
            throw io.ably.lib.types.a.c(new Exception("unknown content type " + dVar.f287359d));
        }

        public <U extends com.google.gson.l> d() {
            this(null, null);
        }
    }
}
