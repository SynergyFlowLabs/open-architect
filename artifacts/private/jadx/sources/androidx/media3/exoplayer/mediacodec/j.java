package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.os.HandlerThread;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import com.google.common.base.s0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class j implements q.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f64113g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f64114h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f64115i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f64116j = "DMCodecAdapterFactory";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final Context f64117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final s0<HandlerThread> f64118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final s0<HandlerThread> f64119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f64120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f64121f;

    @Deprecated
    public j() {
        this.f64120e = 0;
        this.f64121f = false;
        this.f64117b = null;
        this.f64118c = null;
        this.f64119d = null;
    }

    private boolean f() {
        int i10 = k1.f61540a;
        if (i10 >= 31) {
            return true;
        }
        Context context = this.f64117b;
        return context != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // androidx.media3.exoplayer.mediacodec.q.b
    public q a(q.a aVar) throws IOException {
        int i10;
        s0<HandlerThread> s0Var;
        if (k1.f61540a < 23 || !((i10 = this.f64120e) == 1 || (i10 == 0 && f()))) {
            return new h0.b().a(aVar);
        }
        int iM = androidx.media3.common.s0.m(aVar.f64129c.f61761o);
        androidx.media3.common.util.z.h(f64116j, "Creating an asynchronous MediaCodec adapter for track type " + k1.O0(iM));
        s0<HandlerThread> s0Var2 = this.f64118c;
        c.b bVar = (s0Var2 == null || (s0Var = this.f64119d) == null) ? new c.b(iM) : new c.b(s0Var2, s0Var);
        bVar.f(this.f64121f);
        return bVar.a(aVar);
    }

    @z7.a
    public j c(boolean z10) {
        this.f64121f = z10;
        return this;
    }

    @z7.a
    public j d() {
        this.f64120e = 2;
        return this;
    }

    @z7.a
    public j e() {
        this.f64120e = 1;
        return this;
    }

    public j(Context context) {
        this(context, null, null);
    }

    public j(Context context, @p0 s0<HandlerThread> s0Var, @p0 s0<HandlerThread> s0Var2) {
        this.f64117b = context;
        this.f64120e = 0;
        this.f64121f = false;
        this.f64118c = s0Var;
        this.f64119d = s0Var2;
    }
}
