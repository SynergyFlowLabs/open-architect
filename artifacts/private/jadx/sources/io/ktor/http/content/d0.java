package io.ktor.http.content;

import io.ktor.http.l1;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 extends w.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f295701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.ktor.http.m f295702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final l1 f295703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final byte[] f295704e;

    public /* synthetic */ d0(String str, io.ktor.http.m mVar, l1 l1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, mVar, (i10 & 4) != 0 ? null : l1Var);
    }

    @Override // io.ktor.http.content.w
    @NotNull
    public Long a() {
        return Long.valueOf(this.f295704e.length);
    }

    @Override // io.ktor.http.content.w
    @NotNull
    public io.ktor.http.m b() {
        return this.f295702c;
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public l1 e() {
        return this.f295703d;
    }

    @Override // io.ktor.http.content.w.a
    @NotNull
    public byte[] h() {
        return this.f295704e;
    }

    @NotNull
    public final String i() {
        return this.f295701b;
    }

    @NotNull
    public String toString() {
        return "TextContent[" + b() + "] \"" + StringsKt.X8(this.f295701b, 30) + '\"';
    }

    public d0(@NotNull String text, @NotNull io.ktor.http.m contentType, @Nullable l1 l1Var) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f295701b = text;
        this.f295702c = contentType;
        this.f295703d = l1Var;
        Charset charsetA = io.ktor.http.o.a(b());
        this.f295704e = ui.u.l(text, charsetA == null ? Charsets.UTF_8 : charsetA);
    }
}
