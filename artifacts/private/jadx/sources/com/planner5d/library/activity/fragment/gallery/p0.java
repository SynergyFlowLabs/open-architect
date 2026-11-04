package com.planner5d.library.activity.fragment.gallery;

import android.graphics.Bitmap;
import android.view.View;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.statistics.events.u2;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.k3;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
public class p0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y0 f133820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b4 f133821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b2 f133822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.planner5d.library.model.h f133823d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.planner5d.library.model.manager.statistics.events.b4.c f133824e;

    class a extends com.planner5d.library.services.bitmaploader.target.a {

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.gallery.p0$a$a, reason: collision with other inner class name */
        class C1469a extends com.planner5d.library.services.rx.e<String> {
            C1469a() {
            }

            @Override // com.planner5d.library.services.rx.e
            public void c(Throwable th2) {
                p0.this.f133822c.e(new com.planner5d.library.model.u(com.planner5d.library.model.u.c.Error, new k3(com.planner5d.library.f.s.Ga, new Object[0]), new com.planner5d.library.model.u.a[0]));
                onCompleted();
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onNext(String str) {
                p0.this.f133822c.b(com.planner5d.library.f.s.BA, str);
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            public void onCompleted() {
                a.this.dispose();
            }
        }

        a() {
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        public void h(Bitmap bitmap) {
            p0.this.f133821b.M0(bitmap).observeOn(com.planner5d.library.services.rx.c.f224934d).subscribe((Subscriber<? super String>) new C1469a());
        }
    }

    @ij.a
    public p0(y0 y0Var, b4 b4Var, b2 b2Var) {
        this.f133820a = y0Var;
        this.f133821b = b4Var;
        this.f133822c = b2Var;
    }

    public p0 c(com.planner5d.library.model.h hVar, com.planner5d.library.model.manager.statistics.events.b4.c cVar) {
        this.f133823d = hVar;
        this.f133824e = cVar;
        return this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        u2.D1(com.planner5d.library.model.manager.statistics.events.b4.a.download, null, Long.valueOf(this.f133823d.f180750l), this.f133824e, null);
        com.planner5d.library.model.h hVar = this.f133823d;
        if (hVar != null) {
            int i10 = 5 & 0;
            this.f133820a.a(0, hVar.c(hVar.a(null)), 0, 0, new a(), -3L, null);
        }
    }
}
