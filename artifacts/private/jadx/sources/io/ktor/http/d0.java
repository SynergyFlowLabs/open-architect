package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 implements io.ktor.utils.io.q0<Cookie> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d0 f295781a = new d0();

    private d0() {
    }

    @Override // io.ktor.utils.io.q0
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Cookie g4(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return h0.p(StringsKt.F1(value));
    }

    @Override // io.ktor.utils.io.q0
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] n2(@NotNull Cookie value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return StringsKt.I1(h0.r(value));
    }
}
