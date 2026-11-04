package com.planner5d.library.services.licensing;

import android.app.Activity;
import com.google.android.vending.licensing.f;
import com.google.android.vending.licensing.g;
import com.google.android.vending.licensing.o;
import com.google.android.vending.licensing.p;
import com.planner5d.library.services.exceptions.ErrorMessageException;

/* JADX INFO: loaded from: classes10.dex */
public class c implements com.planner5d.library.services.licensing.a<f> {

    class a implements g {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f224422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Activity f224423h;

        a(b bVar, Activity activity) {
            this.f224422g = bVar;
            this.f224423h = activity;
        }

        @Override // com.google.android.vending.licensing.g
        public void a(int i10) {
            this.f224422g.c();
        }

        @Override // com.google.android.vending.licensing.g
        public void b(int i10) {
            if (i10 == 291) {
                this.f224422g.a();
            } else {
                this.f224422g.b(new ErrorMessageException(com.planner5d.library.f.s.f169585z9, this.f224423h.getString(com.planner5d.library.f.s.K1)));
            }
        }

        @Override // com.google.android.vending.licensing.g
        public void c(int i10) {
            this.f224422g.b(new ErrorMessageException(com.planner5d.library.f.s.f169537x9, String.valueOf(i10)));
        }
    }

    @Override // com.planner5d.library.services.licensing.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(f fVar) {
        fVar.m();
    }

    @Override // com.planner5d.library.services.licensing.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public f b(Activity activity, String str, com.planner5d.library.application.d dVar, p pVar, b bVar) {
        f fVar = new f(activity, new o(activity, new com.google.android.vending.licensing.a("XXv#sdo987cv9672@#$XCDVBasd54xcxd798as3xc76aSv".getBytes(), activity.getPackageName(), str)), dVar.c(), pVar);
        fVar.f(new a(bVar, activity));
        return fVar;
    }
}
