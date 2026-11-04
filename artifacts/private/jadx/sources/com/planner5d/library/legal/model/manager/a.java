package com.planner5d.library.legal.model.manager;

import android.content.Context;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.x1;
import com.planner5d.library.modules.user.user.r0;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.i0;
import com.planner5d.library.services.utility.s;
import java.util.Date;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@com.planner5d.library.legal.application.q
@SourceDebugExtension({"SMAP\nPrivacyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyManager.kt\ncom/planner5d/library/legal/model/manager/PrivacyManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,229:1\n1#2:230\n*E\n"})
public final class a implements x1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f180345m = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f180347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final r0 f180348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final w f180349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final c2 f180350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final u1 f180351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f180352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f180353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f180354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f180355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final b f180344l = new b(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f180346n = i0.b(1);

    /* JADX INFO: renamed from: com.planner5d.library.legal.model.manager.a$a, reason: collision with other inner class name */
    public enum EnumC1566a {
        CurrentRevision,
        Everything;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f180359d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<EnumC1566a> l() {
            return f180359d;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f180363a;

        static {
            int[] iArr = new int[EnumC1566a.values().length];
            try {
                iArr[EnumC1566a.Everything.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1566a.CurrentRevision.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f180363a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.legal.model.manager.PrivacyManager", f = "PrivacyManager.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {com.rabbitmq.client.impl.k.b.p.f265340a, 113, me.relex.circleindicator.a.f332619e, 114, 121}, m = "checkAndTryToSetLegalAgreements", n = {"this", "user", "this", "user", "this", "user", "this", "user"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f180365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f180366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f180367d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f180368e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f180369f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f180371h;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180369f = obj;
            this.f180371h |= Integer.MIN_VALUE;
            return a.this.p(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.legal.model.manager.PrivacyManager", f = "PrivacyManager.kt", i = {1}, l = {175, 184, com.facebook.internal.p.f100029m}, m = "checkPrivacyAgreement", n = {"actionToContinue"}, s = {"L$0"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f180373b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f180375d;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180373b = obj;
            this.f180375d |= Integer.MIN_VALUE;
            int i10 = 7 >> 0;
            return a.this.q(null, false, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.legal.model.manager.PrivacyManager", f = "PrivacyManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160707m}, m = "getLocalUserAgreement", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f180376a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f180378c;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180376a = obj;
            this.f180378c |= Integer.MIN_VALUE;
            return a.this.r(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.legal.model.manager.PrivacyManager", f = "PrivacyManager.kt", i = {}, l = {76}, m = "isAgreedToCurrentRevision", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f180379a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f180381c;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180379a = obj;
            this.f180381c |= Integer.MIN_VALUE;
            return a.this.v(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.legal.model.manager.PrivacyManager$isAgreedToEverything$2", f = "PrivacyManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160696i0, com.planner5d.library.engine.input.f.b.f160696i0}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180382a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f180384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f180385d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(id.a aVar, Context context, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f180384c = aVar;
            this.f180385d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new i(this.f180384c, this.f180385d, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0059  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        
            if (r8 == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f180382a
                r2 = 7
                r2 = 2
                r3 = 0
                r4 = 2
                r4 = 1
                if (r1 == 0) goto L25
                r6 = 3
                if (r1 == r4) goto L21
                if (r1 != r2) goto L18
                kotlin.ResultKt.m(r8)     // Catch: java.lang.Exception -> L16
                goto L51
            L16:
                r7 = move-exception
                goto L5c
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r6 = 7
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L21:
                kotlin.ResultKt.m(r8)     // Catch: java.lang.Exception -> L16
                goto L36
            L25:
                kotlin.ResultKt.m(r8)
                r6 = 4
                com.planner5d.library.legal.model.manager.a r8 = com.planner5d.library.legal.model.manager.a.this     // Catch: java.lang.Exception -> L16
                r6 = 4
                r7.f180382a = r4     // Catch: java.lang.Exception -> L16
                java.lang.Object r8 = com.planner5d.library.legal.model.manager.a.i(r8, r7)     // Catch: java.lang.Exception -> L16
                r6 = 6
                if (r8 != r0) goto L36
                goto L50
            L36:
                r6 = 7
                java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Exception -> L16
                boolean r8 = r8.booleanValue()     // Catch: java.lang.Exception -> L16
                if (r8 == 0) goto L65
                id.a r8 = r7.f180384c     // Catch: java.lang.Exception -> L16
                if (r8 == 0) goto L59
                com.planner5d.library.legal.model.manager.a r1 = com.planner5d.library.legal.model.manager.a.this     // Catch: java.lang.Exception -> L16
                android.content.Context r5 = r7.f180385d     // Catch: java.lang.Exception -> L16
                r7.f180382a = r2     // Catch: java.lang.Exception -> L16
                r6 = 5
                java.lang.Object r8 = com.planner5d.library.legal.model.manager.a.m(r1, r8, r5, r7)     // Catch: java.lang.Exception -> L16
                if (r8 != r0) goto L51
            L50:
                return r0
            L51:
                java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Exception -> L16
                boolean r7 = r8.booleanValue()     // Catch: java.lang.Exception -> L16
                if (r7 == 0) goto L65
            L59:
                r6 = 5
                r3 = r4
                goto L65
            L5c:
                timber.log.b$b r8 = timber.log.b.f381052a
                java.lang.String r0 = "Failed to check privacy agreement."
                java.lang.Object[] r1 = new java.lang.Object[r3]
                r8.f(r7, r0, r1)
            L65:
                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r3)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.legal.model.manager.a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.legal.model.manager.PrivacyManager", f = "PrivacyManager.kt", i = {}, l = {96}, m = "isAgreedToNewsletters", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f180386a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f180388c;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180386a = obj;
            this.f180388c |= Integer.MIN_VALUE;
            return a.this.x(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.legal.model.manager.PrivacyManager", f = "PrivacyManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160733u1}, m = "isTermsAndPrivacyAgreedForUser", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f180389a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f180391c;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180389a = obj;
            this.f180391c |= Integer.MIN_VALUE;
            return a.this.z(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.legal.model.manager.PrivacyManager", f = "PrivacyManager.kt", i = {0, 0}, l = {130, 130}, m = "isValidUserAndAgreedPrivacyRemote", n = {"this", "user"}, s = {"L$0", "L$1"})
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f180393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f180394c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180396e;

        l(kotlin.coroutines.d<? super l> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180394c = obj;
            this.f180396e |= Integer.MIN_VALUE;
            return a.this.A(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.legal.model.manager.PrivacyManager", f = "PrivacyManager.kt", i = {}, l = {60}, m = "setAgreedByUser", n = {}, s = {})
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f180398b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f180400d;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180398b = obj;
            this.f180400d |= Integer.MIN_VALUE;
            return a.this.D(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.legal.model.manager.PrivacyManager", f = "PrivacyManager.kt", i = {}, l = {152}, m = "setAgreements", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f180401a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f180403c;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180401a = obj;
            this.f180403c |= Integer.MIN_VALUE;
            return a.this.E(null, false, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.legal.model.manager.PrivacyManager", f = "PrivacyManager.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {65, 66, com.planner5d.library.engine.input.f.b.V, 67}, m = "setAgreementsLocally", n = {"this", "newslettersAgreed", "this", "newslettersAgreed", "this", "newslettersAgreed", "this", "newslettersAgreed"}, s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0"})
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f180404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f180405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f180406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f180407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f180408e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f180410g;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180408e = obj;
            this.f180410g |= Integer.MIN_VALUE;
            return a.this.F(false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.legal.model.manager.PrivacyManager", f = "PrivacyManager.kt", i = {}, l = {162}, m = "setPrivacyAgreement", n = {}, s = {})
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f180411a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f180413c;

        p(kotlin.coroutines.d<? super p> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f180411a = obj;
            this.f180413c |= Integer.MIN_VALUE;
            return a.this.G(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.legal.model.manager.PrivacyManager$trySaveUserAgreementsRemotely$2", f = "PrivacyManager.kt", i = {1, 2}, l = {139, androidx.media2.widget.f.i.f59773f0, androidx.media2.widget.f.i.f59775g0, 143}, m = "invokeSuspend", n = {"agreed", "agreed"}, s = {"I$0", "I$0"})
    static final class q extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f180415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Boolean f180416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f180417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ id.a f180418e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Boolean bool, a aVar, id.a aVar2, kotlin.coroutines.d<? super q> dVar) {
            super(2, dVar);
            this.f180416c = bool;
            this.f180417d = aVar;
            this.f180418e = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new q(this.f180416c, this.f180417d, this.f180418e, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x0095  */
        /* JADX WARN: Code duplicated, block: B:41:0x0096  */
        /* JADX WARN: Code duplicated, block: B:43:0x009b A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001a, B:15:0x0031, B:50:0x00cc, B:53:0x00d5, B:18:0x0039, B:43:0x009b, B:47:0x00ba, B:19:0x003d, B:30:0x0070, B:32:0x0076, B:38:0x0086, B:22:0x0045, B:24:0x0049, B:25:0x004f, B:27:0x0059), top: B:60:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:50:0x00cc A[Catch: all -> 0x001f, PHI: r1
          0x00cc: PHI (r1v8 ??) = (r1v7 ??), (r1v7 ??), (r1v10 ??) binds: [B:42:0x0099, B:48:0x00c9, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001a, B:15:0x0031, B:50:0x00cc, B:53:0x00d5, B:18:0x0039, B:43:0x009b, B:47:0x00ba, B:19:0x003d, B:30:0x0070, B:32:0x0076, B:38:0x0086, B:22:0x0045, B:24:0x0049, B:25:0x004f, B:27:0x0059), top: B:60:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00dd, code lost:
        
            if (r15.E(r3, true, r5, r14) == r0) goto L56;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v12 */
        /* JADX WARN: Type inference failed for: r15v18 */
        /* JADX WARN: Type inference failed for: r15v24 */
        /* JADX WARN: Type inference failed for: r15v9, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10, types: [int] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.legal.model.manager.a.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((q) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a(@NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull r0 userProperties, @NotNull w userAuthorization, @NotNull c2 networkStateUtility, @NotNull u1 logRecordManager) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(userProperties, "userProperties");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f180347c = preferences;
        this.f180348d = userProperties;
        this.f180349e = userAuthorization;
        this.f180350f = networkStateUtility;
        this.f180351g = logRecordManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r10 == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(id.a r9, kotlin.coroutines.d<? super java.lang.Boolean> r10) throws java.lang.Exception {
        /*
            r8 = this;
            java.lang.String r7 = "Androeed.ru"
            boolean r0 = r10 instanceof com.planner5d.library.legal.model.manager.a.l
            if (r0 == 0) goto L19
            r0 = r10
            r7 = 1
            com.planner5d.library.legal.model.manager.a$l r0 = (com.planner5d.library.legal.model.manager.a.l) r0
            int r1 = r0.f180396e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 4
            r3 = r1 & r2
            r7 = 5
            if (r3 == 0) goto L19
            r7 = 3
            int r1 = r1 - r2
            r0.f180396e = r1
            goto L20
        L19:
            r7 = 2
            com.planner5d.library.legal.model.manager.a$l r0 = new com.planner5d.library.legal.model.manager.a$l
            r7 = 6
            r0.<init>(r10)
        L20:
            r7 = 2
            java.lang.Object r10 = r0.f180394c
            r7 = 6
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f180396e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L50
            if (r2 == r4) goto L41
            r7 = 6
            if (r2 != r3) goto L37
            kotlin.ResultKt.m(r10)
            goto L87
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r7 = 6
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 4
            r8.<init>(r9)
            throw r8
        L41:
            java.lang.Object r8 = r0.f180393b
            r9 = r8
            r9 = r8
            r7 = 0
            id.a r9 = (id.a) r9
            java.lang.Object r8 = r0.f180392a
            com.planner5d.library.legal.model.manager.a r8 = (com.planner5d.library.legal.model.manager.a) r8
            kotlin.ResultKt.m(r10)
            goto L64
        L50:
            kotlin.ResultKt.m(r10)
            r7 = 6
            r0.f180392a = r8
            r0.f180393b = r9
            r0.f180396e = r4
            r7 = 0
            java.lang.Object r10 = r8.r(r0)
            r7 = 5
            if (r10 != r1) goto L64
            r7 = 5
            goto L86
        L64:
            r7 = 6
            com.planner5d.library.legal.model.manager.a$c r10 = (com.planner5d.library.legal.model.manager.a.c) r10
            if (r10 == 0) goto L94
            r7 = 2
            long r5 = r9.f287075a
            boolean r10 = r10.g(r5)
            if (r10 != r4) goto L94
            com.planner5d.library.modules.user.user.r0 r8 = r8.f180348d
            com.planner5d.library.services.r r10 = com.planner5d.library.services.r.privacyAgreed
            r2 = 0
            r7 = 3
            r0.f180392a = r2
            r7 = 0
            r0.f180393b = r2
            r0.f180396e = r3
            java.lang.Object r10 = r8.c(r9, r10, r0)
            r7 = 0
            if (r10 != r1) goto L87
        L86:
            return r1
        L87:
            r7 = 6
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r4)
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r8)
            r7 = 1
            if (r8 == 0) goto L94
            goto L96
        L94:
            r7 = 3
            r4 = 0
        L96:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.legal.model.manager.a.A(id.a, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object D(c cVar, kotlin.coroutines.d<? super Unit> dVar) {
        m mVar;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i10 = mVar.f180400d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f180400d = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar);
            }
        } else {
            mVar = new m(dVar);
        }
        Object obj = mVar.f180398b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = mVar.f180400d;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (cVar != null) {
                com.planner5d.library.model.manager.config.p pVar = this.f180347c;
                r rVar = r.legalAgreedUser;
                String string = cVar.h().toString();
                mVar.f180397a = cVar;
                mVar.f180400d = 1;
                if (pVar.d(rVar, string, mVar) == objL) {
                    return objL;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return Unit.f312394a;
    }

    public static /* synthetic */ Object I(a aVar, id.a aVar2, Boolean bool, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bool = null;
        }
        return aVar.H(aVar2, bool, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    /* JADX WARN: Code duplicated, block: B:53:0x0114  */
    /* JADX WARN: Code duplicated, block: B:55:0x0118 A[PHI: r0 r4 r8 r9 r10 r13
      0x0118: PHI (r0v8 long) = (r0v13 long), (r0v14 long) binds: [B:54:0x0115, B:51:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r4v6 java.util.Date) = (r4v8 java.util.Date), (r4v9 java.util.Date) binds: [B:54:0x0115, B:51:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r8v4 com.planner5d.library.legal.model.manager.a) = (r8v5 com.planner5d.library.legal.model.manager.a), (r8v6 com.planner5d.library.legal.model.manager.a) binds: [B:54:0x0115, B:51:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r9v5 id.a) = (r9v6 id.a), (r9v7 id.a) binds: [B:54:0x0115, B:51:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r10v1 boolean) = (r10v2 boolean), (r10v0 boolean) binds: [B:54:0x0115, B:51:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r13v4 com.planner5d.library.legal.model.manager.a) = (r13v5 com.planner5d.library.legal.model.manager.a), (r13v6 com.planner5d.library.legal.model.manager.a) binds: [B:54:0x0115, B:51:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0135  */
    /* JADX WARN: Code duplicated, block: B:64:0x0146  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0143, code lost:
    
        if (I(r4, r0, null, r7, 2, null) == r3) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(id.a r17, android.content.Context r18, kotlin.coroutines.d<? super java.lang.Boolean> r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.legal.model.manager.a.p(id.a, android.content.Context, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object r(kotlin.coroutines.d<? super c> dVar) {
        g gVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f180378c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f180378c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objU = gVar.f180376a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f180378c;
        if (i11 == 0) {
            ResultKt.m(objU);
            com.planner5d.library.model.manager.config.p pVar = this.f180347c;
            r rVar = r.legalAgreedUser;
            gVar.f180378c = 1;
            objU = pVar.u(rVar, null, gVar);
            if (objU == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objU);
        }
        String str = (String) objU;
        if (str != null) {
            return new c(new JSONObject(str));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object v(kotlin.coroutines.d<? super Boolean> dVar) {
        h hVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f180381c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f180381c = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object objY = hVar.f180379a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = hVar.f180381c;
        if (i11 == 0) {
            ResultKt.m(objY);
            hVar.f180381c = 1;
            objY = y(hVar);
            if (objY == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objY);
        }
        return kotlin.coroutines.jvm.internal.b.a(((Number) objY).intValue() >= 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(id.a aVar, Context context, kotlin.coroutines.d<? super Boolean> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.a(), new i(aVar, context, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object x(kotlin.coroutines.d<? super Boolean> dVar) {
        j jVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.f180388c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f180388c = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object objR = jVar.f180386a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = jVar.f180388c;
        boolean z10 = true;
        if (i11 == 0) {
            ResultKt.m(objR);
            if (!this.f180352h) {
                jVar.f180388c = 1;
                objR = r(jVar);
                if (objR == objL) {
                    return objL;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(objR);
        c cVar = (c) objR;
        if (!(cVar != null ? cVar.f() : false)) {
            z10 = false;
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(kotlin.coroutines.d<? super Integer> dVar) {
        return this.f180355k >= 5 ? kotlin.coroutines.jvm.internal.b.f(this.f180355k) : this.f180347c.p(r.legalAgreed, 0, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object z(id.a aVar, Context context, kotlin.coroutines.d<? super Boolean> dVar) {
        k kVar;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i10 = kVar.f180391c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f180391c = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(dVar);
            }
        } else {
            kVar = new k(dVar);
        }
        Object objP = kVar.f180389a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = kVar.f180391c;
        boolean zBooleanValue = true;
        try {
            if (i11 == 0) {
                ResultKt.m(objP);
                kVar.f180391c = 1;
                objP = p(aVar, context, kVar);
                if (objP == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objP);
            }
            zBooleanValue = ((Boolean) objP).booleanValue();
        } catch (Exception e10) {
            timber.log.b.f381052a.f(e10, "Failed to check if user agreed to terms and privacy. Treat as agree and proceed.", new Object[0]);
        }
        return kotlin.coroutines.jvm.internal.b.a(zBooleanValue);
    }

    public final void B() {
        this.f180354j = false;
    }

    public final void C() {
        this.f180352h = false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object E(@NotNull id.a aVar, boolean z10, boolean z11, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        n nVar;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i10 = nVar.f180403c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f180403c = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(dVar);
            }
        } else {
            nVar = new n(dVar);
        }
        Object obj = nVar.f180401a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = nVar.f180403c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                r0 r0Var = this.f180348d;
                Map<r, Boolean> mapMapOf = MapsKt.mapOf(TuplesKt.to(r.privacyAgreed, kotlin.coroutines.jvm.internal.b.a(z10)), TuplesKt.to(r.newslettersAgreed, kotlin.coroutines.jvm.internal.b.a(z11)));
                nVar.f180403c = 1;
                if (r0Var.a(aVar, mapMapOf, nVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        } catch (Exception e10) {
            timber.log.b.f381052a.f(e10, "Failed to save agreements", new Object[0]);
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object F(boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        o oVar;
        boolean z11;
        a aVar;
        boolean z12;
        boolean z13;
        boolean z14;
        a aVar2;
        a aVar3;
        c cVar;
        c cVarE;
        a aVar4;
        boolean z15;
        a aVar5 = this;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i10 = oVar.f180410g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f180410g = i10 - Integer.MIN_VALUE;
            } else {
                oVar = aVar5.new o(dVar);
            }
        } else {
            oVar = aVar5.new o(dVar);
        }
        Object objX = oVar.f180408e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = oVar.f180410g;
        if (i11 == 0) {
            ResultKt.m(objX);
            aVar5.f180355k = 5;
            com.planner5d.library.model.manager.config.p pVar = aVar5.f180347c;
            r rVar = r.legalAgreed;
            oVar.f180404a = aVar5;
            z11 = z10;
            oVar.f180406c = z11;
            oVar.f180410g = 1;
            if (pVar.t(rVar, 5, oVar) != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            boolean z16 = oVar.f180406c;
            a aVar6 = (a) oVar.f180404a;
            ResultKt.m(objX);
            z11 = z16;
            aVar5 = aVar6;
        } else {
            if (i11 == 2) {
                z12 = oVar.f180407d;
                z13 = oVar.f180406c;
                aVar = (a) oVar.f180404a;
                ResultKt.m(objX);
                if (z12 != ((Boolean) objX).booleanValue()) {
                    oVar.f180404a = aVar;
                    oVar.f180405b = aVar;
                    oVar.f180406c = z13;
                    oVar.f180410g = 3;
                    objX = aVar.r(oVar);
                    if (objX != objL) {
                        z14 = z13;
                        aVar2 = aVar;
                        aVar3 = aVar2;
                        cVar = (c) objX;
                        if (cVar != null) {
                            cVarE = c.e(cVar, 0L, null, z14, 3, null);
                        } else {
                            cVarE = null;
                        }
                        oVar.f180404a = aVar3;
                        oVar.f180405b = null;
                        oVar.f180406c = z14;
                        oVar.f180410g = 4;
                        if (aVar2.D(cVarE, oVar) != objL) {
                            aVar4 = aVar3;
                            z15 = z14;
                        }
                    }
                    return objL;
                }
                aVar.f180353i = true;
                aVar.f180352h = z13;
                aVar.f180354j = true;
                return Unit.f312394a;
            }
            if (i11 == 3) {
                boolean z17 = oVar.f180406c;
                aVar2 = (a) oVar.f180405b;
                aVar3 = (a) oVar.f180404a;
                ResultKt.m(objX);
                z14 = z17;
                cVar = (c) objX;
                if (cVar != null) {
                    cVarE = c.e(cVar, 0L, null, z14, 3, null);
                } else {
                    cVarE = null;
                }
                oVar.f180404a = aVar3;
                oVar.f180405b = null;
                oVar.f180406c = z14;
                oVar.f180410g = 4;
                if (aVar2.D(cVarE, oVar) != objL) {
                    aVar4 = aVar3;
                    z15 = z14;
                }
                return objL;
            }
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z15 = oVar.f180406c;
            aVar4 = (a) oVar.f180404a;
            ResultKt.m(objX);
        }
        z13 = z15;
        aVar = aVar4;
        aVar.f180353i = true;
        aVar.f180352h = z13;
        aVar.f180354j = true;
        return Unit.f312394a;
        oVar.f180404a = aVar5;
        oVar.f180406c = z11;
        oVar.f180407d = z11;
        oVar.f180410g = 2;
        objX = aVar5.x(oVar);
        if (objX != objL) {
            aVar = aVar5;
            z12 = z11;
            z13 = z12;
            if (z12 != ((Boolean) objX).booleanValue()) {
                oVar.f180404a = aVar;
                oVar.f180405b = aVar;
                oVar.f180406c = z13;
                oVar.f180410g = 3;
                objX = aVar.r(oVar);
                if (objX != objL) {
                    z14 = z13;
                    aVar2 = aVar;
                    aVar3 = aVar2;
                    cVar = (c) objX;
                    if (cVar != null) {
                        cVarE = c.e(cVar, 0L, null, z14, 3, null);
                    } else {
                        cVarE = null;
                    }
                    oVar.f180404a = aVar3;
                    oVar.f180405b = null;
                    oVar.f180406c = z14;
                    oVar.f180410g = 4;
                    if (aVar2.D(cVarE, oVar) != objL) {
                        aVar4 = aVar3;
                        z15 = z14;
                        z13 = z15;
                        aVar = aVar4;
                    }
                }
            }
            aVar.f180353i = true;
            aVar.f180352h = z13;
            aVar.f180354j = true;
            return Unit.f312394a;
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object G(@NotNull id.a aVar, boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        p pVar;
        if (dVar instanceof p) {
            pVar = (p) dVar;
            int i10 = pVar.f180413c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.f180413c = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(dVar);
            }
        } else {
            pVar = new p(dVar);
        }
        Object obj = pVar.f180411a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = pVar.f180413c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                r0 r0Var = this.f180348d;
                Map<r, Boolean> mapMapOf = MapsKt.mapOf(TuplesKt.to(r.privacyAgreed, kotlin.coroutines.jvm.internal.b.a(z10)));
                pVar.f180413c = 1;
                if (r0Var.a(aVar, mapMapOf, pVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        } catch (Exception e10) {
            timber.log.b.f381052a.f(e10, "Failed to save privacy agreement", new Object[0]);
            throw e10;
        }
    }

    @Nullable
    public final Object H(@NotNull id.a aVar, @Nullable Boolean bool, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(s.f229729a.d(), new q(bool, this, aVar, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c6 A[Catch: JSONException -> 0x00da, PHI: r13
      0x00c6: PHI (r13v1 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object>) = 
      (r13v0 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object>)
      (r13v0 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object>)
      (r13v0 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object>)
      (r13v4 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object>)
     binds: [B:30:0x0092, B:32:0x009c, B:36:0x00bb, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {JSONException -> 0x00da, blocks: (B:14:0x0035, B:19:0x004c, B:40:0x00c6, B:29:0x006b, B:31:0x0094, B:33:0x009e, B:35:0x00ac, B:38:0x00be, B:39:0x00c5), top: B:47:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        if (r13.invoke(r4) == r0) goto L42;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(@org.jetbrains.annotations.NotNull id.a r10, boolean r11, @org.jetbrains.annotations.NotNull org.json.JSONObject r12, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object> r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r14) throws com.planner5d.library.modules.user.user.f1 {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.legal.model.manager.a.q(id.a, boolean, org.json.JSONObject, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public final Object t(@NotNull EnumC1566a enumC1566a, @Nullable id.a aVar, @NotNull Context context, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        int i10 = d.f180363a[enumC1566a.ordinal()];
        if (i10 == 1) {
            return w(aVar, context, dVar);
        }
        int i11 = 6 & 2;
        if (i10 == 2) {
            return v(dVar);
        }
        throw new k0();
    }

    public final boolean u() {
        return this.f180353i;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f180360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Date f180361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f180362c;

        public c(long j10, @NotNull Date expire, boolean z10) {
            Intrinsics.checkNotNullParameter(expire, "expire");
            this.f180360a = j10;
            this.f180361b = expire;
            this.f180362c = z10;
        }

        private final long a() {
            return this.f180360a;
        }

        private final Date b() {
            return this.f180361b;
        }

        public static /* synthetic */ c e(c cVar, long j10, Date date, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = cVar.f180360a;
            }
            if ((i10 & 2) != 0) {
                date = cVar.f180361b;
            }
            if ((i10 & 4) != 0) {
                z10 = cVar.f180362c;
            }
            return cVar.d(j10, date, z10);
        }

        public final boolean c() {
            return this.f180362c;
        }

        @NotNull
        public final c d(long j10, @NotNull Date expire, boolean z10) {
            Intrinsics.checkNotNullParameter(expire, "expire");
            return new c(j10, expire, z10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f180360a == cVar.f180360a && Intrinsics.areEqual(this.f180361b, cVar.f180361b) && this.f180362c == cVar.f180362c;
        }

        public final boolean f() {
            return this.f180362c;
        }

        public final boolean g(long j10) {
            return j10 == this.f180360a && new Date().getTime() < this.f180361b.getTime();
        }

        @NotNull
        public final JSONObject h() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userId", this.f180360a);
            jSONObject.put("expire", this.f180361b.getTime());
            jSONObject.put("newslettersAgreed", this.f180362c);
            return jSONObject;
        }

        public int hashCode() {
            return (((Long.hashCode(this.f180360a) * 31) + this.f180361b.hashCode()) * 31) + Boolean.hashCode(this.f180362c);
        }

        @NotNull
        public String toString() {
            return "UserAgreement(userId=" + this.f180360a + ", expire=" + this.f180361b + ", newslettersAgreed=" + this.f180362c + ")";
        }

        public c(@NotNull JSONObject json) throws JSONException {
            boolean z10;
            Intrinsics.checkNotNullParameter(json, "json");
            long j10 = json.getLong("userId");
            Date date = new Date(json.getLong("expire"));
            try {
                z10 = json.getBoolean("newslettersAgreed");
            } catch (JSONException unused) {
                z10 = false;
            }
            this(j10, date, z10);
        }
    }
}
