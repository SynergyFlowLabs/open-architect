package io.intercom.android.sdk.api;

import android.content.Context;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.language.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class UserLocaleUtilKt {
    @NotNull
    public static final String getUserLocaleString(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        Intrinsics.checkNotNullExpressionValue(locales, "getLocales(...)");
        ArrayList arrayList = new ArrayList();
        int size = locales.size();
        for (int i10 = 0; i10 < size; i10++) {
            Locale locale = locales.get(i10);
            arrayList.add(locale.getLanguage() + l.f335457d + locale.getCountry());
        }
        return CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }
}
