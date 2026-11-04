package com.google.common.escape;

import com.google.common.base.j0;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.r;

/* JADX INFO: loaded from: classes5.dex */
@f
@com.google.common.annotations.b
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f118510a = new a();

    class a extends d {
        a() {
        }

        @Override // com.google.common.escape.d, com.google.common.escape.h
        public String b(String string) {
            return (String) j0.E(string);
        }

        @Override // com.google.common.escape.d
        @fj.a
        protected char[] c(char c10) {
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Character, String> f118511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private char f118512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private char f118513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.a
        private String f118514d;

        class a extends com.google.common.escape.a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @fj.a
            private final char[] f118515g;

            a(Map replacementMap, char safeMin, char safeMax) {
                super((Map<Character, String>) replacementMap, safeMin, safeMax);
                this.f118515g = b.this.f118514d != null ? b.this.f118514d.toCharArray() : null;
            }

            @Override // com.google.common.escape.a
            @fj.a
            protected char[] f(char c10) {
                return this.f118515g;
            }
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @z7.a
        public b b(char c10, String replacement) {
            j0.E(replacement);
            this.f118511a.put(Character.valueOf(c10), replacement);
            return this;
        }

        public h c() {
            return new a(this.f118511a, this.f118512b, this.f118513c);
        }

        @z7.a
        public b d(char safeMin, char safeMax) {
            this.f118512b = safeMin;
            this.f118513c = safeMax;
            return this;
        }

        @z7.a
        public b e(String unsafeReplacement) {
            this.f118514d = unsafeReplacement;
            return this;
        }

        private b() {
            this.f118511a = new HashMap();
            this.f118512b = (char) 0;
            this.f118513c = r.f312787c;
            this.f118514d = null;
        }
    }

    private i() {
    }

    public static b a() {
        return new b(null);
    }

    @fj.a
    public static String b(d escaper, char c10) {
        return e(escaper.c(c10));
    }

    @fj.a
    public static String c(l escaper, int cp) {
        return e(escaper.d(cp));
    }

    public static h d() {
        return f118510a;
    }

    @fj.a
    private static String e(@fj.a char[] in) {
        if (in == null) {
            return null;
        }
        return new String(in);
    }
}
