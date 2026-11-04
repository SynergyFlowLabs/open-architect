package io.ably.lib.http;

import io.ably.lib.types.b0;
import io.ably.lib.types.r;
import io.ably.lib.types.t;
import io.ably.lib.util.p;
import io.ktor.http.t1;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes13.dex */
public class k implements i.e<t> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final i.b<com.google.gson.l> f287376h = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f287377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f287378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f287379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b0[] f287380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0[] f287381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i.c f287382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i.b<com.google.gson.l> f287383g = f287376h;

    class a implements f.b<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0[] f287384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i.e f287385b;

        a(b0[] b0VarArr, i.e eVar) {
            this.f287384a = b0VarArr;
            this.f287385b = eVar;
        }

        @Override // io.ably.lib.http.f.b
        public void a(l lVar, io.ably.lib.types.i<t> iVar) throws io.ably.lib.types.a {
            lVar.e(k.this.f287379c, k.this.f287378b, k.this.f287380d, this.f287384a, k.this.f287382f, this.f287385b, true, iVar);
        }
    }

    class b implements i.b<com.google.gson.l> {
        b() {
        }

        @Override // io.ably.lib.http.i.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.google.gson.l[] a(String str, byte[] bArr) throws io.ably.lib.types.a {
            if (!"application/json".equals(str)) {
                throw io.ably.lib.types.a.a(new r("Unexpected content type: " + str, 500, 50000));
            }
            com.google.gson.l lVarC = p.f288248a.c(new String(bArr, Charset.forName("UTF-8")));
            if (!lVarC.F()) {
                return new com.google.gson.l[]{lVarC};
            }
            com.google.gson.i iVarT = lVarC.t();
            int size = iVarT.size();
            com.google.gson.l[] lVarArr = new com.google.gson.l[size];
            for (int i10 = 0; i10 < size; i10++) {
                lVarArr[i10] = iVarT.U(i10);
            }
            return lVarArr;
        }
    }

    public class c extends t {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.google.gson.l[] f287387f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f287388g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f287389h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f287390i;

        /* synthetic */ c(k kVar, i.d dVar, r rVar, a aVar) throws io.ably.lib.types.a {
            this(dVar, rVar);
        }

        private t i(String str) throws io.ably.lib.types.a {
            if (str == null) {
                return null;
            }
            Matcher matcher = d.f287275h.matcher(str);
            if (!matcher.matches()) {
                throw io.ably.lib.types.a.a(new r("Unexpected link URL format", 500, 50000));
            }
            String[] strArrSplit = matcher.group(2).split("&");
            b0[] b0VarArr = new b0[strArrSplit.length];
            for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                try {
                    String[] strArrSplit2 = strArrSplit[i10].split("=");
                    b0VarArr[i10] = new b0(strArrSplit2[0], URLDecoder.decode(strArrSplit2.length >= 2 ? strArrSplit2[1] : "", "UTF-8"));
                } catch (UnsupportedEncodingException unused) {
                }
            }
            return k.this.h(b0VarArr);
        }

        @Override // io.ably.lib.types.t
        public t a() throws io.ably.lib.types.a {
            return i(this.f287389h);
        }

        @Override // io.ably.lib.types.t
        public t b() throws io.ably.lib.types.a {
            return i(this.f287388g);
        }

        @Override // io.ably.lib.types.t
        public boolean c() {
            return this.f287389h != null;
        }

        @Override // io.ably.lib.types.t
        public boolean d() {
            return this.f287388g != null;
        }

        @Override // io.ably.lib.types.t
        public boolean e() {
            return this.f287390i != null;
        }

        @Override // io.ably.lib.types.t
        public boolean f() {
            return this.f287390i == null;
        }

        @Override // io.ably.lib.types.t
        public com.google.gson.l[] g() {
            return this.f287387f;
        }

        @Override // io.ably.lib.types.t
        public t h() throws io.ably.lib.types.a {
            return i(this.f287390i);
        }

        private c(i.d dVar, r rVar) throws io.ably.lib.types.a {
            this.f288162b = dVar.f287356a;
            this.f288165e = m.n(dVar.f287358c);
            if (rVar != null) {
                this.f288163c = rVar.f288156a;
                this.f288164d = rVar.f288158c;
            } else {
                this.f288161a = true;
                if (dVar.f287361f != null) {
                    this.f287387f = (com.google.gson.l[]) k.this.f287383g.a(dVar.f287359d, dVar.f287361f);
                }
            }
            List<String> listB = dVar.b("Link");
            if (listB != null) {
                HashMap<String, String> mapJ = d.j(listB);
                this.f287388g = mapJ.get("first");
                this.f287389h = mapJ.get(io.sentry.protocol.b0.b.f306151f);
                this.f287390i = mapJ.get(t1.b.f296120h);
            }
        }
    }

    public k(f fVar, String str, String str2, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar) {
        this.f287377a = fVar;
        this.f287378b = str;
        this.f287379c = str2;
        this.f287380d = b0VarArr;
        this.f287381e = b0VarArr2;
        this.f287382f = cVar;
    }

    public t g() throws io.ably.lib.types.a {
        return h(this.f287381e);
    }

    public t h(b0[] b0VarArr) throws io.ably.lib.types.a {
        return (t) this.f287377a.e(new a(b0VarArr, this)).b();
    }

    @Override // io.ably.lib.http.i.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public t a(i.d dVar, r rVar) throws io.ably.lib.types.a {
        return new c(this, dVar, rVar, null);
    }
}
