package com.google.api.client.repackaged.com.google.common.base;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@r7.b
public final class l {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f115890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f115891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f115892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f115893d;

        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f115894a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f115895b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            a f115896c;

            private a() {
            }
        }

        private a h() {
            a aVar = new a();
            this.f115892c.f115896c = aVar;
            this.f115892c = aVar;
            return aVar;
        }

        private b i(@fj.h Object obj) {
            h().f115895b = obj;
            return this;
        }

        private b j(String str, @fj.h Object obj) {
            a aVarH = h();
            aVarH.f115895b = obj;
            aVarH.f115894a = (String) q.E(str);
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
            this.f115893d = true;
            return this;
        }

        public String toString() {
            boolean z10 = this.f115893d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f115890a);
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            String str = "";
            for (a aVar = this.f115891b.f115896c; aVar != null; aVar = aVar.f115896c) {
                Object obj = aVar.f115895b;
                if (!z10 || obj != null) {
                    sb2.append(str);
                    String str2 = aVar.f115894a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb2.append(AbstractJsonLexerKt.END_OBJ);
            return sb2.toString();
        }

        private b(String str) {
            a aVar = new a();
            this.f115891b = aVar;
            this.f115892c = aVar;
            this.f115893d = false;
            this.f115890a = (String) q.E(str);
        }
    }

    private l() {
    }

    public static <T> T a(@fj.h T t10, @fj.h T t11) {
        return t10 != null ? t10 : (T) q.E(t11);
    }

    public static b b(Class<?> cls) {
        return new b(cls.getSimpleName());
    }

    public static b c(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }

    public static b d(String str) {
        return new b(str);
    }
}
