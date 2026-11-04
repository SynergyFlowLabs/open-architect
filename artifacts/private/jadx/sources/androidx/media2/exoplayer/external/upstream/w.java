package androidx.media2.exoplayer.external.upstream;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class w extends e0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f57487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final q0 f57488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f57489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f57490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f57491f;

    public w(String userAgent) {
        this(userAgent, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media2.exoplayer.external.upstream.e0.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public v f(e0.f defaultRequestProperties) {
        v vVar = new v(this.f57487b, this.f57489d, this.f57490e, this.f57491f, defaultRequestProperties);
        q0 q0Var = this.f57488c;
        if (q0Var != null) {
            vVar.c(q0Var);
        }
        return vVar;
    }

    public w(String userAgent, @androidx.annotation.p0 q0 listener) {
        this(userAgent, listener, 8000, 8000, false);
    }

    public w(String userAgent, int connectTimeoutMillis, int readTimeoutMillis, boolean allowCrossProtocolRedirects) {
        this(userAgent, null, connectTimeoutMillis, readTimeoutMillis, allowCrossProtocolRedirects);
    }

    public w(String userAgent, @androidx.annotation.p0 q0 listener, int connectTimeoutMillis, int readTimeoutMillis, boolean allowCrossProtocolRedirects) {
        this.f57487b = androidx.media2.exoplayer.external.util.a.e(userAgent);
        this.f57488c = listener;
        this.f57489d = connectTimeoutMillis;
        this.f57490e = readTimeoutMillis;
        this.f57491f = allowCrossProtocolRedirects;
    }
}
