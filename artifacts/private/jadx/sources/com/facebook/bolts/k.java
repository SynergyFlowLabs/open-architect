package com.facebook.bolts;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f99347a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<i> f99348b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ScheduledExecutorService f99349c = f.f99331d.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private ScheduledFuture<?> f99350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f99351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f99352f;

    private final void d(long j10, TimeUnit timeUnit) {
        if (!(j10 >= -1)) {
            throw new IllegalArgumentException("Delay must be >= -1");
        }
        if (j10 == 0) {
            b();
            return;
        }
        synchronized (this.f99347a) {
            try {
                if (this.f99351e) {
                    return;
                }
                f();
                if (j10 != -1) {
                    this.f99350d = this.f99349c.schedule(new Runnable() { // from class: com.facebook.bolts.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            k.e(this.f99346a);
                        }
                    }, j10, timeUnit);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(k this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f99347a) {
            try {
                this$0.f99350d = null;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this$0.b();
    }

    private final void f() {
        ScheduledFuture<?> scheduledFuture = this.f99350d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
        this.f99350d = null;
    }

    private final void j(List<i> list) {
        Iterator<i> it = list.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private final void o() {
        if (this.f99352f) {
            throw new IllegalStateException("Object already closed");
        }
    }

    public final void b() {
        synchronized (this.f99347a) {
            o();
            if (this.f99351e) {
                return;
            }
            f();
            this.f99351e = true;
            ArrayList arrayList = new ArrayList(this.f99348b);
            Unit unit = Unit.f312394a;
            j(arrayList);
        }
    }

    public final void c(long j10) {
        d(j10, TimeUnit.MILLISECONDS);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f99347a) {
            try {
                if (this.f99352f) {
                    return;
                }
                f();
                Iterator<i> it = this.f99348b.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                this.f99348b.clear();
                this.f99352f = true;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final h g() {
        h hVar;
        synchronized (this.f99347a) {
            o();
            hVar = new h(this);
        }
        return hVar;
    }

    public final boolean h() {
        boolean z10;
        synchronized (this.f99347a) {
            try {
                o();
                z10 = this.f99351e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @NotNull
    public final i l(@Nullable Runnable runnable) {
        i iVar;
        synchronized (this.f99347a) {
            try {
                o();
                iVar = new i(this, runnable);
                if (this.f99351e) {
                    iVar.a();
                    Unit unit = Unit.f312394a;
                } else {
                    this.f99348b.add(iVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    public final void m() throws CancellationException {
        synchronized (this.f99347a) {
            o();
            if (this.f99351e) {
                throw new CancellationException();
            }
            Unit unit = Unit.f312394a;
        }
    }

    public final void q(@NotNull i registration) {
        Intrinsics.checkNotNullParameter(registration, "registration");
        synchronized (this.f99347a) {
            o();
            this.f99348b.remove(registration);
        }
    }

    @NotNull
    public String toString() {
        q1 q1Var = q1.f312784a;
        String str = String.format(Locale.US, "%s@%s[cancellationRequested=%s]", Arrays.copyOf(new Object[]{k.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(h())}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        return str;
    }
}
