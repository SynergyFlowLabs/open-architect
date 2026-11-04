package com.planner5d.library.spaces.entity;

import androidx.compose.runtime.internal.w0;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@i(generateAdapter = true)
public final class SpaceInfo {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f230173h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SpaceAddress f230174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final List<String> f230175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Integer f230176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Integer f230177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Long f230178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Integer f230179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f230180g;

    public SpaceInfo(@NotNull SpaceAddress address, @Nullable List<String> list, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l10, @Nullable Integer num3, @Nullable String str) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f230174a = address;
        this.f230175b = list;
        this.f230176c = num;
        this.f230177d = num2;
        this.f230178e = l10;
        this.f230179f = num3;
        this.f230180g = str;
    }

    @NotNull
    public final SpaceAddress a() {
        return this.f230174a;
    }

    @Nullable
    public final Integer b() {
        return this.f230176c;
    }

    @Nullable
    public final List<String> c() {
        return this.f230175b;
    }

    @Nullable
    public final String d() {
        return this.f230180g;
    }

    @Nullable
    public final Integer e() {
        return this.f230177d;
    }

    @Nullable
    public final Long f() {
        return this.f230178e;
    }

    @Nullable
    public final Integer g() {
        return this.f230179f;
    }
}
