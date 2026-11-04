package androidx.compose.material.ripple;

import androidx.collection.g2;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.x0;
import androidx.compose.ui.node.f0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleNode\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,530:1\n1516#2:531\n132#3:532\n287#4,6:533\n1#5:539\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleNode\n*L\n338#1:531\n346#1:532\n358#1:533,6\n*E\n"})
public abstract class RippleNode extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.h, androidx.compose.ui.node.t, f0 {

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f24698p2 = 8;

    @NotNull
    private final g2<androidx.compose.foundation.interaction.l> H1;
    private final boolean X;

    @Nullable
    private a0 Y;
    private float Z;

    @NotNull
    private final x0 color;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private long f24699p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f24700p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.h f24701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f24702t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final float f24703v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final Function0<l> f24704w;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f24706b;

        /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleNode$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleNode$onAttach$1$1\n+ 2 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,530:1\n919#2,2:531\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleNode$onAttach$1$1\n*L\n371#1:531,2\n*E\n"})
        static final class C0197a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RippleNode f24708a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s0 f24709b;

            C0197a(RippleNode rippleNode, s0 s0Var) {
                this.f24708a = rippleNode;
                this.f24709b = s0Var;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(androidx.compose.foundation.interaction.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                if (!(gVar instanceof androidx.compose.foundation.interaction.l)) {
                    this.f24708a.K9(gVar, this.f24709b);
                } else if (this.f24708a.f24700p1) {
                    this.f24708a.H9((androidx.compose.foundation.interaction.l) gVar);
                } else {
                    this.f24708a.H1.a0(gVar);
                }
                return Unit.f312394a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = RippleNode.this.new a(dVar);
            aVar.f24706b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f24705a;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var = (s0) this.f24706b;
                kotlinx.coroutines.flow.i<androidx.compose.foundation.interaction.g> iVarC = RippleNode.this.f24701s.c();
                C0197a c0197a = new C0197a(RippleNode.this, s0Var);
                this.f24705a = 1;
                if (iVarC.collect(c0197a, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ RippleNode(androidx.compose.foundation.interaction.h hVar, boolean z10, float f10, x0 x0Var, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, z10, f10, x0Var, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H9(androidx.compose.foundation.interaction.l lVar) {
        if (lVar instanceof androidx.compose.foundation.interaction.l.b) {
            A9((androidx.compose.foundation.interaction.l.b) lVar, this.f24699p0, this.Z);
        } else if (lVar instanceof androidx.compose.foundation.interaction.l.c) {
            I9(((androidx.compose.foundation.interaction.l.c) lVar).a());
        } else {
            if (lVar instanceof androidx.compose.foundation.interaction.l.a) {
                I9(((androidx.compose.foundation.interaction.l.a) lVar).a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K9(androidx.compose.foundation.interaction.g gVar, s0 s0Var) {
        a0 a0Var = this.Y;
        if (a0Var == null) {
            a0Var = new a0(this.f24702t, this.f24704w);
            androidx.compose.ui.node.u.a(this);
            this.Y = a0Var;
        }
        a0Var.c(gVar, s0Var);
    }

    public abstract void A9(@NotNull androidx.compose.foundation.interaction.l.b bVar, long j10, float f10);

    public abstract void B9(@NotNull androidx.compose.ui.graphics.drawscope.f fVar);

    protected final boolean C9() {
        return this.f24702t;
    }

    @NotNull
    protected final Function0<l> D9() {
        return this.f24704w;
    }

    public final long E9() {
        return this.color.a();
    }

    protected final long F9() {
        return this.f24699p0;
    }

    protected final float G9() {
        return this.Z;
    }

    public abstract void I9(@NotNull androidx.compose.foundation.interaction.l.b bVar);

    protected final void J9(float f10) {
        this.Z = f10;
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.E4();
        a0 a0Var = this.Y;
        if (a0Var != null) {
            a0Var.b(cVar, this.Z, E9());
        }
        B9(cVar);
    }

    @Override // androidx.compose.ui.a0.d
    public final boolean X8() {
        return this.X;
    }

    @Override // androidx.compose.ui.node.f0
    public void c0(long j10) {
        this.f24700p1 = true;
        androidx.compose.ui.unit.d dVarQ = androidx.compose.ui.node.k.q(this);
        this.f24699p0 = androidx.compose.ui.unit.v.h(j10);
        this.Z = Float.isNaN(this.f24703v) ? n.a(dVarQ, this.f24702t, this.f24699p0) : dVarQ.S7(this.f24703v);
        g2<androidx.compose.foundation.interaction.l> g2Var = this.H1;
        Object[] objArr = g2Var.f12449a;
        int i10 = g2Var.f12450b;
        for (int i11 = 0; i11 < i10; i11++) {
            H9((androidx.compose.foundation.interaction.l) objArr[i11]);
        }
        this.H1.l0();
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        kotlinx.coroutines.k.f(Q8(), null, null, new a(null), 3, null);
    }

    private RippleNode(androidx.compose.foundation.interaction.h hVar, boolean z10, float f10, x0 x0Var, Function0<l> function0) {
        this.f24701s = hVar;
        this.f24702t = z10;
        this.f24703v = f10;
        this.color = x0Var;
        this.f24704w = function0;
        this.f24699p0 = n0.n.f332724b.c();
        this.H1 = new g2<>(0, 1, null);
    }
}
