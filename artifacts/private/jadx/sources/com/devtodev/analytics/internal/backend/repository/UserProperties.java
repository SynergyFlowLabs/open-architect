package com.devtodev.analytics.internal.backend.repository;

import com.devtodev.analytics.internal.logger.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class UserProperties {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private String country;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final UserProperties fromJson(@NotNull String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                JSONObject jSONObject = new JSONObject(json);
                if (jSONObject.isNull("country")) {
                    return null;
                }
                return new UserProperties(jSONObject.getString("country"));
            } catch (JSONException e10) {
                Logger.INSTANCE.error("When trying to get json string from \n\t[" + json + "] object\nan Error has occurred:", e10);
                return null;
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProperties() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UserProperties copy$default(UserProperties userProperties, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userProperties.country;
        }
        return userProperties.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.country;
    }

    @NotNull
    public final UserProperties copy(@Nullable String str) {
        return new UserProperties(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserProperties) && Intrinsics.areEqual(this.country, ((UserProperties) obj).country);
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    public int hashCode() {
        String str = this.country;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setCountry(@Nullable String str) {
        this.country = str;
    }

    @NotNull
    public String toString() {
        return "UserProperties(country=" + this.country + ")";
    }

    public UserProperties(@Nullable String str) {
        this.country = str;
    }

    public /* synthetic */ UserProperties(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
