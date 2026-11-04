package com.superwall.sdk.models.entitlements;

import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import java.lang.annotation.Annotation;
import java.util.Set;
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
import kotlinx.serialization.internal.g1;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.z1;
import kotlinx.serialization.v;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public abstract class SubscriptionStatus {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: xf.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubscriptionStatus._init_$_anonymous_();
        }
    });

    @b0
    public static final class Active extends SubscriptionStatus {

        @NotNull
        private final Set<Entitlement> entitlements;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new g1(Entitlement$$serializer.INSTANCE)};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Active> serializer() {
                return SubscriptionStatus$Active$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Active(int i10, Set set, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, SubscriptionStatus$Active$$serializer.INSTANCE.getDescriptor());
            }
            this.entitlements = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Active copy$default(Active active, Set set, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                set = active.entitlements;
            }
            return active.copy(set);
        }

        @a0("entitlements")
        public static /* synthetic */ void getEntitlements$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Active active, e eVar, SerialDescriptor serialDescriptor) {
            SubscriptionStatus.write$Self(active, eVar, serialDescriptor);
            eVar.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], active.entitlements);
        }

        @NotNull
        public final Set<Entitlement> component1() {
            return this.entitlements;
        }

        @NotNull
        public final Active copy(@NotNull Set<Entitlement> entitlements) {
            Intrinsics.checkNotNullParameter(entitlements, "entitlements");
            return new Active(entitlements);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Active) && Intrinsics.areEqual(this.entitlements, ((Active) obj).entitlements);
        }

        @NotNull
        public final Set<Entitlement> getEntitlements() {
            return this.entitlements;
        }

        public int hashCode() {
            return this.entitlements.hashCode();
        }

        @NotNull
        public String toString() {
            return "Active(entitlements=" + this.entitlements + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Active(@NotNull Set<Entitlement> entitlements) {
            super(null);
            Intrinsics.checkNotNullParameter(entitlements, "entitlements");
            this.entitlements = entitlements;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SubscriptionStatus.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<SubscriptionStatus> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    public static final class Inactive extends SubscriptionStatus {

        @NotNull
        public static final Inactive INSTANCE = new Inactive();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: xf.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubscriptionStatus.Inactive._init_$_anonymous_();
            }
        });

        private Inactive() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("com.superwall.sdk.models.entitlements.SubscriptionStatus.Inactive", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Inactive> serializer() {
            return get$cachedSerializer();
        }
    }

    @b0
    public static final class Unknown extends SubscriptionStatus {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: xf.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubscriptionStatus.Unknown._init_$_anonymous_();
            }
        });

        private Unknown() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("com.superwall.sdk.models.entitlements.SubscriptionStatus.Unknown", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Unknown> serializer() {
            return get$cachedSerializer();
        }
    }

    public /* synthetic */ SubscriptionStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new v("com.superwall.sdk.models.entitlements.SubscriptionStatus", j1.d(SubscriptionStatus.class), new d[]{j1.d(Active.class), j1.d(Inactive.class), j1.d(Unknown.class)}, new KSerializer[]{SubscriptionStatus$Active$$serializer.INSTANCE, new z1("com.superwall.sdk.models.entitlements.SubscriptionStatus.Inactive", Inactive.INSTANCE, new Annotation[0]), new z1("com.superwall.sdk.models.entitlements.SubscriptionStatus.Unknown", Unknown.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }

    @n
    public static final /* synthetic */ void write$Self(SubscriptionStatus subscriptionStatus, e eVar, SerialDescriptor serialDescriptor) {
    }

    public final boolean isActive() {
        return this instanceof Active;
    }

    private SubscriptionStatus() {
    }

    public /* synthetic */ SubscriptionStatus(int i10, v2 v2Var) {
    }
}
