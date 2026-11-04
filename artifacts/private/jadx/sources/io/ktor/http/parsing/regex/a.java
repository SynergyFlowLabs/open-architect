package io.ktor.http.parsing.regex;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f296068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f296069b;

    public a(@NotNull String regexRaw, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(regexRaw, "regexRaw");
        if (z10) {
            regexRaw = '(' + regexRaw + ')';
        }
        this.f296068a = regexRaw;
        this.f296069b = z10 ? i10 + 1 : i10;
    }

    public final int a() {
        return this.f296069b;
    }

    @NotNull
    public final String b() {
        return this.f296068a;
    }

    public /* synthetic */ a(String str, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? false : z10);
    }
}
