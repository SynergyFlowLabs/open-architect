package androidx.compose.runtime.saveable;

import androidx.collection.b3;
import androidx.collection.k2;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n4;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.media3.exoplayer.a5;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,129:1\n142#2,3:130\n145#2,2:145\n1282#3,6:133\n1282#3,6:139\n357#4,4:147\n329#4,6:151\n339#4,3:158\n342#4,9:162\n361#4:171\n1399#5:157\n1270#5:161\n1#6:172\n66#7,5:173\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n*L\n72#1:130,3\n72#1:145,2\n73#1:133,6\n87#1:139,6\n102#1:147,4\n102#1:151,6\n102#1:158,3\n102#1:162,9\n102#1:171\n102#1:157\n102#1:161\n91#1:173,5\n*E\n"})
final class s implements m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f36418e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final c0<s, ?> f36419f = f0.e(new Function2() { // from class: androidx.compose.runtime.saveable.q
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return s.j((g0) obj, (s) obj2);
        }
    }, new Function1() { // from class: androidx.compose.runtime.saveable.r
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return s.k((Map) obj);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Object, Map<String, List<Object>>> f36420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k2<Object, v> f36421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private v f36422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<Object, Boolean> f36423d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c0<s, ?> a() {
            return s.f36419f;
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n*L\n1#1,69:1\n92#2,4:70\n*E\n"})
    public static final class b implements u1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f36425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0 f36426c;

        public b(Object obj, a0 a0Var) {
            this.f36425b = obj;
            this.f36426c = a0Var;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            Object objL0 = s.this.f36421b.l0(this.f36425b);
            a0 a0Var = this.f36426c;
            if (objL0 == a0Var) {
                s sVar = s.this;
                sVar.s(a0Var, sVar.f36420a, this.f36425b);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 h(s sVar, Object obj, a0 a0Var, v1 v1Var) {
        if (!sVar.f36421b.f(obj)) {
            sVar.f36420a.remove(obj);
            sVar.f36421b.q0(obj, a0Var);
            return sVar.new b(obj, a0Var);
        }
        throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(s sVar, Object obj, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        sVar.e(obj, function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map j(g0 g0Var, s sVar) {
        return sVar.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s k(Map map) {
        return new s(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(s sVar, Object obj) {
        v vVar = sVar.f36422c;
        if (vVar != null) {
            return vVar.a(obj);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0054 A[LOOP:0: B:5:0x0013->B:15:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[EDGE_INSN: B:22:0x0057->B:16:0x0057 BREAK  A[LOOP:0: B:5:0x0013->B:15:0x0054], SYNTHETIC] */
    private final Map<Object, Map<String, List<Object>>> r() {
        Map<Object, Map<String, List<Object>>> map = this.f36420a;
        k2<Object, v> k2Var = this.f36421b;
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
                            s((v) objArr2[i13], map, objArr[i13]);
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
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(v vVar, Map<Object, Map<String, List<Object>>> map, Object obj) {
        Map<String, List<Object>> mapC = vVar.c();
        if (mapC.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, mapC);
        }
    }

    @Override // androidx.compose.runtime.saveable.m
    public void d(@NotNull Object obj) {
        if (this.f36421b.l0(obj) == null) {
            this.f36420a.remove(obj);
        }
    }

    @Override // androidx.compose.runtime.saveable.m
    @androidx.compose.runtime.o
    public void e(@NotNull final Object obj, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(533563200);
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
            if (m0.l0()) {
                m0.A0(533563200, i11, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:70)");
            }
            c0VarR.r(m0.f36245r, obj);
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                if (!this.f36423d.invoke(obj).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                objI0 = new a0(y.c(this.f36420a.get(obj), this.f36423d));
                c0VarR.Y(objI0);
            }
            final a0 a0Var = (a0) objI0;
            a1.f(new n4[]{y.g().f(a0Var), s3.b.c().f(a0Var)}, function2, c0VarR, (i11 & com.planner5d.library.engine.input.f.b.B) | n4.f36267i);
            Unit unit = Unit.f312394a;
            boolean zK0 = c0VarR.k0(this) | c0VarR.k0(obj) | c0VarR.k0(a0Var);
            Object objI1 = c0VarR.i0();
            if (zK0 || objI1 == aVar.a()) {
                objI1 = new Function1() { // from class: androidx.compose.runtime.saveable.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return s.h(this.f36411a, obj, a0Var, (v1) obj2);
                    }
                };
                c0VarR.Y(objI1);
            }
            b2.d(unit, (Function1) objI1, c0VarR, 6);
            c0VarR.g0();
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.saveable.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return s.i(this.f36414a, obj, function2, i10, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    @Nullable
    public final v q() {
        return this.f36422c;
    }

    public final void t(@Nullable v vVar) {
        this.f36422c = vVar;
    }

    public s(@NotNull Map<Object, Map<String, List<Object>>> map) {
        this.f36420a = map;
        this.f36421b = b3.u();
        this.f36423d = new Function1() { // from class: androidx.compose.runtime.saveable.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(s.p(this.f36410a, obj));
            }
        };
    }

    public /* synthetic */ s(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
