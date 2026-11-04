package com.facebook.bolts;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f99342a;

    public h(@NotNull k tokenSource) {
        Intrinsics.checkNotNullParameter(tokenSource, "tokenSource");
        this.f99342a = tokenSource;
    }

    public final boolean a() {
        return this.f99342a.h();
    }

    @NotNull
    public final i b(@Nullable Runnable runnable) {
        return this.f99342a.l(runnable);
    }

    public final void c() throws CancellationException {
        this.f99342a.m();
    }

    @NotNull
    public String toString() {
        q1 q1Var = q1.f312784a;
        String str = String.format(Locale.US, "%s@%s[cancellationRequested=%s]", Arrays.copyOf(new Object[]{h.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(this.f99342a.h())}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        return str;
    }
}
