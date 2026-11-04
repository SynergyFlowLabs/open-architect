package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonIgnoreUnknownKeys;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nJsonNamesMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n808#2,11:156\n1761#2,3:170\n13472#3,2:167\n1#4:169\n*S KotlinDebug\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n*L\n35#1:156,11\n154#1:170,3\n35#1:167,2\n*E\n"})
public final class JsonNamesMapKt {

    @NotNull
    private static final DescriptorSchemaCache.Key<Map<String, Integer>> JsonDeserializationNamesKey = new DescriptorSchemaCache.Key<>();

    @NotNull
    private static final DescriptorSchemaCache.Key<String[]> JsonSerializationNamesKey = new DescriptorSchemaCache.Key<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Integer> buildDeserializationNamesMap(SerialDescriptor serialDescriptor, Json json) {
        String strSerialNameForJson;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zDecodeCaseInsensitive = decodeCaseInsensitive(json, serialDescriptor);
        JsonNamingStrategy jsonNamingStrategyNamingStrategy = namingStrategy(serialDescriptor, json);
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            List<Annotation> elementAnnotations = serialDescriptor.getElementAnnotations(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : elementAnnotations) {
                if (obj instanceof JsonNames) {
                    arrayList.add(obj);
                }
            }
            JsonNames jsonNames = (JsonNames) CollectionsKt.singleOrNull((List) arrayList);
            if (jsonNames != null && (strArrNames = jsonNames.names()) != null) {
                for (String lowerCase : strArrNames) {
                    if (zDecodeCaseInsensitive) {
                        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    }
                    buildDeserializationNamesMap$putOrThrow(linkedHashMap, serialDescriptor, lowerCase, i10);
                }
            }
            if (zDecodeCaseInsensitive) {
                strSerialNameForJson = serialDescriptor.getElementName(i10).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(strSerialNameForJson, "toLowerCase(...)");
            } else {
                strSerialNameForJson = jsonNamingStrategyNamingStrategy != null ? jsonNamingStrategyNamingStrategy.serialNameForJson(serialDescriptor, i10, serialDescriptor.getElementName(i10)) : null;
            }
            if (strSerialNameForJson != null) {
                buildDeserializationNamesMap$putOrThrow(linkedHashMap, serialDescriptor, strSerialNameForJson, i10);
            }
        }
        return linkedHashMap.isEmpty() ? MapsKt.emptyMap() : linkedHashMap;
    }

    private static final void buildDeserializationNamesMap$putOrThrow(Map<String, Integer> map, SerialDescriptor serialDescriptor, String str, int i10) {
        String str2 = Intrinsics.areEqual(serialDescriptor.getKind(), l.b.f315860a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.getElementName(i10) + " is already one of the names for " + str2 + ' ' + serialDescriptor.getElementName(((Number) MapsKt.getValue(map, str)).intValue()) + " in " + serialDescriptor);
    }

    private static final boolean decodeCaseInsensitive(Json json, SerialDescriptor serialDescriptor) {
        return json.getConfiguration().getDecodeEnumsCaseInsensitive() && Intrinsics.areEqual(serialDescriptor.getKind(), l.b.f315860a);
    }

    @NotNull
    public static final Map<String, Integer> deserializationNamesMap(@NotNull final Json json, @NotNull final SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (Map) JsonSchemaCacheKt.getSchemaCache(json).getOrPut(descriptor, JsonDeserializationNamesKey, new Function0() { // from class: kotlinx.serialization.json.internal.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonNamesMapKt.buildDeserializationNamesMap(descriptor, json);
            }
        });
    }

    @NotNull
    public static final DescriptorSchemaCache.Key<Map<String, Integer>> getJsonDeserializationNamesKey() {
        return JsonDeserializationNamesKey;
    }

    @NotNull
    public static final String getJsonElementName(@NotNull SerialDescriptor serialDescriptor, @NotNull Json json, int i10) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        JsonNamingStrategy jsonNamingStrategyNamingStrategy = namingStrategy(serialDescriptor, json);
        return jsonNamingStrategyNamingStrategy == null ? serialDescriptor.getElementName(i10) : serializationNamesIndices(serialDescriptor, json, jsonNamingStrategyNamingStrategy)[i10];
    }

    public static final int getJsonNameIndex(@NotNull SerialDescriptor serialDescriptor, @NotNull Json json, @NotNull String name) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        if (decodeCaseInsensitive(json, serialDescriptor)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return getJsonNameIndexSlowPath(serialDescriptor, json, lowerCase);
        }
        if (namingStrategy(serialDescriptor, json) != null) {
            return getJsonNameIndexSlowPath(serialDescriptor, json, name);
        }
        int elementIndex = serialDescriptor.getElementIndex(name);
        if (elementIndex == -3 && json.getConfiguration().getUseAlternativeNames()) {
            return getJsonNameIndexSlowPath(serialDescriptor, json, name);
        }
        return elementIndex;
    }

    public static final int getJsonNameIndexOrThrow(@NotNull SerialDescriptor serialDescriptor, @NotNull Json json, @NotNull String name, @NotNull String suffix) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int jsonNameIndex = getJsonNameIndex(serialDescriptor, json, name);
        if (jsonNameIndex != -3) {
            return jsonNameIndex;
        }
        throw new c0(serialDescriptor.getSerialName() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int getJsonNameIndexOrThrow$default(SerialDescriptor serialDescriptor, Json json, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return getJsonNameIndexOrThrow(serialDescriptor, json, str, str2);
    }

    private static final int getJsonNameIndexSlowPath(SerialDescriptor serialDescriptor, Json json, String str) {
        Integer num = deserializationNamesMap(json, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @NotNull
    public static final DescriptorSchemaCache.Key<String[]> getJsonSerializationNamesKey() {
        return JsonSerializationNamesKey;
    }

    public static final boolean ignoreUnknownKeys(@NotNull SerialDescriptor serialDescriptor, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (!json.getConfiguration().getIgnoreUnknownKeys()) {
            List<Annotation> annotations = serialDescriptor.getAnnotations();
            if ((annotations instanceof Collection) && annotations.isEmpty()) {
                return false;
            }
            Iterator<T> it = annotations.iterator();
            while (it.hasNext()) {
                if (((Annotation) it.next()) instanceof JsonIgnoreUnknownKeys) {
                }
            }
            return false;
        }
        return true;
    }

    @Nullable
    public static final JsonNamingStrategy namingStrategy(@NotNull SerialDescriptor serialDescriptor, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(serialDescriptor.getKind(), m.a.f315861a)) {
            return json.getConfiguration().getNamingStrategy();
        }
        return null;
    }

    @NotNull
    public static final String[] serializationNamesIndices(@NotNull final SerialDescriptor serialDescriptor, @NotNull Json json, @NotNull final JsonNamingStrategy strategy) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return (String[]) JsonSchemaCacheKt.getSchemaCache(json).getOrPut(serialDescriptor, JsonSerializationNamesKey, new Function0() { // from class: kotlinx.serialization.json.internal.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsonNamesMapKt.serializationNamesIndices$lambda$4(serialDescriptor, strategy);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] serializationNamesIndices$lambda$4(SerialDescriptor serialDescriptor, JsonNamingStrategy jsonNamingStrategy) {
        int elementsCount = serialDescriptor.getElementsCount();
        String[] strArr = new String[elementsCount];
        for (int i10 = 0; i10 < elementsCount; i10++) {
            strArr[i10] = jsonNamingStrategy.serialNameForJson(serialDescriptor, i10, serialDescriptor.getElementName(i10));
        }
        return strArr;
    }

    public static final boolean tryCoerceValue(@NotNull Json json, @NotNull SerialDescriptor descriptor, int i10, @NotNull Function1<? super Boolean, Boolean> peekNull, @NotNull Function0<String> peekString, @NotNull Function0<Unit> onEnumCoercing) {
        String strInvoke;
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(peekNull, "peekNull");
        Intrinsics.checkNotNullParameter(peekString, "peekString");
        Intrinsics.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
        boolean zIsElementOptional = descriptor.isElementOptional(i10);
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(i10);
        if (zIsElementOptional && !elementDescriptor.isNullable() && peekNull.invoke(Boolean.TRUE).booleanValue()) {
            return true;
        }
        if (Intrinsics.areEqual(elementDescriptor.getKind(), l.b.f315860a) && ((!elementDescriptor.isNullable() || !peekNull.invoke(Boolean.FALSE).booleanValue()) && (strInvoke = peekString.invoke()) != null)) {
            int jsonNameIndex = getJsonNameIndex(elementDescriptor, json, strInvoke);
            boolean z10 = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
            if (jsonNameIndex == -3 && (zIsElementOptional || z10)) {
                onEnumCoercing.invoke();
                return true;
            }
            return false;
        }
        return false;
    }

    public static /* synthetic */ boolean tryCoerceValue$default(Json json, SerialDescriptor descriptor, int i10, Function1 peekNull, Function0 peekString, Function0 onEnumCoercing, int i11, Object obj) {
        String str;
        if ((i11 & 16) != 0) {
            onEnumCoercing = new Function0<Unit>() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt.tryCoerceValue.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f312394a;
                }
            };
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(peekNull, "peekNull");
        Intrinsics.checkNotNullParameter(peekString, "peekString");
        Intrinsics.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
        boolean zIsElementOptional = descriptor.isElementOptional(i10);
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(i10);
        if (zIsElementOptional && !elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(Boolean.TRUE)).booleanValue()) {
            return true;
        }
        if (!Intrinsics.areEqual(elementDescriptor.getKind(), l.b.f315860a) || ((elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(Boolean.FALSE)).booleanValue()) || (str = (String) peekString.invoke()) == null)) {
            return false;
        }
        int jsonNameIndex = getJsonNameIndex(elementDescriptor, json, str);
        boolean z10 = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
        if (jsonNameIndex == -3 && (zIsElementOptional || z10)) {
            onEnumCoercing.invoke();
            return true;
        }
        return false;
    }
}
