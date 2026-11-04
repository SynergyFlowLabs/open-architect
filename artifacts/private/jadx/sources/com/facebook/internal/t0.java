package com.facebook.internal;

import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f100110f = "FacebookSDK.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.facebook.t0 f100112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f100113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private StringBuilder f100114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f100115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f100109e = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final HashMap<String, String> f100111g = new HashMap<>();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized String h(String str) {
            String strK2;
            try {
                strK2 = str;
                for (Map.Entry entry : t0.f100111g.entrySet()) {
                    strK2 = StringsKt.k2(strK2, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return strK2;
        }

        @oj.n
        public final void b(@NotNull com.facebook.t0 behavior, int i10, @NotNull String tag, @NotNull String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            if (com.facebook.g0.P(behavior)) {
                String strH = h(string);
                if (!StringsKt.u2(tag, t0.f100110f, false, 2, null)) {
                    tag = Intrinsics.stringPlus(t0.f100110f, tag);
                }
                Log.println(i10, tag, strH);
                if (behavior == com.facebook.t0.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        @oj.n
        public final void c(@NotNull com.facebook.t0 behavior, int i10, @NotNull String tag, @NotNull String format, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            if (com.facebook.g0.P(behavior)) {
                q1 q1Var = q1.f312784a;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                b(behavior, i10, tag, str);
            }
        }

        @oj.n
        public final void d(@NotNull com.facebook.t0 behavior, @NotNull String tag, @NotNull String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            b(behavior, 3, tag, string);
        }

        @oj.n
        public final void e(@NotNull com.facebook.t0 behavior, @NotNull String tag, @NotNull String format, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            if (com.facebook.g0.P(behavior)) {
                q1 q1Var = q1.f312784a;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                b(behavior, 3, tag, str);
            }
        }

        @oj.n
        public final synchronized void f(@NotNull String accessToken) {
            try {
                Intrinsics.checkNotNullParameter(accessToken, "accessToken");
                com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                if (!com.facebook.g0.P(com.facebook.t0.INCLUDE_ACCESS_TOKENS)) {
                    g(accessToken, "ACCESS_TOKEN_REMOVED");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @oj.n
        public final synchronized void g(@NotNull String original, @NotNull String replace) {
            try {
                Intrinsics.checkNotNullParameter(original, "original");
                Intrinsics.checkNotNullParameter(replace, "replace");
                t0.f100111g.put(original, replace);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        private a() {
        }
    }

    public t0(@NotNull com.facebook.t0 behavior, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f100115d = 3;
        this.f100112a = behavior;
        f1 f1Var = f1.f99837a;
        this.f100113b = Intrinsics.stringPlus(f100110f, f1.t(tag, "tag"));
        this.f100114c = new StringBuilder();
    }

    @oj.n
    public static final void i(@NotNull com.facebook.t0 t0Var, int i10, @NotNull String str, @NotNull String str2) {
        f100109e.b(t0Var, i10, str, str2);
    }

    @oj.n
    public static final void j(@NotNull com.facebook.t0 t0Var, int i10, @NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
        f100109e.c(t0Var, i10, str, str2, objArr);
    }

    @oj.n
    public static final void k(@NotNull com.facebook.t0 t0Var, @NotNull String str, @NotNull String str2) {
        f100109e.d(t0Var, str, str2);
    }

    @oj.n
    public static final void l(@NotNull com.facebook.t0 t0Var, @NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
        f100109e.e(t0Var, str, str2, objArr);
    }

    @oj.n
    public static final synchronized void n(@NotNull String str) {
        try {
            f100109e.f(str);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @oj.n
    public static final synchronized void o(@NotNull String str, @NotNull String str2) {
        try {
            f100109e.g(str, str2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final boolean q() {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        return com.facebook.g0.P(this.f100112a);
    }

    public final void b(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (q()) {
            this.f100114c.append(string);
        }
    }

    public final void c(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (q()) {
            StringBuilder sb2 = this.f100114c;
            q1 q1Var = q1.f312784a;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            sb2.append(str);
        }
    }

    public final void d(@NotNull StringBuilder stringBuilder) {
        Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        if (q()) {
            this.f100114c.append((CharSequence) stringBuilder);
        }
    }

    public final void e(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        c("  %s:\t%s\n", key, value);
    }

    @NotNull
    public final String f() {
        a aVar = f100109e;
        String string = this.f100114c.toString();
        Intrinsics.checkNotNullExpressionValue(string, "contents.toString()");
        return aVar.h(string);
    }

    public final int g() {
        return this.f100115d;
    }

    public final void h() {
        String string = this.f100114c.toString();
        Intrinsics.checkNotNullExpressionValue(string, "contents.toString()");
        m(string);
        this.f100114c = new StringBuilder();
    }

    public final void m(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        f100109e.b(this.f100112a, this.f100115d, this.f100113b, string);
    }

    public final void p(int i10) {
        f1 f1Var = f1.f99837a;
        f1.u(Integer.valueOf(i10), "value", 7, 3, 6, 4, 2, 5);
        p(i10);
    }
}
