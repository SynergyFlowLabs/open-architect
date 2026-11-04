package org.apache.commons.io;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336421c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f336422d = new a("UTF-8", 239, 187, 191);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f336423e = new a("UTF-16BE", com.planner5d.library.engine.input.f.b.X1, 255);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f336424f = new a("UTF-16LE", 255, com.planner5d.library.engine.input.f.b.X1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f336425g = new a("UTF-32BE", 0, 0, com.planner5d.library.engine.input.f.b.X1, 255);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f336426h = new a("UTF-32LE", 255, com.planner5d.library.engine.input.f.b.X1, 0, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char f336427i = 65279;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f336428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f336429b;

    public a(String str, int... iArr) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("No charsetName specified");
        }
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("No bytes specified");
        }
        this.f336428a = str;
        int[] iArr2 = new int[iArr.length];
        this.f336429b = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
    }

    public int a(int i10) {
        return this.f336429b[i10];
    }

    public byte[] b() {
        byte[] bArr = new byte[this.f336429b.length];
        int i10 = 0;
        while (true) {
            int[] iArr = this.f336429b;
            if (i10 >= iArr.length) {
                return bArr;
            }
            bArr[i10] = (byte) iArr[i10];
            i10++;
        }
    }

    public String c() {
        return this.f336428a;
    }

    public int d() {
        return this.f336429b.length;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f336429b.length != aVar.d()) {
            return false;
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f336429b;
            if (i10 >= iArr.length) {
                return true;
            }
            if (iArr[i10] != aVar.a(i10)) {
                return false;
            }
            i10++;
        }
    }

    public int hashCode() {
        int iHashCode = getClass().hashCode();
        for (int i10 : this.f336429b) {
            iHashCode += i10;
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(this.f336428a);
        sb2.append(": ");
        for (int i10 = 0; i10 < this.f336429b.length; i10++) {
            if (i10 > 0) {
                sb2.append(",");
            }
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f336429b[i10] & 255).toUpperCase());
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }
}
