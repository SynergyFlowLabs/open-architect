package com.planner5d.library.database.model;

import androidx.room.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@u(primaryKeys = {"hash", "format"}, tableName = "user_model_metadata")
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.room.i(index = true, name = "hash")
    @NotNull
    private final String f154186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.room.i(index = true, name = "format")
    @NotNull
    private final String f154187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.room.i(name = "uri")
    @NotNull
    private final String f154188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.room.i(name = "file_integrity_hash")
    @NotNull
    private final String f154189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.room.i(name = "last_update_unix_millis")
    private final long f154190e;

    public k(@NotNull String hash, @NotNull String formatCode, @NotNull String uri, @NotNull String fileIntegrityHash, long j10) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(formatCode, "formatCode");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(fileIntegrityHash, "fileIntegrityHash");
        this.f154186a = hash;
        this.f154187b = formatCode;
        this.f154188c = uri;
        this.f154189d = fileIntegrityHash;
        this.f154190e = j10;
    }

    @NotNull
    public final String a() {
        return this.f154189d;
    }

    @NotNull
    public final String b() {
        return this.f154187b;
    }

    @NotNull
    public final String c() {
        return this.f154186a;
    }

    public final long d() {
        return this.f154190e;
    }

    @NotNull
    public final String e() {
        return this.f154188c;
    }
}
