package com.superwall.sdk.models.triggers;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class RawExperiment {

    @NotNull
    private String groupId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private String f267449id;

    @NotNull
    private List<VariantOption> variants;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, new kotlinx.serialization.internal.f(VariantOption$$serializer.INSTANCE)};

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<RawExperiment> serializer() {
            return RawExperiment$$serializer.INSTANCE;
        }

        @NotNull
        public final RawExperiment stub() {
            return new RawExperiment("abc", "def", CollectionsKt.listOf(VariantOption.Companion.stub()));
        }

        private Companion() {
        }
    }

    public /* synthetic */ RawExperiment(int i10, String str, String str2, List list, v2 v2Var) {
        if (7 != (i10 & 7)) {
            g2.b(i10, 7, RawExperiment$$serializer.INSTANCE.getDescriptor());
        }
        this.f267449id = str;
        this.groupId = str2;
        this.variants = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RawExperiment copy$default(RawExperiment rawExperiment, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rawExperiment.f267449id;
        }
        if ((i10 & 2) != 0) {
            str2 = rawExperiment.groupId;
        }
        if ((i10 & 4) != 0) {
            list = rawExperiment.variants;
        }
        return rawExperiment.copy(str, str2, list);
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(RawExperiment rawExperiment, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeStringElement(serialDescriptor, 0, rawExperiment.f267449id);
        eVar.encodeStringElement(serialDescriptor, 1, rawExperiment.groupId);
        eVar.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], rawExperiment.variants);
    }

    @NotNull
    public final String component1() {
        return this.f267449id;
    }

    @NotNull
    public final String component2() {
        return this.groupId;
    }

    @NotNull
    public final List<VariantOption> component3() {
        return this.variants;
    }

    @NotNull
    public final RawExperiment copy(@NotNull String id2, @NotNull String groupId, @NotNull List<VariantOption> variants) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(variants, "variants");
        return new RawExperiment(id2, groupId, variants);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawExperiment)) {
            return false;
        }
        RawExperiment rawExperiment = (RawExperiment) obj;
        return Intrinsics.areEqual(this.f267449id, rawExperiment.f267449id) && Intrinsics.areEqual(this.groupId, rawExperiment.groupId) && Intrinsics.areEqual(this.variants, rawExperiment.variants);
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final String getId() {
        return this.f267449id;
    }

    @NotNull
    public final List<VariantOption> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return (((this.f267449id.hashCode() * 31) + this.groupId.hashCode()) * 31) + this.variants.hashCode();
    }

    public final void setGroupId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.groupId = str;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f267449id = str;
    }

    public final void setVariants(@NotNull List<VariantOption> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.variants = list;
    }

    @NotNull
    public String toString() {
        return "RawExperiment(id=" + this.f267449id + ", groupId=" + this.groupId + ", variants=" + this.variants + ")";
    }

    public RawExperiment(@NotNull String id2, @NotNull String groupId, @NotNull List<VariantOption> variants) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(variants, "variants");
        this.f267449id = id2;
        this.groupId = groupId;
        this.variants = variants;
    }
}
