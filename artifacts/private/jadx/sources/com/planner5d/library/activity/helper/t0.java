package com.planner5d.library.activity.helper;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.android.tools.r8.RecordTag;
import com.planner5d.library.activity.fragment.dialog.PermissionExplanation;
import java.util.Objects;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@ij.f
public class t0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f137116d = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f137117a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f137118b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.activity.fragment.dialog.k f137119c;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends RecordTag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Subscriber f137120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f137121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.f1
        private final int f137122c;

        private /* synthetic */ boolean a(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f137122c == aVar.f137122c && Objects.equals(this.f137120a, aVar.f137120a) && Objects.equals(this.f137121b, aVar.f137121b);
        }

        private /* synthetic */ Object[] b() {
            return new Object[]{this.f137120a, this.f137121b, Integer.valueOf(this.f137122c)};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            this.f137120a.onCompleted();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f137120a.onError(new Exception("Permission denied"));
        }

        public final boolean equals(Object obj) {
            return a(obj);
        }

        public final int hashCode() {
            return r0.a(this.f137122c, this.f137120a, this.f137121b);
        }

        @androidx.annotation.f1
        public int i() {
            return this.f137122c;
        }

        public String j() {
            return this.f137121b;
        }

        public Subscriber k() {
            return this.f137120a;
        }

        public final String toString() {
            return s0.a(b(), a.class, "a;b;c");
        }

        private a(Subscriber subscriber, String permission, @androidx.annotation.f1 int explanation) {
            this.f137120a = subscriber;
            this.f137121b = permission;
            this.f137122c = explanation;
        }
    }

    @ij.a
    public t0() {
    }

    private void d(a aVar) {
        a aVar2 = this.f137118b;
        if (aVar2 != null) {
            aVar2.h();
        }
        Activity activity = this.f137117a;
        if (activity == null) {
            this.f137118b = null;
            aVar.h();
        } else {
            this.f137118b = aVar;
            androidx.core.app.b.M(activity, new String[]{aVar.f137121b}, 5);
        }
    }

    private boolean e(String str) {
        Activity activity = this.f137117a;
        return activity != null && androidx.core.content.d.a(activity, str) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(String str, int i10, Subscriber subscriber) {
        o(new a(subscriber, str, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Subscriber subscriber) {
        d(new a(subscriber, str, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(a aVar, Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            aVar.h();
        } else {
            d(aVar);
        }
    }

    private void o(final a aVar) {
        if (e(aVar.f137121b)) {
            aVar.g();
            return;
        }
        if (this.f137117a == null) {
            aVar.h();
        } else if (aVar.f137122c == 0) {
            d(aVar);
        } else {
            this.f137119c.c(PermissionExplanation.class).h(new com.planner5d.library.services.utility.i().f(com.planner5d.library.services.r.explanation, aVar.f137122c).a()).m(new com.planner5d.library.activity.fragment.dialog.u() { // from class: com.planner5d.library.activity.helper.o0
                @Override // com.planner5d.library.activity.fragment.dialog.u
                public final void a(Object obj) {
                    this.f137075a.h(aVar, (Boolean) obj);
                }
            }).g();
        }
    }

    public void i(int i10, String[] strArr, int[] iArr) {
        a aVar;
        if (i10 == 5 && (aVar = this.f137118b) != null) {
            this.f137118b = null;
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0 || strArr == null || strArr.length <= 0 || !aVar.f137121b.equals(strArr[0])) {
                aVar.h();
            } else {
                aVar.g();
            }
        }
    }

    public void j() {
        this.f137117a = null;
    }

    public Observable<Void> k(@NonNull String str) {
        return l(str, 0);
    }

    public Observable<Void> l(@NonNull final String str, @androidx.annotation.f1 final int i10) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.activity.helper.p0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f137080a.f(str, i10, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    public Observable<Void> m(@NonNull final String str) {
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.activity.helper.q0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f137087a.g(str, (Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224934d);
    }

    public void n(Activity activity) {
        this.f137117a = activity;
    }
}
