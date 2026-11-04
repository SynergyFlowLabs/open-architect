package g0;

import androidx.compose.runtime.f4;
import androidx.compose.runtime.internal.w0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPersistentVectorBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,995:1\n34#2,4:996\n34#2,4:1000\n34#2,4:1005\n34#2,4:1009\n34#2,4:1013\n1#3:1004\n*S KotlinDebug\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n*L\n242#1:996,4\n243#1:1000,4\n480#1:1005,4\n746#1:1009,4\n769#1:1013,4\n*E\n"})
public final class i<E> extends AbstractMutableList<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.g.a<E> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f275369i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends E> f275370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Object[] f275371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private Object[] f275372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f275373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private i0.f f275374e = new i0.f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Object[] f275375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private Object[] f275376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f275377h;

    public i(@NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.g<? extends E> gVar, @Nullable Object[] objArr, @NotNull Object[] objArr2, int i10) {
        this.f275370a = gVar;
        this.f275371b = objArr;
        this.f275372c = objArr2;
        this.f275373d = i10;
        this.f275375f = this.f275371b;
        this.f275376g = this.f275372c;
        this.f275377h = this.f275370a.size();
    }

    private final Object[] A(Object[] objArr, int i10) {
        return u(objArr) ? ArraysKt.copyInto(objArr, objArr, i10, 0, 32 - i10) : ArraysKt.copyInto(objArr, B(), i10, 0, 32 - i10);
    }

    private final Object[] B() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f275374e;
        return objArr;
    }

    private final Object[] C(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f275374e;
        return objArr;
    }

    private final Object[] D(Object[] objArr, int i10, int i11) {
        if (!(i11 >= 0)) {
            f4.d("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int iA = o.a(i10, i11);
        Object obj = objArr[iA];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objD = D((Object[]) obj, i10, i11 - 5);
        if (iA < 31) {
            int i12 = iA + 1;
            if (objArr[i12] != null) {
                if (u(objArr)) {
                    ArraysKt.fill(objArr, (Object) null, i12, 32);
                }
                objArr = ArraysKt.copyInto(objArr, B(), 0, 0, i12);
            }
        }
        if (objD == objArr[iA]) {
            return objArr;
        }
        Object[] objArrW = w(objArr);
        objArrW[iA] = objD;
        return objArrW;
    }

    private final Object[] F(Object[] objArr, int i10, int i11, f fVar) {
        Object[] objArrF;
        int iA = o.a(i11 - 1, i10);
        if (i10 == 5) {
            fVar.b(objArr[iA]);
            objArrF = null;
        } else {
            Object obj = objArr[iA];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrF = F((Object[]) obj, i10 - 5, i11, fVar);
        }
        if (objArrF == null && iA == 0) {
            return null;
        }
        Object[] objArrW = w(objArr);
        objArrW[iA] = objArrF;
        return objArrW;
    }

    private final void G(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.f275375f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f275376g = objArr;
            this.f275377h = i10;
            this.f275373d = i11;
            return;
        }
        f fVar = new f(null);
        Intrinsics.checkNotNull(objArr);
        Object[] objArrF = F(objArr, i11, i10, fVar);
        Intrinsics.checkNotNull(objArrF);
        Object objA = fVar.a();
        Intrinsics.checkNotNull(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f275376g = (Object[]) objA;
        this.f275377h = i10;
        if (objArrF[1] == null) {
            this.f275375f = (Object[]) objArrF[0];
            this.f275373d = i11 - 5;
        } else {
            this.f275375f = objArrF;
            this.f275373d = i11;
        }
    }

    private final Object[] J(Object[] objArr, int i10, int i11, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            f4.d("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            f4.d("negative shift");
        }
        if (i11 == 0) {
            return it.next();
        }
        Object[] objArrW = w(objArr);
        int iA = o.a(i10, i11);
        int i12 = i11 - 5;
        objArrW[iA] = J((Object[]) objArrW[iA], i10, i12, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrW[iA] = J((Object[]) objArrW[iA], 0, i12, it);
        }
        return objArrW;
    }

    private final Object[] K(Object[] objArr, int i10, Object[][] objArr2) {
        Iterator<Object[]> itA = kotlin.jvm.internal.i.a(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f275373d;
        Object[] objArrJ = i11 < (1 << i12) ? J(objArr, i10, i12, itA) : w(objArr);
        while (itA.hasNext()) {
            this.f275373d += 5;
            objArrJ = C(objArrJ);
            int i13 = this.f275373d;
            J(objArrJ, 1 << i13, i13, itA);
        }
        return objArrJ;
    }

    private final void L(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f275373d;
        if (size > (1 << i10)) {
            this.f275375f = M(C(objArr), objArr2, this.f275373d + 5);
            this.f275376g = objArr3;
            this.f275373d += 5;
            this.f275377h = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f275375f = objArr2;
            this.f275376g = objArr3;
            this.f275377h = size() + 1;
        } else {
            this.f275375f = M(objArr, objArr2, i10);
            this.f275376g = objArr3;
            this.f275377h = size() + 1;
        }
    }

    private final Object[] M(Object[] objArr, Object[] objArr2, int i10) {
        int iA = o.a(size() - 1, i10);
        Object[] objArrW = w(objArr);
        if (i10 == 5) {
            objArrW[iA] = objArr2;
            return objArrW;
        }
        objArrW[iA] = M((Object[]) objArrW[iA], objArr2, i10 - 5);
        return objArrW;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int N(Function1<? super E, Boolean> function1, Object[] objArr, int i10, int i11, f fVar, List<Object[]> list, List<Object[]> list2) {
        if (u(objArr)) {
            list.add(objArr);
        }
        Object objA = fVar.a();
        Intrinsics.checkNotNull(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) objA;
        Object[] objArrRemove = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (!function1.invoke(obj).booleanValue()) {
                if (i11 == 32) {
                    objArrRemove = !list.isEmpty() ? list.remove(list.size() - 1) : B();
                    i11 = 0;
                }
                objArrRemove[i11] = obj;
                i11++;
            }
        }
        fVar.b(objArrRemove);
        if (objArr2 != fVar.a()) {
            list2.add(objArr2);
        }
        return i11;
    }

    private final int O(Function1<? super E, Boolean> function1, Object[] objArr, int i10, f fVar) {
        Object[] objArrW = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (function1.invoke(obj).booleanValue()) {
                if (!z10) {
                    objArrW = w(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrW[i11] = obj;
                i11++;
            }
        }
        fVar.b(objArrW);
        return i11;
    }

    private final boolean P(Function1<? super E, Boolean> function1) {
        Object[] objArrJ;
        int iM0 = m0();
        f fVar = new f(null);
        if (this.f275375f == null) {
            return R(function1, iM0, fVar) != iM0;
        }
        ListIterator<Object[]> listIteratorV = v(0);
        int iO = 32;
        while (iO == 32 && listIteratorV.hasNext()) {
            iO = O(function1, listIteratorV.next(), 32, fVar);
        }
        if (iO == 32) {
            i0.a.a(!listIteratorV.hasNext());
            int iR = R(function1, iM0, fVar);
            if (iR == 0) {
                G(this.f275375f, size(), this.f275373d);
            }
            return iR != iM0;
        }
        int iPreviousIndex = listIteratorV.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iN = iO;
        while (listIteratorV.hasNext()) {
            iN = N(function1, listIteratorV.next(), 32, iN, fVar, arrayList2, arrayList);
        }
        int iN2 = N(function1, this.f275376g, iM0, iN, fVar, arrayList2, arrayList);
        Object objA = fVar.a();
        Intrinsics.checkNotNull(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objA;
        ArraysKt.fill(objArr, (Object) null, iN2, 32);
        if (arrayList.isEmpty()) {
            objArrJ = this.f275375f;
            Intrinsics.checkNotNull(objArrJ);
        } else {
            objArrJ = J(this.f275375f, iPreviousIndex, this.f275373d, arrayList.iterator());
        }
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.f275375f = b0(objArrJ, size);
        this.f275376g = objArr;
        this.f275377h = size + iN2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    private final int R(Function1<? super E, Boolean> function1, int i10, f fVar) {
        int iO = O(function1, this.f275376g, i10, fVar);
        if (iO == i10) {
            i0.a.a(fVar.a() == this.f275376g);
            return i10;
        }
        Object objA = fVar.a();
        Intrinsics.checkNotNull(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objA;
        ArraysKt.fill(objArr, (Object) null, iO, i10);
        this.f275376g = objArr;
        this.f275377h = size() - (i10 - iO);
        return iO;
    }

    private final Object[] Y(Object[] objArr, int i10, int i11, f fVar) {
        int iA = o.a(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iA];
            Object[] objArrCopyInto = ArraysKt.copyInto(objArr, w(objArr), iA, iA + 1, 32);
            objArrCopyInto[31] = fVar.a();
            fVar.b(obj);
            return objArrCopyInto;
        }
        int iA2 = objArr[31] == null ? o.a(c0() - 1, i10) : 31;
        Object[] objArrW = w(objArr);
        int i12 = i10 - 5;
        int i13 = iA + 1;
        if (i13 <= iA2) {
            while (true) {
                Object obj2 = objArrW[iA2];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrW[iA2] = Y((Object[]) obj2, i12, 0, fVar);
                if (iA2 == i13) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrW[iA];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrW[iA] = Y((Object[]) obj3, i12, i11, fVar);
        return objArrW;
    }

    private final Object a0(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        i0.a.a(i12 < size);
        if (size == 1) {
            Object obj = this.f275376g[0];
            G(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f275376g;
        Object obj2 = objArr2[i12];
        Object[] objArrCopyInto = ArraysKt.copyInto(objArr2, w(objArr2), i12, i12 + 1, size);
        objArrCopyInto[size - 1] = null;
        this.f275375f = objArr;
        this.f275376g = objArrCopyInto;
        this.f275377h = (i10 + size) - 1;
        this.f275373d = i11;
        return obj2;
    }

    private final Object[] b0(Object[] objArr, int i10) {
        if (!((i10 & 31) == 0)) {
            f4.d("invalid size");
        }
        if (i10 == 0) {
            this.f275373d = 0;
            return null;
        }
        int i11 = i10 - 1;
        while (true) {
            int i12 = this.f275373d;
            if ((i11 >> i12) != 0) {
                return D(objArr, i11, i12);
            }
            this.f275373d = i12 - 5;
            Object[] objArr2 = objArr[0];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    private final int c0() {
        if (size() <= 32) {
            return 0;
        }
        return o.d(size());
    }

    private final Object[] d(int i10) {
        if (c0() <= i10) {
            return this.f275376g;
        }
        Object[] objArr = this.f275375f;
        Intrinsics.checkNotNull(objArr);
        for (int i11 = this.f275373d; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[o.a(i10, i11)];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] e0(Object[] objArr, int i10, int i11, E e10, f fVar) {
        int iA = o.a(i11, i10);
        Object[] objArrW = w(objArr);
        if (i10 != 0) {
            Object obj = objArrW[iA];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrW[iA] = e0((Object[]) obj, i10 - 5, i11, e10, fVar);
            return objArrW;
        }
        if (objArrW != objArr) {
            ((AbstractList) this).modCount++;
        }
        fVar.b(objArrW[iA]);
        objArrW[iA] = e10;
        return objArrW;
    }

    private final Object[] i(Object[] objArr, int i10, Iterator<? extends Object> it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    private final Object[] i0(int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f275375f == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator<Object[]> listIteratorV = v(c0() >> 5);
        while (listIteratorV.previousIndex() != i10) {
            Object[] objArrPrevious = listIteratorV.previous();
            ArraysKt.copyInto(objArrPrevious, objArr2, 0, 32 - i11, 32);
            objArr2 = A(objArrPrevious, i11);
            i12--;
            objArr[i12] = objArr2;
        }
        return listIteratorV.previous();
    }

    private final void l0(Collection<? extends E> collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrB;
        if (!(i12 >= 1)) {
            f4.d("requires at least one nullBuffer");
        }
        Object[] objArrW = w(objArr);
        objArr2[0] = objArrW;
        int i13 = i10 & 31;
        int size = ((i10 + collection.size()) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            ArraysKt.copyInto(objArrW, objArr3, size + 1, i13, i11);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrB = objArrW;
            } else {
                objArrB = B();
                i12--;
                objArr2[i12] = objArrB;
            }
            int i16 = i11 - i15;
            ArraysKt.copyInto(objArrW, objArr3, 0, i16, i11);
            ArraysKt.copyInto(objArrW, objArrB, size + 1, i13, i16);
            objArr3 = objArrB;
        }
        Iterator<? extends E> it = collection.iterator();
        i(objArrW, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            objArr2[i17] = i(B(), 0, it);
        }
        i(objArr3, 0, it);
    }

    private final int m0() {
        return n0(size());
    }

    private final int n0(int i10) {
        return i10 <= 32 ? i10 : i10 - o.d(i10);
    }

    private final void p(Collection<? extends E> collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        Object[] objArr3;
        if (this.f275375f == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        Object[] objArrI0 = i0(i13, i11, objArr, i12, objArr2);
        int iC0 = i12 - (((c0() >> 5) - 1) - i13);
        if (iC0 < i12) {
            Object[] objArr4 = objArr[iC0];
            Intrinsics.checkNotNull(objArr4);
            objArr3 = objArr4;
        } else {
            objArr3 = objArr2;
        }
        l0(collection, i10, objArrI0, 32, objArr, iC0, objArr3);
    }

    private final Object[] s(Object[] objArr, int i10, int i11, Object obj, f fVar) {
        Object obj2;
        int iA = o.a(i11, i10);
        if (i10 == 0) {
            fVar.b(objArr[31]);
            Object[] objArrCopyInto = ArraysKt.copyInto(objArr, w(objArr), iA + 1, iA, 31);
            objArrCopyInto[iA] = obj;
            return objArrCopyInto;
        }
        Object[] objArrW = w(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrW[iA];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrW[iA] = s((Object[]) obj3, i12, i11, obj, fVar);
        while (true) {
            iA++;
            if (iA >= 32 || (obj2 = objArrW[iA]) == null) {
                break;
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrW[iA] = s((Object[]) obj2, i12, 0, fVar.a(), fVar);
        }
        return objArrW;
    }

    private final void t(Object[] objArr, int i10, E e10) {
        int iM0 = m0();
        Object[] objArrW = w(this.f275376g);
        if (iM0 < 32) {
            ArraysKt.copyInto(this.f275376g, objArrW, i10 + 1, i10, iM0);
            objArrW[i10] = e10;
            this.f275375f = objArr;
            this.f275376g = objArrW;
            this.f275377h = size() + 1;
            return;
        }
        Object[] objArr2 = this.f275376g;
        Object obj = objArr2[31];
        ArraysKt.copyInto(objArr2, objArrW, i10 + 1, i10, 31);
        objArrW[i10] = e10;
        L(objArr, objArrW, C(obj));
    }

    private final boolean u(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f275374e;
    }

    private final ListIterator<Object[]> v(int i10) {
        Object[] objArr = this.f275375f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iC0 = c0() >> 5;
        i0.e.b(i10, iC0);
        int i11 = this.f275373d;
        return i11 == 0 ? new l(objArr, i10) : new n(objArr, i10, iC0, i11 / 5);
    }

    private final Object[] w(Object[] objArr) {
        if (objArr == null) {
            return B();
        }
        return u(objArr) ? objArr : ArraysKt.copyInto$default(objArr, B(), 0, 0, r.B(objArr.length, 32), 6, (Object) null);
    }

    public final boolean T(@NotNull Function1<? super E, Boolean> function1) {
        boolean zP = P(function1);
        if (zP) {
            ((AbstractList) this).modCount++;
        }
        return zP;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        ((AbstractList) this).modCount++;
        int iM0 = m0();
        if (iM0 < 32) {
            Object[] objArrW = w(this.f275376g);
            objArrW[iM0] = e10;
            this.f275376g = objArrW;
            this.f275377h = size() + 1;
        } else {
            L(this.f275375f, this.f275376g, C(e10));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM0 = m0();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iM0 >= collection.size()) {
            this.f275376g = i(w(this.f275376g), iM0, it);
            this.f275377h = size() + collection.size();
        } else {
            int size = ((collection.size() + iM0) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = i(w(this.f275376g), iM0, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = i(B(), 0, it);
            }
            this.f275375f = K(this.f275375f, c0(), objArr);
            this.f275376g = i(B(), 0, it);
            this.f275377h = size() + collection.size();
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        i0.e.a(i10, size());
        return (E) d(i10)[i10 & 31];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.f275377h;
    }

    public final void h0(int i10) {
        this.f275373d = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator();
    }

    public final int k() {
        return ((AbstractList) this).modCount;
    }

    @Nullable
    public final Object[] l() {
        return this.f275375f;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final int m() {
        return this.f275373d;
    }

    @NotNull
    public final Object[] n() {
        return this.f275376g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull final Collection<?> collection) {
        return T(new Function1() { // from class: g0.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(i.Q(collection, obj));
            }
        });
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i10) {
        i0.e.a(i10, size());
        ((AbstractList) this).modCount++;
        int iC0 = c0();
        if (i10 >= iC0) {
            return (E) a0(this.f275375f, iC0, this.f275373d, i10 - iC0);
        }
        f fVar = new f(this.f275376g[0]);
        Object[] objArr = this.f275375f;
        Intrinsics.checkNotNull(objArr);
        a0(Y(objArr, this.f275373d, i10, fVar), iC0, this.f275373d, 0);
        return (E) fVar.a();
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        i0.e.a(i10, size());
        if (c0() > i10) {
            f fVar = new f(null);
            Object[] objArr = this.f275375f;
            Intrinsics.checkNotNull(objArr);
            this.f275375f = e0(objArr, this.f275373d, i10, e10, fVar);
            return (E) fVar.a();
        }
        Object[] objArrW = w(this.f275376g);
        if (objArrW != this.f275376g) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        E e11 = (E) objArrW[i11];
        objArrW[i11] = e10;
        this.f275376g = objArrW;
        return e11;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f.a
    @NotNull
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> build() {
        g gVar;
        if (this.f275375f == this.f275371b && this.f275376g == this.f275372c) {
            gVar = this.f275370a;
        } else {
            this.f275374e = new i0.f();
            Object[] objArr = this.f275375f;
            this.f275371b = objArr;
            Object[] objArr2 = this.f275376g;
            this.f275372c = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.f275375f;
                Intrinsics.checkNotNull(objArr3);
                gVar = new g(objArr3, this.f275376g, size(), this.f275373d);
            } else if (objArr2.length == 0) {
                gVar = o.b();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.f275376g, size());
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                gVar = new m(objArrCopyOf);
            }
        }
        this.f275370a = gVar;
        return (androidx.compose.runtime.external.kotlinx.collections.immutable.g<E>) gVar;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i10) {
        i0.e.b(i10, size());
        return new k(this, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        i0.e.b(i10, size());
        if (i10 == size()) {
            add(e10);
            return;
        }
        ((AbstractList) this).modCount++;
        int iC0 = c0();
        if (i10 >= iC0) {
            t(this.f275375f, i10 - iC0, e10);
            return;
        }
        f fVar = new f(null);
        Object[] objArr = this.f275375f;
        Intrinsics.checkNotNull(objArr);
        t(s(objArr, this.f275373d, i10, e10, fVar), 0, fVar.a());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, @NotNull Collection<? extends E> collection) {
        i<E> iVar;
        Collection<? extends E> collection2;
        Object[] objArrCopyInto;
        Object[][] objArr;
        i0.e.b(i10, size());
        if (i10 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = (((size() - i11) + collection.size()) - 1) / 32;
        if (size == 0) {
            i0.a.a(i10 >= c0());
            int i12 = i10 & 31;
            int size2 = ((i10 + collection.size()) - 1) & 31;
            Object[] objArr2 = this.f275376g;
            Object[] objArrCopyInto2 = ArraysKt.copyInto(objArr2, w(objArr2), size2 + 1, i12, m0());
            i(objArrCopyInto2, i12, collection.iterator());
            this.f275376g = objArrCopyInto2;
            this.f275377h = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iM0 = m0();
        int iN0 = n0(size() + collection.size());
        if (i10 >= c0()) {
            objArrCopyInto = B();
            objArr = objArr3;
            iVar = this;
            collection2 = collection;
            iVar.l0(collection2, i10, this.f275376g, iM0, objArr, size, objArrCopyInto);
        } else {
            iVar = this;
            collection2 = collection;
            if (iN0 > iM0) {
                int i13 = iN0 - iM0;
                Object[] objArrA = iVar.A(iVar.f275376g, i13);
                iVar.p(collection2, i10, i13, objArr3, size, objArrA);
                objArr = objArr3;
                objArrCopyInto = objArrA;
            } else {
                int i14 = iM0 - iN0;
                objArrCopyInto = ArraysKt.copyInto(iVar.f275376g, iVar.B(), 0, i14, iM0);
                int i15 = 32 - i14;
                Object[] objArrA2 = iVar.A(iVar.f275376g, i15);
                int i16 = size - 1;
                objArr3[i16] = objArrA2;
                iVar.p(collection2, i10, i15, objArr3, i16, objArrA2);
                collection2 = collection2;
                objArr = objArr3;
                iVar = iVar;
            }
        }
        iVar.f275375f = iVar.K(iVar.f275375f, i11, objArr);
        iVar.f275376g = objArrCopyInto;
        iVar.f275377h = iVar.size() + collection2.size();
        return true;
    }
}
