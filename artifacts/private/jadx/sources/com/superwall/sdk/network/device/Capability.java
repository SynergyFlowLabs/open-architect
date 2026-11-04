package com.superwall.sdk.network.device;

import com.superwall.sdk.analytics.superwall.SuperwallEvents;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.z1;
import kotlinx.serialization.v;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0
public abstract class Capability {

    @NotNull
    private final String name;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: com.superwall.sdk.network.device.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Capability._init_$_anonymous_();
        }
    });

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) Capability.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Capability> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    @a0("config_caching")
    public static final class ConfigCaching extends Capability {

        @NotNull
        public static final ConfigCaching INSTANCE = new ConfigCaching();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: com.superwall.sdk.network.device.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Capability.ConfigCaching._init_$_anonymous_();
            }
        });

        private ConfigCaching() {
            super("config_caching", null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("config_caching", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<ConfigCaching> serializer() {
            return get$cachedSerializer();
        }
    }

    @b0
    @a0("multiple_paywall_urls")
    public static final class MultiplePaywallUrls extends Capability {

        @NotNull
        public static final MultiplePaywallUrls INSTANCE = new MultiplePaywallUrls();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: com.superwall.sdk.network.device.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Capability.MultiplePaywallUrls._init_$_anonymous_();
            }
        });

        private MultiplePaywallUrls() {
            super("multiple_paywall_urls", null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("multiple_paywall_urls", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<MultiplePaywallUrls> serializer() {
            return get$cachedSerializer();
        }
    }

    public /* synthetic */ Capability(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new v("com.superwall.sdk.network.device.Capability", j1.d(Capability.class), new kotlin.reflect.d[]{j1.d(ConfigCaching.class), j1.d(MultiplePaywallUrls.class), j1.d(PaywallEventReceiver.class)}, new KSerializer[]{new z1("config_caching", ConfigCaching.INSTANCE, new Annotation[0]), new z1("multiple_paywall_urls", MultiplePaywallUrls.INSTANCE, new Annotation[0]), Capability$PaywallEventReceiver$$serializer.INSTANCE}, new Annotation[0]);
    }

    @a0("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self(Capability capability, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, capability.name);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public /* synthetic */ Capability(int i10, String str, v2 v2Var) {
        this.name = str;
    }

    private Capability(String str) {
        this.name = str;
    }

    @b0
    @a0("paywall_event_receiver")
    @SourceDebugExtension({"SMAP\nCapability.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Capability.kt\ncom/superwall/sdk/network/device/Capability$PaywallEventReceiver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1557#2:52\n1628#2,3:53\n*S KotlinDebug\n*F\n+ 1 Capability.kt\ncom/superwall/sdk/network/device/Capability$PaywallEventReceiver\n*L\n32#1:52\n32#1:53,3\n*E\n"})
    public static final class PaywallEventReceiver extends Capability {

        @NotNull
        private final List<String> eventNames;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @oj.f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {null, new kotlinx.serialization.internal.f(b3.f315897a)};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<PaywallEventReceiver> serializer() {
                return Capability$PaywallEventReceiver$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PaywallEventReceiver(int i10, String str, List list, v2 v2Var) {
            super(i10, str, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, Capability$PaywallEventReceiver$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 2) != 0) {
                this.eventNames = list;
                return;
            }
            List listListOf = CollectionsKt.listOf((Object[]) new SuperwallEvents[]{SuperwallEvents.TransactionStart, SuperwallEvents.TransactionRestore, SuperwallEvents.TransactionComplete, SuperwallEvents.RestoreStart, SuperwallEvents.RestoreFail, SuperwallEvents.RestoreComplete, SuperwallEvents.TransactionFail, SuperwallEvents.TransactionAbandon, SuperwallEvents.TransactionTimeout, SuperwallEvents.PaywallOpen, SuperwallEvents.PaywallClose});
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                arrayList.add(((SuperwallEvents) it.next()).getRawName());
            }
            this.eventNames = arrayList;
        }

        @a0("event_names")
        public static /* synthetic */ void getEventNames$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(PaywallEventReceiver paywallEventReceiver, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
            Capability.write$Self(paywallEventReceiver, eVar, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (!eVar.shouldEncodeElementDefault(serialDescriptor, 1)) {
                List<String> list = paywallEventReceiver.eventNames;
                List listListOf = CollectionsKt.listOf((Object[]) new SuperwallEvents[]{SuperwallEvents.TransactionStart, SuperwallEvents.TransactionRestore, SuperwallEvents.TransactionComplete, SuperwallEvents.RestoreStart, SuperwallEvents.RestoreFail, SuperwallEvents.RestoreComplete, SuperwallEvents.TransactionFail, SuperwallEvents.TransactionAbandon, SuperwallEvents.TransactionTimeout, SuperwallEvents.PaywallOpen, SuperwallEvents.PaywallClose});
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
                Iterator it = listListOf.iterator();
                while (it.hasNext()) {
                    arrayList.add(((SuperwallEvents) it.next()).getRawName());
                }
                if (Intrinsics.areEqual(list, arrayList)) {
                    return;
                }
            }
            eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], paywallEventReceiver.eventNames);
        }

        @NotNull
        public final List<String> getEventNames() {
            return this.eventNames;
        }

        public PaywallEventReceiver() {
            super("paywall_event_receiver", null);
            List listListOf = CollectionsKt.listOf((Object[]) new SuperwallEvents[]{SuperwallEvents.TransactionStart, SuperwallEvents.TransactionRestore, SuperwallEvents.TransactionComplete, SuperwallEvents.RestoreStart, SuperwallEvents.RestoreFail, SuperwallEvents.RestoreComplete, SuperwallEvents.TransactionFail, SuperwallEvents.TransactionAbandon, SuperwallEvents.TransactionTimeout, SuperwallEvents.PaywallOpen, SuperwallEvents.PaywallClose});
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                arrayList.add(((SuperwallEvents) it.next()).getRawName());
            }
            this.eventNames = arrayList;
        }
    }
}
