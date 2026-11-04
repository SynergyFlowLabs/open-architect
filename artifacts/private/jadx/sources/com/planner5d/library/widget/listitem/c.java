package com.planner5d.library.widget.listitem;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.widget.ProfileIconView;

/* JADX INFO: loaded from: classes8.dex */
public class c extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View f258235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView f258236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextView f258237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ImageView f258238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f258239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final TextView f258240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final TextView f258241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.planner5d.library.model.k f258242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final y0 f258243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Point f258244n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f258245o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final j f258246s;

    public c(Context context, com.planner5d.library.services.bitmaploader.target.h hVar, y0 y0Var) {
        super(context, com.planner5d.library.f.m.f168896y7, hVar);
        this.f258242l = null;
        this.f258244n = new Point();
        this.f258245o = new Runnable() { // from class: com.planner5d.library.widget.listitem.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f258234a.t();
            }
        };
        this.f258243m = y0Var;
        this.f258235e = findViewById(com.planner5d.library.f.j.Zd);
        this.f258236f = (ImageView) findViewById(com.planner5d.library.f.j.Jd);
        this.f258237g = (TextView) findViewById(com.planner5d.library.f.j.tv);
        this.f258238h = (ImageView) findViewById(com.planner5d.library.f.j.f168377sc);
        this.f258239i = (TextView) findViewById(com.planner5d.library.f.j.F3);
        this.f258240j = (TextView) findViewById(com.planner5d.library.f.j.f168212lg);
        this.f258241k = (TextView) findViewById(com.planner5d.library.f.j.Qx);
        this.f258246s = new j((ProfileIconView) findViewById(com.planner5d.library.f.j.L3));
    }

    private int s(Boolean bool) {
        if (bool == null) {
            return com.planner5d.library.f.h.f167627k8;
        }
        return bool.booleanValue() ? com.planner5d.library.f.h.f167646l8 : com.planner5d.library.f.h.f167665m8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        u(false);
    }

    private void u(boolean z10) {
        int width = this.f258236f.getWidth();
        int height = this.f258236f.getHeight();
        if (width != 0 && height != 0) {
            this.f258244n.set(width, height);
            n(width);
        } else if (z10) {
            this.f258236f.post(this.f258245o);
        }
    }

    private void v(@NonNull TextView textView, long j10) {
        textView.setVisibility(j10 > 0 ? 0 : 8);
        textView.setText(String.valueOf(j10));
    }

    @Override // com.planner5d.library.widget.listitem.p, com.planner5d.library.widget.d1
    public void a() {
        super.a();
        this.f258246s.c(this.f258285a);
    }

    public View getImageWrapperView() {
        return this.f258235e;
    }

    @Override // com.planner5d.library.widget.listitem.p
    protected com.planner5d.library.services.bitmaploader.d.C1663d q(com.planner5d.library.services.bitmaploader.target.a aVar, int i10) {
        com.planner5d.library.model.k kVar = this.f258242l;
        if (kVar == null) {
            return null;
        }
        com.planner5d.library.model.h hVarB = kVar.b();
        Point point = this.f258244n;
        String strC = hVarB.c(hVarB.a(Integer.valueOf(Math.max(point.x, point.y))));
        y0 y0Var = this.f258243m;
        Point point2 = this.f258244n;
        return y0Var.a(0, strC, point2.y, point2.x, aVar, -3L, null);
    }

    public void setFavoriteOnClickListener(View.OnClickListener onClickListener) {
        this.f258238h.setOnClickListener(onClickListener);
    }

    public void setModel(@NonNull com.planner5d.library.model.k kVar) {
        this.f258242l = kVar;
        com.planner5d.library.model.h hVarB = kVar.b();
        TextView textView = this.f258237g;
        String str = hVarB.f180743e;
        textView.setVisibility((str == null || str.isEmpty()) ? 8 : 0);
        this.f258237g.setText(hVarB.f180743e);
        Boolean boolA = kVar.a();
        this.f258238h.setEnabled(boolA != null);
        this.f258238h.setImageResource(s(boolA));
        this.f258239i.setText(hVarB.f180744f);
        v(this.f258240j, hVarB.f180748j);
        v(this.f258241k, hVarB.f180747i);
        this.f258246s.b(this.f258285a, this.f258243m, hVarB.f180745g);
        u(true);
    }
}
