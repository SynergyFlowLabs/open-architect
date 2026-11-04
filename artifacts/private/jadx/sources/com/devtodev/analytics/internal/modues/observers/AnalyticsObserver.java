package com.devtodev.analytics.internal.modues.observers;

import android.os.Handler;
import android.os.Looper;
import com.devtodev.analytics.external.analytics.DTDIdentifiersListener;
import com.devtodev.analytics.internal.queue.QueueManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsObserver implements IAnalyticsObserver {

    @Nullable
    private DTDIdentifiersListener identifiersListener;

    @Nullable
    private Function0<Unit> initializationCompleteCallback;
    private boolean isInitializationFinished;

    @Nullable
    private ILogicBroadcaster logicBroadcaster;

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.observers.AnalyticsObserver$addIdentifiersListener$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l0 implements Function0<Unit> {
        final /* synthetic */ DTDIdentifiersListener $identifiersListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DTDIdentifiersListener dTDIdentifiersListener) {
            super(0);
            this.$identifiersListener = dTDIdentifiersListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AnalyticsObserver.this.identifiersListener = this.$identifiersListener;
            ILogicBroadcaster iLogicBroadcaster = AnalyticsObserver.this.logicBroadcaster;
            if (iLogicBroadcaster != null) {
                iLogicBroadcaster.forceUpdate();
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.observers.AnalyticsObserver$prepareCallback$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25911 extends l0 implements Function1<Long, Unit> {
        public C25911() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
            invoke2(l10);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Long l10) {
            DTDIdentifiersListener dTDIdentifiersListener;
            if (l10 == null || l10.longValue() == 0 || (dTDIdentifiersListener = AnalyticsObserver.this.identifiersListener) == null) {
                return;
            }
            dTDIdentifiersListener.didReceiveDevtodevId(l10.longValue());
        }
    }

    private final void notifyFinishInitialization() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.devtodev.analytics.internal.modues.observers.a
            @Override // java.lang.Runnable
            public final void run() {
                AnalyticsObserver.notifyFinishInitialization$lambda$0(this.f98054a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFinishInitialization$lambda$0(AnalyticsObserver this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.initializationCompleteCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void prepareCallback() {
        ILogicBroadcaster iLogicBroadcaster = this.logicBroadcaster;
        if (iLogicBroadcaster == null) {
            return;
        }
        iLogicBroadcaster.setOnBackendIdentifiersUpdate(new C25911());
    }

    @Override // com.devtodev.analytics.internal.modues.observers.IAnalyticsObserver
    public void addIdentifiersListener(@Nullable DTDIdentifiersListener dTDIdentifiersListener) {
        QueueManager.Companion.runIncoming(new AnonymousClass1(dTDIdentifiersListener));
    }

    @Override // com.devtodev.analytics.internal.modues.observers.IAnalyticsObserver
    public void addLogicReceiver(@NotNull ILogicBroadcaster logicBroadcaster) {
        Intrinsics.checkNotNullParameter(logicBroadcaster, "logicBroadcaster");
        this.logicBroadcaster = logicBroadcaster;
        prepareCallback();
    }

    @Override // com.devtodev.analytics.internal.modues.observers.IAnalyticsObserver
    public void finishInitialization() {
        this.isInitializationFinished = true;
        notifyFinishInitialization();
    }

    @Override // com.devtodev.analytics.internal.modues.observers.IAnalyticsObserver
    public void setInitializationCallBack(@Nullable Function0<Unit> function0) {
        this.initializationCompleteCallback = function0;
        if (this.isInitializationFinished) {
            notifyFinishInitialization();
        }
    }
}
