package io.ktor.http.cio;

import io.ktor.http.j1;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.io.x f295479a = ui.j.a();

    public static /* synthetic */ void d(c0 c0Var, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        c0Var.c(bArr, i10, i11);
    }

    @NotNull
    public final kotlinx.io.c0 a() {
        return ui.j.e(this.f295479a);
    }

    public final void b(@NotNull ByteBuffer content) {
        Intrinsics.checkNotNullParameter(content, "content");
        ui.i.a(this.f295479a, content);
    }

    public final void c(@NotNull byte[] content, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        ui.j.h(this.f295479a, content, i10, i11);
    }

    public final void e() {
        this.f295479a.m6(com.google.common.base.c.f116462o);
        this.f295479a.m6((byte) 10);
    }

    public final void f(@NotNull CharSequence name, @NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ui.j.d(this.f295479a, name, 0, 0, 6, null);
        ui.j.d(this.f295479a, ": ", 0, 0, 6, null);
        ui.j.d(this.f295479a, value, 0, 0, 6, null);
        this.f295479a.m6(com.google.common.base.c.f116462o);
        this.f295479a.m6((byte) 10);
    }

    public final void g(@NotNull CharSequence line) {
        Intrinsics.checkNotNullParameter(line, "line");
        int i10 = 6 ^ 0;
        ui.j.d(this.f295479a, line, 0, 0, 6, null);
        this.f295479a.m6(com.google.common.base.c.f116462o);
        this.f295479a.m6((byte) 10);
    }

    public final void h() {
        this.f295479a.close();
    }

    public final void i(@NotNull j1 method, @NotNull CharSequence uri, @NotNull CharSequence version) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(version, "version");
        ui.u.p(this.f295479a, method.l(), 0, 0, null, 14, null);
        this.f295479a.m6((byte) 32);
        ui.u.p(this.f295479a, uri, 0, 0, null, 14, null);
        this.f295479a.m6((byte) 32);
        ui.u.p(this.f295479a, version, 0, 0, null, 14, null);
        this.f295479a.m6(com.google.common.base.c.f116462o);
        this.f295479a.m6((byte) 10);
    }

    public final void j(@NotNull CharSequence version, int i10, @NotNull CharSequence statusText) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        ui.u.p(this.f295479a, version, 0, 0, null, 14, null);
        this.f295479a.m6((byte) 32);
        ui.u.p(this.f295479a, String.valueOf(i10), 0, 0, null, 14, null);
        this.f295479a.m6((byte) 32);
        ui.u.p(this.f295479a, statusText, 0, 0, null, 14, null);
        this.f295479a.m6(com.google.common.base.c.f116462o);
        this.f295479a.m6((byte) 10);
    }
}
