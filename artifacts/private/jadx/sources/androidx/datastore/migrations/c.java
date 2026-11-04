package androidx.datastore.migrations;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSharedPreferencesMigration.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/migrations/SharedPreferencesView\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n515#2:324\n500#2,6:325\n442#2:331\n392#2:332\n1238#3,4:333\n1#4:337\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/migrations/SharedPreferencesView\n*L\n303#1:324\n303#1:325,6\n305#1:331\n305#1:332\n305#1:333,4\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f49849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Set<String> f49850b;

    public c(@NotNull SharedPreferences prefs, @Nullable Set<String> set) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.f49849a = prefs;
        this.f49850b = set;
    }

    private final String a(String str) {
        Set<String> set = this.f49850b;
        if (set != null && !set.contains(str)) {
            throw new IllegalStateException(("Can't access key outside migration: " + str).toString());
        }
        return str;
    }

    public static /* synthetic */ String i(c cVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return cVar.h(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set k(c cVar, String str, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        return cVar.j(str, set);
    }

    public final boolean b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49849a.contains(a(key));
    }

    @NotNull
    public final Map<String, Object> c() {
        Map<String, ?> all = this.f49849a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.f49850b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.toSet((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean d(@NotNull String key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49849a.getBoolean(a(key), z10);
    }

    public final float e(@NotNull String key, float f10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49849a.getFloat(a(key), f10);
    }

    public final int f(@NotNull String key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49849a.getInt(a(key), i10);
    }

    public final long g(@NotNull String key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49849a.getLong(a(key), j10);
    }

    @Nullable
    public final String h(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49849a.getString(a(key), str);
    }

    @Nullable
    public final Set<String> j(@NotNull String key, @Nullable Set<String> set) {
        Intrinsics.checkNotNullParameter(key, "key");
        Set<String> stringSet = this.f49849a.getStringSet(a(key), set);
        if (stringSet != null) {
            return CollectionsKt.toMutableSet(stringSet);
        }
        return null;
    }
}
