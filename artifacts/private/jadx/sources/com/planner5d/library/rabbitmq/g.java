package com.planner5d.library.rabbitmq;

import androidx.annotation.m1;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.services.utility.y2;
import com.rabbitmq.client.b0;
import com.rabbitmq.client.c0;
import com.rabbitmq.client.j;
import com.rabbitmq.client.k;
import com.rabbitmq.client.l1;
import com.rabbitmq.client.p;
import com.rabbitmq.client.r;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final pe.e f223940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final pe.b f223941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h f223942c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.rabbitmq.RabbitMQClient$startConnection$2", f = "RabbitMQClient.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Closeable>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f223943a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f223945c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f223945c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m() {
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new a(this.f223945c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f223943a;
            int i11 = 0 << 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                h hVar = g.this.f223942c;
                this.f223943a = 1;
                obj = hVar.a(this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            String str = (String) obj;
            if (str != null) {
                return g.this.h(str, this.f223945c);
            }
            g.this.f223941b.a("Could not connect to server. Please contact support.");
            return new Closeable() { // from class: com.planner5d.library.rabbitmq.f
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    g.a.m();
                }
            };
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Closeable> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public g(@NotNull pe.e messageHandler, @NotNull pe.b errorListener, @NotNull h uriProvider) {
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        Intrinsics.checkNotNullParameter(errorListener, "errorListener");
        Intrinsics.checkNotNullParameter(uriProvider, "uriProvider");
        this.f223940a = messageHandler;
        this.f223941b = errorListener;
        this.f223942c = uriProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Closeable h(String str, String str2) {
        String str3;
        try {
            r rVar = new r();
            rVar.W0(str);
            final p pVarV = rVar.V();
            k kVarJd = pVarV.jd();
            Intrinsics.checkNotNullExpressionValue(kVarJd, "createChannel(...)");
            str3 = str2;
            try {
                kVarJd.Ua(str3, true, "AndroidConsumer", new b0() { // from class: com.planner5d.library.rabbitmq.b
                    @Override // com.rabbitmq.client.b0
                    public final void a(String str4, c0 c0Var) {
                        g.i(this.f223936a, pVarV, str4, c0Var);
                    }
                }, new j() { // from class: com.planner5d.library.rabbitmq.c
                    @Override // com.rabbitmq.client.j
                    public final void a(String str4) {
                        g.j(this.f223938a, str4);
                    }
                });
                return new Closeable() { // from class: com.planner5d.library.rabbitmq.d
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        g.k(pVarV);
                    }
                };
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                timber.log.b.f381052a.f(exc, "Failed to read queue " + str3, new Object[0]);
                this.f223940a.d(null);
                return new Closeable() { // from class: com.planner5d.library.rabbitmq.e
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        g.l();
                    }
                };
            }
        } catch (Exception e11) {
            e = e11;
            str3 = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(g gVar, p pVar, String str, c0 delivery) {
        Intrinsics.checkNotNullParameter(delivery, "delivery");
        byte[] bArrA = delivery.a();
        Intrinsics.checkNotNullExpressionValue(bArrA, "getBody(...)");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        String str2 = new String(bArrA, UTF_8);
        timber.log.b.f381052a.a("[" + str + "] Received message: '" + str2 + "'", new Object[0]);
        Intrinsics.checkNotNull(pVar);
        gVar.m(pVar, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(g gVar, String str) {
        timber.log.b.f381052a.a("[" + str + "] was canceled", new Object[0]);
        gVar.f223940a.d(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(p pVar) {
        try {
            Intrinsics.checkNotNull(pVar);
            y2.a(pVar);
        } catch (l1 e10) {
            timber.log.b.f381052a.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l() {
    }

    @m1
    private final void m(Closeable closeable, String str) {
        JSONObject jSONObject = new JSONObject(str);
        String strZ = k1.z(jSONObject, com.planner5d.library.services.r.rabbitMQStatus.f224891a, null, 4, null);
        if (Intrinsics.areEqual(strZ, com.planner5d.library.services.r.rabbitMQStatusStart.f224891a)) {
            this.f223940a.a(jSONObject);
            return;
        }
        if (Intrinsics.areEqual(strZ, com.planner5d.library.services.r.rabbitMQStatusResult.f224891a)) {
            this.f223940a.b(jSONObject);
            return;
        }
        if (!Intrinsics.areEqual(strZ, com.planner5d.library.services.r.rabbitMQStatusError.f224891a)) {
            if (Intrinsics.areEqual(strZ, com.planner5d.library.services.r.rabbitMQStatusEnd.f224891a)) {
                this.f223940a.c(jSONObject);
                y2.a(closeable);
            }
        } else {
            pe.b bVar = this.f223941b;
            String strZ2 = k1.z(jSONObject, com.planner5d.library.services.r.rabbitMQStatusMessage.f224891a, null, 4, null);
            if (strZ2 == null) {
                strZ2 = "Unknown error";
            }
            bVar.a(strZ2);
            this.f223940a.d(jSONObject);
        }
    }

    @Nullable
    public final Object n(@NotNull String str, @NotNull kotlin.coroutines.d<? super Closeable> dVar) {
        return i.h(s.f229729a.h(), new a(str, null), dVar);
    }
}
