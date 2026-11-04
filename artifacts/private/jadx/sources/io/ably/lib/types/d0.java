package io.ably.lib.types;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static io.ably.lib.http.i.b<c0> f287946a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f287947b = d0.class.getName();

    private static class a implements io.ably.lib.http.i.b<c0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private l f287948a;

        a(l lVar) {
            this.f287948a = lVar;
        }

        @Override // io.ably.lib.http.i.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c0[] a(String str, byte[] bArr) throws io.ably.lib.types.a {
            try {
                c0[] c0VarArrF = "application/json".equals(str) ? d0.f(bArr) : "application/x-msgpack".equals(str) ? d0.g(bArr) : null;
                if (c0VarArrF != null) {
                    for (c0 c0Var : c0VarArrF) {
                        try {
                            c0Var.b(this.f287948a);
                        } catch (w e10) {
                            io.ably.lib.util.k.d(d0.f287947b, e10.f287918a.f288158c);
                        }
                    }
                }
                return c0VarArrF;
            } catch (IOException e11) {
                throw io.ably.lib.types.a.c(e11);
            }
        }
    }

    public static io.ably.lib.http.i.c c(c0 c0Var) throws io.ably.lib.types.a {
        return d(new c0[]{c0Var});
    }

    public static io.ably.lib.http.i.c d(c0[] c0VarArr) {
        return new io.ably.lib.http.m.c(io.ably.lib.util.p.f288250c.D(c0VarArr));
    }

    public static io.ably.lib.http.i.b<c0> e(l lVar) {
        return lVar == null ? f287946a : new a(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c0[] f(byte[] bArr) throws IOException {
        return (c0[]) io.ably.lib.util.p.f288250c.r(new String(bArr), c0[].class);
    }

    public static c0[] g(byte[] bArr) throws io.ably.lib.types.a {
        try {
            return h(io.ably.lib.util.p.f288252e.n(bArr));
        } catch (IOException e10) {
            throw io.ably.lib.types.a.c(e10);
        }
    }

    public static c0[] h(org.msgpack.core.o oVar) throws IOException {
        int iX0 = oVar.x0();
        c0[] c0VarArr = new c0[iX0];
        for (int i10 = 0; i10 < iX0; i10++) {
            c0VarArr[i10] = c0.t(oVar);
        }
        return c0VarArr;
    }

    public static void i(c0[] c0VarArr, org.msgpack.core.j jVar) {
        try {
            jVar.g(c0VarArr.length);
            for (c0 c0Var : c0VarArr) {
                c0Var.w(jVar);
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] j(c0[] c0VarArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            org.msgpack.core.j jVarG = io.ably.lib.util.p.f288251d.g(byteArrayOutputStream);
            i(c0VarArr, jVarG);
            jVarG.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }
}
