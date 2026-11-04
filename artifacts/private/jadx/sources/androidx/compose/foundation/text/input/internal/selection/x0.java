package androidx.compose.foundation.text.input.internal.selection;

import android.content.Context;
import androidx.compose.foundation.text.h5;
import androidx.compose.foundation.text.l2;
import androidx.compose.foundation.text.u4;
import androidx.compose.runtime.n7;
import androidx.compose.ui.text.w3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextFieldSelectionState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.android.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt\n+ 2 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n*L\n1#1,139:1\n202#2,7:140\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.android.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt\n*L\n47#1:140,7\n*E\n"})
public final class x0 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1", f = "TextFieldSelectionState.android.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f20043b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d0 d0Var, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f20043b = d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new a(this.f20043b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20042a;
            if (i10 == 0) {
                ResultKt.m(obj);
                d0 d0Var = this.f20043b;
                this.f20042a = 1;
                if (d0Var.T(this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$2", f = "TextFieldSelectionState.android.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f20045b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d0 d0Var, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f20045b = d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new b(this.f20045b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20044a;
            if (i10 == 0) {
                ResultKt.m(obj);
                d0 d0Var = this.f20045b;
                boolean zI0 = d0Var.I0();
                this.f20044a = 1;
                if (d0Var.Q(zI0, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$3", f = "TextFieldSelectionState.android.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160733u1}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f20047b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d0 d0Var, kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
            this.f20047b = d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new c(this.f20047b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20046a;
            if (i10 == 0) {
                ResultKt.m(obj);
                d0 d0Var = this.f20047b;
                this.f20046a = 1;
                if (d0Var.V0(this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1", f = "TextFieldSelectionState.android.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160702k0}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f20049b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f20049b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f20049b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f20048a;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f20049b;
                this.f20048a = 1;
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

    @SourceDebugExtension({"SMAP\nContextMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$2\n+ 2 TextFieldSelectionState.android.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt\n*L\n1#1,206:1\n47#2:207\n*E\n"})
    public static final class e implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.contextmenu.r f20050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f20051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d0 f20052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h5 f20053d;

        public e(androidx.compose.foundation.contextmenu.r rVar, Function2 function2, d0 d0Var, h5 h5Var) {
            this.f20050a = rVar;
            this.f20051b = function2;
            this.f20052c = d0Var;
            this.f20053d = h5Var;
        }

        public final void c() {
            this.f20051b.invoke(this.f20052c, this.f20053d);
            androidx.compose.foundation.contextmenu.s.a(this.f20050a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            c();
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final androidx.compose.ui.a0 i(@NotNull androidx.compose.ui.a0 a0Var, @NotNull final d0 d0Var, @NotNull final kotlinx.coroutines.s0 s0Var) {
        return androidx.compose.foundation.text.contextmenu.modifier.k.a(a0Var, new Function2() { // from class: androidx.compose.foundation.text.input.internal.selection.q0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return x0.j(d0Var, s0Var, (a0.a) obj, (Context) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(final d0 d0Var, final kotlinx.coroutines.s0 s0Var, a0.a aVar, final Context context) {
        androidx.compose.foundation.text.selection.d0.f(aVar, context, d0Var.v0(), d0Var.G0().u().i(), w3.b(d0Var.G0().u().h()), d0Var.y0(), new Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x0.k(d0Var, s0Var, context, (a0.a) obj);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(final d0 d0Var, kotlinx.coroutines.s0 s0Var, Context context, a0.a aVar) {
        aVar.d();
        r(aVar, s0Var, context, d0Var, h5.f19338d, d0Var.M(), new a(d0Var, null));
        r(aVar, s0Var, context, d0Var, h5.f19339e, d0Var.L(), new b(d0Var, null));
        r(aVar, s0Var, context, d0Var, h5.f19340f, d0Var.N(), new c(d0Var, null));
        o(aVar, context, d0Var, h5.f19341g, d0Var.O(), a1.Selection, new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.u0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(x0.l(d0Var));
            }
        }, new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x0.m(d0Var);
            }
        });
        p(aVar, context, d0Var, h5.f19342h, d0Var.K(), null, null, new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.w0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x0.n(d0Var);
            }
        }, 48, null);
        aVar.d();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(d0 d0Var) {
        return !d0Var.I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(d0 d0Var) {
        d0Var.Y0();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(d0 d0Var) {
        d0Var.J();
        return Unit.f312394a;
    }

    private static final void o(a0.a aVar, Context context, final d0 d0Var, h5 h5Var, boolean z10, final a1 a1Var, final Function0<Boolean> function0, final Function0<Unit> function1) {
        l2.y(aVar, context.getResources(), h5Var, z10, new Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x0.q(function1, function0, d0Var, a1Var, (b0.g) obj);
            }
        });
    }

    static /* synthetic */ void p(a0.a aVar, Context context, d0 d0Var, h5 h5Var, boolean z10, a1 a1Var, Function0 function0, Function0 function1, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            a1Var = a1.None;
        }
        a1 a1Var2 = a1Var;
        if ((i10 & 32) != 0) {
            function0 = null;
        }
        o(aVar, context, d0Var, h5Var, z10, a1Var2, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function0 function0, Function0 function1, d0 d0Var, a1 a1Var, b0.g gVar) {
        function0.invoke();
        if (function1 != null ? ((Boolean) function1.invoke()).booleanValue() : true) {
            gVar.close();
        }
        d0Var.t1(a1Var);
        return Unit.f312394a;
    }

    private static final void r(a0.a aVar, final kotlinx.coroutines.s0 s0Var, Context context, d0 d0Var, h5 h5Var, boolean z10, final Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1) {
        p(aVar, context, d0Var, h5Var, z10, null, null, new Function0() { // from class: androidx.compose.foundation.text.input.internal.selection.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x0.s(s0Var, function1);
            }
        }, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(kotlinx.coroutines.s0 s0Var, Function1 function1) {
        kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new d(function1, null), 1, null);
        return Unit.f312394a;
    }

    @NotNull
    public static final Function1<androidx.compose.foundation.contextmenu.p, Unit> t(@NotNull final d0 d0Var, @NotNull final androidx.compose.foundation.contextmenu.r rVar, @NotNull final n7<u4> n7Var, @NotNull final Function2<? super d0, ? super h5, Unit> function2) {
        return new Function1() { // from class: androidx.compose.foundation.text.input.internal.selection.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x0.u(n7Var, rVar, function2, d0Var, (androidx.compose.foundation.contextmenu.p) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(n7 n7Var, androidx.compose.foundation.contextmenu.r rVar, Function2 function2, d0 d0Var, androidx.compose.foundation.contextmenu.p pVar) {
        int iO = ((u4) n7Var.getValue()).o();
        v(pVar, rVar, function2, d0Var, h5.f19338d, u4.i(iO));
        v(pVar, rVar, function2, d0Var, h5.f19339e, u4.h(iO));
        v(pVar, rVar, function2, d0Var, h5.f19340f, u4.j(iO));
        v(pVar, rVar, function2, d0Var, h5.f19341g, u4.k(iO));
        v(pVar, rVar, function2, d0Var, h5.f19342h, u4.g(iO));
        return Unit.f312394a;
    }

    private static final void v(androidx.compose.foundation.contextmenu.p pVar, androidx.compose.foundation.contextmenu.r rVar, Function2<? super d0, ? super h5, Unit> function2, d0 d0Var, h5 h5Var, boolean z10) {
        if (z10) {
            androidx.compose.foundation.contextmenu.p.f(pVar, new l2.e(h5Var), null, false, null, new e(rVar, function2, d0Var, h5Var), 14, null);
        }
    }
}
