package kotlinx.io.bytestring;

import java.util.Arrays;
import kotlin.a1;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nkotlinx/io/bytestring/ByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,550:1\n1#2:551\n*E\n"})
public final class c implements Comparable<c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f315746c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final c f315747d = new c(new byte[0], null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final char[] f315748e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final byte[] f315749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b
    private int f315750b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a() {
            return c.f315747d;
        }

        @NotNull
        public final c b(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new c(byteArray, defaultConstructorMarker, defaultConstructorMarker);
        }

        private a() {
        }
    }

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        f315748e = charArray;
    }

    public /* synthetic */ c(byte[] bArr, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, obj);
    }

    public static /* synthetic */ void o(c cVar, byte[] bArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = cVar.r();
        }
        cVar.n(bArr, i10, i11, i12);
    }

    public static /* synthetic */ c t(c cVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = cVar.r();
        }
        return cVar.s(i10, i11);
    }

    public static /* synthetic */ byte[] w(c cVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cVar.r();
        }
        return cVar.v(i10, i11);
    }

    public boolean equals(@Nullable Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        byte[] bArr = cVar.f315749a;
        int length = bArr.length;
        byte[] bArr2 = this.f315749a;
        if (length != bArr2.length) {
            return false;
        }
        int i11 = cVar.f315750b;
        if (i11 == 0 || (i10 = this.f315750b) == 0 || i11 == i10) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f315750b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f315749a);
        this.f315750b = iHashCode;
        return iHashCode;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull c other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other == this) {
            return 0;
        }
        byte[] bArr = this.f315749a;
        byte[] bArr2 = other.f315749a;
        int iMin = Math.min(r(), other.r());
        for (int i10 = 0; i10 < iMin; i10++) {
            int iCompare = Intrinsics.compare(q1.n(bArr[i10]) & 255, q1.n(bArr2[i10]) & 255);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Intrinsics.compare(r(), other.r());
    }

    public final void n(@NotNull byte[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (i11 <= i12) {
            ArraysKt.copyInto(this.f315749a, destination, i10, i11, i12);
            return;
        }
        throw new IllegalArgumentException(("startIndex (" + i11 + ") > endIndex (" + i12 + ')').toString());
    }

    public final byte p(int i10) {
        if (i10 >= 0 && i10 < r()) {
            return this.f315749a[i10];
        }
        throw new IndexOutOfBoundsException("index (" + i10 + ") is out of byte string bounds: [0.." + r() + ')');
    }

    @a1
    @NotNull
    public final byte[] q() {
        return this.f315749a;
    }

    public final int r() {
        return this.f315749a.length;
    }

    @NotNull
    public final c s(int i10, int i11) {
        return i10 == i11 ? f315747d : new c(this.f315749a, i10, i11);
    }

    @NotNull
    public String toString() {
        if (g.p(this)) {
            return "ByteString(size=0)";
        }
        String strValueOf = String.valueOf(r());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22 + (r() * 2));
        sb2.append("ByteString(size=");
        sb2.append(strValueOf);
        sb2.append(" hex=");
        byte[] bArr = this.f315749a;
        int iR = r();
        for (int i10 = 0; i10 < iR; i10++) {
            byte b10 = bArr[i10];
            char[] cArr = f315748e;
            sb2.append(cArr[(b10 >>> 4) & 15]);
            sb2.append(cArr[b10 & com.google.common.base.c.f116464q]);
        }
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final byte[] v(int i10, int i11) {
        if (i10 <= i11) {
            return ArraysKt.copyOfRange(this.f315749a, i10, i11);
        }
        throw new IllegalArgumentException(("startIndex (" + i10 + ") > endIndex (" + i11 + ')').toString());
    }

    private c(byte[] bArr, Object obj) {
        this.f315749a = bArr;
    }

    public /* synthetic */ c(byte[] bArr, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? bArr.length : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull byte[] data, int i10, int i11) {
        this(ArraysKt.copyOfRange(data, i10, i11), null);
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
