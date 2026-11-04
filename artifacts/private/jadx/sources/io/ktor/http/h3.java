package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class h3 implements io.ktor.utils.io.q0<Url> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h3 f295863a = new h3();

    private h3() {
    }

    @Override // io.ktor.utils.io.q0
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Url g4(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return w2.f(StringsKt.F1(value));
    }

    @Override // io.ktor.utils.io.q0
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] n2(@NotNull Url value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return StringsKt.I1(value.toString());
    }
}
