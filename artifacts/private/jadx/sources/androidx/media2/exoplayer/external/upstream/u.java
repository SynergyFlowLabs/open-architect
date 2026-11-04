package androidx.media2.exoplayer.external.upstream;

import android.content.Context;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class u implements l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f57463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final q0 f57464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l.a f57465c;

    public u(Context context, String userAgent) {
        this(context, userAgent, (q0) null);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public t a() {
        t tVar = new t(this.f57463a, this.f57465c.a());
        q0 q0Var = this.f57464b;
        if (q0Var != null) {
            tVar.c(q0Var);
        }
        return tVar;
    }

    public u(Context context, String userAgent, @androidx.annotation.p0 q0 listener) {
        this(context, listener, new w(userAgent, listener));
    }

    public u(Context context, l.a baseDataSourceFactory) {
        this(context, (q0) null, baseDataSourceFactory);
    }

    public u(Context context, @androidx.annotation.p0 q0 listener, l.a baseDataSourceFactory) {
        this.f57463a = context.getApplicationContext();
        this.f57464b = listener;
        this.f57465c = baseDataSourceFactory;
    }
}
