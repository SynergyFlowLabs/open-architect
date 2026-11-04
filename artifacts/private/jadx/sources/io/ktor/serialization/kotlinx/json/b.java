package io.ktor.serialization.kotlinx.json;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ui.u;

/* JADX INFO: loaded from: classes6.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final byte[] f296458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final byte[] f296459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final byte[] f296460c;

    public b(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f296458a = u.l("[", charset);
        this.f296459b = u.l("]", charset);
        this.f296460c = u.l(",", charset);
    }

    @NotNull
    public final byte[] a() {
        return this.f296458a;
    }

    @NotNull
    public final byte[] b() {
        return this.f296459b;
    }

    @NotNull
    public final byte[] c() {
        return this.f296460c;
    }
}
