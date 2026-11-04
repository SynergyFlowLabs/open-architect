package io.ktor.http;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/StringLexer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n1#2:350\n*E\n"})
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f295907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f295908b;

    public j2(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f295907a = source;
    }

    public final boolean a(@NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean zH = h(predicate);
        if (zH) {
            this.f295908b++;
        }
        return zH;
    }

    public final boolean b(@NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (!h(predicate)) {
            return false;
        }
        while (h(predicate)) {
            this.f295908b++;
        }
        return true;
    }

    @NotNull
    public final String c(@NotNull Function1<? super j2, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int iE = e();
        block.invoke(this);
        String strSubstring = f().substring(iE, e());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean d() {
        return this.f295908b < this.f295907a.length();
    }

    public final int e() {
        return this.f295908b;
    }

    @NotNull
    public final String f() {
        return this.f295907a;
    }

    public final void g(int i10) {
        this.f295908b = i10;
    }

    public final boolean h(@NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return this.f295908b < this.f295907a.length() && predicate.invoke(Character.valueOf(this.f295907a.charAt(this.f295908b))).booleanValue();
    }
}
