package androidx.media2.exoplayer.external.analytics;

import android.view.Surface;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.audio.r;
import androidx.media2.exoplayer.external.drm.k;
import androidx.media2.exoplayer.external.m0;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.o0;
import androidx.media2.exoplayer.external.source.TrackGroupArray;
import androidx.media2.exoplayer.external.source.k0;
import androidx.media2.exoplayer.external.source.z;
import androidx.media2.exoplayer.external.trackselection.p;
import androidx.media2.exoplayer.external.video.l;
import androidx.media2.exoplayer.external.video.u;
import androidx.media2.exoplayer.external.z0;
import il.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class a implements o0.d, androidx.media2.exoplayer.external.metadata.e, r, u, k0, androidx.media2.exoplayer.external.upstream.d.a, k, l, androidx.media2.exoplayer.external.audio.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.c f53125b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o0 f53128e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArraySet<c> f53124a = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f53127d = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0.c f53126c = new z0.c();

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.analytics.a$a, reason: collision with other inner class name */
    private static final class C0500a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z.a f53129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z0 f53130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f53131c;

        public C0500a(z.a mediaPeriodId, z0 timeline, int windowIndex) {
            this.f53129a = mediaPeriodId;
            this.f53130b = timeline;
            this.f53131c = windowIndex;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private C0500a f53135d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private C0500a f53136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private C0500a f53137f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f53139h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList<C0500a> f53132a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap<z.a, C0500a> f53133b = new HashMap<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final z0.b f53134c = new z0.b();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private z0 f53138g = z0.f57952a;

        private C0500a p(C0500a info, z0 newTimeline) {
            int iB = newTimeline.b(info.f53129a.f56507a);
            int i10 = 7 & (-1);
            if (iB == -1) {
                return info;
            }
            return new C0500a(info.f53129a, newTimeline, newTimeline.f(iB, this.f53134c).f57955c);
        }

        @p0
        public C0500a b() {
            return this.f53136e;
        }

        @p0
        public C0500a c() {
            if (this.f53132a.isEmpty()) {
                return null;
            }
            ArrayList<C0500a> arrayList = this.f53132a;
            return arrayList.get(arrayList.size() - 1);
        }

        @p0
        public C0500a d(z.a mediaPeriodId) {
            return this.f53133b.get(mediaPeriodId);
        }

        @p0
        public C0500a e() {
            if (!this.f53132a.isEmpty() && !this.f53138g.s() && !this.f53139h) {
                return this.f53132a.get(0);
            }
            return null;
        }

        @p0
        public C0500a f() {
            return this.f53137f;
        }

        public boolean g() {
            return this.f53139h;
        }

        public void h(int windowIndex, z.a mediaPeriodId) {
            C0500a c0500a = new C0500a(mediaPeriodId, this.f53138g.b(mediaPeriodId.f56507a) != -1 ? this.f53138g : z0.f57952a, windowIndex);
            this.f53132a.add(c0500a);
            this.f53133b.put(mediaPeriodId, c0500a);
            this.f53135d = this.f53132a.get(0);
            if (this.f53132a.size() != 1 || this.f53138g.s()) {
                return;
            }
            this.f53136e = this.f53135d;
        }

        public boolean i(z.a mediaPeriodId) {
            C0500a c0500aRemove = this.f53133b.remove(mediaPeriodId);
            if (c0500aRemove == null) {
                return false;
            }
            this.f53132a.remove(c0500aRemove);
            C0500a c0500a = this.f53137f;
            if (c0500a != null && mediaPeriodId.equals(c0500a.f53129a)) {
                this.f53137f = this.f53132a.isEmpty() ? null : this.f53132a.get(0);
            }
            if (!this.f53132a.isEmpty()) {
                this.f53135d = this.f53132a.get(0);
            }
            return true;
        }

        public void j(int reason) {
            this.f53136e = this.f53135d;
        }

        public void k(z.a mediaPeriodId) {
            this.f53137f = this.f53133b.get(mediaPeriodId);
        }

        public void l() {
            this.f53139h = false;
            this.f53136e = this.f53135d;
        }

        public void m() {
            this.f53139h = true;
        }

        public void n(z0 timeline) {
            for (int i10 = 0; i10 < this.f53132a.size(); i10++) {
                C0500a c0500aP = p(this.f53132a.get(i10), timeline);
                this.f53132a.set(i10, c0500aP);
                this.f53133b.put(c0500aP.f53129a, c0500aP);
            }
            C0500a c0500a = this.f53137f;
            if (c0500a != null) {
                this.f53137f = p(c0500a, timeline);
            }
            this.f53138g = timeline;
            this.f53136e = this.f53135d;
        }

        @p0
        public C0500a o(int windowIndex) {
            C0500a c0500a = null;
            for (int i10 = 0; i10 < this.f53132a.size(); i10++) {
                C0500a c0500a2 = this.f53132a.get(i10);
                int iB = this.f53138g.b(c0500a2.f53129a.f56507a);
                if (iB != -1 && this.f53138g.f(iB, this.f53134c).f57955c == windowIndex) {
                    if (c0500a != null) {
                        return null;
                    }
                    c0500a = c0500a2;
                }
            }
            return c0500a;
        }
    }

    public a(androidx.media2.exoplayer.external.util.c clock) {
        this.f53125b = (androidx.media2.exoplayer.external.util.c) androidx.media2.exoplayer.external.util.a.g(clock);
    }

    private c.a V(@p0 C0500a mediaPeriodInfo) {
        androidx.media2.exoplayer.external.util.a.g(this.f53128e);
        if (mediaPeriodInfo == null) {
            int iY = this.f53128e.Y();
            C0500a c0500aO = this.f53127d.o(iY);
            if (c0500aO == null) {
                z0 z0VarC0 = this.f53128e.c0();
                if (iY >= z0VarC0.r()) {
                    z0VarC0 = z0.f57952a;
                }
                return U(z0VarC0, iY, null);
            }
            mediaPeriodInfo = c0500aO;
        }
        return U(mediaPeriodInfo.f53130b, mediaPeriodInfo.f53131c, mediaPeriodInfo.f53129a);
    }

    private c.a W() {
        return V(this.f53127d.b());
    }

    private c.a X() {
        return V(this.f53127d.c());
    }

    private c.a Y(int windowIndex, @p0 z.a mediaPeriodId) {
        androidx.media2.exoplayer.external.util.a.g(this.f53128e);
        if (mediaPeriodId != null) {
            C0500a c0500aD = this.f53127d.d(mediaPeriodId);
            return c0500aD != null ? V(c0500aD) : U(z0.f57952a, windowIndex, mediaPeriodId);
        }
        z0 z0VarC0 = this.f53128e.c0();
        if (windowIndex >= z0VarC0.r()) {
            z0VarC0 = z0.f57952a;
        }
        return U(z0VarC0, windowIndex, null);
    }

    private c.a Z() {
        return V(this.f53127d.e());
    }

    private c.a a0() {
        return V(this.f53127d.f());
    }

    @Override // androidx.media2.exoplayer.external.o0.d
    public final void A(int reason) {
        this.f53127d.j(reason);
        c.a aVarZ = Z();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().e(aVarZ, reason);
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.i
    public void B(float audioVolume) {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().w(aVarA0, audioVolume);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0.d
    public final void C(boolean playWhenReady, int playbackState) {
        c.a aVarZ = Z();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().N(aVarZ, playWhenReady, playbackState);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0.d
    public void D(z0 z0Var, Object obj, int i10) {
        androidx.media2.exoplayer.external.p0.j(this, z0Var, obj, i10);
    }

    @Override // androidx.media2.exoplayer.external.audio.i
    public void E(androidx.media2.exoplayer.external.audio.c audioAttributes) {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().o(aVarA0, audioAttributes);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0.d
    public final void F() {
        if (this.f53127d.g()) {
            this.f53127d.l();
            c.a aVarZ = Z();
            Iterator<c> it = this.f53124a.iterator();
            while (it.hasNext()) {
                it.next().l(aVarZ);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.o0.d
    public final void G(z0 timeline, int reason) {
        this.f53127d.n(timeline);
        c.a aVarZ = Z();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().G(aVarZ, reason);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0.d
    public final void H(TrackGroupArray trackGroups, p trackSelections) {
        c.a aVarZ = Z();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().u(aVarZ, trackGroups, trackSelections);
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.r
    public final void I(int bufferSize, long bufferSizeMs, long elapsedSinceLastFeedMs) {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().B(aVarA0, bufferSize, bufferSizeMs, elapsedSinceLastFeedMs);
        }
    }

    @Override // androidx.media2.exoplayer.external.video.u
    public final void J(androidx.media2.exoplayer.external.decoder.d counters) {
        c.a aVarW = W();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().I(aVarW, 2, counters);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0.d
    public final void K(androidx.media2.exoplayer.external.i error) {
        c.a aVarW = W();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().D(aVarW, error);
        }
    }

    @Override // androidx.media2.exoplayer.external.video.u
    public final void L(androidx.media2.exoplayer.external.decoder.d counters) {
        c.a aVarZ = Z();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().Q(aVarZ, 2, counters);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.k0
    public final void M(int windowIndex, @p0 z.a mediaPeriodId, k0.b loadEventInfo, k0.c mediaLoadData, IOException error, boolean wasCanceled) {
        c.a aVarY = Y(windowIndex, mediaPeriodId);
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            k0.b bVar = loadEventInfo;
            k0.c cVar = mediaLoadData;
            IOException iOException = error;
            it.next().s(aVarY, bVar, cVar, iOException, wasCanceled);
            error = iOException;
            mediaLoadData = cVar;
            loadEventInfo = bVar;
        }
    }

    @Override // androidx.media2.exoplayer.external.source.k0
    public final void N(int windowIndex, @p0 z.a mediaPeriodId, k0.c mediaLoadData) {
        c.a aVarY = Y(windowIndex, mediaPeriodId);
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().y(aVarY, mediaLoadData);
        }
    }

    @Override // androidx.media2.exoplayer.external.drm.k
    public final void O() {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().J(aVarA0);
        }
    }

    @Override // androidx.media2.exoplayer.external.metadata.e
    public final void P(Metadata metadata) {
        c.a aVarZ = Z();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().C(aVarZ, metadata);
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.r
    public final void Q(androidx.media2.exoplayer.external.decoder.d counters) {
        c.a aVarW = W();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().I(aVarW, 1, counters);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.k0
    public final void R(int windowIndex, z.a mediaPeriodId) {
        this.f53127d.k(mediaPeriodId);
        c.a aVarY = Y(windowIndex, mediaPeriodId);
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().n(aVarY);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.k0
    public final void S(int windowIndex, @p0 z.a mediaPeriodId, k0.c mediaLoadData) {
        c.a aVarY = Y(windowIndex, mediaPeriodId);
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().m(aVarY, mediaLoadData);
        }
    }

    public void T(c listener) {
        this.f53124a.add(listener);
    }

    @m({"player"})
    protected c.a U(z0 timeline, int windowIndex, @p0 z.a mediaPeriodId) {
        if (timeline.s()) {
            mediaPeriodId = null;
        }
        z.a aVar = mediaPeriodId;
        long jB = this.f53125b.b();
        boolean z10 = timeline == this.f53128e.c0() && windowIndex == this.f53128e.Y();
        long jA = 0;
        if (aVar == null || !aVar.b()) {
            if (z10) {
                jA = this.f53128e.n0();
            } else if (!timeline.s()) {
                jA = timeline.n(windowIndex, this.f53126c).a();
            }
        } else if (z10 && this.f53128e.E() == aVar.f56508b && this.f53128e.P() == aVar.f56509c) {
            jA = this.f53128e.getCurrentPosition();
        }
        return new c.a(jB, timeline, windowIndex, aVar, jA, this.f53128e.getCurrentPosition(), this.f53128e.y());
    }

    @Override // androidx.media2.exoplayer.external.audio.r, androidx.media2.exoplayer.external.audio.i
    public final void a(int audioSessionId) {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().r(aVarA0, audioSessionId);
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.r
    public final void b(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().f(aVarA0, 1, decoderName, initializationDurationMs);
        }
    }

    protected Set<c> b0() {
        return Collections.unmodifiableSet(this.f53124a);
    }

    @Override // androidx.media2.exoplayer.external.video.u
    public final void c(int count, long elapsedMs) {
        c.a aVarW = W();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().x(aVarW, count, elapsedMs);
        }
    }

    public final void c0() {
        if (!this.f53127d.g()) {
            c.a aVarZ = Z();
            this.f53127d.m();
            Iterator<c> it = this.f53124a.iterator();
            while (it.hasNext()) {
                it.next().d(aVarZ);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.video.u
    public final void d(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().f(aVarA0, 2, decoderName, initializationDurationMs);
        }
    }

    public void d0(c listener) {
        this.f53124a.remove(listener);
    }

    @Override // androidx.media2.exoplayer.external.video.u, androidx.media2.exoplayer.external.video.l
    public final void e(int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio) {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().t(aVarA0, width, height, unappliedRotationDegrees, pixelWidthHeightRatio);
        }
    }

    public final void e0() {
        for (C0500a c0500a : new ArrayList(this.f53127d.f53132a)) {
            r(c0500a.f53131c, c0500a.f53129a);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0.d
    public final void f(m0 playbackParameters) {
        c.a aVarZ = Z();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().F(aVarZ, playbackParameters);
        }
    }

    public void f0(o0 player) {
        androidx.media2.exoplayer.external.util.a.i(this.f53128e == null || this.f53127d.f53132a.isEmpty());
        this.f53128e = (o0) androidx.media2.exoplayer.external.util.a.g(player);
    }

    @Override // androidx.media2.exoplayer.external.drm.k
    public final void g(Exception error) {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().b(aVarA0, error);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.k0
    public final void h(int windowIndex, z.a mediaPeriodId) {
        this.f53127d.h(windowIndex, mediaPeriodId);
        c.a aVarY = Y(windowIndex, mediaPeriodId);
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().i(aVarY);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.k0
    public final void i(int windowIndex, @p0 z.a mediaPeriodId, k0.b loadEventInfo, k0.c mediaLoadData) {
        c.a aVarY = Y(windowIndex, mediaPeriodId);
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().M(aVarY, loadEventInfo, mediaLoadData);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0.d
    public final void j(boolean isLoading) {
        c.a aVarZ = Z();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().L(aVarZ, isLoading);
        }
    }

    @Override // androidx.media2.exoplayer.external.drm.k
    public final void k() {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().g(aVarA0);
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.d.a
    public final void l(int elapsedMs, long bytes, long bitrate) {
        c.a aVarX = X();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().q(aVarX, elapsedMs, bytes, bitrate);
        }
    }

    @Override // androidx.media2.exoplayer.external.video.u
    public final void m(Format format) {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().z(aVarA0, 2, format);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0.d
    public final void n(boolean shuffleModeEnabled) {
        c.a aVarZ = Z();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().P(aVarZ, shuffleModeEnabled);
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.r
    public final void o(androidx.media2.exoplayer.external.decoder.d counters) {
        c.a aVarZ = Z();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            int i10 = 2 << 1;
            it.next().Q(aVarZ, 1, counters);
        }
    }

    @Override // androidx.media2.exoplayer.external.drm.k
    public final void p() {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().h(aVarA0);
        }
    }

    @Override // androidx.media2.exoplayer.external.audio.r
    public final void q(Format format) {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().z(aVarA0, 1, format);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.k0
    public final void r(int windowIndex, z.a mediaPeriodId) {
        c.a aVarY = Y(windowIndex, mediaPeriodId);
        if (this.f53127d.i(mediaPeriodId)) {
            Iterator<c> it = this.f53124a.iterator();
            while (it.hasNext()) {
                it.next().K(aVarY);
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.drm.k
    public final void s() {
        c.a aVarW = W();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().v(aVarW);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.k0
    public final void t(int windowIndex, @p0 z.a mediaPeriodId, k0.b loadEventInfo, k0.c mediaLoadData) {
        c.a aVarY = Y(windowIndex, mediaPeriodId);
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().H(aVarY, loadEventInfo, mediaLoadData);
        }
    }

    @Override // androidx.media2.exoplayer.external.drm.k
    public final void u() {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().R(aVarA0);
        }
    }

    @Override // androidx.media2.exoplayer.external.video.l
    public final void v() {
    }

    @Override // androidx.media2.exoplayer.external.video.u
    public final void w(@p0 Surface surface) {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().O(aVarA0, surface);
        }
    }

    @Override // androidx.media2.exoplayer.external.o0.d
    public final void x(int repeatMode) {
        c.a aVarZ = Z();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().k(aVarZ, repeatMode);
        }
    }

    @Override // androidx.media2.exoplayer.external.source.k0
    public final void y(int windowIndex, @p0 z.a mediaPeriodId, k0.b loadEventInfo, k0.c mediaLoadData) {
        c.a aVarY = Y(windowIndex, mediaPeriodId);
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().A(aVarY, loadEventInfo, mediaLoadData);
        }
    }

    @Override // androidx.media2.exoplayer.external.video.l
    public void z(int width, int height) {
        c.a aVarA0 = a0();
        Iterator<c> it = this.f53124a.iterator();
        while (it.hasNext()) {
            it.next().p(aVarA0, width, height);
        }
    }
}
