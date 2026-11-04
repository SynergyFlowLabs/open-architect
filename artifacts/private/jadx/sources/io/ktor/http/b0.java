package io.ktor.http;

import io.ktor.util.date.GMTDate;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieDateParser\n+ 2 CookieUtils.kt\nio/ktor/http/StringLexer\n*L\n1#1,349:1\n56#2,3:350\n*S KotlinDebug\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieDateParser\n*L\n294#1:350,3\n*E\n"})
public final class b0 {
    private final <T> void j(String str, String str2, T t10) {
        if (t10 != null) {
            return;
        }
        throw new r1(str, "Could not find " + str2);
    }

    private final void k(String str, boolean z10, Function0<String> function0) {
        if (!z10) {
            throw new r1(str, function0.invoke());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(char c10) {
        return i0.b(c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(char c10) {
        return i0.d(c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(char c10) {
        return i0.d(c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(char c10) {
        return i0.b(c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q() {
        return "day-of-month not in [1,31]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r() {
        return "year >= 1601";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String s() {
        return "hours > 23";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t() {
        return "minutes > 59";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String u() {
        return "seconds > 59";
    }

    @NotNull
    public final GMTDate l(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        j2 j2Var = new j2(source);
        r rVar = new r();
        j2Var.b(new Function1() { // from class: io.ktor.http.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(b0.m(((Character) obj).charValue()));
            }
        });
        while (j2Var.d()) {
            if (j2Var.h(new Function1() { // from class: io.ktor.http.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(b0.n(((Character) obj).charValue()));
                }
            })) {
                int iE = j2Var.e();
                j2Var.b(new Function1() { // from class: io.ktor.http.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(b0.o(((Character) obj).charValue()));
                    }
                });
                String strSubstring = j2Var.f().substring(iE, j2Var.e());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                i0.a(rVar, strSubstring);
                j2Var.b(new Function1() { // from class: io.ktor.http.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(b0.p(((Character) obj).charValue()));
                    }
                });
            }
        }
        Integer numG = rVar.g();
        IntRange intRange = new IntRange(70, 99);
        if (numG == null || !intRange.t(numG.intValue())) {
            IntRange intRange2 = new IntRange(0, 69);
            if (numG != null && intRange2.t(numG.intValue())) {
                Integer numG2 = rVar.g();
                Intrinsics.checkNotNull(numG2);
                rVar.m(Integer.valueOf(numG2.intValue() + 2000));
            }
        } else {
            Integer numG3 = rVar.g();
            Intrinsics.checkNotNull(numG3);
            rVar.m(Integer.valueOf(numG3.intValue() + 1900));
        }
        j(source, "day-of-month", rVar.b());
        j(source, "month", rVar.e());
        j(source, "year", rVar.g());
        j(source, "time", rVar.c());
        j(source, "time", rVar.d());
        j(source, "time", rVar.f());
        IntRange intRange3 = new IntRange(1, 31);
        Integer numB = rVar.b();
        k(source, numB != null && intRange3.t(numB.intValue()), new Function0() { // from class: io.ktor.http.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b0.q();
            }
        });
        Integer numG4 = rVar.g();
        Intrinsics.checkNotNull(numG4);
        k(source, numG4.intValue() >= 1601, new Function0() { // from class: io.ktor.http.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b0.r();
            }
        });
        Integer numC = rVar.c();
        Intrinsics.checkNotNull(numC);
        k(source, numC.intValue() <= 23, new Function0() { // from class: io.ktor.http.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b0.s();
            }
        });
        Integer numD = rVar.d();
        Intrinsics.checkNotNull(numD);
        k(source, numD.intValue() <= 59, new Function0() { // from class: io.ktor.http.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b0.t();
            }
        });
        Integer numF = rVar.f();
        Intrinsics.checkNotNull(numF);
        k(source, numF.intValue() <= 59, new Function0() { // from class: io.ktor.http.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b0.u();
            }
        });
        return rVar.a();
    }
}
