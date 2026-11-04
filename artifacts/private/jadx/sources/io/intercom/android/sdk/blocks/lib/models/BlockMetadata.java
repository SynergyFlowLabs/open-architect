package io.intercom.android.sdk.blocks.lib.models;

import androidx.annotation.p0;
import io.intercom.android.sdk.models.carousel.Appearance;
import io.intercom.android.sdk.utilities.NullSafety;
import u7.d;

/* JADX INFO: loaded from: classes13.dex */
@d
public abstract class BlockMetadata {
    public static BlockMetadata NULL = new Builder().build();

    public static final class Builder {

        @p0
        Appearance.Builder appearance;

        @p0
        Boolean isFirstObject;

        @p0
        Boolean isLastObject;

        public BlockMetadata build() {
            Appearance.Builder builder = this.appearance;
            return BlockMetadata.create(NullSafety.valueOrDefault(this.isFirstObject, false), NullSafety.valueOrDefault(this.isLastObject, false), builder == null ? Appearance.NULL : builder.build());
        }

        public Builder isFirstObject(Boolean bool) {
            this.isFirstObject = bool;
            return this;
        }

        public Builder isLastObject(Boolean bool) {
            this.isLastObject = bool;
            return this;
        }

        public Builder withAppearance(Appearance.Builder builder) {
            this.appearance = builder;
            return this;
        }
    }

    static BlockMetadata create(boolean z10, boolean z11, Appearance appearance) {
        return new AutoValue_BlockMetadata(z10, z11, appearance);
    }

    public abstract Appearance getAppearance();

    public abstract boolean isFirstObject();

    public abstract boolean isLastObject();

    public boolean isSingleObject() {
        return isFirstObject() && isLastObject();
    }
}
