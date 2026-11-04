package kotlinx.coroutines.debug.internal;

import androidx.constraintlayout.core.motion.utils.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a1;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@a1
@SourceDebugExtension({"SMAP\nDebugCoroutineInfoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugCoroutineInfoImpl.kt\nkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
public final class i {

    @oj.f
    @Nullable
    public volatile WeakReference<kotlin.coroutines.jvm.internal.e> _lastObservedFrame;

    @oj.f
    @NotNull
    public volatile String _state = j.f313976a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final s f313962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public final long f313963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final WeakReference<CoroutineContext> f313964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f313965d;

    @oj.f
    @Nullable
    public volatile Thread lastObservedThread;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super StackTraceElement>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f313966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f313967b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f313969d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s sVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f313969d = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = i.this.new a(this.f313969d, dVar);
            aVar.f313967b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f313966a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlin.sequences.n nVar = (kotlin.sequences.n) this.f313967b;
                i iVar = i.this;
                kotlin.coroutines.jvm.internal.e callerFrame = this.f313969d.getCallerFrame();
                this.f313966a = 1;
                if (iVar.k(nVar, callerFrame, this) == objL) {
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
        public final Object invoke(kotlin.sequences.n<? super StackTraceElement> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {0, 0}, l = {169}, m = "yieldFrames", n = {"$this$yieldFrames", v.a.L}, s = {"L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f313971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f313972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f313973d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f313975f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313973d = obj;
            this.f313975f |= Integer.MIN_VALUE;
            return i.this.k(null, null, this);
        }
    }

    public i(@Nullable CoroutineContext coroutineContext, @Nullable s sVar, long j10) {
        this.f313962a = sVar;
        this.f313963b = j10;
        this.f313964c = new WeakReference<>(coroutineContext);
    }

    private final List<StackTraceElement> b() {
        s sVar = this.f313962a;
        return sVar == null ? CollectionsKt.emptyList() : kotlin.sequences.o.c3(kotlin.sequences.o.b(new a(sVar, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0054 -> B:25:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0065 -> B:24:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:20:0x0056
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object k(kotlin.sequences.n<? super java.lang.StackTraceElement> r7, kotlin.coroutines.jvm.internal.e r8, kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.debug.internal.i.b
            if (r0 == 0) goto L17
            r0 = r9
            kotlinx.coroutines.debug.internal.i$b r0 = (kotlinx.coroutines.debug.internal.i.b) r0
            int r1 = r0.f313975f
            r5 = 4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r5 = 4
            r0.f313975f = r1
            r5 = 6
            goto L1c
        L17:
            kotlinx.coroutines.debug.internal.i$b r0 = new kotlinx.coroutines.debug.internal.i$b
            r0.<init>(r9)
        L1c:
            java.lang.Object r9 = r0.f313973d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 2
            int r2 = r0.f313975f
            r3 = 1
            r5 = r3
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r6 = r0.f313972c
            kotlinx.coroutines.debug.internal.i r6 = (kotlinx.coroutines.debug.internal.i) r6
            java.lang.Object r7 = r0.f313971b
            kotlin.coroutines.jvm.internal.e r7 = (kotlin.coroutines.jvm.internal.e) r7
            java.lang.Object r8 = r0.f313970a
            r5 = 5
            kotlin.sequences.n r8 = (kotlin.sequences.n) r8
            kotlin.ResultKt.m(r9)
            r5 = 0
            goto L68
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L45:
            r5 = 4
            kotlin.ResultKt.m(r9)
        L49:
            if (r8 != 0) goto L4f
            r5 = 6
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        L4f:
            java.lang.StackTraceElement r9 = r8.getStackTraceElement()
            r5 = 7
            if (r9 == 0) goto L6c
            r0.f313970a = r7
            r0.f313971b = r8
            r0.f313972c = r6
            r0.f313975f = r3
            java.lang.Object r9 = r7.b(r9, r0)
            if (r9 != r1) goto L65
            return r1
        L65:
            r4 = r8
            r8 = r7
            r7 = r4
        L68:
            r4 = r8
            r4 = r8
            r8 = r7
            r7 = r4
        L6c:
            r5 = 4
            kotlin.coroutines.jvm.internal.e r8 = r8.getCallerFrame()
            r5 = 1
            if (r8 == 0) goto L75
            goto L49
        L75:
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.i.k(kotlin.sequences.n, kotlin.coroutines.jvm.internal.e, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public final CoroutineContext c() {
        return this.f313964c.get();
    }

    @Nullable
    public final s d() {
        return this.f313962a;
    }

    @NotNull
    public final List<StackTraceElement> e() {
        return b();
    }

    @Nullable
    public final kotlin.coroutines.jvm.internal.e f() {
        WeakReference<kotlin.coroutines.jvm.internal.e> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @NotNull
    public final String g() {
        return this._state;
    }

    @NotNull
    public final List<StackTraceElement> h() {
        kotlin.coroutines.jvm.internal.e eVarF = f();
        if (eVarF == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        while (eVarF != null) {
            StackTraceElement stackTraceElement = eVarF.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            eVarF = eVarF.getCallerFrame();
        }
        return arrayList;
    }

    public final void i(@Nullable kotlin.coroutines.jvm.internal.e eVar) {
        this._lastObservedFrame = eVar != null ? new WeakReference<>(eVar) : null;
    }

    public final synchronized void j(@NotNull String str, @NotNull kotlin.coroutines.d<?> dVar, boolean z10) {
        try {
            if (Intrinsics.areEqual(this._state, j.f313977b) && Intrinsics.areEqual(str, j.f313977b) && z10) {
                this.f313965d++;
            } else if (this.f313965d > 0 && Intrinsics.areEqual(str, j.f313978c)) {
                this.f313965d--;
                return;
            }
            if (Intrinsics.areEqual(this._state, str) && Intrinsics.areEqual(str, j.f313978c) && f() != null) {
                return;
            }
            this._state = str;
            i(dVar instanceof kotlin.coroutines.jvm.internal.e ? (kotlin.coroutines.jvm.internal.e) dVar : null);
            this.lastObservedThread = Intrinsics.areEqual(str, j.f313977b) ? Thread.currentThread() : null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public String toString() {
        return "DebugCoroutineInfo(state=" + g() + ",context=" + c() + ')';
    }
}
