package com.superwall.sdk.models.triggers;

import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.s0;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class VariantOption {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private String f267450id;

    @Nullable
    private String paywallId;
    private int percentage;

    @NotNull
    private Experiment.Variant.VariantType type;

    @NotNull
    private final Experiment.Variant variant;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {Experiment.Variant.VariantType.Companion.serializer(), null, null, null};

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<VariantOption> serializer() {
            return VariantOption$$serializer.INSTANCE;
        }

        @NotNull
        public final VariantOption stub() {
            Experiment.Variant.VariantType variantType = Experiment.Variant.VariantType.TREATMENT;
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return new VariantOption(variantType, string, 100, UUID.randomUUID().toString());
        }

        private Companion() {
        }
    }

    public /* synthetic */ VariantOption(int i10, Experiment.Variant.VariantType variantType, String str, int i11, String str2, v2 v2Var) {
        if (7 != (i10 & 7)) {
            g2.b(i10, 7, VariantOption$$serializer.INSTANCE.getDescriptor());
        }
        this.type = variantType;
        this.f267450id = str;
        this.percentage = i11;
        if ((i10 & 8) == 0) {
            this.paywallId = null;
        } else {
            this.paywallId = str2;
        }
        this.variant = toVariant();
    }

    public static /* synthetic */ VariantOption copy$default(VariantOption variantOption, Experiment.Variant.VariantType variantType, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            variantType = variantOption.type;
        }
        if ((i11 & 2) != 0) {
            str = variantOption.f267450id;
        }
        if ((i11 & 4) != 0) {
            i10 = variantOption.percentage;
        }
        if ((i11 & 8) != 0) {
            str2 = variantOption.paywallId;
        }
        return variantOption.copy(variantType, str, i10, str2);
    }

    @a0("variant_id")
    public static /* synthetic */ void getId$annotations() {
    }

    @a0("paywall_identifier")
    public static /* synthetic */ void getPaywallId$annotations() {
    }

    @a0("percentage")
    public static /* synthetic */ void getPercentage$annotations() {
    }

    @a0("variant_type")
    public static /* synthetic */ void getType$annotations() {
    }

    @s0
    public static /* synthetic */ void getVariant$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(VariantOption variantOption, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], variantOption.type);
        eVar.encodeStringElement(serialDescriptor, 1, variantOption.f267450id);
        eVar.encodeIntElement(serialDescriptor, 2, variantOption.percentage);
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 3) && variantOption.paywallId == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(serialDescriptor, 3, b3.f315897a, variantOption.paywallId);
    }

    @NotNull
    public final Experiment.Variant.VariantType component1() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.f267450id;
    }

    public final int component3() {
        return this.percentage;
    }

    @Nullable
    public final String component4() {
        return this.paywallId;
    }

    @NotNull
    public final VariantOption copy(@NotNull Experiment.Variant.VariantType type, @NotNull String id2, int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new VariantOption(type, id2, i10, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariantOption)) {
            return false;
        }
        VariantOption variantOption = (VariantOption) obj;
        return this.type == variantOption.type && Intrinsics.areEqual(this.f267450id, variantOption.f267450id) && this.percentage == variantOption.percentage && Intrinsics.areEqual(this.paywallId, variantOption.paywallId);
    }

    @NotNull
    public final String getId() {
        return this.f267450id;
    }

    @Nullable
    public final String getPaywallId() {
        return this.paywallId;
    }

    public final int getPercentage() {
        return this.percentage;
    }

    @NotNull
    public final Experiment.Variant.VariantType getType() {
        return this.type;
    }

    @NotNull
    public final Experiment.Variant getVariant() {
        return this.variant;
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + this.f267450id.hashCode()) * 31) + Integer.hashCode(this.percentage)) * 31;
        String str = this.paywallId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f267450id = str;
    }

    public final void setPaywallId(@Nullable String str) {
        this.paywallId = str;
    }

    public final void setPercentage(int i10) {
        this.percentage = i10;
    }

    public final void setType(@NotNull Experiment.Variant.VariantType variantType) {
        Intrinsics.checkNotNullParameter(variantType, "<set-?>");
        this.type = variantType;
    }

    @NotNull
    public String toString() {
        return "VariantOption(type=" + this.type + ", id=" + this.f267450id + ", percentage=" + this.percentage + ", paywallId=" + this.paywallId + ")";
    }

    @NotNull
    public final Experiment.Variant toVariant() {
        return new Experiment.Variant(this.f267450id, this.type, this.paywallId);
    }

    public VariantOption(@NotNull Experiment.Variant.VariantType type, @NotNull String id2, int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.type = type;
        this.f267450id = id2;
        this.percentage = i10;
        this.paywallId = str;
        this.variant = toVariant();
    }

    public /* synthetic */ VariantOption(Experiment.Variant.VariantType variantType, String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(variantType, str, i10, (i11 & 8) != 0 ? null : str2);
    }
}
