package com.planner5d.library.services.rx;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.schedulers.ScheduledAction;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nRxSchedulers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxSchedulers.kt\ncom/planner5d/library/services/rx/RxSchedulers\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f224931a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final Scheduler f224932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final Scheduler f224933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final Scheduler f224934d;

    private static final class a extends Scheduler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Handler f224935a;

        public a(@NotNull Handler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.f224935a = handler;
        }

        @NotNull
        public final Handler a() {
            return this.f224935a;
        }

        @Override // rx.Scheduler
        @NotNull
        public Scheduler.Worker createWorker() {
            return new b(this.f224935a);
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("RxSchedulerSequential");
        handlerThread.start();
        f224932b = new a(new Handler(handlerThread.getLooper()));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8, 32, 2L, TimeUnit.SECONDS, new LinkedBlockingDeque());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        Scheduler schedulerFrom = Schedulers.from(threadPoolExecutor);
        Intrinsics.checkNotNullExpressionValue(schedulerFrom, "from(...)");
        f224933c = schedulerFrom;
        f224934d = new a(new Handler(Looper.getMainLooper()));
    }

    private c() {
    }

    @l(message = "Use coroutines - will not work properly in tests")
    public static /* synthetic */ void a() {
    }

    @l(message = "Use coroutines - will not work properly in tests")
    public static /* synthetic */ void b() {
    }

    @l(message = "Use coroutines - will not work properly in tests")
    public static /* synthetic */ void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends Scheduler.Worker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Handler f224936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final CompositeSubscription f224937b;

        public b(@NotNull Handler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.f224936a = handler;
            this.f224937b = new CompositeSubscription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar, ScheduledAction scheduledAction) {
            bVar.f224936a.removeCallbacks(scheduledAction);
        }

        @NotNull
        public final Handler b() {
            return this.f224936a;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.f224937b.isUnsubscribed();
        }

        @Override // rx.Scheduler.Worker
        @NotNull
        public Subscription schedule(@NotNull Action0 action, long j10, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(unit, "unit");
            final ScheduledAction scheduledAction = new ScheduledAction(action);
            scheduledAction.add(Subscriptions.create(new Action0() { // from class: com.planner5d.library.services.rx.d
                @Override // rx.functions.Action0
                public final void call() {
                    c.b.c(this.f224938a, scheduledAction);
                }
            }));
            scheduledAction.addParent(this.f224937b);
            this.f224937b.add(this);
            this.f224936a.postDelayed(scheduledAction, unit.toMillis(j10));
            return scheduledAction;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.f224937b.unsubscribe();
        }

        @Override // rx.Scheduler.Worker
        @NotNull
        public Subscription schedule(@NotNull Action0 action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return schedule(action, 0L, TimeUnit.MILLISECONDS);
        }
    }
}
