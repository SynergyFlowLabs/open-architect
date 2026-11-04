package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.facebook.appevents.p;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.ads_identifier.f;
import fj.j;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@j
public class AdvertisingIdClient {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f105027h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile AdvertisingIdClient f105028i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    com.google.android.gms.common.b f105029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    f f105030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f105031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f105032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    b f105033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f105034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f105035g;

    @g6.c
    public static final class Info {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final String f105036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f105037b;

        @Deprecated
        public Info(@p0 String str, boolean z10) {
            this.f105036a = str;
            this.f105037b = z10;
        }

        @p0
        public String getId() {
            return this.f105036a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f105037b;
        }

        @NonNull
        public String toString() {
            return "{" + this.f105036a + "}" + this.f105037b;
        }
    }

    @g6.a
    public AdvertisingIdClient(@NonNull Context context) {
        this(context, 30000L, false, false);
    }

    @g6.a
    public static boolean b(@NonNull Context context) throws IOException, i, h {
        boolean zM;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.g(false);
            w.q("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    advertisingIdClient.h();
                    w.r(advertisingIdClient.f105029a);
                    w.r(advertisingIdClient.f105030b);
                    try {
                        zM = advertisingIdClient.f105030b.m();
                    } catch (RemoteException e10) {
                        throw new IOException("Remote exception", e10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            advertisingIdClient.f();
            advertisingIdClient.e();
            return zM;
        } catch (Throwable th3) {
            advertisingIdClient.e();
            throw th3;
        }
    }

    @a0
    @g6.a
    public static void c(boolean z10) {
    }

    @NonNull
    public static Info getAdvertisingIdInfo(@NonNull Context context) throws IllegalStateException, IOException, i, h {
        AdvertisingIdClient advertisingIdClient = f105028i;
        if (advertisingIdClient == null) {
            synchronized (f105027h) {
                try {
                    advertisingIdClient = f105028i;
                    if (advertisingIdClient == null) {
                        advertisingIdClient = new AdvertisingIdClient(context);
                        f105028i = advertisingIdClient;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        AdvertisingIdClient advertisingIdClient2 = advertisingIdClient;
        d dVarA = d.a(context);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = -1;
        try {
            Info infoJ = advertisingIdClient2.j(-1);
            advertisingIdClient2.i(infoJ, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            try {
                dVarA.c(35401, 0, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
                return infoJ;
            } catch (Throwable th3) {
                th = th3;
                dVarA = dVarA;
                jElapsedRealtime = jElapsedRealtime;
                Throwable th4 = th;
                advertisingIdClient2.i(null, true, 0.0f, -1L, "", th4);
                if (th4 instanceof IOException) {
                    i10 = 1;
                } else if (th4 instanceof h) {
                    i10 = 9;
                } else if (th4 instanceof i) {
                    i10 = 16;
                } else if (th4 instanceof IllegalStateException) {
                    i10 = 8;
                }
                dVarA.c(35401, i10, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private final Info j(int i10) throws IOException {
        Info info;
        w.q("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                h();
                w.r(this.f105029a);
                w.r(this.f105030b);
                try {
                    info = new Info(this.f105030b.h(), this.f105030b.q2(true));
                } catch (RemoteException e10) {
                    throw new IOException("Remote exception", e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f();
        return info;
    }

    @NonNull
    @g6.a
    public Info a() throws IOException {
        return j(-1);
    }

    @g6.a
    public void d() throws IllegalStateException, IOException, i, h {
        g(true);
    }

    public final void e() {
        w.q("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f105034f == null || this.f105029a == null) {
                    return;
                }
                try {
                    if (this.f105031c) {
                        com.google.android.gms.common.stats.a.b().c(this.f105034f, this.f105029a);
                    }
                } catch (Throwable unused) {
                }
                this.f105031c = false;
                this.f105030b = null;
                this.f105029a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @l1
    final void f() {
        synchronized (this.f105032d) {
            try {
                b bVar = this.f105033e;
                if (bVar != null) {
                    bVar.f105041c.countDown();
                    try {
                        this.f105033e.join();
                    } catch (InterruptedException unused) {
                    }
                }
                long j10 = this.f105035g;
                if (j10 > 0) {
                    this.f105033e = new b(this, j10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void finalize() throws Throwable {
        e();
        super.finalize();
    }

    @l1
    protected final void g(boolean z10) throws IllegalStateException, IOException, i, h {
        w.q("Calling this from your main thread can lead to deadlock");
        if (z10) {
            f();
        }
        synchronized (this) {
            try {
                if (this.f105031c) {
                    return;
                }
                Context context = this.f105034f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iK = g.i().k(context, 12451000);
                    if (iK != 0 && iK != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    com.google.android.gms.common.b bVar = new com.google.android.gms.common.b();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!com.google.android.gms.common.stats.a.b().a(context, intent, bVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f105029a = bVar;
                        try {
                            try {
                                this.f105030b = com.google.android.gms.internal.ads_identifier.e.i(bVar.b(10000L, TimeUnit.MILLISECONDS));
                                this.f105031c = true;
                            } catch (Throwable th2) {
                                throw new IOException(th2);
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        }
                    } catch (Throwable th3) {
                        throw new IOException(th3);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new h(9);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @l1
    final synchronized void h() throws IOException {
        try {
            if (!this.f105031c) {
                try {
                    g(false);
                    if (!this.f105031c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l1
    final boolean i(@p0 Info info, boolean z10, float f10, long j10, String str, @p0 Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? p.f99189d0 : "1");
            String id2 = info.getId();
            if (id2 != null) {
                map.put("ad_id_size", Integer.toString(id2.length()));
            }
        }
        if (th2 != null) {
            map.put("error", th2.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j10));
        new a(this, map).start();
        return true;
    }

    @l1
    public AdvertisingIdClient(@NonNull Context context, long j10, boolean z10, boolean z11) {
        this.f105032d = new Object();
        w.r(context);
        this.f105034f = context.getApplicationContext();
        this.f105031c = false;
        this.f105035g = j10;
    }
}
