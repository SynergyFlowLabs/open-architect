package androidx.media3.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private static e0 f61491f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f61492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<d> f61493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f61494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private int f61495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private boolean f61496e;

    @androidx.annotation.w0(31)
    private static final class b {

        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final e0 f61497a;

            public a(e0 e0Var) {
                this.f61497a = e0Var;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f61497a.o(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        private b() {
        }

        public static void a(Context context, e0 e0Var) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) androidx.media3.common.util.a.g((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(e0Var);
                telephonyManager.registerTelephonyCallback(e0Var.f61492a, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                e0Var.o(5);
            }
        }
    }

    public interface c {
        void a(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<c> f61498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f61499b;

        public d(c cVar, Executor executor) {
            this.f61498a = new WeakReference<>(cVar);
            this.f61499b = executor;
        }

        public static /* synthetic */ void a(d dVar) {
            c cVar = dVar.f61498a.get();
            if (cVar != null) {
                cVar.a(e0.this.g());
            }
        }

        public void b() {
            this.f61499b.execute(new Runnable() { // from class: androidx.media3.common.util.i0
                @Override // java.lang.Runnable
                public final void run() {
                    e0.d.a(this.f61516a);
                }
            });
        }

        public boolean c() {
            return this.f61498a.get() == null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            e0.this.f61492a.execute(new Runnable() { // from class: androidx.media3.common.util.j0
                @Override // java.lang.Runnable
                public final void run() {
                    e0.this.i(context);
                }
            });
        }
    }

    private e0(final Context context) {
        Executor executorA = androidx.media3.common.util.c.a();
        this.f61492a = executorA;
        this.f61493b = new CopyOnWriteArrayList<>();
        this.f61494c = new Object();
        this.f61495d = 0;
        executorA.execute(new Runnable() { // from class: androidx.media3.common.util.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f61487a.j(context);
            }
        });
    }

    public static synchronized e0 e(Context context) {
        try {
            if (f61491f == null) {
                f61491f = new e0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f61491f;
    }

    private static int f(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return k1.f61540a >= 29 ? 9 : 0;
        }
    }

    private static int h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return f(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context) {
        int iH = h(context);
        if (k1.f61540a < 31 || iH != 5) {
            o(iH);
        } else {
            b.a(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @e.a({"UnprotectedReceiver"})
    public void j(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new e(), intentFilter);
    }

    private void m() {
        for (d dVar : this.f61493b) {
            if (dVar.c()) {
                this.f61493b.remove(dVar);
            }
        }
    }

    @androidx.annotation.l1
    public static synchronized void n() {
        f61491f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i10) {
        m();
        synchronized (this.f61494c) {
            try {
                if (this.f61496e && this.f61495d == i10) {
                    return;
                }
                this.f61496e = true;
                this.f61495d = i10;
                Iterator<d> it = this.f61493b.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int g() {
        int i10;
        synchronized (this.f61494c) {
            try {
                i10 = this.f61495d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @z7.m(imports = {"android.os.Handler", "android.os.Looper"}, replacement = "this.register(listener, new Handler(Looper.getMainLooper())::post)")
    @Deprecated
    public void k(c cVar) {
        l(cVar, new androidx.emoji2.text.a(new Handler(Looper.getMainLooper())));
    }

    public void l(c cVar, Executor executor) {
        boolean z10;
        m();
        d dVar = new d(cVar, executor);
        synchronized (this.f61494c) {
            try {
                this.f61493b.add(dVar);
                z10 = this.f61496e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            dVar.b();
        }
    }
}
