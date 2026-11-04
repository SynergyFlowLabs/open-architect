package com.planner5d.library.activity.helper;

import android.graphics.Bitmap;
import android.view.View;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.snapshot.Snapshot;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import java.util.Objects;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes6.dex */
public class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected b4 f136837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.modules.user.user.t f136838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.modules.user.user.t0 f136839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.b2 f136840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.widget.preloader.t f136841e = new com.planner5d.library.widget.preloader.t();

    class a extends com.planner5d.library.services.rx.e<Void> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f136842d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f136843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Observable f136844f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Subscriber f136845g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ id.a f136846h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ vd.b f136847i;

        /* JADX INFO: renamed from: com.planner5d.library.activity.helper.f1$a$a, reason: collision with other inner class name */
        class C1501a extends com.planner5d.library.services.rx.e<Snapshot> {
            C1501a() {
            }

            @Override // com.planner5d.library.services.rx.e
            public void c(Throwable th2) {
                if (ErrorMessageException.isWithCode(th2, com.planner5d.library.f.s.U9, com.planner5d.library.f.s.N9)) {
                    a.this.g();
                } else {
                    a aVar = a.this;
                    f1.this.f(th2, aVar.f136843e);
                }
                a.this.f136845g.onError(th2);
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onNext(Snapshot snapshot) {
                a.this.f136845g.onNext(snapshot);
                a.this.f136845g.onCompleted();
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            public void onCompleted() {
                a aVar = a.this;
                id.a aVar2 = aVar.f136846h;
                Boolean bool = Boolean.TRUE;
                com.planner5d.library.modules.user.user.t0 t0Var = f1.this.f136839c;
                Objects.requireNonNull(t0Var);
                com.planner5d.library.services.utility.c0.u(aVar2, bool, new e1(t0Var)).subscribe((Subscriber) new com.planner5d.library.services.rx.e());
            }
        }

        class b extends com.planner5d.library.services.rx.e<id.a> {

            /* JADX INFO: renamed from: com.planner5d.library.activity.helper.f1$a$b$a, reason: collision with other inner class name */
            class C1502a extends com.planner5d.library.services.rx.e<Void> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private boolean f136851d = false;

                C1502a() {
                }

                public static /* synthetic */ void e(Subscriber subscriber, Snapshot snapshot) {
                    subscriber.onNext(snapshot);
                    subscriber.onCompleted();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void f(View view, Throwable th2) {
                    f1.this.f(th2, view);
                }

                @Override // com.planner5d.library.services.rx.e
                public void c(Throwable th2) {
                    a.this.cancel();
                }

                @Override // com.planner5d.library.services.rx.e, rx.Observer
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public void onNext(Void r10) {
                    this.f136851d = true;
                    a aVar = a.this;
                    Observable observable = aVar.f136844f;
                    final Subscriber subscriber = aVar.f136845g;
                    Action1 action1 = new Action1() { // from class: com.planner5d.library.activity.helper.g1
                        @Override // rx.functions.Action1
                        public final void call(Object obj) {
                            f1.a.b.C1502a.e(subscriber, (Snapshot) obj);
                        }
                    };
                    final View view = a.this.f136843e;
                    observable.subscribe(action1, new Action1() { // from class: com.planner5d.library.activity.helper.h1
                        @Override // rx.functions.Action1
                        public final void call(Object obj) {
                            this.f136871a.f(view, (Throwable) obj);
                        }
                    });
                }

                @Override // com.planner5d.library.services.rx.e, rx.Observer
                public void onCompleted() {
                    if (this.f136851d) {
                        return;
                    }
                    a.this.cancel();
                }
            }

            b() {
            }

            @Override // com.planner5d.library.services.rx.e
            public void c(Throwable th2) {
                a aVar = a.this;
                f1.this.f(th2, aVar.f136843e);
            }

            @Override // com.planner5d.library.services.rx.e, rx.Observer
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onNext(id.a aVar) {
                a aVar2 = a.this;
                f1 f1Var = f1.this;
                f1Var.f136837a.n0(f1Var.f136839c, aVar, aVar2.f136847i).subscribe((Subscriber<? super Void>) new C1502a());
            }
        }

        a(View view, Observable observable, Subscriber subscriber, id.a aVar, vd.b bVar) {
            this.f136843e = view;
            this.f136844f = observable;
            this.f136845g = subscriber;
            this.f136846h = aVar;
            this.f136847i = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cancel() {
            f1.this.f136841e.b(this.f136843e).b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            id.a aVar = this.f136846h;
            Boolean bool = Boolean.TRUE;
            com.planner5d.library.modules.user.user.t0 t0Var = f1.this.f136839c;
            Objects.requireNonNull(t0Var);
            com.planner5d.library.services.utility.c0.u(aVar, bool, new e1(t0Var)).subscribe((Subscriber) new b());
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            cancel();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onNext(Void r10) {
            this.f136842d = true;
            this.f136844f.subscribe((Subscriber) new C1501a());
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            if (this.f136842d) {
                return;
            }
            cancel();
        }
    }

    @ij.a
    public f1() {
    }

    private com.planner5d.library.services.rx.e<Void> e(Subscriber<? super Snapshot> subscriber, View view, Observable<Snapshot> observable, id.a aVar, vd.b bVar) {
        return new a(view, observable, subscriber, aVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Throwable th2, View view) {
        this.f136840d.c(th2);
        this.f136841e.b(view).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(id.a aVar, gd.a aVar2, View view, Observable observable, Subscriber subscriber) {
        this.f136837a.n0(this.f136839c, aVar, aVar2.f275442a).subscribe((Subscriber<? super Void>) e(subscriber, view, observable, aVar, aVar2.f275442a));
    }

    public Observable<Snapshot> d(final View view, String str, Snapshot snapshot, long j10, Bitmap bitmap, vd.a aVar, gd.a aVar2) {
        gd.a aVar3;
        Observable<Snapshot> observableN0;
        final id.a aVarA = this.f136838b.a();
        this.f136841e.b(view).p(str, false);
        if (snapshot == null) {
            aVar3 = aVar2;
            observableN0 = this.f136837a.K(aVarA, j10, bitmap, aVar, true, aVar3);
        } else {
            aVar3 = aVar2;
            observableN0 = this.f136837a.N0(aVarA, snapshot, aVar3.f275442a);
        }
        final Observable<Snapshot> observable = observableN0;
        final gd.a aVar4 = aVar3;
        return Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.activity.helper.d1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.f136735a.g(aVarA, aVar4, view, observable, (Subscriber) obj);
            }
        });
    }
}
