package androidx.compose.runtime.collection;

import androidx.collection.b3;
import androidx.collection.k2;
import androidx.collection.l2;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@SourceDebugExtension({"SMAP\nScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n1#1,193:1\n67#1,6:234\n75#1,4:265\n694#2,15:194\n842#2:269\n844#2:283\n845#2,3:311\n848#2:320\n842#2:321\n844#2:335\n845#2,3:363\n848#2:372\n842#2:373\n844#2,4:387\n848#2:397\n231#3,3:209\n200#3,7:212\n211#3,3:220\n214#3,9:224\n234#3:233\n231#3,3:240\n200#3,7:243\n211#3,3:251\n214#3,9:255\n234#3:264\n200#3,7:286\n211#3,3:294\n214#3,2:298\n217#3,6:304\n200#3,7:338\n211#3,3:346\n214#3,2:350\n217#3,6:356\n1399#4:219\n1270#4:223\n1399#4:250\n1270#4:254\n1399#4:276\n1270#4:280\n1399#4:293\n1270#4:297\n1399#4:328\n1270#4:332\n1399#4:345\n1270#4:349\n1399#4:380\n1270#4:384\n1399#4:408\n1270#4:412\n329#5,6:270\n339#5,3:277\n342#5,2:281\n345#5,6:314\n329#5,6:322\n339#5,3:329\n342#5,2:333\n345#5,6:366\n329#5,6:374\n339#5,3:381\n342#5,2:385\n345#5,6:391\n357#5,4:398\n329#5,6:402\n339#5,3:409\n342#5,9:413\n361#5:422\n809#6,2:284\n812#6,4:300\n816#6:310\n809#6,2:336\n812#6,4:352\n816#6:362\n*S KotlinDebug\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n*L\n81#1:234,6\n81#1:265,4\n36#1:194,15\n123#1:269\n123#1:283\n123#1:311,3\n123#1:320\n139#1:321\n139#1:335\n139#1:363,3\n139#1:372\n159#1:373\n159#1:387,4\n159#1:397\n72#1:209,3\n72#1:212,7\n72#1:220,3\n72#1:224,9\n72#1:233\n81#1:240,3\n81#1:243,7\n81#1:251,3\n81#1:255,9\n81#1:264\n127#1:286,7\n127#1:294,3\n127#1:298,2\n127#1:304,6\n144#1:338,7\n144#1:346,3\n144#1:350,2\n144#1:356,6\n72#1:219\n72#1:223\n81#1:250\n81#1:254\n123#1:276\n123#1:280\n127#1:293\n127#1:297\n139#1:328\n139#1:332\n144#1:345\n144#1:349\n159#1:380\n159#1:384\n179#1:408\n179#1:412\n123#1:270,6\n123#1:277,3\n123#1:281,2\n123#1:314,6\n139#1:322,6\n139#1:329,3\n139#1:333,2\n139#1:366,6\n159#1:374,6\n159#1:381,3\n159#1:385,2\n159#1:391,6\n179#1:398,4\n179#1:402,6\n179#1:409,3\n179#1:413,9\n179#1:422\n127#1:284,2\n127#1:300,4\n127#1:310\n144#1:336,2\n144#1:352,4\n144#1:362\n*E\n"})
public final class h<Key, Scope> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k2<Object, Object> f35573a;

    private /* synthetic */ h(k2 k2Var) {
        this.f35573a = k2Var;
    }

    public static final void a(k2<Object, Object> k2Var, @NotNull Key key, @NotNull Scope scope) {
        int iO = k2Var.O(key);
        int i10 = 0;
        int i11 = 1;
        boolean z10 = iO < 0;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object obj = z10 ? null : k2Var.f12132c[iO];
        if (obj != null) {
            if (obj instanceof l2) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                ((l2) obj).C(scope);
            } else if (obj != scope) {
                l2 l2Var = new l2(i10, i11, defaultConstructorMarker);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                l2Var.C(obj);
                l2Var.C(scope);
                scope = (Scope) l2Var;
            }
            scope = (Scope) obj;
        }
        if (!z10) {
            k2Var.f12132c[iO] = scope;
            return;
        }
        int i12 = ~iO;
        k2Var.f12131b[i12] = key;
        k2Var.f12132c[i12] = scope;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[LOOP:0: B:9:0x0019->B:21:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0069 A[SYNTHETIC] */
    public static final boolean b(k2<Object, Object> k2Var, @NotNull Key key, @NotNull Function1<? super Scope, Boolean> function1) {
        Object objP = k2Var.p(key);
        if (objP != null) {
            if (objP instanceof l2) {
                l2 l2Var = (l2) objP;
                Object[] objArr = l2Var.f12171b;
                long[] jArr = l2Var.f12170a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128 && function1.invoke(objArr[(i10 << 3) + i12]).booleanValue()) {
                                    return true;
                                }
                                j10 >>= 8;
                            }
                            if (i11 == 8) {
                                if (i10 != length) {
                                    i10++;
                                }
                            }
                        } else if (i10 != length) {
                            i10++;
                        }
                    }
                }
            } else if (function1.invoke(objP).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x006f A[LOOP:0: B:5:0x0012->B:19:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0072 A[EDGE_INSN: B:22:0x0072->B:20:0x0072 BREAK  A[LOOP:0: B:5:0x0012->B:19:0x006f], SYNTHETIC] */
    @NotNull
    public static final Map<Key, Set<Scope>> c(k2<Object, Object> k2Var) {
        Set setMutableSetOf;
        HashMap map = new HashMap();
        Object[] objArr = k2Var.f12131b;
        Object[] objArr2 = k2Var.f12132c;
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
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                            if (obj2 instanceof l2) {
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                setMutableSetOf = ((l2) obj2).d();
                            } else {
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                setMutableSetOf = SetsKt.mutableSetOf(obj2);
                            }
                            map.put(obj, setMutableSetOf);
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
        return map;
    }

    public static final /* synthetic */ h d(k2 k2Var) {
        return new h(k2Var);
    }

    public static final void e(k2<Object, Object> k2Var) {
        k2Var.K();
    }

    @NotNull
    public static <Key, Scope> k2<Object, Object> f(@NotNull k2<Object, Object> k2Var) {
        return k2Var;
    }

    public static /* synthetic */ k2 g(k2 k2Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            k2Var = b3.u();
        }
        return f(k2Var);
    }

    public static final boolean h(k2<Object, Object> k2Var, @NotNull Key key) {
        return k2Var.g(key);
    }

    public static boolean i(k2<Object, Object> k2Var, Object obj) {
        return (obj instanceof h) && Intrinsics.areEqual(k2Var, ((h) obj).u());
    }

    public static final boolean j(k2<Object, Object> k2Var, k2<Object, Object> k2Var2) {
        return Intrinsics.areEqual(k2Var, k2Var2);
    }

    public static final void k(k2<Object, Object> k2Var, @NotNull Key key, @NotNull Function1<? super Scope, Unit> function1) {
        Object objP = k2Var.p(key);
        if (objP == null) {
            return;
        }
        if (!(objP instanceof l2)) {
            function1.invoke(objP);
            return;
        }
        l2 l2Var = (l2) objP;
        Object[] objArr = l2Var.f12171b;
        long[] jArr = l2Var.f12170a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        function1.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final int m(k2<Object, Object> k2Var) {
        return k2Var.v();
    }

    public static int n(k2<Object, Object> k2Var) {
        return k2Var.hashCode();
    }

    public static final boolean o(k2<Object, Object> k2Var, @NotNull Key key, @NotNull Scope scope) {
        Object objP = k2Var.p(key);
        if (objP == null) {
            return false;
        }
        if (!(objP instanceof l2)) {
            if (!Intrinsics.areEqual(objP, scope)) {
                return false;
            }
            k2Var.l0(key);
            return true;
        }
        l2 l2Var = (l2) objP;
        boolean zG0 = l2Var.g0(scope);
        if (zG0 && l2Var.r()) {
            k2Var.l0(key);
        }
        return zG0;
    }

    public static final void p(k2<Object, Object> k2Var, @NotNull Function2<? super Key, ? super Scope, Boolean> function2) {
        long[] jArr;
        long[] jArr2;
        long j10;
        char c10;
        long j11;
        int i10;
        int i11;
        boolean zBooleanValue;
        long[] jArr3;
        long j12;
        long[] jArr4 = k2Var.f12130a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j13 = jArr4[i12];
            char c11 = 7;
            long j14 = -9187201950435737472L;
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j13 & 255) < 128) {
                        int i16 = (i12 << 3) + i15;
                        c10 = c11;
                        Object obj = k2Var.f12131b[i16];
                        j11 = j14;
                        Object obj2 = k2Var.f12132c[i16];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                        if (obj2 instanceof l2) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            l2 l2Var = (l2) obj2;
                            Object[] objArr = l2Var.f12171b;
                            long[] jArr5 = l2Var.f12170a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                j10 = j13;
                                int i17 = i13;
                                int i18 = 0;
                                while (true) {
                                    long j15 = jArr5[i18];
                                    Object[] objArr2 = objArr;
                                    i10 = i15;
                                    if ((((~j15) << c10) & j15 & j11) != j11) {
                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                        int i20 = 0;
                                        while (i20 < i19) {
                                            if ((j15 & 255) < 128) {
                                                jArr3 = jArr4;
                                                int i21 = (i18 << 3) + i20;
                                                j12 = j15;
                                                if (function2.invoke(obj, objArr2[i21]).booleanValue()) {
                                                    l2Var.n0(i21);
                                                }
                                            } else {
                                                jArr3 = jArr4;
                                                j12 = j15;
                                            }
                                            j15 = j12 >> i17;
                                            i20++;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i19 != i17) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i18 == length2) {
                                        break;
                                    }
                                    i18++;
                                    i15 = i10;
                                    objArr = objArr2;
                                    jArr4 = jArr2;
                                    i17 = 8;
                                }
                            } else {
                                jArr2 = jArr4;
                                j10 = j13;
                                i10 = i15;
                            }
                            zBooleanValue = l2Var.r();
                        } else {
                            jArr2 = jArr4;
                            j10 = j13;
                            i10 = i15;
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                            zBooleanValue = function2.invoke(obj, obj2).booleanValue();
                        }
                        if (zBooleanValue) {
                            k2Var.o0(i16);
                        }
                        i11 = 8;
                    } else {
                        jArr2 = jArr4;
                        j10 = j13;
                        c10 = c11;
                        j11 = j14;
                        i10 = i15;
                        i11 = i13;
                    }
                    j13 = j10 >> i11;
                    i15 = i10 + 1;
                    i13 = i11;
                    c11 = c10;
                    j14 = j11;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                if (i14 != i13) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i12 == length) {
                return;
            }
            i12++;
            jArr4 = jArr;
        }
    }

    public static final void q(k2<Object, Object> k2Var, @NotNull Scope scope) {
        boolean zR;
        long[] jArr = k2Var.f12130a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = k2Var.f12131b[i13];
                        Object obj2 = k2Var.f12132c[i13];
                        if (obj2 instanceof l2) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            l2 l2Var = (l2) obj2;
                            l2Var.g0(scope);
                            zR = l2Var.r();
                        } else {
                            zR = obj2 == scope;
                        }
                        if (zR) {
                            k2Var.o0(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final void r(k2<Object, Object> k2Var, @NotNull Function1<? super Scope, Boolean> function1) {
        long[] jArr;
        long[] jArr2;
        long j10;
        char c10;
        long j11;
        int i10;
        boolean zBooleanValue;
        l2 l2Var;
        long[] jArr3;
        int i11;
        l2 l2Var2;
        long[] jArr4 = k2Var.f12130a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j12 = jArr4[i12];
            char c11 = 7;
            long j13 = -9187201950435737472L;
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j12 & 255) < 128) {
                        int i16 = (i12 << 3) + i15;
                        c10 = c11;
                        Object obj = k2Var.f12131b[i16];
                        Object obj2 = k2Var.f12132c[i16];
                        j11 = j13;
                        if (obj2 instanceof l2) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            l2 l2Var3 = (l2) obj2;
                            Object[] objArr = l2Var3.f12171b;
                            long[] jArr5 = l2Var3.f12170a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i17 = i13;
                                l2 l2Var4 = l2Var3;
                                int i18 = 0;
                                while (true) {
                                    long j14 = jArr5[i18];
                                    j10 = j12;
                                    if ((((~j14) << c10) & j14 & j11) != j11) {
                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                        int i20 = 0;
                                        while (i20 < i19) {
                                            if ((j14 & 255) < 128) {
                                                jArr3 = jArr4;
                                                int i21 = (i18 << 3) + i20;
                                                i11 = i20;
                                                if (function1.invoke(objArr[i21]).booleanValue()) {
                                                    l2Var2 = l2Var4;
                                                    l2Var2.n0(i21);
                                                }
                                                j14 >>= i17;
                                                l2Var4 = l2Var2;
                                                i20 = i11 + 1;
                                                jArr4 = jArr3;
                                            } else {
                                                jArr3 = jArr4;
                                                i11 = i20;
                                            }
                                            l2Var2 = l2Var4;
                                            j14 >>= i17;
                                            l2Var4 = l2Var2;
                                            i20 = i11 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        l2Var = l2Var4;
                                        if (i19 != i17) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        l2Var = l2Var4;
                                    }
                                    if (i18 == length2) {
                                        break;
                                    }
                                    i18++;
                                    l2Var4 = l2Var;
                                    j12 = j10;
                                    jArr4 = jArr2;
                                    i17 = 8;
                                }
                            } else {
                                jArr2 = jArr4;
                                j10 = j12;
                                l2Var = l2Var3;
                            }
                            zBooleanValue = l2Var.r();
                        } else {
                            jArr2 = jArr4;
                            j10 = j12;
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                            zBooleanValue = function1.invoke(obj2).booleanValue();
                        }
                        if (zBooleanValue) {
                            k2Var.o0(i16);
                        }
                        i10 = 8;
                    } else {
                        jArr2 = jArr4;
                        j10 = j12;
                        c10 = c11;
                        j11 = j13;
                        i10 = i13;
                    }
                    j12 = j10 >> i10;
                    i15++;
                    i13 = i10;
                    c11 = c10;
                    j13 = j11;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                if (i14 != i13) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i12 == length) {
                return;
            }
            i12++;
            jArr4 = jArr;
        }
    }

    public static final void s(k2<Object, Object> k2Var, @NotNull Key key, @NotNull Scope scope) {
        k2Var.q0(key, scope);
    }

    public static String t(k2<Object, Object> k2Var) {
        return "ScopeMap(map=" + k2Var + ')';
    }

    public boolean equals(Object obj) {
        return i(this.f35573a, obj);
    }

    public int hashCode() {
        return n(this.f35573a);
    }

    @NotNull
    public final k2<Object, Object> l() {
        return this.f35573a;
    }

    public String toString() {
        return t(this.f35573a);
    }

    public final /* synthetic */ k2 u() {
        return this.f35573a;
    }
}
