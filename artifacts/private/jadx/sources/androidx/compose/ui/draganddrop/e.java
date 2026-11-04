package androidx.compose.ui.draganddrop;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.node.p2;
import androidx.compose.ui.node.q2;
import androidx.compose.ui.unit.u;
import androidx.compose.ui.unit.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import n0.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n*L\n1#1,493:1\n66#2,4:494\n66#2,4:498\n482#3,10:502\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n*L\n257#1:494,4\n313#1:498,4\n381#1:502,10\n*E\n"})
public final class e extends a0.d implements p2, androidx.compose.ui.draganddrop.d, g, j, i {

    @NotNull
    private static final a Z = new a(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f37186p0 = 8;

    @Nullable
    private i X;
    private long Y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Function2<? super h, ? super n0.g, Unit> f37187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final Function1<androidx.compose.ui.draganddrop.b, i> f37188t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final Object f37189v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private e f37190w;

    private static final class a {

        /* JADX INFO: renamed from: androidx.compose.ui.draganddrop.e$a$a, reason: collision with other inner class name */
        private static final class C0280a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0280a f37191a = new C0280a();

            private C0280a() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode$acceptDragAndDropTransfer$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,493:1\n57#2,4:494\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode$acceptDragAndDropTransfer$1\n*L\n337#1:494,4\n*E\n"})
    static final class b extends l0 implements Function1<e, p2.a.EnumC0311a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.draganddrop.b f37192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f37193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1.a f37194c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.draganddrop.b bVar, e eVar, i1.a aVar) {
            super(1);
            this.f37192a = bVar;
            this.f37193b = eVar;
            this.f37194c = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p2.a.EnumC0311a invoke(e eVar) {
            if (!eVar.a9()) {
                return p2.a.EnumC0311a.SkipSubtreeAndContinueTraversal;
            }
            if (!(eVar.X == null)) {
                s0.a.i("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            }
            Function1 function1 = eVar.f37188t;
            eVar.X = function1 != null ? (i) function1.invoke(this.f37192a) : null;
            boolean z10 = eVar.X != null;
            if (z10) {
                this.f37193b.B9().h0(eVar);
            }
            i1.a aVar = this.f37194c;
            aVar.f312744a = aVar.f312744a || z10;
            return p2.a.EnumC0311a.ContinueTraversal;
        }
    }

    static final class c extends l0 implements Function2<h, n0.g, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f37195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f37196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.graphics.drawscope.f, Unit> f37197c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(k kVar, long j10, Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
            super(2);
            this.f37195a = kVar;
            this.f37196b = j10;
            this.f37197c = function1;
        }

        public final void c(h hVar, long j10) {
            hVar.a(this.f37195a, this.f37196b, this.f37197c);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(h hVar, n0.g gVar) {
            c(hVar, gVar.B());
            return Unit.f312394a;
        }
    }

    static final class d extends l0 implements Function1<e, p2.a.EnumC0311a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.draganddrop.b f37198a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.draganddrop.b bVar) {
            super(1);
            this.f37198a = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p2.a.EnumC0311a invoke(e eVar) {
            if (!eVar.w().a9()) {
                return p2.a.EnumC0311a.SkipSubtreeAndContinueTraversal;
            }
            i iVar = eVar.X;
            if (iVar != null) {
                iVar.G4(this.f37198a);
            }
            eVar.X = null;
            eVar.f37190w = null;
            return p2.a.EnumC0311a.ContinueTraversal;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.draganddrop.e$e, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt$firstDescendantOrNull$1\n+ 2 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n*L\n1#1,489:1\n383#2,2:490\n*E\n"})
    public static final class C0281e extends l0 implements Function1<e, p2.a.EnumC0311a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h f37199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f37200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.draganddrop.b f37201c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0281e(i1.h hVar, e eVar, androidx.compose.ui.draganddrop.b bVar) {
            super(1);
            this.f37199a = hVar;
            this.f37200b = eVar;
            this.f37201c = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p2.a.EnumC0311a invoke(e eVar) {
            e eVar2 = eVar;
            if (!this.f37200b.B9().j0(eVar2) || !androidx.compose.ui.draganddrop.f.h(eVar2, l.a(this.f37201c))) {
                return p2.a.EnumC0311a.ContinueTraversal;
            }
            this.f37199a.f312751a = eVar;
            return p2.a.EnumC0311a.CancelTraversal;
        }
    }

    static final class f extends l0 implements Function1<e, p2.a.EnumC0311a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f37202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f37203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f37204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f37205d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j10, g0 g0Var, h hVar, Function0<Boolean> function0) {
            super(1);
            this.f37202a = j10;
            this.f37203b = g0Var;
            this.f37204c = hVar;
            this.f37205d = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p2.a.EnumC0311a invoke(e eVar) {
            if (!eVar.a9()) {
                return p2.a.EnumC0311a.SkipSubtreeAndContinueTraversal;
            }
            Function2 function2 = eVar.f37187s;
            if (function2 == null) {
                return p2.a.EnumC0311a.ContinueTraversal;
            }
            long j10 = this.f37202a;
            n0.g.a aVar = n0.g.f332700b;
            if (n0.g.l(j10, aVar.c())) {
                function2.invoke(this.f37204c, n0.g.d(aVar.c()));
            } else {
                long jR0 = androidx.compose.ui.node.k.u(eVar).n().r0(this.f37203b, this.f37202a);
                if (!o.m(v.h(eVar.C9())).f(jR0)) {
                    return p2.a.EnumC0311a.ContinueTraversal;
                }
                function2.invoke(this.f37204c, n0.g.d(jR0));
            }
            return this.f37205d.invoke().booleanValue() ? p2.a.EnumC0311a.CancelTraversal : p2.a.EnumC0311a.ContinueTraversal;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.draganddrop.c B9() {
        return androidx.compose.ui.node.k.v(this).getDragAndDropManager();
    }

    public final long C9() {
        return this.Y;
    }

    @oj.i(name = "hasEligibleDropTarget")
    public final boolean D9() {
        return (this.f37190w == null && this.X == null) ? false : true;
    }

    public final void E9(long j10) {
        this.Y = j10;
    }

    public final void F9(@NotNull h hVar, long j10, @NotNull Function0<Boolean> function0) {
        androidx.compose.ui.draganddrop.f.k(this, new f(j10, androidx.compose.ui.node.k.u(this).n(), hVar, function0));
    }

    @Override // androidx.compose.ui.draganddrop.g
    public void G(long j10) {
        if (!(this.f37187s != null)) {
            s0.a.i("Check failed.");
        }
        B9().i0(this, j10);
    }

    @Override // androidx.compose.ui.draganddrop.i
    public void G4(@NotNull androidx.compose.ui.draganddrop.b bVar) {
        androidx.compose.ui.draganddrop.f.k(this, new d(bVar));
    }

    @Override // androidx.compose.ui.draganddrop.i
    public void I1(@NotNull androidx.compose.ui.draganddrop.b bVar) {
        i iVar = this.X;
        if (iVar != null) {
            iVar.I1(bVar);
            return;
        }
        e eVar = this.f37190w;
        if (eVar != null) {
            eVar.I1(bVar);
        }
    }

    @Override // androidx.compose.ui.draganddrop.i
    public void Q4(@NotNull androidx.compose.ui.draganddrop.b bVar) {
        p2 p2Var;
        e eVar;
        e eVar2 = this.f37190w;
        if (eVar2 == null || !androidx.compose.ui.draganddrop.f.h(eVar2, l.a(bVar))) {
            if (w().a9()) {
                i1.h hVar = new i1.h();
                q2.h(this, new C0281e(hVar, this, bVar));
                p2Var = (p2) hVar.f312751a;
            } else {
                p2Var = null;
            }
            eVar = (e) p2Var;
        } else {
            eVar = eVar2;
        }
        if (eVar != null && eVar2 == null) {
            androidx.compose.ui.draganddrop.f.i(eVar, bVar);
            i iVar = this.X;
            if (iVar != null) {
                iVar.c1(bVar);
            }
        } else if (eVar == null && eVar2 != null) {
            i iVar2 = this.X;
            if (iVar2 != null) {
                androidx.compose.ui.draganddrop.f.i(iVar2, bVar);
            }
            eVar2.c1(bVar);
        } else if (!Intrinsics.areEqual(eVar, eVar2)) {
            if (eVar != null) {
                androidx.compose.ui.draganddrop.f.i(eVar, bVar);
            }
            if (eVar2 != null) {
                eVar2.c1(bVar);
            }
        } else if (eVar != null) {
            eVar.Q4(bVar);
        } else {
            i iVar3 = this.X;
            if (iVar3 != null) {
                iVar3.Q4(bVar);
            }
        }
        this.f37190w = eVar;
    }

    @Override // androidx.compose.ui.node.p2
    @NotNull
    public Object R4() {
        return this.f37189v;
    }

    @Override // androidx.compose.ui.draganddrop.d
    @kotlin.l(message = "Use DragAndDropSourceModifierNode.requestDragAndDropTransfer instead")
    public void R6(@NotNull k kVar, long j10, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        if (!(this.f37187s == null)) {
            s0.a.i("Check failed.");
        }
        this.f37187s = new c(kVar, j10, function1);
        B9().i0(this, n0.g.f332700b.c());
        this.f37187s = null;
    }

    @Override // androidx.compose.ui.draganddrop.i
    public void Z5(@NotNull androidx.compose.ui.draganddrop.b bVar) {
        i iVar = this.X;
        if (iVar != null) {
            iVar.Z5(bVar);
            return;
        }
        e eVar = this.f37190w;
        if (eVar != null) {
            eVar.Z5(bVar);
        }
    }

    @Override // androidx.compose.ui.node.f0
    public void c0(long j10) {
        this.Y = j10;
    }

    @Override // androidx.compose.ui.draganddrop.i
    public void c1(@NotNull androidx.compose.ui.draganddrop.b bVar) {
        i iVar = this.X;
        if (iVar != null) {
            iVar.c1(bVar);
        }
        e eVar = this.f37190w;
        if (eVar != null) {
            eVar.c1(bVar);
        }
        this.f37190w = null;
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        this.X = null;
        this.f37190w = null;
    }

    @Override // androidx.compose.ui.draganddrop.g
    public boolean g0() {
        return B9().g0();
    }

    @Override // androidx.compose.ui.draganddrop.i
    public boolean u2(@NotNull androidx.compose.ui.draganddrop.b bVar) {
        e eVar = this.f37190w;
        if (eVar != null) {
            return eVar.u2(bVar);
        }
        i iVar = this.X;
        if (iVar != null) {
            return iVar.u2(bVar);
        }
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.d
    public boolean v6(@NotNull androidx.compose.ui.draganddrop.b bVar) {
        i1.a aVar = new i1.a();
        androidx.compose.ui.draganddrop.f.k(this, new b(bVar, this, aVar));
        return aVar.f312744a;
    }

    @Override // androidx.compose.ui.draganddrop.i
    public void w0(@NotNull androidx.compose.ui.draganddrop.b bVar) {
        i iVar = this.X;
        if (iVar != null) {
            iVar.w0(bVar);
            return;
        }
        e eVar = this.f37190w;
        if (eVar != null) {
            eVar.w0(bVar);
        }
    }

    public /* synthetic */ e(Function2 function2, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function2, (i10 & 2) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Nullable Function2<? super h, ? super n0.g, Unit> function2, @Nullable Function1<? super androidx.compose.ui.draganddrop.b, ? extends i> function1) {
        this.f37187s = function2;
        this.f37188t = function1;
        this.f37189v = a.C0280a.f37191a;
        this.Y = u.f42720b.a();
    }
}
