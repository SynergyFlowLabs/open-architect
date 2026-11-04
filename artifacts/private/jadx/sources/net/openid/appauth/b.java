package net.openid.appauth;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f332823c = new C2339b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final net.openid.appauth.browser.d f332824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final ik.a f332825b;

    /* JADX INFO: renamed from: net.openid.appauth.b$b, reason: collision with other inner class name */
    public static class C2339b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private net.openid.appauth.browser.d f332826a = net.openid.appauth.browser.a.f332829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ik.a f332827b = ik.b.f287245a;

        @NonNull
        public b a() {
            return new b(this.f332826a, this.f332827b);
        }

        @NonNull
        public C2339b b(@NonNull net.openid.appauth.browser.d dVar) {
            t.g(dVar, "browserMatcher cannot be null");
            this.f332826a = dVar;
            return this;
        }

        @NonNull
        public C2339b c(@NonNull ik.a aVar) {
            t.g(aVar, "connectionBuilder cannot be null");
            this.f332827b = aVar;
            return this;
        }
    }

    @NonNull
    public net.openid.appauth.browser.d a() {
        return this.f332824a;
    }

    @NonNull
    public ik.a b() {
        return this.f332825b;
    }

    private b(@NonNull net.openid.appauth.browser.d dVar, @NonNull ik.a aVar) {
        this.f332824a = dVar;
        this.f332825b = aVar;
    }
}
