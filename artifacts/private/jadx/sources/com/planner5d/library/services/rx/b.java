package com.planner5d.library.services.rx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nRxObservableOneAtATime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxObservableOneAtATime.kt\ncom/planner5d/library/services/rx/RxObservableOneAtATime\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public final class b<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<a<R>> f224923a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private C1681b<R> f224924b;

    public static final class a<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Subscriber<? super R> f224925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Observable<R> f224926b;

        public a(@NotNull Subscriber<? super R> subscriber, @NotNull Observable<R> observable) {
            Intrinsics.checkNotNullParameter(subscriber, "subscriber");
            Intrinsics.checkNotNullParameter(observable, "observable");
            this.f224925a = subscriber;
            this.f224926b = observable;
        }

        @NotNull
        public final Observable<R> a() {
            return this.f224926b;
        }

        @NotNull
        public final Subscriber<? super R> b() {
            return this.f224925a;
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.services.rx.b$b, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nRxObservableOneAtATime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxObservableOneAtATime.kt\ncom/planner5d/library/services/rx/RxObservableOneAtATime$InternalSubscriber\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1863#2,2:94\n1863#2,2:96\n1863#2,2:98\n*S KotlinDebug\n*F\n+ 1 RxObservableOneAtATime.kt\ncom/planner5d/library/services/rx/RxObservableOneAtATime$InternalSubscriber\n*L\n78#1:94,2\n83#1:96,2\n87#1:98,2\n*E\n"})
    public static final class C1681b<R> extends e<R> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final b<R> f224927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final List<a<R>> f224928e;

        public C1681b(@NotNull b<R> executor, @NotNull List<a<R>> executions) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(executions, "executions");
            this.f224927d = executor;
            this.f224928e = executions;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(@Nullable Throwable th2) {
            Iterator<T> it = this.f224928e.iterator();
            while (it.hasNext()) {
                ((a) it.next()).b().onError(th2);
            }
            this.f224927d.d();
        }

        public final boolean d() {
            return !this.f224928e.isEmpty();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            Iterator<T> it = this.f224928e.iterator();
            while (it.hasNext()) {
                ((a) it.next()).b().onCompleted();
            }
            this.f224927d.d();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onNext(R r10) {
            Iterator<T> it = this.f224928e.iterator();
            while (it.hasNext()) {
                ((a) it.next()).b().onNext(r10);
            }
        }
    }

    public static final class c<R> implements Observable.OnSubscribe<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b<R> f224929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Observable<R> f224930b;

        public c(@NotNull b<R> executor, @NotNull Observable<R> observable) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(observable, "observable");
            this.f224929a = executor;
            this.f224930b = observable;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(@NotNull Subscriber<? super R> subscriber) {
            Intrinsics.checkNotNullParameter(subscriber, "subscriber");
            this.f224929a.e(new a(subscriber, this.f224930b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.planner5d.library.services.rx.b$b, com.planner5d.library.services.rx.b$b<R>] */
    private final void c() {
        i1.h hVar = new i1.h();
        synchronized (this.f224923a) {
            try {
                if (this.f224924b == null && !this.f224923a.isEmpty()) {
                    ?? r10 = (C1681b<R>) new C1681b(this, CollectionsKt.toList(this.f224923a));
                    this.f224924b = r10;
                    hVar.f312751a = r10;
                    Object objLast = CollectionsKt.last((List<? extends Object>) this.f224923a);
                    this.f224923a.clear();
                    Unit unit = Unit.f312394a;
                    ((a) objLast).a().subscribe((Subscriber<? super R>) hVar.f312751a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        synchronized (this.f224923a) {
            try {
                this.f224924b = null;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(a<R> aVar) {
        synchronized (this.f224923a) {
            try {
                this.f224923a.add(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c();
    }

    @NotNull
    public final Observable<R> f(@NotNull Observable<R> observable) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        Observable<R> observableCreate = Observable.create(new c(this, observable));
        Intrinsics.checkNotNullExpressionValue(observableCreate, "create(...)");
        return observableCreate;
    }
}
