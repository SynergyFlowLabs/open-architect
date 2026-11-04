package com.google.api.client.googleapis.services.json;

import com.google.api.client.http.b0;
import com.google.api.client.http.w;
import com.google.api.client.json.d;
import com.google.api.client.json.f;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends com.google.api.client.googleapis.services.a {

    /* JADX INFO: renamed from: com.google.api.client.googleapis.services.json.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1019a extends com.google.api.client.googleapis.services.a.AbstractC1018a {
        protected AbstractC1019a(b0 b0Var, d dVar, String str, String str2, w wVar, boolean z10) {
            super(b0Var, str, str2, new f.a(dVar).d(z10 ? Arrays.asList("data", "error") : Collections.EMPTY_SET).a(), wVar);
        }

        @Override // com.google.api.client.googleapis.services.a.AbstractC1018a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public AbstractC1019a p(String str) {
            return (AbstractC1019a) super.p(str);
        }

        @Override // com.google.api.client.googleapis.services.a.AbstractC1018a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public AbstractC1019a q(boolean z10) {
            return (AbstractC1019a) super.q(z10);
        }

        @Override // com.google.api.client.googleapis.services.a.AbstractC1018a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public AbstractC1019a r(boolean z10) {
            return (AbstractC1019a) super.r(z10);
        }

        @Override // com.google.api.client.googleapis.services.a.AbstractC1018a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public AbstractC1019a s(boolean z10) {
            return (AbstractC1019a) super.s(z10);
        }

        @Override // com.google.api.client.googleapis.services.a.AbstractC1018a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public abstract a a();

        public final d u() {
            return e().e();
        }

        @Override // com.google.api.client.googleapis.services.a.AbstractC1018a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final f e() {
            return (f) super.e();
        }

        @Override // com.google.api.client.googleapis.services.a.AbstractC1018a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public AbstractC1019a k(String str) {
            return (AbstractC1019a) super.k(str);
        }

        @Override // com.google.api.client.googleapis.services.a.AbstractC1018a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public AbstractC1019a m(com.google.api.client.googleapis.services.d dVar) {
            return (AbstractC1019a) super.m(dVar);
        }

        @Override // com.google.api.client.googleapis.services.a.AbstractC1018a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public AbstractC1019a n(w wVar) {
            return (AbstractC1019a) super.n(wVar);
        }

        @Override // com.google.api.client.googleapis.services.a.AbstractC1018a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public AbstractC1019a o(String str) {
            return (AbstractC1019a) super.o(str);
        }
    }

    protected a(AbstractC1019a abstractC1019a) {
        super(abstractC1019a);
    }

    public final d o() {
        return f().e();
    }

    @Override // com.google.api.client.googleapis.services.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public f f() {
        return (f) super.f();
    }
}
