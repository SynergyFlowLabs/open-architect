package androidx.media2.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.VideoSize;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class ConnectionResult extends CustomVersionedParcelable {
    long A;
    MediaController.PlaybackInfo B;
    int C;
    int D;
    ParcelImplListSlice E;
    SessionCommandGroup F;
    int G;
    int H;
    int I;
    Bundle J;
    VideoSize K;
    List<SessionPlayer.TrackInfo> L;
    SessionPlayer.TrackInfo M;
    SessionPlayer.TrackInfo N;
    SessionPlayer.TrackInfo O;
    SessionPlayer.TrackInfo P;
    MediaMetadata Q;
    int R;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f58485q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    c f58486r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    IBinder f58487s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    PendingIntent f58488t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f58489u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    MediaItem f58490v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    MediaItem f58491w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    long f58492x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    long f58493y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    float f58494z;

    ConnectionResult() {
    }

    public SessionPlayer.TrackInfo A() {
        return this.O;
    }

    public SessionPlayer.TrackInfo B() {
        return this.M;
    }

    public PendingIntent C() {
        return this.f58488t;
    }

    public c D() {
        return this.f58486r;
    }

    public int E() {
        return this.D;
    }

    public Bundle F() {
        return this.J;
    }

    @NonNull
    public List<SessionPlayer.TrackInfo> G() {
        List<SessionPlayer.TrackInfo> list = this.L;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public int H() {
        return this.f58485q;
    }

    public VideoSize J() {
        return this.K;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void d() {
        this.f58486r = c.b.i(this.f58487s);
        this.f58490v = this.f58491w;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void f(boolean z10) {
        synchronized (this.f58486r) {
            try {
                if (this.f58487s == null) {
                    this.f58487s = (IBinder) this.f58486r;
                    this.f58491w = a0.I(this.f58490v);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public SessionCommandGroup j() {
        return this.F;
    }

    public long k() {
        return this.A;
    }

    public int l() {
        return this.R;
    }

    public MediaItem m() {
        return this.f58490v;
    }

    public int n() {
        return this.G;
    }

    public int o() {
        return this.I;
    }

    public MediaController.PlaybackInfo p() {
        return this.B;
    }

    public float q() {
        return this.f58494z;
    }

    public int r() {
        return this.f58489u;
    }

    @p0
    public MediaMetadata s() {
        return this.Q;
    }

    public ParcelImplListSlice t() {
        return this.E;
    }

    public long u() {
        return this.f58492x;
    }

    public long v() {
        return this.f58493y;
    }

    public int w() {
        return this.H;
    }

    public int x() {
        return this.C;
    }

    public SessionPlayer.TrackInfo y() {
        return this.N;
    }

    public SessionPlayer.TrackInfo z() {
        return this.P;
    }

    ConnectionResult(@NonNull z zVar, @NonNull MediaSession.e eVar, @NonNull SessionCommandGroup sessionCommandGroup) {
        this.f58486r = zVar;
        this.f58489u = eVar.s0();
        this.f58490v = eVar.Z();
        this.f58492x = SystemClock.elapsedRealtime();
        this.f58493y = eVar.getCurrentPosition();
        this.f58494z = eVar.t0();
        this.A = eVar.v();
        this.B = eVar.b0();
        this.C = eVar.C();
        this.D = eVar.J();
        this.f58488t = eVar.M();
        this.G = eVar.l0();
        this.H = eVar.a0();
        this.I = eVar.e0();
        this.J = eVar.I0().getExtras();
        this.K = eVar.h0();
        this.L = eVar.G1();
        this.M = eVar.I1(1);
        this.N = eVar.I1(2);
        this.O = eVar.I1(4);
        this.P = eVar.I1(5);
        if (sessionCommandGroup.f(SessionCommand.E)) {
            this.E = a0.c(eVar.V0());
        } else {
            this.E = null;
        }
        if (sessionCommandGroup.f(SessionCommand.E) || sessionCommandGroup.f(SessionCommand.L)) {
            this.Q = eVar.V();
        } else {
            this.Q = null;
        }
        this.R = eVar.i1();
        this.F = sessionCommandGroup;
        this.f58485q = 0;
    }
}
