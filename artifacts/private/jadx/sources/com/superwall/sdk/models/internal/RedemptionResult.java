package com.superwall.sdk.models.internal;

import com.superwall.sdk.models.internal.RedemptionResult;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
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
@JsonClassDiscriminator(discriminator = "status")
@b0
public abstract class RedemptionResult {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: yf.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RedemptionResult._init_$_anonymous_();
        }
    });

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) RedemptionResult.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<RedemptionResult> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    @a0("ERROR")
    public static final class Error extends RedemptionResult {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final String code;

        @NotNull
        private final ErrorInfo error;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Error> serializer() {
                return RedemptionResult$Error$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Error(int i10, String str, ErrorInfo errorInfo, v2 v2Var) {
            super(i10, v2Var);
            if (3 != (i10 & 3)) {
                g2.b(i10, 3, RedemptionResult$Error$$serializer.INSTANCE.getDescriptor());
            }
            this.code = str;
            this.error = errorInfo;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, ErrorInfo errorInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = error.code;
            }
            if ((i10 & 2) != 0) {
                errorInfo = error.error;
            }
            return error.copy(str, errorInfo);
        }

        @a0("code")
        public static /* synthetic */ void getCode$annotations() {
        }

        @a0("error")
        public static /* synthetic */ void getError$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Error error, e eVar, SerialDescriptor serialDescriptor) {
            RedemptionResult.write$Self(error, eVar, serialDescriptor);
            eVar.encodeStringElement(serialDescriptor, 0, error.getCode());
            eVar.encodeSerializableElement(serialDescriptor, 1, ErrorInfo$$serializer.INSTANCE, error.error);
        }

        @NotNull
        public final String component1() {
            return this.code;
        }

        @NotNull
        public final ErrorInfo component2() {
            return this.error;
        }

        @NotNull
        public final Error copy(@NotNull String code, @NotNull ErrorInfo error) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(code, error);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.code, error.code) && Intrinsics.areEqual(this.error, error.error);
        }

        @Override // com.superwall.sdk.models.internal.RedemptionResult
        @NotNull
        public String getCode() {
            return this.code;
        }

        @NotNull
        public final ErrorInfo getError() {
            return this.error;
        }

        public int hashCode() {
            return (this.code.hashCode() * 31) + this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(code=" + this.code + ", error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull String code, @NotNull ErrorInfo error) {
            super(null);
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(error, "error");
            this.code = code;
            this.error = error;
        }
    }

    @b0
    @a0("CODE_EXPIRED")
    public static final class Expired extends RedemptionResult {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final String code;

        @NotNull
        private final ExpiredInfo expired;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Expired> serializer() {
                return RedemptionResult$Expired$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Expired(int i10, String str, ExpiredInfo expiredInfo, v2 v2Var) {
            super(i10, v2Var);
            if (3 != (i10 & 3)) {
                g2.b(i10, 3, RedemptionResult$Expired$$serializer.INSTANCE.getDescriptor());
            }
            this.code = str;
            this.expired = expiredInfo;
        }

        public static /* synthetic */ Expired copy$default(Expired expired, String str, ExpiredInfo expiredInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = expired.code;
            }
            if ((i10 & 2) != 0) {
                expiredInfo = expired.expired;
            }
            return expired.copy(str, expiredInfo);
        }

        @a0("code")
        public static /* synthetic */ void getCode$annotations() {
        }

        @a0("expired")
        public static /* synthetic */ void getExpired$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Expired expired, e eVar, SerialDescriptor serialDescriptor) {
            RedemptionResult.write$Self(expired, eVar, serialDescriptor);
            eVar.encodeStringElement(serialDescriptor, 0, expired.getCode());
            eVar.encodeSerializableElement(serialDescriptor, 1, ExpiredInfo$$serializer.INSTANCE, expired.expired);
        }

        @NotNull
        public final String component1() {
            return this.code;
        }

        @NotNull
        public final ExpiredInfo component2() {
            return this.expired;
        }

        @NotNull
        public final Expired copy(@NotNull String code, @NotNull ExpiredInfo expired) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(expired, "expired");
            return new Expired(code, expired);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Expired)) {
                return false;
            }
            Expired expired = (Expired) obj;
            return Intrinsics.areEqual(this.code, expired.code) && Intrinsics.areEqual(this.expired, expired.expired);
        }

        @Override // com.superwall.sdk.models.internal.RedemptionResult
        @NotNull
        public String getCode() {
            return this.code;
        }

        @NotNull
        public final ExpiredInfo getExpired() {
            return this.expired;
        }

        public int hashCode() {
            return (this.code.hashCode() * 31) + this.expired.hashCode();
        }

        @NotNull
        public String toString() {
            return "Expired(code=" + this.code + ", expired=" + this.expired + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Expired(@NotNull String code, @NotNull ExpiredInfo expired) {
            super(null);
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(expired, "expired");
            this.code = code;
            this.expired = expired;
        }
    }

    @b0
    @a0("EXPIRED_SUBSCRIPTION")
    public static final class ExpiredSubscription extends RedemptionResult {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final String code;

        @NotNull
        private final RedemptionInfo redemptionInfo;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<ExpiredSubscription> serializer() {
                return RedemptionResult$ExpiredSubscription$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ExpiredSubscription(int i10, String str, RedemptionInfo redemptionInfo, v2 v2Var) {
            super(i10, v2Var);
            if (3 != (i10 & 3)) {
                g2.b(i10, 3, RedemptionResult$ExpiredSubscription$$serializer.INSTANCE.getDescriptor());
            }
            this.code = str;
            this.redemptionInfo = redemptionInfo;
        }

        public static /* synthetic */ ExpiredSubscription copy$default(ExpiredSubscription expiredSubscription, String str, RedemptionInfo redemptionInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = expiredSubscription.code;
            }
            if ((i10 & 2) != 0) {
                redemptionInfo = expiredSubscription.redemptionInfo;
            }
            return expiredSubscription.copy(str, redemptionInfo);
        }

        @a0("code")
        public static /* synthetic */ void getCode$annotations() {
        }

        @a0("redemptionInfo")
        public static /* synthetic */ void getRedemptionInfo$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(ExpiredSubscription expiredSubscription, e eVar, SerialDescriptor serialDescriptor) {
            RedemptionResult.write$Self(expiredSubscription, eVar, serialDescriptor);
            eVar.encodeStringElement(serialDescriptor, 0, expiredSubscription.getCode());
            eVar.encodeSerializableElement(serialDescriptor, 1, RedemptionInfo$$serializer.INSTANCE, expiredSubscription.redemptionInfo);
        }

        @NotNull
        public final String component1() {
            return this.code;
        }

        @NotNull
        public final RedemptionInfo component2() {
            return this.redemptionInfo;
        }

        @NotNull
        public final ExpiredSubscription copy(@NotNull String code, @NotNull RedemptionInfo redemptionInfo) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(redemptionInfo, "redemptionInfo");
            return new ExpiredSubscription(code, redemptionInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpiredSubscription)) {
                return false;
            }
            ExpiredSubscription expiredSubscription = (ExpiredSubscription) obj;
            return Intrinsics.areEqual(this.code, expiredSubscription.code) && Intrinsics.areEqual(this.redemptionInfo, expiredSubscription.redemptionInfo);
        }

        @Override // com.superwall.sdk.models.internal.RedemptionResult
        @NotNull
        public String getCode() {
            return this.code;
        }

        @NotNull
        public final RedemptionInfo getRedemptionInfo() {
            return this.redemptionInfo;
        }

        public int hashCode() {
            return (this.code.hashCode() * 31) + this.redemptionInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "ExpiredSubscription(code=" + this.code + ", redemptionInfo=" + this.redemptionInfo + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpiredSubscription(@NotNull String code, @NotNull RedemptionInfo redemptionInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(redemptionInfo, "redemptionInfo");
            this.code = code;
            this.redemptionInfo = redemptionInfo;
        }
    }

    @b0
    @a0("INVALID_CODE")
    public static final class InvalidCode extends RedemptionResult {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final String code;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<InvalidCode> serializer() {
                return RedemptionResult$InvalidCode$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ InvalidCode(int i10, String str, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, RedemptionResult$InvalidCode$$serializer.INSTANCE.getDescriptor());
            }
            this.code = str;
        }

        public static /* synthetic */ InvalidCode copy$default(InvalidCode invalidCode, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = invalidCode.code;
            }
            return invalidCode.copy(str);
        }

        @a0("code")
        public static /* synthetic */ void getCode$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(InvalidCode invalidCode, e eVar, SerialDescriptor serialDescriptor) {
            RedemptionResult.write$Self(invalidCode, eVar, serialDescriptor);
            int i10 = 7 ^ 0;
            eVar.encodeStringElement(serialDescriptor, 0, invalidCode.getCode());
        }

        @NotNull
        public final String component1() {
            return this.code;
        }

        @NotNull
        public final InvalidCode copy(@NotNull String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new InvalidCode(code);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidCode) && Intrinsics.areEqual(this.code, ((InvalidCode) obj).code);
        }

        @Override // com.superwall.sdk.models.internal.RedemptionResult
        @NotNull
        public String getCode() {
            return this.code;
        }

        public int hashCode() {
            return this.code.hashCode();
        }

        @NotNull
        public String toString() {
            return "InvalidCode(code=" + this.code + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidCode(@NotNull String code) {
            super(null);
            Intrinsics.checkNotNullParameter(code, "code");
            this.code = code;
        }
    }

    @b0
    public static final class PaywallInfo {

        @NotNull
        private final String experimentId;

        @NotNull
        private final String identifier;

        @NotNull
        private final String placementName;

        @NotNull
        private final Map<String, JsonElement> placementParams;

        @Nullable
        private final String productIdentifier;

        @NotNull
        private final String variantId;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {null, null, new e1(b3.f315897a, JsonElementSerializer.INSTANCE), null, null, null};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<PaywallInfo> serializer() {
                return RedemptionResult$PaywallInfo$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            int i10 = 1 << 6;
        }

        public /* synthetic */ PaywallInfo(int i10, String str, String str2, Map map, String str3, String str4, String str5, v2 v2Var) {
            if (31 != (i10 & 31)) {
                g2.b(i10, 31, RedemptionResult$PaywallInfo$$serializer.INSTANCE.getDescriptor());
            }
            this.identifier = str;
            this.placementName = str2;
            this.placementParams = map;
            this.variantId = str3;
            this.experimentId = str4;
            if ((i10 & 32) == 0) {
                this.productIdentifier = null;
            } else {
                this.productIdentifier = str5;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaywallInfo copy$default(PaywallInfo paywallInfo, String str, String str2, Map map, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = paywallInfo.identifier;
            }
            if ((i10 & 2) != 0) {
                str2 = paywallInfo.placementName;
            }
            if ((i10 & 4) != 0) {
                map = paywallInfo.placementParams;
            }
            if ((i10 & 8) != 0) {
                str3 = paywallInfo.variantId;
            }
            if ((i10 & 16) != 0) {
                str4 = paywallInfo.experimentId;
            }
            if ((i10 & 32) != 0) {
                str5 = paywallInfo.productIdentifier;
            }
            String str6 = str4;
            String str7 = str5;
            return paywallInfo.copy(str, str2, map, str3, str6, str7);
        }

        @a0("experimentId")
        public static /* synthetic */ void getExperimentId$annotations() {
        }

        @a0("identifier")
        public static /* synthetic */ void getIdentifier$annotations() {
        }

        @a0("placementName")
        public static /* synthetic */ void getPlacementName$annotations() {
        }

        @a0("placementParams")
        public static /* synthetic */ void getPlacementParams$annotations() {
        }

        @a0("productIdentifier")
        public static /* synthetic */ void getProductIdentifier$annotations() {
        }

        @a0("variantId")
        public static /* synthetic */ void getVariantId$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(PaywallInfo paywallInfo, e eVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            eVar.encodeStringElement(serialDescriptor, 0, paywallInfo.identifier);
            eVar.encodeStringElement(serialDescriptor, 1, paywallInfo.placementName);
            eVar.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], paywallInfo.placementParams);
            eVar.encodeStringElement(serialDescriptor, 3, paywallInfo.variantId);
            eVar.encodeStringElement(serialDescriptor, 4, paywallInfo.experimentId);
            if (eVar.shouldEncodeElementDefault(serialDescriptor, 5) || paywallInfo.productIdentifier != null) {
                eVar.encodeNullableSerializableElement(serialDescriptor, 5, b3.f315897a, paywallInfo.productIdentifier);
            }
        }

        @NotNull
        public final String component1() {
            return this.identifier;
        }

        @NotNull
        public final String component2() {
            return this.placementName;
        }

        @NotNull
        public final Map<String, JsonElement> component3() {
            return this.placementParams;
        }

        @NotNull
        public final String component4() {
            return this.variantId;
        }

        @NotNull
        public final String component5() {
            return this.experimentId;
        }

        @Nullable
        public final String component6() {
            return this.productIdentifier;
        }

        @NotNull
        public final PaywallInfo copy(@NotNull String identifier, @NotNull String placementName, @NotNull Map<String, ? extends JsonElement> placementParams, @NotNull String variantId, @NotNull String experimentId, @Nullable String str) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(placementParams, "placementParams");
            Intrinsics.checkNotNullParameter(variantId, "variantId");
            Intrinsics.checkNotNullParameter(experimentId, "experimentId");
            return new PaywallInfo(identifier, placementName, placementParams, variantId, experimentId, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaywallInfo)) {
                return false;
            }
            PaywallInfo paywallInfo = (PaywallInfo) obj;
            return Intrinsics.areEqual(this.identifier, paywallInfo.identifier) && Intrinsics.areEqual(this.placementName, paywallInfo.placementName) && Intrinsics.areEqual(this.placementParams, paywallInfo.placementParams) && Intrinsics.areEqual(this.variantId, paywallInfo.variantId) && Intrinsics.areEqual(this.experimentId, paywallInfo.experimentId) && Intrinsics.areEqual(this.productIdentifier, paywallInfo.productIdentifier);
        }

        @NotNull
        public final String getExperimentId() {
            return this.experimentId;
        }

        @NotNull
        public final String getIdentifier() {
            return this.identifier;
        }

        @NotNull
        public final String getPlacementName() {
            return this.placementName;
        }

        @NotNull
        public final Map<String, JsonElement> getPlacementParams() {
            return this.placementParams;
        }

        @Nullable
        public final String getProductIdentifier() {
            return this.productIdentifier;
        }

        @NotNull
        public final String getVariantId() {
            return this.variantId;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.identifier.hashCode() * 31) + this.placementName.hashCode()) * 31) + this.placementParams.hashCode()) * 31) + this.variantId.hashCode()) * 31) + this.experimentId.hashCode()) * 31;
            String str = this.productIdentifier;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "PaywallInfo(identifier=" + this.identifier + ", placementName=" + this.placementName + ", placementParams=" + this.placementParams + ", variantId=" + this.variantId + ", experimentId=" + this.experimentId + ", productIdentifier=" + this.productIdentifier + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PaywallInfo(@NotNull String identifier, @NotNull String placementName, @NotNull Map<String, ? extends JsonElement> placementParams, @NotNull String variantId, @NotNull String experimentId, @Nullable String str) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(placementParams, "placementParams");
            Intrinsics.checkNotNullParameter(variantId, "variantId");
            Intrinsics.checkNotNullParameter(experimentId, "experimentId");
            this.identifier = identifier;
            this.placementName = placementName;
            this.placementParams = placementParams;
            this.variantId = variantId;
            this.experimentId = experimentId;
            this.productIdentifier = str;
        }

        public /* synthetic */ PaywallInfo(String str, String str2, Map map, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, map, str3, str4, (i10 & 32) != 0 ? null : str5);
        }
    }

    @b0(with = DirectSuccessSerializer.class)
    @a0("SUCCESS")
    public static final class Success extends RedemptionResult {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final String code;

        @NotNull
        private final RedemptionInfo redemptionInfo;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Success> serializer() {
                return DirectSuccessSerializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String code, @NotNull RedemptionInfo redemptionInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(redemptionInfo, "redemptionInfo");
            int i10 = 5 ^ 0;
            this.code = code;
            this.redemptionInfo = redemptionInfo;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, RedemptionInfo redemptionInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.code;
            }
            if ((i10 & 2) != 0) {
                redemptionInfo = success.redemptionInfo;
            }
            return success.copy(str, redemptionInfo);
        }

        @a0("code")
        public static /* synthetic */ void getCode$annotations() {
        }

        @a0("redemption_info")
        public static /* synthetic */ void getRedemptionInfo$annotations() {
        }

        @NotNull
        public final String component1() {
            return this.code;
        }

        @NotNull
        public final RedemptionInfo component2() {
            return this.redemptionInfo;
        }

        @NotNull
        public final Success copy(@NotNull String code, @NotNull RedemptionInfo redemptionInfo) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(redemptionInfo, "redemptionInfo");
            return new Success(code, redemptionInfo);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.code, success.code) && Intrinsics.areEqual(this.redemptionInfo, success.redemptionInfo);
        }

        @Override // com.superwall.sdk.models.internal.RedemptionResult
        @NotNull
        public String getCode() {
            return this.code;
        }

        @NotNull
        public final RedemptionInfo getRedemptionInfo() {
            return this.redemptionInfo;
        }

        public int hashCode() {
            return (this.code.hashCode() * 31) + this.redemptionInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(code=" + this.code + ", redemptionInfo=" + this.redemptionInfo + ")";
        }
    }

    public /* synthetic */ RedemptionResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new v("com.superwall.sdk.models.internal.RedemptionResult", j1.d(RedemptionResult.class), new d[]{j1.d(Error.class), j1.d(Expired.class), j1.d(ExpiredSubscription.class), j1.d(InvalidCode.class), j1.d(Success.class)}, new KSerializer[]{RedemptionResult$Error$$serializer.INSTANCE, RedemptionResult$Expired$$serializer.INSTANCE, RedemptionResult$ExpiredSubscription$$serializer.INSTANCE, RedemptionResult$InvalidCode$$serializer.INSTANCE, DirectSuccessSerializer.INSTANCE}, new Annotation[]{new RedemptionResult$Error$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("status")});
    }

    @n
    public static final /* synthetic */ void write$Self(RedemptionResult redemptionResult, e eVar, SerialDescriptor serialDescriptor) {
    }

    @NotNull
    public abstract String getCode();

    @NotNull
    public final List<String> getStripeSubscriptionId() {
        StoreIdentifiers.Stripe stripe;
        List<String> subscriptionIds;
        if (!(this instanceof Success)) {
            return CollectionsKt.emptyList();
        }
        Success success = (Success) this;
        PurchaserInfo purchaserInfo = success.getRedemptionInfo().getPurchaserInfo();
        if (!((purchaserInfo != null ? purchaserInfo.getStoreIdentifiers() : null) instanceof StoreIdentifiers.Stripe)) {
            return CollectionsKt.emptyList();
        }
        PurchaserInfo purchaserInfo2 = success.getRedemptionInfo().getPurchaserInfo();
        return (purchaserInfo2 == null || (stripe = (StoreIdentifiers.Stripe) purchaserInfo2.getStoreIdentifiers()) == null || (subscriptionIds = stripe.getSubscriptionIds()) == null) ? CollectionsKt.emptyList() : subscriptionIds;
    }

    private RedemptionResult() {
    }

    public /* synthetic */ RedemptionResult(int i10, v2 v2Var) {
    }
}
