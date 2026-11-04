package kotlin.io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@oj.i(name = "ConsoleKt")
public final class d {
    @kotlin.internal.f
    private static final void a(byte b10) {
        System.out.print(Byte.valueOf(b10));
    }

    @kotlin.internal.f
    private static final void b(char c10) {
        System.out.print(c10);
    }

    @kotlin.internal.f
    private static final void c(double d10) {
        System.out.print(d10);
    }

    @kotlin.internal.f
    private static final void d(float f10) {
        System.out.print(f10);
    }

    @kotlin.internal.f
    private static final void e(int i10) {
        System.out.print(i10);
    }

    @kotlin.internal.f
    private static final void f(long j10) {
        System.out.print(j10);
    }

    @kotlin.internal.f
    private static final void g(Object obj) {
        System.out.print(obj);
    }

    @kotlin.internal.f
    private static final void h(short s10) {
        System.out.print(Short.valueOf(s10));
    }

    @kotlin.internal.f
    private static final void i(boolean z10) {
        System.out.print(z10);
    }

    @kotlin.internal.f
    private static final void j(char[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        System.out.print(message);
    }

    @kotlin.internal.f
    private static final void k() {
        System.out.println();
    }

    @kotlin.internal.f
    private static final void l(byte b10) {
        System.out.println(Byte.valueOf(b10));
    }

    @kotlin.internal.f
    private static final void m(char c10) {
        System.out.println(c10);
    }

    @kotlin.internal.f
    private static final void n(double d10) {
        System.out.println(d10);
    }

    @kotlin.internal.f
    private static final void o(float f10) {
        System.out.println(f10);
    }

    @kotlin.internal.f
    private static final void p(int i10) {
        System.out.println(i10);
    }

    @kotlin.internal.f
    private static final void q(long j10) {
        System.out.println(j10);
    }

    @kotlin.internal.f
    private static final void r(Object obj) {
        System.out.println(obj);
    }

    @kotlin.internal.f
    private static final void s(short s10) {
        System.out.println(Short.valueOf(s10));
    }

    @kotlin.internal.f
    private static final void t(boolean z10) {
        System.out.println(z10);
    }

    @kotlin.internal.f
    private static final void u(char[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        System.out.println(message);
    }

    @Nullable
    public static final String v() {
        q qVar = q.f312693a;
        InputStream in = System.in;
        Intrinsics.checkNotNullExpressionValue(in, "in");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
        return qVar.d(in, charsetDefaultCharset);
    }

    @e1(version = "1.6")
    @NotNull
    public static final String w() {
        String strX = x();
        if (strX != null) {
            return strX;
        }
        throw new u("EOF has already been reached");
    }

    @e1(version = "1.6")
    @Nullable
    public static final String x() {
        return v();
    }
}
