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
@SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,968:1\n363#1:969\n366#1:970\n237#1,6:971\n265#1,6:977\n237#1,6:983\n74#1:989\n237#1,6:990\n363#1:996\n237#1,6:997\n237#1,6:1003\n251#1,6:1009\n265#1,6:1015\n279#1,6:1021\n251#1,6:1027\n251#1,6:1033\n279#1,6:1039\n363#1:1045\n70#1:1046\n265#1,6:1047\n279#1,6:1053\n65#1:1059\n251#1,6:1060\n251#1,6:1066\n237#1,6:1072\n74#1:1078\n484#1,10:1079\n251#1,4:1089\n494#1,9:1093\n256#1:1102\n503#1,2:1103\n484#1,10:1105\n251#1,4:1115\n494#1,9:1119\n256#1:1128\n503#1,2:1129\n484#1,10:1131\n251#1,4:1141\n494#1,9:1145\n256#1:1154\n503#1,2:1155\n484#1,10:1157\n251#1,4:1167\n494#1,9:1171\n256#1:1180\n503#1,2:1181\n484#1,10:1183\n251#1,4:1193\n494#1,9:1197\n256#1:1206\n503#1,2:1207\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n78#1:969\n83#1:970\n89#1:971,6\n103#1:977,6\n113#1:983,6\n126#1:989\n143#1:990,6\n152#1:996\n166#1:997,6\n182#1:1003,6\n196#1:1009,6\n212#1:1015,6\n226#1:1021,6\n328#1:1027,6\n341#1:1033,6\n354#1:1039,6\n373#1:1045\n376#1:1046\n387#1:1047,6\n400#1:1053,6\n422#1:1059\n462#1:1060,6\n493#1:1066,6\n509#1:1072,6\n522#1:1078\n-1#1:1079,10\n-1#1:1089,4\n-1#1:1093,9\n-1#1:1102\n-1#1:1103,2\n-1#1:1105,10\n-1#1:1115,4\n-1#1:1119,9\n-1#1:1128\n-1#1:1129,2\n-1#1:1131,10\n-1#1:1141,4\n-1#1:1145,9\n-1#1:1154\n-1#1:1155,2\n-1#1:1157,10\n-1#1:1167,4\n-1#1:1171,9\n-1#1:1180\n-1#1:1181,2\n-1#1:1183,10\n-1#1:1193,4\n-1#1:1197,9\n-1#1:1206\n-1#1:1207,2\n*E\n"})
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public int[] f12215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public int f12216b;

    public /* synthetic */ f0(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    @kotlin.a1
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ String T(f0 f0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return f0Var.M(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public static /* synthetic */ String U(f0 f0Var, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 transform, int i11, Object obj) {
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
        int[] iArr = f0Var.f12215a;
        int i12 = f0Var.f12216b;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = iArr[i13];
            if (i13 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i13 != 0) {
                sb2.append(separator);
            }
            sb2.append((CharSequence) transform.invoke(Integer.valueOf(i14)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public static /* synthetic */ int f(f0 f0Var, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = f0Var.f12216b;
        }
        return f0Var.e(i10, i11, i12);
    }

    @kotlin.a1
    public static /* synthetic */ void x() {
    }

    @androidx.annotation.g0(from = 0)
    public final int A() {
        return this.f12216b;
    }

    public final int C(int i10) {
        int[] iArr = this.f12215a;
        int i11 = this.f12216b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i10 == iArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public final int D(@NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Integer.valueOf(iArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int E(@NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!predicate.invoke(Integer.valueOf(iArr[i10])).booleanValue());
        return i10;
    }

    public final boolean F() {
        return this.f12216b == 0;
    }

    public final boolean G() {
        return this.f12216b != 0;
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
        int[] iArr = this.f12215a;
        int i11 = this.f12216b;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(i13);
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String N(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @NotNull Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f12215a;
        int i11 = this.f12216b;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Integer.valueOf(i13)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String O(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f12215a;
        int i11 = this.f12216b;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i12 == i10) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Integer.valueOf(i13)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String P(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Integer.valueOf(i12)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String Q(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Integer.valueOf(i12)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String R(@NotNull CharSequence separator, @NotNull Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Integer.valueOf(i12)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String S(@NotNull Function1<? super Integer, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(transform.invoke(Integer.valueOf(i12)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final int V() {
        if (this.f12216b == 0) {
            t.f.f("IntList is empty.");
        }
        return this.f12215a[this.f12216b - 1];
    }

    public final int W(@NotNull Function1<? super Integer, Boolean> predicate) {
        int i10;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.f12215a;
        int i11 = this.f12216b;
        do {
            i11--;
            if (-1 >= i11) {
                throw new NoSuchElementException("IntList contains no element matching the predicate.");
            }
            i10 = iArr[i11];
        } while (!predicate.invoke(Integer.valueOf(i10)).booleanValue());
        return i10;
    }

    public final int X(int i10) {
        int[] iArr = this.f12215a;
        int i11 = this.f12216b;
        do {
            i11--;
            if (-1 >= i11) {
                return -1;
            }
        } while (iArr[i11] != i10);
        return i11;
    }

    public final boolean Y() {
        return this.f12216b == 0;
    }

    public final boolean Z(@NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.f12215a;
        for (int i10 = this.f12216b - 1; -1 < i10; i10--) {
            if (predicate.invoke(Integer.valueOf(iArr[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return this.f12216b != 0;
    }

    public final boolean b(@NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Integer.valueOf(iArr[i11])).booleanValue()) {
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
        if (i11 < 0 || i11 >= i12 || i12 > this.f12216b) {
            t.f.e("");
        }
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = this.f12215a[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            int i10 = f0Var.f12216b;
            int i11 = this.f12216b;
            if (i10 == i11) {
                int[] iArr = this.f12215a;
                int[] iArr2 = f0Var.f12215a;
                IntRange intRangeW1 = kotlin.ranges.r.W1(0, i11);
                int iL = intRangeW1.l();
                int iM = intRangeW1.m();
                if (iL <= iM) {
                    while (iArr[iL] == iArr2[iL]) {
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

    public final boolean g(int i10) {
        int[] iArr = this.f12215a;
        int i11 = this.f12216b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] == i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(@NotNull f0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        IntRange intRangeW1 = kotlin.ranges.r.W1(0, elements.f12216b);
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
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Integer.hashCode(iArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final int i() {
        return this.f12216b;
    }

    public final int j(@NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (predicate.invoke(Integer.valueOf(iArr[i12])).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public final int k(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= this.f12216b) {
            t.f.e("Index must be between 0 and size");
        }
        return this.f12215a[i10];
    }

    public final int l(@androidx.annotation.g0(from = 0) int i10, @NotNull Function1<? super Integer, Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= this.f12216b) ? defaultValue.invoke(Integer.valueOf(i10)).intValue() : this.f12215a[i10];
    }

    public final int m() {
        if (this.f12216b == 0) {
            t.f.f("IntList is empty.");
        }
        return this.f12215a[0];
    }

    public final int n(@NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (predicate.invoke(Integer.valueOf(i12)).booleanValue()) {
                return i12;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final <R> R o(R r10, @NotNull Function2<? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = operation.invoke(r10, Integer.valueOf(iArr[i11]));
        }
        return r10;
    }

    public final <R> R p(R r10, @NotNull pj.n<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        for (int i11 = 0; i11 < i10; i11++) {
            R r11 = r10;
            r10 = operation.invoke(Integer.valueOf(i11), r11, Integer.valueOf(iArr[i11]));
        }
        return r10;
    }

    public final <R> R q(R r10, @NotNull Function2<? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Integer.valueOf(iArr[i10]), r10);
        }
    }

    public final <R> R r(R r10, @NotNull pj.n<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]), r10);
        }
    }

    public final void s(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(iArr[i11]));
        }
    }

    public final void t(@NotNull Function2<? super Integer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.f12215a;
        int i10 = this.f12216b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i11]));
        }
    }

    @NotNull
    public String toString() {
        return T(this, null, "[", "]", 0, null, 25, null);
    }

    public final void u(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.f12215a;
        for (int i10 = this.f12216b - 1; -1 < i10; i10--) {
            block.invoke(Integer.valueOf(iArr[i10]));
        }
    }

    public final void v(@NotNull Function2<? super Integer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.f12215a;
        for (int i10 = this.f12216b - 1; -1 < i10; i10--) {
            block.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]));
        }
    }

    public final int w(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= this.f12216b) {
            t.f.e("Index must be between 0 and size");
        }
        return this.f12215a[i10];
    }

    @NotNull
    public final IntRange y() {
        return kotlin.ranges.r.W1(0, this.f12216b);
    }

    @androidx.annotation.g0(from = -1)
    public final int z() {
        return this.f12216b - 1;
    }

    private f0(int i10) {
        this.f12215a = i10 == 0 ? m0.d() : new int[i10];
    }
}
