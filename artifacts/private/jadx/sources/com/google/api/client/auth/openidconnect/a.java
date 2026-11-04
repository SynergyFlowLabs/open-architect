package com.google.api.client.auth.openidconnect;

import com.google.api.client.util.f;
import com.google.api.client.util.v;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@f
public class a extends q7.a {

    /* JADX INFO: renamed from: com.google.api.client.auth.openidconnect.a$a, reason: collision with other inner class name */
    @f
    public static class C1011a extends q7.b.C2464b {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @v("auth_time")
        private Long f115255l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @v("azp")
        private String f115256m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @v
        private String f115257n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @v("at_hash")
        private String f115258o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @v("acr")
        private String f115259s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @v("amr")
        private List<String> f115260t;

        @Override // q7.b.C2464b
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C1011a clone() {
            return (C1011a) super.clone();
        }

        public final String I() {
            return this.f115258o;
        }

        public final Long J() {
            return this.f115255l;
        }

        public final String K() {
            return this.f115256m;
        }

        public final String L() {
            return this.f115259s;
        }

        public final List<String> M() {
            return this.f115260t;
        }

        public final String O() {
            return this.f115257n;
        }

        @Override // q7.b.C2464b
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public C1011a p(String str, Object obj) {
            return (C1011a) super.p(str, obj);
        }

        public C1011a Q(String str) {
            this.f115258o = str;
            return this;
        }

        @Override // q7.b.C2464b
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public C1011a z(Object obj) {
            return (C1011a) super.z(obj);
        }

        public C1011a U(Long l10) {
            this.f115255l = l10;
            return this;
        }

        public C1011a V(String str) {
            this.f115256m = str;
            return this;
        }

        public C1011a W(String str) {
            this.f115259s = str;
            return this;
        }

        @Override // q7.b.C2464b
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public C1011a A(Long l10) {
            return (C1011a) super.A(l10);
        }

        @Override // q7.b.C2464b
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public C1011a B(Long l10) {
            return (C1011a) super.B(l10);
        }

        @Override // q7.b.C2464b
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public C1011a C(String str) {
            return (C1011a) super.C(str);
        }

        @Override // q7.b.C2464b
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public C1011a D(String str) {
            return (C1011a) super.D(str);
        }

        public C1011a c0(List<String> list) {
            this.f115260t = list;
            return this;
        }

        public C1011a d0(String str) {
            this.f115257n = str;
            return this;
        }

        @Override // q7.b.C2464b
        /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
        public C1011a E(Long l10) {
            return (C1011a) super.E(l10);
        }

        @Override // q7.b.C2464b
        /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
        public C1011a F(String str) {
            return (C1011a) super.F(str);
        }

        @Override // q7.b.C2464b
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public C1011a G(String str) {
            return (C1011a) super.G(str);
        }
    }

    public a(q7.a.C2463a c2463a, C1011a c1011a, byte[] bArr, byte[] bArr2) {
        super(c2463a, c1011a, bArr, bArr2);
    }

    public static a n(com.google.api.client.json.d dVar, String str) throws IOException {
        q7.a aVarD = q7.a.h(dVar).f(C1011a.class).d(str);
        return new a(aVarD.a(), (C1011a) aVarD.b(), aVarD.e(), aVarD.f());
    }

    @Override // q7.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C1011a b() {
        return (C1011a) super.b();
    }

    public final boolean o(Collection<String> collection) {
        List<String> listO = b().o();
        if (listO.isEmpty()) {
            return false;
        }
        return collection.containsAll(listO);
    }

    public final boolean p(long j10, long j11) {
        if (j10 > (b().p().longValue() + j11) * 1000) {
            return false;
        }
        boolean z10 = false | true;
        return true;
    }

    public final boolean q(long j10, long j11) {
        return j10 >= (b().q().longValue() - j11) * 1000;
    }

    public final boolean r(String str) {
        return s(Collections.singleton(str));
    }

    public final boolean s(Collection<String> collection) {
        return collection.contains(b().s());
    }

    public final boolean t(long j10, long j11) {
        if (!p(j10, j11) || !q(j10, j11)) {
            return false;
        }
        int i10 = 6 >> 1;
        return true;
    }
}
