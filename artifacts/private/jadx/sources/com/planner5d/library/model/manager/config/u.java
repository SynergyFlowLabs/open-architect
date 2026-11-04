package com.planner5d.library.model.manager.config;

import com.planner5d.library.services.utility.k1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f190891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f190892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final List<String> f190893c;

    public u(@Nullable String str, @Nullable String str2, @Nullable List<String> list) {
        this.f190891a = str;
        this.f190892b = str2;
        this.f190893c = list;
    }

    @Nullable
    public final List<String> a() {
        return this.f190893c;
    }

    @Nullable
    public final String b() {
        return this.f190891a;
    }

    @Nullable
    public final String c() {
        return this.f190892b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(@NotNull JSONObject json) {
        this(k1.y(json, com.planner5d.library.services.r.userFree, null, 4, null), k1.y(json, com.planner5d.library.services.r.userPaid, null, 4, null), k1.A(json, com.planner5d.library.services.r.close));
        Intrinsics.checkNotNullParameter(json, "json");
    }
}
