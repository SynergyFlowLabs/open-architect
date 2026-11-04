package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongList\n*L\n1#1,972:1\n364#1:973\n367#1:974\n237#1,6:975\n265#1,6:981\n237#1,6:987\n74#1:993\n237#1,6:994\n364#1:1000\n237#1,6:1001\n237#1,6:1007\n251#1,6:1013\n265#1,6:1019\n279#1,6:1025\n251#1,6:1031\n251#1,6:1037\n279#1,6:1043\n364#1:1049\n70#1:1050\n265#1,6:1051\n279#1,6:1057\n65#1:1063\n251#1,6:1064\n251#1,6:1070\n237#1,6:1076\n74#1:1082\n485#1,10:1083\n251#1,4:1093\n495#1,9:1097\n256#1:1106\n504#1,2:1107\n485#1,10:1109\n251#1,4:1119\n495#1,9:1123\n256#1:1132\n504#1,2:1133\n485#1,10:1135\n251#1,4:1145\n495#1,9:1149\n256#1:1158\n504#1,2:1159\n485#1,10:1161\n251#1,4:1171\n495#1,9:1175\n256#1:1184\n504#1,2:1185\n485#1,10:1187\n251#1,4:1197\n495#1,9:1201\n256#1:1210\n504#1,2:1211\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongList\n*L\n78#1:973\n83#1:974\n89#1:975,6\n103#1:981,6\n113#1:987,6\n126#1:993\n143#1:994,6\n152#1:1000\n166#1:1001,6\n182#1:1007,6\n196#1:1013,6\n212#1:1019,6\n226#1:1025,6\n328#1:1031,6\n342#1:1037,6\n355#1:1043,6\n374#1:1049\n377#1:1050\n388#1:1051,6\n401#1:1057,6\n423#1:1063\n463#1:1064,6\n494#1:1070,6\n510#1:1076,6\n523#1:1082\n-1#1:1083,10\n-1#1:1093,4\n-1#1:1097,9\n-1#1:1106\n-1#1:1107,2\n-1#1:1109,10\n-1#1:1119,4\n-1#1:1123,9\n-1#1:1132\n-1#1:1133,2\n-1#1:1135,10\n-1#1:1145,4\n-1#1:1149,9\n-1#1:1158\n-1#1:1159,2\n-1#1:1161,10\n-1#1:1171,4\n-1#1:1175,9\n-1#1:1184\n-1#1:1185,2\n-1#1:1187,10\n-1#1:1197,4\n-1#1:1201,9\n-1#1:1210\n-1#1:1211,2\n*E\n"})
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public long[] f12446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public int f12447b;

    public /* synthetic */ s0(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    @kotlin.a1
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ String T(s0 s0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return s0Var.M(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public static /* synthetic */ String U(s0 s0Var, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 transform, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            separator = ", ";
        }
        if ((i11 & 2) != 0) {
            prefix = "";
        }
        if ((i11 & 4) != 0) {
            postfix = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            truncated = "...";
        }
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = s0Var.f12446a;
        int i12 = s0Var.f12447b;
        for (int i13 = 0; i13 < i12; i13++) {
            long j10 = jArr[i13];
            if (i13 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i13 != 0) {
                sb2.append(separator);
            }
            sb2.append((CharSequence) transform.invoke(Long.valueOf(j10)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public static /* synthetic */ int f(s0 s0Var, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = s0Var.f12447b;
        }
        return s0Var.e(i10, i11, i12);
    }

    @kotlin.a1
    public static /* synthetic */ void x() {
    }

    @androidx.annotation.g0(from = 0)
    public final int A() {
        return this.f12447b;
    }

    public final int C(long j10) {
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (j10 == jArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public final int D(@NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Long.valueOf(jArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int E(@NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!predicate.invoke(Long.valueOf(jArr[i10])).booleanValue());
        return i10;
    }

    public final boolean F() {
        return this.f12447b == 0;
    }

    public final boolean G() {
        return this.f12447b != 0;
    }

    @oj.j
    @NotNull
    public final String H() {
        return T(this, null, null, null, 0, null, 31, null);
    }

    @oj.j
    @NotNull
    public final String I(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return T(this, separator, null, null, 0, null, 30, null);
    }

    @oj.j
    @NotNull
    public final String J(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return T(this, separator, prefix, null, 0, null, 28, null);
    }

    @oj.j
    @NotNull
    public final String K(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return T(this, separator, prefix, postfix, 0, null, 24, null);
    }

    @oj.j
    @NotNull
    public final String L(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return T(this, separator, prefix, postfix, i10, null, 16, null);
    }

    @oj.j
    @NotNull
    public final String M(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f12446a;
        int i11 = this.f12447b;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = jArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(j10);
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String N(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @NotNull Function1<? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f12446a;
        int i11 = this.f12447b;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = jArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Long.valueOf(j10)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String O(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull Function1<? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f12446a;
        int i11 = this.f12447b;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = jArr[i12];
            if (i12 == i10) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Long.valueOf(j10)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String P(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function1<? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        for (int i11 = 0; i11 < i10; i11++) {
            long j10 = jArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Long.valueOf(j10)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String Q(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull Function1<? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        for (int i11 = 0; i11 < i10; i11++) {
            long j10 = jArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Long.valueOf(j10)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String R(@NotNull CharSequence separator, @NotNull Function1<? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        for (int i11 = 0; i11 < i10; i11++) {
            long j10 = jArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Long.valueOf(j10)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String S(@NotNull Function1<? super Long, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        for (int i11 = 0; i11 < i10; i11++) {
            long j10 = jArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(transform.invoke(Long.valueOf(j10)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final long V() {
        if (this.f12447b == 0) {
            t.f.f("LongList is empty.");
        }
        return this.f12446a[this.f12447b - 1];
    }

    public final long W(@NotNull Function1<? super Long, Boolean> predicate) {
        long j10;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        do {
            i10--;
            if (-1 >= i10) {
                throw new NoSuchElementException("LongList contains no element matching the predicate.");
            }
            j10 = jArr[i10];
        } while (!predicate.invoke(Long.valueOf(j10)).booleanValue());
        return j10;
    }

    public final int X(long j10) {
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (jArr[i10] != j10);
        return i10;
    }

    public final boolean Y() {
        return this.f12447b == 0;
    }

    public final boolean Z(@NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12446a;
        for (int i10 = this.f12447b - 1; -1 < i10; i10--) {
            if (predicate.invoke(Long.valueOf(jArr[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return this.f12447b != 0;
    }

    public final boolean b(@NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Long.valueOf(jArr[i11])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @oj.j
    public final int c(int i10) {
        return f(this, i10, 0, 0, 6, null);
    }

    @oj.j
    public final int d(int i10, int i11) {
        return f(this, i10, i11, 0, 4, null);
    }

    @oj.j
    public final int e(int i10, int i11, int i12) {
        if (i11 < 0 || i11 >= i12 || i12 > this.f12447b) {
            t.f.e("");
        }
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            long j10 = this.f12446a[i14];
            long j11 = i10;
            if (j10 < j11) {
                i11 = i14 + 1;
            } else {
                if (j10 <= j11) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            int i10 = s0Var.f12447b;
            int i11 = this.f12447b;
            if (i10 == i11) {
                long[] jArr = this.f12446a;
                long[] jArr2 = s0Var.f12446a;
                IntRange intRangeW1 = kotlin.ranges.r.W1(0, i11);
                int iL = intRangeW1.l();
                int iM = intRangeW1.m();
                if (iL > iM) {
                    return true;
                }
                while (jArr[iL] == jArr2[iL]) {
                    if (iL == iM) {
                        return true;
                    }
                    iL++;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean g(long j10) {
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (jArr[i11] == j10) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(@NotNull s0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = 3 | 0;
        IntRange intRangeW1 = kotlin.ranges.r.W1(0, elements.f12447b);
        int iL = intRangeW1.l();
        int iM = intRangeW1.m();
        if (iL > iM) {
            return true;
        }
        while (g(elements.w(iL))) {
            if (iL == iM) {
                return true;
            }
            iL++;
        }
        return false;
    }

    public int hashCode() {
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Long.hashCode(jArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final int i() {
        return this.f12447b;
    }

    public final int j(@NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (predicate.invoke(Long.valueOf(jArr[i12])).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public final long k(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= this.f12447b) {
            t.f.e("Index must be between 0 and size");
        }
        return this.f12446a[i10];
    }

    public final long l(@androidx.annotation.g0(from = 0) int i10, @NotNull Function1<? super Integer, Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= this.f12447b) ? defaultValue.invoke(Integer.valueOf(i10)).longValue() : this.f12446a[i10];
    }

    public final long m() {
        if (this.f12447b == 0) {
            t.f.f("LongList is empty.");
        }
        return this.f12446a[0];
    }

    public final long n(@NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        for (int i11 = 0; i11 < i10; i11++) {
            long j10 = jArr[i11];
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return j10;
            }
        }
        throw new NoSuchElementException("LongList contains no element matching the predicate.");
    }

    public final <R> R o(R r10, @NotNull Function2<? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = operation.invoke(r10, Long.valueOf(jArr[i11]));
        }
        return r10;
    }

    public final <R> R p(R r10, @NotNull pj.n<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        for (int i11 = 0; i11 < i10; i11++) {
            R r11 = r10;
            r10 = operation.invoke(Integer.valueOf(i11), r11, Long.valueOf(jArr[i11]));
        }
        return r10;
    }

    public final <R> R q(R r10, @NotNull Function2<? super Long, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Long.valueOf(jArr[i10]), r10);
        }
    }

    public final <R> R r(R r10, @NotNull pj.n<? super Integer, ? super Long, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Integer.valueOf(i10), Long.valueOf(jArr[i10]), r10);
        }
    }

    public final void s(@NotNull Function1<? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Long.valueOf(jArr[i11]));
        }
    }

    public final void t(@NotNull Function2<? super Integer, ? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i11]));
        }
    }

    @NotNull
    public String toString() {
        return T(this, null, "[", "]", 0, null, 25, null);
    }

    public final void u(@NotNull Function1<? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Long.valueOf(jArr[i10]));
            }
        }
    }

    public final void v(@NotNull Function2<? super Integer, ? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.f12446a;
        int i10 = this.f12447b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), Long.valueOf(jArr[i10]));
            }
        }
    }

    public final long w(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= this.f12447b) {
            t.f.e("Index must be between 0 and size");
        }
        return this.f12446a[i10];
    }

    @NotNull
    public final IntRange y() {
        return kotlin.ranges.r.W1(0, this.f12447b);
    }

    @androidx.annotation.g0(from = -1)
    public final int z() {
        return this.f12447b - 1;
    }

    private s0(int i10) {
        this.f12446a = i10 == 0 ? a1.d() : new long[i10];
    }
}
