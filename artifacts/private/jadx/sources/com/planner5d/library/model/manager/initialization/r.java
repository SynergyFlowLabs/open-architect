package com.planner5d.library.model.manager.initialization;

import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.devtodev.analytics.internal.storage.sqlite.TutorialMarkEntry;
import com.planner5d.library.model.manager.a1;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.v1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nInitializationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializationManager.kt\ncom/planner5d/library/model/manager/initialization/InitializationManager\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,177:1\n116#2,11:178\n116#2,11:189\n116#2,11:200\n*S KotlinDebug\n*F\n+ 1 InitializationManager.kt\ncom/planner5d/library/model/manager/initialization/InitializationManager\n*L\n99#1:178,11\n102#1:189,11\n121#1:200,11\n*E\n"})
public final class r implements a1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f191639n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x f191640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b0 f191641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v f191642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final z.a f191643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t f191644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final fg.e<a> f191645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final fg.e<t1> f191646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f191647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f191648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final v1.a<Boolean> f191649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f191650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Map<c, Object> f191651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f191652m;

    public interface a {
        @Nullable
        Object a(@NotNull com.planner5d.library.legal.model.manager.a.EnumC1566a enumC1566a, @NotNull kotlin.coroutines.d<? super Boolean> dVar);
    }

    public interface b {
        @Nullable
        Object B(@NotNull Function0<Boolean> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar);

        @Nullable
        Object M(@NotNull kotlin.coroutines.d<? super Unit> dVar);

        @Nullable
        Object S(@NotNull com.planner5d.library.legal.model.manager.a.EnumC1566a enumC1566a, @NotNull Function0<Boolean> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar);

        void e(@NotNull Exception exc);

        @Nullable
        Object g(@NotNull Function0<Boolean> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar);

        void k();

        @Nullable
        Object q(@NotNull Function0<Boolean> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar);

        @Nullable
        Object r(@NotNull kotlin.coroutines.d<? super Unit> dVar);

        @Nullable
        Object w(@NotNull Function0<Boolean> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar);
    }

    private enum c {
        RequestNotificationPermission,
        InitializeWithoutUser,
        RequireAgreement,
        InitializeEarlyStatistics,
        SignIn,
        InitializeWithUser,
        TriggerInAppReview,
        StartSpaceOnboarding,
        StartOnboarding,
        RequireAgreementEverything,
        Initialized3DEngine,
        WaitOnboardingFinish;


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f191666n = kotlin.enums.c.c(k());

        static {
            int i10 = 6 ^ 6;
        }

        @NotNull
        public static kotlin.enums.a<c> l() {
            return f191666n;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.initialization.InitializationManager$execute$2", f = "InitializationManager.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<Function0<? extends Boolean>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191667a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x.b f191669c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(x.b bVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f191669c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r.this.new d(this.f191669c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191667a;
            if (i10 == 0) {
                ResultKt.m(obj);
                x xVar = r.this.f191640a;
                x.b bVar = this.f191669c;
                this.f191667a = 1;
                if (xVar.d(bVar, this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Function0<Boolean> function0, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(function0, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.initialization.InitializationManager", f = "InitializationManager.kt", i = {0, 0}, l = {171}, m = "execute", n = {"this", TutorialMarkEntry.step}, s = {"L$0", "L$1"})
    static final class e<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f191672c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191674e;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191672c = obj;
            this.f191674e |= Integer.MIN_VALUE;
            return r.this.i(null, null, this);
        }
    }

    /* synthetic */ class f extends g0 implements Function0<Boolean> {
        f(Object obj) {
            super(0, obj, x.class, "isAborted", "isAborted()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((x) this.receiver).e());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.initialization.InitializationManager", f = "InitializationManager.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12}, l = {183, 123, 124, 125, 130, 131, 132, 133, 136, androidx.media2.widget.f.i.f59767c0, 138, androidx.media2.widget.f.i.f59775g0, androidx.media2.widget.f.i.f59777h0}, m = "initialize", n = {"this", "presenter", "$this$withLock_u24default$iv", "this", "presenter", "$this$withLock_u24default$iv", "this", "presenter", "$this$withLock_u24default$iv", "this", "presenter", "$this$withLock_u24default$iv", "this", "presenter", "$this$withLock_u24default$iv", "this", "presenter", "$this$withLock_u24default$iv", "this", "presenter", "$this$withLock_u24default$iv", "this", "presenter", "$this$withLock_u24default$iv", "this", "presenter", "$this$withLock_u24default$iv", "this", "presenter", "$this$withLock_u24default$iv", "this", "presenter", "$this$withLock_u24default$iv", "this", "presenter", "$this$withLock_u24default$iv", "this", "presenter", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f191677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191678d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191680f;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191678d = obj;
            this.f191680f |= Integer.MIN_VALUE;
            return r.this.l(null, this);
        }
    }

    /* synthetic */ class h implements x.b, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f191681a;

        h(b bVar) {
            this.f191681a = bVar;
        }

        @Override // com.planner5d.library.model.manager.initialization.x.b
        public final Object a(kotlin.coroutines.d<? super Unit> dVar) {
            Object objR = this.f191681a.r(dVar);
            return objR == kotlin.coroutines.intrinsics.b.l() ? objR : Unit.f312394a;
        }

        @Override // kotlin.jvm.internal.c0
        public final kotlin.x<?> b() {
            int i10 = 5 << 1;
            return new g0(1, this.f191681a, b.class, "requestNotificationPermission", "requestNotificationPermission(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof x.b) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.initialization.InitializationManager$initialize$2$2", f = "InitializationManager.kt", i = {}, l = {okhttp3.internal.ws.g.f334652s}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<Function0<? extends Boolean>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f191683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f191684c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(b bVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f191684c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            i iVar = new i(this.f191684c, dVar);
            iVar.f191683b = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191682a;
            int i11 = 3 & 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function0<Boolean> function0 = (Function0) this.f191683b;
                b bVar = this.f191684c;
                com.planner5d.library.legal.model.manager.a.EnumC1566a enumC1566a = com.planner5d.library.legal.model.manager.a.EnumC1566a.CurrentRevision;
                this.f191682a = 1;
                if (bVar.S(enumC1566a, function0, this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Function0<Boolean> function0, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(function0, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* synthetic */ class j extends g0 implements Function2<Function0<? extends Boolean>, kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        j(Object obj) {
            super(2, obj, b.class, "signIn", "signIn(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Function0<Boolean> function0, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) this.receiver).w(function0, dVar);
        }
    }

    static final class k implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f191685a;

        k(b bVar) {
            this.f191685a = bVar;
        }

        @Override // com.planner5d.library.model.manager.initialization.x.b
        public final Object a(kotlin.coroutines.d<? super Unit> dVar) {
            Object objM = this.f191685a.M(dVar);
            return objM == kotlin.coroutines.intrinsics.b.l() ? objM : Unit.f312394a;
        }
    }

    /* synthetic */ class l extends g0 implements Function2<Function0<? extends Boolean>, kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        l(Object obj) {
            super(2, obj, b.class, "startSpaceOnboarding", "startSpaceOnboarding(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Function0<Boolean> function0, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) this.receiver).q(function0, dVar);
        }
    }

    /* synthetic */ class m extends g0 implements Function2<Function0<? extends Boolean>, kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Object obj) {
            super(2, obj, b.class, "startOnboarding", "startOnboarding(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            int i10 = 4 >> 2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Function0<Boolean> function0, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) this.receiver).g(function0, dVar);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.initialization.InitializationManager$initialize$2$7", f = "InitializationManager.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<Function0<? extends Boolean>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f191686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f191687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f191688c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(b bVar, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f191688c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            n nVar = new n(this.f191688c, dVar);
            nVar.f191687b = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191686a;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function0<Boolean> function0 = (Function0) this.f191687b;
                b bVar = this.f191688c;
                com.planner5d.library.legal.model.manager.a.EnumC1566a enumC1566a = com.planner5d.library.legal.model.manager.a.EnumC1566a.Everything;
                this.f191686a = 1;
                if (bVar.S(enumC1566a, function0, this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Function0<Boolean> function0, kotlin.coroutines.d<? super Unit> dVar) {
            return ((n) create(function0, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* synthetic */ class o extends g0 implements Function2<Function0<? extends Boolean>, kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Object obj) {
            super(2, obj, b.class, "waitOnboardingFinish", "waitOnboardingFinish(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            int i10 = (1 & 0) >> 2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Function0<Boolean> function0, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) this.receiver).B(function0, dVar);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.initialization.InitializationManager", f = "InitializationManager.kt", i = {0, 0, 1, 1, 2, 2, 3}, l = {183, com.planner5d.library.engine.input.f.b.f160733u1, 105, com.planner5d.library.engine.input.f.b.f160742x1}, m = "initializeForNotification", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f191691c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191693e;

        p(kotlin.coroutines.d<? super p> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191691c = obj;
            this.f191693e |= Integer.MIN_VALUE;
            return r.this.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.initialization.InitializationManager", f = "InitializationManager.kt", i = {0, 0}, l = {183}, m = "isInitializedSynchronized", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f191696c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191698e;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f191696c = obj;
            this.f191698e |= Integer.MIN_VALUE;
            return r.this.m(this);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.initialization.r$r, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.initialization.InitializationManager$resetInitialisation$1", f = "InitializationManager.kt", i = {0, 1}, l = {183, com.planner5d.library.engine.input.f.b.f160703k1}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nInitializationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializationManager.kt\ncom/planner5d/library/model/manager/initialization/InitializationManager$resetInitialisation$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,177:1\n116#2,11:178\n*S KotlinDebug\n*F\n+ 1 InitializationManager.kt\ncom/planner5d/library/model/manager/initialization/InitializationManager$resetInitialisation$1\n*L\n92#1:178,11\n*E\n"})
    static final class C1595r extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f191699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f191700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f191701c;

        C1595r(kotlin.coroutines.d<? super C1595r> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r.this.new C1595r(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.a aVar;
            r rVar;
            Throwable th2;
            kotlinx.coroutines.sync.a aVar2;
            r rVar2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f191701c;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    r.this.f191640a.a();
                    aVar = r.this.f191652m;
                    rVar = r.this;
                    this.f191699a = aVar;
                    this.f191700b = rVar;
                    this.f191701c = 1;
                    if (aVar.h(null, this) != objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar2 = (r) this.f191700b;
                    aVar2 = (kotlinx.coroutines.sync.a) this.f191699a;
                    try {
                        ResultKt.m(obj);
                        rVar2.f191651l.clear();
                        Unit unit = Unit.f312394a;
                        aVar2.i(null);
                        return unit;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.i(null);
                        throw th2;
                    }
                }
                rVar = (r) this.f191700b;
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.f191699a;
                ResultKt.m(obj);
                aVar = aVar3;
                rVar.p(false);
                x xVar = rVar.f191640a;
                this.f191699a = aVar;
                this.f191700b = rVar;
                this.f191701c = 2;
                if (xVar.f(this) != objL) {
                    aVar2 = aVar;
                    rVar2 = rVar;
                    rVar2.f191651l.clear();
                    Unit unit2 = Unit.f312394a;
                    aVar2.i(null);
                    return unit2;
                }
                return objL;
            } catch (Throwable th4) {
                kotlinx.coroutines.sync.a aVar4 = aVar;
                th2 = th4;
                aVar2 = aVar4;
                aVar2.i(null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1595r) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public r(@NotNull x initializationHandler, @NotNull b0 initializationWithoutUser, @NotNull v initializationWorkEarlyStatistics, @NotNull z.a initializationWithUserFactory, @NotNull t initialization3DEngine, @NotNull fg.e<a> agreementChecker, @NotNull fg.e<t1> logRecordManager) {
        Intrinsics.checkNotNullParameter(initializationHandler, "initializationHandler");
        Intrinsics.checkNotNullParameter(initializationWithoutUser, "initializationWithoutUser");
        Intrinsics.checkNotNullParameter(initializationWorkEarlyStatistics, "initializationWorkEarlyStatistics");
        Intrinsics.checkNotNullParameter(initializationWithUserFactory, "initializationWithUserFactory");
        Intrinsics.checkNotNullParameter(initialization3DEngine, "initialization3DEngine");
        Intrinsics.checkNotNullParameter(agreementChecker, "agreementChecker");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f191640a = initializationHandler;
        this.f191641b = initializationWithoutUser;
        this.f191642c = initializationWorkEarlyStatistics;
        this.f191643d = initializationWithUserFactory;
        this.f191644e = initialization3DEngine;
        this.f191645f = agreementChecker;
        this.f191646g = logRecordManager;
        this.f191647h = new AtomicBoolean(true);
        this.f191648i = new AtomicBoolean(false);
        this.f191649j = v1.f229769a.j(Boolean.FALSE);
        this.f191650k = new AtomicBoolean(false);
        this.f191651l = new LinkedHashMap();
        this.f191652m = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(c cVar, x.b bVar, kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        Object objI = i(cVar, new d(bVar, null), dVar);
        return objI == kotlin.coroutines.intrinsics.b.l() ? objI : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final <T> Object i(c cVar, Function2<? super Function0<Boolean>, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super T> dVar) throws x.a {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f191674e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f191674e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objInvoke = eVar.f191672c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f191674e;
        if (i11 == 0) {
            ResultKt.m(objInvoke);
            if (this.f191651l.containsKey(cVar)) {
                return this.f191651l.get(cVar);
            }
            this.f191640a.g();
            f fVar = new f(this.f191640a);
            eVar.f191670a = this;
            eVar.f191671b = cVar;
            eVar.f191674e = 1;
            objInvoke = function2.invoke(fVar, eVar);
            if (objInvoke == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (c) eVar.f191671b;
            this = (r) eVar.f191670a;
            ResultKt.m(objInvoke);
        }
        Map<c, Object> map = this.f191651l;
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Any");
        map.put(cVar, objInvoke);
        this.f191640a.g();
        return objInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(boolean z10) {
        if (this.f191648i.get() == z10) {
            return;
        }
        if (z10) {
            this.f191650k.set(false);
        }
        this.f191648i.set(z10);
        this.f191649j.o(Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c3 A[Catch: all -> 0x0041, a -> 0x0044, TRY_ENTER, TryCatch #1 {all -> 0x0041, blocks: (B:16:0x003c, B:25:0x005c, B:45:0x00d7, B:42:0x00c3), top: B:57:0x002d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7 A[Catch: all -> 0x0041, a -> 0x0044, PHI: r2 r10
      0x00d7: PHI (r2v9 ??) = (r2v16 ??), (r2v17 ??) binds: [B:43:0x00d4, B:26:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r10v11 kotlinx.coroutines.sync.a) = (r10v27 kotlinx.coroutines.sync.a), (r10v28 kotlinx.coroutines.sync.a) binds: [B:43:0x00d4, B:26:0x0060] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0041, blocks: (B:16:0x003c, B:25:0x005c, B:45:0x00d7, B:42:0x00c3), top: B:57:0x002d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        if (r2.h(r11, r4, r0) == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.planner5d.library.model.manager.initialization.r] */
    @Override // com.planner5d.library.model.manager.a1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.model.manager.initialization.r.a(kotlin.coroutines.d):java.lang.Object");
    }

    @NotNull
    public final v1.a<Boolean> j() {
        return this.f191649j;
    }

    public final boolean k() {
        return this.f191648i.get();
    }

    /* JADX WARN: Code duplicated, block: B:61:0x016d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0170  */
    /* JADX WARN: Code duplicated, block: B:65:0x0187  */
    /* JADX WARN: Code duplicated, block: B:66:0x0189 A[Catch: a -> 0x004d, all -> 0x0061, PHI: r2 r9 r10
      0x0189: PHI (r2v11 ??) = (r2v59 ??), (r2v60 ??) binds: [B:64:0x0185, B:49:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0189: PHI (r9v18 kotlinx.coroutines.sync.a) = (r9v78 kotlinx.coroutines.sync.a), (r9v79 kotlinx.coroutines.sync.a) binds: [B:64:0x0185, B:49:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0189: PHI (r10v14 com.planner5d.library.model.manager.initialization.r$b) = 
      (r10v11 com.planner5d.library.model.manager.initialization.r$b)
      (r10v16 com.planner5d.library.model.manager.initialization.r$b)
     binds: [B:64:0x0185, B:49:0x010f] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0061, blocks: (B:20:0x005c, B:93:0x0279, B:25:0x0075, B:90:0x0261, B:28:0x0089, B:87:0x0247, B:31:0x009b, B:84:0x022c, B:34:0x00af, B:81:0x0210, B:37:0x00c3, B:78:0x01f2, B:40:0x00d7, B:75:0x01d5, B:43:0x00ea, B:72:0x01bc, B:46:0x00fb, B:69:0x01a1, B:49:0x010f, B:66:0x0189, B:52:0x0120, B:63:0x0172), top: B:113:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x019f  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a1 A[Catch: a -> 0x004d, all -> 0x0061, PHI: r2 r9 r10
      0x01a1: PHI (r2v14 ??) = (r2v57 ??), (r2v58 ??) binds: [B:67:0x019d, B:47:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r9v21 kotlinx.coroutines.sync.a) = (r9v76 kotlinx.coroutines.sync.a), (r9v77 kotlinx.coroutines.sync.a) binds: [B:67:0x019d, B:47:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r10v17 com.planner5d.library.model.manager.initialization.r$b) = 
      (r10v14 com.planner5d.library.model.manager.initialization.r$b)
      (r10v19 com.planner5d.library.model.manager.initialization.r$b)
     binds: [B:67:0x019d, B:47:0x00ff] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0061, blocks: (B:20:0x005c, B:93:0x0279, B:25:0x0075, B:90:0x0261, B:28:0x0089, B:87:0x0247, B:31:0x009b, B:84:0x022c, B:34:0x00af, B:81:0x0210, B:37:0x00c3, B:78:0x01f2, B:40:0x00d7, B:75:0x01d5, B:43:0x00ea, B:72:0x01bc, B:46:0x00fb, B:69:0x01a1, B:49:0x010f, B:66:0x0189, B:52:0x0120, B:63:0x0172), top: B:113:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bc A[Catch: a -> 0x004d, all -> 0x0061, PHI: r2 r9 r10
      0x01bc: PHI (r2v17 ??) = (r2v55 ??), (r2v56 ??) binds: [B:70:0x01b8, B:43:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r9v24 kotlinx.coroutines.sync.a) = (r9v74 kotlinx.coroutines.sync.a), (r9v75 kotlinx.coroutines.sync.a) binds: [B:70:0x01b8, B:43:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r10v20 com.planner5d.library.model.manager.initialization.r$b) = 
      (r10v17 com.planner5d.library.model.manager.initialization.r$b)
      (r10v22 com.planner5d.library.model.manager.initialization.r$b)
     binds: [B:70:0x01b8, B:43:0x00ea] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0061, blocks: (B:20:0x005c, B:93:0x0279, B:25:0x0075, B:90:0x0261, B:28:0x0089, B:87:0x0247, B:31:0x009b, B:84:0x022c, B:34:0x00af, B:81:0x0210, B:37:0x00c3, B:78:0x01f2, B:40:0x00d7, B:75:0x01d5, B:43:0x00ea, B:72:0x01bc, B:46:0x00fb, B:69:0x01a1, B:49:0x010f, B:66:0x0189, B:52:0x0120, B:63:0x0172), top: B:113:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d5 A[Catch: a -> 0x004d, all -> 0x0061, PHI: r2 r9 r10
      0x01d5: PHI (r2v20 ??) = (r2v53 ??), (r2v54 ??) binds: [B:73:0x01d1, B:40:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r9v27 kotlinx.coroutines.sync.a) = (r9v72 kotlinx.coroutines.sync.a), (r9v73 kotlinx.coroutines.sync.a) binds: [B:73:0x01d1, B:40:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r10v23 com.planner5d.library.model.manager.initialization.r$b) = 
      (r10v20 com.planner5d.library.model.manager.initialization.r$b)
      (r10v25 com.planner5d.library.model.manager.initialization.r$b)
     binds: [B:73:0x01d1, B:40:0x00d7] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0061, blocks: (B:20:0x005c, B:93:0x0279, B:25:0x0075, B:90:0x0261, B:28:0x0089, B:87:0x0247, B:31:0x009b, B:84:0x022c, B:34:0x00af, B:81:0x0210, B:37:0x00c3, B:78:0x01f2, B:40:0x00d7, B:75:0x01d5, B:43:0x00ea, B:72:0x01bc, B:46:0x00fb, B:69:0x01a1, B:49:0x010f, B:66:0x0189, B:52:0x0120, B:63:0x0172), top: B:113:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f2 A[Catch: a -> 0x004d, all -> 0x0061, PHI: r2 r9 r10
      0x01f2: PHI (r2v23 ??) = (r2v51 ??), (r2v52 ??) binds: [B:76:0x01ed, B:38:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r9v30 kotlinx.coroutines.sync.a) = (r9v70 kotlinx.coroutines.sync.a), (r9v71 kotlinx.coroutines.sync.a) binds: [B:76:0x01ed, B:38:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r10v26 com.planner5d.library.model.manager.initialization.r$b) = 
      (r10v23 com.planner5d.library.model.manager.initialization.r$b)
      (r10v28 com.planner5d.library.model.manager.initialization.r$b)
     binds: [B:76:0x01ed, B:38:0x00c7] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0061, blocks: (B:20:0x005c, B:93:0x0279, B:25:0x0075, B:90:0x0261, B:28:0x0089, B:87:0x0247, B:31:0x009b, B:84:0x022c, B:34:0x00af, B:81:0x0210, B:37:0x00c3, B:78:0x01f2, B:40:0x00d7, B:75:0x01d5, B:43:0x00ea, B:72:0x01bc, B:46:0x00fb, B:69:0x01a1, B:49:0x010f, B:66:0x0189, B:52:0x0120, B:63:0x0172), top: B:113:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:80:0x020e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0210 A[Catch: a -> 0x004d, all -> 0x0061, PHI: r2 r9 r10
      0x0210: PHI (r2v26 ??) = (r2v49 ??), (r2v50 ??) binds: [B:79:0x020c, B:34:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r9v33 kotlinx.coroutines.sync.a) = (r9v68 kotlinx.coroutines.sync.a), (r9v69 kotlinx.coroutines.sync.a) binds: [B:79:0x020c, B:34:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x0210: PHI (r10v29 com.planner5d.library.model.manager.initialization.r$b) = 
      (r10v26 com.planner5d.library.model.manager.initialization.r$b)
      (r10v31 com.planner5d.library.model.manager.initialization.r$b)
     binds: [B:79:0x020c, B:34:0x00af] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0061, blocks: (B:20:0x005c, B:93:0x0279, B:25:0x0075, B:90:0x0261, B:28:0x0089, B:87:0x0247, B:31:0x009b, B:84:0x022c, B:34:0x00af, B:81:0x0210, B:37:0x00c3, B:78:0x01f2, B:40:0x00d7, B:75:0x01d5, B:43:0x00ea, B:72:0x01bc, B:46:0x00fb, B:69:0x01a1, B:49:0x010f, B:66:0x0189, B:52:0x0120, B:63:0x0172), top: B:113:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x022b  */
    /* JADX WARN: Code duplicated, block: B:84:0x022c A[Catch: a -> 0x004d, all -> 0x0061, PHI: r2 r9 r10
      0x022c: PHI (r2v29 ??) = (r2v47 ??), (r2v48 ??) binds: [B:82:0x0229, B:31:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r9v36 kotlinx.coroutines.sync.a) = (r9v66 kotlinx.coroutines.sync.a), (r9v67 kotlinx.coroutines.sync.a) binds: [B:82:0x0229, B:31:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r10v32 com.planner5d.library.model.manager.initialization.r$b) = 
      (r10v29 com.planner5d.library.model.manager.initialization.r$b)
      (r10v34 com.planner5d.library.model.manager.initialization.r$b)
     binds: [B:82:0x0229, B:31:0x009b] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0061, blocks: (B:20:0x005c, B:93:0x0279, B:25:0x0075, B:90:0x0261, B:28:0x0089, B:87:0x0247, B:31:0x009b, B:84:0x022c, B:34:0x00af, B:81:0x0210, B:37:0x00c3, B:78:0x01f2, B:40:0x00d7, B:75:0x01d5, B:43:0x00ea, B:72:0x01bc, B:46:0x00fb, B:69:0x01a1, B:49:0x010f, B:66:0x0189, B:52:0x0120, B:63:0x0172), top: B:113:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0246  */
    /* JADX WARN: Code duplicated, block: B:87:0x0247 A[Catch: a -> 0x004d, all -> 0x0061, PHI: r2 r9 r10
      0x0247: PHI (r2v32 ??) = (r2v45 ??), (r2v46 ??) binds: [B:85:0x0244, B:28:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r9v39 kotlinx.coroutines.sync.a) = (r9v64 kotlinx.coroutines.sync.a), (r9v65 kotlinx.coroutines.sync.a) binds: [B:85:0x0244, B:28:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r10v35 com.planner5d.library.model.manager.initialization.r$b) = 
      (r10v32 com.planner5d.library.model.manager.initialization.r$b)
      (r10v37 com.planner5d.library.model.manager.initialization.r$b)
     binds: [B:85:0x0244, B:28:0x0089] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0061, blocks: (B:20:0x005c, B:93:0x0279, B:25:0x0075, B:90:0x0261, B:28:0x0089, B:87:0x0247, B:31:0x009b, B:84:0x022c, B:34:0x00af, B:81:0x0210, B:37:0x00c3, B:78:0x01f2, B:40:0x00d7, B:75:0x01d5, B:43:0x00ea, B:72:0x01bc, B:46:0x00fb, B:69:0x01a1, B:49:0x010f, B:66:0x0189, B:52:0x0120, B:63:0x0172), top: B:113:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0260  */
    /* JADX WARN: Code duplicated, block: B:90:0x0261 A[Catch: a -> 0x004d, all -> 0x0061, PHI: r2 r9 r10
      0x0261: PHI (r2v35 ??) = (r2v43 ??), (r2v44 ??) binds: [B:88:0x025e, B:25:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r9v42 kotlinx.coroutines.sync.a) = (r9v62 kotlinx.coroutines.sync.a), (r9v63 kotlinx.coroutines.sync.a) binds: [B:88:0x025e, B:25:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r10v38 com.planner5d.library.model.manager.initialization.r$b) = 
      (r10v35 com.planner5d.library.model.manager.initialization.r$b)
      (r10v40 com.planner5d.library.model.manager.initialization.r$b)
     binds: [B:88:0x025e, B:25:0x0075] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0061, blocks: (B:20:0x005c, B:93:0x0279, B:25:0x0075, B:90:0x0261, B:28:0x0089, B:87:0x0247, B:31:0x009b, B:84:0x022c, B:34:0x00af, B:81:0x0210, B:37:0x00c3, B:78:0x01f2, B:40:0x00d7, B:75:0x01d5, B:43:0x00ea, B:72:0x01bc, B:46:0x00fb, B:69:0x01a1, B:49:0x010f, B:66:0x0189, B:52:0x0120, B:63:0x0172), top: B:113:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0278  */
    /* JADX WARN: Code duplicated, block: B:93:0x0279 A[Catch: a -> 0x004d, all -> 0x0061, PHI: r2 r9 r10
      0x0279: PHI (r2v38 ??) = (r2v41 ??), (r2v42 ??) binds: [B:91:0x0276, B:20:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r9v45 'this' ??) = (r9v60 'this' ??), (r9v61 'this' ??) binds: [B:91:0x0276, B:20:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r10v41 com.planner5d.library.model.manager.initialization.r$b) = 
      (r10v38 com.planner5d.library.model.manager.initialization.r$b)
      (r10v43 com.planner5d.library.model.manager.initialization.r$b)
     binds: [B:91:0x0276, B:20:0x005c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0061, blocks: (B:20:0x005c, B:93:0x0279, B:25:0x0075, B:90:0x0261, B:28:0x0089, B:87:0x0247, B:31:0x009b, B:84:0x022c, B:34:0x00af, B:81:0x0210, B:37:0x00c3, B:78:0x01f2, B:40:0x00d7, B:75:0x01d5, B:43:0x00ea, B:72:0x01bc, B:46:0x00fb, B:69:0x01a1, B:49:0x010f, B:66:0x0189, B:52:0x0120, B:63:0x0172), top: B:113:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0297  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.planner5d.library.model.manager.initialization.r] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.planner5d.library.model.manager.initialization.r] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.planner5d.library.model.manager.initialization.r] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v51, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v6, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.planner5d.library.model.manager.initialization.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v81 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Nullable
    public final Object l(@NotNull b bVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        g gVar;
        ?? r10;
        ?? r11;
        kotlinx.coroutines.sync.a aVar;
        ?? r12;
        c cVar;
        h hVar;
        ?? r13;
        kotlinx.coroutines.sync.a aVar2;
        Object objH;
        kotlinx.coroutines.sync.a aVar3;
        ?? r14;
        Object objI;
        kotlinx.coroutines.sync.a aVar4;
        ?? r15;
        Object objH2;
        kotlinx.coroutines.sync.a aVar5;
        ?? r16;
        Object objI2;
        kotlinx.coroutines.sync.a aVar6;
        ?? r17;
        Object objH3;
        kotlinx.coroutines.sync.a aVar7;
        ?? r18;
        Object objH4;
        kotlinx.coroutines.sync.a aVar8;
        ?? r19;
        Object objI3;
        kotlinx.coroutines.sync.a aVar9;
        ?? r20;
        Object objI4;
        kotlinx.coroutines.sync.a aVar10;
        ?? r21;
        Object objI5;
        kotlinx.coroutines.sync.a aVar11;
        ?? r22;
        Object objH5;
        c cVar2;
        o oVar;
        ?? r23;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f191680f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f191680f = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f191678d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        ?? r24 = gVar.f191680f;
        try {
            try {
                try {
                    switch (r24) {
                        case 0:
                            ResultKt.m(obj);
                            aVar = this.f191652m;
                            gVar.f191675a = this;
                            gVar.f191676b = bVar;
                            gVar.f191677c = aVar;
                            gVar.f191680f = 1;
                            this = this;
                            if (aVar.h(null, gVar) != objL) {
                                try {
                                    cVar = c.RequestNotificationPermission;
                                    hVar = new h(bVar);
                                    gVar.f191675a = r12;
                                    gVar.f191676b = bVar;
                                    gVar.f191677c = aVar;
                                    gVar.f191680f = 2;
                                    if (r12.h(cVar, hVar, gVar) == objL) {
                                        r13 = r12;
                                        aVar2 = aVar;
                                        c cVar3 = c.InitializeWithoutUser;
                                        b0 b0Var = r13.f191641b;
                                        gVar.f191675a = r13;
                                        gVar.f191676b = bVar;
                                        gVar.f191677c = aVar2;
                                        gVar.f191680f = 3;
                                        objH = r13.h(cVar3, b0Var, gVar);
                                        r14 = r13;
                                        aVar3 = aVar2;
                                        if (objH != objL) {
                                            c cVar4 = c.RequireAgreement;
                                            i iVar = new i(bVar, null);
                                            gVar.f191675a = r14;
                                            gVar.f191676b = bVar;
                                            gVar.f191677c = aVar3;
                                            gVar.f191680f = 4;
                                            objI = r14.i(cVar4, iVar, gVar);
                                            r15 = r14;
                                            aVar4 = aVar3;
                                            if (objI == objL) {
                                                c cVar5 = c.InitializeEarlyStatistics;
                                                v vVar = r15.f191642c;
                                                gVar.f191675a = r15;
                                                gVar.f191676b = bVar;
                                                gVar.f191677c = aVar4;
                                                gVar.f191680f = 5;
                                                objH2 = r15.h(cVar5, vVar, gVar);
                                                r16 = r15;
                                                aVar5 = aVar4;
                                                if (objH2 != objL) {
                                                    c cVar6 = c.SignIn;
                                                    j jVar = new j(bVar);
                                                    gVar.f191675a = r16;
                                                    gVar.f191676b = bVar;
                                                    gVar.f191677c = aVar5;
                                                    gVar.f191680f = 6;
                                                    objI2 = r16.i(cVar6, jVar, gVar);
                                                    r17 = r16;
                                                    aVar6 = aVar5;
                                                    if (objI2 == objL) {
                                                        c cVar7 = c.InitializeWithUser;
                                                        z zVarA = r17.f191643d.a(r17.f191647h);
                                                        gVar.f191675a = r17;
                                                        gVar.f191676b = bVar;
                                                        gVar.f191677c = aVar6;
                                                        gVar.f191680f = 7;
                                                        objH3 = r17.h(cVar7, zVarA, gVar);
                                                        r18 = r17;
                                                        aVar7 = aVar6;
                                                        if (objH3 != objL) {
                                                            c cVar8 = c.TriggerInAppReview;
                                                            k kVar = new k(bVar);
                                                            gVar.f191675a = r18;
                                                            gVar.f191676b = bVar;
                                                            gVar.f191677c = aVar7;
                                                            gVar.f191680f = 8;
                                                            objH4 = r18.h(cVar8, kVar, gVar);
                                                            r19 = r18;
                                                            aVar8 = aVar7;
                                                            if (objH4 == objL) {
                                                                c cVar9 = c.StartSpaceOnboarding;
                                                                l lVar = new l(bVar);
                                                                gVar.f191675a = r19;
                                                                gVar.f191676b = bVar;
                                                                gVar.f191677c = aVar8;
                                                                gVar.f191680f = 9;
                                                                objI3 = r19.i(cVar9, lVar, gVar);
                                                                r20 = r19;
                                                                aVar9 = aVar8;
                                                                if (objI3 != objL) {
                                                                    c cVar10 = c.StartOnboarding;
                                                                    m mVar = new m(bVar);
                                                                    gVar.f191675a = r20;
                                                                    gVar.f191676b = bVar;
                                                                    gVar.f191677c = aVar9;
                                                                    gVar.f191680f = 10;
                                                                    objI4 = r20.i(cVar10, mVar, gVar);
                                                                    r21 = r20;
                                                                    aVar10 = aVar9;
                                                                    if (objI4 == objL) {
                                                                        c cVar11 = c.RequireAgreementEverything;
                                                                        n nVar = new n(bVar, null);
                                                                        gVar.f191675a = r21;
                                                                        gVar.f191676b = bVar;
                                                                        gVar.f191677c = aVar10;
                                                                        gVar.f191680f = 11;
                                                                        objI5 = r21.i(cVar11, nVar, gVar);
                                                                        r22 = r21;
                                                                        aVar11 = aVar10;
                                                                        if (objI5 != objL) {
                                                                            c cVar12 = c.Initialized3DEngine;
                                                                            t tVar = r22.f191644e;
                                                                            gVar.f191675a = r22;
                                                                            gVar.f191676b = bVar;
                                                                            gVar.f191677c = aVar11;
                                                                            gVar.f191680f = 12;
                                                                            objH5 = r22.h(cVar12, tVar, gVar);
                                                                            r24 = r22;
                                                                            this = aVar11;
                                                                            if (objH5 == objL) {
                                                                                cVar2 = c.WaitOnboardingFinish;
                                                                                oVar = new o(bVar);
                                                                                gVar.f191675a = r24;
                                                                                gVar.f191676b = bVar;
                                                                                gVar.f191677c = this;
                                                                                gVar.f191680f = 13;
                                                                                if (r24.i(cVar2, oVar, gVar) != objL) {
                                                                                    r23 = r24;
                                                                                    this = this;
                                                                                    r23.p(true);
                                                                                    bVar.k();
                                                                                    this = this;
                                                                                    Unit unit = Unit.f312394a;
                                                                                    this.i(null);
                                                                                    return unit;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (x.a e10) {
                                    e = e10;
                                    this = aVar;
                                    timber.log.b.f381052a.e(e);
                                    this = this;
                                } catch (Throwable th2) {
                                    r10 = r12;
                                    r11 = aVar;
                                    th = th2;
                                    timber.log.b.f381052a.e(th);
                                    r10.f191646g.get().b("startup", null, th);
                                    bVar.e(new Exception(th));
                                    this = r11;
                                }
                            }
                            return objL;
                        case 1:
                            kotlinx.coroutines.sync.a aVar12 = (kotlinx.coroutines.sync.a) gVar.f191677c;
                            bVar = (b) gVar.f191676b;
                            r rVar = (r) gVar.f191675a;
                            ResultKt.m(obj);
                            aVar = aVar12;
                            r12 = rVar;
                            cVar = c.RequestNotificationPermission;
                            hVar = new h(bVar);
                            gVar.f191675a = r12;
                            gVar.f191676b = bVar;
                            gVar.f191677c = aVar;
                            gVar.f191680f = 2;
                            if (r12.h(cVar, hVar, gVar) == objL) {
                                r13 = r12;
                                aVar2 = aVar;
                                c cVar13 = c.InitializeWithoutUser;
                                b0 b0Var2 = r13.f191641b;
                                gVar.f191675a = r13;
                                gVar.f191676b = bVar;
                                gVar.f191677c = aVar2;
                                gVar.f191680f = 3;
                                objH = r13.h(cVar13, b0Var2, gVar);
                                r14 = r13;
                                aVar3 = aVar2;
                                if (objH != objL) {
                                    c cVar14 = c.RequireAgreement;
                                    i iVar2 = new i(bVar, null);
                                    gVar.f191675a = r14;
                                    gVar.f191676b = bVar;
                                    gVar.f191677c = aVar3;
                                    gVar.f191680f = 4;
                                    objI = r14.i(cVar14, iVar2, gVar);
                                    r15 = r14;
                                    aVar4 = aVar3;
                                    if (objI == objL) {
                                        c cVar15 = c.InitializeEarlyStatistics;
                                        v vVar2 = r15.f191642c;
                                        gVar.f191675a = r15;
                                        gVar.f191676b = bVar;
                                        gVar.f191677c = aVar4;
                                        gVar.f191680f = 5;
                                        objH2 = r15.h(cVar15, vVar2, gVar);
                                        r16 = r15;
                                        aVar5 = aVar4;
                                        if (objH2 != objL) {
                                            c cVar16 = c.SignIn;
                                            j jVar2 = new j(bVar);
                                            gVar.f191675a = r16;
                                            gVar.f191676b = bVar;
                                            gVar.f191677c = aVar5;
                                            gVar.f191680f = 6;
                                            objI2 = r16.i(cVar16, jVar2, gVar);
                                            r17 = r16;
                                            aVar6 = aVar5;
                                            if (objI2 == objL) {
                                                c cVar17 = c.InitializeWithUser;
                                                z zVarA2 = r17.f191643d.a(r17.f191647h);
                                                gVar.f191675a = r17;
                                                gVar.f191676b = bVar;
                                                gVar.f191677c = aVar6;
                                                gVar.f191680f = 7;
                                                objH3 = r17.h(cVar17, zVarA2, gVar);
                                                r18 = r17;
                                                aVar7 = aVar6;
                                                if (objH3 != objL) {
                                                    c cVar18 = c.TriggerInAppReview;
                                                    k kVar2 = new k(bVar);
                                                    gVar.f191675a = r18;
                                                    gVar.f191676b = bVar;
                                                    gVar.f191677c = aVar7;
                                                    gVar.f191680f = 8;
                                                    objH4 = r18.h(cVar18, kVar2, gVar);
                                                    r19 = r18;
                                                    aVar8 = aVar7;
                                                    if (objH4 == objL) {
                                                        c cVar19 = c.StartSpaceOnboarding;
                                                        l lVar2 = new l(bVar);
                                                        gVar.f191675a = r19;
                                                        gVar.f191676b = bVar;
                                                        gVar.f191677c = aVar8;
                                                        gVar.f191680f = 9;
                                                        objI3 = r19.i(cVar19, lVar2, gVar);
                                                        r20 = r19;
                                                        aVar9 = aVar8;
                                                        if (objI3 != objL) {
                                                            c cVar110 = c.StartOnboarding;
                                                            m mVar2 = new m(bVar);
                                                            gVar.f191675a = r20;
                                                            gVar.f191676b = bVar;
                                                            gVar.f191677c = aVar9;
                                                            gVar.f191680f = 10;
                                                            objI4 = r20.i(cVar110, mVar2, gVar);
                                                            r21 = r20;
                                                            aVar10 = aVar9;
                                                            if (objI4 == objL) {
                                                                c cVar111 = c.RequireAgreementEverything;
                                                                n nVar2 = new n(bVar, null);
                                                                gVar.f191675a = r21;
                                                                gVar.f191676b = bVar;
                                                                gVar.f191677c = aVar10;
                                                                gVar.f191680f = 11;
                                                                objI5 = r21.i(cVar111, nVar2, gVar);
                                                                r22 = r21;
                                                                aVar11 = aVar10;
                                                                if (objI5 != objL) {
                                                                    c cVar112 = c.Initialized3DEngine;
                                                                    t tVar2 = r22.f191644e;
                                                                    gVar.f191675a = r22;
                                                                    gVar.f191676b = bVar;
                                                                    gVar.f191677c = aVar11;
                                                                    gVar.f191680f = 12;
                                                                    objH5 = r22.h(cVar112, tVar2, gVar);
                                                                    r24 = r22;
                                                                    this = aVar11;
                                                                    if (objH5 == objL) {
                                                                        cVar2 = c.WaitOnboardingFinish;
                                                                        oVar = new o(bVar);
                                                                        gVar.f191675a = r24;
                                                                        gVar.f191676b = bVar;
                                                                        gVar.f191677c = this;
                                                                        gVar.f191680f = 13;
                                                                        if (r24.i(cVar2, oVar, gVar) != objL) {
                                                                            r23 = r24;
                                                                            this = this;
                                                                            r23.p(true);
                                                                            bVar.k();
                                                                            this = this;
                                                                            Unit unit2 = Unit.f312394a;
                                                                            this.i(null);
                                                                            return unit2;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return objL;
                        case 2:
                            kotlinx.coroutines.sync.a aVar13 = (kotlinx.coroutines.sync.a) gVar.f191677c;
                            bVar = (b) gVar.f191676b;
                            r rVar2 = (r) gVar.f191675a;
                            ResultKt.m(obj);
                            r13 = rVar2;
                            aVar2 = aVar13;
                            c cVar113 = c.InitializeWithoutUser;
                            b0 b0Var3 = r13.f191641b;
                            gVar.f191675a = r13;
                            gVar.f191676b = bVar;
                            gVar.f191677c = aVar2;
                            gVar.f191680f = 3;
                            objH = r13.h(cVar113, b0Var3, gVar);
                            r14 = r13;
                            aVar3 = aVar2;
                            if (objH != objL) {
                                c cVar114 = c.RequireAgreement;
                                i iVar3 = new i(bVar, null);
                                gVar.f191675a = r14;
                                gVar.f191676b = bVar;
                                gVar.f191677c = aVar3;
                                gVar.f191680f = 4;
                                objI = r14.i(cVar114, iVar3, gVar);
                                r15 = r14;
                                aVar4 = aVar3;
                                if (objI == objL) {
                                    c cVar115 = c.InitializeEarlyStatistics;
                                    v vVar3 = r15.f191642c;
                                    gVar.f191675a = r15;
                                    gVar.f191676b = bVar;
                                    gVar.f191677c = aVar4;
                                    gVar.f191680f = 5;
                                    objH2 = r15.h(cVar115, vVar3, gVar);
                                    r16 = r15;
                                    aVar5 = aVar4;
                                    if (objH2 != objL) {
                                        c cVar116 = c.SignIn;
                                        j jVar3 = new j(bVar);
                                        gVar.f191675a = r16;
                                        gVar.f191676b = bVar;
                                        gVar.f191677c = aVar5;
                                        gVar.f191680f = 6;
                                        objI2 = r16.i(cVar116, jVar3, gVar);
                                        r17 = r16;
                                        aVar6 = aVar5;
                                        if (objI2 == objL) {
                                            c cVar117 = c.InitializeWithUser;
                                            z zVarA3 = r17.f191643d.a(r17.f191647h);
                                            gVar.f191675a = r17;
                                            gVar.f191676b = bVar;
                                            gVar.f191677c = aVar6;
                                            gVar.f191680f = 7;
                                            objH3 = r17.h(cVar117, zVarA3, gVar);
                                            r18 = r17;
                                            aVar7 = aVar6;
                                            if (objH3 != objL) {
                                                c cVar118 = c.TriggerInAppReview;
                                                k kVar3 = new k(bVar);
                                                gVar.f191675a = r18;
                                                gVar.f191676b = bVar;
                                                gVar.f191677c = aVar7;
                                                gVar.f191680f = 8;
                                                objH4 = r18.h(cVar118, kVar3, gVar);
                                                r19 = r18;
                                                aVar8 = aVar7;
                                                if (objH4 == objL) {
                                                    c cVar119 = c.StartSpaceOnboarding;
                                                    l lVar3 = new l(bVar);
                                                    gVar.f191675a = r19;
                                                    gVar.f191676b = bVar;
                                                    gVar.f191677c = aVar8;
                                                    gVar.f191680f = 9;
                                                    objI3 = r19.i(cVar119, lVar3, gVar);
                                                    r20 = r19;
                                                    aVar9 = aVar8;
                                                    if (objI3 != objL) {
                                                        c cVar1110 = c.StartOnboarding;
                                                        m mVar3 = new m(bVar);
                                                        gVar.f191675a = r20;
                                                        gVar.f191676b = bVar;
                                                        gVar.f191677c = aVar9;
                                                        gVar.f191680f = 10;
                                                        objI4 = r20.i(cVar1110, mVar3, gVar);
                                                        r21 = r20;
                                                        aVar10 = aVar9;
                                                        if (objI4 == objL) {
                                                            c cVar1111 = c.RequireAgreementEverything;
                                                            n nVar3 = new n(bVar, null);
                                                            gVar.f191675a = r21;
                                                            gVar.f191676b = bVar;
                                                            gVar.f191677c = aVar10;
                                                            gVar.f191680f = 11;
                                                            objI5 = r21.i(cVar1111, nVar3, gVar);
                                                            r22 = r21;
                                                            aVar11 = aVar10;
                                                            if (objI5 != objL) {
                                                                c cVar1112 = c.Initialized3DEngine;
                                                                t tVar3 = r22.f191644e;
                                                                gVar.f191675a = r22;
                                                                gVar.f191676b = bVar;
                                                                gVar.f191677c = aVar11;
                                                                gVar.f191680f = 12;
                                                                objH5 = r22.h(cVar1112, tVar3, gVar);
                                                                r24 = r22;
                                                                this = aVar11;
                                                                if (objH5 == objL) {
                                                                    cVar2 = c.WaitOnboardingFinish;
                                                                    oVar = new o(bVar);
                                                                    gVar.f191675a = r24;
                                                                    gVar.f191676b = bVar;
                                                                    gVar.f191677c = this;
                                                                    gVar.f191680f = 13;
                                                                    if (r24.i(cVar2, oVar, gVar) != objL) {
                                                                        r23 = r24;
                                                                        this = this;
                                                                        r23.p(true);
                                                                        bVar.k();
                                                                        this = this;
                                                                        Unit unit3 = Unit.f312394a;
                                                                        this.i(null);
                                                                        return unit3;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return objL;
                        case 3:
                            kotlinx.coroutines.sync.a aVar14 = (kotlinx.coroutines.sync.a) gVar.f191677c;
                            bVar = (b) gVar.f191676b;
                            r rVar3 = (r) gVar.f191675a;
                            ResultKt.m(obj);
                            r14 = rVar3;
                            aVar3 = aVar14;
                            c cVar1113 = c.RequireAgreement;
                            i iVar4 = new i(bVar, null);
                            gVar.f191675a = r14;
                            gVar.f191676b = bVar;
                            gVar.f191677c = aVar3;
                            gVar.f191680f = 4;
                            objI = r14.i(cVar1113, iVar4, gVar);
                            r15 = r14;
                            aVar4 = aVar3;
                            if (objI == objL) {
                                c cVar1114 = c.InitializeEarlyStatistics;
                                v vVar4 = r15.f191642c;
                                gVar.f191675a = r15;
                                gVar.f191676b = bVar;
                                gVar.f191677c = aVar4;
                                gVar.f191680f = 5;
                                objH2 = r15.h(cVar1114, vVar4, gVar);
                                r16 = r15;
                                aVar5 = aVar4;
                                if (objH2 != objL) {
                                    c cVar1115 = c.SignIn;
                                    j jVar4 = new j(bVar);
                                    gVar.f191675a = r16;
                                    gVar.f191676b = bVar;
                                    gVar.f191677c = aVar5;
                                    gVar.f191680f = 6;
                                    objI2 = r16.i(cVar1115, jVar4, gVar);
                                    r17 = r16;
                                    aVar6 = aVar5;
                                    if (objI2 == objL) {
                                        c cVar1116 = c.InitializeWithUser;
                                        z zVarA4 = r17.f191643d.a(r17.f191647h);
                                        gVar.f191675a = r17;
                                        gVar.f191676b = bVar;
                                        gVar.f191677c = aVar6;
                                        gVar.f191680f = 7;
                                        objH3 = r17.h(cVar1116, zVarA4, gVar);
                                        r18 = r17;
                                        aVar7 = aVar6;
                                        if (objH3 != objL) {
                                            c cVar1117 = c.TriggerInAppReview;
                                            k kVar4 = new k(bVar);
                                            gVar.f191675a = r18;
                                            gVar.f191676b = bVar;
                                            gVar.f191677c = aVar7;
                                            gVar.f191680f = 8;
                                            objH4 = r18.h(cVar1117, kVar4, gVar);
                                            r19 = r18;
                                            aVar8 = aVar7;
                                            if (objH4 == objL) {
                                                c cVar1118 = c.StartSpaceOnboarding;
                                                l lVar4 = new l(bVar);
                                                gVar.f191675a = r19;
                                                gVar.f191676b = bVar;
                                                gVar.f191677c = aVar8;
                                                gVar.f191680f = 9;
                                                objI3 = r19.i(cVar1118, lVar4, gVar);
                                                r20 = r19;
                                                aVar9 = aVar8;
                                                if (objI3 != objL) {
                                                    c cVar1119 = c.StartOnboarding;
                                                    m mVar4 = new m(bVar);
                                                    gVar.f191675a = r20;
                                                    gVar.f191676b = bVar;
                                                    gVar.f191677c = aVar9;
                                                    gVar.f191680f = 10;
                                                    objI4 = r20.i(cVar1119, mVar4, gVar);
                                                    r21 = r20;
                                                    aVar10 = aVar9;
                                                    if (objI4 == objL) {
                                                        c cVar11110 = c.RequireAgreementEverything;
                                                        n nVar4 = new n(bVar, null);
                                                        gVar.f191675a = r21;
                                                        gVar.f191676b = bVar;
                                                        gVar.f191677c = aVar10;
                                                        gVar.f191680f = 11;
                                                        objI5 = r21.i(cVar11110, nVar4, gVar);
                                                        r22 = r21;
                                                        aVar11 = aVar10;
                                                        if (objI5 != objL) {
                                                            c cVar11111 = c.Initialized3DEngine;
                                                            t tVar4 = r22.f191644e;
                                                            gVar.f191675a = r22;
                                                            gVar.f191676b = bVar;
                                                            gVar.f191677c = aVar11;
                                                            gVar.f191680f = 12;
                                                            objH5 = r22.h(cVar11111, tVar4, gVar);
                                                            r24 = r22;
                                                            this = aVar11;
                                                            if (objH5 == objL) {
                                                                cVar2 = c.WaitOnboardingFinish;
                                                                oVar = new o(bVar);
                                                                gVar.f191675a = r24;
                                                                gVar.f191676b = bVar;
                                                                gVar.f191677c = this;
                                                                gVar.f191680f = 13;
                                                                if (r24.i(cVar2, oVar, gVar) != objL) {
                                                                    r23 = r24;
                                                                    this = this;
                                                                    r23.p(true);
                                                                    bVar.k();
                                                                    this = this;
                                                                    Unit unit4 = Unit.f312394a;
                                                                    this.i(null);
                                                                    return unit4;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return objL;
                        case 4:
                            kotlinx.coroutines.sync.a aVar15 = (kotlinx.coroutines.sync.a) gVar.f191677c;
                            bVar = (b) gVar.f191676b;
                            r rVar4 = (r) gVar.f191675a;
                            ResultKt.m(obj);
                            r15 = rVar4;
                            aVar4 = aVar15;
                            c cVar11112 = c.InitializeEarlyStatistics;
                            v vVar5 = r15.f191642c;
                            gVar.f191675a = r15;
                            gVar.f191676b = bVar;
                            gVar.f191677c = aVar4;
                            gVar.f191680f = 5;
                            objH2 = r15.h(cVar11112, vVar5, gVar);
                            r16 = r15;
                            aVar5 = aVar4;
                            if (objH2 != objL) {
                                c cVar11113 = c.SignIn;
                                j jVar5 = new j(bVar);
                                gVar.f191675a = r16;
                                gVar.f191676b = bVar;
                                gVar.f191677c = aVar5;
                                gVar.f191680f = 6;
                                objI2 = r16.i(cVar11113, jVar5, gVar);
                                r17 = r16;
                                aVar6 = aVar5;
                                if (objI2 == objL) {
                                    c cVar11114 = c.InitializeWithUser;
                                    z zVarA5 = r17.f191643d.a(r17.f191647h);
                                    gVar.f191675a = r17;
                                    gVar.f191676b = bVar;
                                    gVar.f191677c = aVar6;
                                    gVar.f191680f = 7;
                                    objH3 = r17.h(cVar11114, zVarA5, gVar);
                                    r18 = r17;
                                    aVar7 = aVar6;
                                    if (objH3 != objL) {
                                        c cVar11115 = c.TriggerInAppReview;
                                        k kVar5 = new k(bVar);
                                        gVar.f191675a = r18;
                                        gVar.f191676b = bVar;
                                        gVar.f191677c = aVar7;
                                        gVar.f191680f = 8;
                                        objH4 = r18.h(cVar11115, kVar5, gVar);
                                        r19 = r18;
                                        aVar8 = aVar7;
                                        if (objH4 == objL) {
                                            c cVar11116 = c.StartSpaceOnboarding;
                                            l lVar5 = new l(bVar);
                                            gVar.f191675a = r19;
                                            gVar.f191676b = bVar;
                                            gVar.f191677c = aVar8;
                                            gVar.f191680f = 9;
                                            objI3 = r19.i(cVar11116, lVar5, gVar);
                                            r20 = r19;
                                            aVar9 = aVar8;
                                            if (objI3 != objL) {
                                                c cVar11117 = c.StartOnboarding;
                                                m mVar5 = new m(bVar);
                                                gVar.f191675a = r20;
                                                gVar.f191676b = bVar;
                                                gVar.f191677c = aVar9;
                                                gVar.f191680f = 10;
                                                objI4 = r20.i(cVar11117, mVar5, gVar);
                                                r21 = r20;
                                                aVar10 = aVar9;
                                                if (objI4 == objL) {
                                                    c cVar11118 = c.RequireAgreementEverything;
                                                    n nVar5 = new n(bVar, null);
                                                    gVar.f191675a = r21;
                                                    gVar.f191676b = bVar;
                                                    gVar.f191677c = aVar10;
                                                    gVar.f191680f = 11;
                                                    objI5 = r21.i(cVar11118, nVar5, gVar);
                                                    r22 = r21;
                                                    aVar11 = aVar10;
                                                    if (objI5 != objL) {
                                                        c cVar11119 = c.Initialized3DEngine;
                                                        t tVar5 = r22.f191644e;
                                                        gVar.f191675a = r22;
                                                        gVar.f191676b = bVar;
                                                        gVar.f191677c = aVar11;
                                                        gVar.f191680f = 12;
                                                        objH5 = r22.h(cVar11119, tVar5, gVar);
                                                        r24 = r22;
                                                        this = aVar11;
                                                        if (objH5 == objL) {
                                                            cVar2 = c.WaitOnboardingFinish;
                                                            oVar = new o(bVar);
                                                            gVar.f191675a = r24;
                                                            gVar.f191676b = bVar;
                                                            gVar.f191677c = this;
                                                            gVar.f191680f = 13;
                                                            if (r24.i(cVar2, oVar, gVar) != objL) {
                                                                r23 = r24;
                                                                this = this;
                                                                r23.p(true);
                                                                bVar.k();
                                                                this = this;
                                                                Unit unit5 = Unit.f312394a;
                                                                this.i(null);
                                                                return unit5;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return objL;
                        case 5:
                            kotlinx.coroutines.sync.a aVar16 = (kotlinx.coroutines.sync.a) gVar.f191677c;
                            bVar = (b) gVar.f191676b;
                            r rVar5 = (r) gVar.f191675a;
                            ResultKt.m(obj);
                            r16 = rVar5;
                            aVar5 = aVar16;
                            c cVar111110 = c.SignIn;
                            j jVar6 = new j(bVar);
                            gVar.f191675a = r16;
                            gVar.f191676b = bVar;
                            gVar.f191677c = aVar5;
                            gVar.f191680f = 6;
                            objI2 = r16.i(cVar111110, jVar6, gVar);
                            r17 = r16;
                            aVar6 = aVar5;
                            if (objI2 == objL) {
                                c cVar111111 = c.InitializeWithUser;
                                z zVarA6 = r17.f191643d.a(r17.f191647h);
                                gVar.f191675a = r17;
                                gVar.f191676b = bVar;
                                gVar.f191677c = aVar6;
                                gVar.f191680f = 7;
                                objH3 = r17.h(cVar111111, zVarA6, gVar);
                                r18 = r17;
                                aVar7 = aVar6;
                                if (objH3 != objL) {
                                    c cVar111112 = c.TriggerInAppReview;
                                    k kVar6 = new k(bVar);
                                    gVar.f191675a = r18;
                                    gVar.f191676b = bVar;
                                    gVar.f191677c = aVar7;
                                    gVar.f191680f = 8;
                                    objH4 = r18.h(cVar111112, kVar6, gVar);
                                    r19 = r18;
                                    aVar8 = aVar7;
                                    if (objH4 == objL) {
                                        c cVar111113 = c.StartSpaceOnboarding;
                                        l lVar6 = new l(bVar);
                                        gVar.f191675a = r19;
                                        gVar.f191676b = bVar;
                                        gVar.f191677c = aVar8;
                                        gVar.f191680f = 9;
                                        objI3 = r19.i(cVar111113, lVar6, gVar);
                                        r20 = r19;
                                        aVar9 = aVar8;
                                        if (objI3 != objL) {
                                            c cVar111114 = c.StartOnboarding;
                                            m mVar6 = new m(bVar);
                                            gVar.f191675a = r20;
                                            gVar.f191676b = bVar;
                                            gVar.f191677c = aVar9;
                                            gVar.f191680f = 10;
                                            objI4 = r20.i(cVar111114, mVar6, gVar);
                                            r21 = r20;
                                            aVar10 = aVar9;
                                            if (objI4 == objL) {
                                                c cVar111115 = c.RequireAgreementEverything;
                                                n nVar6 = new n(bVar, null);
                                                gVar.f191675a = r21;
                                                gVar.f191676b = bVar;
                                                gVar.f191677c = aVar10;
                                                gVar.f191680f = 11;
                                                objI5 = r21.i(cVar111115, nVar6, gVar);
                                                r22 = r21;
                                                aVar11 = aVar10;
                                                if (objI5 != objL) {
                                                    c cVar111116 = c.Initialized3DEngine;
                                                    t tVar6 = r22.f191644e;
                                                    gVar.f191675a = r22;
                                                    gVar.f191676b = bVar;
                                                    gVar.f191677c = aVar11;
                                                    gVar.f191680f = 12;
                                                    objH5 = r22.h(cVar111116, tVar6, gVar);
                                                    r24 = r22;
                                                    this = aVar11;
                                                    if (objH5 == objL) {
                                                        cVar2 = c.WaitOnboardingFinish;
                                                        oVar = new o(bVar);
                                                        gVar.f191675a = r24;
                                                        gVar.f191676b = bVar;
                                                        gVar.f191677c = this;
                                                        gVar.f191680f = 13;
                                                        if (r24.i(cVar2, oVar, gVar) != objL) {
                                                            r23 = r24;
                                                            this = this;
                                                            r23.p(true);
                                                            bVar.k();
                                                            this = this;
                                                            Unit unit6 = Unit.f312394a;
                                                            this.i(null);
                                                            return unit6;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return objL;
                        case 6:
                            kotlinx.coroutines.sync.a aVar17 = (kotlinx.coroutines.sync.a) gVar.f191677c;
                            bVar = (b) gVar.f191676b;
                            r rVar6 = (r) gVar.f191675a;
                            ResultKt.m(obj);
                            r17 = rVar6;
                            aVar6 = aVar17;
                            c cVar111117 = c.InitializeWithUser;
                            z zVarA7 = r17.f191643d.a(r17.f191647h);
                            gVar.f191675a = r17;
                            gVar.f191676b = bVar;
                            gVar.f191677c = aVar6;
                            gVar.f191680f = 7;
                            objH3 = r17.h(cVar111117, zVarA7, gVar);
                            r18 = r17;
                            aVar7 = aVar6;
                            if (objH3 != objL) {
                                c cVar111118 = c.TriggerInAppReview;
                                k kVar7 = new k(bVar);
                                gVar.f191675a = r18;
                                gVar.f191676b = bVar;
                                gVar.f191677c = aVar7;
                                gVar.f191680f = 8;
                                objH4 = r18.h(cVar111118, kVar7, gVar);
                                r19 = r18;
                                aVar8 = aVar7;
                                if (objH4 == objL) {
                                    c cVar111119 = c.StartSpaceOnboarding;
                                    l lVar7 = new l(bVar);
                                    gVar.f191675a = r19;
                                    gVar.f191676b = bVar;
                                    gVar.f191677c = aVar8;
                                    gVar.f191680f = 9;
                                    objI3 = r19.i(cVar111119, lVar7, gVar);
                                    r20 = r19;
                                    aVar9 = aVar8;
                                    if (objI3 != objL) {
                                        c cVar1111110 = c.StartOnboarding;
                                        m mVar7 = new m(bVar);
                                        gVar.f191675a = r20;
                                        gVar.f191676b = bVar;
                                        gVar.f191677c = aVar9;
                                        gVar.f191680f = 10;
                                        objI4 = r20.i(cVar1111110, mVar7, gVar);
                                        r21 = r20;
                                        aVar10 = aVar9;
                                        if (objI4 == objL) {
                                            c cVar1111111 = c.RequireAgreementEverything;
                                            n nVar7 = new n(bVar, null);
                                            gVar.f191675a = r21;
                                            gVar.f191676b = bVar;
                                            gVar.f191677c = aVar10;
                                            gVar.f191680f = 11;
                                            objI5 = r21.i(cVar1111111, nVar7, gVar);
                                            r22 = r21;
                                            aVar11 = aVar10;
                                            if (objI5 != objL) {
                                                c cVar1111112 = c.Initialized3DEngine;
                                                t tVar7 = r22.f191644e;
                                                gVar.f191675a = r22;
                                                gVar.f191676b = bVar;
                                                gVar.f191677c = aVar11;
                                                gVar.f191680f = 12;
                                                objH5 = r22.h(cVar1111112, tVar7, gVar);
                                                r24 = r22;
                                                this = aVar11;
                                                if (objH5 == objL) {
                                                    cVar2 = c.WaitOnboardingFinish;
                                                    oVar = new o(bVar);
                                                    gVar.f191675a = r24;
                                                    gVar.f191676b = bVar;
                                                    gVar.f191677c = this;
                                                    gVar.f191680f = 13;
                                                    if (r24.i(cVar2, oVar, gVar) != objL) {
                                                        r23 = r24;
                                                        this = this;
                                                        r23.p(true);
                                                        bVar.k();
                                                        this = this;
                                                        Unit unit7 = Unit.f312394a;
                                                        this.i(null);
                                                        return unit7;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return objL;
                        case 7:
                            kotlinx.coroutines.sync.a aVar18 = (kotlinx.coroutines.sync.a) gVar.f191677c;
                            bVar = (b) gVar.f191676b;
                            r rVar7 = (r) gVar.f191675a;
                            ResultKt.m(obj);
                            r18 = rVar7;
                            aVar7 = aVar18;
                            c cVar1111113 = c.TriggerInAppReview;
                            k kVar8 = new k(bVar);
                            gVar.f191675a = r18;
                            gVar.f191676b = bVar;
                            gVar.f191677c = aVar7;
                            gVar.f191680f = 8;
                            objH4 = r18.h(cVar1111113, kVar8, gVar);
                            r19 = r18;
                            aVar8 = aVar7;
                            if (objH4 == objL) {
                                c cVar1111114 = c.StartSpaceOnboarding;
                                l lVar8 = new l(bVar);
                                gVar.f191675a = r19;
                                gVar.f191676b = bVar;
                                gVar.f191677c = aVar8;
                                gVar.f191680f = 9;
                                objI3 = r19.i(cVar1111114, lVar8, gVar);
                                r20 = r19;
                                aVar9 = aVar8;
                                if (objI3 != objL) {
                                    c cVar1111115 = c.StartOnboarding;
                                    m mVar8 = new m(bVar);
                                    gVar.f191675a = r20;
                                    gVar.f191676b = bVar;
                                    gVar.f191677c = aVar9;
                                    gVar.f191680f = 10;
                                    objI4 = r20.i(cVar1111115, mVar8, gVar);
                                    r21 = r20;
                                    aVar10 = aVar9;
                                    if (objI4 == objL) {
                                        c cVar1111116 = c.RequireAgreementEverything;
                                        n nVar8 = new n(bVar, null);
                                        gVar.f191675a = r21;
                                        gVar.f191676b = bVar;
                                        gVar.f191677c = aVar10;
                                        gVar.f191680f = 11;
                                        objI5 = r21.i(cVar1111116, nVar8, gVar);
                                        r22 = r21;
                                        aVar11 = aVar10;
                                        if (objI5 != objL) {
                                            c cVar1111117 = c.Initialized3DEngine;
                                            t tVar8 = r22.f191644e;
                                            gVar.f191675a = r22;
                                            gVar.f191676b = bVar;
                                            gVar.f191677c = aVar11;
                                            gVar.f191680f = 12;
                                            objH5 = r22.h(cVar1111117, tVar8, gVar);
                                            r24 = r22;
                                            this = aVar11;
                                            if (objH5 == objL) {
                                                cVar2 = c.WaitOnboardingFinish;
                                                oVar = new o(bVar);
                                                gVar.f191675a = r24;
                                                gVar.f191676b = bVar;
                                                gVar.f191677c = this;
                                                gVar.f191680f = 13;
                                                if (r24.i(cVar2, oVar, gVar) != objL) {
                                                    r23 = r24;
                                                    this = this;
                                                    r23.p(true);
                                                    bVar.k();
                                                    this = this;
                                                    Unit unit8 = Unit.f312394a;
                                                    this.i(null);
                                                    return unit8;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return objL;
                        case 8:
                            kotlinx.coroutines.sync.a aVar19 = (kotlinx.coroutines.sync.a) gVar.f191677c;
                            bVar = (b) gVar.f191676b;
                            r rVar8 = (r) gVar.f191675a;
                            ResultKt.m(obj);
                            r19 = rVar8;
                            aVar8 = aVar19;
                            c cVar1111118 = c.StartSpaceOnboarding;
                            l lVar9 = new l(bVar);
                            gVar.f191675a = r19;
                            gVar.f191676b = bVar;
                            gVar.f191677c = aVar8;
                            gVar.f191680f = 9;
                            objI3 = r19.i(cVar1111118, lVar9, gVar);
                            r20 = r19;
                            aVar9 = aVar8;
                            if (objI3 != objL) {
                                c cVar1111119 = c.StartOnboarding;
                                m mVar9 = new m(bVar);
                                gVar.f191675a = r20;
                                gVar.f191676b = bVar;
                                gVar.f191677c = aVar9;
                                gVar.f191680f = 10;
                                objI4 = r20.i(cVar1111119, mVar9, gVar);
                                r21 = r20;
                                aVar10 = aVar9;
                                if (objI4 == objL) {
                                    c cVar11111110 = c.RequireAgreementEverything;
                                    n nVar9 = new n(bVar, null);
                                    gVar.f191675a = r21;
                                    gVar.f191676b = bVar;
                                    gVar.f191677c = aVar10;
                                    gVar.f191680f = 11;
                                    objI5 = r21.i(cVar11111110, nVar9, gVar);
                                    r22 = r21;
                                    aVar11 = aVar10;
                                    if (objI5 != objL) {
                                        c cVar11111111 = c.Initialized3DEngine;
                                        t tVar9 = r22.f191644e;
                                        gVar.f191675a = r22;
                                        gVar.f191676b = bVar;
                                        gVar.f191677c = aVar11;
                                        gVar.f191680f = 12;
                                        objH5 = r22.h(cVar11111111, tVar9, gVar);
                                        r24 = r22;
                                        this = aVar11;
                                        if (objH5 == objL) {
                                            cVar2 = c.WaitOnboardingFinish;
                                            oVar = new o(bVar);
                                            gVar.f191675a = r24;
                                            gVar.f191676b = bVar;
                                            gVar.f191677c = this;
                                            gVar.f191680f = 13;
                                            if (r24.i(cVar2, oVar, gVar) != objL) {
                                                r23 = r24;
                                                this = this;
                                                r23.p(true);
                                                bVar.k();
                                                this = this;
                                                Unit unit9 = Unit.f312394a;
                                                this.i(null);
                                                return unit9;
                                            }
                                        }
                                    }
                                }
                            }
                            return objL;
                        case 9:
                            kotlinx.coroutines.sync.a aVar20 = (kotlinx.coroutines.sync.a) gVar.f191677c;
                            bVar = (b) gVar.f191676b;
                            r rVar9 = (r) gVar.f191675a;
                            ResultKt.m(obj);
                            r20 = rVar9;
                            aVar9 = aVar20;
                            c cVar11111112 = c.StartOnboarding;
                            m mVar10 = new m(bVar);
                            gVar.f191675a = r20;
                            gVar.f191676b = bVar;
                            gVar.f191677c = aVar9;
                            gVar.f191680f = 10;
                            objI4 = r20.i(cVar11111112, mVar10, gVar);
                            r21 = r20;
                            aVar10 = aVar9;
                            if (objI4 == objL) {
                                c cVar11111113 = c.RequireAgreementEverything;
                                n nVar10 = new n(bVar, null);
                                gVar.f191675a = r21;
                                gVar.f191676b = bVar;
                                gVar.f191677c = aVar10;
                                gVar.f191680f = 11;
                                objI5 = r21.i(cVar11111113, nVar10, gVar);
                                r22 = r21;
                                aVar11 = aVar10;
                                if (objI5 != objL) {
                                    c cVar11111114 = c.Initialized3DEngine;
                                    t tVar10 = r22.f191644e;
                                    gVar.f191675a = r22;
                                    gVar.f191676b = bVar;
                                    gVar.f191677c = aVar11;
                                    gVar.f191680f = 12;
                                    objH5 = r22.h(cVar11111114, tVar10, gVar);
                                    r24 = r22;
                                    this = aVar11;
                                    if (objH5 == objL) {
                                        cVar2 = c.WaitOnboardingFinish;
                                        oVar = new o(bVar);
                                        gVar.f191675a = r24;
                                        gVar.f191676b = bVar;
                                        gVar.f191677c = this;
                                        gVar.f191680f = 13;
                                        if (r24.i(cVar2, oVar, gVar) != objL) {
                                            r23 = r24;
                                            this = this;
                                            r23.p(true);
                                            bVar.k();
                                            this = this;
                                            Unit unit10 = Unit.f312394a;
                                            this.i(null);
                                            return unit10;
                                        }
                                    }
                                }
                            }
                            return objL;
                        case 10:
                            kotlinx.coroutines.sync.a aVar21 = (kotlinx.coroutines.sync.a) gVar.f191677c;
                            bVar = (b) gVar.f191676b;
                            r rVar10 = (r) gVar.f191675a;
                            ResultKt.m(obj);
                            r21 = rVar10;
                            aVar10 = aVar21;
                            c cVar11111115 = c.RequireAgreementEverything;
                            n nVar11 = new n(bVar, null);
                            gVar.f191675a = r21;
                            gVar.f191676b = bVar;
                            gVar.f191677c = aVar10;
                            gVar.f191680f = 11;
                            objI5 = r21.i(cVar11111115, nVar11, gVar);
                            r22 = r21;
                            aVar11 = aVar10;
                            if (objI5 != objL) {
                                c cVar11111116 = c.Initialized3DEngine;
                                t tVar11 = r22.f191644e;
                                gVar.f191675a = r22;
                                gVar.f191676b = bVar;
                                gVar.f191677c = aVar11;
                                gVar.f191680f = 12;
                                objH5 = r22.h(cVar11111116, tVar11, gVar);
                                r24 = r22;
                                this = aVar11;
                                if (objH5 == objL) {
                                    cVar2 = c.WaitOnboardingFinish;
                                    oVar = new o(bVar);
                                    gVar.f191675a = r24;
                                    gVar.f191676b = bVar;
                                    gVar.f191677c = this;
                                    gVar.f191680f = 13;
                                    if (r24.i(cVar2, oVar, gVar) != objL) {
                                        r23 = r24;
                                        this = this;
                                        r23.p(true);
                                        bVar.k();
                                        this = this;
                                        Unit unit11 = Unit.f312394a;
                                        this.i(null);
                                        return unit11;
                                    }
                                }
                            }
                            return objL;
                        case 11:
                            kotlinx.coroutines.sync.a aVar22 = (kotlinx.coroutines.sync.a) gVar.f191677c;
                            bVar = (b) gVar.f191676b;
                            r rVar11 = (r) gVar.f191675a;
                            ResultKt.m(obj);
                            r22 = rVar11;
                            aVar11 = aVar22;
                            c cVar11111117 = c.Initialized3DEngine;
                            t tVar12 = r22.f191644e;
                            gVar.f191675a = r22;
                            gVar.f191676b = bVar;
                            gVar.f191677c = aVar11;
                            gVar.f191680f = 12;
                            objH5 = r22.h(cVar11111117, tVar12, gVar);
                            r24 = r22;
                            this = aVar11;
                            if (objH5 == objL) {
                                cVar2 = c.WaitOnboardingFinish;
                                oVar = new o(bVar);
                                gVar.f191675a = r24;
                                gVar.f191676b = bVar;
                                gVar.f191677c = this;
                                gVar.f191680f = 13;
                                if (r24.i(cVar2, oVar, gVar) != objL) {
                                    r23 = r24;
                                    this = this;
                                    r23.p(true);
                                    bVar.k();
                                    this = this;
                                    Unit unit12 = Unit.f312394a;
                                    this.i(null);
                                    return unit12;
                                }
                            }
                            return objL;
                        case 12:
                            kotlinx.coroutines.sync.a aVar23 = (kotlinx.coroutines.sync.a) gVar.f191677c;
                            bVar = (b) gVar.f191676b;
                            r rVar12 = (r) gVar.f191675a;
                            ResultKt.m(obj);
                            r24 = rVar12;
                            this = aVar23;
                            cVar2 = c.WaitOnboardingFinish;
                            oVar = new o(bVar);
                            gVar.f191675a = r24;
                            gVar.f191676b = bVar;
                            gVar.f191677c = this;
                            gVar.f191680f = 13;
                            if (r24.i(cVar2, oVar, gVar) != objL) {
                                r23 = r24;
                                this = this;
                                r23.p(true);
                                bVar.k();
                                this = this;
                                Unit unit13 = Unit.f312394a;
                                this.i(null);
                                return unit13;
                            }
                            return objL;
                        case 13:
                            this = (kotlinx.coroutines.sync.a) gVar.f191677c;
                            bVar = (b) gVar.f191676b;
                            r23 = (r) gVar.f191675a;
                            try {
                                ResultKt.m(obj);
                                r23 = r23;
                                this = this;
                                r23.p(true);
                                bVar.k();
                                this = this;
                                break;
                            } catch (Throwable th3) {
                                th = th3;
                                r10 = r23;
                                r11 = this;
                                timber.log.b.f381052a.e(th);
                                r10.f191646g.get().b("startup", null, th);
                                bVar.e(new Exception(th));
                                this = r11;
                            }
                            Unit unit14 = Unit.f312394a;
                            this.i(null);
                            return unit14;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r10 = r24;
                    r11 = this;
                }
            } catch (Throwable th5) {
                this.i(null);
                throw th5;
            }
        } catch (x.a e11) {
            e = e11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object m(@NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        q qVar;
        kotlinx.coroutines.sync.a aVar;
        if (dVar instanceof q) {
            qVar = (q) dVar;
            int i10 = qVar.f191698e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f191698e = i10 - Integer.MIN_VALUE;
            } else {
                qVar = new q(dVar);
            }
        } else {
            qVar = new q(dVar);
        }
        Object obj = qVar.f191696c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = qVar.f191698e;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar = this.f191652m;
            qVar.f191694a = this;
            qVar.f191695b = aVar;
            qVar.f191698e = 1;
            if (aVar.h(null, qVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) qVar.f191695b;
            r rVar = (r) qVar.f191694a;
            ResultKt.m(obj);
            aVar = aVar2;
            this = rVar;
        }
        try {
            return kotlin.coroutines.jvm.internal.b.a(this.k());
        } finally {
            aVar.i(null);
        }
    }

    public final boolean n() {
        return this.f191650k.compareAndSet(false, true);
    }

    @m1
    public final void o() {
        com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new C1595r(null), 3, null);
    }
}
