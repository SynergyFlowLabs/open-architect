package org.apache.commons.lang3.text;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.z;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f337302a = new a(AbstractJsonLexerKt.COMMA);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f337303b = new a('\t');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g f337304c = new a(' ');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g f337305d = new b(" \t\n\r\f".toCharArray());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g f337306e = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g f337307f = new a('\'');

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final g f337308g = new a('\"');

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final g f337309h = new b("'\"".toCharArray());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final g f337310i = new c();

    static final class a extends g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final char f337311j;

        a(char c10) {
            this.f337311j = c10;
        }

        @Override // org.apache.commons.lang3.text.g
        public int g(char[] cArr, int i10, int i11, int i12) {
            return this.f337311j == cArr[i10] ? 1 : 0;
        }
    }

    static final class b extends g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final char[] f337312j;

        b(char[] cArr) {
            char[] cArr2 = (char[]) cArr.clone();
            this.f337312j = cArr2;
            Arrays.sort(cArr2);
        }

        @Override // org.apache.commons.lang3.text.g
        public int g(char[] cArr, int i10, int i11, int i12) {
            return Arrays.binarySearch(this.f337312j, cArr[i10]) >= 0 ? 1 : 0;
        }
    }

    static final class c extends g {
        c() {
        }

        @Override // org.apache.commons.lang3.text.g
        public int g(char[] cArr, int i10, int i11, int i12) {
            return 0;
        }
    }

    static final class d extends g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final char[] f337313j;

        d(String str) {
            this.f337313j = str.toCharArray();
        }

        @Override // org.apache.commons.lang3.text.g
        public int g(char[] cArr, int i10, int i11, int i12) {
            int length = this.f337313j.length;
            if (i10 + length > i12) {
                return 0;
            }
            int i13 = 0;
            while (true) {
                char[] cArr2 = this.f337313j;
                if (i13 >= cArr2.length) {
                    return length;
                }
                if (cArr2[i13] != cArr[i10]) {
                    return 0;
                }
                i13++;
                i10++;
            }
        }

        public String toString() {
            return super.toString() + ' ' + Arrays.toString(this.f337313j);
        }
    }

    static final class e extends g {
        e() {
        }

        @Override // org.apache.commons.lang3.text.g
        public int g(char[] cArr, int i10, int i11, int i12) {
            return cArr[i10] <= ' ' ? 1 : 0;
        }
    }

    protected g() {
    }

    public static g a(char c10) {
        return new a(c10);
    }

    public static g b(String str) {
        if (z.A0(str)) {
            return f337310i;
        }
        return str.length() == 1 ? new a(str.charAt(0)) : new b(str.toCharArray());
    }

    public static g c(char... cArr) {
        if (cArr == null || cArr.length == 0) {
            return f337310i;
        }
        return cArr.length == 1 ? new a(cArr[0]) : new b(cArr);
    }

    public static g d() {
        return f337302a;
    }

    public static g e() {
        return f337308g;
    }

    public static g h() {
        return f337310i;
    }

    public static g i() {
        return f337309h;
    }

    public static g j() {
        return f337307f;
    }

    public static g k() {
        return f337304c;
    }

    public static g l() {
        return f337305d;
    }

    public static g m(String str) {
        return z.A0(str) ? f337310i : new d(str);
    }

    public static g n() {
        return f337303b;
    }

    public static g o() {
        return f337306e;
    }

    public int f(char[] cArr, int i10) {
        return g(cArr, i10, 0, cArr.length);
    }

    public abstract int g(char[] cArr, int i10, int i11, int i12);
}
