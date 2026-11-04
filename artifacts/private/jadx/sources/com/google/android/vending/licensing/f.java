package com.google.android.vending.licensing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class f implements ServiceConnection {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f115021k = "LicenseChecker";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f115022l = "RSA";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f115023m = 10000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final SecureRandom f115024n = new SecureRandom();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final boolean f115025o = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ILicensingService f115026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PublicKey f115027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f115028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f115029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f115030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f115031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f115032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set<h> f115033h = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Queue<h> f115034i = new LinkedList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p f115035j;

    private class a extends e.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f115036f = 257;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f115037g = 258;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f115038h = 259;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h f115039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Runnable f115040d;

        /* JADX INFO: renamed from: com.google.android.vending.licensing.f$a$a, reason: collision with other inner class name */
        class RunnableC1007a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f115042a;

            RunnableC1007a(f fVar) {
                this.f115042a = fVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                f.this.l(aVar.f115039c);
                a aVar2 = a.this;
                f.this.h(aVar2.f115039c);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f115044a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f115045b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f115046c;

            b(int i10, String str, String str2) {
                this.f115044a = i10;
                this.f115045b = str;
                this.f115046c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (f.this.f115033h.contains(a.this.f115039c)) {
                    a.this.p();
                    a.this.f115039c.g(f.this.f115027b, this.f115044a, this.f115045b, this.f115046c);
                    a aVar = a.this;
                    f.this.h(aVar.f115039c);
                }
            }
        }

        public a(h hVar) {
            this.f115039c = hVar;
            this.f115040d = new RunnableC1007a(f.this);
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p() {
            f.this.f115030e.removeCallbacks(this.f115040d);
        }

        private void s() {
            f.this.f115030e.postDelayed(this.f115040d, 10000L);
        }

        @Override // com.google.android.vending.licensing.e
        public void a5(int i10, String str, String str2) {
            f.this.f115030e.post(new b(i10, str, str2));
        }
    }

    public f(Context context, k kVar, String str, p pVar) {
        this.f115028c = context;
        this.f115029d = kVar;
        this.f115027b = j(str);
        String packageName = context.getPackageName();
        this.f115031f = packageName;
        this.f115032g = k(context, packageName);
        this.f115035j = pVar;
        HandlerThread handlerThread = new HandlerThread("background thread");
        handlerThread.start();
        this.f115030e = new Handler(handlerThread.getLooper());
    }

    private void g() {
        if (this.f115026a != null) {
            try {
                this.f115028c.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
            this.f115026a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h(h hVar) {
        try {
            this.f115033h.remove(hVar);
            if (this.f115033h.isEmpty()) {
                g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private int i() {
        return f115024n.nextInt();
    }

    private static PublicKey j(String str) {
        try {
            return KeyFactory.getInstance(f115022l).generatePublic(new X509EncodedKeySpec(com.google.android.vending.licensing.util.a.a(str)));
        } catch (com.google.android.vending.licensing.util.b e10) {
            throw new IllegalArgumentException(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new RuntimeException(e11);
        } catch (InvalidKeySpecException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    private static String k(Context context, String str) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l(h hVar) {
        try {
            this.f115029d.a(k.f115074c, null);
            if (this.f115029d.b()) {
                hVar.a().a(k.f115074c);
            } else {
                hVar.a().b(k.f115074c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void n() {
        while (true) {
            h hVarPoll = this.f115034i.poll();
            if (hVarPoll == null) {
                return;
            }
            try {
                hVarPoll.c();
                this.f115026a.R6(hVarPoll.b(), hVarPoll.c(), new a(hVarPoll));
                this.f115033h.add(hVarPoll);
            } catch (RemoteException unused) {
                l(hVarPoll);
            }
        }
    }

    public synchronized void f(g gVar) {
        try {
            if (this.f115029d.b()) {
                gVar.a(256);
            } else {
                h hVar = new h(this.f115029d, new i(), gVar, i(), this.f115031f, this.f115032g, this.f115035j);
                if (this.f115026a == null) {
                    try {
                        Intent intent = new Intent(new String(com.google.android.vending.licensing.util.a.a("Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U=")));
                        intent.setPackage("com.android.vending");
                        if (this.f115028c.bindService(intent, this, 1)) {
                            this.f115034i.offer(hVar);
                        } else {
                            l(hVar);
                        }
                    } catch (com.google.android.vending.licensing.util.b e10) {
                        e10.printStackTrace();
                    } catch (SecurityException unused) {
                        gVar.c(6);
                    }
                } else {
                    this.f115034i.offer(hVar);
                    n();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void m() {
        g();
        this.f115030e.getLooper().quit();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f115026a = ILicensingService.a.i(iBinder);
        n();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceDisconnected(ComponentName componentName) {
        try {
            this.f115026a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
