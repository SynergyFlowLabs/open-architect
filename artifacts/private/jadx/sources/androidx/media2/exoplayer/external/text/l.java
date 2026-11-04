package androidx.media2.exoplayer.external.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.d0;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.s;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class l extends androidx.media2.exoplayer.external.b implements Handler.Callback {
    private static final int H1 = 2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f56776p0 = 0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f56777p1 = 1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f56778p2 = 0;
    private j X;
    private j Y;
    private int Z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private final Handler f56779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k f56780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final h f56781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d0 f56782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f56783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f56784o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f56785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Format f56786t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private f f56787v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private i f56788w;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    private @interface a {
    }

    public l(k output, @p0 Looper outputLooper) {
        this(output, outputLooper, h.f56772a);
    }

    private void K() {
        Q(Collections.EMPTY_LIST);
    }

    private long L() {
        int i10 = this.Z;
        if (i10 == -1 || i10 >= this.X.k()) {
            return Long.MAX_VALUE;
        }
        return this.X.b(this.Z);
    }

    private void M(List<b> cues) {
        this.f56780k.i(cues);
    }

    private void N() {
        this.f56788w = null;
        this.Z = -1;
        j jVar = this.X;
        if (jVar != null) {
            jVar.x();
            this.X = null;
        }
        j jVar2 = this.Y;
        if (jVar2 != null) {
            jVar2.x();
            this.Y = null;
        }
    }

    private void O() {
        N();
        this.f56787v.release();
        this.f56787v = null;
        this.f56785s = 0;
    }

    private void P() {
        O();
        this.f56787v = this.f56781l.a(this.f56786t);
    }

    private void Q(List<b> cues) {
        Handler handler = this.f56779j;
        if (handler != null) {
            handler.obtainMessage(0, cues).sendToTarget();
        } else {
            M(cues);
        }
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void C(long positionUs, boolean joining) {
        K();
        this.f56783n = false;
        this.f56784o = false;
        if (this.f56785s != 0) {
            P();
        } else {
            N();
            this.f56787v.flush();
        }
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void G(Format[] formats, long offsetUs) throws androidx.media2.exoplayer.external.i {
        Format format = formats[0];
        this.f56786t = format;
        if (this.f56787v != null) {
            this.f56785s = 1;
        } else {
            this.f56787v = this.f56781l.a(format);
        }
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean a() {
        return this.f56784o;
    }

    @Override // androidx.media2.exoplayer.external.u0
    public int b(Format format) {
        if (this.f56781l.b(format)) {
            return androidx.media2.exoplayer.external.b.J(null, format.f53108l) ? 4 : 2;
        }
        return s.m(format.f53103i) ? 1 : 0;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public void g(long positionUs, long elapsedRealtimeUs) throws Exception {
        boolean z10;
        if (this.f56784o) {
            return;
        }
        if (this.Y == null) {
            this.f56787v.d(positionUs);
            try {
                this.Y = this.f56787v.a();
            } catch (g e10) {
                throw androidx.media2.exoplayer.external.i.c(e10, j());
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.X != null) {
            long jL = L();
            z10 = false;
            while (jL <= positionUs) {
                this.Z++;
                jL = L();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        j jVar = this.Y;
        if (jVar != null) {
            if (jVar.t()) {
                if (!z10 && L() == Long.MAX_VALUE) {
                    if (this.f56785s == 2) {
                        P();
                    } else {
                        N();
                        this.f56784o = true;
                    }
                }
            } else if (this.Y.f53793b <= positionUs) {
                j jVar2 = this.X;
                if (jVar2 != null) {
                    jVar2.x();
                }
                j jVar3 = this.Y;
                this.X = jVar3;
                this.Y = null;
                this.Z = jVar3.l(positionUs);
                z10 = true;
            }
        }
        if (z10) {
            Q(this.X.n(positionUs));
        }
        if (this.f56785s == 2) {
            return;
        }
        while (!this.f56783n) {
            try {
                if (this.f56788w == null) {
                    i iVarC = this.f56787v.c();
                    this.f56788w = iVarC;
                    if (iVarC == null) {
                        return;
                    }
                }
                if (this.f56785s == 1) {
                    this.f56788w.w(4);
                    this.f56787v.b(this.f56788w);
                    this.f56788w = null;
                    this.f56785s = 2;
                    return;
                }
                int iH = H(this.f56782m, this.f56788w, false);
                int i10 = 2 | (-4);
                if (iH == -4) {
                    if (this.f56788w.t()) {
                        this.f56783n = true;
                    } else {
                        i iVar = this.f56788w;
                        iVar.f56773j = this.f56782m.f53762c.f53109m;
                        iVar.D();
                    }
                    this.f56787v.b(this.f56788w);
                    this.f56788w = null;
                } else if (iH == -3) {
                    return;
                }
            } catch (g e11) {
                throw androidx.media2.exoplayer.external.i.c(e11, j());
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message msg) {
        if (msg.what != 0) {
            throw new IllegalStateException();
        }
        M((List) msg.obj);
        return true;
    }

    @Override // androidx.media2.exoplayer.external.t0
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media2.exoplayer.external.b
    protected void o() {
        this.f56786t = null;
        K();
        O();
    }

    public l(k output, @p0 Looper outputLooper, h decoderFactory) {
        super(3);
        this.f56780k = (k) androidx.media2.exoplayer.external.util.a.g(output);
        this.f56779j = outputLooper == null ? null : q0.w(outputLooper, this);
        this.f56781l = decoderFactory;
        this.f56782m = new d0();
    }
}
