package androidx.activity;

import androidx.annotation.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n1#2:179\n1855#3,2:180\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n143#1:180,2\n*E\n"})
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Executor f9896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f9897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f9898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private int f9899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private boolean f9900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private boolean f9901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    @NotNull
    private final List<Function0<Unit>> f9902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Runnable f9903h;

    public e0(@NotNull Executor executor, @NotNull Function0<Unit> reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f9896a = executor;
        this.f9897b = reportFullyDrawn;
        this.f9898c = new Object();
        this.f9902g = new ArrayList();
        this.f9903h = new Runnable() { // from class: androidx.activity.d0
            @Override // java.lang.Runnable
            public final void run() {
                e0.i(this.f9895a);
            }
        };
    }

    private final void f() {
        if (this.f9900e || this.f9899d != 0) {
            return;
        }
        this.f9900e = true;
        this.f9896a.execute(this.f9903h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(e0 e0Var) {
        synchronized (e0Var.f9898c) {
            try {
                e0Var.f9900e = false;
                if (e0Var.f9899d == 0 && !e0Var.f9901f) {
                    e0Var.f9897b.invoke();
                    e0Var.d();
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(@NotNull Function0<Unit> callback) {
        boolean z10;
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f9898c) {
            if (this.f9901f) {
                z10 = true;
            } else {
                this.f9902g.add(callback);
                z10 = false;
            }
        }
        if (z10) {
            callback.invoke();
        }
    }

    public final void c() {
        synchronized (this.f9898c) {
            try {
                if (!this.f9901f) {
                    this.f9899d++;
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public final void d() {
        synchronized (this.f9898c) {
            try {
                this.f9901f = true;
                Iterator<T> it = this.f9902g.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f9902g.clear();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f9898c) {
            try {
                z10 = this.f9901f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final void g(@NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f9898c) {
            try {
                this.f9902g.remove(callback);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        int i10;
        synchronized (this.f9898c) {
            try {
                if (!this.f9901f && (i10 = this.f9899d) > 0) {
                    this.f9899d = i10 - 1;
                    f();
                }
                Unit unit = Unit.f312394a;
            } finally {
            }
        }
    }
}
