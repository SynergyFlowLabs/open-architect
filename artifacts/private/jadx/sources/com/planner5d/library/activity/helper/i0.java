package com.planner5d.library.activity.helper;

import android.app.Activity;
import android.provider.Settings;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
@ij.f
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.planner5d.library.application.d f136899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.modules.user.user.t0 f136900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.model.manager.payments.p f136901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Activity f136902d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f136903e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f136904f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.services.licensing.a f136905g;

    class a implements com.planner5d.library.services.licensing.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Subscriber f136906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f136907b;

        a(Subscriber subscriber, Activity activity) {
            this.f136906a = subscriber;
            this.f136907b = activity;
        }

        @Override // com.planner5d.library.services.licensing.b
        public void a() {
            this.f136906a.onError(new ErrorMessageException(com.planner5d.library.f.s.f169561y9, new String[0]));
        }

        @Override // com.planner5d.library.services.licensing.b
        public void b(ErrorMessageException errorMessageException) {
            synchronized (i0.this.f136904f) {
                try {
                    if (this.f136907b != i0.this.f136902d) {
                        a();
                    } else {
                        this.f136906a.onError(errorMessageException);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.planner5d.library.services.licensing.b
        public void c() {
            i0.this.f136900b.f0(true);
            this.f136906a.onNext(null);
            this.f136906a.onCompleted();
        }
    }

    @ij.a
    public i0(com.planner5d.library.modules.user.user.t0 t0Var, com.planner5d.library.application.d dVar, com.planner5d.library.services.licensing.a<?> aVar, com.planner5d.library.model.manager.payments.p pVar) {
        this.f136901c = pVar;
        this.f136900b = t0Var;
        this.f136899a = dVar;
        this.f136905g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Subscriber subscriber) {
        if (this.f136899a.d() != zc.a.None) {
            h(subscriber);
            return;
        }
        this.f136900b.f0(true);
        subscriber.onNext(null);
        subscriber.onCompleted();
    }

    private void h(Subscriber<? super Void> subscriber) {
        synchronized (this.f136904f) {
            try {
                Activity activity = this.f136902d;
                if (activity == null) {
                    subscriber.onError(new Exception("Activity is missing"));
                } else {
                    String string = Settings.Secure.getString(activity.getContentResolver(), "android_id");
                    this.f136903e = this.f136905g.b(activity, string, this.f136899a, new com.planner5d.library.services.licensing.e(this.f136901c, string), new a(subscriber, activity));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        synchronized (this.f136904f) {
            try {
                this.f136902d = null;
                Object obj = this.f136903e;
                if (obj != null) {
                    this.f136905g.a(obj);
                    this.f136903e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(Activity activity) {
        this.f136900b.f0(false);
        synchronized (this.f136904f) {
            this.f136902d = activity;
        }
    }

    public Observable<Void> i() {
        this.f136900b.f0(false);
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.activity.helper.h0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f136870a.f((Subscriber) obj);
            }
        }).subscribeOn(com.planner5d.library.services.rx.c.f224934d);
    }
}
