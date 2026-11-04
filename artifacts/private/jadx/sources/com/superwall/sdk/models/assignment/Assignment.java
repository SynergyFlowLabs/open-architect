package com.superwall.sdk.models.assignment;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class Assignment {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private String experimentId;

    @NotNull
    private String variantId;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<Assignment> serializer() {
            return Assignment$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Assignment(int i10, String str, String str2, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, Assignment$$serializer.INSTANCE.getDescriptor());
        }
        this.experimentId = str;
        this.variantId = str2;
    }

    public static /* synthetic */ Assignment copy$default(Assignment assignment, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = assignment.experimentId;
        }
        if ((i10 & 2) != 0) {
            str2 = assignment.variantId;
        }
        return assignment.copy(str, str2);
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(Assignment assignment, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, assignment.experimentId);
        eVar.encodeStringElement(serialDescriptor, 1, assignment.variantId);
    }

    @NotNull
    public final String component1() {
        return this.experimentId;
    }

    @NotNull
    public final String component2() {
        return this.variantId;
    }

    @NotNull
    public final Assignment copy(@NotNull String experimentId, @NotNull String variantId) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(variantId, "variantId");
        return new Assignment(experimentId, variantId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Assignment)) {
            return false;
        }
        Assignment assignment = (Assignment) obj;
        return Intrinsics.areEqual(this.experimentId, assignment.experimentId) && Intrinsics.areEqual(this.variantId, assignment.variantId);
    }

    @NotNull
    public final String getExperimentId() {
        return this.experimentId;
    }

    @NotNull
    public final String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        return (this.experimentId.hashCode() * 31) + this.variantId.hashCode();
    }

    public final void setExperimentId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.experimentId = str;
    }

    public final void setVariantId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.variantId = str;
    }

    @NotNull
    public String toString() {
        return "Assignment(experimentId=" + this.experimentId + ", variantId=" + this.variantId + ")";
    }

    public Assignment(@NotNull String experimentId, @NotNull String variantId) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(variantId, "variantId");
        this.experimentId = experimentId;
        this.variantId = variantId;
    }
}
