package io.ktor.http;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f296087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f296088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f296089c;

    public s0(@NotNull String name, @NotNull String value, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f296087a = name;
        this.f296088b = value;
        this.f296089c = z10;
    }

    public static /* synthetic */ s0 e(s0 s0Var, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = s0Var.f296087a;
        }
        if ((i10 & 2) != 0) {
            str2 = s0Var.f296088b;
        }
        if ((i10 & 4) != 0) {
            z10 = s0Var.f296089c;
        }
        return s0Var.d(str, str2, z10);
    }

    @NotNull
    public final String a() {
        return this.f296087a;
    }

    @NotNull
    public final String b() {
        return this.f296088b;
    }

    public final boolean c() {
        return this.f296089c;
    }

    @NotNull
    public final s0 d(@NotNull String name, @NotNull String value, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new s0(name, value, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (StringsKt.N1(s0Var.f296087a, this.f296087a, true) && StringsKt.N1(s0Var.f296088b, this.f296088b, true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f296089c;
    }

    @NotNull
    public final String g() {
        return this.f296087a;
    }

    @NotNull
    public final String h() {
        return this.f296088b;
    }

    public int hashCode() {
        String str = this.f296087a;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f296088b.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode();
    }

    @NotNull
    public String toString() {
        return "HeaderValueParam(name=" + this.f296087a + ", value=" + this.f296088b + ", escapeValue=" + this.f296089c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s0(@NotNull String name, @NotNull String value) {
        this(name, value, false);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
