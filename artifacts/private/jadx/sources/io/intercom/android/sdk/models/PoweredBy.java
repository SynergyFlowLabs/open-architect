package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.enums.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class PoweredBy {
    public static final int $stable = 0;

    @c("icon")
    @NotNull
    private final PoweredByIconType icon;

    @c("link_url")
    @NotNull
    private final String linkUrl;

    @c("text")
    @NotNull
    private final String text;

    public enum PoweredByIconType {
        INTERCOM,
        FIN;

        private static final /* synthetic */ a $ENTRIES = kotlin.enums.c.c(values());

        @NotNull
        public static a<PoweredByIconType> getEntries() {
            return $ENTRIES;
        }
    }

    public PoweredBy(@NotNull PoweredByIconType icon, @NotNull String linkUrl, @NotNull String text) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        Intrinsics.checkNotNullParameter(text, "text");
        this.icon = icon;
        this.linkUrl = linkUrl;
        this.text = text;
    }

    public static /* synthetic */ PoweredBy copy$default(PoweredBy poweredBy, PoweredByIconType poweredByIconType, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            poweredByIconType = poweredBy.icon;
        }
        if ((i10 & 2) != 0) {
            str = poweredBy.linkUrl;
        }
        if ((i10 & 4) != 0) {
            str2 = poweredBy.text;
        }
        return poweredBy.copy(poweredByIconType, str, str2);
    }

    @NotNull
    public final PoweredByIconType component1() {
        return this.icon;
    }

    @NotNull
    public final String component2() {
        return this.linkUrl;
    }

    @NotNull
    public final String component3() {
        return this.text;
    }

    @NotNull
    public final PoweredBy copy(@NotNull PoweredByIconType icon, @NotNull String linkUrl, @NotNull String text) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        Intrinsics.checkNotNullParameter(text, "text");
        return new PoweredBy(icon, linkUrl, text);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoweredBy)) {
            return false;
        }
        PoweredBy poweredBy = (PoweredBy) obj;
        return this.icon == poweredBy.icon && Intrinsics.areEqual(this.linkUrl, poweredBy.linkUrl) && Intrinsics.areEqual(this.text, poweredBy.text);
    }

    @NotNull
    public final PoweredByIconType getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.icon.hashCode() * 31) + this.linkUrl.hashCode()) * 31) + this.text.hashCode();
    }

    @NotNull
    public String toString() {
        return "PoweredBy(icon=" + this.icon + ", linkUrl=" + this.linkUrl + ", text=" + this.text + ')';
    }
}
