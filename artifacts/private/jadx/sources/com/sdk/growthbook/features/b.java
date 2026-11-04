package com.sdk.growthbook.features;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Map<String, com.sdk.growthbook.model.h> f266232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f266233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final JsonObject f266234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f266235d;

    public b() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b f(b bVar, Map map, String str, JsonObject jsonObject, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = bVar.f266232a;
        }
        if ((i10 & 2) != 0) {
            str = bVar.f266233b;
        }
        if ((i10 & 4) != 0) {
            jsonObject = bVar.f266234c;
        }
        if ((i10 & 8) != 0) {
            str2 = bVar.f266235d;
        }
        return bVar.e(map, str, jsonObject, str2);
    }

    @Nullable
    public final Map<String, com.sdk.growthbook.model.h> a() {
        return this.f266232a;
    }

    @Nullable
    public final String b() {
        return this.f266233b;
    }

    @Nullable
    public final JsonObject c() {
        return this.f266234c;
    }

    @Nullable
    public final String d() {
        return this.f266235d;
    }

    @NotNull
    public final b e(@Nullable Map<String, com.sdk.growthbook.model.h> map, @Nullable String str, @Nullable JsonObject jsonObject, @Nullable String str2) {
        return new b(map, str, jsonObject, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f266232a, bVar.f266232a) && Intrinsics.areEqual(this.f266233b, bVar.f266233b) && Intrinsics.areEqual(this.f266234c, bVar.f266234c) && Intrinsics.areEqual(this.f266235d, bVar.f266235d);
    }

    @Nullable
    public final String g() {
        return this.f266233b;
    }

    @Nullable
    public final String h() {
        return this.f266235d;
    }

    public int hashCode() {
        Map<String, com.sdk.growthbook.model.h> map = this.f266232a;
        int iHashCode = 0;
        int iHashCode2 = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.f266233b;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        JsonObject jsonObject = this.f266234c;
        int iHashCode4 = (iHashCode3 + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        String str2 = this.f266235d;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return iHashCode4 + iHashCode;
    }

    @Nullable
    public final Map<String, com.sdk.growthbook.model.h> i() {
        return this.f266232a;
    }

    @Nullable
    public final JsonObject j() {
        return this.f266234c;
    }

    @NotNull
    public String toString() {
        return "FeaturesDataModel(features=" + this.f266232a + ", encryptedFeatures=" + this.f266233b + ", savedGroups=" + this.f266234c + ", encryptedSavedGroups=" + this.f266235d + ")";
    }

    public b(@Nullable Map<String, com.sdk.growthbook.model.h> map, @Nullable String str, @Nullable JsonObject jsonObject, @Nullable String str2) {
        this.f266232a = map;
        this.f266233b = str;
        this.f266234c = jsonObject;
        this.f266235d = str2;
    }

    public /* synthetic */ b(Map map, String str, JsonObject jsonObject, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : jsonObject, (i10 & 8) != 0 ? null : str2);
    }
}
