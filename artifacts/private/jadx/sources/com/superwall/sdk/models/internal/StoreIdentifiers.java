package com.superwall.sdk.models.internal;

import com.superwall.sdk.models.internal.StoreIdentifiers;
import hk.a;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.reflect.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.v;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@JsonClassDiscriminator(discriminator = "store")
@b0
public abstract class StoreIdentifiers {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: yf.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StoreIdentifiers._init_$_anonymous_();
        }
    });

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) StoreIdentifiers.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<StoreIdentifiers> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    @a0("STRIPE")
    public static final class Stripe extends StoreIdentifiers {

        @NotNull
        private final String stripeCustomerId;

        @NotNull
        private final List<String> subscriptionIds;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {null, new kotlinx.serialization.internal.f(b3.f315897a)};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Stripe> serializer() {
                return StoreIdentifiers$Stripe$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Stripe(int i10, String str, List list, v2 v2Var) {
            super(i10, v2Var);
            if (3 != (i10 & 3)) {
                g2.b(i10, 3, StoreIdentifiers$Stripe$$serializer.INSTANCE.getDescriptor());
            }
            this.stripeCustomerId = str;
            this.subscriptionIds = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Stripe copy$default(Stripe stripe, String str, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = stripe.stripeCustomerId;
            }
            if ((i10 & 2) != 0) {
                list = stripe.subscriptionIds;
            }
            return stripe.copy(str, list);
        }

        @a0("stripeCustomerId")
        public static /* synthetic */ void getStripeCustomerId$annotations() {
        }

        @a0("stripeSubscriptionIds")
        public static /* synthetic */ void getSubscriptionIds$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Stripe stripe, e eVar, SerialDescriptor serialDescriptor) {
            StoreIdentifiers.write$Self(stripe, eVar, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            eVar.encodeStringElement(serialDescriptor, 0, stripe.stripeCustomerId);
            eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], stripe.subscriptionIds);
        }

        @NotNull
        public final String component1() {
            return this.stripeCustomerId;
        }

        @NotNull
        public final List<String> component2() {
            return this.subscriptionIds;
        }

        @NotNull
        public final Stripe copy(@NotNull String stripeCustomerId, @NotNull List<String> subscriptionIds) {
            Intrinsics.checkNotNullParameter(stripeCustomerId, "stripeCustomerId");
            Intrinsics.checkNotNullParameter(subscriptionIds, "subscriptionIds");
            return new Stripe(stripeCustomerId, subscriptionIds);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Stripe)) {
                return false;
            }
            Stripe stripe = (Stripe) obj;
            return Intrinsics.areEqual(this.stripeCustomerId, stripe.stripeCustomerId) && Intrinsics.areEqual(this.subscriptionIds, stripe.subscriptionIds);
        }

        @NotNull
        public final String getStripeCustomerId() {
            return this.stripeCustomerId;
        }

        @NotNull
        public final List<String> getSubscriptionIds() {
            return this.subscriptionIds;
        }

        public int hashCode() {
            return (this.stripeCustomerId.hashCode() * 31) + this.subscriptionIds.hashCode();
        }

        @NotNull
        public String toString() {
            return "Stripe(stripeCustomerId=" + this.stripeCustomerId + ", subscriptionIds=" + this.subscriptionIds + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Stripe(@NotNull String stripeCustomerId, @NotNull List<String> subscriptionIds) {
            super(null);
            Intrinsics.checkNotNullParameter(stripeCustomerId, "stripeCustomerId");
            Intrinsics.checkNotNullParameter(subscriptionIds, "subscriptionIds");
            this.stripeCustomerId = stripeCustomerId;
            this.subscriptionIds = subscriptionIds;
        }
    }

    @b0
    @a0("UNKNOWN")
    public static final class Unknown extends StoreIdentifiers {

        @NotNull
        private final Map<String, JsonElement> properties;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new e1(b3.f315897a, a.v(JsonElementSerializer.INSTANCE))};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Unknown> serializer() {
                return StoreIdentifiers$Unknown$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Unknown(int i10, Map map, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, StoreIdentifiers$Unknown$$serializer.INSTANCE.getDescriptor());
            }
            this.properties = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Unknown copy$default(Unknown unknown, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = unknown.properties;
            }
            return unknown.copy(map);
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Unknown unknown, e eVar, SerialDescriptor serialDescriptor) {
            StoreIdentifiers.write$Self(unknown, eVar, serialDescriptor);
            eVar.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], unknown.properties);
        }

        @NotNull
        public final Map<String, JsonElement> component1() {
            return this.properties;
        }

        @NotNull
        public final Unknown copy(@NotNull Map<String, ? extends JsonElement> properties) {
            Intrinsics.checkNotNullParameter(properties, "properties");
            return new Unknown(properties);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.areEqual(this.properties, ((Unknown) obj).properties);
        }

        @NotNull
        public final Map<String, JsonElement> getProperties() {
            return this.properties;
        }

        public int hashCode() {
            return this.properties.hashCode();
        }

        @NotNull
        public String toString() {
            return "Unknown(properties=" + this.properties + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Unknown(@NotNull Map<String, ? extends JsonElement> properties) {
            super(null);
            Intrinsics.checkNotNullParameter(properties, "properties");
            this.properties = properties;
        }
    }

    public /* synthetic */ StoreIdentifiers(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new v("com.superwall.sdk.models.internal.StoreIdentifiers", j1.d(StoreIdentifiers.class), new d[]{j1.d(Stripe.class), j1.d(Unknown.class)}, new KSerializer[]{StoreIdentifiers$Stripe$$serializer.INSTANCE, StoreIdentifiers$Unknown$$serializer.INSTANCE}, new Annotation[]{new RedemptionResult$Error$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("store")});
    }

    @n
    public static final /* synthetic */ void write$Self(StoreIdentifiers storeIdentifiers, e eVar, SerialDescriptor serialDescriptor) {
    }

    private StoreIdentifiers() {
    }

    public /* synthetic */ StoreIdentifiers(int i10, v2 v2Var) {
    }
}
