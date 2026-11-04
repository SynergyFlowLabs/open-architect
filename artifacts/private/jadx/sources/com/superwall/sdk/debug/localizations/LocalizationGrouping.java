package com.superwall.sdk.debug.localizations;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class LocalizationGrouping {

    @NotNull
    private final List<LocalizationOption> localizations;

    @NotNull
    private final String title;

    public LocalizationGrouping(@NotNull List<LocalizationOption> localizations, @NotNull String title) {
        Intrinsics.checkNotNullParameter(localizations, "localizations");
        Intrinsics.checkNotNullParameter(title, "title");
        this.localizations = localizations;
        this.title = title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalizationGrouping copy$default(LocalizationGrouping localizationGrouping, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = localizationGrouping.localizations;
        }
        if ((i10 & 2) != 0) {
            str = localizationGrouping.title;
        }
        return localizationGrouping.copy(list, str);
    }

    @NotNull
    public final List<LocalizationOption> component1() {
        return this.localizations;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final LocalizationGrouping copy(@NotNull List<LocalizationOption> localizations, @NotNull String title) {
        Intrinsics.checkNotNullParameter(localizations, "localizations");
        Intrinsics.checkNotNullParameter(title, "title");
        return new LocalizationGrouping(localizations, title);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalizationGrouping)) {
            return false;
        }
        LocalizationGrouping localizationGrouping = (LocalizationGrouping) obj;
        return Intrinsics.areEqual(this.localizations, localizationGrouping.localizations) && Intrinsics.areEqual(this.title, localizationGrouping.title);
    }

    @NotNull
    public final List<LocalizationOption> getLocalizations() {
        return this.localizations;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.localizations.hashCode() * 31) + this.title.hashCode();
    }

    @NotNull
    public String toString() {
        return "LocalizationGrouping(localizations=" + this.localizations + ", title=" + this.title + ")";
    }
}
