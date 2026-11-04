package com.superwall.sdk.models.triggers;

import com.superwall.sdk.models.triggers.Experiment;
import java.lang.annotation.Annotation;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.l0;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class Experiment {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String groupId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f267447id;

    @NotNull
    private final Variant variant;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Experiment presentById(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new Experiment(id2, "", new Variant("", Variant.VariantType.TREATMENT, id2));
        }

        @NotNull
        public final KSerializer<Experiment> serializer() {
            return Experiment$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @b0
    public static final class Variant {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NotNull
        private final String f267448id;

        @Nullable
        private final String paywallId;

        @NotNull
        private final VariantType type;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {null, VariantType.Companion.serializer(), null};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Variant> serializer() {
                return Experiment$Variant$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @b0
        public enum VariantType {
            TREATMENT,
            HOLDOUT;

            private static final /* synthetic */ a $ENTRIES = c.c(values());

            @NotNull
            public static final Companion Companion = new Companion(null);

            @NotNull
            private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: bg.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Experiment.Variant.VariantType._init_$_anonymous_();
                }
            });

            public static final class Companion {
                private Companion() {
                }

                private final /* synthetic */ KSerializer get$cachedSerializer() {
                    return (KSerializer) VariantType.$cachedSerializer$delegate.getValue();
                }

                @NotNull
                public final KSerializer<VariantType> serializer() {
                    return get$cachedSerializer();
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return l0.a("com.superwall.sdk.models.triggers.Experiment.Variant.VariantType", values(), new String[]{"TREATMENT", "HOLDOUT"}, new Annotation[][]{null, null}, null);
            }

            @NotNull
            public static a<VariantType> getEntries() {
                return $ENTRIES;
            }
        }

        static {
            int i10 = 6 | 3;
        }

        public /* synthetic */ Variant(int i10, String str, VariantType variantType, String str2, v2 v2Var) {
            if (7 != (i10 & 7)) {
                g2.b(i10, 7, Experiment$Variant$$serializer.INSTANCE.getDescriptor());
            }
            this.f267448id = str;
            this.type = variantType;
            this.paywallId = str2;
        }

        public static /* synthetic */ Variant copy$default(Variant variant, String str, VariantType variantType, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = variant.f267448id;
            }
            if ((i10 & 2) != 0) {
                variantType = variant.type;
            }
            if ((i10 & 4) != 0) {
                str2 = variant.paywallId;
            }
            return variant.copy(str, variantType, str2);
        }

        @a0("id")
        public static /* synthetic */ void getId$annotations() {
        }

        @a0("paywall_identifier")
        public static /* synthetic */ void getPaywallId$annotations() {
        }

        @a0("type")
        public static /* synthetic */ void getType$annotations() {
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Variant variant, e eVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            eVar.encodeStringElement(serialDescriptor, 0, variant.f267448id);
            eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], variant.type);
            eVar.encodeNullableSerializableElement(serialDescriptor, 2, b3.f315897a, variant.paywallId);
        }

        @NotNull
        public final String component1() {
            return this.f267448id;
        }

        @NotNull
        public final VariantType component2() {
            return this.type;
        }

        @Nullable
        public final String component3() {
            return this.paywallId;
        }

        @NotNull
        public final Variant copy(@NotNull String id2, @NotNull VariantType type, @Nullable String str) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            return new Variant(id2, type, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Variant)) {
                return false;
            }
            Variant variant = (Variant) obj;
            return Intrinsics.areEqual(this.f267448id, variant.f267448id) && this.type == variant.type && Intrinsics.areEqual(this.paywallId, variant.paywallId);
        }

        @NotNull
        public final String getId() {
            return this.f267448id;
        }

        @Nullable
        public final String getPaywallId() {
            return this.paywallId;
        }

        @NotNull
        public final VariantType getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = ((this.f267448id.hashCode() * 31) + this.type.hashCode()) * 31;
            String str = this.paywallId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "Variant(id=" + this.f267448id + ", type=" + this.type + ", paywallId=" + this.paywallId + ")";
        }

        public Variant(@NotNull String id2, @NotNull VariantType type, @Nullable String str) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f267448id = id2;
            this.type = type;
            this.paywallId = str;
        }
    }

    public /* synthetic */ Experiment(int i10, String str, String str2, Variant variant, v2 v2Var) {
        if (7 != (i10 & 7)) {
            g2.b(i10, 7, Experiment$$serializer.INSTANCE.getDescriptor());
        }
        this.f267447id = str;
        this.groupId = str2;
        this.variant = variant;
    }

    public static /* synthetic */ Experiment copy$default(Experiment experiment, String str, String str2, Variant variant, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = experiment.f267447id;
        }
        if ((i10 & 2) != 0) {
            str2 = experiment.groupId;
        }
        if ((i10 & 4) != 0) {
            variant = experiment.variant;
        }
        return experiment.copy(str, str2, variant);
    }

    @a0("trigger_experiment_group_id")
    public static /* synthetic */ void getGroupId$annotations() {
    }

    @a0("experiment_id")
    public static /* synthetic */ void getId$annotations() {
    }

    @a0("variant")
    public static /* synthetic */ void getVariant$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(Experiment experiment, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, experiment.f267447id);
        eVar.encodeStringElement(serialDescriptor, 1, experiment.groupId);
        int i10 = 3 | 2;
        eVar.encodeSerializableElement(serialDescriptor, 2, Experiment$Variant$$serializer.INSTANCE, experiment.variant);
    }

    @NotNull
    public final String component1() {
        return this.f267447id;
    }

    @NotNull
    public final String component2() {
        return this.groupId;
    }

    @NotNull
    public final Variant component3() {
        return this.variant;
    }

    @NotNull
    public final Experiment copy(@NotNull String id2, @NotNull String groupId, @NotNull Variant variant) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(variant, "variant");
        return new Experiment(id2, groupId, variant);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Experiment)) {
            return false;
        }
        Experiment experiment = (Experiment) obj;
        return Intrinsics.areEqual(this.f267447id, experiment.f267447id) && Intrinsics.areEqual(this.groupId, experiment.groupId) && Intrinsics.areEqual(this.variant, experiment.variant);
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final String getId() {
        return this.f267447id;
    }

    @NotNull
    public final Variant getVariant() {
        return this.variant;
    }

    public int hashCode() {
        return (((this.f267447id.hashCode() * 31) + this.groupId.hashCode()) * 31) + this.variant.hashCode();
    }

    @NotNull
    public String toString() {
        return "Experiment(id=" + this.f267447id + ", groupId=" + this.groupId + ", variant=" + this.variant + ")";
    }

    public Experiment(@NotNull String id2, @NotNull String groupId, @NotNull Variant variant) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f267447id = id2;
        this.groupId = groupId;
        this.variant = variant;
    }
}
