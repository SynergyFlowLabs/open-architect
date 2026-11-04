package com.superwall.sdk.debug.localizations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nLocalizationLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalizationLogic.kt\ncom/superwall/sdk/debug/localizations/LocalizationLogic\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1010#2,2:64\n*S KotlinDebug\n*F\n+ 1 LocalizationLogic.kt\ncom/superwall/sdk/debug/localizations/LocalizationLogic\n*L\n42#1:64,2\n*E\n"})
public final class LocalizationLogic {

    @NotNull
    public static final LocalizationLogic INSTANCE = new LocalizationLogic();

    private LocalizationLogic() {
    }

    @NotNull
    public final List<LocalizationGrouping> getGroupings(@NotNull List<LocalizationOption> localizationOptions) {
        Intrinsics.checkNotNullParameter(localizationOptions, "localizationOptions");
        ArrayList arrayList = new ArrayList();
        for (LocalizationOption localizationOption : localizationOptions) {
            String sectionTitle = localizationOption.getSectionTitle();
            LocalizationGrouping localizationGrouping = (LocalizationGrouping) CollectionsKt.lastOrNull((List) arrayList);
            if (!Intrinsics.areEqual(localizationGrouping != null ? localizationGrouping.getTitle() : null, sectionTitle)) {
                arrayList.add(new LocalizationGrouping(new ArrayList(), sectionTitle));
            }
            ((LocalizationGrouping) CollectionsKt.last((List) arrayList)).getLocalizations().add(localizationOption);
        }
        return arrayList;
    }

    @NotNull
    public final List<LocalizationOption> getSortedLocalizations(@NotNull List<String> localeIds, @NotNull List<String> popularLocales) {
        Intrinsics.checkNotNullParameter(localeIds, "localeIds");
        Intrinsics.checkNotNullParameter(popularLocales, "popularLocales");
        ArrayList arrayList = new ArrayList();
        for (String str : localeIds) {
            Locale locale = new Locale(str);
            List listSplit$default = StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, null);
            String displayLanguage = locale.getDisplayLanguage();
            Intrinsics.checkNotNullExpressionValue(displayLanguage, "getDisplayLanguage(...)");
            String displayLanguage2 = displayLanguage.length() > 0 ? locale.getDisplayLanguage() : listSplit$default.size() > 1 ? new Locale("", (String) CollectionsKt.first(listSplit$default)).getDisplayLanguage() : "";
            String displayCountry = locale.getDisplayCountry();
            Intrinsics.checkNotNullExpressionValue(displayCountry, "getDisplayCountry(...)");
            arrayList.add(new LocalizationOption(displayLanguage2, displayCountry.length() > 0 ? locale.getDisplayCountry() : listSplit$default.size() > 1 ? new Locale("", (String) CollectionsKt.last(listSplit$default)).getDisplayCountry() : null, str, popularLocales));
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.superwall.sdk.debug.localizations.LocalizationLogic$getSortedLocalizations$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return kotlin.comparisons.a.l(((LocalizationOption) t10).getSortDescription(), ((LocalizationOption) t11).getSortDescription());
                }
            });
        }
        return arrayList;
    }
}
