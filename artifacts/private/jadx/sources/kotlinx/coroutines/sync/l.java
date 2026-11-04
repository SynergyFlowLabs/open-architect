package kotlinx.coroutines.sync;

import com.facebook.internal.w0;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.internal.e1;
import kotlinx.coroutines.internal.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f315622a = e1.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final z0 f315623b = new z0("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final z0 f315624c = new z0("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final z0 f315625d = new z0("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final z0 f315626e = new z0("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f315627f = e1.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.f160732u0}, m = "withPermit", n = {"$this$withPermit", w0.f100156c1}, s = {"L$0", "L$1"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f315629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f315630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f315631d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315630c = obj;
            this.f315631d |= Integer.MIN_VALUE;
            return l.k(null, null, this);
        }
    }

    static {
        int i10 = 5 << 0;
    }

    @NotNull
    public static final h a(int i10, int i11) {
        return new k(i10, i11);
    }

    public static /* synthetic */ h b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m j(long j10, m mVar) {
        return new m(j10, mVar, 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final <T> Object k(@NotNull h hVar, @NotNull Function0<? extends T> function0, @NotNull kotlin.coroutines.d<? super T> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f315631d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f315631d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f315630c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f315631d;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar.f315628a = hVar;
            aVar.f315629b = function0;
            aVar.f315631d = 1;
            if (hVar.g(aVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) aVar.f315629b;
            hVar = (h) aVar.f315628a;
            ResultKt.m(obj);
        }
        try {
            T tInvoke = function0.invoke();
            h0.d(1);
            hVar.release();
            return tInvoke;
        } finally {
            h0.d(1);
            hVar.release();
            h0.c(1);
        }
    }

    private static final <T> Object l(h hVar, Function0<? extends T> function0, kotlin.coroutines.d<? super T> dVar) {
        h0.e(0);
        hVar.g(dVar);
        h0.e(1);
        try {
            T tInvoke = function0.invoke();
            h0.d(1);
            hVar.release();
            return tInvoke;
        } finally {
            h0.d(1);
            hVar.release();
            h0.c(1);
        }
    }
}
