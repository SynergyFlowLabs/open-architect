package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.m1;
import androidx.annotation.p0;
import androidx.work.impl.a0;
import androidx.work.impl.constraints.trackers.o;
import androidx.work.impl.model.n;
import androidx.work.impl.utils.c0;
import androidx.work.impl.utils.i0;
import androidx.work.v;
import com.facebook.AuthenticationTokenClaims;
import java.util.concurrent.Executor;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.p2;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class f implements androidx.work.impl.constraints.d, i0.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f76684o = v.i("DelayMetCommandHandler");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f76685s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f76686t = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f76687v = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f76688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f76689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f76690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f76691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.work.impl.constraints.e f76692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f76693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f76694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Executor f76695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f76696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private PowerManager.WakeLock f76697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f76698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a0 f76699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final n0 f76700m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile p2 f76701n;

    f(@NonNull Context context, int startId, @NonNull g dispatcher, @NonNull a0 startStopToken) {
        this.f76688a = context;
        this.f76689b = startId;
        this.f76691d = dispatcher;
        this.f76690c = startStopToken.a();
        this.f76699l = startStopToken;
        o oVarR = dispatcher.g().R();
        this.f76695h = dispatcher.f().d();
        this.f76696i = dispatcher.f().c();
        this.f76700m = dispatcher.f().a();
        this.f76692e = new androidx.work.impl.constraints.e(oVarR);
        this.f76698k = false;
        this.f76694g = 0;
        this.f76693f = new Object();
    }

    private void d() {
        synchronized (this.f76693f) {
            try {
                if (this.f76701n != null) {
                    this.f76701n.e(null);
                }
                this.f76691d.h().d(this.f76690c);
                PowerManager.WakeLock wakeLock = this.f76697j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    v.e().a(f76684o, "Releasing wakelock " + this.f76697j + "for WorkSpec " + this.f76690c);
                    this.f76697j.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f76694g != 0) {
            v.e().a(f76684o, "Already started work for " + this.f76690c);
            return;
        }
        this.f76694g = 1;
        v.e().a(f76684o, "onAllConstraintsMet for " + this.f76690c);
        if (this.f76691d.e().p(this.f76699l)) {
            this.f76691d.h().c(this.f76690c, AuthenticationTokenClaims.Z, this);
        } else {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        String strF = this.f76690c.f();
        if (this.f76694g >= 2) {
            v.e().a(f76684o, "Already stopped work for " + strF);
            return;
        }
        this.f76694g = 2;
        v vVarE = v.e();
        String str = f76684o;
        vVarE.a(str, "Stopping work for WorkSpec " + strF);
        this.f76696i.execute(new g.b(this.f76691d, b.g(this.f76688a, this.f76690c), this.f76689b));
        if (!this.f76691d.e().l(this.f76690c.f())) {
            v.e().a(str, "Processor does not have WorkSpec " + strF + ". No need to reschedule");
            return;
        }
        v.e().a(str, "WorkSpec " + strF + " needs to be rescheduled");
        this.f76696i.execute(new g.b(this.f76691d, b.f(this.f76688a, this.f76690c), this.f76689b));
    }

    @Override // androidx.work.impl.utils.i0.a
    public void a(@NonNull n id2) {
        v.e().a(f76684o, "Exceeded time limits on execution for " + id2);
        this.f76695h.execute(new d(this));
    }

    @Override // androidx.work.impl.constraints.d
    public void e(@NonNull androidx.work.impl.model.v workSpec, @NonNull androidx.work.impl.constraints.b state) {
        if (state instanceof androidx.work.impl.constraints.b.a) {
            this.f76695h.execute(new e(this));
        } else {
            this.f76695h.execute(new d(this));
        }
    }

    @m1
    void f() {
        String strF = this.f76690c.f();
        this.f76697j = c0.b(this.f76688a, strF + " (" + this.f76689b + ")");
        v vVarE = v.e();
        String str = f76684o;
        vVarE.a(str, "Acquiring wakelock " + this.f76697j + "for WorkSpec " + strF);
        this.f76697j.acquire();
        androidx.work.impl.model.v vVarH = this.f76691d.g().S().k().H(strF);
        if (vVarH == null) {
            this.f76695h.execute(new d(this));
            return;
        }
        boolean zH = vVarH.H();
        this.f76698k = zH;
        if (zH) {
            this.f76701n = androidx.work.impl.constraints.f.b(this.f76692e, vVarH, this.f76700m, this);
            return;
        }
        v.e().a(str, "No constraints for " + strF);
        this.f76695h.execute(new e(this));
    }

    void g(boolean needsReschedule) {
        v.e().a(f76684o, "onExecuted " + this.f76690c + ", " + needsReschedule);
        d();
        if (needsReschedule) {
            this.f76696i.execute(new g.b(this.f76691d, b.f(this.f76688a, this.f76690c), this.f76689b));
        }
        if (this.f76698k) {
            this.f76696i.execute(new g.b(this.f76691d, b.a(this.f76688a), this.f76689b));
        }
    }
}
