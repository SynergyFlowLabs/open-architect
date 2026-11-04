package androidx.compose.material;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,362:1\n85#2:363\n117#2,2:364\n116#3,7:366\n124#3:384\n318#4,11:373\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n*L\n73#1:363\n73#1:364,2\n103#1:366,7\n103#1:384\n105#1:373,11\n*E\n"})
public final class ig {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f23136c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f23137a = kotlinx.coroutines.sync.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f23138b = androidx.compose.runtime.d7.g(null, null, 2, null);

    @androidx.compose.runtime.k7
    private static final class a implements xf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f23139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f23140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final zf f23141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.n<sg> f23142d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull String str, @Nullable String str2, @NotNull zf zfVar, @NotNull kotlinx.coroutines.n<? super sg> nVar) {
            this.f23139a = str;
            this.f23140b = str2;
            this.f23141c = zfVar;
            this.f23142d = nVar;
        }

        @Override // androidx.compose.material.xf
        @NotNull
        public String Q() {
            return this.f23139a;
        }

        @Override // androidx.compose.material.xf
        public void R() {
            if (this.f23142d.isActive()) {
                kotlinx.coroutines.n<sg> nVar = this.f23142d;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(sg.ActionPerformed));
            }
        }

        @Override // androidx.compose.material.xf
        @Nullable
        public String S() {
            return this.f23140b;
        }

        @Override // androidx.compose.material.xf
        public void dismiss() {
            if (this.f23142d.isActive()) {
                kotlinx.coroutines.n<sg> nVar = this.f23142d;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(sg.Dismissed));
            }
        }

        @Override // androidx.compose.material.xf
        @NotNull
        public zf getDuration() {
            return this.f23141c;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {367, 370}, m = "showSnackbar", n = {"message", "actionLabel", "duration", "$this$withLock_u24default$iv", "message", "actionLabel", "duration", "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f23144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f23145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f23146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f23147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23148f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f23150h;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f23148f = obj;
            this.f23150h |= Integer.MIN_VALUE;
            return ig.this.d(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(xf xfVar) {
        this.f23138b.setValue(xfVar);
    }

    public static /* synthetic */ Object e(ig igVar, String str, String str2, zf zfVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            zfVar = zf.Short;
        }
        return igVar.d(str, str2, zfVar, dVar);
    }

    @Nullable
    public final xf b() {
        return (xf) this.f23138b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object d(@NotNull String str, @Nullable String str2, @NotNull zf zfVar, @NotNull kotlin.coroutines.d<? super sg> dVar) {
        b bVar;
        kotlinx.coroutines.sync.a aVar;
        String str3;
        kotlinx.coroutines.sync.a aVar2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f23150h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f23150h = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f23148f;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f23150h;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.m(obj);
                    aVar = this.f23137a;
                    bVar.f23143a = str;
                    bVar.f23144b = str2;
                    bVar.f23145c = zfVar;
                    bVar.f23146d = aVar;
                    bVar.f23150h = 1;
                    if (aVar.h(null, bVar) != objL) {
                    }
                    str3 = str;
                    return objL;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (kotlinx.coroutines.sync.a) bVar.f23146d;
                    try {
                        ResultKt.m(obj);
                        c(null);
                        aVar2.i(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        c(null);
                        throw th;
                    }
                }
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) bVar.f23146d;
                zfVar = (zf) bVar.f23145c;
                str2 = (String) bVar.f23144b;
                String str4 = (String) bVar.f23143a;
                ResultKt.m(obj);
                aVar = aVar3;
                str3 = str4;
                str3 = str;
                bVar.f23143a = str3;
                bVar.f23144b = str2;
                bVar.f23145c = zfVar;
                bVar.f23146d = aVar;
                bVar.f23147e = bVar;
                bVar.f23150h = 2;
                kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(bVar), 1);
                pVar.p0();
                c(new a(str3, str2, zfVar, pVar));
                Object objU = pVar.u();
                if (objU == kotlin.coroutines.intrinsics.b.l()) {
                    kotlin.coroutines.jvm.internal.h.c(bVar);
                }
                if (objU != objL) {
                    kotlinx.coroutines.sync.a aVar4 = aVar;
                    obj = objU;
                    aVar2 = aVar4;
                    c(null);
                    aVar2.i(null);
                    return obj;
                }
                str3 = str;
                return objL;
            } catch (Throwable th3) {
                th = th3;
                c(null);
                throw th;
            }
        } catch (Throwable th4) {
            str.i(null);
            throw th4;
        }
    }
}
