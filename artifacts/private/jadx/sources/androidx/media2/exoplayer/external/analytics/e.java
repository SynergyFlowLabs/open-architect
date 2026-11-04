package androidx.media2.exoplayer.external.analytics;

import android.util.Base64;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.source.z;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.z0;
import il.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Random f53147h = new Random();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f53148i = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f.a f53152d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private z.a f53154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private String f53155g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0.c f53149a = new z0.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0.b f53150b = new z0.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f53151c = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private z0 f53153e = z0.f57952a;

    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f53156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f53157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f53158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private z.a f53159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f53160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f53161f;

        public a(String sessionId, @p0 int windowIndex, z.a mediaPeriodId) {
            this.f53156a = sessionId;
            this.f53157b = windowIndex;
            this.f53158c = mediaPeriodId == null ? -1L : mediaPeriodId.f56510d;
            if (mediaPeriodId == null || !mediaPeriodId.b()) {
                return;
            }
            this.f53159d = mediaPeriodId;
        }

        private int k(z0 oldTimeline, z0 newTimeline, int windowIndex) {
            if (windowIndex >= oldTimeline.r()) {
                if (windowIndex < newTimeline.r()) {
                    return windowIndex;
                }
                return -1;
            }
            oldTimeline.n(windowIndex, e.this.f53149a);
            for (int i10 = e.this.f53149a.f57965g; i10 <= e.this.f53149a.f57966h; i10++) {
                int iB = newTimeline.b(oldTimeline.m(i10));
                if (iB != -1) {
                    return newTimeline.f(iB, e.this.f53150b).f57955c;
                }
            }
            return -1;
        }

        public boolean h(int eventWindowIndex, @p0 z.a eventMediaPeriodId) {
            if (eventMediaPeriodId == null) {
                return eventWindowIndex == this.f53157b;
            }
            z.a aVar = this.f53159d;
            if (aVar == null) {
                return !eventMediaPeriodId.b() && eventMediaPeriodId.f56510d == this.f53158c;
            }
            return eventMediaPeriodId.f56510d == aVar.f56510d && eventMediaPeriodId.f56508b == aVar.f56508b && eventMediaPeriodId.f56509c == aVar.f56509c;
        }

        public boolean i(c.a eventTime) {
            long j10 = this.f53158c;
            if (j10 == -1) {
                return false;
            }
            z.a aVar = eventTime.f53143d;
            if (aVar == null) {
                return this.f53157b != eventTime.f53142c;
            }
            if (aVar.f56510d > j10) {
                return true;
            }
            if (this.f53159d == null) {
                return false;
            }
            int iB = eventTime.f53141b.b(aVar.f56507a);
            int iB2 = eventTime.f53141b.b(this.f53159d.f56507a);
            z.a aVar2 = eventTime.f53143d;
            if (aVar2.f56510d >= this.f53159d.f56510d && iB >= iB2) {
                if (iB > iB2) {
                    return true;
                }
                if (!aVar2.b()) {
                    int i10 = eventTime.f53143d.f56511e;
                    return i10 == -1 || i10 > this.f53159d.f56508b;
                }
                z.a aVar3 = eventTime.f53143d;
                int i11 = aVar3.f56508b;
                int i12 = aVar3.f56509c;
                z.a aVar4 = this.f53159d;
                int i13 = aVar4.f56508b;
                return i11 > i13 || (i11 == i13 && i12 > aVar4.f56509c);
            }
            return false;
        }

        public void j(int eventWindowIndex, @p0 z.a eventMediaPeriodId) {
            if (this.f53158c == -1 && eventWindowIndex == this.f53157b && eventMediaPeriodId != null && !eventMediaPeriodId.b()) {
                this.f53158c = eventMediaPeriodId.f56510d;
            }
        }

        public boolean l(z0 oldTimeline, z0 newTimeline) {
            int iK = k(oldTimeline, newTimeline, this.f53157b);
            this.f53157b = iK;
            if (iK == -1) {
                return false;
            }
            z.a aVar = this.f53159d;
            return aVar == null || newTimeline.b(aVar.f56507a) != -1;
        }
    }

    private static String i() {
        byte[] bArr = new byte[12];
        f53147h.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private a j(int windowIndex, @p0 z.a mediaPeriodId) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f53151c.values()) {
            aVar2.j(windowIndex, mediaPeriodId);
            if (aVar2.h(windowIndex, mediaPeriodId)) {
                long j11 = aVar2.f53158c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) q0.i(aVar)).f53159d != null && aVar2.f53159d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar == null) {
            String strI = i();
            aVar = new a(strI, windowIndex, mediaPeriodId);
            this.f53151c.put(strI, aVar);
        }
        return aVar;
    }

    @m({com.google.android.gms.common.internal.z.a.f106673a})
    private void k(c.a eventTime, a sessionDescriptor) {
        this.f53154f = eventTime.f53143d;
        if (sessionDescriptor.f53160e) {
            this.f53155g = sessionDescriptor.f53156a;
            if (sessionDescriptor.f53161f) {
                return;
            }
            sessionDescriptor.f53161f = true;
            this.f53152d.c(eventTime, sessionDescriptor.f53156a);
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.f
    public synchronized void a(c.a eventTime) {
        try {
            androidx.media2.exoplayer.external.util.a.g(this.f53152d);
            z0 z0Var = this.f53153e;
            this.f53153e = eventTime.f53141b;
            Iterator<a> it = this.f53151c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (!next.l(z0Var, this.f53153e)) {
                    it.remove();
                    if (next.f53160e) {
                        if (next.f53156a.equals(this.f53155g)) {
                            this.f53155g = null;
                        }
                        this.f53152d.a(eventTime, next.f53156a, false);
                    }
                }
            }
            f(eventTime, 4);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.f
    public synchronized String b(z0 timeline, z.a mediaPeriodId) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return j(timeline.h(mediaPeriodId.f56507a, this.f53150b).f57955c, mediaPeriodId).f53156a;
    }

    @Override // androidx.media2.exoplayer.external.analytics.f
    public synchronized void c(c.a eventTime) {
        z.a aVar;
        try {
            z.a aVar2 = eventTime.f53143d;
            if (aVar2 == null || (aVar = this.f53154f) == null || aVar2.f56510d >= aVar.f56510d) {
                a aVarJ = j(eventTime.f53142c, aVar2);
                if (!aVarJ.f53160e) {
                    aVarJ.f53160e = true;
                    ((f.a) androidx.media2.exoplayer.external.util.a.g(this.f53152d)).j(eventTime, aVarJ.f53156a);
                    if (this.f53155g == null) {
                        k(eventTime, aVarJ);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media2.exoplayer.external.analytics.f
    public synchronized boolean d(c.a eventTime, String sessionId) {
        a aVar = this.f53151c.get(sessionId);
        if (aVar == null) {
            int i10 = 3 & 0;
            return false;
        }
        aVar.j(eventTime.f53142c, eventTime.f53143d);
        return aVar.h(eventTime.f53142c, eventTime.f53143d);
    }

    @Override // androidx.media2.exoplayer.external.analytics.f
    public void e(f.a listener) {
        this.f53152d = listener;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0092 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:3:0x0001, B:10:0x0015, B:11:0x001f, B:13:0x0025, B:15:0x0031, B:17:0x003a, B:24:0x0050, B:27:0x0057, B:28:0x0062, B:30:0x0070, B:32:0x0076, B:34:0x007a, B:36:0x0084, B:38:0x008b, B:40:0x0092, B:42:0x00ab, B:44:0x00b1, B:45:0x00be), top: B:50:0x0001 }] */
    @Override // androidx.media2.exoplayer.external.analytics.f
    public synchronized void f(c.a eventTime, int reason) {
        a aVarJ;
        try {
            androidx.media2.exoplayer.external.util.a.g(this.f53152d);
            boolean z10 = reason == 0 || reason == 3;
            Iterator<a> it = this.f53151c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.i(eventTime)) {
                    it.remove();
                    if (next.f53160e) {
                        boolean zEquals = next.f53156a.equals(this.f53155g);
                        boolean z11 = z10 && zEquals;
                        if (zEquals) {
                            this.f53155g = null;
                        }
                        this.f53152d.a(eventTime, next.f53156a, z11);
                    }
                }
            }
            a aVarJ2 = j(eventTime.f53142c, eventTime.f53143d);
            z.a aVar = eventTime.f53143d;
            if (aVar != null && aVar.b()) {
                z.a aVar2 = this.f53154f;
                if (aVar2 != null) {
                    long j10 = aVar2.f56510d;
                    z.a aVar3 = eventTime.f53143d;
                    if (j10 != aVar3.f56510d || aVar2.f56508b != aVar3.f56508b || aVar2.f56509c != aVar3.f56509c) {
                        z.a aVar4 = eventTime.f53143d;
                        aVarJ = j(eventTime.f53142c, new z.a(aVar4.f56507a, aVar4.f56510d));
                        if (aVarJ.f53160e && aVarJ2.f53160e) {
                            this.f53152d.E(eventTime, aVarJ.f53156a, aVarJ2.f53156a);
                        }
                    }
                } else {
                    z.a aVar5 = eventTime.f53143d;
                    aVarJ = j(eventTime.f53142c, new z.a(aVar5.f56507a, aVar5.f56510d));
                    if (aVarJ.f53160e) {
                        this.f53152d.E(eventTime, aVarJ.f53156a, aVarJ2.f53156a);
                    }
                }
            }
            k(eventTime, aVarJ2);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
