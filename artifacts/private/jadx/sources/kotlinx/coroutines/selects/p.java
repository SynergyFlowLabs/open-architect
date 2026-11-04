package kotlinx.coroutines.selects;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.internal.z0;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f315551b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f315552c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f315553d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f315554e = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final pj.n<Object, Object, Object, Object> f315550a = a.f315560a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final z0 f315555f = new z0("STATE_REG");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final z0 f315556g = new z0("STATE_COMPLETED");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final z0 f315557h = new z0("STATE_CANCELLED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final z0 f315558i = new z0("NO_RESULT");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final z0 f315559j = new z0("PARAM_CLAUSE_0");

    static final class a implements pj.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f315560a = new a();

        a() {
        }

        @Override // pj.n
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    @k2
    public static /* synthetic */ void a() {
    }

    @k2
    public static /* synthetic */ void b() {
    }

    @k2
    public static /* synthetic */ void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s d(int i10) {
        if (i10 == 0) {
            return s.SUCCESSFUL;
        }
        if (i10 == 1) {
            return s.REREGISTER;
        }
        if (i10 == 2) {
            return s.CANCELLED;
        }
        if (i10 == 3) {
            return s.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    @NotNull
    public static final z0 l() {
        return f315559j;
    }

    @Nullable
    public static final <R> Object m(@NotNull Function1<? super d<? super R>, Unit> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        m mVar = new m(dVar.getContext());
        function1.invoke(mVar);
        return mVar.w(dVar);
    }

    private static final <R> Object n(Function1<? super d<? super R>, Unit> function1, kotlin.coroutines.d<? super R> dVar) {
        h0.e(3);
        boolean z10 = false;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(kotlinx.coroutines.n<? super Unit> nVar, pj.n<? super Throwable, Object, ? super CoroutineContext, Unit> nVar2) {
        Object objP = nVar.P(Unit.f312394a, null, nVar2);
        if (objP == null) {
            return false;
        }
        nVar.b0(objP);
        return true;
    }
}
