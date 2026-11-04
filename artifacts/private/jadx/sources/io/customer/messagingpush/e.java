package io.customer.messagingpush;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.c0;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements hh.a<c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f288429d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f288430e = "MessagingPushFCM";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f288431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.customer.messagingpush.util.g f288432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.customer.sdk.lifecycle.a f288433c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.customer.messagingpush.ModuleMessagingPushFCM$subscribeToLifecycleEvents$1", f = "ModuleMessagingPushFCM.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nModuleMessagingPushFCM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleMessagingPushFCM.kt\nio/customer/messagingpush/ModuleMessagingPushFCM$subscribeToLifecycleEvents$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,70:1\n17#2:71\n19#2:75\n46#3:72\n51#3:74\n105#4:73\n*S KotlinDebug\n*F\n+ 1 ModuleMessagingPushFCM.kt\nio/customer/messagingpush/ModuleMessagingPushFCM$subscribeToLifecycleEvents$1\n*L\n33#1:71\n33#1:75\n33#1:72\n33#1:74\n33#1:73\n*E\n"})
    static final class b extends o implements n<s0, o0<? extends io.customer.sdk.lifecycle.b>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f288434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f288435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f288436c;

        static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ s0 f288438a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f288439b;

            /* JADX INFO: renamed from: io.customer.messagingpush.e$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1956a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f288440a;

                static {
                    int[] iArr = new int[c0.a.values().length];
                    try {
                        iArr[c0.a.ON_CREATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f288440a = iArr;
                }
            }

            a(s0 s0Var, e eVar) {
                this.f288438a = s0Var;
                this.f288439b = eVar;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(io.customer.sdk.lifecycle.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
                Object objM785constructorimpl;
                Intent intent;
                Bundle extras;
                if (C1956a.f288440a[bVar.h().ordinal()] == 1) {
                    e eVar = this.f288439b;
                    try {
                        Result.a aVar = Result.Companion;
                        Activity activity = bVar.f().get();
                        if (activity != null && (intent = activity.getIntent()) != null && (extras = intent.getExtras()) != null) {
                            if (eVar.getModuleConfig().a()) {
                                eVar.f288432b.a(extras);
                            }
                            objM785constructorimpl = Result.m785constructorimpl(Unit.f312394a);
                            Result.a(objM785constructorimpl);
                        }
                        return Unit.f312394a;
                    } catch (Throwable th2) {
                        Result.a aVar2 = Result.Companion;
                        objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
                    }
                }
                return Unit.f312394a;
            }
        }

        /* JADX INFO: renamed from: io.customer.messagingpush.e$b$b, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
        public static final class C1957b implements kotlinx.coroutines.flow.i<io.customer.sdk.lifecycle.b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i f288441a;

            /* JADX INFO: renamed from: io.customer.messagingpush.e$b$b$a */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ModuleMessagingPushFCM.kt\nio/customer/messagingpush/ModuleMessagingPushFCM$subscribeToLifecycleEvents$1\n*L\n1#1,49:1\n18#2:50\n19#2:52\n34#3:51\n*E\n"})
            public static final class a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ j f288442a;

                /* JADX INFO: renamed from: io.customer.messagingpush.e$b$b$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "io.customer.messagingpush.ModuleMessagingPushFCM$subscribeToLifecycleEvents$1$invokeSuspend$$inlined$filter$1$2", f = "ModuleMessagingPushFCM.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class C1958a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f288443a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f288444b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    Object f288445c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f288446d;

                    public C1958a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f288443a = obj;
                        this.f288444b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(j jVar) {
                    this.f288442a = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.j
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    C1958a c1958a;
                    if (dVar instanceof C1958a) {
                        c1958a = (C1958a) dVar;
                        int i10 = c1958a.f288444b;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c1958a.f288444b = i10 - Integer.MIN_VALUE;
                        } else {
                            c1958a = new C1958a(dVar);
                        }
                    } else {
                        c1958a = new C1958a(dVar);
                    }
                    Object obj2 = c1958a.f288443a;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i11 = c1958a.f288444b;
                    if (i11 == 0) {
                        ResultKt.m(obj2);
                        j jVar = this.f288442a;
                        if (((io.customer.sdk.lifecycle.b) obj).h() == c0.a.ON_CREATE) {
                            c1958a.f288444b = 1;
                            if (jVar.emit(obj, c1958a) == objL) {
                                return objL;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj2);
                    }
                    return Unit.f312394a;
                }
            }

            public C1957b(kotlinx.coroutines.flow.i iVar) {
                this.f288441a = iVar;
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super io.customer.sdk.lifecycle.b> jVar, kotlin.coroutines.d dVar) {
                Object objCollect = this.f288441a.collect(new a(jVar), dVar);
                return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, o0<? extends io.customer.sdk.lifecycle.b> o0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return invoke2(s0Var, (o0<io.customer.sdk.lifecycle.b>) o0Var, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f288434a;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var = (s0) this.f288435b;
                C1957b c1957b = new C1957b((o0) this.f288436c);
                a aVar = new a(s0Var, e.this);
                this.f288435b = null;
                this.f288434a = 1;
                if (c1957b.collect(aVar, this) == objL) {
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

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, o0<io.customer.sdk.lifecycle.b> o0Var, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = e.this.new b(dVar);
            bVar.f288435b = s0Var;
            bVar.f288436c = o0Var;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void c() {
        e().a(new Function1() { // from class: io.customer.messagingpush.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.d((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(String str) {
        if (str != null) {
            eh.d.f274883c.v().d(new io.customer.sdk.communication.a.c(str));
        }
        return Unit.f312394a;
    }

    private final ch.a e() {
        return zg.c.f(eh.d.f274883c.q());
    }

    private final void g() {
        this.f288433c.e(new b(null));
    }

    @Override // hh.a
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c getModuleConfig() {
        return this.f288431a;
    }

    @Override // hh.a
    @NotNull
    public String getModuleName() {
        return f288430e;
    }

    @Override // hh.a
    public void initialize() {
        c();
        g();
    }

    @oj.j
    public e(@NotNull c moduleConfig) {
        Intrinsics.checkNotNullParameter(moduleConfig, "moduleConfig");
        this.f288431a = moduleConfig;
        eh.d dVar = eh.d.f274883c;
        this.f288432b = zg.c.l(dVar);
        this.f288433c = dVar.r();
    }

    public /* synthetic */ e(c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? c.f288416d.a() : cVar);
    }
}
