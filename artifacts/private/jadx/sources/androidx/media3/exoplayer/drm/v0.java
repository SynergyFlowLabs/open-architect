package androidx.media3.exoplayer.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.b1;
import androidx.media3.exoplayer.analytics.j4;
import com.google.common.util.concurrent.m2;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class v0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final androidx.media3.common.w f63744f = new androidx.media3.common.w.b().Y(new DrmInitData(new DrmInitData.SchemeData[0])).N();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConditionVariable f63745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f63746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HandlerThread f63747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f63748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t.a f63749e;

    class a implements t {
        a() {
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void L(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
            v0.this.f63745a.open();
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void o0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
            v0.this.f63745a.open();
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void p0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar, Exception exc) {
            v0.this.f63745a.open();
        }

        @Override // androidx.media3.exoplayer.drm.t
        public void t0(int i10, @androidx.annotation.p0 androidx.media3.exoplayer.source.t0.b bVar) {
            v0.this.f63745a.open();
        }
    }

    public v0(h hVar, t.a aVar) {
        this.f63746b = hVar;
        this.f63749e = aVar;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.f63747c = handlerThread;
        handlerThread.start();
        this.f63748d = new Handler(handlerThread.getLooper());
        this.f63745a = new ConditionVariable();
        aVar.g(new Handler(handlerThread.getLooper()), new a());
    }

    public static /* synthetic */ void a(v0 v0Var, m mVar, m2 m2Var) {
        v0Var.getClass();
        try {
            m.a aVarT = mVar.T();
            if (mVar.getState() == 1) {
                mVar.d(v0Var.f63749e);
                v0Var.f63746b.release();
            }
            m2Var.B(aVarT);
        } catch (Throwable th2) {
            m2Var.C(th2);
            mVar.d(v0Var.f63749e);
            v0Var.f63746b.release();
        }
    }

    public static /* synthetic */ void b(v0 v0Var, m2 m2Var) {
        v0Var.getClass();
        try {
            v0Var.f63746b.release();
            m2Var.B(null);
        } catch (Throwable th2) {
            m2Var.C(th2);
        }
    }

    public static /* synthetic */ void c(v0 v0Var, m2 m2Var, m mVar) {
        v0Var.getClass();
        try {
            m2Var.B(mVar.V());
        } catch (Throwable th2) {
            try {
                m2Var.C(th2);
            } finally {
                mVar.d(v0Var.f63749e);
            }
        }
    }

    public static /* synthetic */ void d(v0 v0Var, int i10, byte[] bArr, m2 m2Var, androidx.media3.common.w wVar) {
        v0Var.getClass();
        try {
            v0Var.f63746b.b((Looper) androidx.media3.common.util.a.g(Looper.myLooper()), j4.f63008d);
            v0Var.f63746b.A();
            try {
                v0Var.f63746b.F(i10, bArr);
                m2Var.B((m) androidx.media3.common.util.a.g(v0Var.f63746b.c(v0Var.f63749e, wVar)));
            } catch (Throwable th2) {
                v0Var.f63746b.release();
                throw th2;
            }
        } catch (Throwable th3) {
            m2Var.C(th3);
        }
    }

    public static /* synthetic */ void e(v0 v0Var, m2 m2Var, m mVar) {
        v0Var.getClass();
        try {
            m2Var.B((Pair) androidx.media3.common.util.a.g(x0.b(mVar)));
        } catch (Throwable th2) {
            try {
                m2Var.C(th2);
            } catch (Throwable th3) {
                mVar.d(v0Var.f63749e);
                throw th3;
            }
        }
        mVar.d(v0Var.f63749e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m g(final int i10, @androidx.annotation.p0 final byte[] bArr, final androidx.media3.common.w wVar) throws m.a {
        androidx.media3.common.util.a.g(wVar.f61765s);
        final m2 m2VarF = m2.F();
        this.f63745a.close();
        this.f63748d.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.r0
            @Override // java.lang.Runnable
            public final void run() {
                v0.d(this.f63722a, i10, bArr, m2VarF, wVar);
            }
        });
        try {
            final m mVar = (m) m2VarF.get();
            this.f63745a.block();
            final m2 m2VarF2 = m2.F();
            this.f63748d.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.s0
                @Override // java.lang.Runnable
                public final void run() {
                    v0.a(this.f63729a, mVar, m2VarF2);
                }
            });
            try {
                if (m2VarF2.get() == 0) {
                    return mVar;
                }
                throw ((m.a) m2VarF2.get());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (InterruptedException | ExecutionException e11) {
            throw new IllegalStateException(e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private byte[] h(int i10, @androidx.annotation.p0 byte[] bArr, androidx.media3.common.w wVar) throws m.a {
        final m mVarG = g(i10, bArr, wVar);
        final m2 m2VarF = m2.F();
        this.f63748d.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.u0
            @Override // java.lang.Runnable
            public final void run() {
                v0.c(this.f63741a, m2VarF, mVarG);
            }
        });
        try {
            try {
                byte[] bArr2 = (byte[]) androidx.media3.common.util.a.g((byte[]) m2VarF.get());
                p();
                return bArr2;
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (Throwable th2) {
            p();
            throw th2;
        }
    }

    public static v0 k(String str, androidx.media3.datasource.p.a aVar, t.a aVar2) {
        return l(str, false, aVar, aVar2);
    }

    public static v0 l(String str, boolean z10, androidx.media3.datasource.p.a aVar, t.a aVar2) {
        return m(str, z10, aVar, null, aVar2);
    }

    public static v0 m(String str, boolean z10, androidx.media3.datasource.p.a aVar, @androidx.annotation.p0 Map<String, String> map, t.a aVar2) {
        return new v0(new h.b().b(map).a(new l0(str, z10, aVar)), aVar2);
    }

    private void p() {
        final m2 m2VarF = m2.F();
        this.f63748d.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.t0
            @Override // java.lang.Runnable
            public final void run() {
                v0.b(this.f63737a, m2VarF);
            }
        });
        try {
            m2VarF.get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public synchronized byte[] i(androidx.media3.common.w wVar) throws m.a {
        try {
            androidx.media3.common.util.a.a(wVar.f61765s != null);
        } catch (Throwable th2) {
            throw th2;
        }
        return h(2, null, wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Pair<Long, Long> j(byte[] bArr) throws m.a {
        Pair<Long, Long> pair;
        try {
            androidx.media3.common.util.a.g(bArr);
            try {
                final m mVarG = g(1, bArr, f63744f);
                final m2 m2VarF = m2.F();
                this.f63748d.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        v0.e(this.f63717a, m2VarF, mVarG);
                    }
                });
                try {
                    try {
                        pair = (Pair) m2VarF.get();
                        p();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new IllegalStateException(e10);
                    }
                } catch (Throwable th2) {
                    p();
                    throw th2;
                }
            } catch (m.a e11) {
                if (e11.getCause() instanceof m0) {
                    return Pair.create(0L, 0L);
                }
                throw e11;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return pair;
    }

    public void n() {
        this.f63747c.quit();
    }

    public synchronized void o(byte[] bArr) throws m.a {
        androidx.media3.common.util.a.g(bArr);
        h(3, bArr, f63744f);
    }

    public synchronized byte[] q(byte[] bArr) throws m.a {
        try {
            androidx.media3.common.util.a.g(bArr);
        } catch (Throwable th2) {
            throw th2;
        }
        return h(2, bArr, f63744f);
    }
}
