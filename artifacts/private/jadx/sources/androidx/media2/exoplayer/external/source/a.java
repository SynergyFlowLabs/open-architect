package androidx.media2.exoplayer.external.source;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
abstract class a extends androidx.media2.exoplayer.external.z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x0 f55661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f55662d;

    public a(boolean isAtomic, x0 shuffleOrder) {
        this.f55662d = isAtomic;
        this.f55661c = shuffleOrder;
        this.f55660b = shuffleOrder.getLength();
    }

    public static Object A(Object childTimelineUid, Object childPeriodUid) {
        return Pair.create(childTimelineUid, childPeriodUid);
    }

    private int D(int childIndex, boolean shuffleModeEnabled) {
        if (shuffleModeEnabled) {
            return this.f55661c.b(childIndex);
        }
        if (childIndex < this.f55660b - 1) {
            return childIndex + 1;
        }
        return -1;
    }

    private int E(int childIndex, boolean shuffleModeEnabled) {
        if (shuffleModeEnabled) {
            return this.f55661c.a(childIndex);
        }
        if (childIndex > 0) {
            return childIndex - 1;
        }
        return -1;
    }

    public static Object x(Object concatenatedUid) {
        return ((Pair) concatenatedUid).second;
    }

    public static Object y(Object concatenatedUid) {
        return ((Pair) concatenatedUid).first;
    }

    protected abstract int B(int childIndex);

    protected abstract int C(int childIndex);

    protected abstract androidx.media2.exoplayer.external.z0 F(int childIndex);

    @Override // androidx.media2.exoplayer.external.z0
    public int a(boolean shuffleModeEnabled) {
        if (this.f55660b == 0) {
            return -1;
        }
        if (this.f55662d) {
            shuffleModeEnabled = false;
        }
        int iE = shuffleModeEnabled ? this.f55661c.e() : 0;
        while (F(iE).s()) {
            iE = D(iE, shuffleModeEnabled);
            if (iE == -1) {
                return -1;
            }
        }
        return C(iE) + F(iE).a(shuffleModeEnabled);
    }

    @Override // androidx.media2.exoplayer.external.z0
    public final int b(Object uid) {
        int iB;
        if (!(uid instanceof Pair)) {
            return -1;
        }
        Object objY = y(uid);
        Object objX = x(uid);
        int iU = u(objY);
        if (iU != -1 && (iB = F(iU).b(objX)) != -1) {
            return B(iU) + iB;
        }
        return -1;
    }

    @Override // androidx.media2.exoplayer.external.z0
    public int c(boolean shuffleModeEnabled) {
        int i10 = this.f55660b;
        if (i10 == 0) {
            return -1;
        }
        if (this.f55662d) {
            shuffleModeEnabled = false;
        }
        int iC = shuffleModeEnabled ? this.f55661c.c() : i10 - 1;
        while (F(iC).s()) {
            iC = E(iC, shuffleModeEnabled);
            if (iC == -1) {
                return -1;
            }
        }
        return C(iC) + F(iC).c(shuffleModeEnabled);
    }

    @Override // androidx.media2.exoplayer.external.z0
    public int e(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
        int i10 = 0;
        if (this.f55662d) {
            if (repeatMode == 1) {
                repeatMode = 2;
            }
            shuffleModeEnabled = false;
        }
        int iW = w(windowIndex);
        int iC = C(iW);
        androidx.media2.exoplayer.external.z0 z0VarF = F(iW);
        int i11 = windowIndex - iC;
        if (repeatMode != 2) {
            i10 = repeatMode;
        }
        int iE = z0VarF.e(i11, i10, shuffleModeEnabled);
        if (iE != -1) {
            return iC + iE;
        }
        int iD = D(iW, shuffleModeEnabled);
        while (iD != -1 && F(iD).s()) {
            iD = D(iD, shuffleModeEnabled);
        }
        if (iD != -1) {
            return C(iD) + F(iD).a(shuffleModeEnabled);
        }
        if (repeatMode == 2) {
            return a(shuffleModeEnabled);
        }
        return -1;
    }

    @Override // androidx.media2.exoplayer.external.z0
    public final androidx.media2.exoplayer.external.z0.b g(int periodIndex, androidx.media2.exoplayer.external.z0.b period, boolean setIds) {
        int iV = v(periodIndex);
        int iC = C(iV);
        F(iV).g(periodIndex - B(iV), period, setIds);
        period.f57955c += iC;
        if (setIds) {
            period.f57954b = A(z(iV), androidx.media2.exoplayer.external.util.a.g(period.f57954b));
        }
        return period;
    }

    @Override // androidx.media2.exoplayer.external.z0
    public final androidx.media2.exoplayer.external.z0.b h(Object uid, androidx.media2.exoplayer.external.z0.b period) {
        Object objY = y(uid);
        Object objX = x(uid);
        int iU = u(objY);
        int iC = C(iU);
        F(iU).h(objX, period);
        period.f57955c += iC;
        period.f57954b = uid;
        return period;
    }

    @Override // androidx.media2.exoplayer.external.z0
    public int l(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
        if (this.f55662d) {
            if (repeatMode == 1) {
                repeatMode = 2;
            }
            shuffleModeEnabled = false;
        }
        int iW = w(windowIndex);
        int iC = C(iW);
        int iL = F(iW).l(windowIndex - iC, repeatMode != 2 ? repeatMode : 0, shuffleModeEnabled);
        if (iL != -1) {
            return iC + iL;
        }
        int iE = E(iW, shuffleModeEnabled);
        while (iE != -1 && F(iE).s()) {
            iE = E(iE, shuffleModeEnabled);
        }
        if (iE != -1) {
            return C(iE) + F(iE).c(shuffleModeEnabled);
        }
        if (repeatMode == 2) {
            return c(shuffleModeEnabled);
        }
        return -1;
    }

    @Override // androidx.media2.exoplayer.external.z0
    public final Object m(int periodIndex) {
        int iV = v(periodIndex);
        return A(z(iV), F(iV).m(periodIndex - B(iV)));
    }

    @Override // androidx.media2.exoplayer.external.z0
    public final androidx.media2.exoplayer.external.z0.c o(int windowIndex, androidx.media2.exoplayer.external.z0.c window, long defaultPositionProjectionUs) {
        int iW = w(windowIndex);
        int iC = C(iW);
        int iB = B(iW);
        F(iW).o(windowIndex - iC, window, defaultPositionProjectionUs);
        window.f57965g += iB;
        window.f57966h += iB;
        return window;
    }

    protected abstract int u(Object childUid);

    protected abstract int v(int periodIndex);

    protected abstract int w(int windowIndex);

    protected abstract Object z(int childIndex);
}
