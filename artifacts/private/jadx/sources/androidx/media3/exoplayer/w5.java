package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
final class w5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f66665g = "StreamVolumeManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f66666h = "android.media.VOLUME_CHANGED_ACTION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f66667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f66668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.common.util.g<c> f66669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioManager f66670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private d f66671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f66672f;

    public interface b {
        void u(int i10);

        void z(int i10, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f66674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f66675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f66676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f66677e;

        public c(int i10, int i11, boolean z10, int i12, int i13) {
            this.f66673a = i10;
            this.f66674b = i11;
            this.f66675c = z10;
            this.f66676d = i12;
            this.f66677e = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d extends BroadcastReceiver {
        private d() {
        }

        public static /* synthetic */ void a(d dVar) {
            if (w5.this.f66671e == null) {
                return;
            }
            w5.this.f66669c.f(w5.this.s(((c) w5.this.f66669c.d()).f66673a));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            w5.this.f66669c.e(new Runnable() { // from class: androidx.media3.exoplayer.x5
                @Override // java.lang.Runnable
                public final void run() {
                    w5.d.a(this.f66691a);
                }
            });
        }
    }

    public w5(Context context, b bVar, final int i10, Looper looper, Looper looper2, androidx.media3.common.util.j jVar) {
        this.f66667a = context.getApplicationContext();
        this.f66668b = bVar;
        int i11 = 4 | 0;
        androidx.media3.common.util.g<c> gVar = new androidx.media3.common.util.g<>(new c(i10, 0, false, 0, 0), looper, looper2, jVar, new androidx.media3.common.util.g.a() { // from class: androidx.media3.exoplayer.i5
            @Override // androidx.media3.common.util.g.a
            public final void a(Object obj, Object obj2) {
                this.f63865a.y((w5.c) obj, (w5.c) obj2);
            }
        });
        this.f66669c = gVar;
        gVar.e(new Runnable() { // from class: androidx.media3.exoplayer.n5
            @Override // java.lang.Runnable
            public final void run() {
                w5.m(this.f64333a, i10);
            }
        });
    }

    public static /* synthetic */ c a(w5 w5Var, boolean z10, c cVar) {
        int i10;
        w5Var.getClass();
        int i11 = cVar.f66673a;
        if (cVar.f66675c == z10) {
            i10 = cVar.f66674b;
        } else {
            i10 = z10 ? 0 : w5Var.f66672f;
        }
        return new c(i11, i10, z10, cVar.f66676d, cVar.f66677e);
    }

    public static /* synthetic */ c b(int i10, c cVar) {
        return new c(i10, cVar.f66674b, cVar.f66675c, cVar.f66676d, cVar.f66677e);
    }

    public static /* synthetic */ c c(c cVar) {
        return cVar;
    }

    public static /* synthetic */ c d(int i10, c cVar) {
        int i11 = cVar.f66673a;
        int i12 = cVar.f66676d;
        return new c(i11, (i10 < i12 || i10 > cVar.f66677e) ? cVar.f66674b : i10, i10 == 0, i12, cVar.f66677e);
    }

    public static /* synthetic */ c e(c cVar) {
        int i10 = cVar.f66673a;
        int i11 = cVar.f66674b;
        int i12 = cVar.f66676d;
        return new c(i10, i11 > i12 ? i11 - 1 : i12, i11 <= 1, i12, cVar.f66677e);
    }

    public static /* synthetic */ c f(w5 w5Var, int i10, c cVar) {
        w5Var.getClass();
        if (cVar.f66674b <= cVar.f66676d) {
            return cVar;
        }
        ((AudioManager) androidx.media3.common.util.a.g(w5Var.f66670d)).adjustStreamVolume(cVar.f66673a, -1, i10);
        return w5Var.s(cVar.f66673a);
    }

    public static /* synthetic */ c g(w5 w5Var, int i10, int i11, c cVar) {
        w5Var.getClass();
        if (i10 == cVar.f66674b || i10 < cVar.f66676d || i10 > cVar.f66677e) {
            return cVar;
        }
        ((AudioManager) androidx.media3.common.util.a.g(w5Var.f66670d)).setStreamVolume(cVar.f66673a, i10, i11);
        return w5Var.s(cVar.f66673a);
    }

    public static /* synthetic */ c h(w5 w5Var, int i10, c cVar) {
        w5Var.getClass();
        return cVar.f66673a == i10 ? cVar : w5Var.s(i10);
    }

    public static /* synthetic */ c i(w5 w5Var, c cVar) {
        d dVar = w5Var.f66671e;
        if (dVar != null) {
            try {
                w5Var.f66667a.unregisterReceiver(dVar);
            } catch (RuntimeException e10) {
                androidx.media3.common.util.z.o(f66665g, "Error unregistering stream volume receiver", e10);
            }
            w5Var.f66671e = null;
        }
        return cVar;
    }

    public static /* synthetic */ c j(w5 w5Var, boolean z10, int i10, c cVar) {
        w5Var.getClass();
        if (cVar.f66675c == z10) {
            return cVar;
        }
        androidx.media3.common.util.a.g(w5Var.f66670d);
        if (androidx.media3.common.util.k1.f61540a >= 23) {
            w5Var.f66670d.adjustStreamVolume(cVar.f66673a, z10 ? -100 : 100, i10);
        } else {
            w5Var.f66670d.setStreamMute(cVar.f66673a, z10);
        }
        return w5Var.s(cVar.f66673a);
    }

    public static /* synthetic */ c k(w5 w5Var, int i10, c cVar) {
        w5Var.getClass();
        if (cVar.f66674b >= cVar.f66677e) {
            return cVar;
        }
        ((AudioManager) androidx.media3.common.util.a.g(w5Var.f66670d)).adjustStreamVolume(cVar.f66673a, 1, i10);
        return w5Var.s(cVar.f66673a);
    }

    public static /* synthetic */ void m(w5 w5Var, int i10) {
        w5Var.f66670d = (AudioManager) androidx.media3.common.util.a.k((AudioManager) w5Var.f66667a.getSystemService("audio"));
        d dVar = new d();
        try {
            w5Var.f66667a.registerReceiver(dVar, new IntentFilter(f66666h));
            w5Var.f66671e = dVar;
        } catch (RuntimeException e10) {
            androidx.media3.common.util.z.o(f66665g, "Error registering stream volume receiver", e10);
        }
        w5Var.f66669c.f(w5Var.s(i10));
    }

    public static /* synthetic */ c n(c cVar) {
        int i10 = cVar.f66673a;
        int i11 = cVar.f66674b;
        int i12 = cVar.f66677e;
        return new c(i10, i11 < i12 ? i11 + 1 : i12, false, cVar.f66676d, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c s(int i10) {
        androidx.media3.common.util.a.g(this.f66670d);
        return new c(i10, androidx.media3.common.audio.d.f(this.f66670d, i10), androidx.media3.common.audio.d.g(this.f66670d, i10), androidx.media3.common.audio.d.e(this.f66670d, i10), androidx.media3.common.audio.d.d(this.f66670d, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(c cVar, c cVar2) {
        boolean z10 = cVar.f66675c;
        if (!z10 && cVar2.f66675c) {
            this.f66672f = cVar.f66674b;
        }
        int i10 = cVar.f66674b;
        int i11 = cVar2.f66674b;
        if (i10 != i11 || z10 != cVar2.f66675c) {
            this.f66668b.z(i11, cVar2.f66675c);
        }
        int i12 = cVar.f66673a;
        int i13 = cVar2.f66673a;
        if (i12 == i13 && cVar.f66676d == cVar2.f66676d && cVar.f66677e == cVar2.f66677e) {
            return;
        }
        this.f66668b.u(i13);
    }

    @e.a({"WrongConstant"})
    public void A(final boolean z10, final int i10) {
        this.f66669c.g(new com.google.common.base.t() { // from class: androidx.media3.exoplayer.u5
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return w5.a(this.f65837a, z10, (w5.c) obj);
            }
        }, new com.google.common.base.t() { // from class: androidx.media3.exoplayer.v5
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return w5.j(this.f66224a, z10, i10, (w5.c) obj);
            }
        });
    }

    public void B(final int i10) {
        this.f66669c.g(new com.google.common.base.t() { // from class: androidx.media3.exoplayer.s5
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return w5.b(i10, (w5.c) obj);
            }
        }, new com.google.common.base.t() { // from class: androidx.media3.exoplayer.t5
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return w5.h(this.f65611a, i10, (w5.c) obj);
            }
        });
    }

    @e.a({"WrongConstant"})
    public void C(final int i10, final int i11) {
        this.f66669c.g(new com.google.common.base.t() { // from class: androidx.media3.exoplayer.q5
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return w5.d(i10, (w5.c) obj);
            }
        }, new com.google.common.base.t() { // from class: androidx.media3.exoplayer.r5
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return w5.g(this.f64658a, i10, i11, (w5.c) obj);
            }
        });
    }

    @e.a({"WrongConstant"})
    public void r(final int i10) {
        this.f66669c.g(new com.google.common.base.t() { // from class: androidx.media3.exoplayer.o5
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return w5.e((w5.c) obj);
            }
        }, new com.google.common.base.t() { // from class: androidx.media3.exoplayer.p5
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return w5.f(this.f64604a, i10, (w5.c) obj);
            }
        });
    }

    public int t() {
        return this.f66669c.d().f66677e;
    }

    public int u() {
        return this.f66669c.d().f66676d;
    }

    public int v() {
        return this.f66669c.d().f66674b;
    }

    @e.a({"WrongConstant"})
    public void w(final int i10) {
        this.f66669c.g(new com.google.common.base.t() { // from class: androidx.media3.exoplayer.l5
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return w5.n((w5.c) obj);
            }
        }, new com.google.common.base.t() { // from class: androidx.media3.exoplayer.m5
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return w5.k(this.f64039a, i10, (w5.c) obj);
            }
        });
    }

    public boolean x() {
        return this.f66669c.d().f66675c;
    }

    public void z() {
        this.f66669c.g(new com.google.common.base.t() { // from class: androidx.media3.exoplayer.j5
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return w5.c((w5.c) obj);
            }
        }, new com.google.common.base.t() { // from class: androidx.media3.exoplayer.k5
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return w5.i(this.f63957a, (w5.c) obj);
            }
        });
    }
}
