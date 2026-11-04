package t7;

import com.facebook.AccessToken;
import com.google.api.client.util.v;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends com.google.api.client.json.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @v("access_type")
    private String f376199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @v
    private String f376200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @v
    private String f376201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @v(AccessToken.f98369n)
    private Integer f376202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @v("issued_to")
    private String f376203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @v
    private String f376204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @v("token_handle")
    private String f376205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @v("user_id")
    private String f376206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @v("verified_email")
    private Boolean f376207l;

    public b A(String str) {
        this.f376200e = str;
        return this;
    }

    public b B(String str) {
        this.f376201f = str;
        return this;
    }

    public b C(Integer num) {
        this.f376202g = num;
        return this;
    }

    public b D(String str) {
        this.f376203h = str;
        return this;
    }

    public b E(String str) {
        this.f376204i = str;
        return this;
    }

    public b F(String str) {
        this.f376205j = str;
        return this;
    }

    public b G(String str) {
        this.f376206k = str;
        return this;
    }

    public b H(Boolean bool) {
        this.f376207l = bool;
        return this;
    }

    @Override // com.google.api.client.json.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return (b) super.clone();
    }

    public String n() {
        return this.f376199d;
    }

    public String o() {
        return this.f376200e;
    }

    public String p() {
        return this.f376201f;
    }

    public Integer q() {
        return this.f376202g;
    }

    public String s() {
        return this.f376203h;
    }

    public String t() {
        return this.f376204i;
    }

    public String u() {
        return this.f376205j;
    }

    public String v() {
        return this.f376206k;
    }

    public Boolean w() {
        return this.f376207l;
    }

    @Override // com.google.api.client.json.b
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public b e(String str, Object obj) {
        return (b) super.e(str, obj);
    }

    public b z(String str) {
        this.f376199d = str;
        return this;
    }
}
