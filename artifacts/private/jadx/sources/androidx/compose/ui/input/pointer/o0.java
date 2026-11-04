package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.platform.r2;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,409:1\n110#2:410\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n*L\n73#1:410\n*E\n"})
public final class o0 {

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<MotionEvent, Unit> f39095a;

        /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.o0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", f = "PointerInteropFilter.android.kt", i = {0}, l = {404}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
        static final class C0298a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f39096a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f39097b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<MotionEvent, Unit> f39098c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0298a(Function1<? super MotionEvent, Unit> function1, kotlin.coroutines.d<? super C0298a> dVar) {
                super(2, dVar);
                this.f39098c = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0298a c0298a = new C0298a(this.f39098c, dVar);
                c0298a.f39097b = obj;
                return c0298a;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0034 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:14:0x003e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:12:0x0035). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r5.f39096a
                    r4 = 0
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L16
                    r4 = 2
                    java.lang.Object r1 = r5.f39097b
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    r4 = 7
                    kotlin.ResultKt.m(r6)
                    goto L35
                L16:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    r4 = 7
                    throw r5
                L1f:
                    kotlin.ResultKt.m(r6)
                    java.lang.Object r6 = r5.f39097b
                    androidx.compose.ui.input.pointer.c r6 = (androidx.compose.ui.input.pointer.c) r6
                    r1 = r6
                L27:
                    androidx.compose.ui.input.pointer.s r6 = androidx.compose.ui.input.pointer.s.Initial
                    r5.f39097b = r1
                    r4 = 5
                    r5.f39096a = r2
                    java.lang.Object r6 = r1.I6(r6, r5)
                    if (r6 != r0) goto L35
                    return r0
                L35:
                    r4 = 7
                    androidx.compose.ui.input.pointer.q r6 = (androidx.compose.ui.input.pointer.q) r6
                    android.view.MotionEvent r6 = r6.i()
                    if (r6 == 0) goto L27
                    kotlin.jvm.functions.Function1<android.view.MotionEvent, kotlin.Unit> r3 = r5.f39098c
                    r3.invoke(r6)
                    goto L27
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.o0.a.C0298a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0298a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super MotionEvent, Unit> function1) {
            this.f39095a = function1;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            l0Var.t6(true);
            Object objG5 = l0Var.g5(new C0298a(this.f39095a, null), dVar);
            return objG5 == kotlin.coroutines.intrinsics.b.l() ? objG5 : Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n*L\n1#1,110:1\n74#2,5:111\n*E\n"})
    public static final class b extends kotlin.jvm.internal.l0 implements Function1<t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0 f39099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f39100b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u0 u0Var, Function1 function1) {
            super(1);
            this.f39099a = u0Var;
            this.f39100b = function1;
        }

        public final void c(t2 t2Var) {
            t2Var.d("pointerInteropFilter");
            t2Var.b().c("requestDisallowInterceptTouchEvent", this.f39099a);
            t2Var.b().c("onTouchEvent", this.f39100b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt$pointerInteropFilter$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,409:1\n1282#2,6:410\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt$pointerInteropFilter$2\n*L\n80#1:410,6\n*E\n"})
    static final class c extends kotlin.jvm.internal.l0 implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<MotionEvent, Boolean> f39101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0 f39102b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super MotionEvent, Boolean> function1, u0 u0Var) {
            super(3);
            this.f39101a = function1;
            this.f39102b = u0Var;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(374375707);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(374375707, i10, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:79)");
            }
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new n0();
                c0Var.Y(objI0);
            }
            n0 n0Var = (n0) objI0;
            n0Var.g(this.f39101a);
            n0Var.h(this.f39102b);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return n0Var;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<MotionEvent, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.b f39103a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.viewinterop.b bVar) {
            super(1);
            this.f39103a = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = this.f39103a.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    zDispatchTouchEvent = this.f39103a.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(zDispatchTouchEvent);
        }
    }

    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super MotionEvent, Unit> function1) {
        return w0.e(a0Var, function1, new a(function1));
    }

    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @Nullable u0 u0Var, @NotNull Function1<? super MotionEvent, Boolean> function1) {
        return androidx.compose.ui.m.f(a0Var, r2.e() ? new b(u0Var, function1) : r2.b(), new c(function1, u0Var));
    }

    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.viewinterop.b bVar) {
        n0 n0Var = new n0();
        n0Var.g(new d(bVar));
        u0 u0Var = new u0();
        n0Var.h(u0Var);
        bVar.setOnRequestDisallowInterceptTouchEvent$ui_release(u0Var);
        return a0Var.B2(n0Var);
    }

    public static /* synthetic */ androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, u0 u0Var, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            u0Var = null;
        }
        return b(a0Var, u0Var, function1);
    }
}
