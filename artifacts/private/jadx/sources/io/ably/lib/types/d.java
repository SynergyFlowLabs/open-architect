package io.ably.lib.types;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f287944a = "io.ably.lib.types.d";

    private static class a implements io.ably.lib.http.i.b<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f287945a;

        a(l lVar) {
            this.f287945a = lVar;
        }

        @Override // io.ably.lib.http.i.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] a(String str, byte[] bArr) throws io.ably.lib.types.a {
            try {
                b[] bVarArrE = "application/json".equals(str) ? d.e(bArr) : "application/x-msgpack".equals(str) ? d.f(bArr) : null;
                if (bVarArrE != null) {
                    for (b bVar : bVarArrE) {
                        try {
                            if (bVar.f288022f != null) {
                                bVar.b(this.f287945a);
                            }
                        } catch (w e10) {
                            io.ably.lib.util.k.d(d.f287944a, e10.f287918a.f288158c);
                        }
                    }
                }
                return bVarArrE;
            } catch (w e11) {
                throw io.ably.lib.types.a.c(e11);
            }
        }
    }

    public static io.ably.lib.http.i.c b(b[] bVarArr) {
        return new io.ably.lib.http.m.c(io.ably.lib.util.p.f288250c.D(bVarArr));
    }

    public static io.ably.lib.http.i.c c(b[] bVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            org.msgpack.core.j jVarG = io.ably.lib.util.p.f288251d.g(byteArrayOutputStream);
            jVarG.g(bVarArr.length);
            for (b bVar : bVarArr) {
                bVar.s(jVarG);
            }
            jVarG.flush();
        } catch (IOException e10) {
            io.ably.lib.util.k.e(f287944a, e10.getMessage(), e10);
        }
        return new io.ably.lib.http.m.a(byteArrayOutputStream.toByteArray(), "application/x-msgpack");
    }

    public static io.ably.lib.http.i.b<b> d(l lVar) {
        return new a(lVar);
    }

    public static b[] e(byte[] bArr) throws w {
        return (b[]) io.ably.lib.util.p.f288250c.r(new String(bArr), b[].class);
    }

    public static b[] f(byte[] bArr) throws io.ably.lib.types.a {
        try {
            return g(io.ably.lib.util.p.f288252e.n(bArr));
        } catch (IOException e10) {
            throw io.ably.lib.types.a.c(e10);
        }
    }

    public static b[] g(org.msgpack.core.o oVar) throws IOException {
        int iX0 = oVar.x0();
        b[] bVarArr = new b[iX0];
        for (int i10 = 0; i10 < iX0; i10++) {
            bVarArr[i10] = b.q(oVar);
        }
        return bVarArr;
    }

    public static void h(b[] bVarArr, org.msgpack.core.j jVar) {
        try {
            jVar.g(bVarArr.length);
            for (b bVar : bVarArr) {
                bVar.s(jVar);
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }
}
