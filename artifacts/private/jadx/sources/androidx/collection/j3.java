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
@SourceDebugExtension({"SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,263:1\n250#2,9:264\n263#2,5:273\n271#2,5:278\n279#2,7:283\n294#2,9:290\n327#2,30:299\n360#2,2:329\n327#2,37:331\n367#2,3:368\n327#2,30:371\n371#2:401\n376#2,4:402\n383#2:406\n387#2,4:407\n395#2,5:411\n401#2:417\n406#2,5:418\n414#2,4:423\n422#2,9:427\n435#2:436\n440#2:437\n422#2,9:438\n445#2,8:447\n456#2,17:455\n476#2,21:472\n24#3:416\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n123#1:264,9\n126#1:273,5\n135#1:278,5\n144#1:283,7\n155#1:290,9\n161#1:299,30\n168#1:329,2\n168#1:331,37\n179#1:368,3\n179#1:371,30\n179#1:401\n182#1:402,4\n198#1:406\n204#1:407,4\n210#1:411,5\n210#1:417\n216#1:418,5\n226#1:423,4\n238#1:427,9\n241#1:436\n244#1:437\n244#1:438,9\n247#1:447,8\n253#1:455,17\n261#1:472,21\n210#1:416\n*E\n"})
public class j3<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public /* synthetic */ boolean f12319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public /* synthetic */ int[] f12320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public /* synthetic */ Object[] f12321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    public /* synthetic */ int f12322d;

    @oj.j
    public j3() {
        this(0, 1, null);
    }

    public void a(int i10, E e10) {
        int i11 = this.f12322d;
        if (i11 != 0 && i10 <= this.f12320b[i11 - 1]) {
            o(i10, e10);
            return;
        }
        if (this.f12319a && i11 >= this.f12320b.length) {
            k3.z(this);
        }
        int i12 = this.f12322d;
        if (i12 >= this.f12320b.length) {
            int iE = t.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f12320b, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f12320b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12321c, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f12321c = objArrCopyOf;
        }
        this.f12320b[i12] = i10;
        this.f12321c[i12] = e10;
        this.f12322d = i12 + 1;
    }

    public void b() {
        int i10 = this.f12322d;
        Object[] objArr = this.f12321c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f12322d = 0;
        this.f12319a = false;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j3<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        j3<E> j3Var = (j3) objClone;
        j3Var.f12320b = (int[]) this.f12320b.clone();
        j3Var.f12321c = (Object[]) this.f12321c.clone();
        return j3Var;
    }

    public boolean d(int i10) {
        return j(i10) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0023 A[RETURN] */
    public boolean e(E e10) {
        if (this.f12319a) {
            k3.z(this);
        }
        int i10 = this.f12322d;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f12321c[i11] == e10) {
                if (i11 >= 0) {
                    return true;
                }
                return false;
            }
            i11++;
        }
        i11 = -1;
        if (i11 >= 0) {
            return true;
        }
        return false;
    }

    @kotlin.l(message = "Alias for remove(int).", replaceWith = @kotlin.b1(expression = "remove(key)", imports = {}))
    public void f(int i10) {
        r(i10);
    }

    @Nullable
    public E g(int i10) {
        return (E) k3.g(this, i10);
    }

    public E h(int i10, E e10) {
        return (E) k3.h(this, i10, e10);
    }

    @oj.i(name = "getIsEmpty")
    public final boolean i() {
        return l();
    }

    public int j(int i10) {
        if (this.f12319a) {
            k3.z(this);
        }
        return t.a.a(this.f12320b, this.f12322d, i10);
    }

    public int k(E e10) {
        if (this.f12319a) {
            k3.z(this);
        }
        int i10 = this.f12322d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f12321c[i11] == e10) {
                return i11;
            }
        }
        return -1;
    }

    public boolean l() {
        return size() == 0;
    }

    public int n(int i10) {
        if (this.f12319a) {
            k3.z(this);
        }
        return this.f12320b[i10];
    }

    public void o(int i10, E e10) {
        int iA = t.a.a(this.f12320b, this.f12322d, i10);
        if (iA >= 0) {
            this.f12321c[iA] = e10;
            return;
        }
        int i11 = ~iA;
        if (i11 < this.f12322d && this.f12321c[i11] == k3.f12327a) {
            this.f12320b[i11] = i10;
            this.f12321c[i11] = e10;
            return;
        }
        if (this.f12319a && this.f12322d >= this.f12320b.length) {
            k3.z(this);
            i11 = ~t.a.a(this.f12320b, this.f12322d, i10);
        }
        int i12 = this.f12322d;
        if (i12 >= this.f12320b.length) {
            int iE = t.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f12320b, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f12320b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12321c, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f12321c = objArrCopyOf;
        }
        int i13 = this.f12322d;
        if (i13 - i11 != 0) {
            int[] iArr = this.f12320b;
            int i14 = i11 + 1;
            ArraysKt.copyInto(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f12321c;
            ArraysKt.copyInto(objArr, objArr, i14, i11, this.f12322d);
        }
        this.f12320b[i11] = i10;
        this.f12321c[i11] = e10;
        this.f12322d++;
    }

    public void p(@NotNull j3<? extends E> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iN = other.n(i10);
            E eZ = other.z(i10);
            int iA = t.a.a(this.f12320b, this.f12322d, iN);
            if (iA >= 0) {
                this.f12321c[iA] = eZ;
            } else {
                int i11 = ~iA;
                if (i11 >= this.f12322d || this.f12321c[i11] != k3.f12327a) {
                    if (this.f12319a && this.f12322d >= this.f12320b.length) {
                        k3.z(this);
                        i11 = ~t.a.a(this.f12320b, this.f12322d, iN);
                    }
                    int i12 = this.f12322d;
                    if (i12 >= this.f12320b.length) {
                        int iE = t.a.e(i12 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(this.f12320b, iE);
                        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                        this.f12320b = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(this.f12321c, iE);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        this.f12321c = objArrCopyOf;
                    }
                    int i13 = this.f12322d;
                    if (i13 - i11 != 0) {
                        int[] iArr = this.f12320b;
                        int i14 = i11 + 1;
                        ArraysKt.copyInto(iArr, iArr, i14, i11, i13);
                        Object[] objArr = this.f12321c;
                        ArraysKt.copyInto(objArr, objArr, i14, i11, this.f12322d);
                    }
                    this.f12320b[i11] = iN;
                    this.f12321c[i11] = eZ;
                    this.f12322d++;
                } else {
                    this.f12320b[i11] = iN;
                    this.f12321c[i11] = eZ;
                }
            }
        }
    }

    @Nullable
    public E q(int i10, E e10) {
        E e11 = (E) k3.g(this, i10);
        if (e11 == null) {
            int iA = t.a.a(this.f12320b, this.f12322d, i10);
            if (iA >= 0) {
                this.f12321c[iA] = e10;
                return e11;
            }
            int i11 = ~iA;
            if (i11 < this.f12322d && this.f12321c[i11] == k3.f12327a) {
                this.f12320b[i11] = i10;
                this.f12321c[i11] = e10;
                return e11;
            }
            if (this.f12319a && this.f12322d >= this.f12320b.length) {
                k3.z(this);
                i11 = ~t.a.a(this.f12320b, this.f12322d, i10);
            }
            int i12 = this.f12322d;
            if (i12 >= this.f12320b.length) {
                int iE = t.a.e(i12 + 1);
                int[] iArrCopyOf = Arrays.copyOf(this.f12320b, iE);
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                this.f12320b = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f12321c, iE);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                this.f12321c = objArrCopyOf;
            }
            int i13 = this.f12322d;
            if (i13 - i11 != 0) {
                int[] iArr = this.f12320b;
                int i14 = i11 + 1;
                ArraysKt.copyInto(iArr, iArr, i14, i11, i13);
                Object[] objArr = this.f12321c;
                ArraysKt.copyInto(objArr, objArr, i14, i11, this.f12322d);
            }
            this.f12320b[i11] = i10;
            this.f12321c[i11] = e10;
            this.f12322d++;
        }
        return e11;
    }

    public void r(int i10) {
        k3.p(this, i10);
    }

    public boolean s(int i10, @Nullable Object obj) {
        int iJ = j(i10);
        if (iJ < 0 || !Intrinsics.areEqual(obj, z(iJ))) {
            return false;
        }
        t(iJ);
        return true;
    }

    public int size() {
        if (this.f12319a) {
            k3.z(this);
        }
        return this.f12322d;
    }

    public void t(int i10) {
        if (this.f12321c[i10] != k3.f12327a) {
            this.f12321c[i10] = k3.f12327a;
            this.f12319a = true;
        }
    }

    @NotNull
    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12322d * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = this.f12322d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(n(i11));
            sb2.append('=');
            E eZ = z(i11);
            if (eZ != this) {
                sb2.append(eZ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public void u(int i10, int i11) {
        int iMin = Math.min(i11, i10 + i11);
        while (i10 < iMin) {
            t(i10);
            i10++;
        }
    }

    @Nullable
    public E v(int i10, E e10) {
        int iJ = j(i10);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.f12321c;
        E e11 = (E) objArr[iJ];
        objArr[iJ] = e10;
        return e11;
    }

    public boolean w(int i10, E e10, E e11) {
        int iJ = j(i10);
        if (iJ < 0 || !Intrinsics.areEqual(this.f12321c[iJ], e10)) {
            return false;
        }
        this.f12321c[iJ] = e11;
        return true;
    }

    public void x(int i10, E e10) {
        if (this.f12319a) {
            k3.z(this);
        }
        this.f12321c[i10] = e10;
    }

    public E z(int i10) {
        if (this.f12319a) {
            k3.z(this);
        }
        Object[] objArr = this.f12321c;
        if (i10 < objArr.length) {
            return (E) objArr[i10];
        }
        h hVar = h.f12266a;
        throw new ArrayIndexOutOfBoundsException();
    }

    @oj.j
    public j3(int i10) {
        if (i10 == 0) {
            this.f12320b = t.a.f376158a;
            this.f12321c = t.a.f376160c;
        } else {
            int iE = t.a.e(i10);
            this.f12320b = new int[iE];
            this.f12321c = new Object[iE];
        }
    }

    public /* synthetic */ j3(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
