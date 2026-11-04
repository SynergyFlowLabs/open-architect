package t7;

import com.facebook.AuthenticationTokenClaims;
import com.google.api.client.util.n;
import com.google.api.client.util.v;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends com.google.api.client.json.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @v
    private String f376208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @v(AuthenticationTokenClaims.f98411m3)
    private String f376209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @v
    private String f376210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @v(AuthenticationTokenClaims.f98409k3)
    private String f376211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @v
    private String f376212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @v
    private String f376213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @v
    private String f376214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @v
    private String f376215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @v
    private String f376216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @v
    private String f376217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @v("verified_email")
    private Boolean f376218n;

    public boolean A() {
        Boolean bool = this.f376218n;
        if (bool == null || bool == n.f116097a) {
            return true;
        }
        return bool.booleanValue();
    }

    @Override // com.google.api.client.json.b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public c p(String str, Object obj) {
        return (c) super.p(str, obj);
    }

    public c C(String str) {
        this.f376208d = str;
        return this;
    }

    public c D(String str) {
        this.f376209e = str;
        return this;
    }

    public c E(String str) {
        this.f376210f = str;
        return this;
    }

    public c F(String str) {
        this.f376211g = str;
        return this;
    }

    public c G(String str) {
        this.f376212h = str;
        return this;
    }

    public c H(String str) {
        this.f376213i = str;
        return this;
    }

    public c I(String str) {
        this.f376214j = str;
        return this;
    }

    public c J(String str) {
        this.f376215k = str;
        return this;
    }

    public c K(String str) {
        this.f376216l = str;
        return this;
    }

    public c L(String str) {
        this.f376217m = str;
        return this;
    }

    public c M(Boolean bool) {
        this.f376218n = bool;
        return this;
    }

    @Override // com.google.api.client.json.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c clone() {
        return (c) super.clone();
    }

    public String n() {
        return this.f376208d;
    }

    public String o() {
        return this.f376209e;
    }

    public String p() {
        return this.f376210f;
    }

    public String q() {
        return this.f376211g;
    }

    public String s() {
        return this.f376212h;
    }

    public String t() {
        return this.f376213i;
    }

    public String u() {
        return this.f376214j;
    }

    public String v() {
        return this.f376215k;
    }

    public String w() {
        return this.f376216l;
    }

    public String x() {
        return this.f376217m;
    }

    public Boolean z() {
        return this.f376218n;
    }
}
