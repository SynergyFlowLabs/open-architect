package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class j0 implements n3, kotlinx.coroutines.s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f40524e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f40525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.input.a1 f40526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f40527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicReference<androidx.compose.ui.g0.a<Object>> f40528d = androidx.compose.ui.g0.b();

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", i = {}, l = {71}, m = "startInputMethod", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f40529a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f40531c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40529a = obj;
            this.f40531c |= Integer.MIN_VALUE;
            return j0.this.c(null, this);
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<kotlinx.coroutines.s0, o2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3 f40532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f40533b;

        static final class a extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j0 f40534a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j0 j0Var) {
                super(0);
                this.f40534a = j0Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlinx.coroutines.t0.f(this.f40534a.f40527c, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j3 j3Var, j0 j0Var) {
            super(1);
            this.f40532a = j3Var;
            this.f40533b = j0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final o2 invoke(kotlinx.coroutines.s0 s0Var) {
            return new o2(this.f40532a, new a(this.f40533b));
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", i = {0}, l = {184}, m = "invokeSuspend", n = {"methodSession"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,183:1\n318#2,11:184\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3\n*L\n80#1:184,11\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<o2, kotlin.coroutines.d<?>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f40535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f40536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f40537c;

        static final class a extends kotlin.jvm.internal.l0 implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o2 f40539a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0 f40540b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o2 o2Var, j0 j0Var) {
                super(1);
                this.f40539a = o2Var;
                this.f40540b = j0Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                this.f40539a.d();
                this.f40540b.f40526b.f();
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = j0.this.new c(dVar);
            cVar.f40537c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f40536b;
            if (i10 == 0) {
                ResultKt.m(obj);
                o2 o2Var = (o2) this.f40537c;
                j0 j0Var = j0.this;
                this.f40537c = o2Var;
                this.f40535a = j0Var;
                this.f40536b = 1;
                kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(this), 1);
                pVar.p0();
                j0Var.f40526b.e();
                pVar.e0(new a(o2Var, j0Var));
                Object objU = pVar.u();
                if (objU == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (objU == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new kotlin.a0();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o2 o2Var, kotlin.coroutines.d<?> dVar) {
            return ((c) create(o2Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public j0(@NotNull View view, @NotNull androidx.compose.ui.text.input.a1 a1Var, @NotNull kotlinx.coroutines.s0 s0Var) {
        this.f40525a = view;
        this.f40526b = a1Var;
        this.f40527c = s0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.compose.ui.platform.m3
    @Nullable
    public Object c(@NotNull j3 j3Var, @NotNull kotlin.coroutines.d<?> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f40531c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f40531c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f40529a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f40531c;
        if (i11 == 0) {
            ResultKt.m(obj);
            AtomicReference<androidx.compose.ui.g0.a<Object>> atomicReference = this.f40528d;
            b bVar = new b(j3Var, this);
            c cVar = new c(null);
            aVar.f40531c = 1;
            if (androidx.compose.ui.g0.j(atomicReference, bVar, cVar, aVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        throw new kotlin.a0();
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f40527c.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.m3
    @NotNull
    public View getView() {
        return this.f40525a;
    }

    @Nullable
    public final InputConnection i(@NotNull EditorInfo editorInfo) {
        o2 o2Var = (o2) androidx.compose.ui.g0.f(this.f40528d);
        if (o2Var != null) {
            return o2Var.c(editorInfo);
        }
        return null;
    }

    public final boolean j() {
        o2 o2Var = (o2) androidx.compose.ui.g0.f(this.f40528d);
        int i10 = 6 << 0;
        return o2Var != null && o2Var.e();
    }
}
