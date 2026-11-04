package androidx.compose.foundation.lazy.layout;

import androidx.collection.d3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.media3.exoplayer.a5;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,97:1\n231#2,3:98\n200#2,7:101\n211#2,3:109\n214#2,9:113\n234#2:122\n1399#3:108\n1270#3:112\n1282#4,6:123\n66#5,5:129\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n*L\n70#1:98,3\n70#1:101,7\n70#1:109,3\n70#1:113,9\n70#1:122\n70#1:108\n70#1:112\n77#1:123,6\n79#1:129,5\n*E\n"})
final class e2 implements androidx.compose.runtime.saveable.v, androidx.compose.runtime.saveable.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f17373d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.saveable.v f17374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.saveable.m f17375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.collection.l2<Object> f17376c;

    @SourceDebugExtension({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map d(androidx.compose.runtime.saveable.g0 g0Var, e2 e2Var) {
            Map<String, List<Object>> mapC = e2Var.c();
            if (mapC.isEmpty()) {
                mapC = null;
            }
            return mapC;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e2 e(androidx.compose.runtime.saveable.v vVar, androidx.compose.runtime.saveable.m mVar, Map map) {
            return new e2(vVar, map, mVar);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<e2, Map<String, List<Object>>> c(@Nullable final androidx.compose.runtime.saveable.v vVar, @NotNull final androidx.compose.runtime.saveable.m mVar) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.foundation.lazy.layout.c2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e2.a.d((androidx.compose.runtime.saveable.g0) obj, (e2) obj2);
                }
            }, new Function1() { // from class: androidx.compose.foundation.lazy.layout.d2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e2.a.e(vVar, mVar, (Map) obj);
                }
            });
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n*L\n1#1,69:1\n79#2:70\n*E\n"})
    public static final class b implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f17378b;

        public b(Object obj) {
            this.f17378b = obj;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            e2.this.f17376c.d0(this.f17378b);
        }
    }

    public e2(@NotNull androidx.compose.runtime.saveable.v vVar, @NotNull androidx.compose.runtime.saveable.m mVar) {
        this.f17374a = vVar;
        this.f17375b = mVar;
        this.f17376c = d3.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 j(e2 e2Var, Object obj, androidx.compose.runtime.v1 v1Var) {
        e2Var.f17376c.W(obj);
        return e2Var.new b(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(e2 e2Var, Object obj, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        e2Var.e(obj, function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(androidx.compose.runtime.saveable.v vVar, Object obj) {
        if (vVar != null) {
            return vVar.a(obj);
        }
        return true;
    }

    @Override // androidx.compose.runtime.saveable.v
    public boolean a(@NotNull Object obj) {
        return this.f17374a.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.v
    @NotNull
    public androidx.compose.runtime.saveable.v.a b(@NotNull String str, @NotNull Function0<? extends Object> function0) {
        return this.f17374a.b(str, function0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[LOOP:0: B:5:0x0011->B:16:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0055 A[EDGE_INSN: B:20:0x0055->B:17:0x0055 BREAK  A[LOOP:0: B:5:0x0011->B:16:0x0052], SYNTHETIC] */
    @Override // androidx.compose.runtime.saveable.v
    @NotNull
    public Map<String, List<Object>> c() {
        androidx.collection.l2<Object> l2Var = this.f17376c;
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
                            this.f17375b.d(objArr[(i10 << 3) + i12]);
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
        return this.f17374a.c();
    }

    @Override // androidx.compose.runtime.saveable.m
    public void d(@NotNull Object obj) {
        this.f17375b.d(obj);
    }

    @Override // androidx.compose.runtime.saveable.m
    @androidx.compose.runtime.o
    public void e(@NotNull final Object obj, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-858296452);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.k0(this) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                int i12 = 5 & (-1);
                androidx.compose.runtime.m0.A0(-858296452, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:74)");
            }
            int i13 = i11 & 14;
            this.f17375b.e(obj, function2, c0VarR, i11 & okhttp3.internal.ws.g.f334652s);
            boolean zK0 = c0VarR.k0(this) | c0VarR.k0(obj);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.lazy.layout.z1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return e2.j(this.f17628a, obj, (androidx.compose.runtime.v1) obj2);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.runtime.b2.d(obj, (Function1) objI0, c0VarR, i13);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.layout.a2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return e2.k(this.f17312a, obj, function2, i10, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.runtime.saveable.v
    @Nullable
    public Object f(@NotNull String str) {
        return this.f17374a.f(str);
    }

    public e2(@Nullable final androidx.compose.runtime.saveable.v vVar, @Nullable Map<String, ? extends List<? extends Object>> map, @NotNull androidx.compose.runtime.saveable.m mVar) {
        this(androidx.compose.runtime.saveable.y.c(map, new Function1() { // from class: androidx.compose.foundation.lazy.layout.b2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(e2.l(vVar, obj));
            }
        }), mVar);
    }
}
