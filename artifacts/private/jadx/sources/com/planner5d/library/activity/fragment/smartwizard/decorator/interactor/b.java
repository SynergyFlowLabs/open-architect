package com.planner5d.library.activity.fragment.smartwizard.decorator.interactor;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.rabbitmq.g;
import com.planner5d.library.rabbitmq.h;
import com.planner5d.library.services.utility.y2;
import java.io.Closeable;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import pj.n;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class b implements ma.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f135412e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f135413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final pa.d f135414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b2 f135415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.d f135416d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.DecorateRoomInteractor", f = "DecorateRoomInteractor.kt", i = {0, 0, 0, 1}, l = {52, com.planner5d.library.engine.input.f.b.I0}, m = "decorateRoom", n = {"this", "publisher", "rabbitMQClient", "publisher"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f135418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f135419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f135420d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f135422f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f135420d = obj;
            this.f135422f |= Integer.MIN_VALUE;
            return b.this.a(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.DecorateRoomInteractor$decorateRoom$2", f = "DecorateRoomInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1488b extends o implements n<j<? super Pair<? extends com.planner5d.library.activity.fragment.smartwizard.b, ? extends JSONObject>>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Closeable f135424b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1488b(Closeable closeable, kotlin.coroutines.d<? super C1488b> dVar) {
            super(3, dVar);
            this.f135424b = closeable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f135423a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            y2.a(this.f135424b);
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j<? super Pair<? extends com.planner5d.library.activity.fragment.smartwizard.b, ? extends JSONObject>> jVar, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
            return new C1488b(this.f135424b, dVar).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.DecorateRoomInteractor$decorateRoom$closeable$1", f = "DecorateRoomInteractor.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135425a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f135427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.smartwizard.data.b f135428d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, com.planner5d.library.smartwizard.data.b bVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f135427c = str;
            this.f135428d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new c(this.f135427c, this.f135428d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135425a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            pa.d dVar = b.this.f135414b;
            com.planner5d.library.application.b bVar = b.this.f135413a;
            String str = this.f135427c;
            com.planner5d.library.smartwizard.data.b bVar2 = this.f135428d;
            this.f135425a = 1;
            Object objB = dVar.b(bVar, str, bVar2, this);
            return objB == objL ? objL : objB;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.DecorateRoomInteractor$decorateRoom$closeable$2$2", f = "DecorateRoomInteractor.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Closeable>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f135430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f135431c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g gVar, String str, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f135430b = gVar;
            this.f135431c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f135430b, this.f135431c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135429a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            g gVar = this.f135430b;
            String str = this.f135431c;
            this.f135429a = 1;
            Object objN = gVar.n(str, this);
            return objN == objL ? objL : objN;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Closeable> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class e implements pe.b {
        e() {
        }

        @Override // pe.b
        public void a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            b.this.f135415c.s(message);
        }
    }

    public static final class f implements h {
        f() {
        }

        @Override // com.planner5d.library.rabbitmq.h
        public Object a(kotlin.coroutines.d<? super String> dVar) {
            return b.this.f135416d.f(dVar);
        }
    }

    @ij.a
    public b(@NotNull com.planner5d.library.application.b application, @NotNull pa.d smartWizardAIQueueRequestUseCase, @NotNull b2 messageManager, @NotNull com.planner5d.library.model.manager.config.d configManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(smartWizardAIQueueRequestUseCase, "smartWizardAIQueueRequestUseCase");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        this.f135413a = application;
        this.f135414b = smartWizardAIQueueRequestUseCase;
        this.f135415c = messageManager;
        this.f135416d = configManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ef, code lost:
    
        if (r13 == r0) goto L25;
     */
    @Override // ma.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull com.planner5d.library.smartwizard.data.b r11, @org.jetbrains.annotations.NotNull com.planner5d.library.model.manager.statistics.events.a4.e r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends kotlin.Pair<? extends com.planner5d.library.activity.fragment.smartwizard.b, ? extends org.json.JSONObject>>> r13) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.b.a(java.lang.String, com.planner5d.library.smartwizard.data.b, com.planner5d.library.model.manager.statistics.events.a4$e, kotlin.coroutines.d):java.lang.Object");
    }
}
