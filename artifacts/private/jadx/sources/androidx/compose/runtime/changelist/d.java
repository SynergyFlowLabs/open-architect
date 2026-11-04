package androidx.compose.runtime.changelist;

import androidx.compose.runtime.h3;
import androidx.compose.runtime.i3;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.internal.x0;
import androidx.compose.runtime.l1;
import androidx.compose.runtime.l5;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n5;
import androidx.compose.runtime.o0;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.s4;
import androidx.compose.runtime.u4;
import androidx.compose.runtime.v3;
import androidx.compose.runtime.w5;
import androidx.compose.runtime.z5;
import io.ktor.http.t1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation\n+ 2 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n*L\n1#1,1151:1\n1104#2,6:1152\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation\n*L\n61#1:1152,6\n*E\n"})
public abstract class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35445c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35447b;

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n1#1,1151:1\n131#1:1152\n131#1:1153\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n135#1:1152\n145#1:1153\n*E\n"})
    public static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f35448d = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35449e = 0;

        private a() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            z5Var.B(fVar.getInt(0));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String g(int i10) {
            return i10 == 0 ? "distance" : super.g(i10);
        }

        public final int i() {
            return 0;
        }
    }

    @w0(parameters = 1)
    public static final class a0 extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a0 f35450d = new a0();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35451e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private a0() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            z5Var.j1();
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n*L\n1#1,1151:1\n257#1:1152\n260#1:1153\n257#1:1154\n260#1:1155\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n*L\n264#1:1152\n265#1:1153\n275#1:1154\n276#1:1155\n*E\n"})
    public static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final b f35452d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35453e = 0;

        private b() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            androidx.compose.runtime.g gVar2 = (androidx.compose.runtime.g) fVar.a(t.b(0));
            Object objA = fVar.a(t.b(1));
            if (objA instanceof n5) {
                l5Var.e((n5) objA);
            }
            z5Var.F(gVar2, objA);
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            if (t.d(i10, t.b(0))) {
                return t1.a.f296107c;
            }
            return t.d(i10, t.b(1)) ? "value" : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }

        public final int j() {
            return t.b(1);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n1#1,1151:1\n154#1:1152\n154#1:1153\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n158#1:1152\n168#1:1153\n*E\n"})
    public static final class b0 extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final b0 f35454d = new b0();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35455e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private b0() {
            int i10 = 1;
            boolean z10 = false & false;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            l5Var.a((Function0) fVar.a(t.b(0)));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            return t.d(i10, t.b(0)) ? "effect" : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,1151:1\n981#1:1152\n984#1:1153\n984#1:1154\n981#1:1155\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n988#1:1152\n989#1:1153\n999#1:1154\n1001#1:1155\n*E\n"})
    public static final class c extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final c f35456d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35457e = 0;

        private c() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            androidx.compose.runtime.internal.j0 j0Var = (androidx.compose.runtime.internal.j0) fVar.a(t.b(1));
            int iA = j0Var != null ? j0Var.a() : 0;
            androidx.compose.runtime.changelist.a aVar = (androidx.compose.runtime.changelist.a) fVar.a(t.b(0));
            if (iA > 0) {
                iVar = new v3(iVar, iA);
            }
            aVar.d(iVar, z5Var, l5Var, gVar != null ? androidx.compose.runtime.changelist.i.k(gVar, z5Var) : null);
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            if (t.d(i10, t.b(0))) {
                return "changes";
            }
            return t.d(i10, t.b(1)) ? "effectiveNodeIndex" : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }

        public final int j() {
            return t.b(1);
        }
    }

    @w0(parameters = 1)
    public static final class c0 extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final c0 f35458d = new c0();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35459e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private c0() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            z5Var.s1();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.changelist.d$d, reason: collision with other inner class name */
    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1151:1\n840#1:1152\n843#1:1153\n840#1:1154\n843#1:1155\n64#2,5:1156\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n*L\n847#1:1152\n848#1:1153\n858#1:1154\n859#1:1155\n861#1:1156,5\n*E\n"})
    public static final class C0270d extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final C0270d f35460d = new C0270d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35461e = 0;

        private C0270d() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            int iA = ((androidx.compose.runtime.internal.j0) fVar.a(t.b(0))).a();
            List list = (List) fVar.a(t.b(1));
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i11 = iA + i10;
                iVar.m(i11, obj);
                iVar.l(i11, obj);
            }
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            if (t.d(i10, t.b(0))) {
                return "effectiveNodeIndex";
            }
            return t.d(i10, t.b(1)) ? "nodes" : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }

        public final int j() {
            return t.b(1);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$StartResumingScope\n*L\n1#1,1151:1\n215#1:1152\n215#1:1153\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$StartResumingScope\n*L\n219#1:1152\n229#1:1153\n*E\n"})
    public static final class d0 extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final d0 f35462d = new d0();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35463e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private d0() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            l5Var.c((s4) fVar.a(t.b(0)));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            return t.d(i10, t.b(0)) ? "scope" : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n1#1,1151:1\n872#1:1152\n875#1:1153\n878#1:1154\n881#1:1155\n878#1:1156\n881#1:1157\n875#1:1158\n872#1:1159\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n885#1:1152\n886#1:1153\n887#1:1154\n888#1:1155\n898#1:1156\n899#1:1157\n900#1:1158\n903#1:1159\n*E\n"})
    public static final class e extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final e f35464d = new e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35465e = 0;

        private e() {
            super(0, 4, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            i3 i3Var = (i3) fVar.a(t.b(2));
            i3 i3Var2 = (i3) fVar.a(t.b(3));
            p0 p0Var = (p0) fVar.a(t.b(1));
            h3 h3VarR = (h3) fVar.a(t.b(0));
            if (h3VarR == null && (h3VarR = p0Var.r(i3Var)) == null) {
                m0.z("Could not resolve state for movable content");
                throw new kotlin.a0();
            }
            List<androidx.compose.runtime.g> listO0 = z5Var.O0(1, h3VarR.f(), 2);
            s4.a aVar = s4.f36369h;
            l1 l1VarB = i3Var2.b();
            Intrinsics.checkNotNull(l1VarB, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            aVar.a(z5Var, listO0, (u4) l1VarB);
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            if (t.d(i10, t.b(0))) {
                return "resolvedState";
            }
            if (t.d(i10, t.b(1))) {
                return "resolvedCompositionContext";
            }
            if (t.d(i10, t.b(2))) {
                return "from";
            }
            return t.d(i10, t.b(3)) ? "to" : super.h(i10);
        }

        public final int i() {
            return t.b(2);
        }

        public final int j() {
            return t.b(1);
        }

        public final int k() {
            return t.b(0);
        }

        public final int l() {
            return t.b(3);
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TestOperation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1151:1\n1#2:1152\n*E\n"})
    public static final class e0 extends d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f35466g = 8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final pj.n<androidx.compose.runtime.i<?>, z5, l5, Unit> f35467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final List<Integer> f35468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final List<t<Object>> f35469f;

        @lm.n
        public e0() {
            this(0, 0, null, 7, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit j(androidx.compose.runtime.i iVar, z5 z5Var, l5 l5Var) {
            return Unit.f312394a;
        }

        public static /* synthetic */ void m() {
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            this.f35467d.invoke(iVar, z5Var, l5Var);
        }

        @NotNull
        public final pj.n<androidx.compose.runtime.i<?>, z5, l5, Unit> k() {
            return this.f35467d;
        }

        @NotNull
        public final List<Integer> l() {
            return this.f35468e;
        }

        @NotNull
        public final List<t<Object>> n() {
            return this.f35469f;
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String toString() {
            return "TestOperation(ints = " + d() + ", objects = " + f() + ")@" + x0.a(this);
        }

        public /* synthetic */ e0(int i10, int i11, pj.n nVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? new pj.n() { // from class: androidx.compose.runtime.changelist.e
                @Override // pj.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return d.e0.j((androidx.compose.runtime.i) obj, (z5) obj2, (l5) obj3);
                }
            } : nVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @lm.n
        public e0(int i10, int i11, @NotNull pj.n<? super androidx.compose.runtime.i<?>, ? super z5, ? super l5, Unit> nVar) {
            super(i10, i11, null);
            this.f35467d = nVar;
            ArrayList arrayList = new ArrayList(i10);
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(Integer.valueOf(i12));
            }
            this.f35468e = arrayList;
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i13 = 0; i13 < i11; i13++) {
                arrayList2.add(t.a(t.b(i13)));
            }
            this.f35469f = arrayList2;
        }
    }

    @w0(parameters = 1)
    public static final class f extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final f f35470d = new f();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35471e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private f() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            m0.A(z5Var, l5Var);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1#1,1151:1\n286#1:1152\n286#1:1153\n1695#2,6:1154\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n*L\n290#1:1152\n300#1:1153\n301#1:1154,6\n*E\n"})
    public static final class f0 extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final f0 f35472d = new f0();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35473e = 0;

        private f0() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            int i10 = fVar.getInt(0);
            int iK0 = z5Var.k0();
            int iZ1 = z5Var.z1(iK0);
            int iY1 = z5Var.y1(iK0);
            for (int iMax = Math.max(iZ1, iY1 - i10); iMax < iY1; iMax++) {
                Object obj = z5Var.f36879c[z5Var.S(iMax)];
                if (obj instanceof n5) {
                    l5Var.d((n5) obj);
                } else if (obj instanceof s4) {
                    ((s4) obj).C();
                }
            }
            z5Var.L1(i10);
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String g(int i10) {
            return i10 == 0 ? "count" : super.g(i10);
        }

        public final int i() {
            return 0;
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n1#1,1151:1\n807#1:1152\n810#1:1153\n807#1:1154\n810#1:1155\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n814#1:1152\n815#1:1153\n825#1:1154\n830#1:1155\n*E\n"})
    public static final class g extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final g f35474d = new g();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35475e = 0;

        private g() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            androidx.compose.runtime.internal.j0 j0Var = (androidx.compose.runtime.internal.j0) fVar.a(t.b(0));
            androidx.compose.runtime.g gVar2 = (androidx.compose.runtime.g) fVar.a(t.b(1));
            Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            j0Var.b(androidx.compose.runtime.changelist.i.i(z5Var, gVar2, iVar));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            if (t.d(i10, t.b(0))) {
                return "effectiveNodeIndexOut";
            }
            return t.d(i10, t.b(1)) ? t1.a.f296107c : super.h(i10);
        }

        public final int i() {
            return t.b(1);
        }

        public final int j() {
            return t.b(0);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n*L\n1#1,1151:1\n360#1:1152\n354#1:1153\n357#1:1154\n354#1:1155\n357#1:1156\n360#1:1157\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n*L\n364#1:1152\n370#1:1153\n371#1:1154\n381#1:1155\n382#1:1156\n383#1:1157\n*E\n"})
    public static final class g0 extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final g0 f35476d = new g0();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35477e = 0;

        private g0() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            Object objA = fVar.a(t.b(0));
            androidx.compose.runtime.g gVar2 = (androidx.compose.runtime.g) fVar.a(t.b(1));
            int i10 = fVar.getInt(0);
            if (objA instanceof n5) {
                l5Var.e((n5) objA);
            }
            Object objN1 = z5Var.n1(z5Var.E(gVar2), i10, objA);
            if (objN1 instanceof n5) {
                l5Var.d((n5) objN1);
            } else if (objN1 instanceof s4) {
                ((s4) objN1).C();
            }
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String g(int i10) {
            return i10 == 0 ? "groupSlotIndex" : super.g(i10);
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            if (t.d(i10, t.b(0))) {
                return "value";
            }
            return t.d(i10, t.b(1)) ? t1.a.f296107c : super.h(i10);
        }

        public final int i() {
            return t.b(1);
        }

        public final int j() {
            return 0;
        }

        public final int k() {
            return t.b(0);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n1#1,1151:1\n107#1:1152\n107#1:1153\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n111#1:1152\n122#1:1153\n*E\n"})
    public static final class h extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final h f35478d = new h();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35479e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private h() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) fVar.a(t.b(0))) {
                iVar.n(obj);
            }
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            return t.d(i10, t.b(0)) ? "nodes" : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n1#1,1151:1\n402#1:1152\n402#1:1153\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n406#1:1152\n416#1:1153\n*E\n"})
    public static final class h0 extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final h0 f35480d = new h0();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35481e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private h0() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            z5Var.P1(fVar.a(t.b(0)));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            return t.d(i10, t.b(0)) ? "data" : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n1#1,1151:1\n506#1:1152\n509#1:1153\n506#1:1154\n509#1:1155\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n513#1:1152\n514#1:1153\n524#1:1154\n525#1:1155\n*E\n"})
    public static final class i extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final i f35482d = new i();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35483e = 0;

        private i() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            ((Function1) fVar.a(t.b(0))).invoke((o0) fVar.a(t.b(1)));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            if (t.d(i10, t.b(0))) {
                return t1.a.f296107c;
            }
            return t.d(i10, t.b(1)) ? "composition" : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }

        public final int j() {
            return t.b(1);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,1151:1\n544#1:1152\n547#1:1153\n544#1:1154\n547#1:1155\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n551#1:1152\n552#1:1153\n562#1:1154\n563#1:1155\n*E\n"})
    public static final class i0 extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final i0 f35484d = new i0();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35485e = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private i0() {
            super(0, 2, 1, null);
            int i10 = 6 ^ 2;
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            iVar.k((Function2) fVar.a(t.b(1)), fVar.a(t.b(0)));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            if (t.d(i10, t.b(0))) {
                return "value";
            }
            return t.d(i10, t.b(1)) ? "block" : super.h(i10);
        }

        public final int i() {
            return t.b(1);
        }

        public final int j() {
            return t.b(0);
        }
    }

    @w0(parameters = 1)
    public static final class j extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final j f35486d = new j();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35487e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private j() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            z5Var.V();
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1#1,1151:1\n318#1:1152\n315#1:1153\n315#1:1154\n318#1:1155\n1628#2:1156\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n322#1:1152\n328#1:1153\n338#1:1154\n339#1:1155\n343#1:1156\n*E\n"})
    public static final class j0 extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final j0 f35488d = new j0();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35489e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private j0() {
            int i10 = 1;
            super(i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            Object objA = fVar.a(t.b(0));
            int i10 = fVar.getInt(0);
            if (objA instanceof n5) {
                l5Var.e((n5) objA);
            }
            Object objN1 = z5Var.n1(z5Var.h0(), i10, objA);
            if (objN1 instanceof n5) {
                l5Var.d((n5) objN1);
            } else if (objN1 instanceof s4) {
                ((s4) objN1).C();
            }
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String g(int i10) {
            return i10 == 0 ? "groupSlotIndex" : super.g(i10);
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            return t.d(i10, t.b(0)) ? "value" : super.h(i10);
        }

        public final int i() {
            return 0;
        }

        public final int j() {
            return t.b(0);
        }
    }

    @w0(parameters = 1)
    public static final class k extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final k f35490d = new k();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35491e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private k() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            androidx.compose.runtime.changelist.i.j(z5Var, iVar, 0);
            z5Var.V();
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1151:1\n87#1:1152\n87#1:1153\n1#2:1154\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n*L\n91#1:1152\n101#1:1153\n*E\n"})
    public static final class k0 extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final k0 f35492d = new k0();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35493e = 0;

        private k0() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            int i10 = fVar.getInt(0);
            for (int i11 = 0; i11 < i10; i11++) {
                iVar.o();
            }
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String g(int i10) {
            return i10 == 0 ? "count" : super.g(i10);
        }

        public final int i() {
            return 0;
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndResumingScope\n*L\n1#1,1151:1\n236#1:1152\n236#1:1153\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndResumingScope\n*L\n240#1:1152\n250#1:1153\n*E\n"})
    public static final class l extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final l f35494d = new l();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35495e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private l() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            l5Var.h((s4) fVar.a(t.b(0)));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            return t.d(i10, t.b(0)) ? "scope" : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }
    }

    @w0(parameters = 1)
    public static final class l0 extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final l0 f35496d = new l0();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35497e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private l0() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            iVar.e();
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n1#1,1151:1\n433#1:1152\n433#1:1153\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n437#1:1152\n447#1:1153\n*E\n"})
    public static final class m extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final m f35498d = new m();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35499e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private m() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            z5Var.Y((androidx.compose.runtime.g) fVar.a(t.b(0)));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            return t.d(i10, t.b(0)) ? t1.a.f296107c : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }
    }

    @w0(parameters = 1)
    public static final class n extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final n f35500d = new n();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35501e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private n() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            z5Var.X(0);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n1#1,1151:1\n704#1:1152\n701#1:1153\n707#1:1154\n707#1:1155\n701#1:1156\n707#1:1157\n704#1:1158\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n711#1:1152\n717#1:1153\n718#1:1154\n723#1:1155\n731#1:1156\n732#1:1157\n733#1:1158\n*E\n"})
    public static final class o extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final o f35502d = new o();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35503e = 0;

        private o() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            Object objInvoke = ((Function0) fVar.a(t.b(0))).invoke();
            androidx.compose.runtime.g gVar2 = (androidx.compose.runtime.g) fVar.a(t.b(1));
            int i10 = fVar.getInt(0);
            Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            z5Var.T1(gVar2, objInvoke);
            iVar.l(i10, objInvoke);
            iVar.n(objInvoke);
        }

        @Override // androidx.compose.runtime.changelist.d
        @Nullable
        protected androidx.compose.runtime.g c(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull z5 z5Var) {
            return (androidx.compose.runtime.g) fVar.a(t.b(1));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String g(int i10) {
            return i10 == 0 ? "insertIndex" : super.g(i10);
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            if (t.d(i10, t.b(0))) {
                return "factory";
            }
            return t.d(i10, t.b(1)) ? "groupAnchor" : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }

        public final int j() {
            return t.b(1);
        }

        public final int k() {
            return 0;
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n1#1,1151:1\n622#1:1152\n625#1:1153\n625#1:1154\n622#1:1155\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n629#1:1152\n630#1:1153\n640#1:1154\n641#1:1155\n*E\n"})
    public static final class p extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final p f35504d = new p();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35505e = 0;

        private p() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            w5 w5Var = (w5) fVar.a(t.b(1));
            androidx.compose.runtime.g gVar2 = (androidx.compose.runtime.g) fVar.a(t.b(0));
            z5Var.I();
            z5Var.K0(w5Var, gVar2.d(w5Var), false);
            z5Var.W();
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            if (t.d(i10, t.b(0))) {
                return t1.a.f296107c;
            }
            return t.d(i10, t.b(1)) ? "from" : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }

        public final int j() {
            return t.b(1);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1151:1\n655#1:1152\n658#1:1153\n661#1:1154\n658#1:1155\n655#1:1156\n661#1:1157\n175#2,4:1158\n180#2,3:1163\n1#3:1162\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n*L\n665#1:1152\n666#1:1153\n667#1:1154\n677#1:1155\n678#1:1156\n679#1:1157\n681#1:1158,4\n681#1:1163,3\n681#1:1162\n*E\n"})
    public static final class q extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final q f35506d = new q();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35507e = 0;

        private q() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            androidx.compose.runtime.changelist.g gVarK;
            w5 w5Var = (w5) fVar.a(t.b(1));
            androidx.compose.runtime.g gVar2 = (androidx.compose.runtime.g) fVar.a(t.b(0));
            androidx.compose.runtime.changelist.c cVar = (androidx.compose.runtime.changelist.c) fVar.a(t.b(2));
            z5 z5VarA0 = w5Var.a0();
            if (gVar != null) {
                try {
                    gVarK = androidx.compose.runtime.changelist.i.k(gVar, z5Var);
                } catch (Throwable th2) {
                    z5VarA0.M(false);
                    throw th2;
                }
            } else {
                gVarK = null;
            }
            cVar.f(iVar, z5VarA0, l5Var, gVarK);
            Unit unit = Unit.f312394a;
            z5VarA0.M(true);
            z5Var.I();
            z5Var.K0(w5Var, gVar2.d(w5Var), false);
            z5Var.W();
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            if (t.d(i10, t.b(0))) {
                return t1.a.f296107c;
            }
            if (t.d(i10, t.b(1))) {
                return "from";
            }
            return t.d(i10, t.b(2)) ? "fixups" : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }

        public final int j() {
            return t.b(2);
        }

        public final int k() {
            return t.b(1);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n1#1,1151:1\n464#1:1152\n464#1:1153\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n468#1:1152\n478#1:1153\n*E\n"})
    public static final class r extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final r f35508d = new r();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35509e = 0;

        private r() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            z5Var.M0(fVar.getInt(0));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String g(int i10) {
            return i10 == 0 ? androidx.constraintlayout.core.motion.utils.v.c.R : super.g(i10);
        }

        public final int i() {
            return 0;
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n1#1,1151:1\n594#1:1152\n597#1:1153\n600#1:1154\n594#1,7:1155\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n604#1:1152\n605#1:1153\n606#1:1154\n616#1:1155,7\n*E\n"})
    public static final class s extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final s f35510d = new s();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35511e = 0;

        private s() {
            super(3, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            iVar.i(fVar.getInt(0), fVar.getInt(1), fVar.getInt(2));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String g(int i10) {
            if (i10 == 0) {
                return "from";
            }
            if (i10 == 1) {
                return "to";
            }
            return i10 == 2 ? "count" : super.g(i10);
        }

        public final int i() {
            return 2;
        }

        public final int j() {
            return 0;
        }

        public final int k() {
            return 1;
        }
    }

    @oj.g
    public static final class t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f35512a;

        private /* synthetic */ t(int i10) {
            this.f35512a = i10;
        }

        public static final /* synthetic */ t a(int i10) {
            return new t(i10);
        }

        public static <T> int b(int i10) {
            return i10;
        }

        public static boolean c(int i10, Object obj) {
            return (obj instanceof t) && i10 == ((t) obj).h();
        }

        public static final boolean d(int i10, int i11) {
            return i10 == i11;
        }

        public static int f(int i10) {
            return Integer.hashCode(i10);
        }

        public static String g(int i10) {
            return "ObjectParameter(offset=" + i10 + ')';
        }

        public final int e() {
            return this.f35512a;
        }

        public boolean equals(Object obj) {
            return c(this.f35512a, obj);
        }

        public final /* synthetic */ int h() {
            return this.f35512a;
        }

        public int hashCode() {
            return f(this.f35512a);
        }

        public String toString() {
            return g(this.f35512a);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n1#1,1151:1\n744#1:1152\n747#1:1153\n747#1:1154\n747#1:1155\n744#1:1156\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n751#1:1152\n757#1:1153\n762#1:1154\n770#1:1155\n771#1:1156\n*E\n"})
    public static final class u extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final u f35513d = new u();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35514e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private u() {
            int i10 = 1;
            super(i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            androidx.compose.runtime.g gVar2 = (androidx.compose.runtime.g) fVar.a(t.b(0));
            int i10 = fVar.getInt(0);
            iVar.o();
            Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            iVar.m(i10, z5Var.S0(gVar2));
        }

        @Override // androidx.compose.runtime.changelist.d
        @Nullable
        protected androidx.compose.runtime.g c(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull z5 z5Var) {
            return (androidx.compose.runtime.g) fVar.a(t.b(0));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String g(int i10) {
            return i10 == 0 ? "insertIndex" : super.g(i10);
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            return t.d(i10, t.b(0)) ? "groupAnchor" : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }

        public final int j() {
            return 0;
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n1#1,1151:1\n943#1:1152\n946#1:1153\n949#1:1154\n943#1:1155\n949#1:1156\n946#1:1157\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n953#1:1152\n954#1:1153\n955#1:1154\n965#1:1155\n966#1:1156\n967#1:1157\n*E\n"})
    public static final class v extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final v f35515d = new v();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35516e = 0;

        private v() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            l1 l1Var = (l1) fVar.a(t.b(0));
            i3 i3Var = (i3) fVar.a(t.b(2));
            ((p0) fVar.a(t.b(1))).q(i3Var, m0.F(l1Var, i3Var, z5Var, null), iVar);
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            if (t.d(i10, t.b(0))) {
                return "composition";
            }
            if (t.d(i10, t.b(1))) {
                return "parentCompositionContext";
            }
            return t.d(i10, t.b(2)) ? androidx.constraintlayout.core.motion.utils.v.b.f43991h : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }

        public final int j() {
            return t.b(1);
        }

        public final int k() {
            return t.b(2);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n1#1,1151:1\n174#1:1152\n174#1:1153\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n178#1:1152\n188#1:1153\n*E\n"})
    public static final class w extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final w f35517d = new w();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35518e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private w() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            l5Var.e((n5) fVar.a(t.b(0)));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            return t.d(i10, t.b(0)) ? "value" : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RememberPausingScope\n*L\n1#1,1151:1\n194#1:1152\n194#1:1153\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RememberPausingScope\n*L\n198#1:1152\n208#1:1153\n*E\n"})
    public static final class x extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final x f35519d = new x();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35520e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private x() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            l5Var.g((s4) fVar.a(t.b(0)));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String h(int i10) {
            return t.d(i10, t.b(0)) ? "scope" : super.h(i10);
        }

        public final int i() {
            return t.b(0);
        }
    }

    @w0(parameters = 1)
    public static final class y extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final y f35521d = new y();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35522e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private y() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            m0.o0(z5Var, l5Var);
        }
    }

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n1#1,1151:1\n570#1:1152\n573#1:1153\n570#1,4:1154\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n577#1:1152\n578#1:1153\n588#1:1154,4\n*E\n"})
    public static final class z extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final z f35523d = new z();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35524e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        private z() {
            int i10 = 2;
            super(i10, 0, i10, null);
        }

        @Override // androidx.compose.runtime.changelist.d
        protected void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) {
            iVar.b(fVar.getInt(0), fVar.getInt(1));
        }

        @Override // androidx.compose.runtime.changelist.d
        @NotNull
        public String g(int i10) {
            if (i10 == 0) {
                return "removeIndex";
            }
            return i10 == 1 ? "count" : super.g(i10);
        }

        public final int i() {
            return 1;
        }

        public final int j() {
            return 0;
        }
    }

    public /* synthetic */ d(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    protected abstract void a(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar);

    public final void b(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull androidx.compose.runtime.i<?> iVar, @NotNull z5 z5Var, @NotNull l5 l5Var, @Nullable androidx.compose.runtime.changelist.g gVar) throws Throwable {
        androidx.compose.runtime.g gVarC = c(fVar, z5Var);
        try {
            a(fVar, iVar, z5Var, l5Var, gVar);
        } catch (Throwable th2) {
            throw androidx.compose.runtime.changelist.i.f(th2, gVar, z5Var, gVarC);
        }
    }

    @Nullable
    protected androidx.compose.runtime.g c(@NotNull androidx.compose.runtime.changelist.f fVar, @NotNull z5 z5Var) {
        return null;
    }

    public final int d() {
        return this.f35446a;
    }

    @NotNull
    public final String e() {
        String strQ = j1.d(getClass()).Q();
        if (strQ == null) {
            strQ = "";
        }
        return strQ;
    }

    public final int f() {
        return this.f35447b;
    }

    @NotNull
    public String g(int i10) {
        return "IntParameter(" + i10 + ')';
    }

    @NotNull
    public String h(int i10) {
        return "ObjectParameter(" + i10 + ')';
    }

    @NotNull
    public String toString() {
        return e();
    }

    private d(int i10, int i11) {
        this.f35446a = i10;
        this.f35447b = i11;
    }

    public /* synthetic */ d(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, null);
    }
}
