package com.google.vr.ndk.base;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@s9.b
@e.b(24)
public class k implements AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f127114h = "DaydreamApi";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f127115i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f127116j = 11;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f127117k = 23;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f127118l = "com.google.intent.category.DAYDREAM";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f127119m = "vrContentIntent";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile Boolean f127120n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.vr.vrcore.common.api.d f127121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.vr.vrcore.common.api.b f127122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f127123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f127124d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f127126f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<Runnable> f127125e = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ServiceConnection f127127g = new d();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f127128a;

        a(byte[] bArr) {
            this.f127128a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k.this.f127126f < 11) {
                int unused = k.this.f127126f;
            } else {
                if (k.this.f127122b == null) {
                    return;
                }
                try {
                    k.this.f127122b.Z6(this.f127128a);
                } catch (RemoteException | SecurityException unused2) {
                }
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k.this.f127126f < 11) {
                int unused = k.this.f127126f;
            } else {
                if (k.this.f127122b == null) {
                    return;
                }
                try {
                    k.this.f127122b.k3();
                } catch (RemoteException | SecurityException unused2) {
                }
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            (k.this.f127123c.getApplicationContext() != null ? k.this.f127123c.getApplicationContext() : k.this.f127123c).unbindService(k.this.f127127g);
            k.this.f127121a = null;
        }
    }

    class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            k.this.f127121a = com.google.vr.vrcore.common.api.d.a.p(iBinder);
            try {
                k kVar = k.this;
                kVar.f127122b = kVar.f127121a.h9();
            } catch (RemoteException unused) {
            }
            com.google.vr.vrcore.common.api.b unused2 = k.this.f127122b;
            ArrayList arrayList = k.this.f127125e;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            k.this.f127125e.clear();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            k.this.f127121a = null;
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PendingIntent f127133a;

        e(PendingIntent pendingIntent) {
            this.f127133a = pendingIntent;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k.this.f127122b == null) {
                return;
            }
            try {
                if (this.f127133a != null) {
                    k.this.f127122b.Ha(this.f127133a);
                } else {
                    k.this.f127122b.z8();
                }
            } catch (RemoteException unused) {
            }
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PendingIntent f127135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentName f127136b;

        f(PendingIntent pendingIntent, ComponentName componentName) {
            this.f127135a = pendingIntent;
            this.f127136b = componentName;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k.this.f127122b != null) {
                try {
                    k.this.f127122b.B7(this.f127135a, this.f127136b);
                } catch (RemoteException unused) {
                }
            } else {
                try {
                    this.f127135a.send();
                } catch (Exception unused2) {
                }
            }
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.vr.vrcore.common.api.c f127138a;

        g(com.google.vr.vrcore.common.api.c cVar) {
            this.f127138a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zHf;
            if (k.this.f127122b != null) {
                try {
                    zHf = k.this.f127122b.hf(this.f127138a);
                } catch (RemoteException unused) {
                    zHf = false;
                }
            } else {
                zHf = false;
            }
            if (zHf) {
                return;
            }
            try {
                this.f127138a.I7();
            } catch (RemoteException unused2) {
            }
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k.this.f127122b == null) {
                return;
            }
            try {
                k.this.f127122b.Pe();
            } catch (RemoteException e10) {
                new StringBuilder(String.valueOf(e10).length() + 47);
            }
        }
    }

    class i extends com.google.vr.vrcore.common.api.c.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f127141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ PendingIntent f127142e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f127143f;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    i iVar = i.this;
                    int i10 = 2 << 0;
                    iVar.f127141d.startIntentSenderForResult(iVar.f127142e.getIntentSender(), i.this.f127143f, null, 0, 0, 0);
                } catch (IntentSender.SendIntentException e10) {
                    new StringBuilder(String.valueOf(e10).length() + 43);
                }
            }
        }

        i(k kVar, Activity activity, PendingIntent pendingIntent, int i10) {
            this.f127141d = activity;
            this.f127142e = pendingIntent;
            this.f127143f = i10;
        }

        @Override // com.google.vr.vrcore.common.api.c
        public void I7() {
            this.f127141d.runOnUiThread(new a());
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PendingIntent f127145a;

        j(k kVar, PendingIntent pendingIntent) {
            this.f127145a = pendingIntent;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f127145a.send(0);
            } catch (Exception e10) {
                new StringBuilder(String.valueOf(e10).length() + 31);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.vr.ndk.base.k$k, reason: collision with other inner class name */
    class RunnableC1233k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f127146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PendingIntent f127147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f127148c;

        RunnableC1233k(Runnable runnable, PendingIntent pendingIntent, String str) {
            this.f127146a = runnable;
            this.f127147b = pendingIntent;
            this.f127148c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k.this.f127122b == null) {
                this.f127146a.run();
                return;
            }
            try {
                if (k.this.f127126f < 23) {
                    if (k.this.f127122b.Ke(this.f127147b)) {
                        return;
                    }
                    this.f127146a.run();
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("EXIT_VR_INTENT_KEY", this.f127147b);
                    bundle.putString("EXIT_VR_TEXT_KEY", this.f127148c);
                    if (k.this.f127122b.o3(bundle)) {
                        return;
                    }
                    this.f127146a.run();
                }
            } catch (RemoteException e10) {
                new StringBuilder(String.valueOf(e10).length() + 49);
                this.f127146a.run();
            }
        }
    }

    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f127150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentName f127151b;

        l(boolean z10, ComponentName componentName) {
            this.f127150a = z10;
            this.f127151b = componentName;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("OPTION_INHIBIT_SYSTEM_BUTTONS", this.f127150a);
                k.this.f127121a.q6(this.f127151b, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    protected k(Context context) {
        this.f127123c = context;
    }

    public static boolean H(Context context) {
        return x(context, "daydream_setup", false);
    }

    private void H0(com.google.vr.vrcore.common.api.c cVar) {
        Q0(new g(cVar));
    }

    public static com.google.vr.sdk.proto.nano.a.d I(Context context) {
        com.google.vr.cardboard.a0 a0VarA = com.google.vr.cardboard.b0.a(context);
        try {
            try {
                com.google.vr.sdk.proto.nano.a.d dVarB = a0VarA.b();
                a0VarA.close();
                return dVarB;
            } catch (Exception unused) {
                com.google.vr.sdk.proto.nano.a.d dVar = new com.google.vr.sdk.proto.nano.a.d();
                dVar.f129895c = new com.google.vr.sdk.proto.nano.a.c[0];
                a0VarA.close();
                return dVar;
            }
        } catch (Throwable th2) {
            a0VarA.close();
            throw th2;
        }
    }

    public static boolean R0(Context context, boolean z10) {
        com.google.vr.cardboard.b0.a aVarD = com.google.vr.cardboard.b0.d(context);
        if (aVarD == null) {
            return false;
        }
        Uri uriA = com.google.vr.cardboard.c0.a(aVarD.f126813b, "daydream_setup");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Boolean.valueOf(z10));
            boolean z11 = aVarD.f126812a.update(uriA, contentValues, null, null) > 0;
            aVarD.a();
            return z11;
        } catch (RemoteException unused) {
            aVarD.a();
            return false;
        } catch (SecurityException unused2) {
            aVarD.a();
            return false;
        } catch (Throwable th2) {
            aVarD.a();
            throw th2;
        }
    }

    public static boolean T(Bundle bundle) {
        return bundle.getBoolean(f127119m);
    }

    public static void U0(Context context, boolean z10) {
        com.google.vr.sdk.proto.nano.c.d dVar = new com.google.vr.sdk.proto.nano.c.d();
        dVar.u(!z10 ? 1 : 0);
        com.google.vr.cardboard.a0 a0VarA = com.google.vr.cardboard.b0.a(context);
        try {
            a0VarA.a(dVar);
        } finally {
            a0VarA.close();
        }
    }

    public static boolean Y(Context context) {
        return g0.a(context).f119302w != null && g0.a(context).f119302w.f119312c.booleanValue();
    }

    public static void b1(Bundle bundle) {
        bundle.putBoolean(f127119m, true);
    }

    public static boolean d0(Context context) {
        return x(context, "dashboard_enabled", false);
    }

    @s9.b
    public static Intent d1(Intent intent) {
        intent.addCategory("com.google.intent.category.DAYDREAM");
        intent.addFlags(335609856);
        return intent;
    }

    public static boolean e1(Context context) {
        Boolean bool = g0.a(context).f119299s;
        return bool != null && bool.booleanValue();
    }

    public static boolean f0(Context context) {
        return m.g(context);
    }

    public static boolean g0(Context context) {
        if (m.g(context)) {
            return x(context, "is_in_vr_session", false);
        }
        return false;
    }

    public static boolean j(Context context) {
        if (f127120n == null) {
            f127120n = Boolean.valueOf(x(context, "boots_to_vr", false));
        }
        return f127120n.booleanValue();
    }

    public static boolean j0(Context context) {
        return x(context, "skip_ithaca_pairing_flow", false);
    }

    public static boolean k0(Context context) {
        com.google.vr.cardboard.a0 a0VarA = com.google.vr.cardboard.b0.a(context);
        try {
            com.google.vr.sdk.proto.nano.c.d dVarF = a0VarA.f();
            boolean z10 = dVarF == null || dVarF.s() == 0;
            a0VarA.close();
            return z10;
        } catch (Throwable th2) {
            a0VarA.close();
            throw th2;
        }
    }

    private void l(Intent intent) throws ActivityNotFoundException {
        List<ResolveInfo> listQueryIntentActivities = this.f127123c.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
            String strValueOf = String.valueOf(intent);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 43);
            sb2.append("No activity is available to handle intent: ");
            sb2.append(strValueOf);
            throw new ActivityNotFoundException(sb2.toString());
        }
    }

    private void m() {
        if (this.f127124d) {
            throw new IllegalStateException("DaydreamApi object is closed and can no longer be used.");
        }
    }

    @s9.b
    public static k o(Context context) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("DaydreamApi must only be used from the main thread.");
        }
        if (!m.g(context)) {
            return null;
        }
        k kVar = new k(context);
        if (kVar.X()) {
            return kVar;
        }
        return null;
    }

    public static boolean o0(Context context) {
        com.google.vr.cardboard.a0 a0VarA = com.google.vr.cardboard.b0.a(context);
        try {
            if (a0VarA.d() == null) {
                a0VarA.close();
                return false;
            }
            a0VarA.close();
            return true;
        } catch (Throwable th2) {
            a0VarA.close();
            throw th2;
        }
    }

    @s9.b
    public static Intent q(ComponentName componentName) {
        Intent intent = new Intent();
        intent.setComponent(componentName);
        return d1(intent);
    }

    private void w0(PendingIntent pendingIntent, ComponentName componentName) {
        Q0(new f(pendingIntent, componentName));
    }

    static boolean x(Context context, String str, boolean z10) {
        com.google.vr.cardboard.b0.a aVarD = com.google.vr.cardboard.b0.d(context);
        if (aVarD == null) {
            String strValueOf = String.valueOf(str);
            if (strValueOf.length() != 0) {
                "No ContentProvider available for ".concat(strValueOf);
            }
            return z10;
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = aVarD.f126812a.query(com.google.vr.cardboard.c0.a(aVarD.f126813b, str), null, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    aVarD.a();
                    return z10;
                }
                boolean z11 = cursorQuery.getInt(0) == 1;
                cursorQuery.close();
                aVarD.a();
                return z11;
            } catch (RemoteException unused) {
                new StringBuilder(String.valueOf(str).length() + 42);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                aVarD.a();
                return z10;
            } catch (SecurityException unused2) {
                new StringBuilder(String.valueOf(str).length() + 60);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                aVarD.a();
                return z10;
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            aVarD.a();
            throw th2;
        }
    }

    @s9.b
    public void B0(Activity activity, PendingIntent pendingIntent, int i10) {
        m();
        H0(new i(this, activity, pendingIntent, i10));
    }

    protected com.google.vr.vrcore.common.api.b E() {
        return this.f127122b;
    }

    @s9.b
    public void M0() {
        m();
        Q0(new h());
    }

    public void N(byte[] bArr) {
        Q0(new a(bArr));
    }

    public void O0(PendingIntent pendingIntent) {
        m();
        Q0(new e(pendingIntent));
    }

    protected void Q0(Runnable runnable) {
        if (this.f127121a != null) {
            runnable.run();
        } else {
            this.f127125e.add(runnable);
        }
    }

    public void R() {
        Q0(new b());
    }

    public void T0(ComponentName componentName, boolean z10) {
        m();
        Q0(new l(z10, componentName));
    }

    protected boolean X() {
        try {
            int iD = com.google.vr.vrcore.base.api.d.d(this.f127123c);
            this.f127126f = iD;
            if (iD < 8) {
                return false;
            }
            Intent intent = new Intent("com.google.vr.vrcore.BIND_SDK_SERVICE");
            intent.setPackage("com.google.vr.vrcore");
            if ((this.f127123c.getApplicationContext() != null ? this.f127123c.getApplicationContext() : this.f127123c).bindService(intent, this.f127127g, 1)) {
                return true;
            }
        } catch (com.google.vr.vrcore.base.api.c e10) {
            new StringBuilder(String.valueOf(e10).length() + 22);
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    @s9.b
    public void close() {
        if (this.f127124d) {
            return;
        }
        this.f127124d = true;
        Q0(new c());
    }

    public void g1() {
        m();
        O0(null);
    }

    @s9.b
    public void r(Activity activity, int i10, Intent intent) {
        t(activity, i10, intent, null);
    }

    @s9.b
    public void r0(PendingIntent pendingIntent) {
        m();
        w0(pendingIntent, null);
    }

    public void t(Activity activity, int i10, Intent intent, String str) {
        m();
        if (intent == null) {
            intent = new Intent();
        }
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(i10, intent, 1073741824);
        Q0(new RunnableC1233k(new j(this, pendingIntentCreatePendingResult), pendingIntentCreatePendingResult, str));
    }

    @s9.b
    public void x0(ComponentName componentName) throws ActivityNotFoundException {
        m();
        if (componentName == null) {
            throw new IllegalArgumentException("Null argument 'componentName' passed to launchInVr");
        }
        Intent intentQ = q(componentName);
        l(intentQ);
        w0(PendingIntent.getActivity(this.f127123c, 0, intentQ, 1073741824), intentQ.getComponent());
    }

    public int y() {
        m();
        if (!f0(this.f127123c)) {
            return 0;
        }
        com.google.vr.cardboard.a0 a0VarA = com.google.vr.cardboard.b0.a(this.f127123c);
        try {
            com.google.vr.sdk.proto.nano.a.c cVarD = a0VarA.d();
            if (cVarD == null) {
                a0VarA.close();
                return 0;
            }
            if (m.h(cVarD)) {
                a0VarA.close();
                return 1;
            }
            a0VarA.close();
            return 0;
        } catch (Throwable th2) {
            a0VarA.close();
            throw th2;
        }
    }

    @s9.b
    public void y0(Intent intent) throws ActivityNotFoundException {
        m();
        if (intent == null) {
            throw new IllegalArgumentException("Null argument 'intent' passed to launchInVr");
        }
        l(intent);
        w0(PendingIntent.getActivity(this.f127123c, 0, intent, 1207959552), intent.getComponent());
    }
}
