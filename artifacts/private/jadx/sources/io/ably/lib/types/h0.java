package io.ably.lib.types;

import com.appsflyer.AppsFlyerProperties;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static io.ably.lib.http.i.b<h0> f288029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static io.ably.lib.http.i.b<h0> f288030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f288031f = y.class.getName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f288032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.gson.annotations.c(AppsFlyerProperties.CHANNEL)
    public String f288033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f288034c;

    private static class b implements io.ably.lib.http.i.b<h0> {
        private b() {
        }

        @Override // io.ably.lib.http.i.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h0[] a(String str, byte[] bArr) throws io.ably.lib.types.a {
            c cVarC;
            try {
                if ("application/json".equals(str)) {
                    cVarC = c.a(bArr);
                } else {
                    cVarC = "application/x-msgpack".equals(str) ? c.c(bArr) : null;
                }
                if (cVarC == null) {
                    return null;
                }
                r rVar = cVarC.f288035a;
                if (rVar != null && rVar.f288156a != 40020) {
                    throw io.ably.lib.types.a.a(rVar);
                }
                return cVarC.f288036b;
            } catch (IOException e10) {
                throw io.ably.lib.types.a.c(e10);
            }
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r f288035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h0[] f288036b;

        private c() {
        }

        static c a(byte[] bArr) {
            return (c) io.ably.lib.util.p.f288250c.r(new String(bArr), c.class);
        }

        static c c(byte[] bArr) throws IOException {
            return new c().b(io.ably.lib.util.p.f288252e.n(bArr));
        }

        c b(org.msgpack.core.o oVar) throws IOException {
            int iB1 = oVar.b1();
            for (int i10 = 0; i10 < iB1; i10++) {
                String strIntern = oVar.h1().intern();
                if (oVar.d().equals(org.msgpack.core.c.f339230f)) {
                    oVar.d1();
                } else {
                    strIntern.getClass();
                    if (strIntern.equals("error")) {
                        this.f288035a = r.a(oVar);
                    } else if (strIntern.equals("batchResponse")) {
                        this.f288036b = h0.g(oVar);
                    } else {
                        io.ably.lib.util.k.k(h0.f288031f, "Unexpected field: " + strIntern);
                        oVar.a9();
                    }
                }
            }
            return this;
        }
    }

    private static class d implements io.ably.lib.http.i.b<h0> {
        private d() {
        }

        @Override // io.ably.lib.http.i.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h0[] a(String str, byte[] bArr) throws io.ably.lib.types.a {
            try {
                if ("application/json".equals(str)) {
                    return h0.e(bArr);
                }
                if ("application/x-msgpack".equals(str)) {
                    return h0.h(bArr);
                }
                return null;
            } catch (IOException e10) {
                throw io.ably.lib.types.a.c(e10);
            }
        }
    }

    static {
        f288029d = new b();
        f288030e = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0[] e(byte[] bArr) {
        return (h0[]) io.ably.lib.util.p.f288250c.r(new String(bArr), h0[].class);
    }

    private static h0 f(org.msgpack.core.o oVar) throws IOException {
        return new h0().j(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0[] g(org.msgpack.core.o oVar) throws IOException {
        int iX0 = oVar.x0();
        h0[] h0VarArr = new h0[iX0];
        for (int i10 = 0; i10 < iX0; i10++) {
            h0VarArr[i10] = f(oVar);
        }
        return h0VarArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0[] h(byte[] bArr) throws IOException {
        return g(io.ably.lib.util.p.f288252e.n(bArr));
    }

    public static io.ably.lib.http.i.b<h0> i(int i10) {
        return i10 < 300 ? f288030e : f288029d;
    }

    private h0 j(org.msgpack.core.o oVar) throws IOException {
        int iB1 = oVar.b1();
        for (int i10 = 0; i10 < iB1; i10++) {
            String strIntern = oVar.h1().intern();
            if (!oVar.d().equals(org.msgpack.core.c.f339230f)) {
                strIntern.getClass();
                switch (strIntern) {
                    case "messageId":
                        this.f288034c = oVar.h1();
                        break;
                    case "error":
                        this.f288032a = r.a(oVar);
                        break;
                    case "channel":
                    case "channelId":
                        this.f288033b = oVar.h1();
                        break;
                    default:
                        io.ably.lib.util.k.k(f288031f, "Unexpected field: " + strIntern);
                        oVar.a9();
                        break;
                }
            } else {
                oVar.d1();
            }
        }
        return this;
    }
}
