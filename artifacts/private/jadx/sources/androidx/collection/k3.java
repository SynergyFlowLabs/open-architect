package androidx.collection;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n+ 2 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,498:1\n217#1,6:499\n217#1,6:505\n327#1,30:511\n327#1,30:541\n422#1,9:572\n24#2:571\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n229#1:499,6\n235#1:505,6\n361#1:511,30\n369#1:541,30\n440#1:572,9\n399#1:571\n*E\n"})
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f12327a = new Object();

    private static final <E, T extends E> T A(j3<E> j3Var, int i10, T t10) {
        T t11;
        int iA = t.a.a(j3Var.f12320b, j3Var.f12322d, i10);
        return (iA < 0 || (t11 = (T) j3Var.f12321c[iA]) == f12327a) ? t10 : t11;
    }

    public static final <E> void c(@NotNull j3<E> j3Var, int i10, E e10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        int i11 = j3Var.f12322d;
        if (i11 != 0 && i10 <= j3Var.f12320b[i11 - 1]) {
            j3Var.o(i10, e10);
            return;
        }
        if (j3Var.f12319a && i11 >= j3Var.f12320b.length) {
            z(j3Var);
        }
        int i12 = j3Var.f12322d;
        if (i12 >= j3Var.f12320b.length) {
            int iE = t.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(j3Var.f12320b, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            j3Var.f12320b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(j3Var.f12321c, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            j3Var.f12321c = objArrCopyOf;
        }
        j3Var.f12320b[i12] = i10;
        j3Var.f12321c[i12] = e10;
        j3Var.f12322d = i12 + 1;
    }

    public static final <E> void d(@NotNull j3<E> j3Var) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        int i10 = j3Var.f12322d;
        Object[] objArr = j3Var.f12321c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        j3Var.f12322d = 0;
        j3Var.f12319a = false;
    }

    public static final <E> boolean e(@NotNull j3<E> j3Var, int i10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        return j3Var.j(i10) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0025 A[RETURN] */
    public static final <E> boolean f(@NotNull j3<E> j3Var, E e10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        if (j3Var.f12319a) {
            z(j3Var);
        }
        int i10 = j3Var.f12322d;
        int i11 = 0;
        while (i11 < i10) {
            if (j3Var.f12321c[i11] == e10) {
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

    @Nullable
    public static final <E> E g(@NotNull j3<E> j3Var, int i10) {
        E e10;
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        int iA = t.a.a(j3Var.f12320b, j3Var.f12322d, i10);
        if (iA < 0 || (e10 = (E) j3Var.f12321c[iA]) == f12327a) {
            return null;
        }
        return e10;
    }

    public static final <E> E h(@NotNull j3<E> j3Var, int i10, E e10) {
        E e11;
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        int iA = t.a.a(j3Var.f12320b, j3Var.f12322d, i10);
        return (iA < 0 || (e11 = (E) j3Var.f12321c[iA]) == f12327a) ? e10 : e11;
    }

    public static final <E> int i(@NotNull j3<E> j3Var, int i10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        if (j3Var.f12319a) {
            z(j3Var);
        }
        return t.a.a(j3Var.f12320b, j3Var.f12322d, i10);
    }

    public static final <E> int j(@NotNull j3<E> j3Var, E e10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        if (j3Var.f12319a) {
            z(j3Var);
        }
        int i10 = j3Var.f12322d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (j3Var.f12321c[i11] == e10) {
                return i11;
            }
        }
        return -1;
    }

    public static final <E> boolean k(@NotNull j3<E> j3Var) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        return j3Var.size() == 0;
    }

    public static final <E> int l(@NotNull j3<E> j3Var, int i10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        if (j3Var.f12319a) {
            z(j3Var);
        }
        return j3Var.f12320b[i10];
    }

    public static final <E> void m(@NotNull j3<E> j3Var, int i10, E e10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        int iA = t.a.a(j3Var.f12320b, j3Var.f12322d, i10);
        if (iA >= 0) {
            j3Var.f12321c[iA] = e10;
            return;
        }
        int i11 = ~iA;
        if (i11 < j3Var.f12322d && j3Var.f12321c[i11] == f12327a) {
            j3Var.f12320b[i11] = i10;
            j3Var.f12321c[i11] = e10;
            return;
        }
        if (j3Var.f12319a && j3Var.f12322d >= j3Var.f12320b.length) {
            z(j3Var);
            i11 = ~t.a.a(j3Var.f12320b, j3Var.f12322d, i10);
        }
        int i12 = j3Var.f12322d;
        if (i12 >= j3Var.f12320b.length) {
            int iE = t.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(j3Var.f12320b, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            j3Var.f12320b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(j3Var.f12321c, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            j3Var.f12321c = objArrCopyOf;
        }
        int i13 = j3Var.f12322d;
        if (i13 - i11 != 0) {
            int[] iArr = j3Var.f12320b;
            int i14 = i11 + 1;
            ArraysKt.copyInto(iArr, iArr, i14, i11, i13);
            Object[] objArr = j3Var.f12321c;
            ArraysKt.copyInto(objArr, objArr, i14, i11, j3Var.f12322d);
        }
        j3Var.f12320b[i11] = i10;
        j3Var.f12321c[i11] = e10;
        j3Var.f12322d++;
    }

    public static final <E> void n(@NotNull j3<E> j3Var, @NotNull j3<? extends E> other) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iN = other.n(i10);
            E eZ = other.z(i10);
            int iA = t.a.a(j3Var.f12320b, j3Var.f12322d, iN);
            if (iA >= 0) {
                j3Var.f12321c[iA] = eZ;
            } else {
                int i11 = ~iA;
                if (i11 >= j3Var.f12322d || j3Var.f12321c[i11] != f12327a) {
                    if (j3Var.f12319a && j3Var.f12322d >= j3Var.f12320b.length) {
                        z(j3Var);
                        i11 = ~t.a.a(j3Var.f12320b, j3Var.f12322d, iN);
                    }
                    int i12 = j3Var.f12322d;
                    if (i12 >= j3Var.f12320b.length) {
                        int iE = t.a.e(i12 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(j3Var.f12320b, iE);
                        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                        j3Var.f12320b = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(j3Var.f12321c, iE);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        j3Var.f12321c = objArrCopyOf;
                    }
                    int i13 = j3Var.f12322d;
                    if (i13 - i11 != 0) {
                        int[] iArr = j3Var.f12320b;
                        int i14 = i11 + 1;
                        ArraysKt.copyInto(iArr, iArr, i14, i11, i13);
                        Object[] objArr = j3Var.f12321c;
                        ArraysKt.copyInto(objArr, objArr, i14, i11, j3Var.f12322d);
                    }
                    j3Var.f12320b[i11] = iN;
                    j3Var.f12321c[i11] = eZ;
                    j3Var.f12322d++;
                } else {
                    j3Var.f12320b[i11] = iN;
                    j3Var.f12321c[i11] = eZ;
                }
            }
        }
    }

    @Nullable
    public static final <E> E o(@NotNull j3<E> j3Var, int i10, E e10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        E e11 = (E) g(j3Var, i10);
        if (e11 == null) {
            int iA = t.a.a(j3Var.f12320b, j3Var.f12322d, i10);
            if (iA >= 0) {
                j3Var.f12321c[iA] = e10;
                return e11;
            }
            int i11 = ~iA;
            if (i11 < j3Var.f12322d && j3Var.f12321c[i11] == f12327a) {
                j3Var.f12320b[i11] = i10;
                j3Var.f12321c[i11] = e10;
                return e11;
            }
            if (j3Var.f12319a && j3Var.f12322d >= j3Var.f12320b.length) {
                z(j3Var);
                i11 = ~t.a.a(j3Var.f12320b, j3Var.f12322d, i10);
            }
            int i12 = j3Var.f12322d;
            if (i12 >= j3Var.f12320b.length) {
                int iE = t.a.e(i12 + 1);
                int[] iArrCopyOf = Arrays.copyOf(j3Var.f12320b, iE);
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                j3Var.f12320b = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(j3Var.f12321c, iE);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                j3Var.f12321c = objArrCopyOf;
            }
            int i13 = j3Var.f12322d;
            if (i13 - i11 != 0) {
                int[] iArr = j3Var.f12320b;
                int i14 = i11 + 1;
                ArraysKt.copyInto(iArr, iArr, i14, i11, i13);
                Object[] objArr = j3Var.f12321c;
                ArraysKt.copyInto(objArr, objArr, i14, i11, j3Var.f12322d);
            }
            j3Var.f12320b[i11] = i10;
            j3Var.f12321c[i11] = e10;
            j3Var.f12322d++;
        }
        return e11;
    }

    public static final <E> void p(@NotNull j3<E> j3Var, int i10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        int iA = t.a.a(j3Var.f12320b, j3Var.f12322d, i10);
        if (iA >= 0) {
            Object[] objArr = j3Var.f12321c;
            Object obj = objArr[iA];
            Object obj2 = f12327a;
            if (obj != obj2) {
                objArr[iA] = obj2;
                j3Var.f12319a = true;
            }
        }
    }

    public static final <E> boolean q(@NotNull j3<E> j3Var, int i10, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        int iJ = j3Var.j(i10);
        if (iJ < 0 || !Intrinsics.areEqual(obj, j3Var.z(iJ))) {
            return false;
        }
        j3Var.t(iJ);
        return true;
    }

    public static final <E> void r(@NotNull j3<E> j3Var, int i10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        if (j3Var.f12321c[i10] != f12327a) {
            j3Var.f12321c[i10] = f12327a;
            j3Var.f12319a = true;
        }
    }

    public static final <E> void s(@NotNull j3<E> j3Var, int i10, int i11) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        int iMin = Math.min(i11, i10 + i11);
        while (i10 < iMin) {
            j3Var.t(i10);
            i10++;
        }
    }

    @Nullable
    public static final <E> E t(@NotNull j3<E> j3Var, int i10, E e10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        int iJ = j3Var.j(i10);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = j3Var.f12321c;
        E e11 = (E) objArr[iJ];
        objArr[iJ] = e10;
        return e11;
    }

    public static final <E> boolean u(@NotNull j3<E> j3Var, int i10, E e10, E e11) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        int iJ = j3Var.j(i10);
        if (iJ < 0 || !Intrinsics.areEqual(j3Var.f12321c[iJ], e10)) {
            return false;
        }
        j3Var.f12321c[iJ] = e11;
        return true;
    }

    public static final <E> void v(@NotNull j3<E> j3Var, int i10, E e10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        if (j3Var.f12319a) {
            z(j3Var);
        }
        j3Var.f12321c[i10] = e10;
    }

    public static final <E> int w(@NotNull j3<E> j3Var) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        if (j3Var.f12319a) {
            z(j3Var);
        }
        return j3Var.f12322d;
    }

    @NotNull
    public static final <E> String x(@NotNull j3<E> j3Var) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        if (j3Var.size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(j3Var.f12322d * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = j3Var.f12322d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(j3Var.n(i11));
            sb2.append('=');
            E eZ = j3Var.z(i11);
            if (eZ != j3Var) {
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

    public static final <E> E y(@NotNull j3<E> j3Var, int i10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        if (j3Var.f12319a) {
            z(j3Var);
        }
        Object[] objArr = j3Var.f12321c;
        if (i10 < objArr.length) {
            return (E) objArr[i10];
        }
        h hVar = h.f12266a;
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void z(j3<E> j3Var) {
        int i10 = j3Var.f12322d;
        int[] iArr = j3Var.f12320b;
        Object[] objArr = j3Var.f12321c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f12327a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        j3Var.f12319a = false;
        j3Var.f12322d = i11;
    }
}
