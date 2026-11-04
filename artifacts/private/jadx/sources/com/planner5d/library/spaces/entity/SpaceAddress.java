package com.planner5d.library.spaces.entity;

import androidx.compose.runtime.internal.w0;
import com.squareup.moshi.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 1)
@i(generateAdapter = true)
public final class SpaceAddress {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f230165e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f230166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f230167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f230168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f230169d;

    public SpaceAddress(@NotNull String city, @NotNull String state, @NotNull String streetAddress, @NotNull String zipcode) {
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(streetAddress, "streetAddress");
        Intrinsics.checkNotNullParameter(zipcode, "zipcode");
        this.f230166a = city;
        this.f230167b = state;
        this.f230168c = streetAddress;
        this.f230169d = zipcode;
    }

    @NotNull
    public final String a() {
        return this.f230166a;
    }

    @NotNull
    public final String b() {
        return this.f230167b;
    }

    @NotNull
    public final String c() {
        return this.f230168c;
    }

    @NotNull
    public final String d() {
        return this.f230169d;
    }
}
