package com.planner5d.library.aichat.view.bottomsheet;

import android.app.Application;
import android.content.res.Resources;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.w0;
import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import com.planner5d.library.aichat.command.AiChatCommand;
import com.planner5d.library.aichat.command.AiChatResponseMessage;
import com.planner5d.library.model.manager.statistics.events.i3;
import com.planner5d.library.modules.user.user.u0;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.r3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAiChatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiChatViewModel.kt\ncom/planner5d/library/aichat/view/bottomsheet/AiChatViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,331:1\n1#2:332\n1863#3,2:333\n1863#3,2:335\n1557#3:337\n1628#3,3:338\n*S KotlinDebug\n*F\n+ 1 AiChatViewModel.kt\ncom/planner5d/library/aichat/view/bottomsheet/AiChatViewModel\n*L\n159#1:333,2\n278#1:335,2\n327#1:337\n327#1:338,3\n*E\n"})
public final class t extends f2 {

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    public static final a f142073h3 = new a(null);

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    public static final String f142074i3 = "I selected";

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private static final List<Integer> f142075j3;

    @NotNull
    private final w0<com.planner5d.library.services.utility.o<Boolean>> H1;
    private int X;

    @NotNull
    private final w0<List<d0>> Y;

    @NotNull
    private final w0<Boolean> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ya.a f142076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Application f142077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final va.b f142078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.h f142079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final i3 f142080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final va.c f142081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.w f142082g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private final w0<com.planner5d.library.services.utility.o<Boolean>> f142083g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final u0 f142084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final ua.a f142085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private p2 f142086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f142087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final c1<List<d0>> f142088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final c1<List<Pair<Integer, String>>> f142089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.services.utility.o<Boolean>> f142090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.services.utility.o<Boolean>> f142091o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final w0<List<Pair<Integer, String>>> f142092p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final w0<com.planner5d.library.services.utility.o<Boolean>> f142093p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final w0<com.planner5d.library.services.utility.o<Boolean>> f142094p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.services.utility.o<Boolean>> f142095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.services.utility.o<Boolean>> f142096t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f142097v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private String f142098w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private enum b {
        RoomAIDesigner(1001),
        AddDecorToSelectedRoom(1004),
        ChangeMaterialsOfSelection(1005);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f142103f = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f142104a;

        b(int i10) {
            this.f142104a = i10;
        }

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f142103f;
        }

