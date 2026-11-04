package com.planner5d.library.aichat.view.fragment;

import android.content.Context;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.w0;
import com.planner5d.library.aichat.command.AiChatResponseMessage;
import com.planner5d.library.aichat.view.bottomsheet.d0;
import com.planner5d.library.model.manager.statistics.events.i3;
import com.planner5d.library.services.r;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nChatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatViewModel.kt\ncom/planner5d/library/aichat/view/fragment/ChatViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
public final class m extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ya.a f142185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.h f142186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final i3 f142187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ya.b f142188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f142189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final c1<List<d0>> f142190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final c1<List<Pair<Integer, String>>> f142191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private String f142192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f142193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final w0<List<d0>> f142194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final w0<Boolean> f142195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final w0<List<Pair<Integer, String>>> f142196l;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.aichat.view.fragment.ChatViewModel$loadSuggestions$1", f = "ChatViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142197a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f142197a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            List<Pair<Integer, String>> listH = m.this.f142186b.h();
            if (listH != null) {
                m.this.f142191g.r(listH);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.aichat.view.fragment.ChatViewModel$sendMessage$1", f = "ChatViewModel.kt", i = {}, l = {50, 52, 52}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f142199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f142200b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f142202d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f142203e;

        @SourceDebugExtension({"SMAP\nChatViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatViewModel.kt\ncom/planner5d/library/aichat/view/fragment/ChatViewModel$sendMessage$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f142204a;

            a(m mVar) {
                this.f142204a = mVar;
            }

            @Override // kotlinx.coroutines.flow.j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AiChatResponseMessage aiChatResponseMessage, kotlin.coroutines.d<? super Unit> dVar) {
                timber.log.b.f381052a.H("AiChat").u("Received message: %s", String.valueOf(aiChatResponseMessage));
                if (Intrinsics.areEqual(aiChatResponseMessage != null ? aiChatResponseMessage.n() : null, r.chatLastMessage.f224891a)) {
                    this.f142204a.f142189e.r(kotlin.coroutines.jvm.internal.b.a(false));
                    this.f142204a.f142187c.V(i3.a.message_get);
                } else if (aiChatResponseMessage != null) {
                    this.f142204a.n0(aiChatResponseMessage.n());
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Context context, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f142202d = str;
            this.f142203e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new b(this.f142202d, this.f142203e, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:42:0x00de  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
        
            if (r13.collect(r14, r11) == r0) goto L30;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.aichat.view.fragment.m.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public m(@NotNull ya.a aiChatUseCase, @NotNull com.planner5d.library.model.manager.h configManagerService, @NotNull i3 events, @NotNull ya.b getUserAvatar) {
        Intrinsics.checkNotNullParameter(aiChatUseCase, "aiChatUseCase");
        Intrinsics.checkNotNullParameter(configManagerService, "configManagerService");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(getUserAvatar, "getUserAvatar");
        this.f142185a = aiChatUseCase;
        this.f142186b = configManagerService;
        this.f142187c = events;
        this.f142188d = getUserAvatar;
        c1<Boolean> c1Var = new c1<>(Boolean.FALSE);
        this.f142189e = c1Var;
        c1<List<d0>> c1Var2 = new c1<>(new ArrayList());
        this.f142190f = c1Var2;
        c1<List<Pair<Integer, String>>> c1Var3 = new c1<>(new ArrayList());
        this.f142191g = c1Var3;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f142192h = string;
        Intrinsics.checkNotNull(c1Var2, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.collections.List<com.planner5d.library.aichat.view.bottomsheet.Message>>");
        this.f142194j = c1Var2;
        this.f142195k = c1Var;
        this.f142196l = c1Var3;
    }

    private final Boolean b0(AiChatResponseMessage aiChatResponseMessage, boolean z10) {
        List<d0> listF = this.f142190f.f();
        if (listF == null) {
            return null;
        }
        int i10 = this.f142193i;
        this.f142193i = i10 + 1;
        return Boolean.valueOf(listF.add(new d0(i10, aiChatResponseMessage, z10)));
    }

    private final void c0(String str, boolean z10) {
        int i10 = 2 | 0;
        b0(new AiChatResponseMessage(str, null, null, null, 0, null, 62, null), z10);
    }

    public static /* synthetic */ void h0() {
    }

    private final void m0(AiChatResponseMessage aiChatResponseMessage) {
        List<d0> listF = this.f142190f.f();
        if (listF != null) {
            if (listF.isEmpty()) {
                listF = null;
            }
            if (listF != null) {
                listF.set(CollectionsKt.getLastIndex(listF), new d0(listF.get(CollectionsKt.getLastIndex(listF)).b(), aiChatResponseMessage, true));
                c1<List<d0>> c1Var = this.f142190f;
                c1Var.r(c1Var.f());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(String str) {
        m0(new AiChatResponseMessage(str, null, null, null, 0, null, 62, null));
    }

    public final void d0() {
        this.f142187c.V(i3.a.chat_close);
    }

    @NotNull
    public final w0<Boolean> f0() {
        return this.f142195k;
    }

    @NotNull
    public final w0<List<d0>> g0() {
        return this.f142194j;
    }

    @NotNull
    public final w0<List<Pair<Integer, String>>> i0() {
        return this.f142196l;
    }

    public final void j0(int i10, @Nullable com.planner5d.library.services.bitmaploader.target.a aVar) {
        this.f142188d.a(i10, aVar);
    }

    public final void k0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    public final void l0(@Nullable Context context, @NotNull String message, boolean z10) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f142189e.r(Boolean.TRUE);
        this.f142187c.V(i3.a.message_send);
        c0(message, z10);
        c0(r.chatLoadingMessage.f224891a, true);
        c1<List<d0>> c1Var = this.f142190f;
        c1Var.r(c1Var.f());
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(message, context, null), 3, null);
    }
}
