package io.ktor.network.selector;

import androidx.compose.animation.core.z1;
import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.channels.d0;
import kotlinx.coroutines.h4;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nActorSelectorManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActorSelectorManager.kt\nio/ktor/network/selector/ActorSelectorManager\n+ 2 ActorSelectorManager.kt\nio/ktor/network/selector/ActorSelectorManager$ContinuationHolder\n*L\n1#1,209:1\n110#1,4:210\n200#2,6:214\n*S KotlinDebug\n*F\n+ 1 ActorSelectorManager.kt\nio/ktor/network/selector/ActorSelectorManager\n*L\n97#1:210,4\n169#1:214,6\n*E\n"})
public final class a extends l implements Closeable, s0 {
    private volatile boolean closed;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicLong f296134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final b<Unit, kotlin.coroutines.d<Unit>> f296135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.ktor.network.selector.d<h> f296136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f296137g;
    private volatile boolean inSelect;

    @Nullable
    private volatile Selector selectorRef;

    /* JADX INFO: renamed from: io.ktor.network.selector.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.selector.ActorSelectorManager$1", f = "ActorSelectorManager.kt", i = {0}, l = {44}, m = "invokeSuspend", n = {"currentSelector"}, s = {"L$2"})
    static final class C2078a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f296141d;

        C2078a(kotlin.coroutines.d<? super C2078a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C2078a(dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [io.ktor.network.selector.a$a, kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v13, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v16 */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Type inference failed for: r6v9, types: [java.io.Closeable] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            a aVar;
            AbstractSelector abstractSelector;
            Throwable th2;
            AbstractSelector abstractSelector2;
            ?? r10;
            a aVar2;
            AbstractSelector abstractSelector3;
            ?? r11;
            a aVar3;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f296141d;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    AbstractSelector abstractSelectorOpenSelector = a.this.u0().openSelector();
                    if (abstractSelectorOpenSelector == null) {
                        throw new IllegalStateException("openSelector() = null");
                    }
                    a.this.selectorRef = abstractSelectorOpenSelector;
                    aVar = a.this;
                    try {
                        io.ktor.network.selector.d dVar = aVar.f296136f;
                        this.f296138a = abstractSelectorOpenSelector;
                        this.f296139b = aVar;
                        this.f296140c = abstractSelectorOpenSelector;
                        this.f296141d = 1;
                        if (aVar.r0(dVar, abstractSelectorOpenSelector, this) == objL) {
                            return objL;
                        }
                        AbstractSelector abstractSelector4 = abstractSelectorOpenSelector;
                        abstractSelector2 = abstractSelector4;
                        aVar3 = aVar;
                        r11 = abstractSelector4;
                        aVar3.closed = true;
                        aVar3.f296136f.b();
                        aVar3.selectorRef = null;
                        abstractSelector3 = abstractSelector2;
                        aVar2 = aVar3;
                        r10 = r11;
                    } catch (Throwable th3) {
                        abstractSelector = abstractSelectorOpenSelector;
                        th2 = th3;
                        this = abstractSelector;
                        aVar.closed = true;
                        aVar.f296136f.b();
                        aVar.f(abstractSelector, th2);
                        aVar.closed = true;
                        aVar.f296136f.b();
                        aVar.selectorRef = null;
                        abstractSelector3 = abstractSelector;
                        aVar2 = aVar;
                        r10 = this;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractSelector = (AbstractSelector) this.f296140c;
                    aVar = (a) this.f296139b;
                    this = (Closeable) this.f296138a;
                    try {
                        ResultKt.m(obj);
                        abstractSelector2 = abstractSelector;
                        aVar3 = aVar;
                        r11 = this;
                        aVar3.closed = true;
                        aVar3.f296136f.b();
                        aVar3.selectorRef = null;
                        abstractSelector3 = abstractSelector2;
                        aVar2 = aVar3;
                        r10 = r11;
                    } catch (Throwable th4) {
                        th2 = th4;
                        try {
                            aVar.closed = true;
                            aVar.f296136f.b();
                            aVar.f(abstractSelector, th2);
                            aVar.closed = true;
                            aVar.f296136f.b();
                            aVar.selectorRef = null;
                            abstractSelector3 = abstractSelector;
                            aVar2 = aVar;
                            r10 = this;
                        } catch (Throwable th5) {
                            aVar.closed = true;
                            aVar.f296136f.b();
                            aVar.selectorRef = null;
                            aVar.f(abstractSelector, null);
                            throw th5;
                        }
                    }
                }
                aVar2.f(abstractSelector3, null);
                while (true) {
                    h hVar = (h) aVar2.f296136f.d();
                    if (hVar == null) {
                        Unit unit = Unit.f312394a;
                        kotlin.io.c.a(r10, null);
                        return unit;
                    }
                    aVar2.e(hVar, new d0("Failed to apply interest: selector closed"));
                }
            } catch (Throwable th6) {
                try {
                    throw th6;
                } catch (Throwable th7) {
                    kotlin.io.c.a(this, th6);
                    throw th7;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C2078a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private static final class b<R, C extends kotlin.coroutines.d<? super R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final AtomicReference<C> f296143a = new AtomicReference<>(null);

        public final boolean b(R r10) {
            C andSet = this.f296143a.getAndSet(null);
            if (andSet == null) {
                return false;
            }
            Result.a aVar = Result.Companion;
            andSet.resumeWith(Result.m785constructorimpl(r10));
            return true;
        }

        @Nullable
        public final Object c(@NotNull C continuation, @NotNull Function0<Boolean> condition) {
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            Intrinsics.checkNotNullParameter(condition, "condition");
            if (!condition.invoke().booleanValue()) {
                return null;
            }
            if (!z1.a(this.f296143a, null, continuation)) {
                throw new IllegalStateException("Continuation is already set");
            }
            if (condition.invoke().booleanValue() || !z1.a(this.f296143a, continuation, null)) {
                return kotlin.coroutines.intrinsics.b.l();
            }
            return null;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0, 0, 1, 1, 2, 2}, l = {70, com.planner5d.library.engine.input.f.b.C0, 90}, m = "process", n = {"mb", "selector", "mb", "selector", "mb", "selector"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f296146c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f296148e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296146c = obj;
            this.f296148e |= Integer.MIN_VALUE;
            return a.this.r0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0}, l = {168}, m = "receiveOrNullSuspend", n = {"$this$receiveOrNullSuspend"}, s = {"L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f296150b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f296152d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296150b = obj;
            this.f296152d |= Integer.MIN_VALUE;
            return a.this.y0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.network.selector.ActorSelectorManager", f = "ActorSelectorManager.kt", i = {0}, l = {210}, m = "select", n = {"selector"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f296154b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f296156d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296154b = obj;
            this.f296156d |= Integer.MIN_VALUE;
            return a.this.B0(null, this);
        }
    }

    public a(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f296134d = new AtomicLong();
        this.f296135e = new b<>();
        this.f296136f = new io.ktor.network.selector.d<>();
        this.f296137g = context.plus(new r0("selector"));
        kotlinx.coroutines.k.f(this, null, null, new C2078a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object B0(Selector selector, kotlin.coroutines.d<? super Integer> dVar) throws IOException {
        e eVar;
        int iSelectNow;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f296156d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f296156d = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f296154b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f296156d;
        if (i11 == 0) {
            ResultKt.m(obj);
            this.inSelect = true;
            eVar.f296153a = selector;
            eVar.f296156d = 1;
            if (h4.a(eVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            selector = (Selector) eVar.f296153a;
            ResultKt.m(obj);
        }
        if (this.f296134d.get() == 0) {
            iSelectNow = selector.select(500L);
            this.inSelect = false;
        } else {
            this.inSelect = false;
            this.f296134d.set(0L);
            iSelectNow = selector.selectNow();
        }
        return kotlin.coroutines.jvm.internal.b.f(iSelectNow);
    }

    private final void H0() {
        Selector selector;
        if (this.f296134d.incrementAndGet() == 1 && this.inSelect && (selector = this.selectorRef) != null) {
            selector.wakeup();
        }
    }

    private final Object k0(kotlin.coroutines.d<? super Unit> dVar) {
        h0.e(0);
        h4.a(dVar);
        h0.e(1);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009d -> B:20:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b9 -> B:20:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ca -> B:20:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0108 -> B:46:0x010c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object r0(io.ktor.network.selector.d<io.ktor.network.selector.h> r11, java.nio.channels.Selector r12, kotlin.coroutines.d<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.selector.a.r0(io.ktor.network.selector.d, java.nio.channels.Selector, kotlin.coroutines.d):java.lang.Object");
    }

    private final void w0(io.ktor.network.selector.d<h> dVar, Selector selector) {
        while (true) {
            h hVarD = dVar.d();
            if (hVarD == null) {
                return;
            } else {
                c(selector, hVarD);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x0(io.ktor.network.selector.d<h> dVar, kotlin.coroutines.d<? super h> dVar2) {
        h hVarD = dVar.d();
        return hVarD == null ? y0(dVar, dVar2) : hVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object y0(io.ktor.network.selector.d<h> dVar, kotlin.coroutines.d<? super h> dVar2) {
        d dVar3;
        Object objL;
        if (dVar2 instanceof d) {
            dVar3 = (d) dVar2;
            int i10 = dVar3.f296152d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar3.f296152d = i10 - Integer.MIN_VALUE;
            } else {
                dVar3 = new d(dVar2);
            }
        } else {
            dVar3 = new d(dVar2);
        }
        Object obj = dVar3.f296150b;
        Object objL2 = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar3.f296152d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (io.ktor.network.selector.d) dVar3.f296149a;
        }
        ResultKt.m(obj);
        do {
            h hVarD = dVar.d();
            if (hVarD != null) {
                return hVarD;
            }
            objL = null;
            if (this.closed) {
                return null;
            }
            dVar3.f296149a = dVar;
            dVar3.f296152d = 1;
            b<Unit, kotlin.coroutines.d<Unit>> bVar = this.f296135e;
            if (dVar.c() && !this.closed) {
                if (!z1.a(((b) bVar).f296143a, null, dVar3)) {
                    throw new IllegalStateException("Continuation is already set");
                }
                if ((dVar.c() && !this.closed) || !z1.a(((b) bVar).f296143a, dVar3, null)) {
                    objL = kotlin.coroutines.intrinsics.b.l();
                }
            }
            if (objL == null) {
                objL = Unit.f312394a;
            }
            if (objL == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar3);
            }
        } while (objL != objL2);
        return objL2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
        this.f296136f.b();
        if (!this.f296135e.b(Unit.f312394a)) {
            H0();
        }
    }

    @Override // io.ktor.network.selector.j
    public void g3(@NotNull h selectable) {
        SelectionKey selectionKeyKeyFor;
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        e(selectable, new ClosedChannelException());
        Selector selector = this.selectorRef;
        if (selector == null || (selectionKeyKeyFor = selectable.s().keyFor(selector)) == null) {
            return;
        }
        selectionKeyKeyFor.cancel();
        H0();
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f296137g;
    }

    @Override // io.ktor.network.selector.l
    protected void t(@NotNull h selectable) {
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        try {
            if (this.f296136f.a(selectable)) {
                this.f296135e.b(Unit.f312394a);
                H0();
            } else {
                if (!selectable.s().isOpen()) {
                    throw new ClosedChannelException();
                }
                throw new ClosedSelectorException();
            }
        } catch (Throwable th2) {
            e(selectable, th2);
        }
    }
}
