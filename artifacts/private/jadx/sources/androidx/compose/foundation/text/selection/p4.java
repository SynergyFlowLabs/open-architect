package androidx.compose.foundation.text.selection;

import android.content.Context;
import androidx.compose.foundation.text.h5;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n7;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt\n+ 2 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n*L\n1#1,163:1\n202#2,7:164\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt\n*L\n151#1:164,7\n*E\n"})
public final class p4 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1", f = "TextFieldSelectionManager.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u3 f21332b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u3 u3Var, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f21332b = u3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new a(this.f21332b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f21331a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f21332b.E();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2", f = "TextFieldSelectionManager.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u3 f21334b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u3 u3Var, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f21334b = u3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new b(this.f21334b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f21333a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            u3 u3Var = this.f21334b;
            u3Var.A(u3Var.h0());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3", f = "TextFieldSelectionManager.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u3 f21336b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(u3 u3Var, kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
            this.f21336b = u3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new c(this.f21336b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f21335a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f21336b.y0();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1", f = "TextFieldSelectionManager.android.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160742x1}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f21338b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f21338b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f21338b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21337a;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f21338b;
                this.f21337a = 1;
                if (function1.invoke(this) == objL) {
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
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nTextFieldSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,163:1\n75#2:164\n1282#3,6:165\n1282#3,6:171\n1282#3,6:177\n85#4:183\n117#4,2:184\n30#5:186\n80#6:187\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n*L\n63#1:164\n64#1:165,6\n66#1:171,6\n67#1:177,6\n64#1:183\n64#1:184,2\n73#1:186\n73#1:187\n*E\n"})
    static final class e implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u3 f21339a;

        e(u3 u3Var) {
            this.f21339a = u3Var;
        }

        private static final long m(androidx.compose.runtime.n3<androidx.compose.ui.unit.u> n3Var) {
            return n3Var.getValue().q();
        }

        private static final void n(androidx.compose.runtime.n3<androidx.compose.ui.unit.u> n3Var, long j10) {
            n3Var.setValue(androidx.compose.ui.unit.u.b(j10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n0.g s(u3 u3Var, androidx.compose.runtime.n3 n3Var) {
            return n0.g.d(b4.d(u3Var, m(n3Var)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.a0 v(final androidx.compose.ui.unit.d dVar, final androidx.compose.runtime.n3 n3Var, final Function0 function0) {
            return androidx.compose.foundation.g3.h(androidx.compose.ui.a0.E, new Function1() { // from class: androidx.compose.foundation.text.selection.q4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p4.e.x(function0, (androidx.compose.ui.unit.d) obj);
                }
            }, null, new Function1() { // from class: androidx.compose.foundation.text.selection.r4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p4.e.y(dVar, n3Var, (androidx.compose.ui.unit.l) obj);
                }
            }, 0.0f, true, 0L, 0.0f, 0.0f, false, androidx.compose.foundation.d4.f14136a.a(), 490, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n0.g x(Function0 function0, androidx.compose.ui.unit.d dVar) {
            return (n0.g) function0.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit y(androidx.compose.ui.unit.d dVar, androidx.compose.runtime.n3 n3Var, androidx.compose.ui.unit.l lVar) {
            n(n3Var, androidx.compose.ui.unit.u.e((((long) dVar.g6(androidx.compose.ui.unit.l.p(lVar.x()))) << 32) | (((long) dVar.g6(androidx.compose.ui.unit.l.m(lVar.x()))) & com.rabbitmq.client.k0.f265952a)));
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return k(a0Var, c0Var, num.intValue());
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 k(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(1980580247);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1980580247, i10, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:62)");
            }
            final androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
            Object objI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = d7.g(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.f42720b.a()), null, 2, null);
                c0Var.Y(objI0);
            }
            final androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI0;
            boolean zK0 = c0Var.k0(this.f21339a);
            final u3 u3Var = this.f21339a;
            Object objI1 = c0Var.i0();
            if (zK0 || objI1 == aVar.a()) {
                objI1 = new Function0() { // from class: androidx.compose.foundation.text.selection.s4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p4.e.s(u3Var, n3Var);
                    }
                };
                c0Var.Y(objI1);
            }
            Function0 function0 = (Function0) objI1;
            boolean zD = c0Var.D(dVar);
            Object objI2 = c0Var.i0();
            if (zD || objI2 == aVar.a()) {
                objI2 = new Function1() { // from class: androidx.compose.foundation.text.selection.t4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p4.e.v(dVar, n3Var, (Function0) obj);
                    }
                };
                c0Var.Y(objI2);
            }
            androidx.compose.ui.a0 a0VarG = v1.g(a0Var, function0, (Function1) objI2);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarG;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(u3 u3Var) {
        u3Var.E();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(u3 u3Var) {
        u3Var.A(false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(u3 u3Var) {
        u3Var.y0();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(u3 u3Var) {
        u3Var.z0();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(u3 u3Var) {
        u3Var.t();
        return Unit.f312394a;
    }

    private static final void F(androidx.compose.foundation.contextmenu.p pVar, androidx.compose.foundation.contextmenu.r rVar, h5 h5Var, boolean z10, Function0<Unit> function0) {
        if (z10) {
            androidx.compose.foundation.contextmenu.p.f(pVar, new androidx.compose.foundation.text.l2.e(h5Var), null, false, null, new androidx.compose.foundation.text.l2.f(function0, rVar), 14, null);
        }
    }

    public static final boolean G(@NotNull androidx.compose.ui.input.pointer.q qVar) {
        return false;
    }

    @NotNull
    public static final androidx.compose.ui.a0 H(@NotNull androidx.compose.ui.a0 a0Var, @NotNull u3 u3Var) {
        return !androidx.compose.foundation.g3.d(0, 1, null) ? a0Var : androidx.compose.ui.m.k(a0Var, null, new e(u3Var), 1, null);
    }

    @NotNull
    public static final androidx.compose.ui.a0 n(@NotNull androidx.compose.ui.a0 a0Var, @NotNull final u3 u3Var, @NotNull final kotlinx.coroutines.s0 s0Var) {
        return androidx.compose.foundation.text.contextmenu.modifier.k.a(a0Var, new Function2() { // from class: androidx.compose.foundation.text.selection.e4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return p4.o(u3Var, s0Var, (a0.a) obj, (Context) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(final u3 u3Var, final kotlinx.coroutines.s0 s0Var, a0.a aVar, final Context context) {
        boolean zS = u3Var.S();
        androidx.compose.ui.text.f fVarN0 = u3Var.n0();
        androidx.compose.ui.text.w3 w3VarB = null;
        String strM = fVarN0 != null ? fVarN0.m() : null;
        androidx.compose.ui.text.w3 w3VarZ = u3Var.Z();
        if (w3VarZ != null) {
            long jR = w3VarZ.r();
            androidx.compose.ui.text.input.m0 m0VarB0 = u3Var.b0();
            w3VarB = androidx.compose.ui.text.w3.b(androidx.compose.ui.text.x3.b(m0VarB0.b(androidx.compose.ui.text.w3.n(jR)), m0VarB0.b(androidx.compose.ui.text.w3.i(jR))));
        }
        d0.f(aVar, context, zS, strM, w3VarB, u3Var.d0(), new Function1() { // from class: androidx.compose.foundation.text.selection.d4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p4.p(u3Var, s0Var, context, (a0.a) obj);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(final u3 u3Var, kotlinx.coroutines.s0 s0Var, Context context, a0.a aVar) {
        aVar.d();
        w(aVar, s0Var, context, h5.f19338d, u3Var.w(), new a(u3Var, null));
        w(aVar, s0Var, context, h5.f19339e, u3Var.v(), new b(u3Var, null));
        w(aVar, s0Var, context, h5.f19340f, u3Var.x(), new c(u3Var, null));
        t(aVar, context, h5.f19341g, u3Var.y(), new Function0() { // from class: androidx.compose.foundation.text.selection.k4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(p4.q(u3Var));
            }
        }, new Function0() { // from class: androidx.compose.foundation.text.selection.l4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p4.r(u3Var);
            }
        });
        u(aVar, context, h5.f19342h, u3Var.u(), null, new Function0() { // from class: androidx.compose.foundation.text.selection.m4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p4.s(u3Var);
            }
        }, 8, null);
        aVar.d();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(u3 u3Var) {
        return !u3Var.h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(u3 u3Var) {
        u3Var.z0();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(u3 u3Var) {
        u3Var.t();
        return Unit.f312394a;
    }

    private static final void t(a0.a aVar, Context context, h5 h5Var, boolean z10, final Function0<Boolean> function0, final Function0<Unit> function1) {
        androidx.compose.foundation.text.l2.y(aVar, context.getResources(), h5Var, z10, new Function1() { // from class: androidx.compose.foundation.text.selection.o4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p4.v(function1, function0, (b0.g) obj);
            }
        });
    }

    static /* synthetic */ void u(a0.a aVar, Context context, h5 h5Var, boolean z10, Function0 function0, Function0 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function0 = null;
        }
        t(aVar, context, h5Var, z10, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function0 function0, Function0 function1, b0.g gVar) {
        function0.invoke();
        if (function1 != null ? ((Boolean) function1.invoke()).booleanValue() : true) {
            gVar.close();
        }
        return Unit.f312394a;
    }

    private static final void w(a0.a aVar, final kotlinx.coroutines.s0 s0Var, Context context, h5 h5Var, boolean z10, final Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1) {
        u(aVar, context, h5Var, z10, null, new Function0() { // from class: androidx.compose.foundation.text.selection.n4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p4.x(s0Var, function1);
            }
        }, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(kotlinx.coroutines.s0 s0Var, Function1 function1) {
        kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new d(function1, null), 1, null);
        return Unit.f312394a;
    }

    @NotNull
    public static final Function1<androidx.compose.foundation.contextmenu.p, Unit> y(@NotNull final u3 u3Var, @NotNull final androidx.compose.foundation.contextmenu.r rVar, @NotNull final n7<androidx.compose.foundation.text.u4> n7Var) {
        return new Function1() { // from class: androidx.compose.foundation.text.selection.f4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p4.z(n7Var, u3Var, rVar, (androidx.compose.foundation.contextmenu.p) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(n7 n7Var, final u3 u3Var, androidx.compose.foundation.contextmenu.r rVar, androidx.compose.foundation.contextmenu.p pVar) {
        int iO = ((androidx.compose.foundation.text.u4) n7Var.getValue()).o();
        F(pVar, rVar, h5.f19338d, androidx.compose.foundation.text.u4.i(iO), new Function0() { // from class: androidx.compose.foundation.text.selection.c4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p4.A(u3Var);
            }
        });
        F(pVar, rVar, h5.f19339e, androidx.compose.foundation.text.u4.h(iO), new Function0() { // from class: androidx.compose.foundation.text.selection.g4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p4.B(u3Var);
            }
        });
        F(pVar, rVar, h5.f19340f, androidx.compose.foundation.text.u4.j(iO), new Function0() { // from class: androidx.compose.foundation.text.selection.h4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p4.C(u3Var);
            }
        });
        F(pVar, rVar, h5.f19341g, androidx.compose.foundation.text.u4.k(iO), new Function0() { // from class: androidx.compose.foundation.text.selection.i4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p4.D(u3Var);
            }
        });
        F(pVar, rVar, h5.f19342h, androidx.compose.foundation.text.u4.g(iO), new Function0() { // from class: androidx.compose.foundation.text.selection.j4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p4.E(u3Var);
            }
        });
        return Unit.f312394a;
    }
}
