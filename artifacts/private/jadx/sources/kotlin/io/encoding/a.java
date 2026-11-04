package kotlin.io.encoding;

import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.collections.AbstractList;
import kotlin.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@f
@e1(version = "1.8")
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f312531e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f312532f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f312533g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f312534h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte f312535i = 61;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f312536j = 76;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f312537k = 19;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final a f312539m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final a f312540n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f312541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f312542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f312543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C2256a f312530d = new C2256a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final byte[] f312538l = {com.google.common.base.c.f116462o, 10};

    /* JADX INFO: renamed from: kotlin.io.encoding.a$a, reason: collision with other inner class name */
    public static final class C2256a extends a {
        public /* synthetic */ C2256a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a K() {
            return a.f312540n;
        }

        @NotNull
        public final byte[] L() {
            return a.f312538l;
        }

        @NotNull
        public final a M() {
            return a.f312539m;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private C2256a() {
            boolean z10 = false;
            super(z10, z10, b.PRESENT, null);
        }
    }

    @e1(version = "2.0")
    public enum b {
        PRESENT,
        ABSENT,
        PRESENT_OPTIONAL,
        ABSENT_OPTIONAL;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f312549f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f312549f;
        }
    }

    static {
        int i10 = 3 | 0 | 2;
        b bVar = b.PRESENT;
        f312539m = new a(true, false, bVar);
        f312540n = new a(false, true, bVar);
    }

    public /* synthetic */ a(boolean z10, boolean z11, b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, bVar);
    }

    public static /* synthetic */ byte[] B(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return aVar.A(bArr, i10, i11);
    }

    private final int E(byte[] bArr, int i10, int i11, int i12) {
        if (i12 == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + i10);
        }
        if (i12 == -6) {
            g(i10);
            return i10 + 1;
        }
        if (i12 != -4) {
            if (i12 == -2) {
                return i10 + 1;
            }
            throw new IllegalStateException("Unreachable");
        }
        g(i10);
        int I = I(bArr, i10 + 1, i11);
        if (I != i11 && bArr[I] == 61) {
            return I + 1;
        }
        throw new IllegalArgumentException("Missing one pad character at index " + I);
    }

    private final boolean H() {
        b bVar = this.f312543c;
        if (bVar != b.PRESENT && bVar != b.PRESENT_OPTIONAL) {
            return false;
        }
        return true;
    }

    private final int I(byte[] bArr, int i10, int i11) {
        if (!this.f312542b) {
            return i10;
        }
        while (i10 < i11) {
            int i12 = 5 & (-1);
            if (c.f312551b[bArr[i10] & 255] != -1) {
                break;
            }
            i10++;
        }
        return i10;
    }

    private final void f(int i10, int i11, int i12) {
        if (i11 < 0 || i11 > i10) {
            throw new IndexOutOfBoundsException("destination offset: " + i11 + ", destination size: " + i10);
        }
        int i13 = i11 + i12;
        if (i13 < 0 || i13 > i10) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i11 + ", destination size: " + i10 + ", capacity needed: " + i12);
        }
    }

    private final void g(int i10) {
        if (this.f312543c != b.ABSENT) {
            return;
        }
        throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + i10);
    }

    public static /* synthetic */ byte[] k(a aVar, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return aVar.i(charSequence, i10, i11);
    }

    public static /* synthetic */ byte[] l(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return aVar.j(bArr, i10, i11);
    }

    private final int m(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int[] iArr = this.f312541a ? c.f312553d : c.f312551b;
        int i16 = -8;
        int i17 = i10;
        int iE = i11;
        int i18 = -8;
        int i19 = 0;
        while (true) {
            if (iE >= i12) {
                i13 = 8;
                i14 = 0;
                break;
            }
            if (i18 != i16 || iE + 3 >= i12) {
                i13 = 8;
                i15 = 1;
            } else {
                i13 = 8;
                i15 = 1;
                int i20 = iE + 4;
                int i21 = (iArr[bArr[iE + 1] & 255] << 12) | (iArr[bArr[iE] & 255] << 18) | (iArr[bArr[iE + 2] & 255] << 6) | iArr[bArr[iE + 3] & 255];
                if (i21 >= 0) {
                    bArr2[i17] = (byte) (i21 >> 16);
                    int i22 = i17 + 2;
                    bArr2[i17 + 1] = (byte) (i21 >> 8);
                    i17 += 3;
                    bArr2[i22] = (byte) i21;
                    iE = i20;
                }
                i16 = -8;
            }
            int i23 = bArr[iE] & 255;
            int i24 = iArr[i23];
            if (i24 >= 0) {
                iE++;
                i19 = (i19 << 6) | i24;
                int i25 = i18 + 6;
                if (i25 >= 0) {
                    bArr2[i17] = (byte) (i19 >>> i25);
                    i19 &= (i15 << i25) - 1;
                    i18 -= 2;
                    i17++;
                } else {
                    i18 = i25;
                }
            } else {
                if (i24 == -2) {
                    iE = E(bArr, iE, i12, i18);
                    i14 = i15;
                    break;
                }
                if (!this.f312542b) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid symbol '");
                    sb2.append((char) i23);
                    sb2.append("'(");
                    String string = Integer.toString(i23, CharsKt.checkRadix(i13));
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    sb2.append(string);
                    sb2.append(") at index ");
                    sb2.append(iE);
                    throw new IllegalArgumentException(sb2.toString());
                }
                iE++;
            }
            i16 = -8;
        }
        if (i18 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i18 != -8 && i14 == 0 && this.f312543c == b.PRESENT) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i19 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        int I = I(bArr, iE, i12);
        if (I >= i12) {
            return i17 - i10;
        }
        int i26 = bArr[I] & 255;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Symbol '");
        sb3.append((char) i26);
        sb3.append("'(");
        String string2 = Integer.toString(i26, CharsKt.checkRadix(i13));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb3.append(string2);
        sb3.append(") at index ");
        sb3.append(I - 1);
        sb3.append(" is prohibited after the pad character");
        throw new IllegalArgumentException(sb3.toString());
    }

    public static /* synthetic */ int p(a aVar, CharSequence charSequence, byte[] bArr, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i13 & 4) != 0) {
            i10 = 0;
        }
        if ((i13 & 8) != 0) {
            i11 = 0;
        }
        if ((i13 & 16) != 0) {
            i12 = charSequence.length();
        }
        return aVar.n(charSequence, bArr, i10, i11, i12);
    }

    public static /* synthetic */ int q(a aVar, byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i13 & 4) != 0) {
            i10 = 0;
        }
        if ((i13 & 8) != 0) {
            i11 = 0;
        }
        if ((i13 & 16) != 0) {
            i12 = bArr.length;
        }
        return aVar.o(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ String t(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return aVar.s(bArr, i10, i11);
    }

    public static /* synthetic */ int v(a aVar, byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        if ((i13 & 4) != 0) {
            i10 = 0;
        }
        if ((i13 & 8) != 0) {
            i11 = 0;
        }
        if ((i13 & 16) != 0) {
            i12 = bArr.length;
        }
        return aVar.u(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ Appendable z(a aVar, byte[] bArr, Appendable appendable, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = bArr.length;
        }
        return aVar.y(bArr, appendable, i10, i11);
    }

    @NotNull
    public final byte[] A(@NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        return C(source, i10, i11);
    }

    @NotNull
    public final byte[] C(@NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        h(source.length, i10, i11);
        byte[] bArr = new byte[x(i11 - i10)];
        w(source, bArr, 0, i10, i11);
        return bArr;
    }

    @NotNull
    public final b D() {
        return this.f312543c;
    }

    public final boolean F() {
        return this.f312542b;
    }

    public final boolean G() {
        return this.f312541a;
    }

    @e1(version = "2.0")
    @NotNull
    public final a J(@NotNull b option) {
        Intrinsics.checkNotNullParameter(option, "option");
        return this.f312543c == option ? this : new a(this.f312541a, this.f312542b, option);
    }

    @NotNull
    public final String d(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        StringBuilder sb2 = new StringBuilder(source.length);
        for (byte b10 : source) {
            sb2.append((char) b10);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final byte[] e(@NotNull CharSequence source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        h(source.length(), i10, i11);
        byte[] bArr = new byte[i11 - i10];
        int i12 = 0;
        while (i10 < i11) {
            char cCharAt = source.charAt(i10);
            if (cCharAt <= 255) {
                bArr[i12] = (byte) cCharAt;
                i12++;
            } else {
                bArr[i12] = 63;
                i12++;
            }
            i10++;
        }
        return bArr;
    }

    public final void h(int i10, int i11, int i12) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i11, i12, i10);
    }

    @NotNull
    public final byte[] i(@NotNull CharSequence source, int i10, int i11) {
        byte[] bArrE;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof String) {
            h(source.length(), i10, i11);
            String strSubstring = ((String) source).substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.f313189f;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrE = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArrE, "getBytes(...)");
        } else {
            bArrE = e(source, i10, i11);
        }
        return l(this, bArrE, 0, 0, 6, null);
    }

    @NotNull
    public final byte[] j(@NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        h(source.length, i10, i11);
        int iR = r(source, i10, i11);
        byte[] bArr = new byte[iR];
        if (m(source, bArr, 0, i10, i11) == iR) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int n(@NotNull CharSequence source, @NotNull byte[] destination, int i10, int i11, int i12) {
        byte[] bArrE;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (source instanceof String) {
            h(source.length(), i11, i12);
            String strSubstring = ((String) source).substring(i11, i12);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.f313189f;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrE = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArrE, "getBytes(...)");
        } else {
            bArrE = e(source, i11, i12);
        }
        return q(this, bArrE, destination, i10, 0, 0, 24, null);
    }

    public final int o(@NotNull byte[] source, @NotNull byte[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        h(source.length, i11, i12);
        f(destination.length, i10, r(source, i11, i12));
        return m(source, destination, i10, i11, i12);
    }

    public final int r(@NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        int i12 = i11 - i10;
        if (i12 == 0) {
            return 0;
        }
        if (i12 == 1) {
            throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + i10 + ", endIndex: " + i11);
        }
        if (this.f312542b) {
            while (i10 < i11) {
                int i13 = c.f312551b[source[i10] & 255];
                if (i13 < 0) {
                    if (i13 == -2) {
                        i12 -= i11 - i10;
                        break;
                    }
                    i12--;
                }
                i10++;
            }
        } else if (source[i11 - 1] == 61) {
            i12 = source[i11 + (-2)] == 61 ? i12 - 2 : i12 - 1;
        }
        return (int) ((((long) i12) * ((long) 6)) / ((long) 8));
    }

    @NotNull
    public final String s(@NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new String(C(source, i10, i11), Charsets.f313189f);
    }

    public final int u(@NotNull byte[] source, @NotNull byte[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return w(source, destination, i10, i11, i12);
    }

    public final int w(@NotNull byte[] source, @NotNull byte[] destination, int i10, int i11, int i12) {
        int i13 = i11;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        h(source.length, i13, i12);
        f(destination.length, i10, x(i12 - i13));
        byte[] bArr = this.f312541a ? c.f312552c : c.f312550a;
        int i14 = this.f312542b ? 19 : Integer.MAX_VALUE;
        int i15 = i10;
        while (i13 + 2 < i12) {
            int iMin = Math.min((i12 - i13) / 3, i14);
            for (int i16 = 0; i16 < iMin; i16++) {
                int i17 = source[i13] & 255;
                int i18 = i13 + 2;
                int i19 = source[i13 + 1] & 255;
                i13 += 3;
                int i20 = (i19 << 8) | (i17 << 16) | (source[i18] & 255);
                destination[i15] = bArr[i20 >>> 18];
                destination[i15 + 1] = bArr[(i20 >>> 12) & 63];
                int i21 = i15 + 3;
                destination[i15 + 2] = bArr[(i20 >>> 6) & 63];
                i15 += 4;
                destination[i21] = bArr[i20 & 63];
            }
            if (iMin == i14 && i13 != i12) {
                int i22 = i15 + 1;
                byte[] bArr2 = f312538l;
                destination[i15] = bArr2[0];
                i15 += 2;
                destination[i22] = bArr2[1];
            }
        }
        int i23 = i12 - i13;
        if (i23 == 1) {
            int i24 = i13 + 1;
            int i25 = (source[i13] & 255) << 4;
            destination[i15] = bArr[i25 >>> 6];
            int i26 = i15 + 2;
            destination[i15 + 1] = bArr[i25 & 63];
            if (H()) {
                int i27 = i15 + 3;
                destination[i26] = f312535i;
                i15 += 4;
                destination[i27] = f312535i;
                i13 = i24;
            } else {
                i13 = i24;
                i15 = i26;
            }
        } else if (i23 == 2) {
            int i28 = i13 + 1;
            int i29 = source[i13] & 255;
            i13 += 2;
            int i30 = ((source[i28] & 255) << 2) | (i29 << 10);
            destination[i15] = bArr[i30 >>> 12];
            destination[i15 + 1] = bArr[(i30 >>> 6) & 63];
            int i31 = i15 + 3;
            destination[i15 + 2] = bArr[i30 & 63];
            if (H()) {
                i15 += 4;
                destination[i31] = f312535i;
            } else {
                i15 = i31;
            }
        }
        if (i13 == i12) {
            return i15 - i10;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int x(int i10) {
        int i11 = i10 / 3;
        int i12 = i10 % 3;
        int i13 = i11 * 4;
        if (i12 != 0) {
            i13 += H() ? 4 : i12 + 1;
        }
        if (this.f312542b) {
            i13 += ((i13 - 1) / 76) * 2;
        }
        if (i13 >= 0) {
            return i13;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    @NotNull
    public final <A extends Appendable> A y(@NotNull byte[] source, @NotNull A destination, int i10, int i11) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.append(new String(C(source, i10, i11), Charsets.f313189f));
        return destination;
    }

    private a(boolean z10, boolean z11, b bVar) {
        this.f312541a = z10;
        this.f312542b = z11;
        this.f312543c = bVar;
        if (z10 && z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
