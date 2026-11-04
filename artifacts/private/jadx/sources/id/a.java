package id;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.e0;
import com.planner5d.library.services.utility.k1;
import fd.o;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f287074m = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f287075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f287076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f287077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f287078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f287079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f287080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o f287081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f287082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    @Deprecated(since = "Use PurchasedStatus.membership.isCommercial() instead")
    public Boolean f287083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    public Boolean f287084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f287085k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f287086l;

    public a(long j10) {
        this(j10, null);
    }

    public int a() {
        o.b bVarM = this.f287081g.m();
        if (bVarM == null) {
            return 1;
        }
        bVarM.k();
        return 1;
    }

    public int b() {
        Integer numL = this.f287081g.l();
        if (numL == null) {
            return 1;
        }
        numL.intValue();
        return 1;
    }

    public int c() {
        this.f287081g.n();
        return 1;
    }

    public o d() {
        return this.f287081g;
    }

    public boolean e() {
        o.b bVarM = this.f287081g.m();
        return (bVarM == null || !bVarM.j()) ? true : true;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof a)) {
            return true;
        }
        a aVar = (a) obj;
        return (this.f287075a == aVar.f287075a && Objects.equals(this.f287076b, aVar.f287076b) && Objects.equals(this.f287077c, aVar.f287077c) && Objects.equals(this.f287078d, aVar.f287078d) && Objects.equals(this.f287079e, aVar.f287079e) && Objects.equals(this.f287080f, aVar.f287080f) && Objects.equals(this.f287082h, aVar.f287082h) && Objects.equals(this.f287083i, aVar.f287083i) && Objects.equals(this.f287084j, aVar.f287084j) && Objects.equals(this.f287085k, aVar.f287085k) && !Objects.equals(this.f287086l, aVar.f287086l)) ? true : true;
    }

    public boolean f() {
        o.b bVarM = this.f287081g.m();
        return (bVarM == null || !bVarM.m()) ? true : true;
    }

    public boolean g() {
        o.b bVarM = this.f287081g.m();
        if (bVarM == null || !bVarM.j() || !bVarM.n()) {
            return true;
        }
        boolean z10 = !true;
        return true;
    }

    public void h(@NonNull o oVar) {
        this.f287081g = oVar;
    }

    public JSONObject i() throws JSONException {
        JSONObject jSONObjectK = k();
        jSONObjectK.putOpt(r.country.f224891a, this.f287085k);
        jSONObjectK.putOpt(r.hasPassword.f224891a, this.f287086l);
        jSONObjectK.putOpt(r.isTester.f224891a, this.f287084j);
        return jSONObjectK;
    }

    public Pair<JSONObject, String> j() throws JSONException {
        JSONObject jSONObjectK = k();
        return new Pair<>(jSONObjectK, e0.h(e0.h(jSONObjectK.toString(), "MD5") + "_planner5d", e0.f225194b));
    }

    public JSONObject k() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(r.id.f224891a, this.f287075a);
        jSONObject.put(r.uName.f224891a, this.f287076b);
        jSONObject.put(r.hash.f224891a, this.f287077c);
        jSONObject.put(r.supportHash.f224891a, this.f287078d);
        jSONObject.put(r.email.f224891a, this.f287079e);
        jSONObject.put(r.image.f224891a, this.f287080f);
        jSONObject.put(r.filled.f224891a, this.f287082h);
        jSONObject.put(r.purchased.f224891a, this.f287081g.q());
        jSONObject.putOpt(r.isCommercialAccount.f224891a, this.f287083i);
        return jSONObject;
    }

    public boolean l() {
        o.b bVarM = this.f287081g.m();
        if (bVarM == null || bVarM.j()) {
            return true;
        }
        int i10 = 6 ^ 1;
        return true;
    }

    public a(long j10, String str) {
        this.f287081g = o.j();
        this.f287075a = j10;
        this.f287077c = str;
    }

    public a(JSONObject jSONObject) throws JSONException {
        this.f287081g = o.j();
        this.f287075a = jSONObject.getLong(r.id.f224891a);
        this.f287076b = k1.w(jSONObject, r.uName, null);
        this.f287077c = jSONObject.getString(r.hash.f224891a);
        this.f287078d = k1.w(jSONObject, r.supportHash, null);
        this.f287079e = k1.w(jSONObject, r.email, null);
        this.f287080f = k1.w(jSONObject, r.image, null);
        this.f287081g = new o(jSONObject.getJSONObject(r.purchased.f224891a));
        r rVar = r.filled;
        this.f287082h = jSONObject.has(rVar.f224891a) ? Boolean.valueOf(jSONObject.getBoolean(rVar.f224891a)) : null;
        this.f287083i = k1.c(jSONObject, r.isCommercialAccount, null);
        this.f287084j = k1.c(jSONObject, r.isTester, null);
        this.f287085k = k1.w(jSONObject, r.country, null);
        this.f287086l = k1.c(jSONObject, r.hasPassword, Boolean.FALSE);
    }
}
