package io.ktor.client.request.forms;

import io.ktor.http.content.w;
import io.ktor.http.o1;
import io.ktor.http.x1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends w.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x1 f295285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final byte[] f295286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f295287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.ktor.http.m f295288e;

    public f(@NotNull x1 formData) {
        Intrinsics.checkNotNullParameter(formData, "formData");
        this.f295285b = formData;
        byte[] bArrM = ui.u.m(o1.b(formData), null, 1, null);
        this.f295286c = bArrM;
        this.f295287d = bArrM.length;
        this.f295288e = io.ktor.http.o.b(io.ktor.http.m.a.f295985a.g(), Charsets.UTF_8);
    }

    @Override // io.ktor.http.content.w
    @NotNull
    public Long a() {
        return Long.valueOf(this.f295287d);
    }

    @Override // io.ktor.http.content.w
    @NotNull
    public io.ktor.http.m b() {
        return this.f295288e;
    }

    @Override // io.ktor.http.content.w.a
    @NotNull
    public byte[] h() {
        return this.f295286c;
    }

    @NotNull
    public final x1 i() {
        return this.f295285b;
    }
}
