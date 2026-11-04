package com.superwall.sdk.debug.localizations;

import androidx.media3.exoplayer.upstream.h;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class LocalizationOption {

    @Nullable
    private final String country;

    @NotNull
    private final String description;

    @NotNull
    private final String language;

    @NotNull
    private final String locale;

    @NotNull
    private final List<String> popularLocales;

    public LocalizationOption(@NotNull String language, @Nullable String str, @NotNull String locale, @NotNull List<String> popularLocales) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(popularLocales, "popularLocales");
        this.language = language;
        this.country = str;
        this.locale = locale;
        this.popularLocales = popularLocales;
        if (str != null) {
            language = language + " (" + str + ")";
        }
        this.description = language;
    }

    private final List<String> component4() {
        return this.popularLocales;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalizationOption copy$default(LocalizationOption localizationOption, String str, String str2, String str3, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = localizationOption.language;
        }
        if ((i10 & 2) != 0) {
            str2 = localizationOption.country;
        }
        if ((i10 & 4) != 0) {
            str3 = localizationOption.locale;
        }
        if ((i10 & 8) != 0) {
            list = localizationOption.popularLocales;
        }
        return localizationOption.copy(str, str2, str3, list);
    }

    @NotNull
    public final String component1() {
        return this.language;
    }

    @Nullable
    public final String component2() {
        return this.country;
    }

    @NotNull
    public final String component3() {
        return this.locale;
    }

    @NotNull
    public final LocalizationOption copy(@NotNull String language, @Nullable String str, @NotNull String locale, @NotNull List<String> popularLocales) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(popularLocales, "popularLocales");
        return new LocalizationOption(language, str, locale, popularLocales);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalizationOption)) {
            return false;
        }
        LocalizationOption localizationOption = (LocalizationOption) obj;
        return Intrinsics.areEqual(this.language, localizationOption.language) && Intrinsics.areEqual(this.country, localizationOption.country) && Intrinsics.areEqual(this.locale, localizationOption.locale) && Intrinsics.areEqual(this.popularLocales, localizationOption.popularLocales);
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final String getSectionTitle() {
        if (isPopular()) {
            return "Localized";
        }
        return this.language.length() > 0 ? String.valueOf(Character.toUpperCase(StringsKt.U6(this.language))) : com.facebook.internal.a.f99697t;
    }

    @NotNull
    public final String getSortDescription() {
        return (isPopular() ? h.f65998l : "b") + " " + this.description;
    }

    public int hashCode() {
        int iHashCode = this.language.hashCode() * 31;
        String str = this.country;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.locale.hashCode()) * 31) + this.popularLocales.hashCode();
    }

    public final boolean included(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Locale locale = Locale.ROOT;
        String lowerCase = query.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String lowerCase2 = this.description.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (StringsKt.V2(lowerCase2, lowerCase, false, 2, null)) {
            return true;
        }
        String lowerCase3 = this.locale.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        return StringsKt.V2(lowerCase3, lowerCase, false, 2, null);
    }

    public final boolean isPopular() {
        return Intrinsics.areEqual(this.locale, "en") || this.popularLocales.contains(this.locale);
    }

    @NotNull
    public String toString() {
        return "LocalizationOption(language=" + this.language + ", country=" + this.country + ", locale=" + this.locale + ", popularLocales=" + this.popularLocales + ")";
    }
}
