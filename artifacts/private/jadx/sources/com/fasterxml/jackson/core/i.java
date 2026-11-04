package com.fasterxml.jackson.core;

import java.io.Serializable;
import java.nio.charset.Charset;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class i implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f102391f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f102392g = 500;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f102393h = new i(null, -1, -1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final long f102394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final long f102395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f102396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f102397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object f102398e;

    public i(Object obj, long j10, int i10, int i11) {
        this(obj, -1L, j10, i10, i11);
    }

    private int a(StringBuilder sb2, String str) {
        sb2.append('\"');
        sb2.append(str);
        sb2.append('\"');
        return str.length();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    protected StringBuilder b(StringBuilder sb2) {
        int length;
        int iA;
        Object obj = this.f102398e;
        if (obj == null) {
            sb2.append("UNKNOWN");
            return sb2;
        }
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (obj instanceof byte[]) {
            name = "byte[]";
        } else if (obj instanceof char[]) {
            name = "char[]";
        }
        sb2.append('(');
        sb2.append(name);
        sb2.append(')');
        int length2 = 0;
        String str = " chars";
        if (!(obj instanceof CharSequence)) {
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                length = cArr.length;
                iA = a(sb2, new String(cArr, 0, Math.min(length, 500)));
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int iMin = Math.min(bArr.length, 500);
                a(sb2, new String(bArr, 0, iMin, Charset.forName("UTF-8")));
                length2 = bArr.length - iMin;
                str = " bytes";
            }
            if (length2 > 0) {
                sb2.append("[truncated ");
                sb2.append(length2);
                sb2.append(str);
                sb2.append(AbstractJsonLexerKt.END_LIST);
            }
            return sb2;
        }
        CharSequence charSequence = (CharSequence) obj;
        length = charSequence.length();
        iA = a(sb2, charSequence.subSequence(0, Math.min(length, 500)).toString());
        length2 = length - iA;
        if (length2 > 0) {
            sb2.append("[truncated ");
            sb2.append(length2);
            sb2.append(str);
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb2;
    }

    public long c() {
        return this.f102394a;
    }

    public long d() {
        return this.f102395b;
    }

    public int e() {
        return this.f102397d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        Object obj2 = this.f102398e;
        if (obj2 == null) {
            if (iVar.f102398e != null) {
                return false;
            }
        } else if (!obj2.equals(iVar.f102398e)) {
            return false;
        }
        return this.f102396c == iVar.f102396c && this.f102397d == iVar.f102397d && this.f102395b == iVar.f102395b && c() == iVar.c();
    }

    public int f() {
        return this.f102396c;
    }

    public Object g() {
        return this.f102398e;
    }

    public String h() {
        return b(new StringBuilder(100)).toString();
    }

    public int hashCode() {
        Object obj = this.f102398e;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this.f102396c) + this.f102397d) ^ ((int) this.f102395b)) + ((int) this.f102394a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append("[Source: ");
        b(sb2);
        sb2.append("; line: ");
        sb2.append(this.f102396c);
        sb2.append(", column: ");
        sb2.append(this.f102397d);
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public i(Object obj, long j10, long j11, int i10, int i11) {
        this.f102398e = obj;
        this.f102394a = j10;
        this.f102395b = j11;
        this.f102396c = i10;
        this.f102397d = i11;
    }
}
