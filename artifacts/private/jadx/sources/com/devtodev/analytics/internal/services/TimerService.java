package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.managers.IStateManager;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class TimerService implements ITimerService {

    @Nullable
    private TimerTask activityTask;

    @Nullable
    private TimerTask aliveTask;

    @Nullable
    private TimerTask currencyAccrualTask;

    @Nullable
    private Function0<Unit> onActivityTimerTick;

    @Nullable
    private Function0<Unit> onAliveTimerTick;

    @Nullable
    private Function0<Unit> onCurrencyAccrualTimerTick;

    @Nullable
    private Function0<Unit> onRequestTimerTick;

    @Nullable
    private TimerTask requestTask;

    @NotNull
    private final IStateManager stateManager;

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.TimerService$startTimers$1, reason: invalid class name */
    @f(c = "com.devtodev.analytics.internal.services.TimerService$startTimers$1", f = "TimerService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final d<Unit> create(@Nullable Object obj, @NotNull d<?> dVar) {
            return TimerService.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Project activeProject = TimerService.this.stateManager.getActiveProject();
            long aliveTimeout = activeProject.getConfiguration().getAliveTimeout();
            long currencyAggregationTimeout = activeProject.getConfiguration().getCurrencyAggregationTimeout();
            TimerService timerService = TimerService.this;
            timerService.aliveTask = timerService.createTimer(timerService.getOnAliveTimerTick(), aliveTimeout);
            TimerService timerService2 = TimerService.this;
            timerService2.requestTask = timerService2.createTimer(timerService2.getOnRequestTimerTick(), activeProject.getConfiguration().getTimeForRequest());
            TimerService timerService3 = TimerService.this;
            timerService3.activityTask = timerService3.createTimer(timerService3.getOnActivityTimerTick(), 15000L);
            TimerService timerService4 = TimerService.this;
            timerService4.currencyAccrualTask = timerService4.createTimer(timerService4.getOnCurrencyAccrualTimerTick(), currencyAggregationTimeout);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public TimerService(@NotNull IStateManager stateManager) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        this.stateManager = stateManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TimerTask createTimer(final Function0<Unit> function0, long j10) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() { // from class: com.devtodev.analytics.internal.services.TimerService$createTimer$$inlined$schedule$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Function0 function1 = function0;
                if (function1 != null) {
                    function1.invoke();
                }
            }
        };
        timer.schedule(timerTask, j10, j10);
        return timerTask;
    }

    @Override // com.devtodev.analytics.internal.services.ITimerService
    @Nullable
    public Function0<Unit> getOnActivityTimerTick() {
        return this.onActivityTimerTick;
    }

    @Override // com.devtodev.analytics.internal.services.ITimerService
    @Nullable
    public Function0<Unit> getOnAliveTimerTick() {
        return this.onAliveTimerTick;
    }

    @Override // com.devtodev.analytics.internal.services.ITimerService
    @Nullable
    public Function0<Unit> getOnCurrencyAccrualTimerTick() {
        return this.onCurrencyAccrualTimerTick;
    }

    @Override // com.devtodev.analytics.internal.services.ITimerService
    @Nullable
    public Function0<Unit> getOnRequestTimerTick() {
        return this.onRequestTimerTick;
    }

    @Override // com.devtodev.analytics.internal.services.ITimerService
    public void resetAliveTimer() {
        TimerTask timerTask = this.aliveTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.aliveTask = null;
        this.aliveTask = createTimer(getOnAliveTimerTick(), this.stateManager.getActiveProject().getConfiguration().getAliveTimeout());
    }

    @Override // com.devtodev.analytics.internal.services.ITimerService
    public void resetRequestTimer() {
        TimerTask timerTask = this.requestTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.requestTask = null;
        this.requestTask = createTimer(getOnRequestTimerTick(), this.stateManager.getActiveProject().getConfiguration().getTimeForRequest());
    }

    @Override // com.devtodev.analytics.internal.services.ITimerService
    public void resetTimers() throws InterruptedException {
        stopTimers();
        startTimers();
    }

    @Override // com.devtodev.analytics.internal.services.ITimerService
    public void setOnActivityTimerTick(@Nullable Function0<Unit> function0) {
        this.onActivityTimerTick = function0;
    }

    @Override // com.devtodev.analytics.internal.services.ITimerService
    public void setOnAliveTimerTick(@Nullable Function0<Unit> function0) {
        this.onAliveTimerTick = function0;
    }

    @Override // com.devtodev.analytics.internal.services.ITimerService
    public void setOnCurrencyAccrualTimerTick(@Nullable Function0<Unit> function0) {
        this.onCurrencyAccrualTimerTick = function0;
    }

    @Override // com.devtodev.analytics.internal.services.ITimerService
    public void setOnRequestTimerTick(@Nullable Function0<Unit> function0) {
        this.onRequestTimerTick = function0;
    }

    @Override // com.devtodev.analytics.internal.services.ITimerService
    public void startTimers() throws InterruptedException {
        j.b(null, new AnonymousClass1(null), 1, null);
    }

    @Override // com.devtodev.analytics.internal.services.ITimerService
    public void stopTimers() {
        TimerTask timerTask = this.aliveTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.aliveTask = null;
        TimerTask timerTask2 = this.requestTask;
        if (timerTask2 != null) {
            timerTask2.cancel();
        }
        this.requestTask = null;
        TimerTask timerTask3 = this.activityTask;
        if (timerTask3 != null) {
            timerTask3.cancel();
        }
        this.activityTask = null;
        TimerTask timerTask4 = this.currencyAccrualTask;
        if (timerTask4 != null) {
            timerTask4.cancel();
        }
        this.currencyAccrualTask = null;
    }
}
