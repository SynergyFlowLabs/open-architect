package com.planner5d.library.userimporteddata;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f235835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f235836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f235837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f235838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f235839e;

    public p(@NotNull String hash, @NotNull d format, @NotNull String uri, @NotNull String fileIntegrityHash, long j10) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(fileIntegrityHash, "fileIntegrityHash");
        this.f235835a = hash;
        this.f235836b = format;
        this.f235837c = uri;
        this.f235838d = fileIntegrityHash;
        this.f235839e = j10;
    }

    @NotNull
    public final String a() {
        return this.f235838d;
    }

    @NotNull
    public final d b() {
        return this.f235836b;
    }

    @NotNull
    public final String c() {
        return this.f235835a;
    }

    public final long d() {
        return this.f235839e;
    }

    @NotNull
    public final String e() {
        return this.f235837c;
    }
}
