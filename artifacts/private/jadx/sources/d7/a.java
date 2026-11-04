package d7;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.h;
import androidx.annotation.p0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.n;
import com.google.android.play.core.appupdate.b;
import com.google.android.play.core.appupdate.i;
import com.google.android.play.core.install.InstallState;
import e7.c;
import e7.d;
import e7.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f269679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f269680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f269681c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private int f269682d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @c
    private int f269683e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f269684f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f269685g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private Integer f269686h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f269687i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f269688j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f269689k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f269690l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f269691m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f269692n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    @e7.b
    private Integer f269693o;

    public a(Context context) {
        this.f269679a = new i(context);
        this.f269680b = context;
    }

    private static int E() {
        return 67108864;
    }

    @e
    private final int F() {
        if (!this.f269684f) {
            return 1;
        }
        int i10 = this.f269682d;
        return (i10 == 0 || i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3;
    }

    private final void G() {
        this.f269679a.d(InstallState.f(this.f269682d, this.f269688j, this.f269689k, this.f269683e, this.f269680b.getPackageName()));
    }

    private final boolean H(com.google.android.play.core.appupdate.a aVar, com.google.android.play.core.appupdate.d dVar) {
        if (!aVar.g(dVar) && (!com.google.android.play.core.appupdate.d.c(dVar.b()).equals(dVar) || !aVar.f(dVar.b()))) {
            return false;
        }
        if (dVar.b() == 1) {
            this.f269691m = true;
            this.f269693o = 1;
        } else {
            this.f269690l = true;
            this.f269693o = 0;
        }
        return true;
    }

    public void A(int i10) {
        if (this.f269684f) {
            this.f269687i = i10;
        }
    }

    public void B() {
        if (this.f269690l || this.f269691m) {
            this.f269690l = false;
            this.f269682d = 1;
            Integer num = 0;
            if (num.equals(this.f269693o)) {
                G();
            }
        }
    }

    public void C() {
        int i10 = this.f269682d;
        if (i10 == 1 || i10 == 2) {
            this.f269682d = 6;
            Integer num = 0;
            if (num.equals(this.f269693o)) {
                G();
            }
            this.f269693o = null;
            this.f269691m = false;
            this.f269682d = 0;
        }
    }

    public void D() {
        if (this.f269690l || this.f269691m) {
            this.f269690l = false;
            this.f269691m = false;
            this.f269693o = null;
            this.f269682d = 0;
        }
    }

    @Override // com.google.android.play.core.appupdate.b
    public boolean a(com.google.android.play.core.appupdate.a aVar, h<IntentSenderRequest> hVar, com.google.android.play.core.appupdate.d dVar) {
        return H(aVar, dVar);
    }

    @Override // com.google.android.play.core.appupdate.b
    public boolean b(com.google.android.play.core.appupdate.a aVar, @e7.b int i10, com.google.android.play.core.common.a aVar2, int i11) {
        return H(aVar, com.google.android.play.core.appupdate.d.d(i10).a());
    }

    @Override // com.google.android.play.core.appupdate.b
    public Task<com.google.android.play.core.appupdate.a> c() {
        PendingIntent pendingIntent;
        PendingIntent broadcast;
        PendingIntent broadcast2;
        PendingIntent pendingIntent2;
        PendingIntent broadcast3;
        if (this.f269683e != 0) {
            return n.f(new com.google.android.play.core.install.a(this.f269683e));
        }
        if (F() == 2) {
            if (this.f269681c.contains(0)) {
                broadcast = PendingIntent.getBroadcast(this.f269680b, 0, new Intent(), E());
                broadcast3 = PendingIntent.getBroadcast(this.f269680b, 0, new Intent(), E());
            } else {
                broadcast = null;
                broadcast3 = null;
            }
            if (this.f269681c.contains(1)) {
                PendingIntent broadcast4 = PendingIntent.getBroadcast(this.f269680b, 0, new Intent(), E());
                broadcast2 = PendingIntent.getBroadcast(this.f269680b, 0, new Intent(), E());
                pendingIntent = broadcast4;
            } else {
                pendingIntent = null;
                broadcast2 = null;
            }
            pendingIntent2 = broadcast3;
        } else {
            pendingIntent = null;
            broadcast = null;
            broadcast2 = null;
            pendingIntent2 = null;
        }
        return n.g(com.google.android.play.core.appupdate.a.m(this.f269680b.getPackageName(), this.f269685g, F(), this.f269682d, this.f269686h, this.f269687i, this.f269688j, this.f269689k, 0L, 0L, pendingIntent, broadcast, broadcast2, pendingIntent2, new HashMap()));
    }

    @Override // com.google.android.play.core.appupdate.b
    public final boolean d(com.google.android.play.core.appupdate.a aVar, com.google.android.play.core.common.a aVar2, com.google.android.play.core.appupdate.d dVar, int i10) {
        return H(aVar, dVar);
    }

    @Override // com.google.android.play.core.appupdate.b
    public boolean e(com.google.android.play.core.appupdate.a aVar, @e7.b int i10, Activity activity, int i11) {
        return H(aVar, com.google.android.play.core.appupdate.d.d(i10).a());
    }

    @Override // com.google.android.play.core.appupdate.b
    public final boolean f(com.google.android.play.core.appupdate.a aVar, Activity activity, com.google.android.play.core.appupdate.d dVar, int i10) {
        return H(aVar, dVar);
    }

    @Override // com.google.android.play.core.appupdate.b
    public Task<Void> g() {
        if (this.f269683e != 0) {
            return n.f(new com.google.android.play.core.install.a(this.f269683e));
        }
        int i10 = this.f269682d;
        if (i10 != 11) {
            return i10 == 3 ? n.f(new com.google.android.play.core.install.a(-8)) : n.f(new com.google.android.play.core.install.a(-7));
        }
        this.f269682d = 3;
        this.f269692n = true;
        Integer num = 0;
        if (num.equals(this.f269693o)) {
            G();
        }
        return n.g(null);
    }

    @Override // com.google.android.play.core.appupdate.b
    public void h(com.google.android.play.core.install.b bVar) {
        this.f269679a.b(bVar);
    }

    @Override // com.google.android.play.core.appupdate.b
    public final Task<Integer> i(com.google.android.play.core.appupdate.a aVar, Activity activity, com.google.android.play.core.appupdate.d dVar) {
        return H(aVar, dVar) ? n.g(-1) : n.f(new com.google.android.play.core.install.a(-6));
    }

    @Override // com.google.android.play.core.appupdate.b
    public void j(com.google.android.play.core.install.b bVar) {
        this.f269679a.c(bVar);
    }

    public void k() {
        int i10 = this.f269682d;
        if (i10 == 2 || i10 == 1) {
            this.f269682d = 11;
            this.f269688j = 0L;
            this.f269689k = 0L;
            Integer num = 0;
            if (num.equals(this.f269693o)) {
                G();
                return;
            }
            Integer num2 = 1;
            if (num2.equals(this.f269693o)) {
                g();
            }
        }
    }

    public void l() {
        int i10 = this.f269682d;
        if (i10 == 1 || i10 == 2) {
            this.f269682d = 5;
            Integer num = 0;
            if (num.equals(this.f269693o)) {
                G();
            }
            this.f269693o = null;
            this.f269691m = false;
            this.f269682d = 0;
        }
    }

    public void m() {
        if (this.f269682d == 1) {
            this.f269682d = 2;
            Integer num = 0;
            if (num.equals(this.f269693o)) {
                G();
            }
        }
    }

    @p0
    @e7.b
    public Integer n() {
        return this.f269693o;
    }

    public void o() {
        if (this.f269682d == 3) {
            this.f269682d = 4;
            this.f269684f = false;
            this.f269685g = 0;
            this.f269686h = null;
            this.f269687i = 0;
            this.f269688j = 0L;
            this.f269689k = 0L;
            this.f269691m = false;
            this.f269692n = false;
            Integer num = 0;
            if (num.equals(this.f269693o)) {
                G();
            }
            this.f269693o = null;
            this.f269682d = 0;
        }
    }

    public void p() {
        if (this.f269682d == 3) {
            this.f269682d = 5;
            Integer num = 0;
            if (num.equals(this.f269693o)) {
                G();
            }
            this.f269693o = null;
            this.f269692n = false;
            this.f269691m = false;
            this.f269682d = 0;
        }
    }

    public boolean q() {
        return this.f269690l;
    }

    public boolean r() {
        return this.f269691m;
    }

    public boolean s() {
        return this.f269692n;
    }

    public void t(long j10) {
        if (this.f269682d != 2 || j10 > this.f269689k) {
            return;
        }
        this.f269688j = j10;
        Integer num = 0;
        if (num.equals(this.f269693o)) {
            G();
        }
    }

    public void u(@p0 Integer num) {
        if (this.f269684f) {
            this.f269686h = num;
        }
    }

    public void v(@c int i10) {
        this.f269683e = i10;
    }

    public void w(long j10) {
        if (this.f269682d == 2) {
            this.f269689k = j10;
            Integer num = 0;
            if (num.equals(this.f269693o)) {
                G();
            }
        }
    }

    public void x(int i10) {
        this.f269684f = true;
        this.f269681c.clear();
        int i11 = 3 & 0;
        this.f269681c.add(0);
        this.f269681c.add(1);
        this.f269685g = i10;
    }

    public void y(int i10, @e7.b int i11) {
        this.f269684f = true;
        this.f269681c.clear();
        this.f269681c.add(Integer.valueOf(i11));
        this.f269685g = i10;
    }

    public void z() {
        this.f269684f = false;
        this.f269686h = null;
    }
}
