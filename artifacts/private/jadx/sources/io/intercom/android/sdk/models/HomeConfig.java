package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class HomeConfig {
    public static final int $stable = 8;

    @c("header")
    @NotNull
    private final HeaderConfig header;

    @c("open_config")
    @NotNull
    private final OpenConfig openConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HomeConfig copy$default(HomeConfig homeConfig, HeaderConfig headerConfig, OpenConfig openConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            headerConfig = homeConfig.header;
        }
        if ((i10 & 2) != 0) {
            openConfig = homeConfig.openConfig;
        }
        return homeConfig.copy(headerConfig, openConfig);
    }

    @NotNull
    public final HeaderConfig component1() {
        return this.header;
    }

    @NotNull
    public final OpenConfig component2() {
        return this.openConfig;
    }

    @NotNull
    public final HomeConfig copy(@NotNull HeaderConfig header, @NotNull OpenConfig openConfig) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(openConfig, "openConfig");
        return new HomeConfig(header, openConfig);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeConfig)) {
            return false;
        }
        HomeConfig homeConfig = (HomeConfig) obj;
        return Intrinsics.areEqual(this.header, homeConfig.header) && Intrinsics.areEqual(this.openConfig, homeConfig.openConfig);
    }

    @NotNull
    public final HeaderConfig getHeader() {
        return this.header;
    }

    @NotNull
    public final OpenConfig getOpenConfig() {
        return this.openConfig;
    }

    public int hashCode() {
        return (this.header.hashCode() * 31) + this.openConfig.hashCode();
    }

    @NotNull
    public String toString() {
        return "HomeConfig(header=" + this.header + ", openConfig=" + this.openConfig + ')';
    }

    public HomeConfig(@NotNull HeaderConfig header, @NotNull OpenConfig openConfig) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(openConfig, "openConfig");
        this.header = header;
        this.openConfig = openConfig;
    }

    public /* synthetic */ HomeConfig(HeaderConfig headerConfig, OpenConfig openConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            headerConfig = new HeaderConfig(null, null, false, 7, null);
        }
        if ((i10 & 2) != 0) {
            openConfig = new OpenConfig(null, null, null, 7, null);
        }
        this(headerConfig, openConfig);
    }
}
