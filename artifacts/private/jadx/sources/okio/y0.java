package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n+ 2 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n63#2,12:141\n63#2,12:153\n104#2,2:165\n106#2,26:168\n135#2,5:194\n142#2:199\n145#2,3:200\n63#2,8:203\n148#2,8:211\n71#2,4:219\n156#2:223\n63#2,12:224\n160#2:236\n85#2,10:237\n161#2,9:247\n95#2,4:256\n170#2,2:260\n179#2,4:262\n85#2,10:266\n183#2,3:276\n95#2,4:279\n186#2:283\n195#2,8:284\n85#2,10:292\n203#2,3:302\n95#2,4:305\n206#2:309\n215#2,5:310\n85#2,10:315\n220#2,3:325\n95#2,4:328\n223#2:332\n226#2,4:333\n234#2,6:337\n63#2,8:343\n240#2,7:351\n71#2,4:358\n247#2,2:362\n1#3:167\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n*L\n54#1:141,12\n66#1:153,12\n78#1:165,2\n78#1:168,26\n80#1:194,5\n82#1:199\n84#1:200,3\n84#1:203,8\n84#1:211,8\n84#1:219,4\n84#1:223\n90#1:224,12\n96#1:236\n96#1:237,10\n96#1:247,9\n96#1:256,4\n96#1:260,2\n103#1:262,4\n103#1:266,10\n103#1:276,3\n103#1:279,4\n103#1:283\n110#1:284,8\n110#1:292,10\n110#1:302,3\n110#1:305,4\n110#1:309\n117#1:310,5\n117#1:315,10\n117#1:325,3\n117#1:328,4\n117#1:332\n131#1:333,4\n133#1:337,6\n133#1:343,8\n133#1:351,7\n133#1:358,4\n133#1:362,2\n78#1:167\n*E\n"})
public final class y0 extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final transient byte[][] f335141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final transient int[] f335142h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(@NotNull byte[][] segments, @NotNull int[] directory) {
        super(o.f335048f.H());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f335141g = segments;
        this.f335142h = directory;
    }

    private final o L0() {
        return new o(F0());
    }

    private final Object writeReplace() {
        o oVarL0 = L0();
        Intrinsics.checkNotNull(oVarL0, "null cannot be cast to non-null type java.lang.Object");
        return oVarL0;
    }

    @Override // okio.o
    @NotNull
    public o B0(int i10, int i11) {
        int iL = i.l(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (iL > v0()) {
            throw new IllegalArgumentException(("endIndex=" + iL + " > length(" + v0() + ')').toString());
        }
        int i12 = iL - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iL + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iL == v0()) {
            return this;
        }
        if (i10 == iL) {
            return o.f335048f;
        }
        int iN = okio.internal.h.n(this, i10);
        int iN2 = okio.internal.h.n(this, iL - 1);
        byte[][] bArr = (byte[][]) ArraysKt.copyOfRange(K0(), iN, iN2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iN <= iN2) {
            int i13 = iN;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(J0()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = J0()[K0().length + i13];
                if (i13 == iN2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iN != 0 ? J0()[iN - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new y0(bArr, iArr);
    }

    @Override // okio.o
    @NotNull
    public o D0() {
        return L0().D0();
    }

    @Override // okio.o
    @NotNull
    public o E0() {
        return L0().E0();
    }

    @Override // okio.o
    @NotNull
    public byte[] F0() {
        byte[] bArr = new byte[v0()];
        int length = K0().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = J0()[length + i10];
            int i14 = J0()[i10];
            int i15 = i14 - i11;
            ArraysKt.copyInto(K0()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // okio.o
    public void H0(@NotNull OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        int length = K0().length;
        int i10 = 0;
        int i11 = 4 ^ 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = J0()[length + i10];
            int i14 = J0()[i10];
            out.write(K0()[i10], i13, i14 - i12);
            i10++;
            i12 = i14;
        }
    }

    @Override // okio.o
    public void I0(@NotNull l buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i12 = i10 + i11;
        int iN = okio.internal.h.n(this, i10);
        while (i10 < i12) {
            int i13 = iN == 0 ? 0 : J0()[iN - 1];
            int i14 = J0()[iN] - i13;
            int i15 = J0()[K0().length + iN];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            w0 w0Var = new w0(K0()[iN], i16, i16 + iMin, true, false);
            w0 w0Var2 = buffer.f335034a;
            if (w0Var2 == null) {
                w0Var.f335134g = w0Var;
                w0Var.f335133f = w0Var;
                buffer.f335034a = w0Var;
            } else {
                Intrinsics.checkNotNull(w0Var2);
                w0 w0Var3 = w0Var2.f335134g;
                Intrinsics.checkNotNull(w0Var3);
                w0Var3.c(w0Var);
            }
            i10 += iMin;
            iN++;
        }
        buffer.B0(buffer.size() + ((long) i11));
    }

    @NotNull
    public final int[] J0() {
        return this.f335142h;
    }

    @NotNull
    public final byte[][] K0() {
        return this.f335141g;
    }

    @Override // okio.o
    public int L() {
        return J0()[K0().length - 1];
    }

    @Override // okio.o
    @NotNull
    public String N() {
        return L0().N();
    }

    @Override // okio.o
    @NotNull
    public o O(@NotNull String algorithm, @NotNull o key) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.F0(), algorithm));
            int length = K0().length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = J0()[length + i10];
                int i13 = J0()[i10];
                mac.update(K0()[i10], i12, i13 - i11);
                i10++;
                i11 = i13;
            }
            byte[] bArrDoFinal = mac.doFinal();
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new o(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // okio.o
    public int X(@NotNull byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return L0().X(other, i10);
    }

    @Override // okio.o
    @NotNull
    public byte[] a0() {
        return F0();
    }

    @Override // okio.o
    public byte c0(int i10) {
        i.e(J0()[K0().length - 1], i10, 1L);
        int iN = okio.internal.h.n(this, i10);
        return K0()[iN][(i10 - (iN == 0 ? 0 : J0()[iN - 1])) + J0()[K0().length + iN]];
    }

    @Override // okio.o
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (oVar.v0() == v0() && n0(0, oVar, 0, v0())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.o
    public int g0(@NotNull byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return L0().g0(other, i10);
    }

    @Override // okio.o
    public int hashCode() {
        int I = I();
        if (I != 0) {
            return I;
        }
        int length = K0().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = J0()[length + i10];
            int i14 = J0()[i10];
            byte[] bArr = K0()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        q0(i11);
        return i11;
    }

    @Override // okio.o
    @NotNull
    public ByteBuffer l() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(F0()).asReadOnlyBuffer();
        Intrinsics.checkNotNullExpressionValue(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // okio.o
    @NotNull
    public String n() {
        return L0().n();
    }

    @Override // okio.o
    public boolean n0(int i10, @NotNull o other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i13 = 0 << 0;
        if (i10 < 0 || i10 > v0() - i12) {
            return false;
        }
        int i14 = i12 + i10;
        int iN = okio.internal.h.n(this, i10);
        while (i10 < i14) {
            int i15 = iN == 0 ? 0 : J0()[iN - 1];
            int i16 = J0()[iN] - i15;
            int i17 = J0()[K0().length + iN];
            int iMin = Math.min(i14, i16 + i15) - i10;
            if (!other.o0(i11, K0()[iN], i17 + (i10 - i15), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iN++;
        }
        return true;
    }

    @Override // okio.o
    @NotNull
    public String o() {
        return L0().o();
    }

    @Override // okio.o
    public boolean o0(int i10, @NotNull byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > v0() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iN = okio.internal.h.n(this, i10);
        while (i10 < i13) {
            int i14 = iN == 0 ? 0 : J0()[iN - 1];
            int i15 = J0()[iN] - i14;
            int i16 = J0()[K0().length + iN];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!i.d(K0()[iN], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iN++;
        }
        return true;
    }

    @Override // okio.o
    public void q(int i10, @NotNull byte[] target, int i11, int i12) {
        Intrinsics.checkNotNullParameter(target, "target");
        long j10 = i12;
        i.e(v0(), i10, j10);
        i.e(target.length, i11, j10);
        int i13 = i12 + i10;
        int iN = okio.internal.h.n(this, i10);
        while (i10 < i13) {
            int i14 = iN == 0 ? 0 : J0()[iN - 1];
            int i15 = J0()[iN] - i14;
            int i16 = J0()[K0().length + iN];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = i16 + (i10 - i14);
            ArraysKt.copyInto(K0()[iN], target, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iN++;
        }
    }

    @Override // okio.o
    @NotNull
    public String toString() {
        return L0().toString();
    }

    @Override // okio.o
    @NotNull
    public o v(@NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = K0().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = J0()[length + i10];
            int i13 = J0()[i10];
            messageDigest.update(K0()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        return new o(bArrDigest);
    }

    @Override // okio.o
    @NotNull
    public String y0(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return L0().y0(charset);
    }
}
