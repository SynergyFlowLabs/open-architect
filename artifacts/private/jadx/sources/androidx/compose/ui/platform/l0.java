package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n*L\n1#1,193:1\n32#2:194\n32#2:195\n32#2:196\n32#2:197\n32#2:198\n32#2:199\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n*L\n73#1:194\n87#1:195\n98#1:196\n114#1:197\n124#1:198\n134#1:199\n*E\n"})
public final class l0 extends kotlinx.coroutines.n0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final c f40623l = new c(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f40624m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final kotlin.f0<CoroutineContext> f40625n = kotlin.g0.c(a.f40637a);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final ThreadLocal<CoroutineContext> f40626o = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Choreographer f40627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f40628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f40629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<Runnable> f40630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private List<Choreographer.FrameCallback> f40631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private List<Choreographer.FrameCallback> f40632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f40633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f40634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final d f40635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.c3 f40636k;

    static final class a extends kotlin.jvm.internal.l0 implements Function0<CoroutineContext> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40637a = new a();

        /* JADX INFO: renamed from: androidx.compose.ui.platform.l0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C0327a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Choreographer>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f40638a;

            C0327a(kotlin.coroutines.d<? super C0327a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0327a(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f40638a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return Choreographer.getInstance();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Choreographer> dVar) {
                return ((C0327a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext invoke() {
            l0 l0Var = new l0(m0.b() ? Choreographer.getInstance() : (Choreographer) kotlinx.coroutines.i.f(kotlinx.coroutines.l1.e(), new C0327a(null)), androidx.core.os.k.a(Looper.getMainLooper()), null);
            return l0Var.plus(l0Var.p1());
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$Companion$currentThread$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"})
    public static final class b extends ThreadLocal<CoroutineContext> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            l0 l0Var = new l0(choreographer, androidx.core.os.k.a(looperMyLooper), null);
            return l0Var.plus(l0Var.p1());
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CoroutineContext a() {
            if (m0.b()) {
                return b();
            }
            CoroutineContext coroutineContext = (CoroutineContext) l0.f40626o.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        @NotNull
        public final CoroutineContext b() {
            return (CoroutineContext) l0.f40625n.getValue();
        }

        private c() {
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n*L\n1#1,193:1\n32#2:194\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n*L\n58#1:194\n*E\n"})
    public static final class d implements Choreographer.FrameCallback, Runnable {
        d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            l0.this.f40628c.removeCallbacks(this);
            l0.this.w1();
            l0.this.u1(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            l0.this.w1();
            Object obj = l0.this.f40629d;
            l0 l0Var = l0.this;
            synchronized (obj) {
                try {
                    if (l0Var.f40631f.isEmpty()) {
                        l0Var.j1().removeFrameCallback(this);
                        l0Var.f40634i = false;
                    }
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public /* synthetic */ l0(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    private final Runnable s1() {
        Runnable runnableRemoveFirstOrNull;
        synchronized (this.f40629d) {
            try {
                runnableRemoveFirstOrNull = this.f40630e.removeFirstOrNull();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return runnableRemoveFirstOrNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1(long j10) {
        synchronized (this.f40629d) {
            try {
                if (this.f40634i) {
                    this.f40634i = false;
                    List<Choreographer.FrameCallback> list = this.f40631f;
                    this.f40631f = this.f40632g;
                    this.f40632g = list;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.get(i10).doFrame(j10);
                    }
                    list.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1() {
        boolean z10;
        do {
            Runnable runnableS1 = s1();
            while (runnableS1 != null) {
                runnableS1.run();
                runnableS1 = s1();
            }
            synchronized (this.f40629d) {
                try {
                    if (this.f40630e.isEmpty()) {
                        z10 = false;
                        this.f40633h = false;
                    } else {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (z10);
    }

    public final void E1(@NotNull Choreographer.FrameCallback frameCallback) {
        synchronized (this.f40629d) {
            try {
                this.f40631f.add(frameCallback);
                if (!this.f40634i) {
                    this.f40634i = true;
                    this.f40627b.postFrameCallback(this.f40635j);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void J1(@NotNull Choreographer.FrameCallback frameCallback) {
        synchronized (this.f40629d) {
            try {
                this.f40631f.remove(frameCallback);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlinx.coroutines.n0
    public void h(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        synchronized (this.f40629d) {
            try {
                this.f40630e.addLast(runnable);
                if (!this.f40633h) {
                    this.f40633h = true;
                    this.f40628c.post(this.f40635j);
                    if (!this.f40634i) {
                        this.f40634i = true;
                        this.f40627b.postFrameCallback(this.f40635j);
                    }
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final Choreographer j1() {
        return this.f40627b;
    }

    @NotNull
    public final androidx.compose.runtime.c3 p1() {
        return this.f40636k;
    }

    private l0(Choreographer choreographer, Handler handler) {
        this.f40627b = choreographer;
        this.f40628c = handler;
        this.f40629d = new Object();
        this.f40630e = new ArrayDeque<>();
        this.f40631f = new ArrayList();
        this.f40632g = new ArrayList();
        this.f40635j = new d();
        this.f40636k = new n0(choreographer, this);
    }
}
