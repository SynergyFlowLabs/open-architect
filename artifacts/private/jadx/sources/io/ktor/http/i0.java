package io.ktor.http;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieUtilsKt\n+ 2 CookieUtils.kt\nio/ktor/http/StringLexer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n106#1,2:352\n106#1,2:355\n106#1,2:359\n106#1,2:362\n106#1,2:366\n106#1,2:371\n106#1,2:377\n115#1,3:380\n118#1:385\n106#1,2:386\n119#1,2:388\n122#1:391\n106#1,2:392\n124#1,2:394\n106#1,2:396\n126#1,4:398\n106#1,2:402\n131#1,2:404\n106#1,2:406\n133#1,9:408\n168#1,3:417\n171#1:422\n106#1,2:423\n172#1,2:425\n175#1,6:428\n149#1,12:434\n188#1,3:446\n191#1:451\n106#1,2:453\n192#1,2:455\n195#1,6:458\n56#2,2:350\n58#2:354\n56#2,2:357\n58#2:361\n56#2,2:364\n58#2:368\n56#2,2:369\n58#2:373\n56#2,2:374\n58#2:379\n56#2,2:383\n58#2:390\n56#2,2:420\n58#2:427\n56#2,2:449\n58#2:457\n1#3:376\n1#3:452\n*S KotlinDebug\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieUtilsKt\n*L\n118#1:352,2\n122#1:355,2\n125#1:359,2\n129#1:362,2\n132#1:366,2\n171#1:371,2\n191#1:377,2\n209#1:380,3\n209#1:385\n209#1:386,2\n209#1:388,2\n209#1:391\n209#1:392,2\n209#1:394,2\n209#1:396,2\n209#1:398,4\n209#1:402,2\n209#1:404,2\n209#1:406,2\n209#1:408,9\n220#1:417,3\n220#1:422\n220#1:423,2\n220#1:425,2\n220#1:428,6\n229#1:434,12\n238#1:446,3\n238#1:451\n238#1:453,2\n238#1:455,2\n238#1:458,6\n117#1:350,2\n117#1:354\n124#1:357,2\n124#1:361\n131#1:364,2\n131#1:368\n170#1:369,2\n170#1:373\n190#1:374,2\n190#1:379\n209#1:383,2\n209#1:390\n220#1:420,2\n220#1:427\n238#1:449,2\n238#1:457\n238#1:452\n*E\n"})
public final class i0 {

