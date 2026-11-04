package androidx.compose.foundation.gestures;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDraggable2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DNode\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,329:1\n150#2:330\n*S KotlinDebug\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DNode\n*L\n306#1:330\n*E\n"})
public final class r2 extends j2 {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final int f14974o3 = 8;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private s2 f14975j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private boolean f14976k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f14977l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private Function1<? super n0.g, Unit> f14978m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NotNull
    private Function1<? super androidx.compose.ui.unit.c0, Unit> f14979n3;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.Draggable2DNode$drag$2", f = "Draggable2D.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDraggable2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DNode$drag$2\n+ 2 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DNode\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,329:1\n306#2:330\n150#3:331\n*S KotlinDebug\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DNode$drag$2\n*L\n257#1:330\n257#1:331\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<c1, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<Function1<? super d1.b, Unit>, kotlin.coroutines.d<? super Unit>, Object> f14982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r2 f14983d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Function1<? super d1.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, r2 r2Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f14982c = function2;
            this.f14983d = r2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(c1 c1Var, r2 r2Var, d1.b bVar) {
            long jA = bVar.a();
            if (r2Var.f14977l3) {
                jA = n0.g.g((-9223372034707292160L) ^ jA);
            }
            c1Var.a(jA);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f14982c, this.f14983d, dVar);
            aVar.f14981b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14980a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final c1 c1Var = (c1) this.f14981b;
                Function2<Function1<? super d1.b, Unit>, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f14982c;
                final r2 r2Var = this.f14983d;
                Function1<? super d1.b, Unit> function1 = new Function1() { // from class: androidx.compose.foundation.gestures.q2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return r2.a.n(c1Var, r2Var, (d1.b) obj2);
                    }
                };
                this.f14980a = 1;
                if (function2.invoke(function1, this) == objL) {
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
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1 c1Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(c1Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public r2(@NotNull s2 s2Var, @NotNull Function1<? super androidx.compose.ui.input.pointer.c0, Boolean> function1, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, boolean z11, boolean z12, @NotNull Function1<? super n0.g, Unit> function2, @NotNull Function1<? super androidx.compose.ui.unit.c0, Unit> function3) {
        super(function1, z10, jVar, null);
        this.f14975j3 = s2Var;
        this.f14976k3 = z11;
        this.f14977l3 = z12;
        this.f14978m3 = function2;
        this.f14979n3 = function3;
    }

    private final long ia(long j10) {
        return this.f14977l3 ? n0.g.g(j10 ^ (-9223372034707292160L)) : j10;
    }

    @Override // androidx.compose.foundation.gestures.j2
    @Nullable
    public Object T9(@NotNull Function2<? super Function1<? super d1.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = this.f14975j3.a(androidx.compose.foundation.q3.UserInput, new a(function2, this, null), dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    @Override // androidx.compose.foundation.gestures.j2
    public void Y9(long j10) {
        this.f14978m3.invoke(n0.g.d(j10));
    }

    @Override // androidx.compose.foundation.gestures.j2
    public void Z9(long j10) {
        this.f14979n3.invoke(androidx.compose.ui.unit.c0.b(j10));
    }

    @Override // androidx.compose.foundation.gestures.j2
    public boolean da() {
        return this.f14976k3;
    }

    public final void ja(@NotNull s2 s2Var, @NotNull Function1<? super androidx.compose.ui.input.pointer.c0, Boolean> function1, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, boolean z11, boolean z12, @NotNull Function1<? super n0.g, Unit> function2, @NotNull Function1<? super androidx.compose.ui.unit.c0, Unit> function3) {
        boolean z13;
        boolean z14 = true;
        if (Intrinsics.areEqual(this.f14975j3, s2Var)) {
            z13 = false;
        } else {
            this.f14975j3 = s2Var;
            z13 = true;
        }
        if (this.f14977l3 != z12) {
            this.f14977l3 = z12;
        } else {
            z14 = z13;
        }
        this.f14978m3 = function2;
        this.f14979n3 = function3;
        this.f14976k3 = z11;
        fa(function1, z10, jVar, null, z14);
    }
}
