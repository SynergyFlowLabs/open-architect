package androidx.compose.runtime.snapshots;

import androidx.collection.c3;
import androidx.collection.f2;
import androidx.collection.k2;
import androidx.collection.l2;
import androidx.collection.q2;
import androidx.compose.animation.core.z1;
import androidx.compose.runtime.f4;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r1;
import androidx.compose.runtime.u6;
import androidx.compose.runtime.w6;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,601:1\n183#1:611\n184#1:621\n187#1:652\n188#1:669\n187#1:670\n188#1:687\n183#1:688\n184#1:698\n1107#2:602\n1085#2,2:603\n25#3,5:605\n33#3:610\n33#3:612\n33#3:622\n33#3:631\n33#3:647\n33#3:653\n33#3:671\n33#3:689\n33#3:708\n33#3:717\n424#4,8:613\n424#4,8:623\n742#4,15:632\n742#4,15:654\n742#4,15:672\n424#4,8:690\n348#4,7:699\n643#4,2:706\n424#4,8:709\n34#5,4:648\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n71#1:611\n71#1:621\n282#1:652\n282#1:669\n293#1:670\n293#1:687\n320#1:688\n320#1:698\n174#1:602\n174#1:603,2\n175#1:605,5\n65#1:610\n71#1:612\n183#1:622\n187#1:631\n226#1:647\n282#1:653\n293#1:671\n320#1:689\n85#1:708\n165#1:717\n71#1:613,8\n183#1:623,8\n187#1:632,15\n282#1:654,15\n293#1:672,15\n320#1:690,8\n331#1:699,7\n334#1:706,2\n89#1:709,8\n233#1:648,4\n*E\n"})
public final class q0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f36556l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Function0<Unit>, Unit> f36557a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36559c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private h f36564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private a f36566j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicReference<Object> f36558b = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<Set<? extends Object>, m, Unit> f36560d = new Function2() { // from class: androidx.compose.runtime.snapshots.o0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return q0.e(this.f36551a, (Set) obj, (m) obj2);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<Object, Unit> f36561e = new Function1() { // from class: androidx.compose.runtime.snapshots.p0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return q0.n(this.f36553a, obj);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<a> f36562f = new androidx.compose.runtime.collection.d<>(new a[16], 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f36563g = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f36567k = -1;

