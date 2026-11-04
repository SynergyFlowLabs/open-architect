package com.superwall.sdk.delegate;

import com.superwall.sdk.delegate.SubscriptionStatus;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0
public enum SubscriptionStatus {
    ACTIVE,
    INACTIVE,
    UNKNOWN;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: wf.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubscriptionStatus._init_$_anonymous_();
        }
    });

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

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionStatus.values().length];
            try {
                iArr[SubscriptionStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionStatus.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscriptionStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return l0.c("com.superwall.sdk.delegate.SubscriptionStatus", values());
    }

    @NotNull
    public static a<SubscriptionStatus> getEntries() {
        return $ENTRIES;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return "ACTIVE";
        }
        if (i10 == 2) {
            return "INACTIVE";
        }
        if (i10 == 3) {
            return "UNKNOWN";
        }
        throw new k0();
    }
}
