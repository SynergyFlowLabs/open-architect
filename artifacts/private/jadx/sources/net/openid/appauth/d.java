package net.openid.appauth;

import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f332877k = 60000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f332878l = "config";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f332879m = "refreshToken";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f332880n = "scope";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f332881o = "lastAuthorizationResponse";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f332882p = "mLastTokenResponse";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f332883q = "mAuthorizationException";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f332884r = "lastRegistrationResponse";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private String f332885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private String f332886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private i f332887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private g f332888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private a0 f332889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private w f332890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private e f332891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f332892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<b> f332893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f332894j;

    class a implements h.d {
        a() {
        }

        @Override // net.openid.appauth.h.d
        public void a(@p0 a0 a0Var, @p0 e eVar) {
            String strN;
            e eVar2;
            String strG;
            List list;
            d.this.L(a0Var, eVar);
            if (eVar == null) {
                d.this.f332894j = false;
                strG = d.this.g();
                strN = d.this.n();
                eVar2 = null;
            } else {
                strN = null;
                eVar2 = eVar;
                strG = null;
            }
            synchronized (d.this.f332892h) {
                try {
                    list = d.this.f332893i;
                    d.this.f332893i = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(strG, strN, eVar2);
            }
        }
    }

    public interface b {
        void a(@p0 String str, @p0 String str2, @p0 e eVar);
    }

    public d() {
        this.f332892h = new Object();
    }

    public static d A(@NonNull JSONObject jSONObject) throws JSONException {
        t.g(jSONObject, "json cannot be null");
        d dVar = new d();
        dVar.f332885a = r.e(jSONObject, f332879m);
        dVar.f332886b = r.e(jSONObject, "scope");
        if (jSONObject.has(f332878l)) {
            dVar.f332887c = i.f(jSONObject.getJSONObject(f332878l));
        }
        if (jSONObject.has(f332883q)) {
            dVar.f332891g = e.j(jSONObject.getJSONObject(f332883q));
        }
        if (jSONObject.has(f332881o)) {
            dVar.f332888d = g.i(jSONObject.getJSONObject(f332881o));
        }
        if (jSONObject.has(f332882p)) {
            dVar.f332889e = a0.d(jSONObject.getJSONObject(f332882p));
        }
        if (jSONObject.has(f332884r)) {
            dVar.f332890f = w.g(jSONObject.getJSONObject(f332884r));
        }
        return dVar;
    }

    public static d z(@NonNull String str) throws JSONException {
        t.e(str, "jsonStr cannot be null or empty");
        return A(new JSONObject(str));
    }

    public JSONObject B() {
        JSONObject jSONObject = new JSONObject();
        r.s(jSONObject, f332879m, this.f332885a);
        r.s(jSONObject, "scope", this.f332886b);
        i iVar = this.f332887c;
        if (iVar != null) {
            r.p(jSONObject, f332878l, iVar.g());
        }
        e eVar = this.f332891g;
        if (eVar != null) {
            r.p(jSONObject, f332883q, eVar.q());
        }
        g gVar = this.f332888d;
        if (gVar != null) {
            r.p(jSONObject, f332881o, gVar.j());
        }
        a0 a0Var = this.f332889e;
        if (a0Var != null) {
            r.p(jSONObject, f332882p, a0Var.e());
        }
        w wVar = this.f332890f;
        if (wVar != null) {
            r.p(jSONObject, f332884r, wVar.h());
        }
        return jSONObject;
    }

    public String C() {
        return B().toString();
    }

    public void D(@NonNull h hVar, @NonNull Map<String, String> map, @NonNull b bVar) {
        b bVar2;
        try {
            bVar2 = bVar;
            try {
                G(hVar, k(), map, y.f333315a, bVar2);
            } catch (l.a e10) {
                e = e10;
                bVar2.a(null, null, e.m(e.d.f332946g, e));
            }
        } catch (l.a e11) {
            e = e11;
            bVar2 = bVar;
        }
    }

    public void E(@NonNull h hVar, @NonNull b bVar) {
        G(hVar, s.f333124b, Collections.EMPTY_MAP, y.f333315a, bVar);
    }

    public void F(@NonNull h hVar, @NonNull l lVar, @NonNull Map<String, String> map, @NonNull b bVar) {
        G(hVar, lVar, map, y.f333315a, bVar);
    }

    @l1
    void G(@NonNull h hVar, @NonNull l lVar, @NonNull Map<String, String> map, @NonNull o oVar, @NonNull b bVar) {
        t.g(hVar, "service cannot be null");
        t.g(lVar, "client authentication cannot be null");
        t.g(map, "additional params cannot be null");
        t.g(oVar, "clock cannot be null");
        t.g(bVar, "action cannot be null");
        if (!s(oVar)) {
            bVar.a(g(), n(), null);
            return;
        }
        if (this.f332885a == null) {
            bVar.a(null, null, e.m(e.a.f332922h, new IllegalStateException("No refresh token available and token have expired")));
            return;
        }
        t.g(this.f332892h, "pending actions sync object cannot be null");
        synchronized (this.f332892h) {
            try {
                List<b> list = this.f332893i;
                if (list != null) {
                    list.add(bVar);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                this.f332893i = arrayList;
                arrayList.add(bVar);
                hVar.n(f(map), lVar, new a());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void H(@NonNull h hVar, @NonNull l lVar, @NonNull b bVar) {
        G(hVar, lVar, Collections.EMPTY_MAP, y.f333315a, bVar);
    }

    public void I(boolean z10) {
        this.f332894j = z10;
    }

    public void J(@p0 g gVar, @p0 e eVar) {
        t.b((eVar != null) ^ (gVar != null), "exactly one of authResponse or authException should be non-null");
        if (eVar != null) {
            if (eVar.f332910a == 1) {
                this.f332891g = eVar;
            }
            return;
        }
        this.f332888d = gVar;
        this.f332887c = null;
        this.f332889e = null;
        this.f332885a = null;
        this.f332891g = null;
        String str = gVar.f333025h;
        if (str == null) {
            str = gVar.f333018a.f332968h;
        }
        this.f332886b = str;
    }

    public void K(@p0 w wVar) {
        this.f332890f = wVar;
        this.f332887c = j();
        this.f332885a = null;
        this.f332886b = null;
        this.f332888d = null;
        this.f332889e = null;
        this.f332891g = null;
    }

    public void L(@p0 a0 a0Var, @p0 e eVar) {
        t.b((eVar != null) ^ (a0Var != null), "exactly one of tokenResponse or authException should be non-null");
        e eVar2 = this.f332891g;
        if (eVar2 != null) {
            net.openid.appauth.internal.a.l("AuthState.update should not be called in an error state (%s), call updatewith the result of the fresh authorization response first", eVar2);
            this.f332891g = null;
        }
        if (eVar == null) {
            this.f332889e = a0Var;
            String str = a0Var.f332813g;
            if (str != null) {
                this.f332886b = str;
            }
            String str2 = a0Var.f332812f;
            if (str2 != null) {
                this.f332885a = str2;
            }
        } else if (eVar.f332910a == 2) {
            this.f332891g = eVar;
        }
    }

    @NonNull
    public z e() {
        return f(Collections.EMPTY_MAP);
    }

    @NonNull
    public z f(@NonNull Map<String, String> map) {
        if (this.f332885a == null) {
            throw new IllegalStateException("No refresh token available for refresh request");
        }
        g gVar = this.f332888d;
        if (gVar == null) {
            throw new IllegalStateException("No authorization configuration available for refresh request");
        }
        f fVar = gVar.f333018a;
        return new z.b(fVar.f332961a, fVar.f332962b).h(q.f333118c).k(this.f332888d.f333018a.f332968h).j(this.f332885a).c(map).a();
    }

    @p0
    public String g() {
        String str;
        if (this.f332891g != null) {
            return null;
        }
        a0 a0Var = this.f332889e;
        if (a0Var != null && (str = a0Var.f332809c) != null) {
            return str;
        }
        g gVar = this.f332888d;
        if (gVar != null) {
            return gVar.f333022e;
        }
        return null;
    }

    @p0
    public Long h() {
        if (this.f332891g != null) {
            return null;
        }
        a0 a0Var = this.f332889e;
        if (a0Var != null && a0Var.f332809c != null) {
            return a0Var.f332810d;
        }
        g gVar = this.f332888d;
        if (gVar == null || gVar.f333022e == null) {
            return null;
        }
        return gVar.f333023f;
    }

    @p0
    public e i() {
        return this.f332891g;
    }

    @p0
    public i j() {
        g gVar = this.f332888d;
        return gVar != null ? gVar.f333018a.f332961a : this.f332887c;
    }

    public l k() throws l.a {
        if (l() == null) {
            return s.f333124b;
        }
        String str = this.f332890f.f333300h;
        if (str == null) {
            return new m(l());
        }
        str.getClass();
        switch (str) {
            case "client_secret_post":
                return new n(l());
            case "none":
                return s.f333124b;
            case "client_secret_basic":
                return new m(l());
            default:
                throw new l.a(this.f332890f.f333300h);
        }
    }

    public String l() {
        w wVar = this.f332890f;
        if (wVar != null) {
            return wVar.f333296d;
        }
        return null;
    }

    @p0
    public Long m() {
        w wVar = this.f332890f;
        if (wVar != null) {
            return wVar.f333297e;
        }
        return null;
    }

    @p0
    public String n() {
        String str;
        if (this.f332891g != null) {
            return null;
        }
        a0 a0Var = this.f332889e;
        if (a0Var != null && (str = a0Var.f332811e) != null) {
            return str;
        }
        g gVar = this.f332888d;
        if (gVar != null) {
            return gVar.f333024g;
        }
        return null;
    }

    @p0
    public g o() {
        return this.f332888d;
    }

    @p0
    public w p() {
        return this.f332890f;
    }

    @p0
    public a0 q() {
        return this.f332889e;
    }

    public boolean r() {
        return s(y.f333315a);
    }

    @l1
    boolean s(o oVar) {
        if (this.f332894j) {
            return true;
        }
        if (h() == null) {
            return g() == null;
        }
        return h().longValue() <= oVar.a() + 60000;
    }

    @p0
    public String t() {
        return this.f332885a;
    }

    @p0
    public String u() {
        return this.f332886b;
    }

    @p0
    public Set<String> v() {
        return c.b(this.f332886b);
    }

    public boolean w() {
        return x(y.f333315a);
    }

    @l1
    boolean x(o oVar) {
        return (m() == null || m().longValue() == 0 || m().longValue() > oVar.a()) ? false : true;
    }

    public boolean y() {
        if (this.f332891g == null) {
            return (g() == null && n() == null) ? false : true;
        }
        return false;
    }

    public d(@NonNull i iVar) {
        this.f332892h = new Object();
        this.f332887c = iVar;
    }

    public d(@p0 g gVar, @p0 e eVar) {
        this.f332892h = new Object();
        t.b((eVar != null) ^ (gVar != null), "exactly one of authResponse or authError should be non-null");
        this.f332893i = null;
        J(gVar, eVar);
    }

    public d(@NonNull w wVar) {
        this.f332892h = new Object();
        K(wVar);
    }

    public d(@NonNull g gVar, @p0 a0 a0Var, @p0 e eVar) {
        this(gVar, null);
        L(a0Var, eVar);
    }
}
