package io.intercom.android.sdk.utilities;

import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.NexusWrapper;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class NexusClientUtilsKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.NexusClientUtilsKt$handleNexusClientLifecycle$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.utilities.NexusClientUtilsKt", f = "NexusClientUtils.kt", i = {}, l = {11}, m = "handleNexusClientLifecycle", n = {}, s = {})
    static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NexusClientUtilsKt.handleNexusClientLifecycle(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public static final Object handleNexusClientLifecycle(@NotNull final IntercomDataLayer intercomDataLayer, @NotNull final NexusWrapper nexusWrapper, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        Object objL = b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            o0<IntercomEvent> event = intercomDataLayer.getEvent();
            j<? super IntercomEvent> jVar = new j() { // from class: io.intercom.android.sdk.utilities.NexusClientUtilsKt.handleNexusClientLifecycle.2
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar2) {
                    return emit((IntercomEvent) obj2, (kotlin.coroutines.d<? super Unit>) dVar2);
                }

                public final Object emit(IntercomEvent intercomEvent, kotlin.coroutines.d<? super Unit> dVar2) {
                    if (intercomEvent instanceof IntercomEvent.AppEnteredBackground) {
                        nexusWrapper.scheduleDisconnect(intercomDataLayer.getConfig().getValue().getNewSessionThresholdMs());
                    } else if (intercomEvent instanceof IntercomEvent.AppEnteredForeground) {
                        nexusWrapper.connect(intercomDataLayer.getConfig().getValue().getRealTimeConfig(), true);
                    } else if (intercomEvent instanceof IntercomEvent.BaseResponseReceived) {
                        NexusConfig realTimeConfig = ((IntercomEvent.BaseResponseReceived) intercomEvent).getBaseResponse().getConfig().getRealTimeConfig();
                        if (realTimeConfig.getEndpoints().isEmpty()) {
                            nexusWrapper.disconnect();
                        } else if (!intercomDataLayer.getHostAppState().getValue().isBackgrounded()) {
                            nexusWrapper.connect(realTimeConfig, true);
                        }
                    } else if (Intrinsics.areEqual(intercomEvent, IntercomEvent.SoftReset.INSTANCE)) {
                        nexusWrapper.disconnect();
                    }
                    return Unit.f312394a;
                }
            };
            anonymousClass1.label = 1;
            if (event.collect(jVar, anonymousClass1) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        throw new a0();
    }
}
