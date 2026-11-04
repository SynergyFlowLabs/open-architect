package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.c;
import com.rabbitmq.client.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class HeaderConfig {
    public static final int $stable = 8;

    @c("background")
    @NotNull
    private final HeaderBackgroundModel background;

    @c(FirebaseAnalytics.d.P)
    @NotNull
    private final HeaderContentModel content;

    @c("header_expanded")
    private final boolean headerExpanded;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderConfig() {
        this(null, null, false, 7, null);
        int i10 = 0 << 0;
    }

    public static /* synthetic */ HeaderConfig copy$default(HeaderConfig headerConfig, HeaderBackgroundModel headerBackgroundModel, HeaderContentModel headerContentModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            headerBackgroundModel = headerConfig.background;
        }
        if ((i10 & 2) != 0) {
            headerContentModel = headerConfig.content;
        }
        if ((i10 & 4) != 0) {
            z10 = headerConfig.headerExpanded;
        }
        return headerConfig.copy(headerBackgroundModel, headerContentModel, z10);
    }

    @NotNull
    public final HeaderBackgroundModel component1() {
        return this.background;
    }

    @NotNull
    public final HeaderContentModel component2() {
        return this.content;
    }

    public final boolean component3() {
        return this.headerExpanded;
    }

    @NotNull
    public final HeaderConfig copy(@NotNull HeaderBackgroundModel background, @NotNull HeaderContentModel content, boolean z10) {
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(content, "content");
        return new HeaderConfig(background, content, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderConfig)) {
            return false;
        }
        HeaderConfig headerConfig = (HeaderConfig) obj;
        return Intrinsics.areEqual(this.background, headerConfig.background) && Intrinsics.areEqual(this.content, headerConfig.content) && this.headerExpanded == headerConfig.headerExpanded;
    }

    @NotNull
    public final HeaderBackgroundModel getBackground() {
        return this.background;
    }

    @NotNull
    public final HeaderContentModel getContent() {
        return this.content;
    }

    public final boolean getHeaderExpanded() {
        return this.headerExpanded;
    }

    public int hashCode() {
        return (((this.background.hashCode() * 31) + this.content.hashCode()) * 31) + Boolean.hashCode(this.headerExpanded);
    }

    @NotNull
    public String toString() {
        return "HeaderConfig(background=" + this.background + ", content=" + this.content + ", headerExpanded=" + this.headerExpanded + ')';
    }

    public HeaderConfig(@NotNull HeaderBackgroundModel background, @NotNull HeaderContentModel content, boolean z10) {
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(content, "content");
        this.background = background;
        this.content = content;
        this.headerExpanded = z10;
    }

    public /* synthetic */ HeaderConfig(HeaderBackgroundModel headerBackgroundModel, HeaderContentModel headerContentModel, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new HeaderBackgroundModel(null, null, null, null, null, null, false, null, null, null, false, r.f265987x3, null) : headerBackgroundModel, (i10 & 2) != 0 ? new HeaderContentModel(null, null, false, null, null, null, null, null, 255, null) : headerContentModel, (i10 & 4) != 0 ? true : z10);
    }
}
