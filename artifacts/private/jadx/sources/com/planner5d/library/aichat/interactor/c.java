package com.planner5d.library.aichat.interactor;

import com.planner5d.library.aichat.command.AiChatCommand;
import com.planner5d.library.aichat.command.AiChatResponseMessage;
import com.planner5d.library.model.manager.h;
import com.planner5d.library.rabbitmq.g;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.services.utility.y2;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pj.n;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f141990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f141991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f141992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private String f141993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList<AiChatCommand> f141994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList<JSONObject> f141995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f141996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private String f141997h;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.aichat.interactor.AiChatPublisher", f = "AiChatPublisher.kt", i = {0}, l = {38}, m = "create", n = {"publisher"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f141998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f141999b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f142001d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f141999b = obj;
            this.f142001d |= Integer.MIN_VALUE;
            return c.this.b(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.aichat.interactor.AiChatPublisher$create$2", f = "AiChatPublisher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements n<j<? super AiChatResponseMessage>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Closeable f142003b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Closeable closeable, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f142003b = closeable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f142002a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            y2.a(this.f142003b);
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j<? super AiChatResponseMessage> jVar, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
            return new b(this.f142003b, dVar).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.aichat.interactor.c$c, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.aichat.interactor.AiChatPublisher$create$closeable$1", f = "AiChatPublisher.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    static final class C1508c extends o implements Function2<s0, kotlin.coroutines.d<? super Closeable>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f142005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f142006c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1508c(g gVar, String str, kotlin.coroutines.d<? super C1508c> dVar) {
            super(2, dVar);
            this.f142005b = gVar;
            this.f142006c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1508c(this.f142005b, this.f142006c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142004a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            g gVar = this.f142005b;
            String str = this.f142006c;
            this.f142004a = 1;
            Object objN = gVar.n(str, this);
            return objN == objL ? objL : objN;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Closeable> dVar) {
            return ((C1508c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class d implements pe.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0<AiChatResponseMessage> f142007a;

        d(k0<AiChatResponseMessage> k0Var) {
            this.f142007a = k0Var;
        }

        @Override // pe.b
        public void a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            timber.log.b.f381052a.x(message, new Object[0]);
            this.f142007a.setValue(new AiChatResponseMessage(r.chatLastMessage.f224891a, null, null, message, 0, null, 54, null));
        }
    }

    public static final class e implements pe.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k0<AiChatResponseMessage> f142009b;

        e(k0<AiChatResponseMessage> k0Var) {
            this.f142009b = k0Var;
        }

        @Override // pe.e
        public void a(JSONObject jSONObject) {
        }

        @Override // pe.e
        public void b(JSONObject jSONObject) {
            c.this.k(jSONObject);
            this.f142009b.setValue(new AiChatResponseMessage(c.this.g(), c.this.h(), c.this.f(), null, c.this.i(), c.this.j(), 8, null));
        }

        @Override // pe.e
        public void c(JSONObject jSONObject) {
            this.f142009b.setValue(new AiChatResponseMessage(r.chatLastMessage.f224891a, c.this.h(), c.this.f(), null, c.this.i(), c.this.j(), 8, null));
        }

        @Override // pe.e
        public void d(JSONObject jSONObject) {
            this.f142009b.setValue(new AiChatResponseMessage(r.chatLastMessage.f224891a, null, null, null, c.this.i(), null, 46, null));
        }
    }

    public static final class f implements com.planner5d.library.rabbitmq.h {
        f() {
        }

        @Override // com.planner5d.library.rabbitmq.h
        public Object a(kotlin.coroutines.d<? super String> dVar) {
            return c.this.d().f(dVar);
        }
    }

    public c(@NotNull h configManager) {
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        this.f141990a = configManager;
        this.f141991b = new f();
        this.f141993d = "";
        this.f141994e = new ArrayList<>();
        this.f141995f = new ArrayList<>();
        this.f141997h = "";
    }

    private final g c(k0<AiChatResponseMessage> k0Var) {
        return new g(new e(k0Var), new d(k0Var), this.f141991b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(r.rabbitMQData.f224891a);
            if (Intrinsics.areEqual(jSONObject.getString(r.rabbitMQStatus.f224891a), r.rabbitMQStatusResult.f224891a)) {
                this.f141992c = k1.z(jSONObject2, r.conversationId.f224891a, null, 4, null);
                JSONArray jSONArray = jSONObject2.getJSONArray(r.rabbitMQMessages.f224891a);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    this.f141993d = this.f141993d + jSONArray.getJSONObject(i10).getString(r.rabbitMQContent.f224891a);
                }
                JSONArray jSONArray2 = jSONObject2.getJSONArray(r.aiChatCommands.f224891a);
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                    String string = jSONObject3.getString(r.aiChatCommand.f224891a);
                    if (Intrinsics.areEqual(string, r.aiChatSuggestions.f224891a)) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray(r.aiChatParams.f224891a);
                        int length3 = jSONArray3.length();
                        for (int i12 = 0; i12 < length3; i12++) {
                            JSONObject jSONObject4 = jSONArray3.getJSONObject(i12);
                            this.f141994e.add(new AiChatCommand(string, jSONObject4.getString(r.aiChatCommandResponse.f224891a), jSONObject4.getString(r.aiChatCommandTitle.f224891a), null, 8, null));
                        }
                    } else if (Intrinsics.areEqual(string, r.aiChatCommandProgressReport.f224891a)) {
                        JSONObject jSONObject5 = jSONObject3.getJSONObject("params");
                        this.f141996g = jSONObject5.getInt(r.aiChatProgressCode.f224891a);
                        this.f141997h = jSONObject5.getString(r.message.f224891a);
                    } else if (Intrinsics.areEqual(string, r.aiChatCommandCloseChat.f224891a)) {
                        this.f141994e.add(new AiChatCommand(string, null, null, null, 14, null));
                    } else if (Intrinsics.areEqual(string, r.aiChatCommandEditItem.f224891a)) {
                        this.f141995f.add(jSONObject3);
                    } else if (Intrinsics.areEqual(string, r.aiChatCommandAddItem.f224891a)) {
                        this.f141995f.add(jSONObject3);
                    } else if (Intrinsics.areEqual(string, r.aiChatCommandDeleteItem.f224891a)) {
                        this.f141995f.add(jSONObject3);
                    } else if (Intrinsics.areEqual(string, r.aiChatCommandShowPaywall.f224891a)) {
                        this.f141994e.add(new AiChatCommand(string, null, null, null, 14, null));
                    }
                }
            }
        } catch (JSONException e10) {
            this.f141994e.clear();
            this.f141995f.clear();
            timber.log.b.f381052a.e(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object b(@NotNull String str, @NotNull kotlin.coroutines.d<? super i<AiChatResponseMessage>> dVar) {
        a aVar;
        k0<AiChatResponseMessage> k0Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f142001d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f142001d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f141999b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f142001d;
        if (i11 == 0) {
            ResultKt.m(obj);
            k0<AiChatResponseMessage> k0VarA = b1.a(null);
            g gVarC = c(k0VarA);
            z1 z1VarH = s.f229729a.h();
            C1508c c1508c = new C1508c(gVarC, str, null);
            aVar.f141998a = k0VarA;
            aVar.f142001d = 1;
            Object objH = kotlinx.coroutines.i.h(z1VarH, c1508c, aVar);
            if (objH == objL) {
                return objL;
            }
            obj = objH;
            k0Var = k0VarA;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var = (k0) aVar.f141998a;
            ResultKt.m(obj);
        }
        return k.g1(k0Var, new b((Closeable) obj, null));
    }

    @NotNull
    public final h d() {
        return this.f141990a;
    }

    @Nullable
    public final String e() {
        return this.f141992c;
    }

    @NotNull
    public final ArrayList<JSONObject> f() {
        return this.f141995f;
    }

    @NotNull
    public final String g() {
        return this.f141993d;
    }

    @NotNull
    public final ArrayList<AiChatCommand> h() {
        return this.f141994e;
    }

    public final int i() {
        return this.f141996g;
    }

    @NotNull
    public final String j() {
        return this.f141997h;
    }

    public final void l(@Nullable String str) {
        this.f141992c = str;
    }

    public final void m(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f141993d = str;
    }

    public final void n(int i10) {
        this.f141996g = i10;
    }

    public final void o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f141997h = str;
    }
}
