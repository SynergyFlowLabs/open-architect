package com.superwall.sdk.analytics.internal;

import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.analytics.internal.trackable.Trackable;
import com.superwall.sdk.analytics.internal.trackable.TrackableSuperwallEvent;
import com.superwall.sdk.analytics.superwall.SuperwallEvents;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.models.paywall.PaywallURL;
import com.superwall.sdk.paywall.presentation.PaywallInfo;
import com.superwall.sdk.paywall.view.PaywallView;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.l1;
import kotlinx.serialization.c0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.threeten.bp.h;
import org.threeten.bp.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class TrackingLogic {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nTrackingLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackingLogic.kt\ncom/superwall/sdk/analytics/internal/TrackingLogic$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,239:1\n462#2:240\n412#2:241\n503#2,7:246\n462#2:253\n412#2:254\n503#2,7:259\n1246#3,4:242\n1246#3,4:255\n113#4:266\n*S KotlinDebug\n*F\n+ 1 TrackingLogic.kt\ncom/superwall/sdk/analytics/internal/TrackingLogic$Companion\n*L\n142#1:240\n142#1:241\n142#1:246,7\n143#1:253\n143#1:254\n143#1:259,7\n142#1:242,4\n143#1:255,4\n148#1:266\n*E\n"})
    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SuperwallEvents.values().length];
                try {
                    iArr[SuperwallEvents.TransactionAbandon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SuperwallEvents.TransactionFail.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SuperwallEvents.SurveyResponse.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SuperwallEvents.PaywallDecline.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SuperwallEvents.CustomPlacement.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:6:0x0009  */
        public final Object clean(Object obj) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof List) {
                obj = null;
            } else if (obj instanceof LinkedHashMap) {
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), TrackingLogic.Companion.clean(entry.getValue()));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (entry2.getValue() != null) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                obj = MapsKt.toMap(linkedHashMap2);
            } else if (obj instanceof Map) {
                Map map2 = (Map) obj;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(map2.size()));
                for (Map.Entry entry3 : map2.entrySet()) {
                    linkedHashMap3.put(entry3.getKey(), TrackingLogic.Companion.clean(entry3.getValue()));
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    if (entry4.getValue() != null) {
                        linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                    }
                }
                obj = MapsKt.toMap(linkedHashMap4);
            } else if (!(obj instanceof String) && !(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof Long) && !(obj instanceof Boolean)) {
                try {
                    Json.Default r10 = Json.Default;
                    r10.encodeToString(m0.d(r10.getSerializersModule(), j1.d(Object.class)), obj);
                } catch (c0 unused) {
                    if (obj instanceof h) {
                        obj = Long.valueOf(((h) obj).w(s.f340320n).U().l0());
                    } else if (obj instanceof URI) {
                        obj = ((URI) obj).toString();
                    } else if (obj instanceof PaywallURL) {
                        obj = PaywallURL.m51toStringimpl(((PaywallURL) obj).m52unboximpl());
                    } else {
                        obj = null;
                    }
                }
            }
            if (obj == null) {
                return null;
            }
            return obj;
        }

        @NotNull
        public final ImplicitTriggerOutcome canTriggerPaywall(@NotNull Trackable event, @NotNull Set<String> triggers, @Nullable PaywallView paywallView) {
            PaywallInfo info;
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(triggers, "triggers");
            if ((event instanceof TrackableSuperwallEvent) && Intrinsics.areEqual(((TrackableSuperwallEvent) event).getSuperwallPlacement().getRawName(), SuperwallEvents.DeepLink.getRawName())) {
                return ImplicitTriggerOutcome.DeepLinkTrigger.INSTANCE;
            }
            if (!triggers.contains(event.getRawName())) {
                Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.all, "!! canTriggerPaywall: triggers.contains(event.rawName) " + event.getRawName() + " " + triggers, null, null, 24, null);
                return ImplicitTriggerOutcome.DontTriggerPaywall.INSTANCE;
            }
            Set of2 = SetsKt.setOf((Object[]) new String[]{SuperwallEvents.TransactionAbandon.getRawName(), SuperwallEvents.TransactionFail.getRawName(), SuperwallEvents.PaywallDecline.getRawName(), SuperwallEvents.CustomPlacement.getRawName()});
            String presentedByEventWithName = (paywallView == null || (info = paywallView.getInfo()) == null) ? null : info.getPresentedByEventWithName();
            if (presentedByEventWithName == null || !of2.contains(presentedByEventWithName)) {
                if (event instanceof TrackableSuperwallEvent) {
                    int i10 = WhenMappings.$EnumSwitchMapping$0[((TrackableSuperwallEvent) event).getSuperwallPlacement().getBackingEvent().ordinal()];
                    return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? ImplicitTriggerOutcome.ClosePaywallThenTriggerPaywall.INSTANCE : ImplicitTriggerOutcome.TriggerPaywall.INSTANCE;
                }
                if (paywallView == null) {
                    return ImplicitTriggerOutcome.TriggerPaywall.INSTANCE;
                }
                Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.all, "!! canTriggerPaywall: paywallViewController != null", null, null, 24, null);
                return ImplicitTriggerOutcome.DontTriggerPaywall.INSTANCE;
            }
            Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.all, "!! canTriggerPaywall: notAllowedReferringEventNames.contains(referringEventName) " + presentedByEventWithName, null, null, 24, null);
            return ImplicitTriggerOutcome.DontTriggerPaywall.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0027 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:12:0x0028  */
        public final void checkNotSuperwallEvent(@NotNull String event) throws Exception {
            Intrinsics.checkNotNullParameter(event, "event");
            for (SuperwallEvents superwallEvents : SuperwallEvents.values()) {
                if (Intrinsics.areEqual(superwallEvents.getRawName(), event)) {
                    if (superwallEvents == null) {
                        throw new Exception("Do not track an event with the same name as a SuperwallEvent");
                    }
                }
            }
            superwallEvents = null;
            if (superwallEvents == null) {
                throw new Exception("Do not track an event with the same name as a SuperwallEvent");
            }
        }

        public final boolean isNotDisabledVerboseEvent(@NotNull Trackable event, @Nullable Boolean bool, boolean z10) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                if (z10) {
                    return true;
                }
                if (event instanceof InternalSuperwallEvent.PresentationRequest) {
                    return true ^ zBooleanValue;
                }
                InternalSuperwallEvent.PaywallLoad paywallLoad = event instanceof InternalSuperwallEvent.PaywallLoad ? (InternalSuperwallEvent.PaywallLoad) event : null;
                if (paywallLoad != null) {
                    InternalSuperwallEvent.PaywallLoad.State state = paywallLoad.getState();
                    return (((state instanceof InternalSuperwallEvent.PaywallLoad.State.Start) || (state instanceof InternalSuperwallEvent.PaywallLoad.State.Complete)) && zBooleanValue) ? false : true;
                }
                if (event instanceof InternalSuperwallEvent.ShimmerLoad) {
                    return true ^ zBooleanValue;
                }
                InternalSuperwallEvent.PaywallProductsLoad paywallProductsLoad = event instanceof InternalSuperwallEvent.PaywallProductsLoad ? (InternalSuperwallEvent.PaywallProductsLoad) event : null;
                if (paywallProductsLoad != null) {
                    InternalSuperwallEvent.PaywallProductsLoad.State state2 = paywallProductsLoad.getState();
                    return (((state2 instanceof InternalSuperwallEvent.PaywallProductsLoad.State.Start) || (state2 instanceof InternalSuperwallEvent.PaywallProductsLoad.State.Complete)) && zBooleanValue) ? false : true;
                }
                InternalSuperwallEvent.PaywallWebviewLoad paywallWebviewLoad = event instanceof InternalSuperwallEvent.PaywallWebviewLoad ? (InternalSuperwallEvent.PaywallWebviewLoad) event : null;
                if (paywallWebviewLoad != null) {
                    InternalSuperwallEvent.PaywallWebviewLoad.State state3 = paywallWebviewLoad.getState();
                    return (((state3 instanceof InternalSuperwallEvent.PaywallWebviewLoad.State.Start) || (state3 instanceof InternalSuperwallEvent.PaywallWebviewLoad.State.Complete)) && zBooleanValue) ? false : true;
                }
            }
            return true;
        }

        @Nullable
        public final Object processParameters(@NotNull Trackable trackable, @NotNull String str, @NotNull d<? super TrackingParameters> dVar) {
            return i.h(l1.c(), new TrackingLogic$Companion$processParameters$2(trackable, str, null), dVar);
        }

        private Companion() {
        }
    }

    public static abstract class ImplicitTriggerOutcome {

        public static final class ClosePaywallThenTriggerPaywall extends ImplicitTriggerOutcome {

            @NotNull
            public static final ClosePaywallThenTriggerPaywall INSTANCE = new ClosePaywallThenTriggerPaywall();

            private ClosePaywallThenTriggerPaywall() {
                super(null);
            }
        }

        public static final class DeepLinkTrigger extends ImplicitTriggerOutcome {

            @NotNull
            public static final DeepLinkTrigger INSTANCE = new DeepLinkTrigger();

            private DeepLinkTrigger() {
                super(null);
            }
        }

        public static final class DisallowedEventAsTrigger extends ImplicitTriggerOutcome {

            @NotNull
            public static final DisallowedEventAsTrigger INSTANCE = new DisallowedEventAsTrigger();

            private DisallowedEventAsTrigger() {
                super(null);
            }
        }

        public static final class DontTriggerPaywall extends ImplicitTriggerOutcome {

            @NotNull
            public static final DontTriggerPaywall INSTANCE = new DontTriggerPaywall();

            private DontTriggerPaywall() {
                super(null);
            }
        }

        public static final class TriggerPaywall extends ImplicitTriggerOutcome {

            @NotNull
            public static final TriggerPaywall INSTANCE = new TriggerPaywall();

            private TriggerPaywall() {
                super(null);
            }
        }

        public /* synthetic */ ImplicitTriggerOutcome(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ImplicitTriggerOutcome() {
        }
    }

    public /* synthetic */ TrackingLogic(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TrackingLogic() {
    }
}
