package com.planner5d.library.model;

import android.content.Context;
import android.content.res.Configuration;
import com.planner5d.library.services.utility.k1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nTranslatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslatedString.kt\ncom/planner5d/library/model/TranslatedString\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n503#2,7:53\n462#2:60\n412#2:61\n1246#3,4:62\n*S KotlinDebug\n*F\n+ 1 TranslatedString.kt\ncom/planner5d/library/model/TranslatedString\n*L\n11#1:53,7\n11#1:60\n11#1:61\n11#1:62,4\n*E\n"})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f180553a;

    public a0(@NotNull Map<String, String> translations) {
        Intrinsics.checkNotNullParameter(translations, "translations");
        this.f180553a = translations;
    }

    @Nullable
    public final String a(@NotNull String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        String str = this.f180553a.get(language);
        return str == null ? this.f180553a.get("en") : str;
    }

    @NotNull
    public final JSONObject b() {
        return new JSONObject(this.f180553a);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.planner5d.library.model.TranslatedString");
        return Intrinsics.areEqual(this.f180553a, ((a0) obj).f180553a);
    }

    public int hashCode() {
        return this.f180553a.hashCode();
    }

    public a0(@Nullable JSONObject jSONObject) throws JSONException {
        Map<String, Object> mapH = k1.f225294a.H(jSONObject == null ? new JSONObject() : jSONObject);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : mapH.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
        }
        this(linkedHashMap2);
    }

    public a0(@NotNull JSONObject jsonWithTranslations, @NotNull String namePrefix) {
        String strZ;
        Intrinsics.checkNotNullParameter(jsonWithTranslations, "jsonWithTranslations");
        Intrinsics.checkNotNullParameter(namePrefix, "namePrefix");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jsonWithTranslations.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.checkNotNull(next);
            if (StringsKt.u2(next, namePrefix + "_", false, 2, null) && (strZ = k1.z(jsonWithTranslations, next, null, 4, null)) != null) {
            }
        }
        this(map);
    }

    public a0(@NotNull Context context, int i10, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        HashMap map = new HashMap();
        Configuration configuration = context.getResources().getConfiguration();
        Iterator itA = kotlin.jvm.internal.i.a(Locale.getAvailableLocales());
        while (itA.hasNext()) {
            Locale locale = (Locale) itA.next();
            configuration.setLocale(locale);
            map.put(locale.getCountry(), context.getString(i10, formatArgs));
        }
        this(map);
    }
}
