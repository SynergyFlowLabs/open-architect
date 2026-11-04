package io.ably.lib.http;

import io.ably.lib.types.b0;
import io.ably.lib.types.r;
import io.ktor.http.t1;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes13.dex */
public class a implements i.e<io.ably.lib.types.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f287254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f287255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f287256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b0[] f287257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0[] f287258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i.c f287259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i.b<com.google.gson.l> f287260g = k.f287376h;

    /* JADX INFO: renamed from: io.ably.lib.http.a$a, reason: collision with other inner class name */
    class C1928a implements f.b<io.ably.lib.types.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0[] f287261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i.e f287262b;

        C1928a(b0[] b0VarArr, i.e eVar) {
            this.f287261a = b0VarArr;
            this.f287262b = eVar;
        }

        @Override // io.ably.lib.http.f.b
        public void a(l lVar, io.ably.lib.types.i<io.ably.lib.types.e> iVar) throws io.ably.lib.types.a {
            lVar.e(a.this.f287256c, a.this.f287255b, a.this.f287257d, this.f287261a, a.this.f287259f, this.f287262b, true, iVar);
        }
    }

    class b implements io.ably.lib.types.i<io.ably.lib.types.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.ably.lib.types.e.a f287264a;

        b(io.ably.lib.types.e.a aVar) {
            this.f287264a = aVar;
        }

        @Override // io.ably.lib.types.i
        public void a(r rVar) {
            this.f287264a.a(rVar);
        }

        @Override // io.ably.lib.types.i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(io.ably.lib.types.e eVar) {
            this.f287264a.b(eVar);
        }
    }

    public class c extends io.ably.lib.types.e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.google.gson.l[] f287265f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f287266g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f287267h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f287268i;

        /* synthetic */ c(a aVar, i.d dVar, r rVar, C1928a c1928a) {
            this(dVar, rVar);
        }

        private void h(String str, io.ably.lib.types.e.a aVar) {
            String str2;
            if (str == null) {
                aVar.b(null);
                return;
            }
            Matcher matcher = d.f287275h.matcher(str);
            if (!matcher.matches()) {
                aVar.a(new r("Unexpected link URL format", 500, 50000));
                return;
            }
            String[] strArrSplit = matcher.group(2).split("&");
            b0[] b0VarArr = new b0[strArrSplit.length];
            for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                try {
                    String[] strArrSplit2 = strArrSplit[i10].split("=");
                    String str3 = strArrSplit2[0];
                    if (strArrSplit2.length >= 2) {
                        int i11 = 5 ^ 1;
                        str2 = strArrSplit2[1];
                    } else {
                        str2 = "";
                    }
                    b0VarArr[i10] = new b0(str3, URLDecoder.decode(str2, "UTF-8"));
                } catch (UnsupportedEncodingException unused) {
                }
            }
            a.this.h(b0VarArr, aVar);
        }

        @Override // io.ably.lib.types.e
        public void a(io.ably.lib.types.e.a aVar) {
            h(this.f287267h, aVar);
        }

        @Override // io.ably.lib.types.e
        public void b(io.ably.lib.types.e.a aVar) {
            h(this.f287266g, aVar);
        }

        @Override // io.ably.lib.types.e
        public boolean c() {
            return this.f287267h != null;
        }

        @Override // io.ably.lib.types.e
        public boolean d() {
            return this.f287266g != null;
        }

        @Override // io.ably.lib.types.e
        public boolean e() {
            return this.f287268i != null;
        }

        @Override // io.ably.lib.types.e
        public com.google.gson.l[] f() {
            return this.f287265f;
        }

        @Override // io.ably.lib.types.e
        public void g(io.ably.lib.types.e.a aVar) {
            h(this.f287268i, aVar);
        }

        private c(i.d dVar, r rVar) {
            this.f287950b = dVar.f287356a;
            this.f287953e = m.n(dVar.f287358c);
            if (rVar != null) {
                this.f287951c = rVar.f288156a;
                this.f287952d = rVar.f288158c;
            } else {
                this.f287949a = true;
                if (dVar.f287361f != null) {
                    try {
                        this.f287265f = (com.google.gson.l[]) a.this.f287260g.a(dVar.f287359d, dVar.f287361f);
                    } catch (io.ably.lib.types.a e10) {
                        this.f287949a = false;
                        r rVar2 = e10.f287918a;
                        this.f287951c = rVar2.f288156a;
                        this.f287952d = rVar2.f288158c;
                    }
                }
            }
            List<String> listB = dVar.b("Link");
            if (listB == null) {
                this.f287266g = null;
                this.f287267h = null;
                this.f287268i = null;
            } else {
                HashMap<String, String> mapJ = d.j(listB);
                this.f287266g = mapJ.get("first");
                this.f287267h = mapJ.get(io.sentry.protocol.b0.b.f306151f);
                this.f287268i = mapJ.get(t1.b.f296120h);
            }
        }
    }

    public a(f fVar, String str, String str2, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar) {
        this.f287254a = fVar;
        this.f287255b = str;
        this.f287256c = str2;
        this.f287257d = b0VarArr;
        this.f287258e = b0VarArr2;
        this.f287259f = cVar;
    }

    private static io.ably.lib.types.i<io.ably.lib.types.e> j(io.ably.lib.types.e.a aVar) {
        return new b(aVar);
    }

    public void g(io.ably.lib.types.e.a aVar) {
        h(this.f287258e, aVar);
    }

    public void h(b0[] b0VarArr, io.ably.lib.types.e.a aVar) {
        this.f287254a.e(new C1928a(b0VarArr, this)).a(j(aVar));
    }

    @Override // io.ably.lib.http.i.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public io.ably.lib.types.e a(i.d dVar, r rVar) {
        return new c(this, dVar, rVar, null);
    }
}