    public static final class a implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f295878a = new a();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.e(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class b implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f295879a = new b();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.f(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class c implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f295880a = new c();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.c(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class d implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f295881a = new d();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.c(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class e implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f295882a = new e();

        public final Boolean c(char c10) {
            return Boolean.valueOf(c10 == ':');
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class f implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f295883a = new f();

        public final Boolean c(char c10) {
            return Boolean.valueOf(c10 == ':');
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class g implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f295884a = new g();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.e(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class h implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f295885a = new h();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.f(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class i implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f295886a = new i();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.c(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class j implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f295887a = new j();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.c(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class k implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f295888a = new k();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.c(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class l implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f295889a = new l();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.c(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class m implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f295890a = new m();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.c(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class n implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f295891a = new n();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.c(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class o implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f295892a = new o();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.e(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class p implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f295893a = new p();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.f(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class q implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f295894a = new q();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.c(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final class r implements Function1<Character, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f295895a = new r();

        public final Boolean c(char c10) {
            return Boolean.valueOf(i0.c(c10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Character ch2) {
            return c(ch2.charValue());
        }
    }

    public static final void a(@NotNull io.ktor.http.r rVar, @NotNull String token) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(token, "token");
        if (rVar.c() == null || rVar.d() == null || rVar.f() == null) {
            j2 j2Var = new j2(token);
            int iE = j2Var.e();
            if (j2Var.a(i.f295886a)) {
                j2Var.a(j.f295887a);
                String strSubstring = j2Var.f().substring(iE, j2Var.e());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                int i10 = Integer.parseInt(strSubstring);
                if (j2Var.a(e.f295882a)) {
                    int iE2 = j2Var.e();
                    if (j2Var.a(k.f295888a)) {
                        j2Var.a(l.f295889a);
                        String strSubstring2 = j2Var.f().substring(iE2, j2Var.e());
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        int i11 = Integer.parseInt(strSubstring2);
                        if (j2Var.a(f.f295883a)) {
                            int iE3 = j2Var.e();
                            if (j2Var.a(m.f295890a)) {
                                j2Var.a(n.f295891a);
                                String strSubstring3 = j2Var.f().substring(iE3, j2Var.e());
                                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                                int i12 = Integer.parseInt(strSubstring3);
                                if (j2Var.a(g.f295884a)) {
                                    j2Var.b(h.f295885a);
                                }
                                rVar.i(Integer.valueOf(i10));
                                rVar.j(Integer.valueOf(i11));
                                rVar.l(Integer.valueOf(i12));
                                return;
                            }
                        }
                    }
                }
            }
        }
        if (rVar.b() == null) {
            j2 j2Var2 = new j2(token);
            int iE4 = j2Var2.e();
            if (j2Var2.a(c.f295880a)) {
                j2Var2.a(d.f295881a);
                String strSubstring4 = j2Var2.f().substring(iE4, j2Var2.e());
                Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                int i13 = Integer.parseInt(strSubstring4);
                if (j2Var2.a(a.f295878a)) {
                    j2Var2.b(b.f295879a);
                }
                rVar.h(Integer.valueOf(i13));
                return;
            }
        }
        if (rVar.e() == null && token.length() >= 3) {
            for (ni.h hVar : ni.h.l()) {
                if (StringsKt.s2(token, hVar.n(), true)) {
                    rVar.k(hVar);
                    return;
                }
            }
        }
        if (rVar.g() == null) {
            j2 j2Var3 = new j2(token);
            int iE5 = j2Var3.e();
            for (int i14 = 0; i14 < 2; i14++) {
                if (!j2Var3.a(q.f295894a)) {
                    return;
                }
            }
            for (int i15 = 0; i15 < 2; i15++) {
                j2Var3.a(r.f295895a);
            }
            String strSubstring5 = j2Var3.f().substring(iE5, j2Var3.e());
            Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
            int i16 = Integer.parseInt(strSubstring5);
            if (j2Var3.a(o.f295892a)) {
                j2Var3.b(p.f295893a);
            }
            rVar.m(Integer.valueOf(i16));
        }
    }

    public static final boolean b(char c10) {
        if (c10 != '\t' && ((' ' > c10 || c10 >= '0') && ((';' > c10 || c10 >= 'A') && (('[' > c10 || c10 >= 'a') && ('{' > c10 || c10 >= 127))))) {
            return false;
        }
        return true;
    }

    public static final boolean c(char c10) {
        return '0' <= c10 && c10 < ':';
    }

    public static final boolean d(char c10) {
        return (c10 >= 0 && c10 < '\t') || ('\n' <= c10 && c10 < ' ') || (('0' <= c10 && c10 < ':') || c10 == ':' || (('a' <= c10 && c10 < '{') || (('A' <= c10 && c10 < '[') || (127 <= c10 && c10 < 256))));
    }

    public static final boolean e(char c10) {
        if (c10 < 0 || c10 >= '0') {
            return 'J' <= c10 && c10 < 256;
        }
        return true;
    }

    public static final boolean f(char c10) {
        return c10 >= 0 && c10 < 256;
    }

    public static final void g(boolean z10, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (z10) {
            return;
        }
        block.invoke();
    }

    public static final void h(@NotNull String str, @NotNull Function1<? super Integer, Unit> success) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(success, "success");
        j2 j2Var = new j2(str);
        int iE = j2Var.e();
        if (j2Var.a(c.f295880a)) {
            j2Var.a(d.f295881a);
            String strSubstring = j2Var.f().substring(iE, j2Var.e());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            int i10 = Integer.parseInt(strSubstring);
            if (j2Var.a(a.f295878a)) {
                j2Var.b(b.f295879a);
            }
            success.invoke(Integer.valueOf(i10));
        }
    }

    public static final void i(@NotNull String str, @NotNull Function1<? super ni.h, Unit> success) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(success, "success");
        if (str.length() < 3) {
            return;
        }
        for (ni.h hVar : ni.h.l()) {
            if (StringsKt.s2(str, hVar.n(), true)) {
                success.invoke(hVar);
                return;
            }
        }
    }

    public static final void j(@NotNull String str, @NotNull pj.n<? super Integer, ? super Integer, ? super Integer, Unit> success) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(success, "success");
        j2 j2Var = new j2(str);
        int iE = j2Var.e();
        if (j2Var.a(i.f295886a)) {
            j2Var.a(j.f295887a);
            String strSubstring = j2Var.f().substring(iE, j2Var.e());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            int i10 = Integer.parseInt(strSubstring);
            if (j2Var.a(e.f295882a)) {
                int iE2 = j2Var.e();
                if (j2Var.a(k.f295888a)) {
                    j2Var.a(l.f295889a);
                    String strSubstring2 = j2Var.f().substring(iE2, j2Var.e());
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    int i11 = Integer.parseInt(strSubstring2);
                    if (j2Var.a(f.f295883a)) {
                        int iE3 = j2Var.e();
                        if (j2Var.a(m.f295890a)) {
                            j2Var.a(n.f295891a);
                            String strSubstring3 = j2Var.f().substring(iE3, j2Var.e());
                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                            int i12 = Integer.parseInt(strSubstring3);
                            if (j2Var.a(g.f295884a)) {
                                j2Var.b(h.f295885a);
                            }
                            success.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
                        }
                    }
                }
            }
        }
    }

    public static final void k(@NotNull String str, @NotNull Function1<? super Integer, Unit> success) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(success, "success");
        j2 j2Var = new j2(str);
        int iE = j2Var.e();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!j2Var.a(q.f295894a)) {
                return;
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            j2Var.a(r.f295895a);
        }
        String strSubstring = j2Var.f().substring(iE, j2Var.e());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        int i12 = Integer.parseInt(strSubstring);
        if (j2Var.a(o.f295892a)) {
            j2Var.b(p.f295893a);
        }
        success.invoke(Integer.valueOf(i12));
    }
}
