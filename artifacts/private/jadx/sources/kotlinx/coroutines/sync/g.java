package kotlinx.coroutines.sync;

import com.facebook.internal.w0;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.internal.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final z0 f315599a = new z0("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final z0 f315600b = new z0("ALREADY_LOCKED_BY_OWNER");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f315601c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f315602d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f315603e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f315604f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f315605g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f315606h = 2;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {121}, m = "withLock", n = {"$this$withLock", "owner", w0.f100156c1}, s = {"L$0", "L$1", "L$2"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f315608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f315609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f315610d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f315611e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315610d = obj;
            this.f315611e |= Integer.MIN_VALUE;
            return g.e(null, null, null, this);
        }
    }

    @NotNull
    public static final kotlinx.coroutines.sync.a a(boolean z10) {
        return new f(z10);
    }

    public static /* synthetic */ kotlinx.coroutines.sync.a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final <T> Object e(@NotNull kotlinx.coroutines.sync.a aVar, @Nullable Object obj, @NotNull Function0<? extends T> function0, @NotNull kotlin.coroutines.d<? super T> dVar) {
        a aVar2;
        if (dVar instanceof a) {
            aVar2 = (a) dVar;
            int i10 = aVar2.f315611e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f315611e = i10 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(dVar);
            }
        } else {
            aVar2 = new a(dVar);
        }
        Object obj2 = aVar2.f315610d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar2.f315611e;
        if (i11 == 0) {
            ResultKt.m(obj2);
            aVar2.f315607a = aVar;
            aVar2.f315608b = obj;
            aVar2.f315609c = function0;
            aVar2.f315611e = 1;
            if (aVar.h(obj, aVar2) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) aVar2.f315609c;
            obj = aVar2.f315608b;
            aVar = (kotlinx.coroutines.sync.a) aVar2.f315607a;
            ResultKt.m(obj2);
        }
        try {
            return function0.invoke();
        } finally {
            h0.d(1);
            aVar.i(obj);
            h0.c(1);
        }
    }

    private static final <T> Object f(kotlinx.coroutines.sync.a aVar, Object obj, Function0<? extends T> function0, kotlin.coroutines.d<? super T> dVar) {
        h0.e(0);
        aVar.h(obj, dVar);
        h0.e(1);
        try {
            T tInvoke = function0.invoke();
            h0.d(1);
            return tInvoke;
        } finally {
            h0.d(1);
            aVar.i(obj);
            h0.c(1);
        }
    }

    public static /* synthetic */ Object g(kotlinx.coroutines.sync.a aVar, Object obj, Function0 function0, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        h0.e(0);
        aVar.h(obj, dVar);
        h0.e(1);
        try {
            Object objInvoke = function0.invoke();
            h0.d(1);
            aVar.i(obj);
            h0.c(1);
            return objInvoke;
        } catch (Throwable th2) {
            h0.d(1);
            aVar.i(obj);
            h0.c(1);
            throw th2;
        }
    }
}
