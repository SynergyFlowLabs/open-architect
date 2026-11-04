package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.q2;
import androidx.compose.foundation.f3;
import androidx.compose.foundation.g3;
import androidx.compose.foundation.text.input.internal.q6;
import androidx.compose.foundation.text.input.internal.w6;
import androidx.compose.foundation.text.selection.v1;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.ui.platform.q1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nAndroidTextFieldMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextFieldMagnifier.android.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNodeImpl28\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,215:1\n85#2:216\n117#2,2:217\n1#3:219\n30#4:220\n80#5:221\n*S KotlinDebug\n*F\n+ 1 AndroidTextFieldMagnifier.android.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNodeImpl28\n*L\n52#1:216\n52#1:217,2\n75#1:220\n75#1:221\n*E\n"})
public final class m extends i implements androidx.compose.ui.node.h {

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final int f19978h3 = 0;

    @NotNull
    private final androidx.compose.animation.core.c<n0.g, androidx.compose.animation.core.t> H1;

    @NotNull
    private w6 X;

    @NotNull
    private d0 Y;

    @NotNull
    private q6 Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private p2 f19979g3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f19980p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final n3 f19981p1 = d7.g(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.f42720b.a()), null, 2, null);

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final f3 f19982p2 = (f3) v9(new f3(new Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.j
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return m.Q9(this.f19973a, (androidx.compose.ui.unit.d) obj);
        }
    }, null, new Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.k
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return m.R9(this.f19975a, (androidx.compose.ui.unit.l) obj);
        }
    }, 0.0f, true, 0, 0.0f, 0.0f, false, null, 1002, null));

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", f = "AndroidTextFieldMagnifier.android.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f19984b;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.m$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nAndroidTextFieldMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextFieldMagnifier.android.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,215:1\n273#2:216\n273#2:217\n69#3:218\n70#4:219\n22#5:220\n*S KotlinDebug\n*F\n+ 1 AndroidTextFieldMagnifier.android.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2\n*L\n150#1:216\n151#1:217\n152#1:218\n152#1:219\n152#1:220\n*E\n"})
        static final class C0141a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f19986a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f19987b;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.selection.m$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", f = "AndroidTextFieldMagnifier.android.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
            static final class C0142a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f19988a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ m f19989b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ long f19990c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0142a(m mVar, long j10, kotlin.coroutines.d<? super C0142a> dVar) {
                    super(2, dVar);
                    this.f19989b = mVar;
                    this.f19990c = j10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0142a(this.f19989b, this.f19990c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f19988a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        androidx.compose.animation.core.c cVar = this.f19989b.H1;
                        n0.g gVarD = n0.g.d(this.f19990c);
                        q2<n0.g> q2VarH = v1.h();
                        this.f19988a = 1;
                        if (androidx.compose.animation.core.c.i(cVar, gVarD, q2VarH, null, null, this, 12, null) == objL) {
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
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0142a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            C0141a(m mVar, kotlinx.coroutines.s0 s0Var) {
                this.f19986a = mVar;
                this.f19987b = s0Var;
            }

            public final Object a(long j10, kotlin.coroutines.d<? super Unit> dVar) {
                if ((((n0.g) this.f19986a.H1.v()).B() & 9223372034707292159L) == n0.d.f332689d || (j10 & 9223372034707292159L) == n0.d.f332689d || Float.intBitsToFloat((int) (((n0.g) this.f19986a.H1.v()).B() & com.rabbitmq.client.k0.f265952a)) == Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a))) {
                    Object objC = this.f19986a.H1.C(n0.g.d(j10), dVar);
                    return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
                }
                kotlinx.coroutines.k.f(this.f19987b, null, null, new C0142a(this.f19986a, j10, null), 3, null);
                return Unit.f312394a;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((n0.g) obj).B(), dVar);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n0.g m(m mVar) {
            return (mVar.f19980p0 || mVar.Y.t0() == d0.a.Touch) ? n0.g.d(h.a(mVar.X, mVar.Y, mVar.Z, mVar.P9())) : n0.g.d(n0.g.f332700b.c());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = m.this.new a(dVar);
            aVar.f19984b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f19983a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f19984b;
                final m mVar = m.this;
                kotlinx.coroutines.flow.i iVarY = androidx.compose.runtime.w6.y(new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.a.m(mVar);
                    }
                });
                C0141a c0141a = new C0141a(m.this, s0Var);
                this.f19983a = 1;
                if (iVarY.collect(c0141a, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public m(@NotNull w6 w6Var, @NotNull d0 d0Var, @NotNull q6 q6Var, boolean z10) {
        this.X = w6Var;
        this.Y = d0Var;
        this.Z = q6Var;
        this.f19980p0 = z10;
        this.H1 = new androidx.compose.animation.core.c<>(n0.g.d(h.a(this.X, this.Y, this.Z, P9())), v1.j(), n0.g.d(v1.i()), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final long P9() {
        return ((androidx.compose.ui.unit.u) this.f19981p1.getValue()).q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.g Q9(m mVar, androidx.compose.ui.unit.d dVar) {
        return mVar.H1.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R9(m mVar, androidx.compose.ui.unit.l lVar) {
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) androidx.compose.ui.node.i.a(mVar, q1.m());
        mVar.T9(androidx.compose.ui.unit.u.e((((long) dVar.g6(androidx.compose.ui.unit.l.p(lVar.x()))) << 32) | (((long) dVar.g6(androidx.compose.ui.unit.l.m(lVar.x()))) & com.rabbitmq.client.k0.f265952a)));
        return Unit.f312394a;
    }

    private final void S9() {
        p2 p2Var = this.f19979g3;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.f19979g3 = null;
        if (g3.d(0, 1, null)) {
            this.f19979g3 = kotlinx.coroutines.k.f(Q8(), null, null, new a(null), 3, null);
        }
    }

    private final void T9(long j10) {
        this.f19981p1.setValue(androidx.compose.ui.unit.u.b(j10));
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.i
    public void G9(@NotNull w6 w6Var, @NotNull d0 d0Var, @NotNull q6 q6Var, boolean z10) {
        w6 w6Var2 = this.X;
        d0 d0Var2 = this.Y;
        q6 q6Var2 = this.Z;
        boolean z11 = this.f19980p0;
        this.X = w6Var;
        this.Y = d0Var;
        this.Z = q6Var;
        this.f19980p0 = z10;
        if (Intrinsics.areEqual(w6Var, w6Var2) && Intrinsics.areEqual(d0Var, d0Var2) && Intrinsics.areEqual(q6Var, q6Var2) && z10 == z11) {
            return;
        }
        S9();
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.i, androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        cVar.E4();
        this.f19982p2.P(cVar);
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        S9();
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.i, androidx.compose.ui.layout.p1
    public void n0(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        this.f19982p2.n0(g0Var);
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.i, androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        this.f19982p2.p0(e0Var);
    }
}
