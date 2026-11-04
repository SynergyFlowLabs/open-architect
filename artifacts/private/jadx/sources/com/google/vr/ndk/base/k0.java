package com.google.vr.ndk.base;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.vr.vrcore.performance.api.TimestampedTemperature;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class k0 implements AutoCloseable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f127153g = "ThrottlingMonitor";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f127154h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f127155i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f127156j = -2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f127157k = -3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f127158l = -4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f127159m = -5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f127161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f127162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.vr.vrcore.performance.api.a f127163d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f127160a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList<c> f127164e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ServiceConnection f127165f = new a();

    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ArrayList arrayList = new ArrayList();
            synchronized (k0.this.f127160a) {
                k0.this.f127163d = com.google.vr.vrcore.performance.api.a.AbstractBinderC1427a.p(iBinder);
                arrayList.addAll(k0.this.f127164e);
                k0.this.f127164e.clear();
                k0.this.f127160a.notifyAll();
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((c) obj).a();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (k0.this.f127160a) {
                k0.this.f127163d = null;
                k0.this.f127160a.notifyAll();
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f127167a;

        b(k0 k0Var, c cVar) {
            this.f127167a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f127167a.a();
        }
    }

    public interface c {
        void a();
    }

    public interface d {
        void a(float f10, long j10);
    }

    static class e extends com.google.vr.vrcore.performance.api.b.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f127168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Handler f127169e;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f127170a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f127171b;

            a(float f10, long j10) {
                this.f127170a = f10;
                this.f127171b = j10;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f127168d.a(this.f127170a, this.f127171b);
            }
        }

        public e(d dVar, Handler handler) {
            this.f127168d = dVar;
            this.f127169e = handler;
        }

        @Override // com.google.vr.vrcore.performance.api.b
        public void T3(float f10, long j10) {
            Handler handler = this.f127169e;
            if (handler == null) {
                this.f127168d.a(f10, j10);
            } else {
                handler.post(new a(f10, j10));
            }
        }
    }

    private k0(Context context) {
        this.f127161b = context;
        this.f127162c = new Handler(context.getMainLooper());
    }

    private int g(ComponentName componentName, int i10, float f10, d dVar, long j10, Handler handler) {
        com.google.vr.vrcore.performance.api.a aVar;
        if (dVar == null) {
            throw new IllegalArgumentException("Argument 'trigger' cannot be null.");
        }
        synchronized (this.f127160a) {
            aVar = this.f127163d;
        }
        if (aVar == null) {
            return -3;
        }
        try {
            aVar.jb(componentName, new e(dVar, handler), j10, f10, i10);
            return 0;
        } catch (RemoteException e10) {
            new StringBuilder(String.valueOf(e10).length() + 29);
            return -5;
        } catch (SecurityException unused) {
            return -2;
        } catch (UnsupportedOperationException unused2) {
            return -1;
        }
    }

    public static k0 h(Context context) {
        Intent intent = new Intent("com.google.vr.vrcore.performance.service.BIND");
        intent.setPackage("com.google.vr.vrcore");
        k0 k0Var = new k0(context);
        if (context.bindService(intent, k0Var.f127165f, 1)) {
            return k0Var;
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f127161b.unbindService(this.f127165f);
    }

    public int d(ComponentName componentName, float f10, d dVar, long j10, Handler handler) {
        return g(componentName, 3, f10, dVar, j10, handler);
    }

    public int e(ComponentName componentName, float f10, d dVar, Handler handler) {
        return g(componentName, 2, f10, dVar, 0L, handler);
    }

    public int f(ComponentName componentName, d dVar, long j10, Handler handler) {
        return g(componentName, 1, 0.0f, dVar, j10, handler);
    }

    public long j() {
        com.google.vr.vrcore.performance.api.a aVar;
        synchronized (this.f127160a) {
            try {
                aVar = this.f127163d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar == null) {
            return -3L;
        }
        try {
            long jBf = aVar.bf();
            if (jBf < 0) {
                return -4L;
            }
            return jBf;
        } catch (RemoteException e10) {
            new StringBuilder(String.valueOf(e10).length() + 29);
            return -5L;
        } catch (SecurityException unused) {
            return -2L;
        } catch (UnsupportedOperationException unused2) {
            return -1L;
        }
    }

    public int l(TimestampedTemperature timestampedTemperature) {
        com.google.vr.vrcore.performance.api.a aVar;
        synchronized (this.f127160a) {
            aVar = this.f127163d;
        }
        if (aVar == null) {
            return -3;
        }
        try {
            aVar.cc(timestampedTemperature);
            return timestampedTemperature.f130072b == Float.MIN_VALUE ? -4 : 0;
        } catch (RemoteException e10) {
            new StringBuilder(String.valueOf(e10).length() + 29);
            return -5;
        } catch (SecurityException unused) {
            return -2;
        } catch (UnsupportedOperationException unused2) {
            return -1;
        }
    }

    public void m(c cVar) {
        synchronized (this.f127160a) {
            try {
                if (this.f127163d != null) {
                    this.f127162c.post(new b(this, cVar));
                } else {
                    this.f127164e.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int o(ComponentName componentName) {
        com.google.vr.vrcore.performance.api.a aVar;
        synchronized (this.f127160a) {
            try {
                aVar = this.f127163d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar == null) {
            return -3;
        }
        try {
            aVar.f4(componentName);
            return 0;
        } catch (RemoteException e10) {
            new StringBuilder(String.valueOf(e10).length() + 29);
            return -5;
        } catch (SecurityException unused) {
            return -2;
        } catch (UnsupportedOperationException unused2) {
            return -1;
        }
    }
}
