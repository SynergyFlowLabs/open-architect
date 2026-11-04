package androidx.compose.material3;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,423:1\n85#2:424\n117#2,2:425\n116#3,7:427\n124#3:445\n318#4,11:434\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n*L\n72#1:424\n72#1:425,2\n126#1:427,7\n126#1:445\n128#1:434,11\n*E\n"})
public final class f10 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27484c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f27485a = kotlinx.coroutines.sync.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f27486b = androidx.compose.runtime.d7.g(null, null, 2, null);

    private static final class a implements u00 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final p10 f27487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.n<o10> f27488b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull p10 p10Var, @NotNull kotlinx.coroutines.n<? super o10> nVar) {
            this.f27487a = p10Var;
            this.f27488b = nVar;
        }

        @Override // androidx.compose.material3.u00
        public void R() {
            if (this.f27488b.isActive()) {
                kotlinx.coroutines.n<o10> nVar = this.f27488b;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(o10.ActionPerformed));
            }
        }

        @Override // androidx.compose.material3.u00
        @NotNull
        public p10 a() {
            return this.f27487a;
        }

        @Override // androidx.compose.material3.u00
        public void dismiss() {
            if (this.f27488b.isActive()) {
                kotlinx.coroutines.n<o10> nVar = this.f27488b;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(o10.Dismissed));
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(a(), aVar.a()) && Intrinsics.areEqual(this.f27488b, aVar.f27488b);
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f27488b.hashCode();
        }
    }

    private static final class b implements p10 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f27489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f27490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f27491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final w00 f27492d;

        public b(@NotNull String str, @Nullable String str2, boolean z10, @NotNull w00 w00Var) {
            this.f27489a = str;
            this.f27490b = str2;
            this.f27491c = z10;
            this.f27492d = w00Var;
        }

        @Override // androidx.compose.material3.p10
        @NotNull
        public String Q() {
            return this.f27489a;
        }

        @Override // androidx.compose.material3.p10
        @Nullable
        public String S() {
            return this.f27490b;
        }

        @Override // androidx.compose.material3.p10
        public boolean a() {
            return this.f27491c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(Q(), bVar.Q()) && Intrinsics.areEqual(S(), bVar.S()) && a() == bVar.a() && getDuration() == bVar.getDuration();
        }

        @Override // androidx.compose.material3.p10
        @NotNull
        public w00 getDuration() {
            return this.f27492d;
        }

        public int hashCode() {
            int iHashCode = Q().hashCode() * 31;
            String strS = S();
            return ((((iHashCode + (strS != null ? strS.hashCode() : 0)) * 31) + Boolean.hashCode(a())) * 31) + getDuration().hashCode();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 1, 1, 1}, l = {428, 431}, m = "showSnackbar", n = {"visuals", "$this$withLock_u24default$iv", "visuals", "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f27495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f27496d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f27498f;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f27496d = obj;
            this.f27498f |= Integer.MIN_VALUE;
            return f10.this.d(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(u00 u00Var) {
        this.f27486b.setValue(u00Var);
    }

    public static /* synthetic */ Object f(f10 f10Var, String str, String str2, boolean z10, w00 w00Var, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            w00Var = str3 == null ? w00.Short : w00.Indefinite;
        }
        return f10Var.e(str, str3, z11, w00Var, dVar);
    }

    @Nullable
    public final u00 b() {
        return (u00) this.f27486b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object d(@NotNull p10 p10Var, @NotNull kotlin.coroutines.d<? super o10> dVar) {
        c cVar;
        kotlinx.coroutines.sync.a aVar;
        p10 p10Var2;
        Throwable th2;
        kotlinx.coroutines.sync.a aVar2;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f27498f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f27498f = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f27496d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f27498f;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f27485a;
                    cVar.f27493a = p10Var;
                    cVar.f27494b = aVar;
                    cVar.f27498f = 1;
                    if (aVar.h(null, cVar) == objL) {
                        p10Var2 = p10Var;
                    }
                    return objL;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (kotlinx.coroutines.sync.a) cVar.f27494b;
                    try {
                        ResultKt.m(obj);
                        c(null);
                        aVar2.i(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        c(null);
                        throw th2;
                    }
                }
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) cVar.f27494b;
                p10 p10Var3 = (p10) cVar.f27493a;
                ResultKt.m(obj);
                aVar = aVar3;
                p10Var2 = p10Var3;
                p10Var2 = p10Var;
                cVar.f27493a = p10Var2;
                cVar.f27494b = aVar;
                cVar.f27495c = cVar;
                cVar.f27498f = 2;
                kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(cVar), 1);
                pVar.p0();
                c(new a(p10Var2, pVar));
                Object objU = pVar.u();
                if (objU == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(cVar);
                }
                if (objU != objL) {
                    kotlinx.coroutines.sync.a aVar4 = aVar;
                    obj = objU;
                    aVar2 = aVar4;
                    c(null);
                    aVar2.i(null);
                    return obj;
                }
                return objL;
            } catch (Throwable th4) {
                th2 = th4;
                c(null);
                throw th2;
            }
        } catch (Throwable th5) {
            p10Var.i(null);
            throw th5;
        }
    }

    @Nullable
    public final Object e(@NotNull String str, @Nullable String str2, boolean z10, @NotNull w00 w00Var, @NotNull kotlin.coroutines.d<? super o10> dVar) {
        return d(new b(str, str2, z10, w00Var), dVar);
    }
}
