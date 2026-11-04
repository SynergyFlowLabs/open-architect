package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class ConfigModules {

    @NotNull
    private static final ConfigModules DEFAULT;

    @NotNull
    private static final ConfigModules DEFAULT_WITH_ACTION_COLORS;

    @c("customization")
    @NotNull
    private final CustomizationModel customization;

    @c("home")
    @NotNull
    private final HomeConfig home;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        public static /* synthetic */ void getDEFAULT_WITH_ACTION_COLORS$annotations() {
        }

        @NotNull
        public final ConfigModules getDEFAULT() {
            return ConfigModules.DEFAULT;
        }

        @NotNull
        public final ConfigModules getDEFAULT_WITH_ACTION_COLORS() {
            return ConfigModules.DEFAULT_WITH_ACTION_COLORS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        CustomizationColorsModel customizationColorsModel = null;
        String str = "";
        String str2 = "";
        int i10 = 2;
        DEFAULT = new ConfigModules(new CustomizationModel(new CustomizationColorsModel("", "", null, null, null, null, 60, null), new CustomizationColorsModel("", "", null, null, null, null, 60, null), customizationColorsModel, str, str2, new CustomizationColorsModel("", "", null, null, null, null, 60, null), 0, null, null, "", null, 0, 4, null), 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        CustomizationColorsModel customizationColorsModel2 = null;
        String str3 = "";
        String str4 = "";
        DEFAULT_WITH_ACTION_COLORS = new ConfigModules(new CustomizationModel(new CustomizationColorsModel("#000000", "#FFFFFF", "#FFFFFF", null, null, null, 56, null), new CustomizationColorsModel("#000000", "#FAFAFA", null, null, null, null, 60, null), customizationColorsModel2, str3, str4, new CustomizationColorsModel("", "", null, null, null, null, 60, null), 0, null, null, "", null, 0, 4, null), 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
    }

    public ConfigModules(@NotNull CustomizationModel customization, @NotNull HomeConfig home) {
        Intrinsics.checkNotNullParameter(customization, "customization");
        Intrinsics.checkNotNullParameter(home, "home");
        this.customization = customization;
        this.home = home;
    }

    public static /* synthetic */ ConfigModules copy$default(ConfigModules configModules, CustomizationModel customizationModel, HomeConfig homeConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            customizationModel = configModules.customization;
        }
        if ((i10 & 2) != 0) {
            homeConfig = configModules.home;
        }
        return configModules.copy(customizationModel, homeConfig);
    }

    @NotNull
    public static final ConfigModules getDEFAULT_WITH_ACTION_COLORS() {
        return Companion.getDEFAULT_WITH_ACTION_COLORS();
    }

    @NotNull
    public final CustomizationModel component1() {
        return this.customization;
    }

    @NotNull
    public final HomeConfig component2() {
        return this.home;
    }

    @NotNull
    public final ConfigModules copy(@NotNull CustomizationModel customization, @NotNull HomeConfig home) {
        Intrinsics.checkNotNullParameter(customization, "customization");
        Intrinsics.checkNotNullParameter(home, "home");
        return new ConfigModules(customization, home);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigModules)) {
            return false;
        }
        ConfigModules configModules = (ConfigModules) obj;
        return Intrinsics.areEqual(this.customization, configModules.customization) && Intrinsics.areEqual(this.home, configModules.home);
    }

    @NotNull
    public final CustomizationModel getCustomization() {
        return this.customization;
    }

    @NotNull
    public final HomeConfig getHome() {
        return this.home;
    }

    public int hashCode() {
        return (this.customization.hashCode() * 31) + this.home.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConfigModules(customization=" + this.customization + ", home=" + this.home + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ConfigModules(CustomizationModel customizationModel, HomeConfig homeConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            homeConfig = new HomeConfig(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        this(customizationModel, homeConfig);
    }
}
