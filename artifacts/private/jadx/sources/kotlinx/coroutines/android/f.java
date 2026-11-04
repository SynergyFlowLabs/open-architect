package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.d3;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
public final class f extends g implements c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f313531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f313532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f313533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f f313534e;

    private f(Handler handler, String str, boolean z10) {
        super(null);
        this.f313531b = handler;
        this.f313532c = str;
        this.f313533d = z10;
        this.f313534e = z10 ? this : new f(handler, str, true);
    }

    private final void g1(CoroutineContext coroutineContext, Runnable runnable) {
        s2.f(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        l1.c().h(coroutineContext, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(f fVar, Runnable runnable) {
        fVar.f313531b.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p1(n nVar, f fVar) {
        nVar.n0(fVar, Unit.f312394a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s1(f fVar, Runnable runnable, Throwable th2) {
        fVar.f313531b.removeCallbacks(runnable);
        return Unit.f312394a;
    }

    @Override // kotlinx.coroutines.n0
    public boolean N(@NotNull CoroutineContext coroutineContext) {
        return (this.f313533d && Intrinsics.areEqual(Looper.myLooper(), this.f313531b.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.c1
    public void b(long j10, @NotNull final n<? super Unit> nVar) {
        final Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.android.d
            @Override // java.lang.Runnable
            public final void run() {
                f.p1(nVar, this);
            }
        };
        if (this.f313531b.postDelayed(runnable, r.C(j10, 4611686018427387903L))) {
            nVar.e0(new Function1() { // from class: kotlinx.coroutines.android.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.s1(this.f313529a, runnable, (Throwable) obj);
                }
            });
        } else {
            g1(nVar.getContext(), runnable);
        }
    }

    @Override // kotlinx.coroutines.android.g, kotlinx.coroutines.c1
    @NotNull
    public o1 d(long j10, @NotNull final Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        if (this.f313531b.postDelayed(runnable, r.C(j10, 4611686018427387903L))) {
            return new o1() { // from class: kotlinx.coroutines.android.c
                @Override // kotlinx.coroutines.o1
                public final void dispose() {
                    f.j1(this.f313525a, runnable);
                }
            };
        }
        g1(coroutineContext, runnable);
        return d3.f313923a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.f313531b == this.f313531b && fVar.f313533d == this.f313533d) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.coroutines.n0
    public void h(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (this.f313531b.post(runnable)) {
            return;
        }
        g1(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.android.g
    @NotNull
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public f R0() {
        return this.f313534e;
    }

    public int hashCode() {
        return (this.f313533d ? 1231 : 1237) ^ System.identityHashCode(this.f313531b);
    }

    @Override // kotlinx.coroutines.a3, kotlinx.coroutines.n0
    @NotNull
    public String toString() {
        String strO0 = O0();
        if (strO0 == null) {
            strO0 = this.f313532c;
            if (strO0 == null) {
                strO0 = this.f313531b.toString();
            }
            if (this.f313533d) {
                return strO0 + ".immediate";
            }
        }
        return strO0;
    }

    public /* synthetic */ f(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public f(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }
}
