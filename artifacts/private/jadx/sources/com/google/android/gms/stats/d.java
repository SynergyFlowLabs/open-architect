package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.util.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
@a0
@g6.a
@gj.d
public class d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f110950r = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f110951s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f110952t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static volatile h f110953u = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f110954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b0("acquireReleaseLock")
    private final PowerManager.WakeLock f110955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b0("acquireReleaseLock")
    private int f110956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b0("acquireReleaseLock")
    private Future<?> f110957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0("acquireReleaseLock")
    private long f110958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b0("acquireReleaseLock")
    private final Set<i> f110959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @b0("acquireReleaseLock")
    private boolean f110960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @b0("acquireReleaseLock")
    private int f110961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @b0("acquireReleaseLock")
    com.google.android.gms.internal.stats.b f110962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.gms.common.util.g f110963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WorkSource f110964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f110965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f110966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f110967n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @b0("acquireReleaseLock")
    private final Map<String, g> f110968o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AtomicInteger f110969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f110970q;

    static {
        boolean z10 = true & false;
    }

    @g6.a
    public d(@NonNull Context context, int i10, @NonNull String str) {
        String packageName = context.getPackageName();
        this.f110954a = new Object();
        this.f110956c = 0;
        this.f110959f = new HashSet();
        this.f110960g = true;
        this.f110963j = k.d();
        this.f110968o = new HashMap();
        this.f110969p = new AtomicInteger(0);
        w.s(context, "WakeLock: context must not be null");
        w.m(str, "WakeLock: wakeLockName must not be empty");
        this.f110967n = context.getApplicationContext();
        this.f110966m = str;
        this.f110962i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f110965l = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f110965l = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new com.google.android.gms.internal.stats.i(sb2.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i10, str);
        this.f110955b = wakeLockNewWakeLock;
        if (d0.g(context)) {
            WorkSource workSourceB = d0.b(context, com.google.android.gms.common.util.b0.b(packageName) ? context.getPackageName() : packageName);
            this.f110964k = workSourceB;
            if (workSourceB != null) {
                i(wakeLockNewWakeLock, workSourceB);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f110951s;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f110952t) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f110951s;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        com.google.android.gms.internal.stats.h.a();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f110951s = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f110970q = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void e(@NonNull d dVar) {
        synchronized (dVar.f110954a) {
            try {
                if (dVar.b()) {
                    String.valueOf(dVar.f110965l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                    dVar.g();
                    if (dVar.b()) {
                        dVar.f110956c = 1;
                        dVar.h(0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @b0("acquireReleaseLock")
    private final String f(String str) {
        int i10 = 0 >> 0;
        if (this.f110960g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    @b0("acquireReleaseLock")
    private final void g() {
        if (this.f110959f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f110959f);
        this.f110959f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    private final void h(int i10) {
        synchronized (this.f110954a) {
            try {
                if (b()) {
                    if (this.f110960g) {
                        int i11 = this.f110956c - 1;
                        this.f110956c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f110956c = 0;
                    }
                    g();
                    Iterator<g> it = this.f110968o.values().iterator();
                    while (it.hasNext()) {
                        it.next().f110972a = 0;
                    }
                    this.f110968o.clear();
                    Future<?> future = this.f110957d;
                    if (future != null) {
                        future.cancel(false);
                        this.f110957d = null;
                        this.f110958e = 0L;
                    }
                    this.f110961h = 0;
                    if (this.f110955b.isHeld()) {
                        try {
                            try {
                                this.f110955b.release();
                                if (this.f110962i != null) {
                                    this.f110962i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                String.valueOf(this.f110965l).concat(" failed to release!");
                                if (this.f110962i != null) {
                                    this.f110962i = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f110962i != null) {
                                this.f110962i = null;
                            }
                            throw th2;
                        }
                    } else {
                        String.valueOf(this.f110965l).concat(" should be held!");
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    @g6.a
    public void a(long j10) {
        this.f110969p.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f110950r), 1L);
        if (j10 > 0) {
            jMax = Math.min(j10, jMax);
        }
        synchronized (this.f110954a) {
            try {
                if (!b()) {
                    this.f110962i = com.google.android.gms.internal.stats.b.a(false, null);
                    this.f110955b.acquire();
                    this.f110963j.b();
                }
                this.f110956c++;
                this.f110961h++;
                f(null);
                g gVar = this.f110968o.get(null);
                if (gVar == null) {
                    gVar = new g(null);
                    this.f110968o.put(null, gVar);
                }
                gVar.f110972a++;
                long jB = this.f110963j.b();
                long j11 = Long.MAX_VALUE - jB > jMax ? jB + jMax : Long.MAX_VALUE;
                if (j11 > this.f110958e) {
                    this.f110958e = j11;
                    Future<?> future = this.f110957d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f110957d = this.f110970q.schedule(new Runnable() { // from class: com.google.android.gms.stats.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.e(this.f110971a);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @g6.a
    public boolean b() {
        boolean z10;
        synchronized (this.f110954a) {
            try {
                z10 = this.f110956c > 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @g6.a
    public void c() {
        if (this.f110969p.decrementAndGet() < 0) {
            String.valueOf(this.f110965l).concat(" release without a matched acquire!");
        }
        synchronized (this.f110954a) {
            try {
                f(null);
                if (this.f110968o.containsKey(null)) {
                    g gVar = this.f110968o.get(null);
                    if (gVar != null) {
                        int i10 = gVar.f110972a - 1;
                        gVar.f110972a = i10;
                        if (i10 == 0) {
                            this.f110968o.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.f110965l).concat(" counter does not exist");
                }
                h(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @g6.a
    public void d(boolean z10) {
        synchronized (this.f110954a) {
            try {
                this.f110960g = z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
