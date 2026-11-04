package io.ktor.client.plugins;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class x0 extends IOException implements kotlinx.coroutines.h0<x0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f295261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Long f295262b;

    public /* synthetic */ x0(String str, Long l10, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l10, (i10 & 4) != 0 ? null : th2);
    }

    @Override // kotlinx.coroutines.h0
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x0 b() {
        return new x0(this.f295261a, this.f295262b, getCause());
    }

    public x0(@NotNull String url, @Nullable Long l10, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(url, "url");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request timeout has expired [url=");
        sb2.append(url);
        sb2.append(", request_timeout=");
        sb2.append(l10 == null ? "unknown" : l10);
        sb2.append(" ms]");
        super(sb2.toString(), th2);
        this.f295261a = url;
        this.f295262b = l10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x0(@NotNull fi.y request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String strC = request.i().c();
        f1 f1Var = (f1) request.f(e1.f294787a);
        this(strC, f1Var != null ? f1Var.d() : null, null, 4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x0(@NotNull fi.z request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String string = request.h().toString();
        f1 f1Var = (f1) request.c(e1.f294787a);
        this(string, f1Var != null ? f1Var.d() : null, null, 4, null);
    }
}
