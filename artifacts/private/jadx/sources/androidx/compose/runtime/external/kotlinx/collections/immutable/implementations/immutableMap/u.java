package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.f4;
import androidx.compose.runtime.internal.w0;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n10#2,9:900\n10#2,9:913\n10#2,9:922\n58#3,4:909\n84#4:931\n1#5:932\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n630#1:900,9\n648#1:913,9\n652#1:922,9\n640#1:909,4\n700#1:931\n700#1:932\n*E\n"})
public final class u<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f35659e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f35660f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final u f35661g = new u(0, 0, new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final i0.f f35664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Object[] f35665d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final u a() {
            return u.f35661g;
        }

        private a() {
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n1#2:900\n*E\n"})
    public static final class b<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f35666c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private u<K, V> f35667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f35668b;

        public b(@NotNull u<K, V> uVar, int i10) {
            this.f35667a = uVar;
            this.f35668b = i10;
        }

        @NotNull
        public final u<K, V> a() {
            return this.f35667a;
        }

        public final int b() {
            return this.f35668b;
        }

        @NotNull
        public final b<K, V> c(@NotNull Function1<? super u<K, V>, u<K, V>> function1) {
            d(function1.invoke(a()));
            return this;
        }

        public final void d(@NotNull u<K, V> uVar) {
            this.f35667a = uVar;
        }
    }

    public u(int i10, int i11, @NotNull Object[] objArr, @Nullable i0.f fVar) {
        this.f35662a = i10;
        this.f35663b = i11;
        this.f35664c = fVar;
        this.f35665d = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final u<K, V> A(u<K, V> uVar, i0.b bVar, i0.f fVar) {
        boolean z10 = false;
        i0.a.a(this.f35663b == 0);
        i0.a.a(this.f35662a == 0);
        i0.a.a(uVar.f35663b == 0);
        i0.a.a(uVar.f35662a == 0);
        Object[] objArr = this.f35665d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + uVar.f35665d.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        int length = this.f35665d.length;
        kotlin.ranges.j jVarB1 = kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, uVar.f35665d.length), 2);
        int iL = jVarB1.l();
        int iM = jVarB1.m();
        int iN = jVarB1.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            while (true) {
                if (h(uVar.f35665d[iL])) {
                    bVar.f(bVar.d() + 1);
                } else {
                    Object[] objArr2 = uVar.f35665d;
                    objArrCopyOf[length] = objArr2[iL];
                    objArrCopyOf[length + 1] = objArr2[iL + 1];
                    length += 2;
                }
                if (iL == iM) {
                    break;
                }
                iL += iN;
            }
        }
        if (length == this.f35665d.length) {
            return this;
        }
        if (length == uVar.f35665d.length) {
            return uVar;
        }
        if (length == objArrCopyOf.length) {
            return new u<>(0, 0, objArrCopyOf, fVar);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        return new u<>(0, 0, objArrCopyOf2, fVar);
    }

    private final u<K, V> B(K k10, f<K, V> fVar) {
        kotlin.ranges.j jVarB1 = kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, this.f35665d.length), 2);
        int iL = jVarB1.l();
        int iM = jVarB1.m();
        int iN = jVarB1.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            while (!Intrinsics.areEqual(k10, w(iL))) {
                if (iL != iM) {
                    iL += iN;
                }
            }
            return D(iL, fVar);
        }
        return this;
    }

    private final u<K, V> C(K k10, V v10, f<K, V> fVar) {
        int i10 = 4 | 0;
        kotlin.ranges.j jVarB1 = kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, this.f35665d.length), 2);
        int iL = jVarB1.l();
        int iM = jVarB1.m();
        int iN = jVarB1.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            while (true) {
                if (Intrinsics.areEqual(k10, w(iL)) && Intrinsics.areEqual(v10, a0(iL))) {
                    return D(iL, fVar);
                }
                if (iL != iM) {
                    iL += iN;
                }
            }
        }
        return this;
    }

    private final u<K, V> D(int i10, f<K, V> fVar) {
        fVar.j(fVar.size() - 1);
        fVar.h(a0(i10));
        if (this.f35665d.length == 2) {
            return null;
        }
        if (this.f35664c != fVar.e()) {
            return new u<>(0, 0, y.h(this.f35665d, i10), fVar.e());
        }
        this.f35665d = y.h(this.f35665d, i10);
        return this;
    }

    private final u<K, V> E(int i10, K k10, V v10, i0.f fVar) {
        int iQ = q(i10);
        if (this.f35664c != fVar) {
            return new u<>(i10 | this.f35662a, this.f35663b, y.g(this.f35665d, iQ, k10, v10), fVar);
        }
        this.f35665d = y.g(this.f35665d, iQ, k10, v10);
        this.f35662a = i10 | this.f35662a;
        return this;
    }

    private final u<K, V> F(int i10, int i11, int i12, K k10, V v10, int i13, i0.f fVar) {
        if (this.f35664c != fVar) {
            return new u<>(this.f35662a ^ i11, this.f35663b | i11, f(i10, i11, i12, k10, v10, i13, fVar), fVar);
        }
        this.f35665d = f(i10, i11, i12, k10, v10, i13, fVar);
        this.f35662a ^= i11;
        this.f35663b |= i11;
        return this;
    }

    private final u<K, V> I(u<K, V> uVar, int i10, int i11, i0.b bVar, f<K, V> fVar) {
        if (u(i10)) {
            u<K, V> uVarQ = Q(R(i10));
            if (uVar.u(i10)) {
                return uVarQ.H(uVar.Q(uVar.R(i10)), i11 + 5, bVar, fVar);
            }
            if (!uVar.t(i10)) {
                return uVarQ;
            }
            int iQ = uVar.q(i10);
            K kW = uVar.w(iQ);
            V vA0 = uVar.a0(iQ);
            int size = fVar.size();
            u<K, V> uVarG = uVarQ.G(kW != null ? kW.hashCode() : 0, kW, vA0, i11 + 5, fVar);
            if (fVar.size() == size) {
                bVar.f(bVar.d() + 1);
            }
            return uVarG;
        }
        if (!uVar.u(i10)) {
            int iQ2 = q(i10);
            K kW2 = w(iQ2);
            V vA1 = a0(iQ2);
            int iQ3 = uVar.q(i10);
            K kW3 = uVar.w(iQ3);
            return x(kW2 != null ? kW2.hashCode() : 0, kW2, vA1, kW3 != null ? kW3.hashCode() : 0, kW3, uVar.a0(iQ3), i11 + 5, fVar.e());
        }
        u<K, V> uVarQ2 = uVar.Q(uVar.R(i10));
        if (!t(i10)) {
            return uVarQ2;
        }
        int iQ4 = q(i10);
        K kW4 = w(iQ4);
        int i12 = i11 + 5;
        if (!uVarQ2.n(kW4 != null ? kW4.hashCode() : 0, kW4, i12)) {
            return uVarQ2.G(kW4 != null ? kW4.hashCode() : 0, kW4, a0(iQ4), i12, fVar);
        }
        bVar.f(bVar.d() + 1);
        return uVarQ2;
    }

    private final u<K, V> L(int i10, int i11, f<K, V> fVar) {
        fVar.j(fVar.size() - 1);
        fVar.h(a0(i10));
        if (this.f35665d.length == 2) {
            return null;
        }
        if (this.f35664c != fVar.e()) {
            return new u<>(i11 ^ this.f35662a, this.f35663b, y.h(this.f35665d, i10), fVar.e());
        }
        this.f35665d = y.h(this.f35665d, i10);
        this.f35662a ^= i11;
        return this;
    }

    private final u<K, V> M(int i10, int i11, i0.f fVar) {
        Object[] objArr = this.f35665d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f35664c != fVar) {
            return new u<>(this.f35662a, this.f35663b ^ i11, y.i(objArr, i10), fVar);
        }
        this.f35665d = y.i(objArr, i10);
        this.f35663b ^= i11;
        return this;
    }

    private final u<K, V> N(u<K, V> uVar, u<K, V> uVar2, int i10, int i11, i0.f fVar) {
        if (uVar2 == null) {
            return M(i10, i11, fVar);
        }
        return (this.f35664c == fVar || uVar != uVar2) ? O(i10, uVar2, fVar) : this;
    }

    private final u<K, V> O(int i10, u<K, V> uVar, i0.f fVar) {
        Object[] objArr = this.f35665d;
        if (objArr.length == 1 && uVar.f35665d.length == 2 && uVar.f35663b == 0) {
            uVar.f35662a = this.f35663b;
            return uVar;
        }
        if (this.f35664c == fVar) {
            objArr[i10] = uVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = uVar;
        return new u<>(this.f35662a, this.f35663b, objArrCopyOf, fVar);
    }

    private final u<K, V> P(int i10, V v10, f<K, V> fVar) {
        if (this.f35664c == fVar.e()) {
            this.f35665d[i10 + 1] = v10;
            return this;
        }
        fVar.f(fVar.b() + 1);
        Object[] objArr = this.f35665d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 + 1] = v10;
        return new u<>(this.f35662a, this.f35663b, objArrCopyOf, fVar.e());
    }

    private final u<K, V> V(int i10, int i11) {
        Object[] objArr = this.f35665d;
        if (objArr.length == 2) {
            return null;
        }
        return new u<>(i11 ^ this.f35662a, this.f35663b, y.h(objArr, i10));
    }

    private final u<K, V> W(int i10, int i11) {
        Object[] objArr = this.f35665d;
        if (objArr.length == 1) {
            return null;
        }
        return new u<>(this.f35662a, this.f35663b ^ i11, y.i(objArr, i10));
    }

    private final u<K, V> X(u<K, V> uVar, u<K, V> uVar2, int i10, int i11) {
        if (uVar2 == null) {
            return W(i10, i11);
        }
        return uVar != uVar2 ? Y(i10, i11, uVar2) : this;
    }

    private final u<K, V> Y(int i10, int i11, u<K, V> uVar) {
        Object[] objArr = uVar.f35665d;
        if (objArr.length != 2 || uVar.f35663b != 0) {
            Object[] objArr2 = this.f35665d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i10] = uVar;
            return new u<>(this.f35662a, this.f35663b, objArrCopyOf);
        }
        if (this.f35665d.length == 1) {
            uVar.f35662a = this.f35663b;
            return uVar;
        }
        return new u<>(this.f35662a ^ i11, this.f35663b ^ i11, y.k(this.f35665d, i10, q(i11), objArr[0], objArr[1]));
    }

    private final u<K, V> Z(int i10, V v10) {
        Object[] objArr = this.f35665d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 + 1] = v10;
        return new u<>(this.f35662a, this.f35663b, objArrCopyOf);
    }

    private final void a(pj.p<? super u<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> pVar, int i10, int i11) {
        pVar.invoke(this, Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.f35662a), Integer.valueOf(this.f35663b));
        int i12 = this.f35663b;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            Q(R(iLowestOneBit)).a(pVar, (Integer.numberOfTrailingZeros(iLowestOneBit) << i11) + i10, i11 + 5);
            i12 -= iLowestOneBit;
        }
    }

    private final V a0(int i10) {
        return (V) this.f35665d[i10 + 1];
    }

    private final b<K, V> d() {
        return new b<>(this, 1);
    }

    private final b<K, V> e() {
        return new b<>(this, 0);
    }

    private final Object[] f(int i10, int i11, int i12, K k10, V v10, int i13, i0.f fVar) {
        K kW = w(i10);
        return y.j(this.f35665d, i10, R(i11) + 1, x(kW != null ? kW.hashCode() : 0, kW, a0(i10), i12, k10, v10, i13 + 5, fVar));
    }

    private final int g() {
        if (this.f35663b == 0) {
            return this.f35665d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f35662a);
        int length = this.f35665d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += Q(i10).g();
        }
        return iBitCount;
    }

    private final boolean h(K k10) {
        kotlin.ranges.j jVarB1 = kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, this.f35665d.length), 2);
        int iL = jVarB1.l();
        int iM = jVarB1.m();
        int iN = jVarB1.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            while (!Intrinsics.areEqual(k10, this.f35665d[iL])) {
                if (iL != iM) {
                    iL += iN;
                }
            }
            return true;
        }
        return false;
    }

    private final V i(K k10) {
        kotlin.ranges.j jVarB1 = kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, this.f35665d.length), 2);
        int iL = jVarB1.l();
        int iM = jVarB1.m();
        int iN = jVarB1.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            while (!Intrinsics.areEqual(k10, w(iL))) {
                if (iL != iM) {
                    iL += iN;
                }
            }
            return a0(iL);
        }
        return null;
    }

    private final b<K, V> j(K k10, V v10) {
        kotlin.ranges.j jVarB1 = kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, this.f35665d.length), 2);
        int iL = jVarB1.l();
        int iM = jVarB1.m();
        int iN = jVarB1.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            while (!Intrinsics.areEqual(k10, w(iL))) {
                if (iL != iM) {
                    iL += iN;
                }
            }
            if (v10 == a0(iL)) {
                return null;
            }
            Object[] objArr = this.f35665d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iL + 1] = v10;
            return new u(0, 0, objArrCopyOf).e();
        }
        return new u(0, 0, y.g(this.f35665d, 0, k10, v10)).d();
    }

    private final u<K, V> k(K k10) {
        kotlin.ranges.j jVarB1 = kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, this.f35665d.length), 2);
        int iL = jVarB1.l();
        int iM = jVarB1.m();
        int iN = jVarB1.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            while (!Intrinsics.areEqual(k10, w(iL))) {
                if (iL != iM) {
                    iL += iN;
                }
            }
            return m(iL);
        }
        return this;
    }

    private final u<K, V> l(K k10, V v10) {
        kotlin.ranges.j jVarB1 = kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, this.f35665d.length), 2);
        int iL = jVarB1.l();
        int iM = jVarB1.m();
        int iN = jVarB1.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            while (true) {
                if (Intrinsics.areEqual(k10, w(iL)) && Intrinsics.areEqual(v10, a0(iL))) {
                    return m(iL);
                }
                if (iL != iM) {
                    iL += iN;
                }
            }
        }
        return this;
    }

    private final u<K, V> m(int i10) {
        Object[] objArr = this.f35665d;
        if (objArr.length == 2) {
            return null;
        }
        return new u<>(0, 0, y.h(objArr, i10));
    }

    private final boolean o(u<K, V> uVar) {
        if (this == uVar) {
            return true;
        }
        if (this.f35663b != uVar.f35663b || this.f35662a != uVar.f35662a) {
            return false;
        }
        int length = this.f35665d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f35665d[i10] != uVar.f35665d[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean u(int i10) {
        return (this.f35663b & i10) != 0;
    }

    private final u<K, V> v(int i10, K k10, V v10) {
        return new u<>(i10 | this.f35662a, this.f35663b, y.g(this.f35665d, q(i10), k10, v10));
    }

    private final K w(int i10) {
        return (K) this.f35665d[i10];
    }

    private final u<K, V> x(int i10, K k10, V v10, int i11, K k11, V v11, int i12, i0.f fVar) {
        if (i12 > 30) {
            return new u<>(0, 0, new Object[]{k10, v10, k11, v11}, fVar);
        }
        int iF = y.f(i10, i12);
        int iF2 = y.f(i11, i12);
        if (iF != iF2) {
            return new u<>((1 << iF) | (1 << iF2), 0, iF < iF2 ? new Object[]{k10, v10, k11, v11} : new Object[]{k11, v11, k10, v10}, fVar);
        }
        return new u<>(0, 1 << iF, new Object[]{x(i10, k10, v10, i11, k11, v11, i12 + 5, fVar)}, fVar);
    }

    private final u<K, V> y(int i10, int i11, int i12, K k10, V v10, int i13) {
        return new u<>(this.f35662a ^ i11, this.f35663b | i11, f(i10, i11, i12, k10, v10, i13, null));
    }

    private final u<K, V> z(K k10, V v10, f<K, V> fVar) {
        kotlin.ranges.j jVarB1 = kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, this.f35665d.length), 2);
        int iL = jVarB1.l();
        int iM = jVarB1.m();
        int iN = jVarB1.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            while (!Intrinsics.areEqual(k10, w(iL))) {
                if (iL != iM) {
                    iL += iN;
                }
            }
            fVar.h(a0(iL));
            if (this.f35664c == fVar.e()) {
                this.f35665d[iL + 1] = v10;
                return this;
            }
            fVar.f(fVar.b() + 1);
            Object[] objArr = this.f35665d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iL + 1] = v10;
            return new u<>(0, 0, objArrCopyOf, fVar.e());
        }
        fVar.j(fVar.size() + 1);
        return new u<>(0, 0, y.g(this.f35665d, 0, k10, v10), fVar.e());
    }

    @NotNull
    public final u<K, V> G(int i10, K k10, V v10, int i11, @NotNull f<K, V> fVar) {
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            int iQ = q(iF);
            if (Intrinsics.areEqual(k10, w(iQ))) {
                fVar.h(a0(iQ));
                return a0(iQ) == v10 ? this : P(iQ, v10, fVar);
            }
            fVar.j(fVar.size() + 1);
            return F(iQ, iF, i10, k10, v10, i11, fVar.e());
        }
        if (!u(iF)) {
            fVar.j(fVar.size() + 1);
            return E(iF, k10, v10, fVar.e());
        }
        int iR = R(iF);
        u<K, V> uVarQ = Q(iR);
        u<K, V> uVarZ = i11 == 30 ? uVarQ.z(k10, v10, fVar) : uVarQ.G(i10, k10, v10, i11 + 5, fVar);
        return uVarQ == uVarZ ? this : O(iR, uVarZ, fVar.e());
    }

    @NotNull
    public final u<K, V> H(@NotNull u<K, V> uVar, int i10, @NotNull i0.b bVar, @NotNull f<K, V> fVar) {
        if (this == uVar) {
            bVar.e(g());
            return this;
        }
        int i11 = i10;
        if (i11 > 30) {
            return A(uVar, bVar, fVar.e());
        }
        int i12 = this.f35663b | uVar.f35663b;
        int i13 = this.f35662a;
        int i14 = uVar.f35662a;
        int i15 = (i13 ^ i14) & (~i12);
        int i16 = i13 & i14;
        while (i16 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i16);
            if (Intrinsics.areEqual(w(q(iLowestOneBit)), uVar.w(uVar.q(iLowestOneBit)))) {
                i15 |= iLowestOneBit;
            } else {
                i12 |= iLowestOneBit;
            }
            i16 ^= iLowestOneBit;
        }
        int i17 = 0;
        if (!((i12 & i15) == 0)) {
            f4.e("Check failed.");
        }
        u<K, V> uVar2 = (Intrinsics.areEqual(this.f35664c, fVar.e()) && this.f35662a == i15 && this.f35663b == i12) ? this : new u<>(i15, i12, new Object[(Integer.bitCount(i15) * 2) + Integer.bitCount(i12)]);
        int i18 = i12;
        int i19 = 0;
        while (i18 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i18);
            Object[] objArr = uVar2.f35665d;
            objArr[(objArr.length - 1) - i19] = I(uVar, iLowestOneBit2, i11, bVar, fVar);
            i19++;
            i18 ^= iLowestOneBit2;
            i11 = i10;
        }
        while (i15 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i15);
            int i20 = i17 * 2;
            if (uVar.t(iLowestOneBit3)) {
                int iQ = uVar.q(iLowestOneBit3);
                uVar2.f35665d[i20] = uVar.w(iQ);
                uVar2.f35665d[i20 + 1] = uVar.a0(iQ);
                if (t(iLowestOneBit3)) {
                    bVar.f(bVar.d() + 1);
                }
            } else {
                int iQ2 = q(iLowestOneBit3);
                uVar2.f35665d[i20] = w(iQ2);
                uVar2.f35665d[i20 + 1] = a0(iQ2);
            }
            i17++;
            i15 ^= iLowestOneBit3;
        }
        if (o(uVar2)) {
            return this;
        }
        return uVar.o(uVar2) ? uVar : uVar2;
    }

    @Nullable
    public final u<K, V> J(int i10, K k10, int i11, @NotNull f<K, V> fVar) {
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            int iQ = q(iF);
            if (Intrinsics.areEqual(k10, w(iQ))) {
                return L(iQ, iF, fVar);
            }
        } else if (u(iF)) {
            int iR = R(iF);
            u<K, V> uVarQ = Q(iR);
            return N(uVarQ, i11 == 30 ? uVarQ.B(k10, fVar) : uVarQ.J(i10, k10, i11 + 5, fVar), iR, iF, fVar.e());
        }
        return this;
    }

    @Nullable
    public final u<K, V> K(int i10, K k10, V v10, int i11, @NotNull f<K, V> fVar) {
        f<K, V> fVar2;
        u<K, V> uVarK;
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            int iQ = q(iF);
            return (Intrinsics.areEqual(k10, w(iQ)) && Intrinsics.areEqual(v10, a0(iQ))) ? L(iQ, iF, fVar) : this;
        }
        if (!u(iF)) {
            return this;
        }
        int iR = R(iF);
        u<K, V> uVarQ = Q(iR);
        if (i11 == 30) {
            uVarK = uVarQ.C(k10, v10, fVar);
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            uVarK = uVarQ.K(i10, k10, v10, i11 + 5, fVar2);
        }
        return N(uVarQ, uVarK, iR, iF, fVar2.e());
    }

    @NotNull
    public final u<K, V> Q(int i10) {
        Object obj = this.f35665d[i10];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (u) obj;
    }

    public final int R(int i10) {
        return (this.f35665d.length - 1) - Integer.bitCount(this.f35663b & (i10 - 1));
    }

    @Nullable
    public final b<K, V> S(int i10, K k10, V v10, int i11) {
        b<K, V> bVarS;
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            int iQ = q(iF);
            if (!Intrinsics.areEqual(k10, w(iQ))) {
                return y(iQ, iF, i10, k10, v10, i11).d();
            }
            if (a0(iQ) == v10) {
                return null;
            }
            return Z(iQ, v10).e();
        }
        if (!u(iF)) {
            return v(iF, k10, v10).d();
        }
        int iR = R(iF);
        u<K, V> uVarQ = Q(iR);
        if (i11 == 30) {
            bVarS = uVarQ.j(k10, v10);
            if (bVarS == null) {
                return null;
            }
        } else {
            bVarS = uVarQ.S(i10, k10, v10, i11 + 5);
            if (bVarS == null) {
                return null;
            }
        }
        bVarS.d(Y(iR, iF, bVarS.a()));
        return bVarS;
    }

    @Nullable
    public final u<K, V> T(int i10, K k10, int i11) {
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            int iQ = q(iF);
            if (Intrinsics.areEqual(k10, w(iQ))) {
                return V(iQ, iF);
            }
        } else if (u(iF)) {
            int iR = R(iF);
            u<K, V> uVarQ = Q(iR);
            this = X(uVarQ, i11 == 30 ? uVarQ.k(k10) : uVarQ.T(i10, k10, i11 + 5), iR, iF);
        }
        return this;
    }

    @Nullable
    public final u<K, V> U(int i10, K k10, V v10, int i11) {
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            int iQ = q(iF);
            if (Intrinsics.areEqual(k10, w(iQ)) && Intrinsics.areEqual(v10, a0(iQ))) {
                return V(iQ, iF);
            }
        } else if (u(iF)) {
            int iR = R(iF);
            u<K, V> uVarQ = Q(iR);
            this = X(uVarQ, i11 == 30 ? uVarQ.l(k10, v10) : uVarQ.U(i10, k10, v10, i11 + 5), iR, iF);
        }
        return this;
    }

    public final void b(@NotNull pj.p<? super u<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> pVar) {
        a(pVar, 0, 0);
    }

    public final boolean n(int i10, K k10, int i11) {
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            return Intrinsics.areEqual(k10, w(q(iF)));
        }
        if (!u(iF)) {
            return false;
        }
        u<K, V> uVarQ = Q(R(iF));
        return i11 == 30 ? uVarQ.h(k10) : uVarQ.n(i10, k10, i11 + 5);
    }

    public final int p() {
        return Integer.bitCount(this.f35662a);
    }

    public final int q(int i10) {
        return Integer.bitCount(this.f35662a & (i10 - 1)) * 2;
    }

    @Nullable
    public final V r(int i10, K k10, int i11) {
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            int iQ = q(iF);
            if (Intrinsics.areEqual(k10, w(iQ))) {
                return a0(iQ);
            }
            return null;
        }
        if (!u(iF)) {
            return null;
        }
        u<K, V> uVarQ = Q(R(iF));
        return i11 == 30 ? uVarQ.i(k10) : uVarQ.r(i10, k10, i11 + 5);
    }

    @NotNull
    public final Object[] s() {
        return this.f35665d;
    }

    public final boolean t(int i10) {
        return (this.f35662a & i10) != 0;
    }

    public u(int i10, int i11, @NotNull Object[] objArr) {
        this(i10, i11, objArr, null);
    }
}
