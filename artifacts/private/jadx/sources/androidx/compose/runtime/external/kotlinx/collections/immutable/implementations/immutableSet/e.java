package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.w0;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,851:1\n54#2,13:852\n50#2,17:865\n50#2,17:882\n50#2,10:918\n60#2,7:929\n50#2,10:945\n60#2,7:956\n10#3,5:899\n15#3,4:905\n10#3,9:909\n10#3,9:936\n10#3,9:965\n1#4:904\n53#5:928\n53#5:955\n12371#6,2:963\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n297#1:852,13\n324#1:865,17\n347#1:882,17\n594#1:918,10\n594#1:929,7\n701#1:945,10\n701#1:956,7\n423#1:899,5\n423#1:905,4\n525#1:909,9\n621#1:936,9\n717#1:965,9\n594#1:928\n701#1:955\n710#1:963,2\n*E\n"})
public final class e<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f35702d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f35703e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final e f35704f = new e(0, new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private Object[] f35706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private i0.f f35707c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final e a() {
            return e.f35704f;
        }

        private a() {
        }
    }

    public e(int i10, @NotNull Object[] objArr, @Nullable i0.f fVar) {
        this.f35705a = i10;
        this.f35706b = objArr;
        this.f35707c = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object A(e<E> eVar, i0.b bVar, i0.f fVar) {
        if (this == eVar) {
            bVar.e(this.f35706b.length);
            return f35704f;
        }
        Object[] objArr = Intrinsics.areEqual(fVar, this.f35707c) ? this.f35706b : new Object[this.f35706b.length];
        Object[] objArr2 = this.f35706b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= objArr2.length) {
                break;
            }
            i0.a.a(i11 <= i10);
            if (!eVar.f(objArr2[i10])) {
                objArr[i11] = objArr2[i10];
                i11++;
                i0.a.a(i11 <= objArr.length);
            }
            i10++;
        }
        bVar.e(this.f35706b.length - i11);
        if (i11 == 0) {
            return f35704f;
        }
        if (i11 == 1) {
            return objArr[0];
        }
        if (i11 == this.f35706b.length) {
            return this;
        }
        if (i11 == objArr.length) {
            return new e(0, objArr, fVar);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return new e(0, objArrCopyOf, fVar);
    }

    private final e<E> B(int i10, i0.f fVar) {
        if (this.f35707c != fVar) {
            return new e<>(0, g.g(this.f35706b, i10), fVar);
        }
        this.f35706b = g.g(this.f35706b, i10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object C(e<E> eVar, i0.b bVar, i0.f fVar) {
        if (this == eVar) {
            bVar.e(this.f35706b.length);
            return this;
        }
        Object[] objArr = Intrinsics.areEqual(fVar, this.f35707c) ? this.f35706b : new Object[Math.min(this.f35706b.length, eVar.f35706b.length)];
        Object[] objArr2 = this.f35706b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= objArr2.length) {
                break;
            }
            i0.a.a(i11 <= i10);
            if (eVar.f(objArr2[i10])) {
                objArr[i11] = objArr2[i10];
                i11++;
                if (i11 > objArr.length) {
                    z10 = false;
                }
                i0.a.a(z10);
            }
            i10++;
        }
        bVar.e(i11);
        if (i11 == 0) {
            return f35704f;
        }
        if (i11 == 1) {
            return objArr[0];
        }
        if (i11 == this.f35706b.length) {
            return this;
        }
        if (i11 == eVar.f35706b.length) {
            return eVar;
        }
        if (i11 == objArr.length) {
            return new e(0, objArr, fVar);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return new e(0, objArrCopyOf, fVar);
    }

    private final e<E> D(int i10, int i11, E e10, int i12, i0.f fVar) {
        if (this.f35707c == fVar) {
            this.f35706b[i10] = s(i10, i11, e10, i12, fVar);
            return this;
        }
        Object[] objArr = this.f35706b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = s(i10, i11, e10, i12, fVar);
        return new e<>(this.f35705a, objArrCopyOf, fVar);
    }

    private final e<E> G(int i10, int i11, i0.f fVar) {
        if (this.f35707c != fVar) {
            return new e<>(this.f35705a ^ i11, g.g(this.f35706b, i10), fVar);
        }
        this.f35706b = g.g(this.f35706b, i10);
        this.f35705a ^= i11;
        return this;
    }

    private final e<E> I(int i10, e<E> eVar, i0.f fVar) {
        Object[] objArr = eVar.f35706b;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof e)) {
                if (this.f35706b.length == 1) {
                    eVar.f35705a = this.f35705a;
                    return eVar;
                }
                eVar = (e<E>) obj;
            }
        }
        if (this.f35707c == fVar) {
            this.f35706b[i10] = eVar;
            return this;
        }
        Object[] objArr2 = this.f35706b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = eVar;
        return new e<>(this.f35705a, objArrCopyOf, fVar);
    }

    private final e<E> J(int i10) {
        Object obj = this.f35706b[i10];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (e) obj;
    }

    private final e<E> L(int i10, int i11) {
        return new e<>(this.f35705a ^ i11, g.g(this.f35706b, i10));
    }

    private final e<E> P(int i10, e<E> eVar) {
        Object[] objArr = eVar.f35706b;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof e)) {
                if (this.f35706b.length == 1) {
                    eVar.f35705a = this.f35705a;
                    return eVar;
                }
                eVar = (e<E>) obj;
            }
        }
        Object[] objArr2 = this.f35706b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = eVar;
        return new e<>(this.f35705a, objArrCopyOf);
    }

    private final e<E> c(int i10, E e10) {
        return new e<>(this.f35705a | i10, g.c(this.f35706b, q(i10), e10));
    }

    private final int d() {
        if (this.f35705a == 0) {
            return this.f35706b.length;
        }
        int iD = 0;
        for (Object obj : this.f35706b) {
            iD += obj instanceof e ? ((e) obj).d() : 1;
        }
        return iD;
    }

    private final e<E> e(E e10) {
        return f(e10) ? this : new e<>(0, g.c(this.f35706b, 0, e10));
    }

    private final boolean f(E e10) {
        return ArraysKt.contains((E[]) this.f35706b, e10);
    }

    private final e<E> g(E e10) {
        int iIndexOf = ArraysKt.indexOf((E[]) this.f35706b, e10);
        if (iIndexOf != -1) {
            this = h(iIndexOf);
        }
        return this;
    }

    private final e<E> h(int i10) {
        return new e<>(0, g.g(this.f35706b, i10));
    }

    private final E k(int i10) {
        return (E) this.f35706b[i10];
    }

    private final boolean l(e<E> eVar) {
        if (this == eVar) {
            return true;
        }
        if (this.f35705a != eVar.f35705a) {
            return false;
        }
        int length = this.f35706b.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f35706b[i10] != eVar.f35706b[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean p(int i10) {
        return (this.f35705a & i10) == 0;
    }

    private final e<E> r(int i10, E e10, int i11, E e11, int i12, i0.f fVar) {
        if (i12 > 30) {
            return new e<>(0, new Object[]{e10, e11}, fVar);
        }
        int iF = g.f(i10, i12);
        int iF2 = g.f(i11, i12);
        if (iF != iF2) {
            return new e<>((1 << iF) | (1 << iF2), iF < iF2 ? new Object[]{e10, e11} : new Object[]{e11, e10}, fVar);
        }
        return new e<>(1 << iF, new Object[]{r(i10, e10, i11, e11, i12 + 5, fVar)}, fVar);
    }

    private final e<E> s(int i10, int i11, E e10, int i12, i0.f fVar) {
        E eK = k(i10);
        return r(eK != null ? eK.hashCode() : 0, eK, i11, e10, i12 + 5, fVar);
    }

    private final e<E> t(int i10, int i11, E e10, int i12) {
        Object[] objArr = this.f35706b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = s(i10, i11, e10, i12, null);
        return new e<>(this.f35705a, objArrCopyOf);
    }

    private final e<E> w(int i10, E e10, i0.f fVar) {
        int iQ = q(i10);
        if (this.f35707c != fVar) {
            return new e<>(this.f35705a | i10, g.c(this.f35706b, iQ, e10), fVar);
        }
        this.f35706b = g.c(this.f35706b, iQ, e10);
        this.f35705a = i10 | this.f35705a;
        return this;
    }

    private final e<E> x(E e10, b<?> bVar) {
        if (f(e10)) {
            return this;
        }
        bVar.m(bVar.size() + 1);
        if (this.f35707c != bVar.l()) {
            return new e<>(0, g.c(this.f35706b, 0, e10), bVar.l());
        }
        this.f35706b = g.c(this.f35706b, 0, e10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final e<E> y(e<E> eVar, i0.b bVar, i0.f fVar) {
        if (this == eVar) {
            bVar.e(this.f35706b.length);
            return this;
        }
        Object[] objArr = this.f35706b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + eVar.f35706b.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        Object[] objArr2 = eVar.f35706b;
        int length = this.f35706b.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < objArr2.length) {
            i0.a.a(i11 <= i10);
            if (!f(objArr2[i10])) {
                objArrCopyOf[length + i11] = objArr2[i10];
                i11++;
                i0.a.a(length + i11 <= objArrCopyOf.length);
            }
            i10++;
        }
        int length2 = i11 + this.f35706b.length;
        bVar.e(objArrCopyOf.length - length2);
        if (length2 == this.f35706b.length) {
            return this;
        }
        if (length2 == eVar.f35706b.length) {
            return eVar;
        }
        if (length2 != objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        }
        if (!Intrinsics.areEqual(this.f35707c, fVar)) {
            return new e<>(0, objArrCopyOf, fVar);
        }
        this.f35706b = objArrCopyOf;
        return this;
    }

    private final e<E> z(E e10, b<?> bVar) {
        int iIndexOf = ArraysKt.indexOf((E[]) this.f35706b, e10);
        if (iIndexOf == -1) {
            return this;
        }
        bVar.m(bVar.size() - 1);
        return B(iIndexOf, bVar.l());
    }

    @NotNull
    public final e<E> E(int i10, E e10, int i11, @NotNull b<?> bVar) {
        int iF = 1 << g.f(i10, i11);
        if (p(iF)) {
            return this;
        }
        int iQ = q(iF);
        Object obj = this.f35706b[iQ];
        if (obj instanceof e) {
            e<E> eVarJ = J(iQ);
            e<E> eVarZ = i11 == 30 ? eVarJ.z(e10, bVar) : eVarJ.E(i10, e10, i11 + 5, bVar);
            return (this.f35707c == bVar.l() || eVarJ != eVarZ) ? I(iQ, eVarZ, bVar.l()) : this;
        }
        if (!Intrinsics.areEqual(e10, obj)) {
            return this;
        }
        bVar.m(bVar.size() - 1);
        return G(iQ, iF, bVar.l());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object F(@NotNull e<E> eVar, int i10, @NotNull i0.b bVar, @NotNull b<?> bVar2) {
        e<E> eVar2;
        if (this == eVar) {
            bVar.e(d());
            return f35704f;
        }
        if (i10 > 30) {
            return A(eVar, bVar, bVar2.l());
        }
        int i11 = this.f35705a & eVar.f35705a;
        if (i11 != 0) {
            if (Intrinsics.areEqual(this.f35707c, bVar2.l())) {
                eVar2 = this;
            } else {
                int i12 = this.f35705a;
                Object[] objArr = this.f35706b;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                eVar2 = new e<>(i12, objArrCopyOf, bVar2.l());
            }
            int i13 = this.f35705a;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                int iQ = q(iLowestOneBit);
                int iQ2 = eVar.q(iLowestOneBit);
                Object objF = this.f35706b[iQ];
                Object obj = eVar.f35706b[iQ2];
                boolean z10 = objF instanceof e;
                boolean z11 = obj instanceof e;
                if (z10 && z11) {
                    Intrinsics.checkNotNull(objF, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    objF = ((e) objF).F((e) obj, i10 + 5, bVar, bVar2);
                } else if (z10) {
                    Intrinsics.checkNotNull(objF, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    e eVar3 = (e) objF;
                    int size = bVar2.size();
                    e eVarE = eVar3.E(obj != null ? obj.hashCode() : 0, obj, i10 + 5, bVar2);
                    if (size != bVar2.size()) {
                        bVar.e(1);
                        Object[] objArr2 = eVarE.f35706b;
                        if (objArr2.length == 1) {
                            objF = objArr2[0];
                            if (objF instanceof e) {
                                objF = eVarE;
                            }
                        } else {
                            objF = eVarE;
                        }
                    }
                } else if (z11) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    if (((e) obj).i(objF != null ? objF.hashCode() : 0, objF, i10 + 5)) {
                        bVar.e(1);
                        objF = f35704f;
                    }
                } else if (Intrinsics.areEqual(objF, obj)) {
                    bVar.e(1);
                    objF = f35704f;
                }
                if (objF == f35704f) {
                    i13 ^= iLowestOneBit;
                }
                eVar2.f35706b[iQ] = objF;
                i11 ^= iLowestOneBit;
            }
            int iBitCount = Integer.bitCount(i13);
            if (i13 == 0) {
                return f35704f;
            }
            if (i13 != this.f35705a) {
                if (iBitCount == 1 && i10 != 0) {
                    Object obj2 = eVar2.f35706b[eVar2.q(i13)];
                    return obj2 instanceof e ? new e(i13, new Object[]{obj2}, bVar2.l()) : obj2;
                }
                Object[] objArr3 = new Object[iBitCount];
                Object[] objArr4 = eVar2.f35706b;
                int i14 = 0;
                int i15 = 0;
                while (i14 < objArr4.length) {
                    i0.a.a(i15 <= i14);
                    if (objArr4[i14] != f35702d.a()) {
                        objArr3[i15] = objArr4[i14];
                        i15++;
                        i0.a.a(i15 <= iBitCount);
                    }
                    i14++;
                }
                return new e(i13, objArr3, bVar2.l());
            }
            if (!eVar2.l(this)) {
                return eVar2;
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object H(@NotNull e<E> eVar, int i10, @NotNull i0.b bVar, @NotNull b<?> bVar2) {
        if (this == eVar) {
            bVar.e(d());
            return this;
        }
        if (i10 > 30) {
            return C(eVar, bVar, bVar2.l());
        }
        int i11 = this.f35705a & eVar.f35705a;
        if (i11 == 0) {
            return f35704f;
        }
        e<E> eVar2 = (Intrinsics.areEqual(this.f35707c, bVar2.l()) && i11 == this.f35705a) ? this : new e<>(i11, new Object[Integer.bitCount(i11)], bVar2.l());
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            int iQ = q(iLowestOneBit);
            int iQ2 = eVar.q(iLowestOneBit);
            Object objH = this.f35706b[iQ];
            Object obj = eVar.f35706b[iQ2];
            boolean z10 = objH instanceof e;
            boolean z11 = obj instanceof e;
            if (z10 && z11) {
                Intrinsics.checkNotNull(objH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                objH = ((e) objH).H((e) obj, i10 + 5, bVar, bVar2);
            } else if (z10) {
                Intrinsics.checkNotNull(objH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (((e) objH).i(obj != null ? obj.hashCode() : 0, obj, i10 + 5)) {
                    bVar.e(1);
                    objH = obj;
                } else {
                    objH = f35704f;
                }
            } else if (z11) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (((e) obj).i(objH != null ? objH.hashCode() : 0, objH, i10 + 5)) {
                    bVar.e(1);
                } else {
                    objH = f35704f;
                }
            } else if (Intrinsics.areEqual(objH, obj)) {
                bVar.e(1);
            } else {
                objH = f35704f;
            }
            if (objH != f35704f) {
                i13 |= iLowestOneBit;
            }
            eVar2.f35706b[i14] = objH;
            i14++;
            i12 ^= iLowestOneBit;
        }
        int iBitCount = Integer.bitCount(i13);
        if (i13 == 0) {
            return f35704f;
        }
        if (i13 == i11) {
            if (eVar2.l(this)) {
                return this;
            }
            return eVar2.l(eVar) ? eVar : eVar2;
        }
        if (iBitCount == 1 && i10 != 0) {
            Object obj2 = eVar2.f35706b[eVar2.q(i13)];
            return obj2 instanceof e ? new e(i13, new Object[]{obj2}, bVar2.l()) : obj2;
        }
        Object[] objArr = new Object[iBitCount];
        Object[] objArr2 = eVar2.f35706b;
        int i15 = 0;
        int i16 = 0;
        while (i15 < objArr2.length) {
            i0.a.a(i16 <= i15);
            if (objArr2[i15] != f35702d.a()) {
                objArr[i16] = objArr2[i15];
                i16++;
                i0.a.a(i16 <= iBitCount);
            }
            i15++;
        }
        return new e(i13, objArr, bVar2.l());
    }

    @NotNull
    public final e<E> K(int i10, E e10, int i11) {
        int iF = 1 << g.f(i10, i11);
        if (p(iF)) {
            return this;
        }
        int iQ = q(iF);
        Object obj = this.f35706b[iQ];
        if (!(obj instanceof e)) {
            return Intrinsics.areEqual(e10, obj) ? L(iQ, iF) : this;
        }
        e<E> eVarJ = J(iQ);
        e<E> eVarG = i11 == 30 ? eVarJ.g(e10) : eVarJ.K(i10, e10, i11 + 5);
        return eVarJ == eVarG ? this : P(iQ, eVarG);
    }

    public final void M(int i10) {
        this.f35705a = i10;
    }

    public final void N(@NotNull Object[] objArr) {
        this.f35706b = objArr;
    }

    public final void O(@Nullable i0.f fVar) {
        this.f35707c = fVar;
    }

    @NotNull
    public final e<E> b(int i10, E e10, int i11) {
        int iF = 1 << g.f(i10, i11);
        if (p(iF)) {
            return c(iF, e10);
        }
        int iQ = q(iF);
        Object obj = this.f35706b[iQ];
        if (obj instanceof e) {
            e<E> eVarJ = J(iQ);
            e<E> eVarE = i11 == 30 ? eVarJ.e(e10) : eVarJ.b(i10, e10, i11 + 5);
            if (eVarJ != eVarE) {
                return P(iQ, eVarE);
            }
        } else if (!Intrinsics.areEqual(e10, obj)) {
            return t(iQ, i10, e10, i11);
        }
        return this;
    }

    public final boolean i(int i10, E e10, int i11) {
        int iF = 1 << g.f(i10, i11);
        if (p(iF)) {
            return false;
        }
        int iQ = q(iF);
        Object obj = this.f35706b[iQ];
        if (!(obj instanceof e)) {
            return Intrinsics.areEqual(e10, obj);
        }
        e<E> eVarJ = J(iQ);
        return i11 == 30 ? eVarJ.f(e10) : eVarJ.i(i10, e10, i11 + 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(@NotNull e<E> eVar, int i10) {
        if (this == eVar) {
            return true;
        }
        if (i10 > 30) {
            for (Object obj : eVar.f35706b) {
                if (!ArraysKt.contains(this.f35706b, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i11 = this.f35705a;
        int i12 = eVar.f35705a;
        int i13 = i11 & i12;
        if (i13 != i12) {
            return false;
        }
        while (i13 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i13);
            int iQ = q(iLowestOneBit);
            int iQ2 = eVar.q(iLowestOneBit);
            Object obj2 = this.f35706b[iQ];
            Object obj3 = eVar.f35706b[iQ2];
            boolean z10 = obj2 instanceof e;
            boolean z11 = obj3 instanceof e;
            if (z10 && z11) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!((e) obj2).j((e) obj3, i10 + 5)) {
                    return false;
                }
            } else if (z10) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!((e) obj2).i(obj3 != null ? obj3.hashCode() : 0, obj3, i10 + 5)) {
                    return false;
                }
            } else if (z11 || !Intrinsics.areEqual(obj2, obj3)) {
                return false;
            }
            i13 ^= iLowestOneBit;
        }
        return true;
    }

    public final int m() {
        return this.f35705a;
    }

    @NotNull
    public final Object[] n() {
        return this.f35706b;
    }

    @Nullable
    public final i0.f o() {
        return this.f35707c;
    }

    public final int q(int i10) {
        return Integer.bitCount(this.f35705a & (i10 - 1));
    }

    @NotNull
    public final e<E> u(int i10, E e10, int i11, @NotNull b<?> bVar) {
        int iF = 1 << g.f(i10, i11);
        if (p(iF)) {
            bVar.m(bVar.size() + 1);
            return w(iF, e10, bVar.l());
        }
        int iQ = q(iF);
        Object obj = this.f35706b[iQ];
        if (obj instanceof e) {
            e<E> eVarJ = J(iQ);
            e<E> eVarX = i11 == 30 ? eVarJ.x(e10, bVar) : eVarJ.u(i10, e10, i11 + 5, bVar);
            if (eVarJ != eVarX) {
                return I(iQ, eVarX, bVar.l());
            }
        } else if (!Intrinsics.areEqual(e10, obj)) {
            bVar.m(bVar.size() + 1);
            return D(iQ, i10, e10, i11, bVar.l());
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final e<E> v(@NotNull e<E> eVar, int i10, @NotNull i0.b bVar, @NotNull b<?> bVar2) {
        Object objR;
        Object[] objArr;
        if (this == eVar) {
            bVar.f(bVar.d() + d());
            return this;
        }
        if (i10 > 30) {
            return y(eVar, bVar, bVar2.l());
        }
        int i11 = this.f35705a;
        int i12 = eVar.f35705a | i11;
        e<E> eVar2 = (i12 == i11 && Intrinsics.areEqual(this.f35707c, bVar2.l())) ? this : new e<>(i12, new Object[Integer.bitCount(i12)], bVar2.l());
        int i13 = i12;
        int i14 = 0;
        while (i13 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i13);
            int iQ = q(iLowestOneBit);
            int iQ2 = eVar.q(iLowestOneBit);
            Object[] objArr2 = eVar2.f35706b;
            if (p(iLowestOneBit)) {
                objR = eVar.f35706b[iQ2];
            } else if (eVar.p(iLowestOneBit)) {
                objR = this.f35706b[iQ];
            } else {
                objR = this.f35706b[iQ];
                Object obj = eVar.f35706b[iQ2];
                boolean z10 = objR instanceof e;
                boolean z11 = obj instanceof e;
                if (z10 && z11) {
                    Intrinsics.checkNotNull(objR, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    objR = ((e) objR).v((e) obj, i10 + 5, bVar, bVar2);
                } else if (z10) {
                    Intrinsics.checkNotNull(objR, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    e eVar3 = (e) objR;
                    int size = bVar2.size();
                    objR = eVar3.u(obj != null ? obj.hashCode() : 0, obj, i10 + 5, bVar2);
                    if (bVar2.size() == size) {
                        bVar.f(bVar.d() + 1);
                    }
                    Unit unit = Unit.f312394a;
                } else if (z11) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    e eVar4 = (e) obj;
                    int size2 = bVar2.size();
                    objR = eVar4.u(objR != null ? objR.hashCode() : 0, objR, i10 + 5, bVar2);
                    if (bVar2.size() == size2) {
                        bVar.f(bVar.d() + 1);
                    }
                    Unit unit2 = Unit.f312394a;
                } else {
                    if (Intrinsics.areEqual(objR, obj)) {
                        bVar.f(bVar.d() + 1);
                        Unit unit3 = Unit.f312394a;
                    } else {
                        objArr = objArr2;
                        objR = r(objR != null ? objR.hashCode() : 0, objR, obj != null ? obj.hashCode() : 0, obj, i10 + 5, bVar2.l());
                    }
                    objArr[i14] = objR;
                    i14++;
                    i13 ^= iLowestOneBit;
                }
            }
            objArr = objArr2;
            objArr[i14] = objR;
            i14++;
            i13 ^= iLowestOneBit;
        }
        if (l(eVar2)) {
            return this;
        }
        return eVar.l(eVar2) ? eVar : eVar2;
    }

    public e(int i10, @NotNull Object[] objArr) {
        this(i10, objArr, null);
    }
}
