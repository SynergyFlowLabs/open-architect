package com.google.api.client.auth.oauth2;

import com.google.api.client.http.b0;
import com.google.api.client.http.c0;
import com.google.api.client.http.w;
import com.google.api.client.http.x;
import com.google.api.client.util.f0;
import com.google.api.client.util.h0;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class j implements com.google.api.client.http.p, w, c0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final Logger f115201m = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f115202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f115203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.api.client.util.l f115204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f115205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f115206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f115207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b0 f115208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.api.client.http.p f115209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.api.client.json.d f115210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f115211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Collection<k> f115212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w f115213l;

    public interface a {
        void a(com.google.api.client.http.u uVar, String str) throws IOException;

        String b(com.google.api.client.http.u uVar);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f115214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b0 f115215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        com.google.api.client.json.d f115216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        com.google.api.client.http.j f115217d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        com.google.api.client.http.p f115219f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        w f115220g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        com.google.api.client.util.l f115218e = com.google.api.client.util.l.f116096a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Collection<k> f115221h = com.google.api.client.util.w.a();

        public b(a aVar) {
            this.f115214a = (a) h0.d(aVar);
        }

        public b a(k kVar) {
            this.f115221h.add((k) h0.d(kVar));
            return this;
        }

        public j b() {
            return new j(this);
        }

        public final com.google.api.client.http.p c() {
            return this.f115219f;
        }

        public final com.google.api.client.util.l d() {
            return this.f115218e;
        }

        public final com.google.api.client.json.d e() {
            return this.f115216c;
        }

        public final a f() {
            return this.f115214a;
        }

        public final Collection<k> g() {
            return this.f115221h;
        }

        public final w h() {
            return this.f115220g;
        }

        public final com.google.api.client.http.j i() {
            return this.f115217d;
        }

        public final b0 j() {
            return this.f115215b;
        }

        public b k(com.google.api.client.http.p pVar) {
            this.f115219f = pVar;
            return this;
        }

        public b l(com.google.api.client.util.l lVar) {
            this.f115218e = (com.google.api.client.util.l) h0.d(lVar);
            return this;
        }

        public b m(com.google.api.client.json.d dVar) {
            this.f115216c = dVar;
            return this;
        }

        public b n(Collection<k> collection) {
            this.f115221h = (Collection) h0.d(collection);
            return this;
        }

        public b o(w wVar) {
            this.f115220g = wVar;
            return this;
        }

        public b p(String str) {
            this.f115217d = str == null ? null : new com.google.api.client.http.j(str);
            return this;
        }

        public b q(com.google.api.client.http.j jVar) {
            this.f115217d = jVar;
            return this;
        }

        public b r(b0 b0Var) {
            this.f115215b = b0Var;
            return this;
        }
    }

    public j(a aVar) {
        this(new b(aVar));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[Catch: all -> 0x001f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:3:0x0008, B:7:0x0014, B:16:0x0031, B:12:0x0022), top: B:20:0x0008 }] */
    @Override // com.google.api.client.http.p
    public void a(com.google.api.client.http.u uVar) throws IOException {
        this.f115202a.lock();
        try {
            Long lI = i();
            if (this.f115205d == null || (lI != null && lI.longValue() <= 60)) {
                q();
                if (this.f115205d != null) {
                    this.f115203b.a(uVar, this.f115205d);
                }
            } else {
                this.f115203b.a(uVar, this.f115205d);
            }
            Lock lock = this.f115202a;
        } finally {
            this.f115202a.unlock();
        }
    }

    @Override // com.google.api.client.http.w
    public void b(com.google.api.client.http.u uVar) throws IOException {
        uVar.L(this);
        uVar.X(this);
    }

    @Override // com.google.api.client.http.c0
    public boolean c(com.google.api.client.http.u uVar, x xVar, boolean z10) {
        boolean zFind;
        boolean z11;
        List<String> listQ = xVar.h().q();
        boolean z12 = true;
        if (listQ == null) {
            zFind = false;
            z11 = false;
            break;
        }
        Iterator<String> it = listQ.iterator();
        while (true) {
            if (!it.hasNext()) {
                zFind = false;
                z11 = false;
                break;
            }
            String next = it.next();
            if (next.startsWith("Bearer ")) {
                zFind = f.f115197b.matcher(next).find();
                z11 = true;
                break;
            }
        }
        if (!z11) {
            zFind = xVar.k() == 401;
        }
        if (zFind) {
            try {
                this.f115202a.lock();
                try {
                    if (f0.a(this.f115205d, this.f115203b.b(uVar)) && !q()) {
                        z12 = false;
                    }
                    this.f115202a.unlock();
                    return z12;
                } catch (Throwable th2) {
                    this.f115202a.unlock();
                    throw th2;
                }
            } catch (IOException e10) {
                f115201m.log(Level.SEVERE, "unable to refresh token", (Throwable) e10);
            }
        }
        return false;
    }

    protected t d() throws IOException {
        if (this.f115207f == null) {
            return null;
        }
        return new p(this.f115208g, this.f115210i, new com.google.api.client.http.j(this.f115211j), this.f115207f).s(this.f115209h).u(this.f115213l).g();
    }

    public final String e() {
        this.f115202a.lock();
        try {
            String str = this.f115205d;
            Lock lock = this.f115202a;
            return str;
        } finally {
            this.f115202a.unlock();
        }
    }

    public final com.google.api.client.http.p f() {
        return this.f115209h;
    }

    public final com.google.api.client.util.l g() {
        return this.f115204c;
    }

    public final Long h() {
        this.f115202a.lock();
        try {
            return this.f115206e;
        } finally {
            this.f115202a.unlock();
        }
    }

    public final Long i() {
        this.f115202a.lock();
        try {
            Long l10 = this.f115206e;
            if (l10 == null) {
                this.f115202a.unlock();
                return null;
            }
            Long lValueOf = Long.valueOf((l10.longValue() - this.f115204c.currentTimeMillis()) / 1000);
            this.f115202a.unlock();
            return lValueOf;
        } catch (Throwable th2) {
            this.f115202a.unlock();
            throw th2;
        }
    }

    public final com.google.api.client.json.d j() {
        return this.f115210i;
    }

    public final a k() {
        return this.f115203b;
    }

    public final Collection<k> l() {
        return this.f115212k;
    }

    public final String m() {
        this.f115202a.lock();
        try {
            return this.f115207f;
        } finally {
            this.f115202a.unlock();
        }
    }

    public final w n() {
        return this.f115213l;
    }

    public final String o() {
        return this.f115211j;
    }

    public final b0 p() {
        return this.f115208g;
    }

    public final boolean q() throws IOException {
        this.f115202a.lock();
        boolean z10 = true;
        try {
            try {
                t tVarD = d();
                if (tVarD != null) {
                    u(tVarD);
                    Iterator<k> it = this.f115212k.iterator();
                    while (it.hasNext()) {
                        it.next().b(this, tVarD);
                    }
                    this.f115202a.unlock();
                    return true;
                }
            } catch (u e10) {
                if (400 > e10.d() || e10.d() >= 500) {
                    z10 = false;
                }
                if (e10.h() != null && z10) {
                    r(null);
                    t(null);
                }
                Iterator<k> it2 = this.f115212k.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, e10.h());
                }
                if (z10) {
                    throw e10;
                }
            }
            this.f115202a.unlock();
            return false;
        } catch (Throwable th2) {
            this.f115202a.unlock();
            throw th2;
        }
    }

    public j r(String str) {
        this.f115202a.lock();
        try {
            this.f115205d = str;
            this.f115202a.unlock();
            return this;
        } catch (Throwable th2) {
            this.f115202a.unlock();
            throw th2;
        }
    }

    public j s(Long l10) {
        this.f115202a.lock();
        try {
            this.f115206e = l10;
            Lock lock = this.f115202a;
            return this;
        } finally {
            this.f115202a.unlock();
        }
    }

    public j t(Long l10) {
        return s(l10 == null ? null : Long.valueOf(this.f115204c.currentTimeMillis() + (l10.longValue() * 1000)));
    }

    public j u(t tVar) {
        r(tVar.n());
        if (tVar.p() != null) {
            v(tVar.p());
        }
        t(tVar.o());
        return this;
    }

    public j v(String str) {
        this.f115202a.lock();
        if (str != null) {
            try {
                h0.b((this.f115210i == null || this.f115208g == null || this.f115209h == null || this.f115211j == null) ? false : true, "Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl");
            } finally {
                this.f115202a.unlock();
            }
        }
        this.f115207f = str;
        return this;
    }

    protected j(b bVar) {
        this.f115202a = new ReentrantLock();
        this.f115203b = (a) h0.d(bVar.f115214a);
        this.f115208g = bVar.f115215b;
        this.f115210i = bVar.f115216c;
        com.google.api.client.http.j jVar = bVar.f115217d;
        this.f115211j = jVar == null ? null : jVar.k();
        this.f115209h = bVar.f115219f;
        this.f115213l = bVar.f115220g;
        this.f115212k = Collections.unmodifiableCollection(bVar.f115221h);
        this.f115204c = (com.google.api.client.util.l) h0.d(bVar.f115218e);
    }
}
