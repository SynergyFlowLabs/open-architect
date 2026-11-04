package io.intercom.android.sdk.api;

import androidx.annotation.p0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
@u7.d
public abstract class UserUpdateRequest {

    public static final class Builder {

        @p0
        Map<String, Object> attributes;
        boolean isNewSession = false;
        boolean isSentFromBackground = true;
        boolean isInternalUpdate = false;

        public UserUpdateRequest build() {
            HashMap map = new HashMap();
            Map<String, Object> map2 = this.attributes;
            if (map2 != null) {
                map.putAll(map2);
            }
            return new AutoValue_UserUpdateRequest(this.isNewSession, this.isSentFromBackground, this.isInternalUpdate, map);
        }

        public Builder isInternalUpdate(boolean z10) {
            this.isInternalUpdate = z10;
            return this;
        }

        public Builder isNewSession(boolean z10) {
            this.isNewSession = z10;
            return this;
        }

        public Builder isSentFromBackground(boolean z10) {
            this.isSentFromBackground = z10;
            return this;
        }

        public Builder withAttributes(@p0 Map<String, Object> map) {
            this.attributes = map;
            return this;
        }
    }

    public static UserUpdateRequest create(boolean z10, boolean z11, @p0 Map<String, Object> map, boolean z12) {
        return new Builder().isNewSession(z10).isSentFromBackground(z11).withAttributes(map).isInternalUpdate(z12).build();
    }

    public abstract Map<String, Object> getAttributes();

    public abstract boolean isInternalUpdate();

    public abstract boolean isNewSession();

    public abstract boolean isSentFromBackground();

    public boolean isValidUpdate() {
        return isInternalUpdate() || !getAttributes().isEmpty();
    }

    public static UserUpdateRequest create(boolean z10, boolean z11, boolean z12) {
        return create(z10, z11, null, z12);
    }
}
