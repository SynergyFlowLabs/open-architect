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
@SourceDebugExtension({"SMAP\nDoubleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleList\n*L\n1#1,983:1\n367#1:984\n370#1:985\n239#1,6:986\n267#1,6:992\n239#1,6:998\n76#1:1004\n239#1,6:1005\n367#1:1011\n239#1,6:1012\n239#1,6:1018\n253#1,6:1024\n267#1,6:1030\n281#1,6:1036\n253#1,6:1042\n253#1,6:1048\n281#1,6:1054\n367#1:1060\n72#1:1061\n267#1,6:1062\n281#1,6:1068\n65#1:1074\n253#1,6:1075\n253#1,6:1081\n239#1,6:1087\n76#1:1093\n488#1,10:1094\n253#1,4:1104\n498#1,9:1108\n258#1:1117\n507#1,2:1118\n488#1,10:1120\n253#1,4:1130\n498#1,9:1134\n258#1:1143\n507#1,2:1144\n488#1,10:1146\n253#1,4:1156\n498#1,9:1160\n258#1:1169\n507#1,2:1170\n488#1,10:1172\n253#1,4:1182\n498#1,9:1186\n258#1:1195\n507#1,2:1196\n488#1,10:1198\n253#1,4:1208\n498#1,9:1212\n258#1:1221\n507#1,2:1222\n*S KotlinDebug\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleList\n*L\n80#1:984\n85#1:985\n91#1:986,6\n105#1:992,6\n115#1:998,6\n128#1:1004\n145#1:1005,6\n154#1:1011\n168#1:1012,6\n184#1:1018,6\n198#1:1024,6\n214#1:1030,6\n228#1:1036,6\n330#1:1042,6\n344#1:1048,6\n358#1:1054,6\n377#1:1060\n380#1:1061\n391#1:1062,6\n404#1:1068,6\n426#1:1074\n466#1:1075,6\n497#1:1081,6\n513#1:1087,6\n527#1:1093\n-1#1:1094,10\n-1#1:1104,4\n-1#1:1108,9\n-1#1:1117\n-1#1:1118,2\n-1#1:1120,10\n-1#1:1130,4\n-1#1:1134,9\n-1#1:1143\n-1#1:1144,2\n-1#1:1146,10\n-1#1:1156,4\n-1#1:1160,9\n-1#1:1169\n-1#1:1170,2\n-1#1:1172,10\n-1#1:1182,4\n-1#1:1186,9\n-1#1:1195\n-1#1:1196,2\n-1#1:1198,10\n-1#1:1208,4\n-1#1:1212,9\n-1#1:1221\n-1#1:1222,2\n*E\n"})
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public double[] f12276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public int f12277b;

    public /* synthetic */ i(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    @kotlin.a1
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ String T(i iVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return iVar.M(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public static /* synthetic */ String U(i iVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 transform, int i11, Object obj) {
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
        double[] dArr = iVar.f12276a;
        int i12 = iVar.f12277b;
        for (int i13 = 0; i13 < i12; i13++) {
            double d10 = dArr[i13];
            if (i13 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i13 != 0) {
                sb2.append(separator);
            }
            sb2.append((CharSequence) transform.invoke(Double.valueOf(d10)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public static /* synthetic */ int f(i iVar, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iVar.f12277b;
        }
        return iVar.e(i10, i11, i12);
    }

    @kotlin.a1
    public static /* synthetic */ void x() {
    }

    @androidx.annotation.g0(from = 0)
    public final int A() {
        return this.f12277b;
    }

    public final int C(double d10) {
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (d10 == dArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public final int D(@NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Double.valueOf(dArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int E(@NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        double[] dArr = this.f12276a;
        for (int i10 = this.f12277b - 1; -1 < i10; i10--) {
            if (predicate.invoke(Double.valueOf(dArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean F() {
        return this.f12277b == 0;
    }

    public final boolean G() {
        return this.f12277b != 0;
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
        int i10 = 5 | 0;
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
        double[] dArr = this.f12276a;
        int i11 = this.f12277b;
        for (int i12 = 0; i12 < i11; i12++) {
            double d10 = dArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(d10);
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String N(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @NotNull Function1<? super Double, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.f12276a;
        int i11 = this.f12277b;
        for (int i12 = 0; i12 < i11; i12++) {
            double d10 = dArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Double.valueOf(d10)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String O(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull Function1<? super Double, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.f12276a;
        int i11 = this.f12277b;
        for (int i12 = 0; i12 < i11; i12++) {
            double d10 = dArr[i12];
            if (i12 == i10) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Double.valueOf(d10)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String P(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function1<? super Double, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        for (int i11 = 0; i11 < i10; i11++) {
            double d10 = dArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Double.valueOf(d10)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String Q(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull Function1<? super Double, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        for (int i11 = 0; i11 < i10; i11++) {
            double d10 = dArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Double.valueOf(d10)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String R(@NotNull CharSequence separator, @NotNull Function1<? super Double, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        for (int i11 = 0; i11 < i10; i11++) {
            double d10 = dArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Double.valueOf(d10)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String S(@NotNull Function1<? super Double, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        for (int i11 = 0; i11 < i10; i11++) {
            double d10 = dArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(transform.invoke(Double.valueOf(d10)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final double V() {
        if (this.f12277b == 0) {
            t.f.f("DoubleList is empty.");
        }
        return this.f12276a[this.f12277b - 1];
    }

    public final double W(@NotNull Function1<? super Double, Boolean> predicate) {
        double d10;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        do {
            i10--;
            if (-1 >= i10) {
                throw new NoSuchElementException("DoubleList contains no element matching the predicate.");
            }
            d10 = dArr[i10];
        } while (!predicate.invoke(Double.valueOf(d10)).booleanValue());
        return d10;
    }

    public final int X(double d10) {
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (dArr[i10] != d10);
        return i10;
    }

    public final boolean Y() {
        return this.f12277b == 0;
    }

    public final boolean Z(@NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        double[] dArr = this.f12276a;
        for (int i10 = this.f12277b - 1; -1 < i10; i10--) {
            if (predicate.invoke(Double.valueOf(dArr[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return this.f12277b != 0;
    }

    public final boolean b(@NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Double.valueOf(dArr[i11])).booleanValue()) {
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
        if (i11 < 0 || i11 >= i12 || i12 > this.f12277b) {
            t.f.e("");
        }
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            double d10 = this.f12276a[i14];
            double d11 = i10;
            if (d10 < d11) {
                i11 = i14 + 1;
            } else {
                if (d10 <= d11) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            int i10 = iVar.f12277b;
            int i11 = this.f12277b;
            if (i10 == i11) {
                double[] dArr = this.f12276a;
                double[] dArr2 = iVar.f12276a;
                IntRange intRangeW1 = kotlin.ranges.r.W1(0, i11);
                int iL = intRangeW1.l();
                int iM = intRangeW1.m();
                if (iL <= iM) {
                    while (dArr[iL] == dArr2[iL]) {
                        if (iL != iM) {
                            iL++;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean g(double d10) {
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (dArr[i11] == d10) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(@NotNull i elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        IntRange intRangeW1 = kotlin.ranges.r.W1(0, elements.f12277b);
        int iL = intRangeW1.l();
        int iM = intRangeW1.m();
        if (iL <= iM) {
            while (g(elements.w(iL))) {
                if (iL != iM) {
                    iL++;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Double.hashCode(dArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final int i() {
        return this.f12277b;
    }

    public final int j(@NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (predicate.invoke(Double.valueOf(dArr[i12])).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public final double k(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= this.f12277b) {
            t.f.e("Index must be between 0 and size");
        }
        return this.f12276a[i10];
    }

    public final double l(@androidx.annotation.g0(from = 0) int i10, @NotNull Function1<? super Integer, Double> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= this.f12277b) ? defaultValue.invoke(Integer.valueOf(i10)).doubleValue() : this.f12276a[i10];
    }

    public final double m() {
        if (this.f12277b == 0) {
            t.f.f("DoubleList is empty.");
        }
        return this.f12276a[0];
    }

    public final double n(@NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        for (int i11 = 0; i11 < i10; i11++) {
            double d10 = dArr[i11];
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return d10;
            }
        }
        throw new NoSuchElementException("DoubleList contains no element matching the predicate.");
    }

    public final <R> R o(R r10, @NotNull Function2<? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = operation.invoke(r10, Double.valueOf(dArr[i11]));
        }
        return r10;
    }

    public final <R> R p(R r10, @NotNull pj.n<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        for (int i11 = 0; i11 < i10; i11++) {
            R r11 = r10;
            r10 = operation.invoke(Integer.valueOf(i11), r11, Double.valueOf(dArr[i11]));
        }
        return r10;
    }

    public final <R> R q(R r10, @NotNull Function2<? super Double, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Double.valueOf(dArr[i10]), r10);
        }
    }

    public final <R> R r(R r10, @NotNull pj.n<? super Integer, ? super Double, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Integer.valueOf(i10), Double.valueOf(dArr[i10]), r10);
        }
    }

    public final void s(@NotNull Function1<? super Double, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Double.valueOf(dArr[i11]));
        }
    }

    public final void t(@NotNull Function2<? super Integer, ? super Double, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i11]));
        }
    }

    @NotNull
    public String toString() {
        return T(this, null, "[", "]", 0, null, 25, null);
    }

    public final void u(@NotNull Function1<? super Double, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Double.valueOf(dArr[i10]));
            }
        }
    }

    public final void v(@NotNull Function2<? super Integer, ? super Double, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        double[] dArr = this.f12276a;
        int i10 = this.f12277b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), Double.valueOf(dArr[i10]));
            }
        }
    }

    public final double w(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= this.f12277b) {
            t.f.e("Index must be between 0 and size");
        }
        return this.f12276a[i10];
    }

    @NotNull
    public final IntRange y() {
        return kotlin.ranges.r.W1(0, this.f12277b);
    }

    @androidx.annotation.g0(from = -1)
    public final int z() {
        return this.f12277b - 1;
    }

    private i(int i10) {
        this.f12276a = i10 == 0 ? k.a() : new double[i10];
    }
}
