package com.google.api.client.repackaged.com.google.common.base;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@r7.b
public final class m extends h {

    @Deprecated
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f115897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f115898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f115899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f115900d;

        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f115901a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f115902b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            a f115903c;

            private a() {
            }
        }

        private a h() {
            a aVar = new a();
            this.f115899c.f115903c = aVar;
            this.f115899c = aVar;
            return aVar;
        }

        private b i(@fj.h Object obj) {
            h().f115902b = obj;
            return this;
        }

        private b j(String str, @fj.h Object obj) {
            a aVarH = h();
            aVarH.f115902b = obj;
            aVarH.f115901a = (String) q.E(str);
            return this;
        }

        @z7.a
        public b a(String str, char c10) {
            return j(str, String.valueOf(c10));
        }

        @z7.a
        public b b(String str, double d10) {
            return j(str, String.valueOf(d10));
        }

        @z7.a
        public b c(String str, float f10) {
            return j(str, String.valueOf(f10));
        }

        @z7.a
        public b d(String str, int i10) {
            return j(str, String.valueOf(i10));
        }

        @z7.a
        public b e(String str, long j10) {
            return j(str, String.valueOf(j10));
        }

        @z7.a
        public b f(String str, @fj.h Object obj) {
            return j(str, obj);
        }

        @z7.a
        public b g(String str, boolean z10) {
            return j(str, String.valueOf(z10));
        }

        @z7.a
        public b k(char c10) {
            return i(String.valueOf(c10));
        }

        @z7.a
        public b l(double d10) {
            return i(String.valueOf(d10));
        }

        @z7.a
        public b m(float f10) {
            return i(String.valueOf(f10));
        }

        @z7.a
        public b n(int i10) {
            return i(String.valueOf(i10));
        }

        @z7.a
        public b o(long j10) {
            return i(String.valueOf(j10));
        }

        @z7.a
        public b p(@fj.h Object obj) {
            return i(obj);
        }

        @z7.a
        public b q(boolean z10) {
            return i(String.valueOf(z10));
        }

        @z7.a
        public b r() {
            this.f115900d = true;
            return this;
        }

        public String toString() {
            boolean z10 = this.f115900d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f115897a);
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            String str = "";
            for (a aVar = this.f115898b.f115903c; aVar != null; aVar = aVar.f115903c) {
                if (!z10 || aVar.f115902b != null) {
                    sb2.append(str);
                    String str2 = aVar.f115901a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    sb2.append(aVar.f115902b);
                    str = ", ";
                }
            }
            sb2.append(AbstractJsonLexerKt.END_OBJ);
            return sb2.toString();
        }

        private b(String str) {
            a aVar = new a();
            this.f115898b = aVar;
            this.f115899c = aVar;
            this.f115900d = false;
            this.f115897a = (String) q.E(str);
        }
    }

    private m() {
    }

    public static boolean a(@fj.h Object obj, @fj.h Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @Deprecated
    public static <T> T b(@fj.h T t10, @fj.h T t11) {
        return (T) l.a(t10, t11);
    }

    public static int c(@fj.h Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Deprecated
    public static b d(Class<?> cls) {
        return new b(cls.getSimpleName());
    }

    @Deprecated
    public static b e(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }

    @Deprecated
    public static b f(String str) {
        return new b(str);
    }
}
