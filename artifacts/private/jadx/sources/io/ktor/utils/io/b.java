package io.ktor.utils.io;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nByteChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannel.kt\nio/ktor/utils/io/ByteChannel\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Synchronized.kt\nio/ktor/utils/io/locks/SynchronizedKt\n*L\n1#1,281:1\n152#1,2:282\n154#1:293\n185#1,27:294\n165#1,5:321\n213#1:326\n155#1:327\n157#1:330\n165#1,5:332\n152#1,2:337\n154#1:348\n185#1,27:349\n165#1,5:376\n213#1:381\n155#1:382\n157#1:385\n165#1,5:387\n185#1,27:401\n165#1,5:428\n213#1:433\n165#1,5:436\n426#2,9:284\n435#2,2:328\n426#2,9:339\n435#2,2:383\n426#2,9:392\n435#2,2:434\n84#3:331\n84#3:386\n*S KotlinDebug\n*F\n+ 1 ByteChannel.kt\nio/ktor/utils/io/ByteChannel\n*L\n74#1:282,2\n74#1:293\n74#1:294,27\n74#1:321,5\n74#1:326\n74#1:327\n74#1:330\n89#1:332,5\n99#1:337,2\n99#1:348\n99#1:349,27\n99#1:376,5\n99#1:381\n99#1:382\n99#1:385\n114#1:387,5\n154#1:401,27\n154#1:428,5\n154#1:433\n211#1:436,5\n74#1:284,9\n74#1:328,2\n99#1:339,9\n99#1:383,2\n153#1:392,9\n153#1:434,2\n84#1:331\n108#1:386\n*E\n"})
public final class b implements h, io.ktor.utils.io.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f296837g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "suspensionSlot");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f296838h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closedCause");

    @NotNull
    volatile /* synthetic */ Object _closedCause;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f296839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.io.b f296840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f296841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.io.b f296842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlinx.io.b f296843f;
    private volatile int flushBufferSize;

    @NotNull
    volatile /* synthetic */ Object suspensionSlot;

    private interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2095b f296844a = C2095b.f296846a;

        /* JADX INFO: renamed from: io.ktor.utils.io.b$a$a, reason: collision with other inner class name */
        public static final class C2094a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            private final Throwable f296845b;

            public C2094a(@Nullable Throwable th2) {
                this.f296845b = th2;
            }

            public static /* synthetic */ C2094a i(C2094a c2094a, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    th2 = c2094a.f296845b;
                }
                return c2094a.h(th2);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2094a) && Intrinsics.areEqual(this.f296845b, ((C2094a) obj).f296845b);
            }

            @Nullable
            public final Throwable g() {
                return this.f296845b;
            }

            @NotNull
            public final C2094a h(@Nullable Throwable th2) {
                return new C2094a(th2);
            }

            public int hashCode() {
                Throwable th2 = this.f296845b;
                if (th2 == null) {
                    return 0;
                }
                return th2.hashCode();
            }

            @Nullable
            public final Throwable j() {
                return this.f296845b;
            }

            @NotNull
            public String toString() {
                return "Closed(cause=" + this.f296845b + ')';
            }
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.b$a$b, reason: collision with other inner class name */
        public static final class C2095b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ C2095b f296846a = new C2095b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private static final C2094a f296847b = new C2094a(null);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            private static final Object f296848c;

            static {
                Result.a aVar = Result.Companion;
                f296848c = Result.m785constructorimpl(Unit.f312394a);
            }

            private C2095b() {
            }

            @oj.n
            public static /* synthetic */ void b() {
            }

            @oj.n
            public static /* synthetic */ void d() {
            }

            @NotNull
            public final C2094a a() {
                return f296847b;
            }

            @NotNull
            public final Object c() {
                return f296848c;
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final c f296849b = new c();

            private c() {
            }

            public boolean equals(@Nullable Object obj) {
                if (this != obj && !(obj instanceof c)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -231472095;
            }

            @NotNull
            public String toString() {
                return "Empty";
            }
        }

        public static final class d implements e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final kotlin.coroutines.d<Unit> f296850b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            private Throwable f296851c;

            /* JADX WARN: Multi-variable type inference failed */
            public d(@NotNull kotlin.coroutines.d<? super Unit> continuation) {
                Intrinsics.checkNotNullParameter(continuation, "continuation");
                this.f296850b = continuation;
                if (g.a()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ReadTask 0x");
                    String string = Integer.toString(f().hashCode(), CharsKt.checkRadix(16));
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    sb2.append(string);
                    Throwable th2 = new Throwable(sb2.toString());
                    kotlin.p.i(th2);
                    g(th2);
                }
            }

            @Override // io.ktor.utils.io.b.a.e
            @NotNull
            public String a() {
                return "read";
            }

            @Override // io.ktor.utils.io.b.a.e
            public void b(@Nullable Throwable th2) {
                e.C2096a.b(this, th2);
            }

            @Override // io.ktor.utils.io.b.a.e
            @Nullable
            public Throwable e() {
                return this.f296851c;
            }

            @Override // io.ktor.utils.io.b.a.e
            @NotNull
            public kotlin.coroutines.d<Unit> f() {
                return this.f296850b;
            }

            public void g(@Nullable Throwable th2) {
                this.f296851c = th2;
            }

            @Override // io.ktor.utils.io.b.a.e
            public void p() {
                e.C2096a.a(this);
            }
        }

        public interface e extends a {

            /* JADX INFO: renamed from: io.ktor.utils.io.b$a$e$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nByteChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannel.kt\nio/ktor/utils/io/ByteChannel$Slot$Task$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
            public static final class C2096a {
                public static void a(@NotNull e eVar) {
                    eVar.f().resumeWith(a.f296844a.c());
                }

                public static void b(@NotNull e eVar, @Nullable Throwable th2) {
                    Object objC;
                    kotlin.coroutines.d<Unit> dVarF = eVar.f();
                    if (th2 != null) {
                        Result.a aVar = Result.Companion;
                        objC = Result.m785constructorimpl(ResultKt.createFailure(th2));
                    } else {
                        objC = a.f296844a.c();
                    }
                    dVarF.resumeWith(objC);
                }

                public static /* synthetic */ void c(e eVar, Throwable th2, int i10, Object obj) {
                    if (obj != null) {
                        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resume");
                    }
                    if ((i10 & 1) != 0) {
                        th2 = null;
                    }
                    eVar.b(th2);
                }
            }

            @NotNull
            String a();

            void b(@Nullable Throwable th2);

            @Nullable
            Throwable e();

            @NotNull
            kotlin.coroutines.d<Unit> f();

            void p();
        }

        public static final class f implements e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final kotlin.coroutines.d<Unit> f296852b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            private Throwable f296853c;

            /* JADX WARN: Multi-variable type inference failed */
            public f(@NotNull kotlin.coroutines.d<? super Unit> continuation) {
                Intrinsics.checkNotNullParameter(continuation, "continuation");
                this.f296852b = continuation;
                if (g.a()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("WriteTask 0x");
                    String string = Integer.toString(f().hashCode(), CharsKt.checkRadix(16));
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    sb2.append(string);
                    Throwable th2 = new Throwable(sb2.toString());
                    kotlin.p.i(th2);
                    g(th2);
                }
            }

            @Override // io.ktor.utils.io.b.a.e
            @NotNull
            public String a() {
                return "write";
            }

            @Override // io.ktor.utils.io.b.a.e
            public void b(@Nullable Throwable th2) {
                e.C2096a.b(this, th2);
            }

            @Override // io.ktor.utils.io.b.a.e
            @Nullable
            public Throwable e() {
                return this.f296853c;
            }

            @Override // io.ktor.utils.io.b.a.e
            @NotNull
            public kotlin.coroutines.d<Unit> f() {
                return this.f296852b;
            }

            public void g(@Nullable Throwable th2) {
                this.f296853c = th2;
            }

            @Override // io.ktor.utils.io.b.a.e
            public void p() {
                e.C2096a.a(this);
            }
        }

        @NotNull
        static Object c() {
            return f296844a.c();
        }

        @NotNull
        static C2094a d() {
            return f296844a.a();
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", i = {0, 0}, l = {284}, m = "awaitContent", n = {"this_$iv", "min"}, s = {"L$0", "I$0"})
    static final class C2097b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f296856c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f296858e;

        C2097b(kotlin.coroutines.d<? super C2097b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296856c = obj;
            this.f296858e |= Integer.MIN_VALUE;
            return b.this.f(0, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", i = {0}, l = {284}, m = "flush", n = {"this_$iv"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f296860b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f296862d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296860b = obj;
            this.f296862d |= Integer.MIN_VALUE;
            return b.this.d(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", i = {}, l = {128}, m = "flushAndClose", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f296863a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f296865c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296863a = obj;
            this.f296865c |= Integer.MIN_VALUE;
            return b.this.g(this);
        }
    }

    /* synthetic */ class e extends kotlin.jvm.internal.g0 implements Function1<Throwable, d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f296866a = new e();

        e() {
            super(1, d0.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final d0 invoke(Throwable th2) {
            return new d0(th2);
        }
    }

    /* synthetic */ class f extends kotlin.jvm.internal.g0 implements Function1<Throwable, e0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f296867a = new f();

        f() {
            super(1, e0.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final e0 invoke(Throwable th2) {
            return new e0(th2);
        }
    }

    public b() {
        this(false, 1, null);
    }

    private final void m(Throwable th2) {
        a aVar = (a) f296837g.getAndSet(this, th2 != null ? new a.C2094a(th2) : a.f296844a.a());
        if (aVar instanceof a.e) {
            ((a.e) aVar).b(th2);
        }
    }

    private static /* synthetic */ void o() {
    }

    @o0
    public static /* synthetic */ void p() {
    }

    @o0
    public static /* synthetic */ void q() {
    }

    private final void r() {
        synchronized (this.f296841d) {
            try {
                this.f296840c.T8(this.f296842e);
                this.flushBufferSize = 0;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a aVar = (a) this.suspensionSlot;
        if ((aVar instanceof a.f) && androidx.concurrent.futures.b.a(f296837g, this, aVar, a.c.f296849b)) {
            ((a.e) aVar).p();
        }
    }

    private final /* synthetic */ <Expected extends a.e> void s() {
        a aVar = (a) this.suspensionSlot;
        Intrinsics.reifiedOperationMarker(3, "Expected");
        if ((aVar instanceof a.e) && androidx.concurrent.futures.b.a(f296837g, this, aVar, a.c.f296849b)) {
            ((a.e) aVar).p();
        }
    }

    private final /* synthetic */ <TaskType extends a.e> Object t(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends TaskType> function1, Function0<Boolean> function0, kotlin.coroutines.d<? super Unit> dVar) {
        while (function0.invoke().booleanValue()) {
            kotlin.jvm.internal.h0.e(0);
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            pVar.p0();
            TaskType tasktypeInvoke = function1.invoke(pVar);
            a aVar = (a) this.suspensionSlot;
            boolean z10 = aVar instanceof a.C2094a;
            if (z10 || androidx.concurrent.futures.b.a(f296837g, this, aVar, tasktypeInvoke)) {
                Intrinsics.reifiedOperationMarker(3, "TaskType");
                boolean z11 = aVar instanceof a.e;
                if (z11) {
                    a.e eVar = (a.e) aVar;
                    eVar.b(new f0(tasktypeInvoke.a(), eVar.e()));
                } else if (z11) {
                    ((a.e) aVar).p();
                } else if (z10) {
                    tasktypeInvoke.b(((a.C2094a) aVar).j());
                    Unit unit = Unit.f312394a;
                } else if (!Intrinsics.areEqual(aVar, a.c.f296849b)) {
                    throw new kotlin.k0();
                }
                if (!function0.invoke().booleanValue()) {
                    a aVar2 = (a) this.suspensionSlot;
                    Intrinsics.reifiedOperationMarker(3, "TaskType");
                    if ((aVar2 instanceof a.e) && androidx.concurrent.futures.b.a(f296837g, this, aVar2, a.c.f296849b)) {
                        ((a.e) aVar2).p();
                    }
                }
            } else {
                tasktypeInvoke.p();
                Unit unit2 = Unit.f312394a;
            }
            Unit unit3 = Unit.f312394a;
            if (pVar.u() == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            kotlin.jvm.internal.h0.e(1);
        }
        return Unit.f312394a;
    }

    private final /* synthetic */ <TaskType extends a.e> void u(TaskType tasktype, Function0<Boolean> function0) {
        a aVar = (a) this.suspensionSlot;
        boolean z10 = aVar instanceof a.C2094a;
        if (!z10 && !androidx.concurrent.futures.b.a(f296837g, this, aVar, tasktype)) {
            tasktype.p();
            return;
        }
        Intrinsics.reifiedOperationMarker(3, "TaskType");
        boolean z11 = aVar instanceof a.e;
        if (z11) {
            a.e eVar = (a.e) aVar;
            eVar.b(new f0(tasktype.a(), eVar.e()));
        } else if (z11) {
            ((a.e) aVar).p();
        } else if (z10) {
            tasktype.b(((a.C2094a) aVar).j());
            return;
        } else if (!Intrinsics.areEqual(aVar, a.c.f296849b)) {
            throw new kotlin.k0();
        }
        if (!function0.invoke().booleanValue()) {
            a aVar2 = (a) this.suspensionSlot;
            Intrinsics.reifiedOperationMarker(3, "TaskType");
            if ((aVar2 instanceof a.e) && androidx.concurrent.futures.b.a(f296837g, this, aVar2, a.c.f296849b)) {
                ((a.e) aVar2).p();
            }
        }
    }

    @Override // io.ktor.utils.io.a
    @o0
    public void a() {
        if (!this.f296843f.y1()) {
            synchronized (this.f296841d) {
                try {
                    int iJ = (int) this.f296843f.j();
                    this.f296840c.la(this.f296843f);
                    this.flushBufferSize += iJ;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            a aVar = (a) this.suspensionSlot;
            if ((aVar instanceof a.d) && androidx.concurrent.futures.b.a(f296837g, this, aVar, a.c.f296849b)) {
                ((a.e) aVar).p();
            }
        }
    }

    @Override // io.ktor.utils.io.h, io.ktor.utils.io.p
    public void c(@Nullable Throwable th2) {
        if (this._closedCause != null) {
            return;
        }
        a0 a0Var = new a0(th2);
        androidx.concurrent.futures.b.a(f296838h, this, null, a0Var);
        m(a0.c(a0Var, null, 1, null));
    }

    @Override // io.ktor.utils.io.a
    public void close() {
        a();
        if (androidx.concurrent.futures.b.a(f296838h, this, null, b0.a())) {
            m(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // io.ktor.utils.io.p
    @Nullable
    public Object d(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        c cVar;
        b bVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f296862d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f296862d = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f296860b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f296862d;
        if (i11 == 0) {
            ResultKt.m(obj);
            k.Z(this);
            a();
            if (this.flushBufferSize < 1048576) {
                return Unit.f312394a;
            }
            bVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) cVar.f296859a;
            ResultKt.m(obj);
        }
        while (this.flushBufferSize >= 1048576 && this._closedCause == null) {
            cVar.f296859a = bVar;
            cVar.f296862d = 1;
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(cVar), 1);
            pVar.p0();
            a.f fVar = new a.f(pVar);
            a aVar = (a) bVar.suspensionSlot;
            boolean z10 = aVar instanceof a.C2094a;
            if (z10 || androidx.concurrent.futures.b.a(f296837g, bVar, aVar, fVar)) {
                if (aVar instanceof a.f) {
                    a.e eVar = (a.e) aVar;
                    eVar.b(new f0(fVar.a(), eVar.e()));
                } else if (aVar instanceof a.e) {
                    ((a.e) aVar).p();
                } else if (z10) {
                    fVar.b(((a.C2094a) aVar).j());
                } else if (!Intrinsics.areEqual(aVar, a.c.f296849b)) {
                    throw new kotlin.k0();
                }
                if (this.flushBufferSize < 1048576 || this._closedCause != null) {
                    a aVar2 = (a) bVar.suspensionSlot;
                    if ((aVar2 instanceof a.f) && androidx.concurrent.futures.b.a(f296837g, bVar, aVar2, a.c.f296849b)) {
                        ((a.e) aVar2).p();
                    }
                }
            } else {
                fVar.p();
            }
            Object objU = pVar.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(cVar);
            }
            if (objU == objL) {
                return objL;
            }
        }
        return Unit.f312394a;
    }

    @Override // io.ktor.utils.io.h, io.ktor.utils.io.p
    @Nullable
    public Throwable e() {
        a0 a0Var = (a0) this._closedCause;
        if (a0Var != null) {
            return a0.c(a0Var, null, 1, null);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // io.ktor.utils.io.h
    @Nullable
    public Object f(int i10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        C2097b c2097b;
        b bVar;
        Object objU;
        if (dVar instanceof C2097b) {
            c2097b = (C2097b) dVar;
            int i11 = c2097b.f296858e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2097b.f296858e = i11 - Integer.MIN_VALUE;
            } else {
                c2097b = new C2097b(dVar);
            }
        } else {
            c2097b = new C2097b(dVar);
        }
        Object obj = c2097b.f296856c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = c2097b.f296858e;
        boolean z10 = true;
        if (i12 == 0) {
            ResultKt.m(obj);
            k.Z(this);
            if (this.f296842e.j() >= i10) {
                return kotlin.coroutines.jvm.internal.b.a(true);
            }
            bVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = c2097b.f296854a;
            bVar = (b) c2097b.f296855b;
            ResultKt.m(obj);
        }
        do {
            long j10 = i10;
            if (((long) this.flushBufferSize) + this.f296842e.j() >= j10 || this._closedCause != null) {
                if (this.f296842e.j() < 1048576) {
                    r();
                }
                if (this.f296842e.j() < j10) {
                    z10 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z10);
            }
            c2097b.f296855b = bVar;
            c2097b.f296854a = i10;
            c2097b.f296858e = 1;
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(c2097b), 1);
            pVar.p0();
            a.d dVar2 = new a.d(pVar);
            a aVar = (a) bVar.suspensionSlot;
            boolean z11 = aVar instanceof a.C2094a;
            if (z11 || androidx.concurrent.futures.b.a(f296837g, bVar, aVar, dVar2)) {
                if (aVar instanceof a.d) {
                    a.e eVar = (a.e) aVar;
                    eVar.b(new f0(dVar2.a(), eVar.e()));
                } else if (aVar instanceof a.e) {
                    ((a.e) aVar).p();
                } else if (z11) {
                    dVar2.b(((a.C2094a) aVar).j());
                } else if (!Intrinsics.areEqual(aVar, a.c.f296849b)) {
                    throw new kotlin.k0();
                }
                if (((long) this.flushBufferSize) + this.f296842e.j() >= j10 || this._closedCause != null) {
                    a aVar2 = (a) bVar.suspensionSlot;
                    if ((aVar2 instanceof a.d) && androidx.concurrent.futures.b.a(f296837g, bVar, aVar2, a.c.f296849b)) {
                        ((a.e) aVar2).p();
                    }
                }
            } else {
                dVar2.p();
            }
            objU = pVar.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(c2097b);
            }
        } while (objU != objL);
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // io.ktor.utils.io.p
    @Nullable
    public Object g(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f296865c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f296865c = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f296863a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f296865c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                Result.a aVar = Result.Companion;
                dVar2.f296865c = 1;
                if (d(dVar2) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            Result.m785constructorimpl(Unit.f312394a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        if (!androidx.concurrent.futures.b.a(f296838h, this, null, b0.a())) {
            return Unit.f312394a;
        }
        m(null);
        return Unit.f312394a;
    }

    @Override // io.ktor.utils.io.p
    public boolean h() {
        return this._closedCause != null;
    }

    @Override // io.ktor.utils.io.p
    @NotNull
    public kotlinx.io.x i() throws e0 {
        a0 a0Var;
        if (h() && ((a0Var = (a0) this._closedCause) == null || a0Var.a(f.f296867a) == null)) {
            throw new e0(null, 1, null);
        }
        return this.f296843f;
    }

    @Override // io.ktor.utils.io.h
    @NotNull
    public kotlinx.io.c0 j() throws Throwable {
        a0 a0Var = (a0) this._closedCause;
        if (a0Var != null) {
            a0Var.a(e.f296866a);
        }
        if (this.f296842e.y1()) {
            r();
        }
        return this.f296842e;
    }

    @Override // io.ktor.utils.io.h
    public boolean k() {
        if (e() == null && (!h() || this.flushBufferSize != 0 || !this.f296842e.y1())) {
            return false;
        }
        return true;
    }

    public final boolean n() {
        return this.f296839b;
    }

    @NotNull
    public String toString() {
        return "ByteChannel[" + hashCode() + AbstractJsonLexerKt.END_LIST;
    }

    public b(boolean z10) {
        this.f296839b = z10;
        this.f296840c = new kotlinx.io.b();
        this.f296841d = new Object();
        this.suspensionSlot = a.c.f296849b;
        this.f296842e = new kotlinx.io.b();
        this.f296843f = new kotlinx.io.b();
        this._closedCause = null;
    }

    public /* synthetic */ b(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
