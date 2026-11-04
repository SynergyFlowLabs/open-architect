package com.planner5d.library.services.utility;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nAtomicMultiplePermitsSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicMultiplePermitsSemaphore.kt\ncom/planner5d/library/services/utility/AtomicMultiplePermitsSemaphore\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,44:1\n116#2,10:45\n*S KotlinDebug\n*F\n+ 1 AtomicMultiplePermitsSemaphore.kt\ncom/planner5d/library/services/utility/AtomicMultiplePermitsSemaphore\n*L\n22#1:45,10\n*E\n"})
public final class g implements kotlinx.coroutines.sync.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.h f225231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f225232b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.AtomicMultiplePermitsSemaphore", f = "AtomicMultiplePermitsSemaphore.kt", i = {0, 0, 0, 1, 1, 1}, l = {49, 24}, m = "acquire", n = {"this", "$this$withLock_u24default$iv", "permits", "this", "$this$withLock_u24default$iv", "permits"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f225233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f225234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f225235c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f225236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f225237e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f225239g;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f225237e = obj;
            this.f225239g |= Integer.MIN_VALUE;
            return g.this.b(0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.AtomicMultiplePermitsSemaphore", f = "AtomicMultiplePermitsSemaphore.kt", i = {0, 0, 0, 1, 1}, l = {36, 38}, m = "withPermits", n = {"this", com.facebook.internal.w0.f100156c1, "permits", "this", "permits"}, s = {"L$0", "L$1", "I$0", "L$0", "I$0"})
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f225240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f225241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f225242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f225243d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f225245f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f225243d = obj;
            this.f225245f |= Integer.MIN_VALUE;
            return g.this.d(0, null, this);
        }
    }

    public g(@NotNull kotlinx.coroutines.sync.h semaphore) {
        Intrinsics.checkNotNullParameter(semaphore, "semaphore");
        this.f225231a = semaphore;
        this.f225232b = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    @Override // kotlinx.coroutines.sync.h
    public boolean a() {
        return this.f225231a.a();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007c A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003d, B:30:0x0091, B:26:0x007c, B:31:0x0093), top: B:36:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003d, B:30:0x0091, B:26:0x007c, B:31:0x0093), top: B:36:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (r10.g(r0) == r1) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008d -> B:30:0x0091). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            r7 = 0
            boolean r0 = r10 instanceof com.planner5d.library.services.utility.g.a
            if (r0 == 0) goto L17
            r0 = r10
            r7 = 5
            com.planner5d.library.services.utility.g$a r0 = (com.planner5d.library.services.utility.g.a) r0
            int r1 = r0.f225239g
            r7 = 2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r7 = 2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f225239g = r1
            goto L1d
        L17:
            r7 = 7
            com.planner5d.library.services.utility.g$a r0 = new com.planner5d.library.services.utility.g$a
            r0.<init>(r10)
        L1d:
            java.lang.Object r10 = r0.f225237e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f225239g
            r3 = 5
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5e
            r7 = 5
            if (r2 == r4) goto L4c
            if (r2 != r3) goto L44
            int r8 = r0.f225236d
            r7 = 4
            int r9 = r0.f225235c
            java.lang.Object r2 = r0.f225234b
            kotlinx.coroutines.sync.a r2 = (kotlinx.coroutines.sync.a) r2
            java.lang.Object r6 = r0.f225233a
            com.planner5d.library.services.utility.g r6 = (com.planner5d.library.services.utility.g) r6
            kotlin.ResultKt.m(r10)     // Catch: java.lang.Throwable -> L41
            goto L91
        L41:
            r8 = move-exception
            r7 = 1
            goto L99
        L44:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4c:
            int r9 = r0.f225235c
            java.lang.Object r8 = r0.f225234b
            kotlinx.coroutines.sync.a r8 = (kotlinx.coroutines.sync.a) r8
            java.lang.Object r2 = r0.f225233a
            com.planner5d.library.services.utility.g r2 = (com.planner5d.library.services.utility.g) r2
            kotlin.ResultKt.m(r10)
            r10 = r8
            r10 = r8
            r8 = r2
            r7 = 4
            goto L74
        L5e:
            kotlin.ResultKt.m(r10)
            kotlinx.coroutines.sync.a r10 = r8.f225232b
            r0.f225233a = r8
            r0.f225234b = r10
            r0.f225235c = r9
            r7 = 5
            r0.f225239g = r4
            java.lang.Object r2 = r10.h(r5, r0)
            if (r2 != r1) goto L74
            r7 = 4
            goto L8f
        L74:
            r2 = 0
            r6 = r8
            r7 = 6
            r8 = r2
            r2 = r10
            r2 = r10
        L7a:
            if (r8 >= r9) goto L93
            kotlinx.coroutines.sync.h r10 = r6.f225231a     // Catch: java.lang.Throwable -> L41
            r0.f225233a = r6     // Catch: java.lang.Throwable -> L41
            r0.f225234b = r2     // Catch: java.lang.Throwable -> L41
            r0.f225235c = r9     // Catch: java.lang.Throwable -> L41
            r0.f225236d = r8     // Catch: java.lang.Throwable -> L41
            r0.f225239g = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r10 = r10.g(r0)     // Catch: java.lang.Throwable -> L41
            r7 = 3
            if (r10 != r1) goto L91
        L8f:
            r7 = 5
            return r1
        L91:
            int r8 = r8 + r4
            goto L7a
        L93:
            kotlin.Unit r8 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L41
            r2.i(r5)
            return r8
        L99:
            r2.i(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.services.utility.g.b(int, kotlin.coroutines.d):java.lang.Object");
    }

    public final void c(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            release();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final <T> Object d(int i10, @NotNull Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super T> dVar) {
        b bVar;
        g gVar;
        int i11;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i12 = bVar.f225245f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f225245f = i12 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objInvoke = bVar.f225243d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i13 = bVar.f225245f;
        try {
            if (i13 == 0) {
                ResultKt.m(objInvoke);
                bVar.f225240a = this;
                bVar.f225241b = function1;
                bVar.f225242c = i10;
                bVar.f225245f = 1;
                if (b(i10, bVar) != objL) {
                }
                return objL;
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = bVar.f225242c;
                gVar = (g) bVar.f225240a;
                try {
                    ResultKt.m(objInvoke);
                    gVar.c(i11);
                    return objInvoke;
                } catch (Throwable th2) {
                    th = th2;
                    gVar.c(i11);
                    throw th;
                }
            }
            i10 = bVar.f225242c;
            function1 = (Function1) bVar.f225241b;
            this = (g) bVar.f225240a;
            ResultKt.m(objInvoke);
            bVar.f225240a = this;
            bVar.f225241b = null;
            bVar.f225242c = i10;
            bVar.f225245f = 2;
            objInvoke = function1.invoke(bVar);
            if (objInvoke != objL) {
                int i14 = i10;
                gVar = this;
                i11 = i14;
                gVar.c(i11);
                return objInvoke;
            }
            return objL;
        } catch (Throwable th3) {
            th = th3;
            int i15 = i10;
            gVar = this;
            i11 = i15;
            gVar.c(i11);
            throw th;
        }
    }

    @Override // kotlinx.coroutines.sync.h
    public int f() {
        return this.f225231a.f();
    }

    @Override // kotlinx.coroutines.sync.h
    @Nullable
    public Object g(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objB = b(1, dVar);
        return objB == kotlin.coroutines.intrinsics.b.l() ? objB : Unit.f312394a;
    }

    @Override // kotlinx.coroutines.sync.h
    public void release() {
        this.f225231a.release();
    }
}
