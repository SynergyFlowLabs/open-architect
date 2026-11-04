package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.l1;
import java.lang.reflect.InvocationTargetException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlinx.coroutines.n;
import kotlinx.coroutines.p;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n426#2,11:213\n426#2,11:224\n1#3:235\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n184#1:213,11\n192#1:224,11\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f313536a = 4611686018427387903L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @Nullable
    public static final g f313537b;

    @Nullable
    private static volatile Choreographer choreographer;

    static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<Long> f313538a;

        /* JADX WARN: Multi-variable type inference failed */
        a(n<? super Long> nVar) {
            this.f313538a = nVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.n(this.f313538a);
        }
    }

    static {
        Object objM785constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(new f(e(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        f313537b = (g) (Result.m786isFailureimpl(objM785constructorimpl) ? null : objM785constructorimpl);
    }

    @l1
    @NotNull
    public static final Handler e(@NotNull Looper looper, boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }

    @Nullable
    public static final Object f(@NotNull kotlin.coroutines.d<? super Long> dVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return g(dVar);
        }
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        l(choreographer2, pVar);
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(kotlin.coroutines.d<? super Long> dVar) {
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n(pVar);
        } else {
            kotlinx.coroutines.l1.e().h(pVar.getContext(), new a(pVar));
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @j
    @oj.i(name = "from")
    @NotNull
    public static final g h(@NotNull Handler handler) {
        return j(handler, null, 1, null);
    }

    @j
    @oj.i(name = "from")
    @NotNull
    public static final g i(@NotNull Handler handler, @Nullable String str) {
        return new f(handler, str);
    }

    public static /* synthetic */ g j(Handler handler, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return i(handler, str);
    }

    @l(level = kotlin.n.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(Choreographer choreographer2, final n<? super Long> nVar) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                i.m(nVar, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(n nVar, long j10) {
        nVar.n0(kotlinx.coroutines.l1.e(), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(n<? super Long> nVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.checkNotNull(choreographer2);
            choreographer = choreographer2;
        }
        l(choreographer2, nVar);
    }
}
