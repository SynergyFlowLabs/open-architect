package com.google.common.base;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b
@k
public final class b0 {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f116440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1042b f116441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C1042b f116442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f116443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f116444e;

        private static final class a extends C1042b {
            private a() {
            }
        }

        /* JADX INFO: renamed from: com.google.common.base.b0$b$b, reason: collision with other inner class name */
        static class C1042b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @fj.a
            String f116445a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @fj.a
            Object f116446b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @fj.a
            C1042b f116447c;

            C1042b() {
            }
        }

        private C1042b h() {
            C1042b c1042b = new C1042b();
            this.f116442c.f116447c = c1042b;
            this.f116442c = c1042b;
            return c1042b;
        }

        @z7.a
        private b i(@fj.a Object value) {
            h().f116446b = value;
            return this;
        }

        @z7.a
        private b j(String name, @fj.a Object value) {
            C1042b c1042bH = h();
            c1042bH.f116446b = value;
            c1042bH.f116445a = (String) j0.E(name);
            return this;
        }

        private a k() {
            a aVar = new a();
            this.f116442c.f116447c = aVar;
            this.f116442c = aVar;
            return aVar;
        }

        @z7.a
        private b l(Object value) {
            k().f116446b = value;
            return this;
        }

        @z7.a
        private b m(String name, Object value) {
            a aVarK = k();
            aVarK.f116446b = value;
            aVarK.f116445a = (String) j0.E(name);
            return this;
        }

        private static boolean u(Object value) {
            if (value instanceof CharSequence) {
                return ((CharSequence) value).length() == 0;
            }
            if (value instanceof Collection) {
                return ((Collection) value).isEmpty();
            }
            if (value instanceof Map) {
                return ((Map) value).isEmpty();
            }
            if (value instanceof e0) {
                return !((e0) value).e();
            }
            return value.getClass().isArray() && Array.getLength(value) == 0;
        }

        @z7.a
        public b a(String name, char value) {
            return m(name, String.valueOf(value));
        }

        @z7.a
        public b b(String name, double value) {
            return m(name, String.valueOf(value));
        }

        @z7.a
        public b c(String name, float value) {
            return m(name, String.valueOf(value));
        }

        @z7.a
        public b d(String name, int value) {
            return m(name, String.valueOf(value));
        }

        @z7.a
        public b e(String name, long value) {
            return m(name, String.valueOf(value));
        }

        @z7.a
        public b f(String name, @fj.a Object value) {
            return j(name, value);
        }

        @z7.a
        public b g(String name, boolean value) {
            return m(name, String.valueOf(value));
        }

        @z7.a
        public b n(char value) {
            return l(String.valueOf(value));
        }

        @z7.a
        public b o(double value) {
            return l(String.valueOf(value));
        }

        @z7.a
        public b p(float value) {
            return l(String.valueOf(value));
        }

        @z7.a
        public b q(int value) {
            return l(String.valueOf(value));
        }

        @z7.a
        public b r(long value) {
            return l(String.valueOf(value));
        }

        @z7.a
        public b s(@fj.a Object value) {
            return i(value);
        }

        @z7.a
        public b t(boolean value) {
            return l(String.valueOf(value));
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0037  */
        /* JADX WARN: Code duplicated, block: B:15:0x0040  */
        /* JADX WARN: Code duplicated, block: B:18:0x004b  */
        /* JADX WARN: Code duplicated, block: B:21:0x006d  */
        public String toString() {
            String str;
            boolean z10 = this.f116443d;
            boolean z11 = this.f116444e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f116440a);
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            String str2 = "";
            for (C1042b c1042b = this.f116441b.f116447c; c1042b != null; c1042b = c1042b.f116447c) {
                Object obj = c1042b.f116446b;
                if (c1042b instanceof a) {
                    sb2.append(str2);
                    str = c1042b.f116445a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append('=');
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                } else if (obj == null) {
                    if (!z10) {
                        sb2.append(str2);
                        str = c1042b.f116445a;
                        if (str != null) {
                            sb2.append(str);
                            sb2.append('=');
                        }
                        if (obj == null) {
                            sb2.append(obj);
                        } else {
                            sb2.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z11 || !u(obj)) {
                    sb2.append(str2);
                    str = c1042b.f116445a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append('=');
                    }
                    if (obj == null) {
                        sb2.append(obj);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb2.append(AbstractJsonLexerKt.END_OBJ);
            return sb2.toString();
        }

        @z7.a
        public b v() {
            this.f116443d = true;
            return this;
        }

        private b(String className) {
            C1042b c1042b = new C1042b();
            this.f116441b = c1042b;
            this.f116442c = c1042b;
            this.f116443d = false;
            this.f116444e = false;
            this.f116440a = (String) j0.E(className);
        }
    }

    private b0() {
    }

    public static <T> T a(@fj.a T first, @fj.a T second) {
        if (first != null) {
            return first;
        }
        if (second != null) {
            return second;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Class<?> clazz) {
        return new b(clazz.getSimpleName());
    }

    public static b c(Object self) {
        return new b(self.getClass().getSimpleName());
    }

    public static b d(String className) {
        return new b(className);
    }
}
