package com.planner5d.library.widget.editor.helper;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class h2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f256401r = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f256402s = 60;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f256411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f256412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f256413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.facade.e f256414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.facade.f f256415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.facade.e0 f256416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.planner5d.library.widget.editor.facade.v f256417o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f256403a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f256404b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f256405c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f256406d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f256407e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f256408f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f256409g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f256410h = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final com.planner5d.library.widget.preloader.t f256418p = new com.planner5d.library.widget.preloader.t();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.planner5d.library.services.n0 f256419q = new com.planner5d.library.services.n0();

    public h2(com.planner5d.library.widget.editor.facade.e eVar, com.planner5d.library.widget.editor.facade.f fVar, com.planner5d.library.widget.editor.facade.e0 e0Var, com.planner5d.library.widget.editor.facade.v vVar) {
        this.f256414l = eVar;
        this.f256415m = fVar;
        this.f256416n = e0Var;
        this.f256417o = vVar;
    }

    private void c() {
        e(this.f256412j, this.f256413k);
    }

    private void e(Integer num, boolean z10) {
        this.f256412j = num;
        this.f256413k = z10;
        View view = this.f256414l.getView();
        if (view == null) {
            return;
        }
        com.planner5d.library.widget.preloader.h0 h0VarB = this.f256418p.b(view);
        boolean zF = f();
        if (zF != this.f256403a) {
            this.f256403a = zF;
            this.f256416n.n();
        }
        if (!zF) {
            view.setKeepScreenOn(false);
            h0VarB.b();
            com.planner5d.library.activity.helper.ui.d.g(this.f256414l.i(), new com.planner5d.library.activity.helper.ui.b(false), true);
            return;
        }
        view.setKeepScreenOn(true);
        boolean z11 = this.f256407e && !this.f256406d;
        Integer num2 = this.f256408f;
        Context context = view.getContext();
        String string = context.getString(num2 == null ? com.planner5d.library.f.s.sn : num2.intValue());
        if (this.f256411i >= 5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append("\n");
            sb2.append(context.getString(com.planner5d.library.f.s.YH));
            sb2.append(" ");
            Resources resources = context.getResources();
            int i10 = com.planner5d.library.f.q.f168946m;
            long j10 = this.f256411i;
            sb2.append(resources.getQuantityString(i10, (int) j10, Long.valueOf(j10)));
            sb2.append("\n");
            string = sb2.toString();
        }
        if (this.f256415m.D1() && this.f256405c && ((this.f256406d && num != null && num.intValue() != 0) || z10)) {
            h0VarB.b();
            com.planner5d.library.activity.helper.ui.d.f(this.f256414l.i(), new com.planner5d.library.activity.helper.ui.b(true));
            return;
        }
        if (!z11 && num != null) {
            h0VarB.o(string, num);
            com.planner5d.library.activity.helper.ui.d.f(this.f256414l.i(), new com.planner5d.library.activity.helper.ui.b(true));
            return;
        }
        h0VarB.p(string, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit g() {
        long j10 = this.f256409g + 1;
        this.f256409g = j10;
        j(j10, true);
        return Unit.f312394a;
    }

    private void h() {
        long j10 = this.f256409g;
        long j11 = j10 / 60;
        long j12 = this.f256410h;
        if (j11 > j12) {
            this.f256410h = j12 + 1;
            this.f256417o.d("stale_project_loading", String.format(Locale.ROOT, "%d second(s) passed", Long.valueOf(j10)));
        }
    }

    private void j(long j10, boolean z10) {
        this.f256411i = j10;
        if (z10) {
            c();
        }
        h();
    }

    public void b() {
        this.f256419q.b();
        this.f256419q.d(null);
        this.f256409g = 0L;
        int i10 = 1 << 0;
        j(0L, false);
        this.f256410h = 0L;
    }

    public void d(com.planner5d.library.widget.editor.a.b bVar) {
        e(Integer.valueOf(bVar.a()), (bVar instanceof com.planner5d.library.widget.editor.editor3d.model.e.b) && ((com.planner5d.library.widget.editor.editor3d.model.e.b) bVar).f255744d);
    }

    boolean f() {
        return this.f256404b || this.f256406d || this.f256407e;
    }

    void i(boolean z10) {
        this.f256407e = z10;
        k(z10);
    }

    public void k(boolean z10) {
        this.f256404b = z10;
        c();
    }

    public void l(@androidx.annotation.f1 Integer num) {
        this.f256408f = num;
    }

    public void m(boolean z10) {
        this.f256405c = z10;
        k(z10);
    }

    public void n(boolean z10) {
        this.f256406d = z10;
        c();
    }

    public void o() {
        if (this.f256419q.c() == null) {
            this.f256419q.d(new Function0() { // from class: com.planner5d.library.widget.editor.helper.g2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f256376a.g();
                }
            });
        }
        this.f256419q.e(TimeUnit.SECONDS.toMillis(1L));
    }
}
