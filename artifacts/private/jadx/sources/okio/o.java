package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 Util.kt\nokio/-SegmentedByteString\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n43#2,7:365\n53#2:372\n56#2:373\n64#2,4:374\n68#2:379\n70#2:381\n76#2,23:382\n104#2,23:405\n131#2,2:428\n133#2,9:431\n145#2:440\n148#2:441\n151#2:442\n154#2:443\n162#2:444\n172#2,3:445\n171#2:448\n185#2,2:449\n190#2:451\n194#2:452\n198#2:453\n202#2:454\n206#2,7:455\n219#2:462\n223#2,8:463\n235#2,4:471\n244#2,5:475\n253#2,6:480\n259#2,9:487\n322#2,8:496\n131#2,2:504\n133#2,9:507\n333#2,9:516\n68#3:378\n74#3:380\n74#3:486\n1#4:430\n1#4:506\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString\n*L\n66#1:365,7\n71#1:372\n108#1:373\n110#1:374,4\n110#1:379\n110#1:381\n112#1:382,23\n114#1:405,23\n118#1:428,2\n118#1:431,9\n120#1:440\n129#1:441\n131#1:442\n133#1:443\n152#1:444\n159#1:445,3\n159#1:448\n166#1:449,2\n168#1:451\n170#1:452\n172#1:453\n174#1:454\n180#1:455,7\n183#1:462\n186#1:463,8\n188#1:471,4\n190#1:475,5\n192#1:480,6\n192#1:487,9\n194#1:496,8\n194#1:504,2\n194#1:507,9\n194#1:516,9\n110#1:378\n110#1:380\n192#1:486\n118#1:430\n194#1:506\n*E\n"})
public class o implements Serializable, Comparable<o> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f335047e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final byte[] f335049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f335050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private transient String f335051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f335046d = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final o f335048f = new o(new byte[0]);

    @SourceDebugExtension({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n271#2:365\n275#2,3:366\n282#2,3:369\n289#2,2:372\n295#2:374\n297#2,7:376\n1#3:375\n1#3:383\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n*L\n234#1:365\n239#1:366,3\n251#1:369,3\n259#1:372,2\n262#1:374\n262#1:376,7\n262#1:375\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ o k(a aVar, String str, Charset charset, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                charset = Charsets.UTF_8;
            }
            return aVar.j(str, charset);
        }

        public static /* synthetic */ o p(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = i.f();
            }
            return aVar.o(bArr, i10, i11);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @oj.i(name = "-deprecated_decodeBase64")
        @Nullable
        public final o a(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return h(string);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @oj.i(name = "-deprecated_decodeHex")
        @NotNull
        public final o b(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return i(string);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @oj.i(name = "-deprecated_encodeString")
        @NotNull
        public final o c(@NotNull String string, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNullParameter(charset, "charset");
            return j(string, charset);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @oj.i(name = "-deprecated_encodeUtf8")
        @NotNull
        public final o d(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return l(string);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @oj.i(name = "-deprecated_of")
        @NotNull
        public final o e(@NotNull ByteBuffer buffer) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            return m(buffer);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @oj.i(name = "-deprecated_of")
        @NotNull
        public final o f(@NotNull byte[] array, int i10, int i11) {
            Intrinsics.checkNotNullParameter(array, "array");
            return o(array, i10, i11);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @oj.i(name = "-deprecated_read")
        @NotNull
        public final o g(@NotNull InputStream inputstream, int i10) {
            Intrinsics.checkNotNullParameter(inputstream, "inputstream");
            return q(inputstream, i10);
        }

        @oj.n
        @Nullable
        public final o h(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] bArrA = okio.a.a(str);
            if (bArrA != null) {
                return new o(bArrA);
            }
            return null;
        }

        @oj.n
        @NotNull
        public final o i(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((okio.internal.c.I(str.charAt(i11)) << 4) + okio.internal.c.I(str.charAt(i11 + 1)));
            }
            return new o(bArr);
        }

        @oj.n
        @oj.i(name = "encodeString")
        @NotNull
        public final o j(@NotNull String str, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new o(bytes);
        }

        @oj.n
        @NotNull
        public final o l(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            o oVar = new o(i1.a(str));
            oVar.r0(str);
            return oVar;
        }

        @oj.n
        @oj.i(name = "of")
        @NotNull
        public final o m(@NotNull ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new o(bArr);
        }

        @oj.n
        @NotNull
        public final o n(@NotNull byte... data) {
            Intrinsics.checkNotNullParameter(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            return new o(bArrCopyOf);
        }

        @oj.n
        @oj.i(name = "of")
        @NotNull
        public final o o(@NotNull byte[] bArr, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int iM = i.m(bArr, i11);
            i.e(bArr.length, i10, iM);
            return new o(ArraysKt.copyOfRange(bArr, i10, iM + i10));
        }

        @oj.n
        @oj.i(name = "read")
        @NotNull
        public final o q(@NotNull InputStream inputStream, int i10) throws IOException {
            Intrinsics.checkNotNullParameter(inputStream, "<this>");
            if (i10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + i10).toString());
            }
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = inputStream.read(bArr, i11, i10 - i11);
                if (i12 == -1) {
                    throw new EOFException();
                }
                i11 += i12;
            }
            return new o(bArr);
        }

        private a() {
        }
    }

    public o(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f335049a = data;
    }

    public static /* synthetic */ o C0(o oVar, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = i.f();
        }
        return oVar.B0(i10, i11);
    }

    public static /* synthetic */ int Y(o oVar, o oVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return oVar.V(oVar2, i10);
    }

    public static /* synthetic */ int Z(o oVar, byte[] bArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return oVar.X(bArr, i10);
    }

    public static /* synthetic */ int h0(o oVar, o oVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = i.f();
        }
        return oVar.e0(oVar2, i10);
    }

    public static /* synthetic */ int i0(o oVar, byte[] bArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = i.f();
        }
        return oVar.g0(bArr, i10);
    }

    @oj.n
    @oj.i(name = "of")
    @NotNull
    public static final o k0(@NotNull ByteBuffer byteBuffer) {
        return f335046d.m(byteBuffer);
    }

    @oj.n
    @NotNull
    public static final o l0(@NotNull byte... bArr) {
        return f335046d.n(bArr);
    }

    @oj.n
    @oj.i(name = "of")
    @NotNull
    public static final o m0(@NotNull byte[] bArr, int i10, int i11) {
        return f335046d.o(bArr, i10, i11);
    }

    @oj.n
    @oj.i(name = "read")
    @NotNull
    public static final o p0(@NotNull InputStream inputStream, int i10) throws IOException {
        return f335046d.q(inputStream, i10);
    }

    public static /* synthetic */ void r(o oVar, int i10, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        oVar.q(i10, bArr, i11, i12);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        o oVarQ = f335046d.q(objectInputStream, objectInputStream.readInt());
        Field declaredField = o.class.getDeclaredField(androidx.media3.exoplayer.upstream.h.f65998l);
        declaredField.setAccessible(true);
        declaredField.set(this, oVarQ.f335049a);
    }

    @oj.n
    @Nullable
    public static final o s(@NotNull String str) {
        return f335046d.h(str);
    }

    @oj.n
    @NotNull
    public static final o t(@NotNull String str) {
        return f335046d.i(str);
    }

    @oj.n
    @oj.i(name = "encodeString")
    @NotNull
    public static final o w(@NotNull String str, @NotNull Charset charset) {
        return f335046d.j(str, charset);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f335049a.length);
        objectOutputStream.write(this.f335049a);
    }

    @oj.n
    @NotNull
    public static final o x(@NotNull String str) {
        return f335046d.l(str);
    }

    @oj.j
    @NotNull
    public final o A0(int i10) {
        return C0(this, i10, 0, 2, null);
    }

    @oj.j
    @NotNull
    public o B0(int i10, int i11) {
        int iL = i.l(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iL <= H().length) {
            if (iL - i10 >= 0) {
                return (i10 == 0 && iL == H().length) ? this : new o(ArraysKt.copyOfRange(H(), i10, iL));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + H().length + ')').toString());
    }

    public final boolean D(@NotNull byte[] suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return o0(v0() - suffix.length, suffix, 0, suffix.length);
    }

    @NotNull
    public o D0() {
        for (int i10 = 0; i10 < H().length; i10++) {
            byte b10 = H()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrH = H();
                byte[] bArrCopyOf = Arrays.copyOf(bArrH, bArrH.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new o(bArrCopyOf);
            }
        }
        return this;
    }

    @oj.i(name = "getByte")
    public final byte E(int i10) {
        return c0(i10);
    }

    @NotNull
    public o E0() {
        for (int i10 = 0; i10 < H().length; i10++) {
            byte b10 = H()[i10];
            if (b10 >= 97 && b10 <= 122) {
                byte[] bArrH = H();
                byte[] bArrCopyOf = Arrays.copyOf(bArrH, bArrH.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + org.msgpack.core.h.a.K);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 97 && b11 <= 122) {
                        bArrCopyOf[i11] = (byte) (b11 + org.msgpack.core.h.a.K);
                    }
                }
                return new o(bArrCopyOf);
            }
        }
        return this;
    }

    @NotNull
    public byte[] F0() {
        byte[] bArrH = H();
        byte[] bArrCopyOf = Arrays.copyOf(bArrH, bArrH.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @NotNull
    public String G0() {
        String strM = M();
        if (strM != null) {
            return strM;
        }
        String strC = i1.c(a0());
        r0(strC);
        return strC;
    }

    @NotNull
    public final byte[] H() {
        return this.f335049a;
    }

    public void H0(@NotNull OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        out.write(this.f335049a);
    }

    public final int I() {
        return this.f335050b;
    }

    public void I0(@NotNull l buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        okio.internal.c.H(this, buffer, i10, i11);
    }

    public int L() {
        return H().length;
    }

    @Nullable
    public final String M() {
        return this.f335051c;
    }

    @NotNull
    public String N() {
        char[] cArr = new char[H().length * 2];
        int i10 = 0;
        for (byte b10 : H()) {
            int i11 = i10 + 1;
            cArr[i10] = okio.internal.c.J()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = okio.internal.c.J()[b10 & com.google.common.base.c.f116464q];
        }
        return StringsKt.w1(cArr);
    }

    @NotNull
    public o O(@NotNull String algorithm, @NotNull o key) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.F0(), algorithm));
            byte[] bArrDoFinal = mac.doFinal(this.f335049a);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new o(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @NotNull
    public o R(@NotNull o key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return O("HmacSHA1", key);
    }

    @NotNull
    public o S(@NotNull o key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return O("HmacSHA256", key);
    }

    @NotNull
    public o T(@NotNull o key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return O("HmacSHA512", key);
    }

    @oj.j
    public final int U(@NotNull o other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Y(this, other, 0, 2, null);
    }

    @oj.j
    public final int V(@NotNull o other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return X(other.a0(), i10);
    }

    @oj.j
    public final int W(@NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Z(this, other, 0, 2, null);
    }

    @oj.j
    public int X(@NotNull byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = H().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax <= length) {
            while (!i.d(H(), iMax, other, 0, other.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    @NotNull
    public byte[] a0() {
        return H();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to operator function", replaceWith = @kotlin.b1(expression = "this[index]", imports = {}))
    @oj.i(name = "-deprecated_getByte")
    public final byte b(int i10) {
        return E(i10);
    }

    public byte c0(int i10) {
        return H()[i10];
    }

    @oj.j
    public final int d0(@NotNull o other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return h0(this, other, 0, 2, null);
    }

    @oj.j
    public final int e0(@NotNull o other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return g0(other.a0(), i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (oVar.v0() == H().length && oVar.o0(0, H(), 0, H().length)) {
                return true;
            }
        }
        return false;
    }

    @oj.j
    public final int f0(@NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return i0(this, other, 0, 2, null);
    }

    @oj.j
    public int g0(@NotNull byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int iMin = Math.min(i.l(this, i10), H().length - other.length); -1 < iMin; iMin--) {
            if (i.d(H(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public int hashCode() {
        int I = I();
        if (I != 0) {
            return I;
        }
        int iHashCode = Arrays.hashCode(H());
        q0(iHashCode);
        return iHashCode;
    }

    @NotNull
    public final o j0() {
        return v("MD5");
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "size", imports = {}))
    @oj.i(name = "-deprecated_size")
    public final int k() {
        return v0();
    }

    @NotNull
    public ByteBuffer l() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.f335049a).asReadOnlyBuffer();
        Intrinsics.checkNotNullExpressionValue(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @NotNull
    public String n() {
        return okio.a.c(H(), null, 1, null);
    }

    public boolean n0(int i10, @NotNull o other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.o0(i11, H(), i10, i12);
    }

    @NotNull
    public String o() {
        return okio.a.b(H(), okio.a.f());
    }

    public boolean o0(int i10, @NotNull byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        return i10 >= 0 && i10 <= H().length - i12 && i11 >= 0 && i11 <= other.length - i12 && i.d(H(), i10, other, i11, i12);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull o other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iV0 = v0();
        int iV1 = other.v0();
        int iMin = Math.min(iV0, iV1);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iE = E(i10) & 255;
            int iE2 = other.E(i10) & 255;
            if (iE != iE2) {
                return iE < iE2 ? -1 : 1;
            }
        }
        if (iV0 == iV1) {
            return 0;
        }
        return iV0 < iV1 ? -1 : 1;
    }

    public void q(int i10, @NotNull byte[] target, int i11, int i12) {
        Intrinsics.checkNotNullParameter(target, "target");
        ArraysKt.copyInto(H(), target, i11, i10, i12 + i10);
    }

    public final void q0(int i10) {
        this.f335050b = i10;
    }

    public final void r0(@Nullable String str) {
        this.f335051c = str;
    }

    @NotNull
    public final o s0() {
        return v(org.apache.commons.codec.digest.g.f335249c);
    }

    @NotNull
    public final o t0() {
        return v(org.apache.commons.codec.digest.g.f335251e);
    }

    @NotNull
    public String toString() {
        if (H().length == 0) {
            return "[size=0]";
        }
        int iC = okio.internal.c.c(H(), 64);
        if (iC != -1) {
            String strG0 = G0();
            String strSubstring = strG0.substring(0, iC);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strK2 = StringsKt.k2(StringsKt.k2(StringsKt.k2(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), org.apache.commons.lang3.z.f337565d, "\\r", false, 4, null);
            if (iC >= strG0.length()) {
                return "[text=" + strK2 + AbstractJsonLexerKt.END_LIST;
            }
            return "[size=" + H().length + " text=" + strK2 + "…]";
        }
        if (H().length <= 64) {
            return "[hex=" + N() + AbstractJsonLexerKt.END_LIST;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(H().length);
        sb2.append(" hex=");
        o oVar = this;
        int iL = i.l(oVar, 64);
        if (iL > oVar.H().length) {
            throw new IllegalArgumentException(("endIndex > length(" + oVar.H().length + ')').toString());
        }
        if (iL < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (iL != oVar.H().length) {
            oVar = new o(ArraysKt.copyOfRange(oVar.H(), 0, iL));
        }
        sb2.append(oVar.N());
        sb2.append("…]");
        return sb2.toString();
    }

    @NotNull
    public final o u0() {
        return v(org.apache.commons.codec.digest.g.f335253g);
    }

    @NotNull
    public o v(@NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f335049a, 0, v0());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        return new o(bArrDigest);
    }

    @oj.i(name = "size")
    public final int v0() {
        return L();
    }

    public final boolean w0(@NotNull o prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return n0(0, prefix, 0, prefix.v0());
    }

    public final boolean x0(@NotNull byte[] prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return o0(0, prefix, 0, prefix.length);
    }

    @NotNull
    public String y0(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(this.f335049a, charset);
    }

    public final boolean z(@NotNull o suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return n0(v0() - suffix.v0(), suffix, 0, suffix.v0());
    }

    @oj.j
    @NotNull
    public final o z0() {
        return C0(this, 0, 0, 3, null);
    }
}
