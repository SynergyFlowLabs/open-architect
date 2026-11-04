package com.superwall.sdk.models.config;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class LocalizationConfig {

    @NotNull
    private List<LocaleConfig> locales;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new kotlinx.serialization.internal.f(LocalizationConfig$LocaleConfig$$serializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<LocalizationConfig> serializer() {
            return LocalizationConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    public static final class LocaleConfig {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private String locale;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<LocaleConfig> serializer() {
                return LocalizationConfig$LocaleConfig$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ LocaleConfig(int i10, String str, v2 v2Var) {
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, LocalizationConfig$LocaleConfig$$serializer.INSTANCE.getDescriptor());
            }
            this.locale = str;
        }

        public static /* synthetic */ LocaleConfig copy$default(LocaleConfig localeConfig, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = localeConfig.locale;
            }
            return localeConfig.copy(str);
        }

        @a0("locale")
        public static /* synthetic */ void getLocale$annotations() {
        }

        @NotNull
        public final String component1() {
            return this.locale;
        }

        @NotNull
        public final LocaleConfig copy(@NotNull String locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            return new LocaleConfig(locale);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocaleConfig) && Intrinsics.areEqual(this.locale, ((LocaleConfig) obj).locale);
        }

        @NotNull
        public final String getLocale() {
            return this.locale;
        }

        public int hashCode() {
            return this.locale.hashCode();
        }

        public final void setLocale(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.locale = str;
        }

        @NotNull
        public String toString() {
            return "LocaleConfig(locale=" + this.locale + ")";
        }

        public LocaleConfig(@NotNull String locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.locale = locale;
        }
    }

    public /* synthetic */ LocalizationConfig(int i10, List list, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, LocalizationConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.locales = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalizationConfig copy$default(LocalizationConfig localizationConfig, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = localizationConfig.locales;
        }
        return localizationConfig.copy(list);
    }

    @NotNull
    public final List<LocaleConfig> component1() {
        return this.locales;
    }

    @NotNull
    public final LocalizationConfig copy(@NotNull List<LocaleConfig> locales) {
        Intrinsics.checkNotNullParameter(locales, "locales");
        return new LocalizationConfig(locales);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalizationConfig) && Intrinsics.areEqual(this.locales, ((LocalizationConfig) obj).locales);
    }

    @NotNull
    public final List<LocaleConfig> getLocales() {
        return this.locales;
    }

    public int hashCode() {
        return this.locales.hashCode();
    }

    public final void setLocales(@NotNull List<LocaleConfig> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.locales = list;
    }

    @NotNull
    public String toString() {
        return "LocalizationConfig(locales=" + this.locales + ")";
    }

    public LocalizationConfig(@NotNull List<LocaleConfig> locales) {
        Intrinsics.checkNotNullParameter(locales, "locales");
        this.locales = locales;
    }
}
