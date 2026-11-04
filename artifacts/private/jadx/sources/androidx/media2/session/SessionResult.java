package androidx.media2.session;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.common.MediaItem;
import androidx.media2.common.SessionPlayer;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.common.util.concurrent.t1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class SessionResult extends CustomVersionedParcelable implements c0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f58679v = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f58680q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    long f58681r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Bundle f58682s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    MediaItem f58683t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    MediaItem f58684u;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface a {
    }

    public SessionResult(int i10, @p0 Bundle bundle) {
        this(i10, bundle, null, SystemClock.elapsedRealtime());
    }

    static t1<SessionResult> j(int i10) {
        androidx.concurrent.futures.e eVarN = androidx.concurrent.futures.e.N();
        eVarN.E(new SessionResult(i10));
        return eVarN;
    }

    @p0
    static SessionResult k(@p0 SessionPlayer.c cVar) {
        if (cVar == null) {
            return null;
        }
        return new SessionResult(cVar.i(), null, cVar.g(), cVar.h());
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    @b1({b1.a.LIBRARY})
    public void d() {
        this.f58683t = this.f58684u;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    @b1({b1.a.LIBRARY})
    public void f(boolean z10) {
        MediaItem mediaItem = this.f58683t;
        if (mediaItem != null) {
            synchronized (mediaItem) {
                try {
                    if (this.f58684u == null) {
                        this.f58684u = a0.I(this.f58683t);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.media2.common.a
    @p0
    public MediaItem g() {
        return this.f58683t;
    }

    @Override // androidx.media2.common.a
    public long h() {
        return this.f58681r;
    }

    @Override // androidx.media2.common.a
    public int i() {
        return this.f58680q;
    }

    @p0
    public Bundle l() {
        return this.f58682s;
    }

    SessionResult() {
    }

    SessionResult(int i10) {
        this(i10, null);
    }

    SessionResult(int i10, Bundle bundle, MediaItem mediaItem) {
        this(i10, bundle, mediaItem, SystemClock.elapsedRealtime());
    }

    SessionResult(int i10, @p0 Bundle bundle, @p0 MediaItem mediaItem, long j10) {
        this.f58680q = i10;
        this.f58682s = bundle;
        this.f58683t = mediaItem;
        this.f58681r = j10;
    }
}