        public final int n() {
            return this.f142104a;
        }
    }

    public static final class c implements va.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AiChatResponseMessage f142106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f142107c;

        c(AiChatResponseMessage aiChatResponseMessage, boolean z10) {
            this.f142106b = aiChatResponseMessage;
            this.f142107c = z10;
        }

        @kotlin.l(message = "Use json instead", replaceWith = @b1(expression = PeopleCardEntry.json, imports = {}))
        public static /* synthetic */ void b() {
        }

        @Override // va.b.a
        public Boolean a() {
            return Boolean.valueOf(this.f142107c);
        }

        @Override // va.b.a
        public String getJson() {
            return t.this.f142085i.b(this.f142106b);
        }

        @Override // va.b.a
        public String getText() {
            return "";
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.aichat.view.bottomsheet.AiChatViewModel", f = "AiChatViewModel.kt", i = {0, 0}, l = {295, 300}, m = "createConversationId", n = {"this", "projectId"}, s = {"L$0", "J$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f142108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f142109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f142110c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142112e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f142110c = obj;
            this.f142112e |= Integer.MIN_VALUE;
            return t.this.s0(0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.aichat.view.bottomsheet.AiChatViewModel$getReply$1", f = "AiChatViewModel.kt", i = {}, l = {228, 228}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142113a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f142115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i1.h<Integer> f142116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ta.a f142117e;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f142118a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1.h<Integer> f142119b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ta.a f142120c;

            /* JADX INFO: renamed from: com.planner5d.library.aichat.view.bottomsheet.t$e$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.aichat.view.bottomsheet.AiChatViewModel$getReply$1$1$1", f = "AiChatViewModel.kt", i = {1}, l = {236, com.planner5d.library.engine.input.f.b.P1}, m = "invokeSuspend", n = {"hashCode"}, s = {"I$0"})
            static final class C1509a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f142121a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f142122b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ AiChatResponseMessage f142123c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ t f142124d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ i1.h<Integer> f142125e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ ta.a f142126f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1509a(AiChatResponseMessage aiChatResponseMessage, t tVar, i1.h<Integer> hVar, ta.a aVar, kotlin.coroutines.d<? super C1509a> dVar) {
                    super(2, dVar);
                    this.f142123c = aiChatResponseMessage;
                    this.f142124d = tVar;
                    this.f142125e = hVar;
                    this.f142126f = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C1509a(this.f142123c, this.f142124d, this.f142125e, this.f142126f, dVar);
                }

                /* JADX WARN: Code duplicated, block: B:20:0x00b7  */
                /* JADX WARN: Code duplicated, block: B:22:0x00c1  */
                /* JADX WARN: Code duplicated, block: B:23:0x00c3  */
                /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
                /* JADX WARN: Code duplicated, block: B:30:0x00db  */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x00c7, code lost:
                
                    if (r1 != r2.intValue()) goto L25;
                 */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    /*
                        Method dump skipped, instruction units count: 235
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.aichat.view.bottomsheet.t.e.a.C1509a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C1509a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            a(t tVar, i1.h<Integer> hVar, ta.a aVar) {
                this.f142118a = tVar;
                this.f142119b = hVar;
                this.f142120c = aVar;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AiChatResponseMessage aiChatResponseMessage, kotlin.coroutines.d<? super Unit> dVar) {
                if (aiChatResponseMessage == null) {
                    return Unit.f312394a;
                }
                timber.log.b.f381052a.H("AiChat").u("Received message : %s", aiChatResponseMessage.toString());
                Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.a(), new C1509a(aiChatResponseMessage, this.f142118a, this.f142119b, this.f142120c, null), dVar);
                return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, i1.h<Integer> hVar, ta.a aVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f142115c = str;
            this.f142116d = hVar;
            this.f142117e = aVar;
            int i10 = 2 >> 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new e(this.f142115c, this.f142116d, this.f142117e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L16;
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
                int r1 = r7.f142113a
                r6 = 7
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                r6 = 4
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L14
                kotlin.ResultKt.m(r8)
                goto L56
            L14:
                r6 = 0
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "ooson/s/otieu /r rweihlrie/l  ate/kt/ bvoc/cu/nem e"
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1f:
                kotlin.ResultKt.m(r8)
                r6 = 1
                goto L3b
            L24:
                kotlin.ResultKt.m(r8)
                com.planner5d.library.aichat.view.bottomsheet.t r8 = com.planner5d.library.aichat.view.bottomsheet.t.this
                ya.a r8 = com.planner5d.library.aichat.view.bottomsheet.t.X(r8)
                r6 = 3
                java.lang.String r1 = r7.f142115c
                r6 = 2
                r7.f142113a = r3
                java.lang.Object r8 = r8.a(r1, r7)
                r6 = 2
                if (r8 != r0) goto L3b
                goto L55
            L3b:
                kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
                kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.k.u(r8)
                com.planner5d.library.aichat.view.bottomsheet.t$e$a r1 = new com.planner5d.library.aichat.view.bottomsheet.t$e$a
                com.planner5d.library.aichat.view.bottomsheet.t r3 = com.planner5d.library.aichat.view.bottomsheet.t.this
                r6 = 3
                kotlin.jvm.internal.i1$h<java.lang.Integer> r4 = r7.f142116d
                ta.a r5 = r7.f142117e
                r1.<init>(r3, r4, r5)
                r7.f142113a = r2
                java.lang.Object r7 = r8.collect(r1, r7)
                if (r7 != r0) goto L56
            L55:
                return r0
            L56:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.aichat.view.bottomsheet.t.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.aichat.view.bottomsheet.AiChatViewModel$loadChat$1", f = "AiChatViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160717p0, com.planner5d.library.engine.input.f.b.B0}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f142127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f142128b;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            t tVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142128b;
            if (i10 == 0) {
                ResultKt.m(obj);
                t tVar2 = t.this;
                long j10 = tVar2.f142097v;
                this.f142128b = 1;
                if (tVar2.s0(j10, this) == objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                ResultKt.m(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = (t) this.f142127a;
                ResultKt.m(obj);
            }
            tVar.p0((List) obj);
            return Unit.f312394a;
            t tVar3 = t.this;
            va.b bVar = tVar3.f142078c;
            long j11 = t.this.f142097v;
            this.f142127a = tVar3;
            this.f142128b = 2;
            Object objA = bVar.a(j11, this);
            if (objA != objL) {
                obj = objA;
                tVar = tVar3;
                tVar.p0((List) obj);
                return Unit.f312394a;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.aichat.view.bottomsheet.AiChatViewModel$loadSuggestions$1", f = "AiChatViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142130a;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f142130a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            List<Pair<Integer, String>> listB = t.this.f142079d.b();
            if (listB != null) {
                t.this.f142089m.r(listB);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.aichat.view.bottomsheet.AiChatViewModel", f = "AiChatViewModel.kt", i = {0, 0}, l = {177}, m = "sendAndGetReply", n = {"this", "aiChatCommandsExecutor"}, s = {"L$0", "L$1"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f142132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f142133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f142134c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142136e;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f142134c = obj;
            this.f142136e |= Integer.MIN_VALUE;
            return t.this.M0(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.aichat.view.bottomsheet.AiChatViewModel$sendMessage$1", f = "AiChatViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160733u1, 105}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142137a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f142139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f142140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ xa.c f142141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ta.a f142142f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, boolean z10, xa.c cVar, ta.a aVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f142139c = str;
            this.f142140d = z10;
            this.f142141e = cVar;
            this.f142142f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t.this.new i(this.f142139c, this.f142140d, this.f142141e, this.f142142f, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
        
            if (r15.M0(r1, r3, r4, r14) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r13 = 7
                int r1 = r14.f142137a
                r2 = 2
                r3 = 1
                r13 = 2
                if (r1 == 0) goto L26
                r13 = 0
                if (r1 == r3) goto L20
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r15)
                goto L80
            L15:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                r13 = 4
                java.lang.String r15 = "r/slee e /i//t obte/wn ooofkcehruv nr/ lmiuoesi/cat"
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L20:
                r13 = 4
                kotlin.ResultKt.m(r15)
                r13 = 2
                goto L61
            L26:
                kotlin.ResultKt.m(r15)
                r13 = 3
                com.planner5d.library.aichat.view.bottomsheet.t r15 = com.planner5d.library.aichat.view.bottomsheet.t.this
                com.planner5d.library.model.manager.statistics.events.i3 r15 = com.planner5d.library.aichat.view.bottomsheet.t.c0(r15)
                r13 = 1
                com.planner5d.library.model.manager.statistics.events.i3$a r1 = com.planner5d.library.model.manager.statistics.events.i3.a.message_send
                r15.V(r1)
                com.planner5d.library.aichat.view.bottomsheet.t r15 = com.planner5d.library.aichat.view.bottomsheet.t.this
                java.lang.String r1 = r14.f142139c
                boolean r4 = r14.f142140d
                com.planner5d.library.aichat.view.bottomsheet.t.U(r15, r1, r4)
                com.planner5d.library.aichat.view.bottomsheet.t r15 = com.planner5d.library.aichat.view.bottomsheet.t.this
                r13 = 3
                com.planner5d.library.aichat.command.AiChatResponseMessage r4 = new com.planner5d.library.aichat.command.AiChatResponseMessage
                java.lang.String r5 = r14.f142139c
                r13 = 2
                r11 = 62
                r12 = 0
                r6 = 0
                r13 = r6
                r7 = 0
                r13 = 4
                r8 = 0
                r13 = 3
                r9 = 0
                r10 = 0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                boolean r1 = r14.f142140d
                r14.f142137a = r3
                java.lang.Object r15 = com.planner5d.library.aichat.view.bottomsheet.t.j0(r15, r4, r1, r14)
                r13 = 3
                if (r15 != r0) goto L61
                goto L7f
            L61:
                r13 = 2
                com.planner5d.library.aichat.view.bottomsheet.t r15 = com.planner5d.library.aichat.view.bottomsheet.t.this
                com.planner5d.library.services.r r1 = com.planner5d.library.services.r.chatLoadingMessage
                java.lang.String r1 = r1.f224891a
                r13 = 3
                com.planner5d.library.aichat.view.bottomsheet.t.U(r15, r1, r3)
                com.planner5d.library.aichat.view.bottomsheet.t r15 = com.planner5d.library.aichat.view.bottomsheet.t.this
                java.lang.String r1 = r14.f142139c
                xa.c r3 = r14.f142141e
                r13 = 3
                ta.a r4 = r14.f142142f
                r13 = 5
                r14.f142137a = r2
                java.lang.Object r14 = com.planner5d.library.aichat.view.bottomsheet.t.k0(r15, r1, r3, r4, r14)
                r13 = 0
                if (r14 != r0) goto L80
            L7f:
                return r0
            L80:
                kotlin.Unit r14 = kotlin.Unit.f312394a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.aichat.view.bottomsheet.t.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        kotlin.enums.a<b> aVarL = b.l();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(aVarL, 10));
        Iterator<b> it = aVarL.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().n()));
        }
        f142075j3 = arrayList;
    }

    @ij.a
    public t(@NotNull ya.a aiChatUseCase, @NotNull Application application, @NotNull va.b chatRepository, @NotNull com.planner5d.library.model.manager.h configManagerService, @NotNull i3 events, @NotNull va.c projectConversationRepository, @NotNull com.planner5d.library.modules.user.user.w userAuthorizationService, @NotNull u0 userPurchases, @NotNull ua.a converter) {
        Intrinsics.checkNotNullParameter(aiChatUseCase, "aiChatUseCase");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(configManagerService, "configManagerService");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(projectConversationRepository, "projectConversationRepository");
        Intrinsics.checkNotNullParameter(userAuthorizationService, "userAuthorizationService");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f142076a = aiChatUseCase;
        this.f142077b = application;
        this.f142078c = chatRepository;
        this.f142079d = configManagerService;
        this.f142080e = events;
        this.f142081f = projectConversationRepository;
        this.f142082g = userAuthorizationService;
        this.f142084h = userPurchases;
        this.f142085i = converter;
        Boolean bool = Boolean.FALSE;
        c1<Boolean> c1Var = new c1<>(bool);
        this.f142087k = c1Var;
        c1<List<d0>> c1Var2 = new c1<>(new ArrayList());
        this.f142088l = c1Var2;
        c1<List<Pair<Integer, String>>> c1Var3 = new c1<>(new ArrayList());
        this.f142089m = c1Var3;
        c1<com.planner5d.library.services.utility.o<Boolean>> c1Var4 = new c1<>(new com.planner5d.library.services.utility.o(bool));
        this.f142090n = c1Var4;
        c1<com.planner5d.library.services.utility.o<Boolean>> c1Var5 = new c1<>(new com.planner5d.library.services.utility.o(bool));
        this.f142091o = c1Var5;
        c1<com.planner5d.library.services.utility.o<Boolean>> c1Var6 = new c1<>(new com.planner5d.library.services.utility.o(bool));
        this.f142095s = c1Var6;
        c1<com.planner5d.library.services.utility.o<Boolean>> c1Var7 = new c1<>(new com.planner5d.library.services.utility.o(bool));
        this.f142096t = c1Var7;
        this.f142098w = "";
        Intrinsics.checkNotNull(c1Var2, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.collections.List<com.planner5d.library.aichat.view.bottomsheet.Message>>");
        this.Y = c1Var2;
        this.Z = c1Var;
        this.f142092p0 = c1Var3;
        this.f142093p1 = c1Var5;
        this.H1 = c1Var6;
        this.f142094p2 = c1Var7;
        this.f142083g3 = c1Var4;
    }

    private final void A0(String str, ta.a aVar) {
        this.f142086j = kotlinx.coroutines.k.f(t0.a(com.planner5d.library.services.utility.s.f229729a.h()), null, null, new e(str, new i1.h(), aVar, null), 3, null);
    }

    private final <T> void G0(c1<T> c1Var) {
        c1Var.o(c1Var.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(int i10, String str) {
        List<d0> listF;
        d0 d0Var;
        this.f142090n.o(new com.planner5d.library.services.utility.o<>(Boolean.valueOf(f142075j3.contains(Integer.valueOf(i10)))));
        if (str == null || (listF = this.f142088l.f()) == null || (d0Var = (d0) CollectionsKt.last((List) listF)) == null) {
            return;
        }
        d0Var.c().s(str);
        R0(d0Var.c());
    }

    private final void I0() {
        List<d0> listF = this.f142088l.f();
        if (listF != null) {
            if (listF.isEmpty() || !Intrinsics.areEqual(((d0) CollectionsKt.last((List) listF)).c().n(), com.planner5d.library.services.r.chatLoadingMessage.f224891a)) {
                listF = null;
            }
            if (listF != null) {
                this.f142088l.r(CollectionsKt.toMutableList((Collection) CollectionsKt.dropLast(listF, 1)));
                G0(this.f142088l);
            }
        }
    }

    private final void J0() {
        List<d0> listF = this.f142088l.f();
        if (listF != null) {
            listF.clear();
        }
        this.f142098w = "";
        this.X = 0;
        G0(this.f142088l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K0(kotlin.coroutines.d<? super Unit> dVar) {
        Object objL0;
        List<d0> listF = this.f142088l.f();
        if (listF != null) {
            if (listF.isEmpty()) {
                listF = null;
            }
            if (listF != null && (objL0 = L0(listF.get(CollectionsKt.getLastIndex(listF)).c(), true, dVar)) == kotlin.coroutines.intrinsics.b.l()) {
                return objL0;
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L0(AiChatResponseMessage aiChatResponseMessage, boolean z10, kotlin.coroutines.d<? super Unit> dVar) {
        Object objF = this.f142078c.f(this.f142097v, r0(aiChatResponseMessage, z10), dVar);
        return objF == kotlin.coroutines.intrinsics.b.l() ? objF : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x007b A[Catch: Exception -> 0x00a7, TryCatch #1 {Exception -> 0x00a7, blocks: (B:23:0x0077, B:25:0x007b, B:27:0x00a3, B:30:0x00a9, B:31:0x00ad, B:32:0x00b8, B:20:0x0058), top: B:45:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a3 A[Catch: Exception -> 0x00a7, TryCatch #1 {Exception -> 0x00a7, blocks: (B:23:0x0077, B:25:0x007b, B:27:0x00a3, B:30:0x00a9, B:31:0x00ad, B:32:0x00b8, B:20:0x0058), top: B:45:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9 A[Catch: Exception -> 0x00a7, TryCatch #1 {Exception -> 0x00a7, blocks: (B:23:0x0077, B:25:0x007b, B:27:0x00a3, B:30:0x00a9, B:31:0x00ad, B:32:0x00b8, B:20:0x0058), top: B:45:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad A[Catch: Exception -> 0x00a7, TryCatch #1 {Exception -> 0x00a7, blocks: (B:23:0x0077, B:25:0x007b, B:27:0x00a3, B:30:0x00a9, B:31:0x00ad, B:32:0x00b8, B:20:0x0058), top: B:45:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x007b, please report this as an issue */
    public final Object M0(String str, xa.c cVar, ta.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        h hVar;
        ta.a aVar2;
        Object objB;
        Resources resources;
        String string;
        String str2;
        t tVar = this;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f142136e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f142136e = i10 - Integer.MIN_VALUE;
            } else {
                hVar = tVar.new h(dVar);
            }
        } else {
            hVar = tVar.new h(dVar);
        }
        h hVar2 = hVar;
        Object obj = hVar2.f142134c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = hVar2.f142136e;
        if (i11 == 0) {
            ResultKt.m(obj);
            tVar.f142087k.r(kotlin.coroutines.jvm.internal.b.a(true));
            try {
                ya.a aVar3 = tVar.f142076a;
                ta.c cVar2 = ta.c.editor;
                String str3 = tVar.f142098w;
                List<ta.b> listQ0 = tVar.q0(cVar);
                hVar2.f142132a = tVar;
                aVar2 = aVar;
                hVar2.f142133b = aVar2;
                hVar2.f142136e = 1;
                objB = aVar3.b(cVar2, str3, str, listQ0, hVar2);
                if (objB == objL) {
                    return objL;
                }
                str2 = (String) objB;
                if (str2 != null) {
                    throw new ErrorMessageException(sa.b.q.R8, "");
                }
                timber.log.b.f381052a.a("chat id: " + str2, new Object[0]);
                if (Intrinsics.areEqual(tVar.f142087k.f(), kotlin.coroutines.jvm.internal.b.a(true))) {
                    tVar.A0(str2, aVar2);
                } else {
                    tVar.Q0();
                }
            } catch (Exception e10) {
                e = e10;
                tVar.f142087k.r(kotlin.coroutines.jvm.internal.b.a(false));
                resources = tVar.f142077b.getResources();
                if (resources != null) {
                    string = "Error";
                } else {
                    string = "Error";
                }
                tVar.R0(new AiChatResponseMessage(string, null, null, null, 0, null, 62, null));
                timber.log.b.f381052a.e(e);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ta.a aVar4 = (ta.a) hVar2.f142133b;
            t tVar2 = (t) hVar2.f142132a;
            try {
                ResultKt.m(obj);
                objB = obj;
                aVar2 = aVar4;
                tVar = tVar2;
                str2 = (String) objB;
                if (str2 != null) {
                    throw new ErrorMessageException(sa.b.q.R8, "");
                }
                timber.log.b.f381052a.a("chat id: " + str2, new Object[0]);
                if (Intrinsics.areEqual(tVar.f142087k.f(), kotlin.coroutines.jvm.internal.b.a(true))) {
                    tVar.A0(str2, aVar2);
                } else {
                    tVar.Q0();
                }
            } catch (Exception e11) {
                e = e11;
                tVar = tVar2;
                tVar.f142087k.r(kotlin.coroutines.jvm.internal.b.a(false));
                resources = tVar.f142077b.getResources();
                if (resources != null || (string = resources.getString(sa.b.q.R8, "")) == null) {
                    string = "Error";
                }
                tVar.R0(new AiChatResponseMessage(string, null, null, null, 0, null, 62, null));
                timber.log.b.f381052a.e(e);
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0(AiChatResponseMessage aiChatResponseMessage) {
        List<AiChatCommand> listI = aiChatResponseMessage.i();
        if (listI.isEmpty()) {
            return;
        }
        for (AiChatCommand aiChatCommand : listI) {
            if (Intrinsics.areEqual(aiChatCommand.g(), com.planner5d.library.services.r.aiChatCommandCloseChat.f224891a)) {
                this.f142095s.r(new com.planner5d.library.services.utility.o<>(Boolean.TRUE));
            }
            if (Intrinsics.areEqual(aiChatCommand.i(), f142074i3)) {
                this.f142091o.r(new com.planner5d.library.services.utility.o<>(Boolean.TRUE));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0() {
        d0 d0Var;
        r3<Boolean> r3VarB;
        com.planner5d.library.services.utility.o<Boolean> oVarF = this.f142090n.f();
        if (oVarF != null && (r3VarB = oVarF.b()) != null && r3VarB.a().booleanValue()) {
            this.f142096t.r(new com.planner5d.library.services.utility.o<>(Boolean.TRUE));
            this.f142090n.r(new com.planner5d.library.services.utility.o<>(Boolean.FALSE));
        }
        List<d0> listF = this.f142088l.f();
        if (listF == null || (d0Var = (d0) CollectionsKt.lastOrNull((List) listF)) == null || !Intrinsics.areEqual(d0Var.c().n(), com.planner5d.library.services.r.chatLoadingMessage.f224891a)) {
            return;
        }
        I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R0(AiChatResponseMessage aiChatResponseMessage) {
        List<d0> listF;
        if ((aiChatResponseMessage.n().length() == 0 && aiChatResponseMessage.i().isEmpty()) || (listF = this.f142088l.f()) == null) {
            return;
        }
        if (listF.isEmpty()) {
            listF = null;
        }
        if (listF != null) {
            listF.set(CollectionsKt.getLastIndex(listF), new d0(listF.get(CollectionsKt.getLastIndex(listF)).b(), aiChatResponseMessage, true));
            G0(this.f142088l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(String str, boolean z10) {
        List<d0> listF = this.f142088l.f();
        if (listF != null) {
            int i10 = this.X;
            this.X = i10 + 1;
            listF.add(new d0(i10, new AiChatResponseMessage(str, null, null, null, 0, null, 62, null), z10));
        }
        G0(this.f142088l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(List<? extends va.b.a> list) {
        List<d0> listF = this.f142088l.f();
        if (listF != null) {
            for (va.b.a aVar : list) {
                String json = aVar.getJson();
                if (json != null) {
                    AiChatResponseMessage aiChatResponseMessageA = this.f142085i.a(json);
                    if (aiChatResponseMessageA != null) {
                        int i10 = this.X;
                        this.X = i10 + 1;
                        Boolean boolA = aVar.a();
                        listF.add(new d0(i10, aiChatResponseMessageA, boolA != null ? boolA.booleanValue() : false));
                    }
                } else {
                    int i11 = this.X;
                    this.X = i11 + 1;
                    AiChatResponseMessage aiChatResponseMessage = new AiChatResponseMessage(aVar.getText(), null, null, null, 0, null, 62, null);
                    Boolean boolA2 = aVar.a();
                    listF.add(new d0(i11, aiChatResponseMessage, boolA2 != null ? boolA2.booleanValue() : false));
                }
            }
            this.f142088l.r(listF);
        }
    }

    private final List<ta.b> q0(xa.c cVar) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (cVar != null) {
            String str = com.planner5d.library.services.r.attachmentFileNameProject.f224891a;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.attachmentFileTypeJson;
            arrayList.add(new ta.b(str, rVar.f224891a, cVar.a()));
            List<String> listB = cVar.b();
            if (listB != null) {
                JSONObject jSONObject = new JSONObject();
                com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.attachmentFileNameSelection;
                jSONObject.put(rVar2.f224891a, k1.D(listB));
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                arrayList.add(new ta.b(rVar2.f224891a, rVar.f224891a, string));
            }
        }
        String str2 = com.planner5d.library.services.r.attachmentFileNameUserInfo.f224891a;
        String str3 = com.planner5d.library.services.r.attachmentFileTypeJson.f224891a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(com.planner5d.library.services.r.paidUser.f224891a, this.f142084h.j());
        Unit unit = Unit.f312394a;
        String string2 = jSONObject2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        arrayList.add(new ta.b(str2, str3, string2));
        return arrayList;
    }

    private final va.b.a r0(AiChatResponseMessage aiChatResponseMessage, boolean z10) {
        return new c(aiChatResponseMessage, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (r1.e(r2, r4, r10, r6) == r0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s0(long r11, kotlin.coroutines.d<? super java.lang.Boolean> r13) {
        /*
            r10 = this;
            r9 = 7
            boolean r0 = r13 instanceof com.planner5d.library.aichat.view.bottomsheet.t.d
            if (r0 == 0) goto L1b
            r0 = r13
            r9 = 3
            com.planner5d.library.aichat.view.bottomsheet.t$d r0 = (com.planner5d.library.aichat.view.bottomsheet.t.d) r0
            int r1 = r0.f142112e
            r9 = 5
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 2
            r3 = r1 & r2
            r9 = 5
            if (r3 == 0) goto L1b
            r9 = 6
            int r1 = r1 - r2
            r0.f142112e = r1
        L18:
            r6 = r0
            r9 = 2
            goto L21
        L1b:
            com.planner5d.library.aichat.view.bottomsheet.t$d r0 = new com.planner5d.library.aichat.view.bottomsheet.t$d
            r0.<init>(r13)
            goto L18
        L21:
            r9 = 7
            java.lang.Object r13 = r6.f142110c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.f142112e
            r7 = 2
            r9 = r7
            r8 = 1
            if (r1 == 0) goto L4e
            if (r1 == r8) goto L41
            if (r1 != r7) goto L38
            r9 = 4
            kotlin.ResultKt.m(r13)
            goto La0
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r9 = 4
            r10.<init>(r11)
            throw r10
        L41:
            long r11 = r6.f142109b
            java.lang.Object r10 = r6.f142108a
            com.planner5d.library.aichat.view.bottomsheet.t r10 = (com.planner5d.library.aichat.view.bottomsheet.t) r10
            r9 = 4
            kotlin.ResultKt.m(r13)
            r4 = r11
            r9 = 7
            goto L6b
        L4e:
            kotlin.ResultKt.m(r13)
            va.c r1 = r10.f142081f
            com.planner5d.library.modules.user.user.w r13 = r10.f142082g
            long r2 = r13.e()
            r9 = 5
            r6.f142108a = r10
            r9 = 4
            r6.f142109b = r11
            r9 = 1
            r6.f142112e = r8
            r4 = r11
            r9 = 5
            java.lang.Object r13 = r1.d(r2, r4, r6)
            if (r13 != r0) goto L6b
            goto L9e
        L6b:
            r9 = 7
            java.lang.String r13 = (java.lang.String) r13
            r9 = 6
            if (r13 == 0) goto L76
            r10.f142098w = r13
            r9 = 0
            r8 = 0
            goto La0
        L76:
            r9 = 6
            java.util.UUID r11 = java.util.UUID.randomUUID()
            java.lang.String r11 = r11.toString()
            r9 = 6
            r10.f142098w = r11
            va.c r1 = r10.f142081f
            com.planner5d.library.modules.user.user.w r11 = r10.f142082g
            long r2 = r11.e()
            java.lang.String r10 = r10.f142098w
            r11 = 0
            r9 = 5
            r6.f142108a = r11
            r9 = 2
            r6.f142112e = r7
            r7 = r6
            r7 = r6
            r6 = r10
            r9 = 4
            java.lang.Object r10 = r1.e(r2, r4, r6, r7)
            r9 = 3
            if (r10 != r0) goto La0
        L9e:
            r9 = 2
            return r0
        La0:
            r9 = 7
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r8)
            r9 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.aichat.view.bottomsheet.t.s0(long, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ void y0() {
    }

    @NotNull
    public final w0<com.planner5d.library.services.utility.o<Boolean>> B0() {
        return this.f142093p1;
    }

    @NotNull
    public final w0<List<Pair<Integer, String>>> C0() {
        return this.f142092p0;
    }

    public final void D0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new f(null), 3, null);
    }

    public final void E0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new g(null), 3, null);
    }

    public final void N0(@NotNull String message, @NotNull xa.c editorInfoProvider, @NotNull ta.a aiChatCommandsExecutor, boolean z10) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(editorInfoProvider, "editorInfoProvider");
        Intrinsics.checkNotNullParameter(aiChatCommandsExecutor, "aiChatCommandsExecutor");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new i(message, z10, editorInfoProvider, aiChatCommandsExecutor, null), 3, null);
    }

    public final void O0(long j10) {
        J0();
        this.f142097v = j10;
    }

    public final void t0() {
        p2 p2Var = this.f142086j;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.f142086j = null;
        this.f142087k.r(Boolean.FALSE);
        Q0();
    }

    @NotNull
    public final w0<com.planner5d.library.services.utility.o<Boolean>> u0() {
        return this.f142083g3;
    }

    @NotNull
    public final w0<com.planner5d.library.services.utility.o<Boolean>> v0() {
        return this.H1;
    }

    @NotNull
    public final w0<Boolean> w0() {
        return this.Z;
    }

    @NotNull
    public final w0<List<d0>> x0() {
        return this.Y;
    }

    @NotNull
    public final w0<com.planner5d.library.services.utility.o<Boolean>> z0() {
        return this.f142094p2;
    }
}
