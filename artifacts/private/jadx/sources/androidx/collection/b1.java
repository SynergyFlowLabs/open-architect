package androidx.collection;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLongSparseArray.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n+ 2 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n*L\n1#1,243:1\n218#2:244\n229#2,5:245\n223#2,11:250\n239#2,8:261\n239#2,8:269\n250#2,9:277\n263#2,5:286\n271#2,7:291\n286#2,9:298\n320#2,12:307\n299#2,18:319\n334#2,21:337\n358#2,2:358\n360#2:361\n364#2,5:362\n373#2,2:367\n299#2,18:369\n376#2:387\n380#2:388\n384#2:389\n385#2:393\n388#2,2:395\n299#2,18:397\n391#2:415\n396#2:416\n397#2:420\n400#2,2:422\n299#2,18:424\n404#2:442\n409#2:443\n410#2:447\n413#2,2:449\n299#2,18:451\n416#2,2:469\n421#2,2:471\n299#2,18:473\n424#2:491\n429#2,2:492\n299#2,18:494\n432#2,6:512\n442#2:518\n447#2:519\n452#2,8:520\n463#2,6:528\n299#2,18:534\n470#2,10:552\n483#2,21:562\n1#3:360\n59#4,3:390\n63#4:394\n59#4,3:417\n63#4:421\n59#4,3:444\n63#4:448\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n*L\n92#1:244\n92#1:245,5\n99#1:250,11\n103#1:261,8\n106#1:269,8\n115#1:277,9\n118#1:286,5\n127#1:291,7\n138#1:298,9\n144#1:307,12\n144#1:319,18\n144#1:337,21\n150#1:358,2\n150#1:361\n161#1:362,5\n164#1:367,2\n164#1:369,18\n164#1:387\n171#1:388\n183#1:389\n183#1:393\n183#1:395,2\n183#1:397,18\n183#1:415\n195#1:416\n195#1:420\n195#1:422,2\n195#1:424,18\n195#1:442\n203#1:443\n203#1:447\n203#1:449,2\n203#1:451,18\n203#1:469,2\n209#1:471,2\n209#1:473,18\n209#1:491\n218#1:492,2\n218#1:494,18\n218#1:512,6\n221#1:518\n224#1:519\n227#1:520,8\n233#1:528,6\n233#1:534,18\n233#1:552,10\n241#1:562,21\n150#1:360\n183#1:390,3\n183#1:394\n195#1:417,3\n195#1:421\n203#1:444,3\n203#1:448\n*E\n"})
public class b1<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public /* synthetic */ boolean f12136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public /* synthetic */ long[] f12137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public /* synthetic */ Object[] f12138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    public /* synthetic */ int f12139d;

    @oj.j
    public b1() {
        this(0, 1, null);
    }

    public void a(long j10, E e10) {
        int i10 = this.f12139d;
        if (i10 != 0 && j10 <= this.f12137b[i10 - 1]) {
            n(j10, e10);
            return;
        }
        if (this.f12136a) {
            long[] jArr = this.f12137b;
            if (i10 >= jArr.length) {
                Object[] objArr = this.f12138c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != c1.f12162a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f12136a = false;
                this.f12139d = i11;
            }
        }
        int i13 = this.f12139d;
        if (i13 >= this.f12137b.length) {
            int iF = t.a.f(i13 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f12137b, iF);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f12137b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12138c, iF);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f12138c = objArrCopyOf;
        }
        this.f12137b[i13] = j10;
        this.f12138c[i13] = e10;
        this.f12139d = i13 + 1;
    }

    public void b() {
        int i10 = this.f12139d;
        Object[] objArr = this.f12138c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f12139d = 0;
        this.f12136a = false;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b1<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        b1<E> b1Var = (b1) objClone;
        b1Var.f12137b = (long[]) this.f12137b.clone();
        b1Var.f12138c = (Object[]) this.f12138c.clone();
        return b1Var;
    }

    public boolean d(long j10) {
        return i(j10) >= 0;
    }

    public boolean e(E e10) {
        return j(e10) >= 0;
    }

    @kotlin.l(message = "Alias for `remove(key)`.", replaceWith = @kotlin.b1(expression = "remove(key)", imports = {}))
    public void f(long j10) {
        int iB = t.a.b(this.f12137b, this.f12139d, j10);
        if (iB < 0 || this.f12138c[iB] == c1.f12162a) {
            return;
        }
        this.f12138c[iB] = c1.f12162a;
        int i10 = 5 >> 1;
        this.f12136a = true;
    }

    @Nullable
    public E g(long j10) {
        int iB = t.a.b(this.f12137b, this.f12139d, j10);
        if (iB < 0 || this.f12138c[iB] == c1.f12162a) {
            return null;
        }
        return (E) this.f12138c[iB];
    }

    public E h(long j10, E e10) {
        int iB = t.a.b(this.f12137b, this.f12139d, j10);
        return (iB < 0 || this.f12138c[iB] == c1.f12162a) ? e10 : (E) this.f12138c[iB];
    }

    public int i(long j10) {
        if (this.f12136a) {
            int i10 = this.f12139d;
            long[] jArr = this.f12137b;
            Object[] objArr = this.f12138c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != c1.f12162a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        boolean z10 = false;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f12136a = false;
            this.f12139d = i11;
        }
        return t.a.b(this.f12137b, this.f12139d, j10);
    }

    public int j(E e10) {
        if (this.f12136a) {
            int i10 = this.f12139d;
            long[] jArr = this.f12137b;
            Object[] objArr = this.f12138c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != c1.f12162a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f12136a = false;
            this.f12139d = i11;
        }
        int i13 = this.f12139d;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f12138c[i14] == e10) {
                return i14;
            }
        }
        return -1;
    }

    public boolean k() {
        return size() == 0;
    }

    public long l(int i10) {
        if (!(i10 >= 0 && i10 < this.f12139d)) {
            t.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f12136a) {
            int i11 = this.f12139d;
            long[] jArr = this.f12137b;
            Object[] objArr = this.f12138c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != c1.f12162a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        int i14 = 6 >> 0;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f12136a = false;
            this.f12139d = i12;
        }
        return this.f12137b[i10];
    }

    public void n(long j10, E e10) {
        int iB = t.a.b(this.f12137b, this.f12139d, j10);
        if (iB >= 0) {
            this.f12138c[iB] = e10;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.f12139d && this.f12138c[i10] == c1.f12162a) {
            this.f12137b[i10] = j10;
            this.f12138c[i10] = e10;
            return;
        }
        if (this.f12136a) {
            int i11 = this.f12139d;
            long[] jArr = this.f12137b;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f12138c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != c1.f12162a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f12136a = false;
                this.f12139d = i12;
                i10 = ~t.a.b(this.f12137b, i12, j10);
            }
        }
        int i14 = this.f12139d;
        if (i14 >= this.f12137b.length) {
            int iF = t.a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f12137b, iF);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f12137b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12138c, iF);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f12138c = objArrCopyOf;
        }
        int i15 = this.f12139d;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f12137b;
            int i16 = i10 + 1;
            ArraysKt.copyInto(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f12138c;
            ArraysKt.copyInto(objArr2, objArr2, i16, i10, this.f12139d);
        }
        this.f12137b[i10] = j10;
        this.f12138c[i10] = e10;
        this.f12139d++;
    }

    public void o(@NotNull b1<? extends E> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            n(other.l(i10), other.w(i10));
        }
    }

    @Nullable
    public E p(long j10, E e10) {
        E eG = g(j10);
        if (eG == null) {
            n(j10, e10);
        }
        return eG;
    }

    public void q(long j10) {
        int iB = t.a.b(this.f12137b, this.f12139d, j10);
        if (iB < 0 || this.f12138c[iB] == c1.f12162a) {
            return;
        }
        this.f12138c[iB] = c1.f12162a;
        this.f12136a = true;
    }

    public boolean r(long j10, E e10) {
        int i10 = i(j10);
        if (i10 < 0 || !Intrinsics.areEqual(e10, w(i10))) {
            return false;
        }
        s(i10);
        return true;
    }

    public void s(int i10) {
        if (this.f12138c[i10] != c1.f12162a) {
            this.f12138c[i10] = c1.f12162a;
            this.f12136a = true;
        }
    }

    public int size() {
        if (this.f12136a) {
            int i10 = this.f12139d;
            long[] jArr = this.f12137b;
            Object[] objArr = this.f12138c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != c1.f12162a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f12136a = false;
            this.f12139d = i11;
        }
        return this.f12139d;
    }

    @Nullable
    public E t(long j10, E e10) {
        int i10 = i(j10);
        if (i10 < 0) {
            return null;
        }
        Object[] objArr = this.f12138c;
        E e11 = (E) objArr[i10];
        objArr[i10] = e10;
        return e11;
    }

    @NotNull
    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12139d * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = this.f12139d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(l(i11));
            sb2.append('=');
            E eW = w(i11);
            if (eW != sb2) {
                sb2.append(eW);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public boolean u(long j10, E e10, E e11) {
        int i10 = i(j10);
        if (i10 < 0 || !Intrinsics.areEqual(this.f12138c[i10], e10)) {
            return false;
        }
        this.f12138c[i10] = e11;
        return true;
    }

    public void v(int i10, E e10) {
        if (!(i10 >= 0 && i10 < this.f12139d)) {
            t.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f12136a) {
            int i11 = this.f12139d;
            long[] jArr = this.f12137b;
            Object[] objArr = this.f12138c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != c1.f12162a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f12136a = false;
            this.f12139d = i12;
        }
        this.f12138c[i10] = e10;
    }

    public E w(int i10) {
        boolean z10;
        if (i10 < 0 || i10 >= this.f12139d) {
            z10 = false;
        } else {
            z10 = true;
            int i11 = 3 << 1;
        }
        if (!z10) {
            t.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f12136a) {
            int i12 = this.f12139d;
            long[] jArr = this.f12137b;
            Object[] objArr = this.f12138c;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj = objArr[i14];
                if (obj != c1.f12162a) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            this.f12136a = false;
            this.f12139d = i13;
        }
        return (E) this.f12138c[i10];
    }

    @oj.j
    public b1(int i10) {
        if (i10 == 0) {
            this.f12137b = t.a.f376159b;
            this.f12138c = t.a.f376160c;
        } else {
            int iF = t.a.f(i10);
            this.f12137b = new long[iF];
            this.f12138c = new Object[iF];
        }
    }

    public /* synthetic */ b1(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
