package q7;

import com.facebook.AuthenticationTokenClaims;
import com.google.api.client.util.f0;
import com.google.api.client.util.h0;
import com.google.api.client.util.v;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f350271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2464b f350272b;

    public static class a extends com.google.api.client.json.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @v(com.google.android.gms.fido.u2f.api.common.a.f107438e)
        private String f350273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @v("cty")
        private String f350274e;

        @Override // com.google.api.client.json.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a clone() {
            return (a) super.clone();
        }

        public final String n() {
            return this.f350274e;
        }

        public final String o() {
            return this.f350273d;
        }

        @Override // com.google.api.client.json.b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a p(String str, Object obj) {
            return (a) super.p(str, obj);
        }

        public a q(String str) {
            this.f350274e = str;
            return this;
        }

        public a s(String str) {
            this.f350273d = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: q7.b$b, reason: collision with other inner class name */
    public static class C2464b extends com.google.api.client.json.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @v(AuthenticationTokenClaims.f98405g3)
        private Long f350275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @v("nbf")
        private Long f350276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @v(AuthenticationTokenClaims.f98406h3)
        private Long f350277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @v(AuthenticationTokenClaims.f98415p1)
        private String f350278g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @v(AuthenticationTokenClaims.H1)
        private Object f350279h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @v(AuthenticationTokenClaims.f98414p0)
        private String f350280i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @v(com.google.android.gms.fido.u2f.api.common.a.f107438e)
        private String f350281j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @v(AuthenticationTokenClaims.f98407i3)
        private String f350282k;

        public C2464b A(Long l10) {
            this.f350275d = l10;
            return this;
        }

        public C2464b B(Long l10) {
            this.f350277f = l10;
            return this;
        }

        public C2464b C(String str) {
            this.f350278g = str;
            return this;
        }

        public C2464b D(String str) {
            this.f350280i = str;
            return this;
        }

        public C2464b E(Long l10) {
            this.f350276e = l10;
            return this;
        }

        public C2464b F(String str) {
            this.f350282k = str;
            return this;
        }

        public C2464b G(String str) {
            this.f350281j = str;
            return this;
        }

        @Override // com.google.api.client.json.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C2464b clone() {
            return (C2464b) super.clone();
        }

        public final Object n() {
            return this.f350279h;
        }

        public final List<String> o() {
            Object obj = this.f350279h;
            if (obj == null) {
                return Collections.EMPTY_LIST;
            }
            return obj instanceof String ? Collections.singletonList((String) obj) : (List) obj;
        }

        public final Long p() {
            return this.f350275d;
        }

        public final Long q() {
            return this.f350277f;
        }

        public final String s() {
            return this.f350278g;
        }

        public final String t() {
            return this.f350280i;
        }

        public final Long u() {
            return this.f350276e;
        }

        public final String v() {
            return this.f350282k;
        }

        public final String w() {
            return this.f350281j;
        }

        @Override // com.google.api.client.json.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public C2464b p(String str, Object obj) {
            return (C2464b) super.p(str, obj);
        }

        public C2464b z(Object obj) {
            this.f350279h = obj;
            return this;
        }
    }

    public b(a aVar, C2464b c2464b) {
        this.f350271a = (a) h0.d(aVar);
        this.f350272b = (C2464b) h0.d(c2464b);
    }

    public a a() {
        return this.f350271a;
    }

    public C2464b b() {
        return this.f350272b;
    }

    public String toString() {
        return f0.b(this).a("header", this.f350271a).a("payload", this.f350272b).toString();
    }
}
