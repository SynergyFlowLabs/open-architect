package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.models.Attribute;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class AttributeData {
    public static final int $stable = 8;

    @NotNull
    private final Attribute attribute;
    private final boolean isFormDisabled;

    @NotNull
    private final String partId;

    public AttributeData(@NotNull Attribute attribute, @NotNull String partId, boolean z10) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(partId, "partId");
        this.attribute = attribute;
        this.partId = partId;
        this.isFormDisabled = z10;
    }

    public static /* synthetic */ AttributeData copy$default(AttributeData attributeData, Attribute attribute, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            attribute = attributeData.attribute;
        }
        if ((i10 & 2) != 0) {
            str = attributeData.partId;
        }
        if ((i10 & 4) != 0) {
            z10 = attributeData.isFormDisabled;
        }
        return attributeData.copy(attribute, str, z10);
    }

    @NotNull
    public final Attribute component1() {
        return this.attribute;
    }

    @NotNull
    public final String component2() {
        return this.partId;
    }

    public final boolean component3() {
        return this.isFormDisabled;
    }

    @NotNull
    public final AttributeData copy(@NotNull Attribute attribute, @NotNull String partId, boolean z10) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(partId, "partId");
        return new AttributeData(attribute, partId, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributeData)) {
            return false;
        }
        AttributeData attributeData = (AttributeData) obj;
        return Intrinsics.areEqual(this.attribute, attributeData.attribute) && Intrinsics.areEqual(this.partId, attributeData.partId) && this.isFormDisabled == attributeData.isFormDisabled;
    }

    @NotNull
    public final Attribute getAttribute() {
        return this.attribute;
    }

    @NotNull
    public final String getPartId() {
        return this.partId;
    }

    public int hashCode() {
        return (((this.attribute.hashCode() * 31) + this.partId.hashCode()) * 31) + Boolean.hashCode(this.isFormDisabled);
    }

    public final boolean isFormDisabled() {
        return this.isFormDisabled;
    }

    @NotNull
    public String toString() {
        return "AttributeData(attribute=" + this.attribute + ", partId=" + this.partId + ", isFormDisabled=" + this.isFormDisabled + ')';
    }
}
