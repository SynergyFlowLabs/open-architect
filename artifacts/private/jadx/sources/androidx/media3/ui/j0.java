package androidx.media3.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class j0 {
    public static final String P = "androidx.media3.ui.notification.play";
    public static final String Q = "androidx.media3.ui.notification.pause";
    public static final String R = "androidx.media3.ui.notification.prev";
    public static final String S = "androidx.media3.ui.notification.next";
    public static final String T = "androidx.media3.ui.notification.ffwd";
    public static final String U = "androidx.media3.ui.notification.rewind";
    public static final String V = "androidx.media3.ui.notification.stop";
    public static final String W = "INSTANCE_ID";
    private static final String X = "androidx.media3.ui.notification.dismiss";
    private static final int Y = 1;
    private static final int Z = 2;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static int f69890a0;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private int G;
    private boolean H;
    private int I;
    private int J;

    @androidx.annotation.v
    private int K;
    private int L;
    private int M;
    private boolean N;

    @androidx.annotation.p0
    private String O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f69891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f69893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f69894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private final h f69895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private final d f69896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f69897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.core.app.c0 f69898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final IntentFilter f69899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media3.common.z0.g f69900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g f69901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, androidx.core.app.w.b> f69902l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<String, androidx.core.app.w.b> f69903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PendingIntent f69904n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f69905o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.core.app.w.n f69906p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.p0
    private List<androidx.core.app.w.b> f69907q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.p0
    private androidx.media3.common.z0 f69908r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f69909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f69910t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.p0
    private MediaSession.Token f69911u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f69912v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f69913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f69914x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f69915y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f69916z;

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f69917a;

        public void a(Bitmap bitmap) {
            if (bitmap != null) {
                j0.this.s(bitmap, this.f69917a);
            }
        }

        private b(int i10) {
            this.f69917a = i10;
        }
    }

    public interface d {
        Map<String, androidx.core.app.w.b> a(Context context, int i10);

        void b(androidx.media3.common.z0 z0Var, String str, Intent intent);

        List<String> c(androidx.media3.common.z0 z0Var);
    }

    public interface e {
        @androidx.annotation.p0
        Bitmap a(androidx.media3.common.z0 z0Var, b bVar);

        @androidx.annotation.p0
        default CharSequence b(androidx.media3.common.z0 z0Var) {
            return null;
        }

        @androidx.annotation.p0
        CharSequence c(androidx.media3.common.z0 z0Var);

        CharSequence d(androidx.media3.common.z0 z0Var);

        @androidx.annotation.p0
        PendingIntent e(androidx.media3.common.z0 z0Var);
    }

    private static final class f extends androidx.core.app.w.y {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f69937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        private final MediaSession.Token f69938f;

        public f(@androidx.annotation.p0 MediaSession.Token token, int[] iArr) {
            this.f69938f = token;
            this.f69937e = iArr;
        }

        @Override // androidx.core.app.w.y
        public void b(androidx.core.app.t tVar) {
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            mediaStyle.setShowActionsInCompactView(this.f69937e);
            MediaSession.Token token = this.f69938f;
            if (token != null) {
                mediaStyle.setMediaSession(token);
            }
            tVar.a().setStyle(mediaStyle);
        }
    }

    private class g extends BroadcastReceiver {
        private g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            androidx.media3.common.z0 z0Var = j0.this.f69908r;
            if (z0Var != null && j0.this.f69909s && intent.getIntExtra(j0.W, j0.this.f69905o) == j0.this.f69905o) {
                String action = intent.getAction();
                if (j0.P.equals(action)) {
                    androidx.media3.common.util.k1.T0(z0Var);
                    return;
                }
                if (j0.Q.equals(action)) {
                    androidx.media3.common.util.k1.S0(z0Var);
                    return;
                }
                if (j0.R.equals(action)) {
                    if (z0Var.P0(7)) {
                        z0Var.I1();
                        return;
                    }
                    return;
                }
                if (j0.U.equals(action)) {
                    if (z0Var.P0(11)) {
                        z0Var.t2();
                        return;
                    }
                    return;
                }
                if (j0.T.equals(action)) {
                    if (z0Var.P0(12)) {
                        z0Var.t1();
                        return;
                    }
                    return;
                }
                if (j0.S.equals(action)) {
                    if (z0Var.P0(9)) {
                        z0Var.X1();
                        return;
                    }
                    return;
                }
                if (j0.V.equals(action)) {
                    if (z0Var.P0(3)) {
                        z0Var.stop();
                    }
                    if (z0Var.P0(20)) {
                        z0Var.z1();
                        return;
                    }
                    return;
                }
                if (j0.X.equals(action)) {
                    j0.this.Q(true);
                } else {
                    if (action == null || j0.this.f69896f == null || !j0.this.f69903m.containsKey(action)) {
                        return;
                    }
                    j0.this.f69896f.b(z0Var, action, intent);
                }
            }
        }
    }

    public interface h {
        default void a(int i10, Notification notification, boolean z10) {
        }

        default void b(int i10, boolean z10) {
        }
    }

    private class i implements androidx.media3.common.z0.g {
        private i() {
        }

        @Override // androidx.media3.common.z0.g
        public void S(androidx.media3.common.z0 z0Var, androidx.media3.common.z0.f fVar) {
            if (fVar.b(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                j0.this.r();
            }
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    protected j0(Context context, String str, int i10, e eVar, @androidx.annotation.p0 h hVar, @androidx.annotation.p0 d dVar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, @androidx.annotation.p0 String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f69891a = applicationContext;
        this.f69892b = str;
        this.f69893c = i10;
        this.f69894d = eVar;
        this.f69895e = hVar;
        this.f69896f = dVar;
        this.K = i11;
        this.O = str2;
        int i19 = f69890a0;
        f69890a0 = i19 + 1;
        this.f69905o = i19;
        this.f69897g = androidx.media3.common.util.k1.G(Looper.getMainLooper(), new Handler.Callback() { // from class: androidx.media3.ui.i0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f69887a.p(message);
            }
        });
        this.f69898h = androidx.core.app.c0.q(applicationContext);
        this.f69900j = new i();
        this.f69901k = new g();
        this.f69899i = new IntentFilter();
        this.f69912v = true;
        this.f69913w = true;
        this.D = true;
        this.E = true;
        this.f69916z = true;
        this.A = true;
        this.H = true;
        this.N = true;
        this.J = 0;
        this.I = 0;
        this.M = -1;
        this.G = 1;
        this.L = 1;
        Map<String, androidx.core.app.w.b> mapL = l(applicationContext, i19, i12, i13, i14, i15, i16, i17, i18);
        this.f69902l = mapL;
        Iterator<String> it = mapL.keySet().iterator();
        while (it.hasNext()) {
            this.f69899i.addAction(it.next());
        }
        Map<String, androidx.core.app.w.b> mapA = dVar != null ? dVar.a(applicationContext, this.f69905o) : Collections.EMPTY_MAP;
        this.f69903m = mapA;
        Iterator<String> it2 = mapA.keySet().iterator();
        while (it2.hasNext()) {
            this.f69899i.addAction(it2.next());
        }
        this.f69904n = j(X, applicationContext, this.f69905o);
        this.f69899i.addAction(X);
    }

    @e.a({"MissingPermission"})
    private void P(androidx.media3.common.z0 z0Var, @androidx.annotation.p0 Bitmap bitmap) {
        boolean zO = o(z0Var);
        androidx.core.app.w.n nVarK = k(z0Var, this.f69906p, zO, bitmap);
        this.f69906p = nVarK;
        if (nVarK == null) {
            Q(false);
            return;
        }
        Notification notificationH = nVarK.h();
        this.f69898h.F(this.f69893c, notificationH);
        if (!this.f69909s) {
            androidx.media3.common.util.k1.S1(this.f69891a, this.f69901k, this.f69899i);
        }
        h hVar = this.f69895e;
        if (hVar != null) {
            hVar.a(this.f69893c, notificationH, zO || !this.f69909s);
        }
        this.f69909s = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(boolean z10) {
        if (this.f69909s) {
            this.f69909s = false;
            this.f69897g.removeMessages(1);
            this.f69898h.c(this.f69893c);
            this.f69891a.unregisterReceiver(this.f69901k);
            h hVar = this.f69895e;
            if (hVar != null) {
                hVar.b(this.f69893c, z10);
            }
        }
    }

    private static PendingIntent j(String str, Context context, int i10) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(W, i10);
        return PendingIntent.getBroadcast(context, i10, intent, androidx.media3.common.util.k1.f61540a >= 23 ? 201326592 : androidx.media3.common.j.W0);
    }

    private static Map<String, androidx.core.app.w.b> l(Context context, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        HashMap map = new HashMap();
        map.put(P, new androidx.core.app.w.b(i11, context.getString(v0.k.f70375l), j(P, context, i10)));
        map.put(Q, new androidx.core.app.w.b(i12, context.getString(v0.k.f70374k), j(Q, context, i10)));
        map.put(V, new androidx.core.app.w.b(i13, context.getString(v0.k.f70387x), j(V, context, i10)));
        map.put(U, new androidx.core.app.w.b(i14, context.getString(v0.k.f70381r), j(U, context, i10)));
        map.put(T, new androidx.core.app.w.b(i15, context.getString(v0.k.f70367d), j(T, context, i10)));
        map.put(R, new androidx.core.app.w.b(i16, context.getString(v0.k.f70377n), j(R, context, i10)));
        map.put(S, new androidx.core.app.w.b(i17, context.getString(v0.k.f70371h), j(S, context, i10)));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            androidx.media3.common.z0 z0Var = this.f69908r;
            if (z0Var != null) {
                P(z0Var, null);
            }
        } else {
            if (i10 != 2) {
                return false;
            }
            androidx.media3.common.z0 z0Var2 = this.f69908r;
            if (z0Var2 != null && this.f69909s && this.f69910t == message.arg1) {
                P(z0Var2, (Bitmap) message.obj);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.f69897g.hasMessages(1)) {
            return;
        }
        this.f69897g.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(Bitmap bitmap, int i10) {
        this.f69897g.obtainMessage(2, i10, -1, bitmap).sendToTarget();
    }

    private static void x(androidx.core.app.w.n nVar, @androidx.annotation.p0 Bitmap bitmap) {
        nVar.b0(bitmap);
    }

    public final void A(int i10) {
        if (this.M == i10) {
            return;
        }
        if (i10 != -2 && i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        this.M = i10;
        q();
    }

    public void B(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            q();
        }
    }

    public final void C(@androidx.annotation.v int i10) {
        if (this.K != i10) {
            this.K = i10;
            q();
        }
    }

    public final void D(boolean z10) {
        if (this.N != z10) {
            this.N = z10;
            q();
        }
    }

    public final void E(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            q();
        }
    }

    public final void F(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            if (z10) {
                this.f69915y = false;
            }
            q();
        }
    }

    public final void G(boolean z10) {
        if (this.f69913w != z10) {
            this.f69913w = z10;
            q();
        }
    }

    public final void H(boolean z10) {
        if (this.f69915y != z10) {
            this.f69915y = z10;
            if (z10) {
                this.C = false;
            }
            q();
        }
    }

    public final void I(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            q();
        }
    }

    public final void J(boolean z10) {
        if (this.f69912v != z10) {
            this.f69912v = z10;
            q();
        }
    }

    public final void K(boolean z10) {
        if (this.f69914x != z10) {
            this.f69914x = z10;
            if (z10) {
                this.B = false;
            }
            q();
        }
    }

    public final void L(boolean z10) {
        if (this.f69916z != z10) {
            this.f69916z = z10;
            q();
        }
    }

    public final void M(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
            if (z10) {
                this.f69914x = false;
            }
            q();
        }
    }

    public final void N(boolean z10) {
        if (this.F == z10) {
            return;
        }
        this.F = z10;
        q();
    }

    public final void O(int i10) {
        if (this.L == i10) {
            return;
        }
        if (i10 != -1 && i10 != 0 && i10 != 1) {
            throw new IllegalStateException();
        }
        this.L = i10;
        q();
    }

    @androidx.annotation.p0
    protected androidx.core.app.w.n k(androidx.media3.common.z0 z0Var, @androidx.annotation.p0 androidx.core.app.w.n nVar, boolean z10, @androidx.annotation.p0 Bitmap bitmap) {
        if (z0Var.H() == 1 && z0Var.P0(17) && z0Var.c0().w()) {
            this.f69907q = null;
            return null;
        }
        List<String> listN = n(z0Var);
        ArrayList arrayList = new ArrayList(listN.size());
        for (int i10 = 0; i10 < listN.size(); i10++) {
            String str = listN.get(i10);
            androidx.core.app.w.b bVar = this.f69902l.containsKey(str) ? this.f69902l.get(str) : this.f69903m.get(str);
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        if (nVar == null || !arrayList.equals(this.f69907q)) {
            nVar = new androidx.core.app.w.n(this.f69891a, this.f69892b);
            this.f69907q = arrayList;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                nVar.b((androidx.core.app.w.b) arrayList.get(i11));
            }
        }
        nVar.z0(new f(this.f69911u, m(listN, z0Var)));
        nVar.T(this.f69904n);
        nVar.D(this.G).i0(z10).I(this.J).J(this.H).t0(this.K).G0(this.L).k0(this.M).S(this.I);
        if (this.N && z0Var.P0(16) && z0Var.isPlaying() && !z0Var.x() && !z0Var.T1() && z0Var.c().f61874a == 1.0f) {
            nVar.H0(System.currentTimeMillis() - z0Var.n0()).r0(true).E0(true);
        } else {
            nVar.r0(false).E0(false);
        }
        nVar.O(this.f69894d.d(z0Var));
        nVar.N(this.f69894d.c(z0Var));
        nVar.A0(this.f69894d.b(z0Var));
        if (bitmap == null) {
            e eVar = this.f69894d;
            int i12 = this.f69910t + 1;
            this.f69910t = i12;
            bitmap = eVar.a(z0Var, new b(i12));
        }
        x(nVar, bitmap);
        nVar.M(this.f69894d.e(z0Var));
        String str2 = this.O;
        if (str2 != null) {
            nVar.Y(str2);
        }
        nVar.j0(true);
        return nVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    protected int[] m(List<String> list, androidx.media3.common.z0 z0Var) {
        int iIndexOf;
        int iIndexOf2;
        int i10;
        int iIndexOf3 = list.indexOf(Q);
        int iIndexOf4 = list.indexOf(P);
        if (this.f69914x) {
            iIndexOf = list.indexOf(R);
        } else {
            iIndexOf = this.B ? list.indexOf(U) : -1;
        }
        if (this.f69915y) {
            iIndexOf2 = list.indexOf(S);
        } else {
            iIndexOf2 = this.C ? list.indexOf(T) : -1;
        }
        int[] iArr = new int[3];
        int i11 = 0;
        if (iIndexOf != -1) {
            iArr[0] = iIndexOf;
            i11 = 1;
        }
        boolean zI2 = androidx.media3.common.util.k1.i2(z0Var, this.E);
        if (iIndexOf3 == -1 || zI2) {
            if (iIndexOf4 != -1 && zI2) {
                i10 = i11 + 1;
                iArr[i11] = iIndexOf4;
            }
            if (iIndexOf2 != -1) {
                iArr[i11] = iIndexOf2;
                i11++;
            }
            return Arrays.copyOf(iArr, i11);
        }
        i10 = i11 + 1;
        iArr[i11] = iIndexOf3;
        i11 = i10;
        if (iIndexOf2 != -1) {
            iArr[i11] = iIndexOf2;
            i11++;
        }
        return Arrays.copyOf(iArr, i11);
    }

    protected List<String> n(androidx.media3.common.z0 z0Var) {
        boolean zP0 = z0Var.P0(7);
        boolean zP1 = z0Var.P0(11);
        boolean zP2 = z0Var.P0(12);
        boolean zP3 = z0Var.P0(9);
        ArrayList arrayList = new ArrayList();
        if (this.f69912v && zP0) {
            arrayList.add(R);
        }
        if (this.f69916z && zP1) {
            arrayList.add(U);
        }
        if (this.D) {
            if (androidx.media3.common.util.k1.i2(z0Var, this.E)) {
                arrayList.add(P);
            } else {
                arrayList.add(Q);
            }
        }
        if (this.A && zP2) {
            arrayList.add(T);
        }
        if (this.f69913w && zP3) {
            arrayList.add(S);
        }
        d dVar = this.f69896f;
        if (dVar != null) {
            arrayList.addAll(dVar.c(z0Var));
        }
        if (this.F) {
            arrayList.add(V);
        }
        return arrayList;
    }

    protected boolean o(androidx.media3.common.z0 z0Var) {
        int iH = z0Var.H();
        if (iH != 2) {
            int i10 = 5 >> 3;
            if (iH != 3) {
                return false;
            }
        }
        return z0Var.J();
    }

    public final void q() {
        if (this.f69909s) {
            r();
        }
    }

    public final void t(int i10) {
        if (this.G == i10) {
            return;
        }
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        this.G = i10;
        q();
    }

    public final void u(int i10) {
        if (this.J != i10) {
            this.J = i10;
            q();
        }
    }

    public final void v(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            q();
        }
    }

    public final void w(int i10) {
        if (this.I != i10) {
            this.I = i10;
            q();
        }
    }

    public final void y(MediaSession.Token token) {
        if (Objects.equals(this.f69911u, token)) {
            return;
        }
        this.f69911u = token;
        q();
    }

    public final void z(@androidx.annotation.p0 androidx.media3.common.z0 z0Var) {
        boolean z10 = true;
        androidx.media3.common.util.a.i(Looper.myLooper() == Looper.getMainLooper());
        if (z0Var != null && z0Var.d0() != Looper.getMainLooper()) {
            z10 = false;
        }
        androidx.media3.common.util.a.a(z10);
        androidx.media3.common.z0 z0Var2 = this.f69908r;
        if (z0Var2 == z0Var) {
            return;
        }
        if (z0Var2 != null) {
            z0Var2.Q1(this.f69900j);
            if (z0Var == null) {
                Q(false);
            }
        }
        this.f69908r = z0Var;
        if (z0Var != null) {
            z0Var.U1(this.f69900j);
            r();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Context f69919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final int f69920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final String f69921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        protected h f69922d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        protected d f69923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected e f69924f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected int f69925g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected int f69926h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected int f69927i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        protected int f69928j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        protected int f69929k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        protected int f69930l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        protected int f69931m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected int f69932n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        protected int f69933o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        protected int f69934p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        protected int f69935q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @androidx.annotation.p0
        protected String f69936r;

        @Deprecated
        public c(Context context, int i10, String str, e eVar) {
            this(context, i10, str);
            this.f69924f = eVar;
        }

        public j0 a() {
            int i10 = this.f69925g;
            if (i10 != 0) {
                androidx.media3.common.util.l0.a(this.f69919a, this.f69921c, i10, this.f69926h, this.f69927i);
            }
            return new j0(this.f69919a, this.f69921c, this.f69920b, this.f69924f, this.f69922d, this.f69923e, this.f69928j, this.f69930l, this.f69931m, this.f69932n, this.f69929k, this.f69933o, this.f69934p, this.f69935q, this.f69936r);
        }

        public c b(int i10) {
            this.f69926h = i10;
            return this;
        }

        public c c(int i10) {
            this.f69927i = i10;
            return this;
        }

        public c d(int i10) {
            this.f69925g = i10;
            return this;
        }

        public c e(d dVar) {
            this.f69923e = dVar;
            return this;
        }

        public c f(int i10) {
            this.f69933o = i10;
            return this;
        }

        public c g(String str) {
            this.f69936r = str;
            return this;
        }

        public c h(e eVar) {
            this.f69924f = eVar;
            return this;
        }

        public c i(int i10) {
            this.f69935q = i10;
            return this;
        }

        public c j(h hVar) {
            this.f69922d = hVar;
            return this;
        }

        public c k(int i10) {
            this.f69931m = i10;
            return this;
        }

        public c l(int i10) {
            this.f69930l = i10;
            return this;
        }

        public c m(int i10) {
            this.f69934p = i10;
            return this;
        }

        public c n(int i10) {
            this.f69929k = i10;
            return this;
        }

        public c o(int i10) {
            this.f69928j = i10;
            return this;
        }

        public c p(int i10) {
            this.f69932n = i10;
            return this;
        }

        public c(Context context, @androidx.annotation.g0(from = 1) int i10, String str) {
            androidx.media3.common.util.a.a(i10 > 0);
            this.f69919a = context;
            this.f69920b = i10;
            this.f69921c = str;
            this.f69927i = 2;
            this.f69924f = new androidx.media3.ui.c(null);
            this.f69928j = v0.e.f70216c0;
            this.f69930l = v0.e.Z;
            this.f69931m = v0.e.Y;
            this.f69932n = v0.e.f70218d0;
            this.f69929k = v0.e.f70214b0;
            this.f69933o = v0.e.W;
            this.f69934p = v0.e.f70212a0;
            this.f69935q = v0.e.X;
        }
    }
}
