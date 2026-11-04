package androidx.media3.container;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o0;
import com.google.common.base.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements r0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62004e = "com.android.capture.fps";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f62005f = "auxiliary.tracks.offset";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f62006g = "auxiliary.tracks.length";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f62007h = "auxiliary.tracks.map";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f62008i = "auxiliary.tracks.interleaved";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte f62009j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte f62010k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f62011l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f62012m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f62013n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f62014o = 23;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f62015p = 67;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f62016q = 75;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f62017r = 78;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f62019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f62020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f62021d;

    public a(String str, byte[] bArr, int i10) {
        this(str, bArr, 0, i10);
    }

    private static String c(List<Integer> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("track types = ");
        a0.o(AbstractJsonLexerKt.COMMA).f(sb2, list);
        return sb2.toString();
    }

    private static void d(String str, byte[] bArr, int i10) {
        byte b10;
        str.getClass();
        boolean z10 = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i10 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                androidx.media3.common.util.a.a(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                androidx.media3.common.util.a.a(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i10 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                androidx.media3.common.util.a.a(z10);
                break;
            case "auxiliary.tracks.map":
                androidx.media3.common.util.a.a(i10 == 0);
                break;
        }
    }

    public List<Integer> b() {
        androidx.media3.common.util.a.j(this.f62018a.equals(f62007h), "Metadata is not an auxiliary tracks map");
        byte b10 = this.f62019b[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(this.f62019b[i10 + 2]));
        }
        return arrayList;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f62018a.equals(aVar.f62018a) && Arrays.equals(this.f62019b, aVar.f62019b) && this.f62020c == aVar.f62020c && this.f62021d == aVar.f62021d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f62018a.hashCode()) * 31) + Arrays.hashCode(this.f62019b)) * 31) + this.f62020c) * 31) + this.f62021d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    public String toString() {
        String strC;
        int i10 = this.f62021d;
        if (i10 != 0) {
            if (i10 == 1) {
                strC = k1.T(this.f62019b);
            } else if (i10 == 23) {
                strC = String.valueOf(Float.intBitsToFloat(com.google.common.primitives.l.k(this.f62019b)));
            } else if (i10 == 67) {
                strC = String.valueOf(com.google.common.primitives.l.k(this.f62019b));
            } else if (i10 == 75) {
                strC = String.valueOf(Byte.toUnsignedInt(this.f62019b[0]));
            } else if (i10 != 78) {
                strC = k1.v2(this.f62019b);
            } else {
                strC = String.valueOf(new o0(this.f62019b).S());
            }
        } else if (this.f62018a.equals(f62007h)) {
            strC = c(b());
        } else {
            strC = k1.v2(this.f62019b);
        }
        return "mdta: key=" + this.f62018a + ", value=" + strC;
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        d(str, bArr, i11);
        this.f62018a = str;
        this.f62019b = bArr;
        this.f62020c = i10;
        this.f62021d = i11;
    }
}
