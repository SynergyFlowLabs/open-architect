package com.superwall.sdk.models.internal;

import com.superwall.sdk.models.internal.RedemptionOwnershipType;
import java.lang.annotation.Annotation;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0
public enum RedemptionOwnershipType {
    Device,
    AppUser;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: yf.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RedemptionOwnershipType._init_$_anonymous_();
        }
    });

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) RedemptionOwnershipType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<RedemptionOwnershipType> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i10 = 1 >> 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return l0.a("com.superwall.sdk.models.internal.RedemptionOwnershipType", values(), new String[]{"device", "app_user"}, new Annotation[][]{null, null}, null);
    }

    @NotNull
    public static a<RedemptionOwnershipType> getEntries() {
        return $ENTRIES;
    }
}
