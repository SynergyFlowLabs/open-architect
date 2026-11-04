package com.devtodev.analytics.internal.modues.abtest;

import com.devtodev.analytics.internal.lifecycle.ILifecycle;
import com.devtodev.analytics.internal.lifecycle.ILifecycleRepository;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.queue.QueueManager;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AbTestLogicProxy implements IAbTestProxy {

    @Nullable
    private IAbTestLogic abTestLogic;

    @NotNull
    private final ILifecycle lifecycleListener = new ILifecycle() { // from class: com.devtodev.analytics.internal.modues.abtest.AbTestLogicProxy$lifecycleListener$1
        @Override // com.devtodev.analytics.internal.lifecycle.ILifecycle
        public void onEnterBackground() {
            QueueManager.Companion.runIncoming(new AbTestLogicProxy$lifecycleListener$1$onEnterBackground$1(this.this$0));
        }

        @Override // com.devtodev.analytics.internal.lifecycle.ILifecycle
        public void onEnterForeground() {
            QueueManager.Companion.runIncoming(new AbTestLogicProxy$lifecycleListener$1$onEnterForeground$1(this.this$0));
        }
    };

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogicProxy$resetConfig$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l0 implements Function0<Unit> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAbTestLogic abTestLogic = AbTestLogicProxy.this.getAbTestLogic();
            AbTestLogicProxy abTestLogicProxy = AbTestLogicProxy.this;
            if (abTestLogic == null) {
                abTestLogicProxy.validateInitialization("resetConfig");
            } else {
                abTestLogic.resetConfig();
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogicProxy$startActivity$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25571 extends l0 implements Function0<Unit> {
        public C25571() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAbTestLogic abTestLogic = AbTestLogicProxy.this.getAbTestLogic();
            if (abTestLogic != null) {
                abTestLogic.startActivity();
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogicProxy$stopActivity$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25581 extends l0 implements Function0<Unit> {
        public C25581() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAbTestLogic abTestLogic = AbTestLogicProxy.this.getAbTestLogic();
            if (abTestLogic != null) {
                abTestLogic.stopActivity();
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.abtest.AbTestLogicProxy$tryStartInvolvedExperiment$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25591 extends l0 implements Function0<Unit> {
        public C25591() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IAbTestLogic abTestLogic = AbTestLogicProxy.this.getAbTestLogic();
            AbTestLogicProxy abTestLogicProxy = AbTestLogicProxy.this;
            if (abTestLogic == null) {
                abTestLogicProxy.validateInitialization("applyConfig");
            } else {
                abTestLogic.tryStartInvolvedExperiment();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateInitialization(String str) {
        Logger.INSTANCE.error("In the " + str + " method error has occurred: The SDK is not initialized yet!", null);
    }

    @Nullable
    public final IAbTestLogic getAbTestLogic() {
        return this.abTestLogic;
    }

    @Override // com.devtodev.analytics.internal.modues.abtest.IAbTestProxy
    @NotNull
    public Map<String, Object> getConfig() {
        Map<String, Object> config;
        IAbTestLogic iAbTestLogic = this.abTestLogic;
        if (iAbTestLogic != null && (config = iAbTestLogic.getConfig()) != null) {
            return config;
        }
        return MapsKt.emptyMap();
    }

    @Override // com.devtodev.analytics.internal.modues.abtest.IAbTestProxy
    public void initialize(@NotNull IAbTestLogic abTestLogic, @NotNull ILifecycleRepository lifecycleRepository) {
        Intrinsics.checkNotNullParameter(abTestLogic, "abTestLogic");
        Intrinsics.checkNotNullParameter(lifecycleRepository, "lifecycleRepository");
        this.abTestLogic = abTestLogic;
        lifecycleRepository.addLifeCycleListener(this.lifecycleListener);
    }

    @Override // com.devtodev.analytics.internal.modues.abtest.IAbTestProxy
    public void resetConfig() {
        QueueManager.Companion.runIncoming(new AnonymousClass1());
    }

    public final void setAbTestLogic(@Nullable IAbTestLogic iAbTestLogic) {
        this.abTestLogic = iAbTestLogic;
    }

    @Override // com.devtodev.analytics.internal.modues.abtest.IAbTestProxy
    public void startActivity() {
        QueueManager.Companion.runIncoming(new C25571());
    }

    @Override // com.devtodev.analytics.internal.modues.abtest.IAbTestProxy
    public void stopActivity() {
        QueueManager.Companion.runIncoming(new C25581());
    }

    @Override // com.devtodev.analytics.internal.modues.abtest.IAbTestProxy
    public void tryStartInvolvedExperiment() {
        QueueManager.Companion.runIncoming(new C25591());
    }
}
