package androidx.compose.runtime.collection;

import androidx.collection.g2;
import androidx.collection.k2;
import androidx.collection.s2;
import androidx.collection.t2;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@SourceDebugExtension({"SMAP\nMultiValueMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiValueMap.kt\nandroidx/compose/runtime/collection/MultiValueMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n+ 8 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,141:1\n694#2,5:142\n701#2,8:151\n4802#3,4:147\n1516#4:159\n372#5,3:160\n329#5,6:163\n339#5,3:170\n342#5,9:174\n375#5:183\n1399#6:169\n1270#6:173\n287#7,6:184\n84#7:194\n943#8,4:190\n947#8,8:195\n*S KotlinDebug\n*F\n+ 1 MultiValueMap.kt\nandroidx/compose/runtime/collection/MultiValueMap\n*L\n44#1:142,5\n44#1:151,8\n45#1:147,4\n107#1:159\n108#1:160,3\n108#1:163,6\n108#1:170,3\n108#1:174,9\n108#1:183\n108#1:169\n108#1:173\n121#1:184,6\n132#1:194\n132#1:190,4\n132#1:195,8\n*E\n"})
public final class c<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k2<Object, Object> f35550a;

    private /* synthetic */ c(k2 k2Var) {
        this.f35550a = k2Var;
    }

    public static final void a(k2<Object, Object> k2Var, @NotNull K k10, @NotNull V v10) {
        int iO = k2Var.O(k10);
        boolean z10 = iO < 0;
        Object obj = z10 ? null : k2Var.f12132c[iO];
        r1.F(obj);
        if (obj != null) {
            if (obj instanceof g2) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<kotlin.Any>");
                g2 g2Var = (g2) obj;
                g2Var.a0(v10);
                v10 = (V) g2Var;
            } else {
                v10 = (V) t2.i(obj, v10);
            }
        }
        if (!z10) {
            k2Var.f12132c[iO] = v10;
            return;
        }
        int i10 = ~iO;
        k2Var.f12131b[i10] = k10;
        k2Var.f12132c[i10] = v10;
    }

    public static final /* synthetic */ c b(k2 k2Var) {
        return new c(k2Var);
    }

    public static final void c(k2<Object, Object> k2Var) {
        k2Var.K();
    }

    @NotNull
    public static <K, V> k2<Object, Object> d(@NotNull k2<Object, Object> k2Var) {
        return k2Var;
    }

    public static /* synthetic */ k2 e(k2 k2Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        int i11 = 1;
        if ((i10 & 1) != 0) {
            k2Var = new k2(0, i11, null);
        }
        return d(k2Var);
    }

    public static final boolean f(k2<Object, Object> k2Var, @NotNull K k10) {
        return k2Var.f(k10);
    }

    public static boolean g(k2<Object, Object> k2Var, Object obj) {
        return (obj instanceof c) && Intrinsics.areEqual(k2Var, ((c) obj).r());
    }

    public static final boolean h(k2<Object, Object> k2Var, k2<Object, Object> k2Var2) {
        return Intrinsics.areEqual(k2Var, k2Var2);
    }

    public static final void i(k2<Object, Object> k2Var, @NotNull K k10, @NotNull Function1<? super V, Unit> function1) {
        Object objP = k2Var.p(k10);
        if (objP != null) {
            if (objP instanceof g2) {
                s2 s2Var = (s2) objP;
                Object[] objArr = s2Var.f12449a;
                int i10 = s2Var.f12450b;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object obj = objArr[i11];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                    function1.invoke(obj);
                }
            } else {
                function1.invoke(objP);
            }
        }
    }

    @NotNull
    public static final s2<V> j(k2<Object, Object> k2Var, @NotNull K k10) {
        Object objP = k2Var.p(k10);
        if (objP == null) {
            return t2.f();
        }
        return objP instanceof g2 ? (s2) objP : t2.m(objP);
    }

    public static int k(k2<Object, Object> k2Var) {
        return k2Var.hashCode();
    }

    public static final boolean l(k2<Object, Object> k2Var) {
        return k2Var.x();
    }

    public static final boolean m(k2<Object, Object> k2Var) {
        return k2Var.y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final V n(k2<Object, Object> k2Var, @NotNull K k10) {
        V v10 = (V) k2Var.p(k10);
        if (v10 == 0) {
            return null;
        }
        if (!(v10 instanceof g2)) {
            k2Var.l0(k10);
            return v10;
        }
        g2 g2Var = (g2) v10;
        V v11 = (V) g2Var.J0(0);
        if (g2Var.H()) {
            k2Var.l0(k10);
        }
        if (g2Var.C() == 1) {
            k2Var.q0(k10, g2Var.m());
        }
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final V o(k2<Object, Object> k2Var, @NotNull K k10) {
        V v10 = (V) k2Var.p(k10);
        if (v10 == 0) {
            return null;
        }
        if (!(v10 instanceof g2)) {
            k2Var.l0(k10);
            return v10;
        }
        g2 g2Var = (g2) v10;
        V v11 = (V) b.e(g2Var);
        Intrinsics.checkNotNull(v11, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (g2Var.H()) {
            k2Var.l0(k10);
        }
        if (g2Var.C() == 1) {
            k2Var.q0(k10, g2Var.m());
        }
        return v11;
    }

    public static final void p(k2<Object, Object> k2Var, @NotNull K k10, @NotNull Function1<? super V, Boolean> function1) {
        Object objP = k2Var.p(k10);
        if (objP != null) {
            if (objP instanceof g2) {
                g2 g2Var = (g2) objP;
                int i10 = g2Var.f12450b;
                Object[] objArr = g2Var.f12449a;
                int i11 = 0;
                IntRange intRangeW1 = r.W1(0, i10);
                int iL = intRangeW1.l();
                int iM = intRangeW1.m();
                if (iL <= iM) {
                    while (true) {
                        objArr[iL - i11] = objArr[iL];
                        if (function1.invoke(objArr[iL]).booleanValue()) {
                            i11++;
                        }
                        if (iL == iM) {
                            break;
                        } else {
                            iL++;
                        }
                    }
                }
                ArraysKt.fill(objArr, (Object) null, i10 - i11, i10);
                g2Var.f12450b -= i11;
                if (g2Var.H()) {
                    k2Var.l0(k10);
                }
                if (g2Var.C() == 0) {
                    k2Var.q0(k10, g2Var.m());
                }
            } else if (function1.invoke(objP).booleanValue()) {
                k2Var.l0(k10);
            }
        }
    }

    public static String q(k2<Object, Object> k2Var) {
        return "MultiValueMap(map=" + k2Var + ')';
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006d A[LOOP:0: B:9:0x001d->B:22:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0070 A[EDGE_INSN: B:25:0x0070->B:23:0x0070 BREAK  A[LOOP:0: B:9:0x001d->B:22:0x006d], SYNTHETIC] */
    @NotNull
    public static final s2<V> s(k2<Object, Object> k2Var) {
        if (k2Var.x()) {
            return t2.f();
        }
        g2 g2Var = new g2(0, 1, null);
        Object[] objArr = k2Var.f12132c;
        long[] jArr = k2Var.f12130a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (obj instanceof g2) {
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                g2Var.e0((g2) obj);
                            } else {
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                g2Var.a0(obj);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return g2Var;
    }

    public boolean equals(Object obj) {
        return g(this.f35550a, obj);
    }

    public int hashCode() {
        return k(this.f35550a);
    }

    public final /* synthetic */ k2 r() {
        return this.f35550a;
    }

    public String toString() {
        return q(this.f35550a);
    }
}
