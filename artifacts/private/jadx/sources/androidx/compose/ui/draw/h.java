package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.o1;
import androidx.compose.ui.node.m1;
import androidx.compose.ui.node.q1;
import androidx.compose.ui.node.r1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawModifierNodeImpl\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,475:1\n106#2:476\n1#3:477\n78#4,5:478\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawModifierNodeImpl\n*L\n266#1:476\n322#1:478,5\n*E\n"})
final class h extends androidx.compose.ui.a0.d implements g, q1, f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final i f37283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f37284t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private w f37285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private Function1<? super i, o> f37286w;

    static final class a extends l0 implements Function0<o1> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final o1 invoke() {
            return h.this.w9();
        }
    }

    static final class b extends l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f37289b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i iVar) {
            super(0);
            this.f37289b = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            h.this.v9().invoke(this.f37289b);
        }
    }

    public h(@NotNull i iVar, @NotNull Function1<? super i, o> function1) {
        this.f37283s = iVar;
        this.f37286w = function1;
        iVar.V(this);
        iVar.Z(new a());
    }

    private final o x9(androidx.compose.ui.graphics.drawscope.c cVar) {
        if (!this.f37284t) {
            i iVar = this.f37283s;
            iVar.X(null);
            iVar.W(cVar);
            r1.a(this, new b(iVar));
            if (iVar.x() == null) {
                s0.a.j("DrawResult not defined, did you forget to call onDraw?");
                throw new kotlin.a0();
            }
            this.f37284t = true;
        }
        o oVarX = this.f37283s.x();
        Intrinsics.checkNotNull(oVarX);
        return oVarX;
    }

    @Override // androidx.compose.ui.draw.g
    public void M6() {
        w wVar = this.f37285v;
        if (wVar != null) {
            wVar.e();
        }
        this.f37284t = false;
        this.f37283s.X(null);
        androidx.compose.ui.node.u.a(this);
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        x9(cVar).a().invoke(cVar);
    }

    @Override // androidx.compose.ui.node.q1
    public void Y5() {
        M6();
    }

    @Override // androidx.compose.ui.draw.f
    public long d() {
        return androidx.compose.ui.unit.v.h(androidx.compose.ui.node.k.p(this, m1.b(128)).a());
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        super.f9();
        w wVar = this.f37285v;
        if (wVar != null) {
            wVar.e();
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void g9() {
        super.g9();
        M6();
    }

    @Override // androidx.compose.ui.draw.f
    @NotNull
    public androidx.compose.ui.unit.d getDensity() {
        return androidx.compose.ui.node.k.q(this);
    }

    @Override // androidx.compose.ui.draw.f
    @NotNull
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return androidx.compose.ui.node.k.t(this);
    }

    @Override // androidx.compose.ui.node.j, androidx.compose.ui.node.d2
    public void l0() {
        M6();
    }

    @NotNull
    public final Function1<i, o> v9() {
        return this.f37286w;
    }

    @NotNull
    public final o1 w9() {
        w wVar = this.f37285v;
        if (wVar == null) {
            wVar = new w();
            this.f37285v = wVar;
        }
        if (wVar.d() == null) {
            wVar.f(androidx.compose.ui.node.k.r(this));
        }
        return wVar;
    }

    public final void y9(@NotNull Function1<? super i, o> function1) {
        this.f37286w = function1;
        M6();
    }

    @Override // androidx.compose.ui.node.t
    public void z3() {
        M6();
    }

    @Override // androidx.compose.ui.node.j
    public void z5() {
        M6();
    }
}
