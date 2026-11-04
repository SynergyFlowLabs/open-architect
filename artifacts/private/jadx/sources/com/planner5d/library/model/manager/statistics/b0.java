package com.planner5d.library.model.manager.statistics;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.planner5d.library.model.manager.statistics.events.h3;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
@ij.f
public class b0 implements x1, d0, k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fg.e<f> f202902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fg.e<i> f202903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kotlin.f0<y> f202904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final fg.e<com.planner5d.library.modules.user.user.t> f202905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fg.e<g> f202906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f202907h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f202908i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<h3> f202909j = new LinkedList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    private final List<String> f202910k = new LinkedList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    private final List<Long> f202911l = new LinkedList();

    @ij.a
    public b0(final fg.e<f> eVar, final fg.e<i> eVar2, fg.e<com.planner5d.library.modules.user.user.t> eVar3, fg.e<g> eVar4) {
        this.f202902c = eVar;
        this.f202903d = eVar2;
        this.f202905f = eVar3;
        this.f202906g = eVar4;
        this.f202904e = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.model.manager.statistics.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b0.c(eVar, eVar2);
            }
        });
    }

    public static /* synthetic */ y c(fg.e eVar, fg.e eVar2) {
        LinkedList linkedList = new LinkedList();
        linkedList.add((y) eVar.get());
        linkedList.add((y) eVar2.get());
        return new y(linkedList);
    }

    private void h() {
        synchronized (this.f202908i) {
            try {
                if (this.f202907h) {
                    return;
                }
                this.f202907h = true;
                List listA = z.a(this.f202909j);
                List listA2 = z.a(this.f202910k);
                List listA3 = z.a(this.f202911l);
                this.f202909j.clear();
                this.f202910k.clear();
                this.f202911l.clear();
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    q((h3) it.next(), false);
                }
                Iterator it2 = listA2.iterator();
                while (it2.hasNext()) {
                    u((String) it2.next(), false);
                }
                Iterator it3 = listA3.iterator();
                while (it3.hasNext()) {
                    w((Long) it3.next(), false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @fj.g
    private g0 p(@fj.h Long l10) {
        return (l10 == null || l10.longValue() == 0) ? g0.a.f217777b : new g0.b(l10.longValue());
    }

    private void q(h3 h3Var, boolean z10) {
        boolean z11;
        synchronized (this.f202908i) {
            try {
                if (!this.f202907h) {
                    this.f202909j.add(h3Var);
                }
                z11 = this.f202907h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f202902c.get().d(h3Var);
        }
        if (z11) {
            this.f202903d.get().d(h3Var);
        }
    }

    private void u(String str, boolean z10) {
        boolean z11;
        synchronized (this.f202908i) {
            try {
                if (!this.f202907h) {
                    this.f202910k.add(str);
                }
                z11 = this.f202907h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h3 h3VarA = this.f202906g.get().a(str);
        if (z10) {
            this.f202902c.get().d(h3VarA);
            this.f202902c.get().h(str);
        }
        if (z11) {
            this.f202903d.get().d(h3VarA);
            this.f202903d.get().h(str);
        }
    }

    private void w(@fj.h Long l10, boolean z10) {
        boolean z11;
        synchronized (this.f202908i) {
            try {
                if (!this.f202907h) {
                    this.f202911l.add(l10);
                }
                z11 = this.f202907h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g0 g0VarP = p(l10);
        if (z10) {
            this.f202902c.get().b(g0VarP);
        }
        if (z11) {
            this.f202903d.get().b(g0VarP);
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.d0
    public void a(@NonNull Class<?> cls) {
        t(cls, null);
    }

    @Override // com.planner5d.library.model.manager.statistics.k
    public void b(Activity activity, @fj.g fd.f fVar, @fj.g com.planner5d.library.model.payments.a aVar, @fj.g String str, @fj.g String str2) {
        String str3;
        String str4;
        boolean z10;
        boolean z11;
        boolean zS;
        fd.i iVarK = fVar.k();
        if (iVarK != null) {
            String strC = iVarK.c();
            String strName = iVarK.f() != null ? iVarK.f().name() : null;
            boolean zR = iVarK.r();
            boolean zU = iVarK.u();
            zS = iVarK.s();
            str4 = strName;
            str3 = strC;
            z10 = zR;
            z11 = zU;
        } else {
            str3 = null;
            str4 = null;
            z10 = false;
            z11 = false;
            zS = false;
        }
        this.f202904e.getValue().g(activity, new j(str3, str4, z10, z11, zS, fVar.a(), fVar.h(), fVar.i(), fVar.g(), aVar.a(), aVar.f222475a, aVar.c()), str, str2);
    }

    @Override // com.planner5d.library.model.manager.statistics.d0
    public void d(h3 h3Var) {
        q(h3Var, true);
    }

    public void f(Activity activity) {
        this.f202904e.getValue().e(activity);
    }

    public void i() {
        this.f202902c.get().f(null);
    }

    public void j(Activity activity) {
        this.f202904e.getValue().b(p(Long.valueOf(this.f202905f.get().e())));
        this.f202904e.getValue().f(activity);
        h();
    }

    public void k(Intent intent) {
        this.f202904e.getValue().c(intent);
    }

    public void l(Activity activity) {
        this.f202904e.getValue().k(activity);
    }

    public void m(Activity activity) {
        this.f202904e.getValue().i(activity);
    }

    public void n() {
        this.f202904e.getValue().m();
    }

    public void o() {
        this.f202904e.getValue().a();
    }

    public void r(SocialAuthType socialAuthType) {
        u("AuthExternal." + socialAuthType.getService() + ".Login", true);
    }

    public void t(Class<?> cls, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cls.getName());
        if (str == null) {
            str2 = "";
        } else {
            str2 = ":" + str;
        }
        sb2.append(str2);
        u(sb2.toString(), true);
    }

    public void v(@fj.h Long l10) {
        w(l10, true);
    }
}
