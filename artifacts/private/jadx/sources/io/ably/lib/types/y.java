package io.ably.lib.types;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static io.ably.lib.http.i.b<u> f288201a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f288202b = y.class.getName();

    private static class a implements io.ably.lib.http.i.b<u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private l f288203a;

        a(l lVar) {
            this.f288203a = lVar;
        }

        @Override // io.ably.lib.http.i.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u[] a(String str, byte[] bArr) throws io.ably.lib.types.a {
            try {
                u[] uVarArrI = "application/json".equals(str) ? y.i(bArr) : "application/x-msgpack".equals(str) ? y.j(bArr) : null;
                if (uVarArrI != null) {
                    for (u uVar : uVarArrI) {
                        try {
                            uVar.b(this.f288203a);
                        } catch (w e10) {
                            io.ably.lib.util.k.d(y.f288202b, e10.f287918a.f288158c);
                        }
                    }
                }
                return uVarArrI;
            } catch (w e11) {
                throw io.ably.lib.types.a.c(e11);
            }
        }
    }

    public static io.ably.lib.http.i.c b(u.a[] aVarArr) {
        return new io.ably.lib.http.m.c(io.ably.lib.util.p.f288250c.D(aVarArr));
    }

    public static io.ably.lib.http.i.c c(u uVar) throws io.ably.lib.types.a {
        return d(new u[]{uVar});
    }

    public static io.ably.lib.http.i.c d(u[] uVarArr) {
        return new io.ably.lib.http.m.c(io.ably.lib.util.p.f288250c.D(uVarArr));
    }

    public static io.ably.lib.http.i.c e(u uVar) throws io.ably.lib.types.a {
        return g(new u[]{uVar});
    }

    public static io.ably.lib.http.i.c f(u.a[] aVarArr) {
        return new io.ably.lib.http.m.a(p(aVarArr), "application/x-msgpack");
    }

    public static io.ably.lib.http.i.c g(u[] uVarArr) {
        return new io.ably.lib.http.m.a(q(uVarArr), "application/x-msgpack");
    }

    public static io.ably.lib.http.i.b<u> h(l lVar) {
        return lVar == null ? f288201a : new a(lVar);
    }

    public static u[] i(byte[] bArr) throws w {
        return (u[]) io.ably.lib.util.p.f288250c.r(new String(bArr), u[].class);
    }

    public static u[] j(byte[] bArr) throws io.ably.lib.types.a {
        try {
            return k(io.ably.lib.util.p.f288252e.n(bArr));
        } catch (IOException e10) {
            throw io.ably.lib.types.a.c(e10);
        }
    }

    public static u[] k(org.msgpack.core.o oVar) throws IOException {
        int iX0 = oVar.x0();
        u[] uVarArr = new u[iX0];
        for (int i10 = 0; i10 < iX0; i10++) {
            uVarArr[i10] = u.t(oVar);
        }
        return uVarArr;
    }

    public static Map<String, String> l(org.msgpack.core.o oVar) throws IOException {
        HashMap map = new HashMap();
        int iB1 = oVar.b1();
        int i10 = 0 >> 0;
        for (int i11 = 0; i11 < iB1; i11++) {
            String strH1 = oVar.h1();
            if (oVar.d().equals(org.msgpack.core.c.f339230f)) {
                oVar.d1();
            } else {
                map.put(strH1, oVar.h1());
            }
        }
        return map;
    }

    public static void m(Map<String, String> map, org.msgpack.core.j jVar) throws IOException {
        jVar.y(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            jVar.N(entry.getKey());
            jVar.N(entry.getValue());
        }
    }

    static void n(u.a[] aVarArr, org.msgpack.core.j jVar) throws IOException {
        try {
            jVar.g(aVarArr.length);
            for (u.a aVar : aVarArr) {
                aVar.a(jVar);
            }
        } catch (IOException unused) {
        }
    }

    public static void o(u[] uVarArr, org.msgpack.core.j jVar) {
        try {
            jVar.g(uVarArr.length);
            boolean z10 = false;
            for (u uVar : uVarArr) {
                uVar.v(jVar);
            }
        } catch (IOException unused) {
        }
    }

    static byte[] p(u.a[] aVarArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            org.msgpack.core.j jVarG = io.ably.lib.util.p.f288251d.g(byteArrayOutputStream);
            n(aVarArr, jVarG);
            jVarG.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    public static byte[] q(u[] uVarArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            org.msgpack.core.j jVarG = io.ably.lib.util.p.f288251d.g(byteArrayOutputStream);
            o(uVarArr, jVarG);
            jVarG.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }
}
