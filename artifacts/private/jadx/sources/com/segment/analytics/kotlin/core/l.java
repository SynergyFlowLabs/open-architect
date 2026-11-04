package com.segment.analytics.kotlin.core;

import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final JsonObject f266829a = new JsonObject(MapsKt.emptyMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final JsonArray f266830b = new JsonArray(CollectionsKt.emptyList());

    @NotNull
    public static final JsonArray a() {
        return f266830b;
    }

    @NotNull
    public static final JsonObject b() {
        return f266829a;
    }
}
