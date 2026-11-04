package io.ktor.http.content;

import io.ktor.http.l1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends w.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final byte[] f295687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final io.ktor.http.m f295688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final l1 f295689d;

    public /* synthetic */ c(byte[] bArr, io.ktor.http.m mVar, l1 l1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i10 & 2) != 0 ? null : mVar, (i10 & 4) != 0 ? null : l1Var);
    }

    @Override // io.ktor.http.content.w
    @NotNull
    public Long a() {
        return Long.valueOf(this.f295687b.length);
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public io.ktor.http.m b() {
        return this.f295688c;
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public l1 e() {
        return this.f295689d;
    }

    @Override // io.ktor.http.content.w.a
    @NotNull
    public byte[] h() {
        return this.f295687b;
    }

    public c(@NotNull byte[] bytes, @Nullable io.ktor.http.m mVar, @Nullable l1 l1Var) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f295687b = bytes;
        this.f295688c = mVar;
        this.f295689d = l1Var;
    }
}
