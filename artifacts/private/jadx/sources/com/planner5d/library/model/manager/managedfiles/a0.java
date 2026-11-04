package com.planner5d.library.model.manager.managedfiles;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import com.planner5d.library.model.manager.w1;
import com.planner5d.library.services.utility.f1;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nManagedFileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagedFileManager.kt\ncom/planner5d/library/model/manager/managedfiles/ManagedFileManager\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n381#2,7:113\n1#3:120\n*S KotlinDebug\n*F\n+ 1 ManagedFileManager.kt\ncom/planner5d/library/model/manager/managedfiles/ManagedFileManager\n*L\n39#1:113,7\n*E\n"})
public final class a0 implements w1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f191954l = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final fg.e<y> f191955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.p f191956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final fg.e<p.a> f191957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.initialization.r f191958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f1 f191959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private v f191960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c1<v> f191961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Object f191962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Map<String, r> f191963k;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.ManagedFileManager$restartDownload$1", f = "ManagedFileManager.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191964a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a0.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191964a;
            if (i10 == 0) {
                ResultKt.m(obj);
                y yVar = (y) a0.this.f191955c.get();
                this.f191964a = 1;
                if (yVar.r(this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            a0.this.e(true);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.ManagedFileManager$startDownload$1", f = "ManagedFileManager.kt", i = {}, l = {67, com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191966a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f191968c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f191968c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a0.this.new b(this.f191968c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r6.h(r1, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r4 = 7
                int r1 = r5.f191966a
                r2 = 2
                r4 = 5
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L25
                if (r1 == r3) goto L21
                if (r1 != r2) goto L16
                kotlin.ResultKt.m(r6)
                r4 = 3
                goto L59
            L16:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r4 = 5
                java.lang.String r6 = "kus/l/uoe  /c/oetrrlrnosvmeinicwb i//a/ te/te  ofeo"
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L21:
                kotlin.ResultKt.m(r6)
                goto L3b
            L25:
                r4 = 5
                kotlin.ResultKt.m(r6)
                com.planner5d.library.model.manager.managedfiles.a0 r6 = com.planner5d.library.model.manager.managedfiles.a0.this
                com.planner5d.library.model.manager.initialization.r r6 = com.planner5d.library.model.manager.managedfiles.a0.b(r6)
                r5.f191966a = r3
                r4 = 6
                java.lang.Object r6 = r6.m(r5)
                r4 = 3
                if (r6 != r0) goto L3b
                r4 = 4
                goto L57
            L3b:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L59
                com.planner5d.library.model.manager.managedfiles.a0 r6 = com.planner5d.library.model.manager.managedfiles.a0.this
                com.planner5d.library.model.manager.managedfiles.r r6 = com.planner5d.library.model.manager.managedfiles.a0.c(r6)
                r4 = 2
                boolean r1 = r5.f191968c
                r4 = 7
                r5.f191966a = r2
                r4 = 4
                java.lang.Object r5 = r6.h(r1, r5)
                r4 = 6
                if (r5 != r0) goto L59
            L57:
                r4 = 3
                return r0
            L59:
                r4 = 4
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.managedfiles.a0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.managedfiles.ManagedFileManager$stopDownload$1", f = "ManagedFileManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160705l0}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191969a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a0.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191969a;
            if (i10 == 0) {
                ResultKt.m(obj);
                y yVar = (y) a0.this.f191955c.get();
                this.f191969a = 1;
                if (yVar.r(this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a0(@NotNull fg.e<y> downloadManager, @NotNull com.planner5d.library.model.manager.builtin.p datafileManager, @NotNull fg.e<p.a> datafileOperationsFactory, @NotNull com.planner5d.library.model.manager.initialization.r initializationManager, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(datafileManager, "datafileManager");
        Intrinsics.checkNotNullParameter(datafileOperationsFactory, "datafileOperationsFactory");
        Intrinsics.checkNotNullParameter(initializationManager, "initializationManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f191955c = downloadManager;
        this.f191956d = datafileManager;
        this.f191957e = datafileOperationsFactory;
        this.f191958f = initializationManager;
        this.f191959g = coroutineScope;
        this.f191961i = new c1<>();
        this.f191962j = new Object();
        this.f191963k = new LinkedHashMap();
    }

    @m1
    private final r f(com.planner5d.library.model.d dVar) {
        r rVar;
        synchronized (this.f191962j) {
            try {
                Map<String, r> map = this.f191963k;
                String str = dVar.f180677a;
                r rVarA = map.get(str);
                if (rVarA == null) {
                    rVarA = this.f191957e.get().a(dVar);
                    map.put(str, rVarA);
                }
                rVar = rVarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final r h() {
        r rVarF;
        com.planner5d.library.model.d dVarB = this.f191956d.b();
        if (dVarB != null && (rVarF = f(dVarB)) != null) {
            return rVarF;
        }
        return q.f192062a;
    }

    @m1
    public final boolean d(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return h().a(path);
    }

    @Override // com.planner5d.library.model.manager.w1
    public void e(boolean z10) {
        kotlinx.coroutines.k.f(this.f191959g, com.planner5d.library.services.utility.s.f229729a.d(), null, new b(z10, null), 2, null);
    }

    @Nullable
    public final Object i(@NotNull kotlin.coroutines.d<? super v> dVar) {
        return h().e(dVar);
    }

    @NotNull
    public final androidx.lifecycle.w0<v> j() {
        return this.f191961i;
    }

    @m1
    public final void k(@Nullable com.planner5d.library.model.d dVar, @Nullable File file) throws Throwable {
        if (dVar != null) {
            f(dVar).b(file);
            e(true);
        }
    }

    @m1
    public final boolean l(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return h().c(path);
    }

    @m1
    public final boolean m(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return h().f(path);
    }

    public final void n() {
        kotlinx.coroutines.k.f(this.f191959g, null, null, new a(null), 3, null);
    }

    @m1
    public final void o(int i10) {
        h().d(i10);
    }

    @m1
    public final void p(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        h().g(path);
    }

    public final void q() {
        kotlinx.coroutines.k.f(this.f191959g, null, null, new c(null), 3, null);
    }

    @m1
    public final void r(@NotNull v state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f191960h != null) {
            String str = state.a().f180677a;
            com.planner5d.library.model.d dVarB = this.f191956d.b();
            if (!Intrinsics.areEqual(str, dVarB != null ? dVarB.f180677a : null)) {
                return;
            }
        }
        this.f191960h = state;
        this.f191961i.o(state);
    }

    @m1
    public final void t() {
        h().validate();
    }
}