    @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 9 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 10 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 11 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 12 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 13 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 14 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 15 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,601:1\n1107#2:602\n1085#2,2:603\n403#3,3:605\n367#3,6:608\n377#3,3:615\n380#3,2:619\n383#3,6:622\n406#3:628\n367#3,6:640\n377#3,3:647\n380#3,2:651\n383#3,6:657\n395#3,4:664\n367#3,6:668\n377#3,3:675\n380#3,9:679\n399#3:688\n395#3,4:704\n367#3,6:708\n377#3,3:715\n380#3,9:719\n399#3:728\n1399#4:614\n1270#4:618\n1399#4:646\n1270#4:650\n1399#4:674\n1270#4:678\n1399#4:696\n1270#4:700\n1399#4:714\n1270#4:718\n1399#4:752\n1270#4:756\n1399#4:776\n1270#4:780\n1399#4:799\n1270#4:803\n1399#4:842\n1270#4:846\n1399#4:878\n1270#4:882\n1399#4:916\n1270#4:920\n1399#4:939\n1270#4:943\n1399#4:982\n1270#4:986\n1399#4:1018\n1270#4:1022\n1399#4:1064\n1270#4:1068\n1399#4:1093\n1270#4:1097\n57#5:621\n57#5:629\n57#5:759\n390#6,6:630\n396#6,2:637\n44#7:636\n519#7:1039\n424#7,8:1040\n775#8:639\n777#8,4:653\n781#8:663\n842#9:689\n844#9:703\n845#9,3:729\n848#9:738\n329#10,6:690\n339#10,3:697\n342#10,2:701\n345#10,6:732\n41#11,3:739\n46#11:904\n48#11:1038\n231#12,3:742\n200#12,7:745\n211#12,3:753\n214#12,2:757\n231#12,3:766\n200#12,7:769\n211#12,3:777\n214#12,2:781\n231#12,3:789\n200#12,7:792\n211#12,3:800\n214#12,9:804\n234#12:813\n217#12,6:818\n234#12:824\n231#12,3:832\n200#12,7:835\n211#12,3:843\n214#12,9:847\n234#12:856\n231#12,3:868\n200#12,7:871\n211#12,3:879\n214#12,9:883\n234#12:892\n217#12,6:897\n234#12:903\n231#12,3:906\n200#12,7:909\n211#12,3:917\n214#12,2:921\n231#12,3:929\n200#12,7:932\n211#12,3:940\n214#12,9:944\n234#12:953\n217#12,6:958\n234#12:964\n231#12,3:972\n200#12,7:975\n211#12,3:983\n214#12,9:987\n234#12:996\n231#12,3:1008\n200#12,7:1011\n211#12,3:1019\n214#12,9:1023\n234#12:1032\n231#12,3:1054\n200#12,7:1057\n211#12,3:1065\n214#12,2:1069\n217#12,6:1072\n234#12:1078\n231#12,3:1083\n200#12,7:1086\n211#12,3:1094\n214#12,9:1098\n234#12:1107\n67#13,6:760\n67#13,6:783\n75#13,4:814\n75#13:825\n67#13,6:826\n75#13,4:857\n78#13:861\n67#13,6:862\n75#13,4:893\n67#13,6:923\n75#13,4:954\n75#13:965\n67#13,6:966\n75#13,4:997\n78#13:1001\n67#13,6:1002\n75#13,4:1033\n67#13,6:1048\n75#13,4:1079\n1863#14:905\n1864#14:1037\n1#15:1071\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n369#1:602\n369#1:603,2\n435#1:605,3\n435#1:608,6\n435#1:615,3\n435#1:619,2\n435#1:622,6\n435#1:628\n476#1:640,6\n476#1:647,3\n476#1:651,2\n476#1:657,6\n488#1:664,4\n488#1:668,6\n488#1:675,3\n488#1:679,9\n488#1:688\n496#1:704,4\n496#1:708,6\n496#1:715,3\n496#1:719,9\n496#1:728\n435#1:614\n435#1:618\n476#1:646\n476#1:650\n488#1:674\n488#1:678\n493#1:696\n493#1:700\n496#1:714\n496#1:718\n533#1:752\n533#1:756\n540#1:776\n540#1:780\n552#1:799\n552#1:803\n552#1:842\n552#1:846\n563#1:878\n563#1:882\n540#1:916\n540#1:920\n552#1:939\n552#1:943\n552#1:982\n552#1:986\n563#1:1018\n563#1:1022\n581#1:1064\n581#1:1068\n596#1:1093\n596#1:1097\n437#1:621\n445#1:629\n534#1:759\n463#1:630,6\n463#1:637,2\n463#1:636\n569#1:1039\n570#1:1040,8\n476#1:639\n476#1:653,4\n476#1:663\n493#1:689\n493#1:703\n493#1:729,3\n493#1:738\n493#1:690,6\n493#1:697,3\n493#1:701,2\n493#1:732,6\n533#1:739,3\n533#1:904\n533#1:1038\n533#1:742,3\n533#1:745,7\n533#1:753,3\n533#1:757,2\n540#1:766,3\n540#1:769,7\n540#1:777,3\n540#1:781,2\n552#1:789,3\n552#1:792,7\n552#1:800,3\n552#1:804,9\n552#1:813\n540#1:818,6\n540#1:824\n552#1:832,3\n552#1:835,7\n552#1:843,3\n552#1:847,9\n552#1:856\n563#1:868,3\n563#1:871,7\n563#1:879,3\n563#1:883,9\n563#1:892\n533#1:897,6\n533#1:903\n540#1:906,3\n540#1:909,7\n540#1:917,3\n540#1:921,2\n552#1:929,3\n552#1:932,7\n552#1:940,3\n552#1:944,9\n552#1:953\n540#1:958,6\n540#1:964\n552#1:972,3\n552#1:975,7\n552#1:983,3\n552#1:987,9\n552#1:996\n563#1:1008,3\n563#1:1011,7\n563#1:1019,3\n563#1:1023,9\n563#1:1032\n581#1:1054,3\n581#1:1057,7\n581#1:1065,3\n581#1:1069,2\n581#1:1072,6\n581#1:1078\n596#1:1083,3\n596#1:1086,7\n596#1:1094,3\n596#1:1098,9\n596#1:1107\n540#1:760,6\n552#1:783,6\n552#1:814,4\n540#1:825\n552#1:826,6\n552#1:857,4\n540#1:861\n563#1:862,6\n563#1:893,4\n552#1:923,6\n552#1:954,4\n540#1:965\n552#1:966,6\n552#1:997,4\n540#1:1001\n563#1:1002,6\n563#1:1033,4\n581#1:1048,6\n581#1:1079,4\n533#1:905\n533#1:1037\n*E\n"})
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function1<Object, Unit> f36568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private Object f36569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private f2<Object> f36570c;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f36577j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f36571d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final k2<Object, Object> f36572e = androidx.compose.runtime.collection.h.g(null, 1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final k2<Object, f2<Object>> f36573f = new k2<>(0, 1, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final l2<Object> f36574g = new l2<>(0, 1, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private final androidx.compose.runtime.collection.d<q1<?>> f36575h = new androidx.compose.runtime.collection.d<>(new q1[16], 0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private final r1 f36576i = new C0275a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        private final k2<Object, Object> f36578k = androidx.compose.runtime.collection.h.g(null, 1, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        private final HashMap<q1<?>, Object> f36579l = new HashMap<>();

        /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.q0$a$a, reason: collision with other inner class name */
        public static final class C0275a implements r1 {
            C0275a() {
            }

            @Override // androidx.compose.runtime.r1
            public void a(q1<?> q1Var) {
                a.this.f36577j--;
            }

            @Override // androidx.compose.runtime.r1
            public void b(q1<?> q1Var) {
                a.this.f36577j++;
            }
        }

        public a(@NotNull Function1<Object, Unit> function1) {
            this.f36568a = function1;
        }

        private final void d(Object obj) {
            int i10 = this.f36571d;
            f2<Object> f2Var = this.f36570c;
            if (f2Var == null) {
                return;
            }
            long[] jArr = f2Var.f12436a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj2 = f2Var.f12437b[i14];
                            boolean z10 = f2Var.f12438c[i14] != i10;
                            if (z10) {
                                n(obj, obj2);
                            }
                            if (z10) {
                                f2Var.j0(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 == length) {
                    return;
                } else {
                    i11++;
                }
            }
        }

        private final void m(Object obj, int i10, Object obj2, f2<Object> f2Var) {
            int i11;
            int i12;
            int i13;
            if (this.f36577j > 0) {
                return;
            }
            int iD0 = f2Var.d0(obj, i10, -1);
            int i14 = 2;
            if (!(obj instanceof q1) || iD0 == i10) {
                i11 = 2;
                i12 = -1;
            } else {
                q1.a aVarD = ((q1) obj).D();
                this.f36579l.put(obj, aVarD.d());
                q2<c1> q2VarA = aVarD.a();
                k2<Object, Object> k2Var = this.f36578k;
                androidx.compose.runtime.collection.h.q(k2Var, obj);
                Object[] objArr = q2VarA.f12437b;
                long[] jArr = q2VarA.f12436a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr[i15];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j10 & 255) < 128) {
                                    i13 = i14;
                                    c1 c1Var = (c1) objArr[(i15 << 3) + i17];
                                    if (c1Var instanceof d1) {
                                        i.a aVar = i.f36500b;
                                        ((d1) c1Var).b(i.b(i13));
                                    }
                                    androidx.compose.runtime.collection.h.a(k2Var, c1Var, obj);
                                } else {
                                    i13 = i14;
                                }
                                j10 >>= 8;
                                i17++;
                                i14 = i13;
                            }
                            i11 = i14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            i11 = i14;
                        }
                        if (i15 == length) {
                            break;
                        }
                        i15++;
                        i14 = i11;
                    }
                } else {
                    i11 = 2;
                }
                i12 = -1;
            }
            if (iD0 == i12) {
                if (obj instanceof d1) {
                    i.a aVar2 = i.f36500b;
                    ((d1) obj).b(i.b(i11));
                }
                androidx.compose.runtime.collection.h.a(this.f36572e, obj, obj2);
            }
        }

        private final void n(Object obj, Object obj2) {
            androidx.compose.runtime.collection.h.o(this.f36572e, obj2, obj);
            if (!(obj2 instanceof q1) || androidx.compose.runtime.collection.h.h(this.f36572e, obj2)) {
                return;
            }
            androidx.compose.runtime.collection.h.q(this.f36578k, obj2);
            this.f36579l.remove(obj2);
        }

        public final void c() {
            androidx.compose.runtime.collection.h.e(this.f36572e);
            this.f36573f.K();
            androidx.compose.runtime.collection.h.e(this.f36578k);
            this.f36579l.clear();
        }

        public final void e(@NotNull Object obj) {
            f2<Object> f2VarL0 = this.f36573f.l0(obj);
            if (f2VarL0 == null) {
                return;
            }
            Object[] objArr = f2VarL0.f12437b;
            int[] iArr = f2VarL0.f12438c;
            long[] jArr = f2VarL0.f12436a;
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
                            Object obj2 = objArr[i13];
                            int i14 = iArr[i13];
                            n(obj, obj2);
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

        @NotNull
        public final r1 f() {
            return this.f36576i;
        }

        @NotNull
        public final Function1<Object, Unit> g() {
            return this.f36568a;
        }

        public final boolean h() {
            return this.f36573f.y();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000f->B:15:0x0044, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000f->B:15:0x0044], SYNTHETIC] */
        public final void i() {
            l2<Object> l2Var = this.f36574g;
            Function1<Object, Unit> function1 = this.f36568a;
            Object[] objArr = l2Var.f12171b;
            long[] jArr = l2Var.f12170a;
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
                                function1.invoke(objArr[(i10 << 3) + i12]);
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            l2Var.L();
        }

        public final void j(@NotNull Object obj, @NotNull Function1<Object, Unit> function1, @NotNull Function0<Unit> function0) {
            Object obj2 = this.f36569b;
            f2<Object> f2Var = this.f36570c;
            int i10 = this.f36571d;
            this.f36569b = obj;
            this.f36570c = this.f36573f.p(obj);
            if (this.f36571d == -1) {
                this.f36571d = Long.hashCode(b0.N().p());
            }
            r1 r1Var = this.f36576i;
            androidx.compose.runtime.collection.d<r1> dVarC = w6.c();
            try {
                dVarC.d(r1Var);
                m.f36535e.o(function1, null, function0);
                dVarC.r0(dVarC.R() - 1);
                Object obj3 = this.f36569b;
                Intrinsics.checkNotNull(obj3);
                d(obj3);
                this.f36569b = obj2;
                this.f36570c = f2Var;
                this.f36571d = i10;
            } catch (Throwable th2) {
                dVarC.r0(dVarC.R() - 1);
                throw th2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0278  */
        /* JADX WARN: Code duplicated, block: B:122:0x02df A[DONT_INVERT, PHI: r11
          0x02df: PHI (r11v54 boolean) = (r11v53 boolean), (r11v55 boolean) binds: [B:113:0x02b7, B:121:0x02dd] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:123:0x02e1 A[LOOP:6: B:112:0x02ad->B:123:0x02e1, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:143:0x0380 A[PHI: r11 r25 r44
          0x0380: PHI (r11v41 boolean) = (r11v2 boolean), (r11v2 boolean), (r11v1 boolean) binds: [B:227:0x0549, B:231:0x0558, B:142:0x037c] A[DONT_GENERATE, DONT_INLINE]
          0x0380: PHI (r25v16 androidx.collection.k2<java.lang.Object, java.lang.Object>) = 
          (r25v1 androidx.collection.k2<java.lang.Object, java.lang.Object>)
          (r25v1 androidx.collection.k2<java.lang.Object, java.lang.Object>)
          (r25v17 androidx.collection.k2<java.lang.Object, java.lang.Object>)
         binds: [B:227:0x0549, B:231:0x0558, B:142:0x037c] A[DONT_GENERATE, DONT_INLINE]
          0x0380: PHI (r44v16 java.util.Iterator) = (r44v3 java.util.Iterator), (r44v3 java.util.Iterator), (r44v17 java.util.Iterator) binds: [B:227:0x0549, B:231:0x0558, B:142:0x037c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:144:0x0384  */
        /* JADX WARN: Code duplicated, block: B:181:0x0453 A[PHI: r13
          0x0453: PHI (r13v8 boolean) = (r13v7 boolean), (r13v9 boolean) binds: [B:172:0x0424, B:180:0x0451] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:184:0x0459 A[LOOP:14: B:171:0x0416->B:184:0x0459, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:186:0x0465  */
        /* JADX WARN: Code duplicated, block: B:220:0x052d A[DONT_INVERT, PHI: r11
          0x052d: PHI (r11v15 boolean) = (r11v14 boolean), (r11v16 boolean) binds: [B:211:0x0505, B:219:0x052b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:221:0x052f A[LOOP:18: B:210:0x04fb->B:221:0x052f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:225:0x053f  */
        /* JADX WARN: Code duplicated, block: B:228:0x054b  */
        /* JADX WARN: Code duplicated, block: B:230:0x054f  */
        /* JADX WARN: Code duplicated, block: B:232:0x055a  */
        /* JADX WARN: Code duplicated, block: B:235:0x0568  */
        /* JADX WARN: Code duplicated, block: B:237:0x0575  */
        /* JADX WARN: Code duplicated, block: B:239:0x057b  */
        /* JADX WARN: Code duplicated, block: B:244:0x058f  */
        /* JADX WARN: Code duplicated, block: B:246:0x0593 A[LOOP:16: B:233:0x055c->B:246:0x0593, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:247:0x0596  */
        /* JADX WARN: Code duplicated, block: B:265:0x0180 A[EDGE_INSN: B:265:0x0180->B:61:0x0180 BREAK  A[LOOP:4: B:46:0x0128->B:58:0x0166], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:270:0x02e8 A[EDGE_INSN: B:270:0x02e8->B:125:0x02e8 BREAK  A[LOOP:6: B:112:0x02ad->B:123:0x02e1], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:275:0x026f A[EDGE_INSN: B:275:0x026f->B:100:0x026f BREAK  A[LOOP:8: B:87:0x0234->B:98:0x0268], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:283:0x059c A[EDGE_INSN: B:283:0x059c->B:248:0x059c BREAK  A[LOOP:16: B:233:0x055c->B:246:0x0593], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:284:0x059c A[EDGE_INSN: B:284:0x059c->B:248:0x059c BREAK  A[LOOP:16: B:233:0x055c->B:246:0x0593], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:289:0x0467 A[EDGE_INSN: B:289:0x0467->B:187:0x0467 BREAK  A[LOOP:14: B:171:0x0416->B:184:0x0459], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:295:0x0584 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:297:0x0536 A[EDGE_INSN: B:297:0x0536->B:223:0x0536 BREAK  A[LOOP:18: B:210:0x04fb->B:221:0x052f], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x0164 A[DONT_INVERT, PHI: r37
          0x0164: PHI (r37v7 boolean) = (r37v6 boolean), (r37v8 boolean) binds: [B:47:0x0138, B:56:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:58:0x0166 A[LOOP:4: B:46:0x0128->B:58:0x0166, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:60:0x017a  */
        /* JADX WARN: Code duplicated, block: B:97:0x0266 A[DONT_INVERT, PHI: r11
          0x0266: PHI (r11v65 boolean) = (r11v64 boolean), (r11v66 boolean) binds: [B:88:0x023e, B:96:0x0264] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:98:0x0268 A[LOOP:8: B:87:0x0234->B:98:0x0268, LOOP_END] */
        public final boolean k(@NotNull Set<? extends Object> set) {
            boolean z10;
            Iterator it;
            k2<Object, Object> k2Var;
            Object objP;
            Object[] objArr;
            long[] jArr;
            int length;
            int i10;
            long j10;
            int i11;
            int i12;
            Object objP2;
            long[] jArr2;
            Object[] objArr2;
            Iterator it2;
            k2<Object, Object> k2Var2;
            long[] jArr3;
            Object[] objArr3;
            long j11;
            long[] jArr4;
            Object[] objArr4;
            String str;
            int i13;
            Object[] objArr5;
            String str2;
            int i14;
            int i15;
            long j12;
            int i16;
            int i17;
            Object obj;
            Object obj2;
            String str3;
            Object obj3;
            int i18;
            long j13;
            int i19;
            k2<Object, Object> k2Var3 = this.f36578k;
            HashMap<q1<?>, Object> map = this.f36579l;
            k2<Object, Object> k2Var4 = this.f36572e;
            l2<Object> l2Var = this.f36574g;
            String str4 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            int i20 = 8;
            if (set instanceof androidx.compose.runtime.collection.f) {
                c3 c3VarC = ((androidx.compose.runtime.collection.f) set).c();
                Object[] objArr6 = c3VarC.f12171b;
                long[] jArr5 = c3VarC.f12170a;
                int length2 = jArr5.length - 2;
                if (length2 >= 0) {
                    int i21 = 0;
                    z10 = false;
                    while (true) {
                        long j14 = jArr5[i21];
                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i22 = 8 - ((~(i21 - length2)) >>> 31);
                            int i23 = 0;
                            while (i23 < i22) {
                                if ((j14 & 255) < 128) {
                                    int i24 = i20;
                                    Object obj4 = objArr6[(i21 << 3) + i23];
                                    if (obj4 instanceof d1) {
                                        i.a aVar = i.f36500b;
                                        objArr5 = objArr6;
                                        if (!((d1) obj4).a(i.b(2))) {
                                            str2 = str4;
                                            i14 = length2;
                                            i15 = i21;
                                            j12 = j14;
                                            i16 = i22;
                                        }
                                        i17 = 8;
                                    } else {
                                        objArr5 = objArr6;
                                    }
                                    if (androidx.compose.runtime.collection.h.h(k2Var3, obj4)) {
                                        Object objP3 = k2Var3.p(obj4);
                                        if (objP3 == null) {
                                            str2 = str4;
                                            obj2 = obj4;
                                            i14 = length2;
                                            i15 = i21;
                                            j12 = j14;
                                            i16 = i22;
                                        } else if (objP3 instanceof l2) {
                                            l2 l2Var2 = (l2) objP3;
                                            Object[] objArr7 = l2Var2.f12171b;
                                            long[] jArr6 = l2Var2.f12170a;
                                            int length3 = jArr6.length - 2;
                                            if (length3 >= 0) {
                                                j12 = j14;
                                                int i25 = 0;
                                                boolean z11 = z10;
                                                while (true) {
                                                    long j15 = jArr6[i25];
                                                    i14 = length2;
                                                    i15 = i21;
                                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i26 = 8 - ((~(i25 - length3)) >>> 31);
                                                        int i27 = 0;
                                                        while (i27 < i26) {
                                                            if ((j15 & 255) < 128) {
                                                                i18 = i27;
                                                                q1<?> q1Var = (q1) objArr7[(i25 << 3) + i27];
                                                                Intrinsics.checkNotNull(q1Var, str4);
                                                                j13 = j15;
                                                                Object obj5 = map.get(q1Var);
                                                                u6<?> u6VarC = q1Var.c();
                                                                if (u6VarC == null) {
                                                                    u6VarC = w6.z();
                                                                }
                                                                boolean z12 = z11;
                                                                if (u6VarC.b(q1Var.D().d(), obj5)) {
                                                                    str3 = str4;
                                                                    obj3 = obj4;
                                                                    i19 = i22;
                                                                    this.f36575h.d(q1Var);
                                                                    z11 = z12;
                                                                } else {
                                                                    Object objP4 = k2Var4.p(q1Var);
                                                                    if (objP4 == null) {
                                                                        str3 = str4;
                                                                        obj3 = obj4;
                                                                        i19 = i22;
                                                                        z11 = z12;
                                                                    } else if (objP4 instanceof l2) {
                                                                        l2 l2Var3 = (l2) objP4;
                                                                        Object[] objArr8 = l2Var3.f12171b;
                                                                        long[] jArr7 = l2Var3.f12170a;
                                                                        int length4 = jArr7.length - 2;
                                                                        if (length4 >= 0) {
                                                                            i19 = i22;
                                                                            int i28 = 0;
                                                                            while (true) {
                                                                                long j16 = jArr7[i28];
                                                                                str3 = str4;
                                                                                obj3 = obj4;
                                                                                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                    if (i28 != length4) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i28++;
                                                                                    str4 = str3;
                                                                                    obj4 = obj3;
                                                                                    i24 = 8;
                                                                                } else {
                                                                                    int i29 = 8 - ((~(i28 - length4)) >>> 31);
                                                                                    for (int i30 = 0; i30 < i29; i30++) {
                                                                                        if ((j16 & 255) < 128) {
                                                                                            l2Var.C(objArr8[(i28 << 3) + i30]);
                                                                                            z12 = true;
                                                                                        }
                                                                                        j16 >>= i24;
                                                                                    }
                                                                                    if (i29 != i24) {
                                                                                        break;
                                                                                    }
                                                                                    if (i28 != length4) {
                                                                                        break;
                                                                                    }
                                                                                    i28++;
                                                                                    str4 = str3;
                                                                                    obj4 = obj3;
                                                                                    i24 = 8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str3 = str4;
                                                                            obj3 = obj4;
                                                                            i19 = i22;
                                                                        }
                                                                        z11 = z12;
                                                                    } else {
                                                                        str3 = str4;
                                                                        obj3 = obj4;
                                                                        i19 = i22;
                                                                        l2Var.C(objP4);
                                                                        z11 = true;
                                                                    }
                                                                    Unit unit = Unit.f312394a;
                                                                }
                                                            } else {
                                                                str3 = str4;
                                                                obj3 = obj4;
                                                                i18 = i27;
                                                                j13 = j15;
                                                                i19 = i22;
                                                            }
                                                            j15 = j13 >> 8;
                                                            i27 = i18 + 1;
                                                            i24 = 8;
                                                            i22 = i19;
                                                            str4 = str3;
                                                            obj4 = obj3;
                                                        }
                                                        str2 = str4;
                                                        obj2 = obj4;
                                                        boolean z13 = z11;
                                                        i16 = i22;
                                                        if (i26 != i24) {
                                                            z10 = z13;
                                                            break;
                                                        }
                                                        z11 = z13;
                                                    } else {
                                                        str2 = str4;
                                                        obj2 = obj4;
                                                        i16 = i22;
                                                    }
                                                    if (i25 == length3) {
                                                        z10 = z11;
                                                        break;
                                                    }
                                                    i25++;
                                                    length2 = i14;
                                                    i21 = i15;
                                                    i22 = i16;
                                                    str4 = str2;
                                                    obj4 = obj2;
                                                    i24 = 8;
                                                }
                                            } else {
                                                str2 = str4;
                                                obj2 = obj4;
                                                i14 = length2;
                                                i15 = i21;
                                                j12 = j14;
                                                i16 = i22;
                                            }
                                        } else {
                                            str2 = str4;
                                            obj2 = obj4;
                                            i14 = length2;
                                            i15 = i21;
                                            j12 = j14;
                                            i16 = i22;
                                            q1<?> q1Var2 = (q1) objP3;
                                            Object obj6 = map.get(q1Var2);
                                            u6<?> u6VarC2 = q1Var2.c();
                                            if (u6VarC2 == null) {
                                                u6VarC2 = w6.z();
                                            }
                                            if (u6VarC2.b(q1Var2.D().d(), obj6)) {
                                                this.f36575h.d(q1Var2);
                                            } else {
                                                Object objP5 = k2Var4.p(q1Var2);
                                                if (objP5 != null) {
                                                    if (objP5 instanceof l2) {
                                                        l2 l2Var4 = (l2) objP5;
                                                        Object[] objArr9 = l2Var4.f12171b;
                                                        long[] jArr8 = l2Var4.f12170a;
                                                        int length5 = jArr8.length - 2;
                                                        if (length5 >= 0) {
                                                            int i31 = 0;
                                                            while (true) {
                                                                long j17 = jArr8[i31];
                                                                if ((((~j17) << 7) & j17 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                    if (i31 != length5) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i31++;
                                                                } else {
                                                                    int i32 = 8 - ((~(i31 - length5)) >>> 31);
                                                                    for (int i33 = 0; i33 < i32; i33++) {
                                                                        if ((j17 & 255) < 128) {
                                                                            l2Var.C(objArr9[(i31 << 3) + i33]);
                                                                            z10 = true;
                                                                        }
                                                                        j17 >>= 8;
                                                                    }
                                                                    if (i32 != 8) {
                                                                        break;
                                                                    }
                                                                    if (i31 != length5) {
                                                                        break;
                                                                    }
                                                                    i31++;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        l2Var.C(objP5);
                                                        z10 = true;
                                                    }
                                                }
                                                Unit unit2 = Unit.f312394a;
                                            }
                                        }
                                        obj = obj2;
                                    } else {
                                        str2 = str4;
                                        i14 = length2;
                                        i15 = i21;
                                        j12 = j14;
                                        i16 = i22;
                                        obj = obj4;
                                    }
                                    Object objP6 = k2Var4.p(obj);
                                    if (objP6 != null) {
                                        if (objP6 instanceof l2) {
                                            l2 l2Var5 = (l2) objP6;
                                            Object[] objArr10 = l2Var5.f12171b;
                                            long[] jArr9 = l2Var5.f12170a;
                                            int length6 = jArr9.length - 2;
                                            if (length6 >= 0) {
                                                int i34 = 0;
                                                while (true) {
                                                    long j18 = jArr9[i34];
                                                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i34 != length6) {
                                                            break;
                                                            break;
                                                        }
                                                        i34++;
                                                    } else {
                                                        int i35 = 8 - ((~(i34 - length6)) >>> 31);
                                                        for (int i36 = 0; i36 < i35; i36++) {
                                                            if ((j18 & 255) < 128) {
                                                                l2Var.C(objArr10[(i34 << 3) + i36]);
                                                                z10 = true;
                                                            }
                                                            j18 >>= 8;
                                                        }
                                                        if (i35 != 8) {
                                                            break;
                                                        }
                                                        if (i34 != length6) {
                                                            break;
                                                        }
                                                        i34++;
                                                    }
                                                }
                                            }
                                        } else {
                                            l2Var.C(objP6);
                                            z10 = true;
                                        }
                                    }
                                    i17 = 8;
                                } else {
                                    objArr5 = objArr6;
                                    str2 = str4;
                                    i14 = length2;
                                    i15 = i21;
                                    j12 = j14;
                                    i16 = i22;
                                    i17 = i20;
                                }
                                j14 = j12 >> i17;
                                i23++;
                                i20 = i17;
                                jArr5 = jArr5;
                                objArr6 = objArr5;
                                length2 = i14;
                                i21 = i15;
                                i22 = i16;
                                str4 = str2;
                            }
                            jArr4 = jArr5;
                            objArr4 = objArr6;
                            str = str4;
                            int i37 = length2;
                            int i38 = i21;
                            if (i22 != i20) {
                                break;
                            }
                            length2 = i37;
                            i13 = i38;
                        } else {
                            jArr4 = jArr5;
                            objArr4 = objArr6;
                            str = str4;
                            i13 = i21;
                        }
                        if (i13 == length2) {
                            break;
                        }
                        i21 = i13 + 1;
                        jArr5 = jArr4;
                        objArr6 = objArr4;
                        str4 = str;
                        i20 = 8;
                    }
                } else {
                    z10 = false;
                }
            } else {
                Iterator it3 = set.iterator();
                z10 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (next instanceof d1) {
                        i.a aVar2 = i.f36500b;
                        if (((d1) next).a(i.b(2))) {
                            if (androidx.compose.runtime.collection.h.h(k2Var3, next) || (objP2 = k2Var3.p(next)) == null) {
                                it = it3;
                                k2Var = k2Var3;
                            } else if (objP2 instanceof l2) {
                                l2 l2Var6 = (l2) objP2;
                                Object[] objArr11 = l2Var6.f12171b;
                                long[] jArr10 = l2Var6.f12170a;
                                int length7 = jArr10.length - 2;
                                if (length7 >= 0) {
                                    int i39 = 0;
                                    while (true) {
                                        long j19 = jArr10[i39];
                                        if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i40 = 8 - ((~(i39 - length7)) >>> 31);
                                            int i41 = 0;
                                            while (i41 < i40) {
                                                if ((j19 & 255) < 128) {
                                                    it2 = it3;
                                                    q1<?> q1Var3 = (q1) objArr11[(i39 << 3) + i41];
                                                    k2Var2 = k2Var3;
                                                    Intrinsics.checkNotNull(q1Var3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                    Object obj7 = map.get(q1Var3);
                                                    u6<?> u6VarC3 = q1Var3.c();
                                                    if (u6VarC3 == null) {
                                                        u6VarC3 = w6.z();
                                                    }
                                                    jArr3 = jArr10;
                                                    objArr3 = objArr11;
                                                    if (u6VarC3.b(q1Var3.D().d(), obj7)) {
                                                        j11 = j19;
                                                        this.f36575h.d(q1Var3);
                                                    } else {
                                                        Object objP7 = k2Var4.p(q1Var3);
                                                        if (objP7 == null) {
                                                            j11 = j19;
                                                        } else if (objP7 instanceof l2) {
                                                            l2 l2Var7 = (l2) objP7;
                                                            Object[] objArr12 = l2Var7.f12171b;
                                                            long[] jArr11 = l2Var7.f12170a;
                                                            int length8 = jArr11.length - 2;
                                                            if (length8 >= 0) {
                                                                int i42 = 0;
                                                                while (true) {
                                                                    long j20 = jArr11[i42];
                                                                    j11 = j19;
                                                                    boolean z14 = z10;
                                                                    if ((((~j20) << 7) & j20 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                        z10 = z14;
                                                                        if (i42 != length8) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i42++;
                                                                        j19 = j11;
                                                                    } else {
                                                                        int i43 = 8 - ((~(i42 - length8)) >>> 31);
                                                                        int i44 = 0;
                                                                        while (i44 < i43) {
                                                                            if ((j20 & 255) < 128) {
                                                                                l2Var.C(objArr12[(i42 << 3) + i44]);
                                                                                z14 = true;
                                                                            }
                                                                            i44++;
                                                                            j20 >>= 8;
                                                                        }
                                                                        if (i43 != 8) {
                                                                            z10 = z14;
                                                                            break;
                                                                        }
                                                                        z10 = z14;
                                                                        if (i42 != length8) {
                                                                            break;
                                                                        }
                                                                        i42++;
                                                                        j19 = j11;
                                                                    }
                                                                }
                                                            } else {
                                                                j11 = j19;
                                                            }
                                                        } else {
                                                            j11 = j19;
                                                            l2Var.C(objP7);
                                                            z10 = true;
                                                        }
                                                        Unit unit3 = Unit.f312394a;
                                                    }
                                                } else {
                                                    it2 = it3;
                                                    k2Var2 = k2Var3;
                                                    jArr3 = jArr10;
                                                    objArr3 = objArr11;
                                                    j11 = j19;
                                                }
                                                j19 = j11 >> 8;
                                                i41++;
                                                it3 = it2;
                                                k2Var3 = k2Var2;
                                                jArr10 = jArr3;
                                                objArr11 = objArr3;
                                            }
                                            it = it3;
                                            k2Var = k2Var3;
                                            jArr2 = jArr10;
                                            objArr2 = objArr11;
                                            if (i40 != 8) {
                                                break;
                                            }
                                        } else {
                                            it = it3;
                                            k2Var = k2Var3;
                                            jArr2 = jArr10;
                                            objArr2 = objArr11;
                                        }
                                        if (i39 == length7) {
                                            break;
                                        }
                                        i39++;
                                        it3 = it;
                                        k2Var3 = k2Var;
                                        jArr10 = jArr2;
                                        objArr11 = objArr2;
                                    }
                                } else {
                                    it = it3;
                                    k2Var = k2Var3;
                                }
                            } else {
                                it = it3;
                                k2Var = k2Var3;
                                q1<?> q1Var4 = (q1) objP2;
                                Object obj8 = map.get(q1Var4);
                                u6<?> u6VarC4 = q1Var4.c();
                                if (u6VarC4 == null) {
                                    u6VarC4 = w6.z();
                                }
                                if (u6VarC4.b(q1Var4.D().d(), obj8)) {
                                    this.f36575h.d(q1Var4);
                                } else {
                                    Object objP8 = k2Var4.p(q1Var4);
                                    if (objP8 != null) {
                                        if (objP8 instanceof l2) {
                                            l2 l2Var8 = (l2) objP8;
                                            Object[] objArr13 = l2Var8.f12171b;
                                            long[] jArr12 = l2Var8.f12170a;
                                            int length9 = jArr12.length - 2;
                                            if (length9 >= 0) {
                                                int i45 = 0;
                                                while (true) {
                                                    long j21 = jArr12[i45];
                                                    if ((((~j21) << 7) & j21 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i45 != length9) {
                                                            break;
                                                            break;
                                                        }
                                                        i45++;
                                                    } else {
                                                        int i46 = 8 - ((~(i45 - length9)) >>> 31);
                                                        for (int i47 = 0; i47 < i46; i47++) {
                                                            if ((j21 & 255) < 128) {
                                                                l2Var.C(objArr13[(i45 << 3) + i47]);
                                                                z10 = true;
                                                            }
                                                            j21 >>= 8;
                                                        }
                                                        if (i46 != 8) {
                                                            break;
                                                        }
                                                        if (i45 != length9) {
                                                            break;
                                                        }
                                                        i45++;
                                                    }
                                                }
                                            }
                                        } else {
                                            l2Var.C(objP8);
                                            z10 = true;
                                        }
                                    }
                                    Unit unit4 = Unit.f312394a;
                                }
                            }
                            objP = k2Var4.p(next);
                            if (objP == null) {
                                if (objP instanceof l2) {
                                    l2 l2Var9 = (l2) objP;
                                    objArr = l2Var9.f12171b;
                                    jArr = l2Var9.f12170a;
                                    length = jArr.length - 2;
                                    if (length >= 0) {
                                        i10 = 0;
                                        while (true) {
                                            j10 = jArr[i10];
                                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                i11 = 8 - ((~(i10 - length)) >>> 31);
                                                for (i12 = 0; i12 < i11; i12++) {
                                                    if ((j10 & 255) < 128) {
                                                        l2Var.C(objArr[(i10 << 3) + i12]);
                                                        z10 = true;
                                                    }
                                                    j10 >>= 8;
                                                }
                                                if (i11 == 8) {
                                                    break;
                                                }
                                            }
                                            if (i10 != length) {
                                                break;
                                            }
                                            i10++;
                                        }
                                    }
                                } else {
                                    l2Var.C(objP);
                                    z10 = true;
                                }
                            }
                        } else {
                            it = it3;
                            k2Var = k2Var3;
                        }
                    } else {
                        if (androidx.compose.runtime.collection.h.h(k2Var3, next)) {
                            it = it3;
                            k2Var = k2Var3;
                        } else {
                            it = it3;
                            k2Var = k2Var3;
                        }
                        objP = k2Var4.p(next);
                        if (objP == null) {
                            if (objP instanceof l2) {
                                l2 l2Var10 = (l2) objP;
                                objArr = l2Var10.f12171b;
                                jArr = l2Var10.f12170a;
                                length = jArr.length - 2;
                                if (length >= 0) {
                                    i10 = 0;
                                    while (true) {
                                        j10 = jArr[i10];
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            i11 = 8 - ((~(i10 - length)) >>> 31);
                                            while (i12 < i11) {
                                                if ((j10 & 255) < 128) {
                                                    l2Var.C(objArr[(i10 << 3) + i12]);
                                                    z10 = true;
                                                }
                                                j10 >>= 8;
                                            }
                                            if (i11 == 8) {
                                                break;
                                                break;
                                            }
                                        }
                                        if (i10 != length) {
                                            break;
                                            break;
                                        }
                                        i10++;
                                    }
                                }
                            } else {
                                l2Var.C(objP);
                                z10 = true;
                            }
                        }
                    }
                    it3 = it;
                    k2Var3 = k2Var;
                }
            }
            if (this.f36575h.R() != 0) {
                androidx.compose.runtime.collection.d<q1<?>> dVar = this.f36575h;
                q1<?>[] q1VarArr = dVar.f35552a;
                int iR = dVar.R();
                for (int i48 = 0; i48 < iR; i48++) {
                    p(q1VarArr[i48]);
                }
                this.f36575h.r();
            }
            return z10;
        }

        public final void l(@NotNull Object obj) {
            Object obj2 = this.f36569b;
            Intrinsics.checkNotNull(obj2);
            int i10 = this.f36571d;
            f2<Object> f2Var = this.f36570c;
            if (f2Var == null) {
                f2Var = new f2<>(0, 1, null);
                this.f36570c = f2Var;
                this.f36573f.q0(obj2, f2Var);
                Unit unit = Unit.f312394a;
            }
            m(obj, i10, obj2, f2Var);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0066->B:28:0x009f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:49:0x00ae A[EDGE_INSN: B:49:0x00ae->B:30:0x00ae BREAK  A[LOOP:2: B:16:0x0066->B:28:0x009f], SYNTHETIC] */
        public final void o(@NotNull Function1<Object, Boolean> function1) {
            long[] jArr;
            long[] jArr2;
            long j10;
            char c10;
            long j11;
            int i10;
            k2<Object, f2<Object>> k2Var = this.f36573f;
            long[] jArr3 = k2Var.f12130a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j12 = jArr3[i11];
                char c11 = 7;
                long j13 = -9187201950435737472L;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j12 & 255) < 128) {
                            int i15 = (i11 << 3) + i14;
                            c10 = c11;
                            Object obj = k2Var.f12131b[i15];
                            j11 = j13;
                            f2 f2Var = (f2) k2Var.f12132c[i15];
                            Boolean boolInvoke = function1.invoke(obj);
                            if (boolInvoke.booleanValue()) {
                                Object[] objArr = f2Var.f12437b;
                                int[] iArr = f2Var.f12438c;
                                long[] jArr4 = f2Var.f12436a;
                                int i16 = i12;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j10 = j12;
                                    int i17 = 0;
                                    while (true) {
                                        long j14 = jArr4[i17];
                                        long[] jArr5 = jArr4;
                                        if ((((~j14) << c10) & j14 & j11) != j11) {
                                            int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                            for (int i19 = 0; i19 < i18; i19++) {
                                                if ((j14 & 255) < 128) {
                                                    int i20 = (i17 << 3) + i19;
                                                    Object obj2 = objArr[i20];
                                                    int i21 = iArr[i20];
                                                    n(obj, obj2);
                                                }
                                                j14 >>= i16;
                                            }
                                            if (i18 != i16) {
                                                break;
                                            }
                                            if (i17 != length2) {
                                                break;
                                            }
                                            i17++;
                                            jArr4 = jArr5;
                                            i16 = 8;
                                        } else if (i17 != length2) {
                                            break;
                                            break;
                                        } else {
                                            i17++;
                                            jArr4 = jArr5;
                                            i16 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j10 = j12;
                                }
                            } else {
                                jArr2 = jArr3;
                                j10 = j12;
                            }
                            if (boolInvoke.booleanValue()) {
                                k2Var.o0(i15);
                            }
                            i10 = 8;
                        } else {
                            jArr2 = jArr3;
                            j10 = j12;
                            c10 = c11;
                            j11 = j13;
                            i10 = i12;
                        }
                        i14++;
                        i12 = i10;
                        j12 = j10 >> i10;
                        c11 = c10;
                        j13 = j11;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i13 != i12) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i11 == length) {
                    return;
                }
                i11++;
                jArr3 = jArr;
            }
        }

        public final void p(@NotNull q1<?> q1Var) {
            long[] jArr;
            f2<Object> f2Var;
            k2<Object, f2<Object>> k2Var = this.f36573f;
            int iHashCode = Long.hashCode(b0.N().p());
            Object objP = this.f36572e.p(q1Var);
            if (objP == null) {
                return;
            }
            if (!(objP instanceof l2)) {
                f2<Object> f2VarP = k2Var.p(objP);
                if (f2VarP == null) {
                    f2VarP = new f2<>(0, 1, null);
                    k2Var.q0(objP, f2VarP);
                    Unit unit = Unit.f312394a;
                }
                m(q1Var, iHashCode, objP, f2VarP);
                return;
            }
            l2 l2Var = (l2) objP;
            Object[] objArr = l2Var.f12171b;
            long[] jArr2 = l2Var.f12170a;
            int length = jArr2.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j10 = jArr2[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j10 & 255) < 128) {
                            Object obj = objArr[(i10 << 3) + i13];
                            f2<Object> f2VarP2 = k2Var.p(obj);
                            if (f2VarP2 == null) {
                                f2Var = new f2<>(0, 1, null);
                                k2Var.q0(obj, f2Var);
                                Unit unit2 = Unit.f312394a;
                            } else {
                                f2Var = f2VarP2;
                            }
                            m(q1Var, iHashCode, obj, f2Var);
                        }
                        j10 >>= i11;
                        i13++;
                        i11 = i11;
                        jArr2 = jArr2;
                    }
                    jArr = jArr2;
                    if (i12 != i11) {
                        return;
                    }
                } else {
                    jArr = jArr2;
                }
                if (i10 == length) {
                    return;
                }
                i10++;
                jArr2 = jArr;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q0(@NotNull Function1<? super Function0<Unit>, Unit> function1) {
        this.f36557a = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d(Set<? extends Object> set) {
        Object obj;
        List listPlus;
        do {
            obj = this.f36558b.get();
            if (obj == null) {
                listPlus = set;
            } else if (obj instanceof Set) {
                listPlus = CollectionsKt.listOf((Object[]) new Set[]{obj, set});
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new kotlin.a0();
                }
                listPlus = CollectionsKt.plus((Collection) obj, (Iterable) CollectionsKt.listOf(set));
            }
        } while (!z1.a(this.f36558b, obj, listPlus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(q0 q0Var, Set set, m mVar) {
        q0Var.d(set);
        if (q0Var.i()) {
            q0Var.r();
        }
        return Unit.f312394a;
    }

    private final boolean i() {
        boolean z10;
        synchronized (this.f36563g) {
            z10 = this.f36559c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            Set<? extends Object> setO = o();
            if (setO == null) {
                return z11;
            }
            synchronized (this.f36563g) {
                try {
                    androidx.compose.runtime.collection.d<a> dVar = this.f36562f;
                    a[] aVarArr = dVar.f35552a;
                    int iR = dVar.R();
                    for (int i10 = 0; i10 < iR; i10++) {
                        z11 = aVarArr[i10].k(setO) || z11;
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final <T> a j(Function1<? super T, Unit> function1) {
        a aVar;
        androidx.compose.runtime.collection.d<a> dVar = this.f36562f;
        a[] aVarArr = dVar.f35552a;
        int iR = dVar.R();
        int i10 = 0;
        while (true) {
            if (i10 >= iR) {
                aVar = null;
                break;
            }
            aVar = aVarArr[i10];
            if (aVar.g() == function1) {
                break;
            }
            i10++;
        }
        a aVar2 = aVar;
        if (aVar2 != null) {
            return aVar2;
        }
        Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        a aVar3 = new a((Function1) kotlin.jvm.internal.r1.q(function1, 1));
        this.f36562f.d(aVar3);
        return aVar3;
    }

    private final void k(Function1<? super a, Unit> function1) {
        synchronized (this.f36563g) {
            try {
                androidx.compose.runtime.collection.d<a> dVar = this.f36562f;
                a[] aVarArr = dVar.f35552a;
                int iR = dVar.R();
                for (int i10 = 0; i10 < iR; i10++) {
                    function1.invoke(aVarArr[i10]);
                }
                Unit unit = Unit.f312394a;
                kotlin.jvm.internal.h0.d(1);
            } finally {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(q0 q0Var, Object obj) {
        if (!q0Var.f36565i) {
            synchronized (q0Var.f36563g) {
                try {
                    a aVar = q0Var.f36566j;
                    Intrinsics.checkNotNull(aVar);
                    aVar.l(obj);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Unit.f312394a;
    }

    private final Set<Object> o() {
        Object obj;
        Object objSubList;
        Set<Object> set;
        do {
            obj = this.f36558b.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new kotlin.a0();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!z1.a(this.f36558b, obj, objSubList));
        return set;
    }

    private final void p(Function1<? super a, Boolean> function1) {
        synchronized (this.f36563g) {
            try {
                androidx.compose.runtime.collection.d<a> dVar = this.f36562f;
                int iR = dVar.R();
                int i10 = 0;
                for (int i11 = 0; i11 < iR; i11++) {
                    if (function1.invoke(dVar.f35552a[i11]).booleanValue()) {
                        i10++;
                    } else if (i10 > 0) {
                        a[] aVarArr = dVar.f35552a;
                        aVarArr[i11 - i10] = aVarArr[i11];
                    }
                }
                int i12 = iR - i10;
                ArraysKt.fill(dVar.f35552a, (Object) null, i12, iR);
                dVar.z0(i12);
                Unit unit = Unit.f312394a;
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
    }

    private final Void q() {
        androidx.compose.runtime.m0.z("Unexpected notification");
        throw new kotlin.a0();
    }

    private final void r() {
        this.f36557a.invoke(new Function0() { // from class: androidx.compose.runtime.snapshots.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return q0.s(this.f36545a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(q0 q0Var) {
        Unit unit;
        do {
            synchronized (q0Var.f36563g) {
                try {
                    if (!q0Var.f36559c) {
                        q0Var.f36559c = true;
                        try {
                            androidx.compose.runtime.collection.d<a> dVar = q0Var.f36562f;
                            a[] aVarArr = dVar.f35552a;
                            int iR = dVar.R();
                            for (int i10 = 0; i10 < iR; i10++) {
                                aVarArr[i10].i();
                            }
                            q0Var.f36559c = false;
                        } catch (Throwable th2) {
                            q0Var.f36559c = false;
                            throw th2;
                        }
                    }
                    unit = Unit.f312394a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } while (q0Var.i());
        return unit;
    }

    public final void f() {
        synchronized (this.f36563g) {
            try {
                androidx.compose.runtime.collection.d<a> dVar = this.f36562f;
                a[] aVarArr = dVar.f35552a;
                int iR = dVar.R();
                for (int i10 = 0; i10 < iR; i10++) {
                    aVarArr[i10].c();
                }
                Unit unit = Unit.f312394a;
            } finally {
            }
        }
    }

    public final void g(@NotNull Object obj) {
        synchronized (this.f36563g) {
            try {
                androidx.compose.runtime.collection.d<a> dVar = this.f36562f;
                int iR = dVar.R();
                int i10 = 0;
                for (int i11 = 0; i11 < iR; i11++) {
                    a aVar = dVar.f35552a[i11];
                    aVar.e(obj);
                    if (!aVar.h()) {
                        i10++;
                    } else if (i10 > 0) {
                        a[] aVarArr = dVar.f35552a;
                        aVarArr[i11 - i10] = aVarArr[i11];
                    }
                }
                int i12 = iR - i10;
                ArraysKt.fill(dVar.f35552a, (Object) null, i12, iR);
                dVar.z0(i12);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(@NotNull Function1<Object, Boolean> function1) {
        synchronized (this.f36563g) {
            try {
                androidx.compose.runtime.collection.d<a> dVar = this.f36562f;
                int iR = dVar.R();
                int i10 = 0;
                for (int i11 = 0; i11 < iR; i11++) {
                    a aVar = dVar.f35552a[i11];
                    aVar.o(function1);
                    if (!aVar.h()) {
                        i10++;
                    } else if (i10 > 0) {
                        a[] aVarArr = dVar.f35552a;
                        aVarArr[i11 - i10] = aVarArr[i11];
                    }
                }
                int i12 = iR - i10;
                ArraysKt.fill(dVar.f35552a, (Object) null, i12, iR);
                dVar.z0(i12);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @lm.n
    public final void l(@NotNull Set<? extends Object> set, @NotNull m mVar) {
        this.f36560d.invoke(set, mVar);
    }

    public final <T> void m(@NotNull T t10, @NotNull Function1<? super T, Unit> function1, @NotNull Function0<Unit> function0) {
        a aVarJ;
        synchronized (this.f36563g) {
            try {
                aVarJ = j(function1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean z10 = this.f36565i;
        a aVar = this.f36566j;
        long j10 = this.f36567k;
        if (j10 != -1) {
            if (!(j10 == androidx.compose.runtime.internal.a1.a())) {
                f4.d("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j10 + "), currentThread={id=" + androidx.compose.runtime.internal.a1.a() + ", name=" + androidx.compose.runtime.internal.a1.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.f36565i = false;
            this.f36566j = aVarJ;
            this.f36567k = androidx.compose.runtime.internal.a1.a();
            aVarJ.j(t10, this.f36561e, function0);
            this.f36566j = aVar;
            this.f36565i = z10;
            this.f36567k = j10;
        } catch (Throwable th3) {
            this.f36566j = aVar;
            this.f36565i = z10;
            this.f36567k = j10;
            throw th3;
        }
    }

    public final void t() {
        this.f36564h = m.f36535e.r(this.f36560d);
    }

    public final void u() {
        h hVar = this.f36564h;
        if (hVar != null) {
            hVar.dispose();
        }
    }

    @kotlin.l(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @kotlin.b1(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void v(@NotNull Function0<Unit> function0) {
        boolean z10 = this.f36565i;
        this.f36565i = true;
        try {
            function0.invoke();
        } finally {
            this.f36565i = z10;
        }
    }
}
