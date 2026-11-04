package g0;

import androidx.compose.runtime.f4;
import androidx.compose.runtime.internal.w0;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n34#2,4:329\n1#3:333\n*S KotlinDebug\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n*L\n30#1:329,4\n*E\n"})
public final class g<E> extends d<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f275363f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object[] f275364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object[] f275365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f275366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f275367e;

    public g(@NotNull Object[] objArr, @NotNull Object[] objArr2, int i10, int i11) {
        this.f275364b = objArr;
        this.f275365c = objArr2;
        this.f275366d = i10;
        this.f275367e = i11;
        if (!(size() > 32)) {
            f4.d("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        i0.a.a(size() - o.d(size()) <= r.B(objArr2.length, 32));
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> A(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        i0.a.a(i12 < size);
        if (size == 1) {
            return t(objArr, i10, i11);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f275365c, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        int i13 = size - 1;
        if (i12 < i13) {
            ArraysKt.copyInto(this.f275365c, objArrCopyOf, i12, i12 + 1, size);
        }
        objArrCopyOf[i13] = null;
        return new g(objArr, objArrCopyOf, (i10 + size) - 1, i11);
    }

    private final int B() {
        return o.d(size());
    }

    private final Object[] C(Object[] objArr, int i10, int i11, Object obj) {
        int iA = o.a(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        if (i10 == 0) {
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iA];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iA] = C((Object[]) obj2, i10 - 5, i11, obj);
        return objArrCopyOf;
    }

    private final Object[] l(int i10) {
        if (B() <= i10) {
            return this.f275365c;
        }
        Object[] objArr = this.f275364b;
        for (int i11 = this.f275367e; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[o.a(i10, i11)];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] n(Object[] objArr, int i10, int i11, Object obj, f fVar) {
        Object[] objArrCopyOf;
        int iA = o.a(i11, i10);
        if (i10 == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            }
            ArraysKt.copyInto(objArr, objArrCopyOf, iA + 1, iA, 31);
            fVar.b(objArr[31]);
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        Object obj2 = objArr[iA];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = n((Object[]) obj2, i12, i11, obj, fVar);
        while (true) {
            iA++;
            if (iA >= 32 || objArrCopyOf2[iA] == null) {
                break;
            }
            Object obj3 = objArr[iA];
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iA] = n((Object[]) obj3, i12, 0, fVar.a(), fVar);
        }
        return objArrCopyOf2;
    }

    private final g<E> p(Object[] objArr, int i10, Object obj) {
        int size = size() - B();
        Object[] objArrCopyOf = Arrays.copyOf(this.f275365c, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        if (size < 32) {
            ArraysKt.copyInto(this.f275365c, objArrCopyOf, i10 + 1, i10, size);
            objArrCopyOf[i10] = obj;
            return new g<>(objArr, objArrCopyOf, size() + 1, this.f275367e);
        }
        Object[] objArr2 = this.f275365c;
        Object obj2 = objArr2[31];
        ArraysKt.copyInto(objArr2, objArrCopyOf, i10 + 1, i10, size - 1);
        objArrCopyOf[i10] = obj;
        return u(objArr, objArrCopyOf, o.c(obj2));
    }

    private final Object[] s(Object[] objArr, int i10, int i11, f fVar) {
        Object[] objArrS;
        int iA = o.a(i11, i10);
        if (i10 == 5) {
            fVar.b(objArr[iA]);
            objArrS = null;
        } else {
            Object obj = objArr[iA];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrS = s((Object[]) obj, i10 - 5, i11, fVar);
        }
        if (objArrS == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iA] = objArrS;
        return objArrCopyOf;
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> t(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(...)");
            }
            return new m(objArr);
        }
        f fVar = new f(null);
        Object[] objArrS = s(objArr, i11, i10 - 1, fVar);
        Intrinsics.checkNotNull(objArrS);
        Object objA = fVar.a();
        Intrinsics.checkNotNull(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) objA;
        if (objArrS[1] != null) {
            return new g(objArrS, objArr2, i10, i11);
        }
        int i12 = 3 >> 0;
        Object obj = objArrS[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new g((Object[]) obj, objArr2, i10, i11 - 5);
    }

    private final g<E> u(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f275367e;
        if (size <= (1 << i10)) {
            return new g<>(v(objArr, i10, objArr2), objArr3, size() + 1, this.f275367e);
        }
        Object[] objArrC = o.c(objArr);
        int i11 = this.f275367e + 5;
        return new g<>(v(objArrC, i11, objArr2), objArr3, size() + 1, i11);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
    private final Object[] v(Object[] objArr, int i10, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iA = o.a(size() - 1, i10);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            if (objArrCopyOf == null) {
                objArrCopyOf = new Object[32];
            }
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i10 == 5) {
            objArrCopyOf[iA] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iA] = v((Object[]) objArrCopyOf[iA], i10 - 5, objArr2);
        return objArrCopyOf;
    }

    private final Object[] w(Object[] objArr, int i10, int i11, f fVar) {
        Object[] objArrCopyOf;
        int iA = o.a(i11, i10);
        if (i10 == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            }
            ArraysKt.copyInto(objArr, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = fVar.a();
            fVar.b(objArr[iA]);
            return objArrCopyOf;
        }
        int iA2 = objArr[31] == null ? o.a(B() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        int i13 = iA + 1;
        if (i13 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iA2] = w((Object[]) obj, i12, 0, fVar);
                if (iA2 == i13) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = w((Object[]) obj2, i12, i11, fVar);
        return objArrCopyOf2;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int i10) {
        i0.e.a(i10, size());
        return (E) l(i10)[i10 & 31];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f275366d;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> l3(int i10) {
        i0.e.a(i10, size());
        int iB = B();
        return i10 >= iB ? A(this.f275364b, iB, this.f275367e, i10 - iB) : A(w(this.f275364b, this.f275367e, i10, new f(this.f275365c[0])), iB, this.f275367e, 0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i10) {
        i0.e.b(i10, size());
        return new j(this.f275364b, this.f275365c, i10, size(), (this.f275367e / 5) + 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.g, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public i<E> builder() {
        return new i<>(this, this.f275364b, this.f275365c, this.f275367e);
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> set(int i10, E e10) {
        i0.e.a(i10, size());
        if (B() > i10) {
            return new g(C(this.f275364b, this.f275367e, i10, e10), this.f275365c, size(), this.f275367e);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f275365c, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 & 31] = e10;
        return new g(this.f275364b, objArrCopyOf, size(), this.f275367e);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> I(@NotNull Function1<? super E, Boolean> function1) {
        i<E> iVarBuilder = builder();
        iVarBuilder.T(function1);
        return iVarBuilder.build();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> add(E e10) {
        int size = size() - B();
        if (size >= 32) {
            return u(this.f275364b, this.f275365c, o.c(e10));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f275365c, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size] = e10;
        return new g(this.f275364b, objArrCopyOf, size() + 1, this.f275367e);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> add(int i10, E e10) {
        i0.e.b(i10, size());
        if (i10 == size()) {
            return add((Object) e10);
        }
        int iB = B();
        if (i10 >= iB) {
            return p(this.f275364b, i10 - iB, e10);
        }
        f fVar = new f(null);
        return p(n(this.f275364b, this.f275367e, i10, e10, fVar), 0, fVar.a());
    }
}
