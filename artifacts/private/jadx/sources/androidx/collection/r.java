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
@SourceDebugExtension({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n1#1,976:1\n365#1:977\n368#1:978\n237#1,6:979\n265#1,6:985\n237#1,6:991\n74#1:997\n237#1,6:998\n365#1:1004\n237#1,6:1005\n237#1,6:1011\n251#1,6:1017\n265#1,6:1023\n279#1,6:1029\n251#1,6:1035\n251#1,6:1041\n279#1,6:1047\n365#1:1053\n70#1:1054\n265#1,6:1055\n279#1,6:1061\n65#1:1067\n251#1,6:1068\n251#1,6:1074\n237#1,6:1080\n74#1:1086\n486#1,10:1087\n251#1,4:1097\n496#1,9:1101\n256#1:1110\n505#1,2:1111\n486#1,10:1113\n251#1,4:1123\n496#1,9:1127\n256#1:1136\n505#1,2:1137\n486#1,10:1139\n251#1,4:1149\n496#1,9:1153\n256#1:1162\n505#1,2:1163\n486#1,10:1165\n251#1,4:1175\n496#1,9:1179\n256#1:1188\n505#1,2:1189\n486#1,10:1191\n251#1,4:1201\n496#1,9:1205\n256#1:1214\n505#1,2:1215\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n78#1:977\n83#1:978\n89#1:979,6\n103#1:985,6\n113#1:991,6\n126#1:997\n143#1:998,6\n152#1:1004\n166#1:1005,6\n182#1:1011,6\n196#1:1017,6\n212#1:1023,6\n226#1:1029,6\n328#1:1035,6\n342#1:1041,6\n356#1:1047,6\n375#1:1053\n378#1:1054\n389#1:1055,6\n402#1:1061,6\n424#1:1067\n464#1:1068,6\n495#1:1074,6\n511#1:1080,6\n524#1:1086\n-1#1:1087,10\n-1#1:1097,4\n-1#1:1101,9\n-1#1:1110\n-1#1:1111,2\n-1#1:1113,10\n-1#1:1123,4\n-1#1:1127,9\n-1#1:1136\n-1#1:1137,2\n-1#1:1139,10\n-1#1:1149,4\n-1#1:1153,9\n-1#1:1162\n-1#1:1163,2\n-1#1:1165,10\n-1#1:1175,4\n-1#1:1179,9\n-1#1:1188\n-1#1:1189,2\n-1#1:1191,10\n-1#1:1201,4\n-1#1:1205,9\n-1#1:1214\n-1#1:1215,2\n*E\n"})
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public float[] f12441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public int f12442b;

    public /* synthetic */ r(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    @kotlin.a1
    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ String T(r rVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return rVar.M(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public static /* synthetic */ String U(r rVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 transform, int i11, Object obj) {
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
        float[] fArr = rVar.f12441a;
        int i12 = rVar.f12442b;
        for (int i13 = 0; i13 < i12; i13++) {
            float f10 = fArr[i13];
            if (i13 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i13 != 0) {
                sb2.append(separator);
            }
            sb2.append((CharSequence) transform.invoke(Float.valueOf(f10)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public static /* synthetic */ int f(r rVar, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = rVar.f12442b;
        }
        return rVar.e(i10, i11, i12);
    }

    @kotlin.a1
    public static /* synthetic */ void x() {
    }

    @androidx.annotation.g0(from = 0)
    public final int A() {
        return this.f12442b;
    }

    public final int C(float f10) {
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (f10 == fArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public final int D(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Float.valueOf(fArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int E(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!predicate.invoke(Float.valueOf(fArr[i10])).booleanValue());
        return i10;
    }

    public final boolean F() {
        return this.f12442b == 0;
    }

    public final boolean G() {
        return this.f12442b != 0;
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
        float[] fArr = this.f12441a;
        int i11 = this.f12442b;
        for (int i12 = 0; i12 < i11; i12++) {
            float f10 = fArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(f10);
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String N(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @NotNull Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.f12441a;
        int i11 = this.f12442b;
        for (int i12 = 0; i12 < i11; i12++) {
            float f10 = fArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Float.valueOf(f10)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String O(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.f12441a;
        int i11 = this.f12442b;
        for (int i12 = 0; i12 < i11; i12++) {
            float f10 = fArr[i12];
            if (i12 == i10) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Float.valueOf(f10)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String P(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        for (int i11 = 0; i11 < i10; i11++) {
            float f10 = fArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Float.valueOf(f10)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String Q(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        for (int i11 = 0; i11 < i10; i11++) {
            float f10 = fArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Float.valueOf(f10)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String R(@NotNull CharSequence separator, @NotNull Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        for (int i11 = 0; i11 < i10; i11++) {
            float f10 = fArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Float.valueOf(f10)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @oj.j
    @NotNull
    public final String S(@NotNull Function1<? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        for (int i11 = 0; i11 < i10; i11++) {
            float f10 = fArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(transform.invoke(Float.valueOf(f10)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final float V() {
        if (this.f12442b == 0) {
            t.f.f("FloatList is empty.");
        }
        return this.f12441a[this.f12442b - 1];
    }

    public final float W(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.f12441a;
        for (int i10 = this.f12442b - 1; -1 < i10; i10--) {
            float f10 = fArr[i10];
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return f10;
            }
        }
        throw new NoSuchElementException("FloatList contains no element matching the predicate.");
    }

    public final int X(float f10) {
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (fArr[i10] != f10);
        return i10;
    }

    public final boolean Y() {
        return this.f12442b == 0;
    }

    public final boolean Z(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.f12441a;
        for (int i10 = this.f12442b - 1; -1 < i10; i10--) {
            if (predicate.invoke(Float.valueOf(fArr[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return this.f12442b != 0;
    }

    public final boolean b(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Float.valueOf(fArr[i11])).booleanValue()) {
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
        if (i11 < 0 || i11 >= i12 || i12 > this.f12442b) {
            t.f.e("");
        }
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            float f10 = this.f12441a[i14];
            float f11 = i10;
            if (f10 < f11) {
                i11 = i14 + 1;
            } else {
                if (f10 <= f11) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            int i10 = rVar.f12442b;
            int i11 = this.f12442b;
            if (i10 == i11) {
                float[] fArr = this.f12441a;
                float[] fArr2 = rVar.f12441a;
                IntRange intRangeW1 = kotlin.ranges.r.W1(0, i11);
                int iL = intRangeW1.l();
                int iM = intRangeW1.m();
                if (iL > iM) {
                    return true;
                }
                while (fArr[iL] == fArr2[iL]) {
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

    public final boolean g(float f10) {
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (fArr[i11] == f10) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(@NotNull r elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        IntRange intRangeW1 = kotlin.ranges.r.W1(0, elements.f12442b);
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
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Float.hashCode(fArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final int i() {
        return this.f12442b;
    }

    public final int j(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (predicate.invoke(Float.valueOf(fArr[i12])).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public final float k(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= this.f12442b) {
            t.f.e("Index must be between 0 and size");
        }
        return this.f12441a[i10];
    }

    public final float l(@androidx.annotation.g0(from = 0) int i10, @NotNull Function1<? super Integer, Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= this.f12442b) ? defaultValue.invoke(Integer.valueOf(i10)).floatValue() : this.f12441a[i10];
    }

    public final float m() {
        if (this.f12442b == 0) {
            t.f.f("FloatList is empty.");
        }
        return this.f12441a[0];
    }

    public final float n(@NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        for (int i11 = 0; i11 < i10; i11++) {
            float f10 = fArr[i11];
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return f10;
            }
        }
        throw new NoSuchElementException("FloatList contains no element matching the predicate.");
    }

    public final <R> R o(R r10, @NotNull Function2<? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = operation.invoke(r10, Float.valueOf(fArr[i11]));
        }
        return r10;
    }

    public final <R> R p(R r10, @NotNull pj.n<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        for (int i11 = 0; i11 < i10; i11++) {
            R r11 = r10;
            r10 = operation.invoke(Integer.valueOf(i11), r11, Float.valueOf(fArr[i11]));
        }
        return r10;
    }

    public final <R> R q(R r10, @NotNull Function2<? super Float, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Float.valueOf(fArr[i10]), r10);
        }
    }

    public final <R> R r(R r10, @NotNull pj.n<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Integer.valueOf(i10), Float.valueOf(fArr[i10]), r10);
        }
    }

    public final void s(@NotNull Function1<? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Float.valueOf(fArr[i11]));
        }
    }

    public final void t(@NotNull Function2<? super Integer, ? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.f12441a;
        int i10 = this.f12442b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i11]));
        }
    }

    @NotNull
    public String toString() {
        return T(this, null, "[", "]", 0, null, 25, null);
    }

    public final void u(@NotNull Function1<? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.f12441a;
        for (int i10 = this.f12442b - 1; -1 < i10; i10--) {
            block.invoke(Float.valueOf(fArr[i10]));
        }
    }

    public final void v(@NotNull Function2<? super Integer, ? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.f12441a;
        for (int i10 = this.f12442b - 1; -1 < i10; i10--) {
            block.invoke(Integer.valueOf(i10), Float.valueOf(fArr[i10]));
        }
    }

    public final float w(@androidx.annotation.g0(from = 0) int i10) {
        if (i10 < 0 || i10 >= this.f12442b) {
            t.f.e("Index must be between 0 and size");
        }
        return this.f12441a[i10];
    }

    @NotNull
    public final IntRange y() {
        return kotlin.ranges.r.W1(0, this.f12442b);
    }

    @androidx.annotation.g0(from = -1)
    public final int z() {
        return this.f12442b - 1;
    }

    private r(int i10) {
        this.f12441a = i10 == 0 ? y.i() : new float[i10];
    }
}
