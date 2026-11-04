package com.planner5d.library.dgenerator.interactor;

import com.planner5d.library.database.model.AutoStyle;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.t;
import com.planner5d.library.services.utility.z2;
import java.io.Closeable;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.channels.o0;
import kotlinx.coroutines.channels.s;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements nb.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f160493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final nb.g f160494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.d f160495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.database.manager.a f160496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.dgenerator.data.a f160497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final z2 f160498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f1 f160499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final t f160500h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f160501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Long f160502b;

        public a(@NotNull String uri, @Nullable Long l10) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f160501a = uri;
            this.f160502b = l10;
        }

        @Nullable
        public final Long a() {
            return this.f160502b;
        }

        @NotNull
        public final String b() {
            return this.f160501a;
        }
    }

    public static final class b implements pe.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AutoStyle f160504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0<AutoStyle> f160505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Exception, Unit> f160506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f160507e;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.StartNewAutoStyleInteractor$createRabbitMqClient$1$onMessageError$1", f = "StartNewAutoStyleInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f160508a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<Exception, Unit> f160509b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ JSONObject f160510c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super Exception, Unit> function1, JSONObject jSONObject, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f160509b = function1;
                this.f160510c = jSONObject;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f160509b, this.f160510c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f160508a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                Function1<Exception, Unit> function1 = this.f160509b;
                String strZ = k1.z(this.f160510c, com.planner5d.library.services.r.designGeneratorStatusMessage.f224891a, null, 4, null);
                if (strZ == null) {
                    strZ = "Unknown error";
                }
                function1.invoke(new IOException(strZ));
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.dgenerator.interactor.p$b$b, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.StartNewAutoStyleInteractor$createRabbitMqClient$1$onMessageFinish$1", f = "StartNewAutoStyleInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1542b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f160511a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f160512b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1542b(Function0<Unit> function0, kotlin.coroutines.d<? super C1542b> dVar) {
                super(2, dVar);
                this.f160512b = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1542b(this.f160512b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f160511a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f160512b.invoke();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1542b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.StartNewAutoStyleInteractor$createRabbitMqClient$1$onMessageResult$1", f = "StartNewAutoStyleInteractor.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.B, 115, androidx.media3.extractor.metadata.dvbsi.b.f67479d}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f160513a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f160514b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ JSONObject f160515c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AutoStyle f160516d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ l0<AutoStyle> f160517e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(p pVar, JSONObject jSONObject, AutoStyle autoStyle, l0<? super AutoStyle> l0Var, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f160514b = pVar;
                this.f160515c = jSONObject;
                this.f160516d = autoStyle;
                this.f160517e = l0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new c(this.f160514b, this.f160515c, this.f160516d, this.f160517e, dVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
            
                if (r10.G(r1, r9) == r0) goto L25;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) throws org.json.JSONException {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r8 = 4
                    int r1 = r9.f160513a
                    r2 = 3
                    r3 = 2
                    r4 = 7
                    r4 = 1
                    if (r1 == 0) goto L30
                    if (r1 == r4) goto L2a
                    r8 = 4
                    if (r1 == r3) goto L25
                    if (r1 != r2) goto L1b
                    r8 = 6
                    kotlin.ResultKt.m(r10)
                    r8 = 7
                    goto Lb8
                L1b:
                    r8 = 5
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    r8 = 5
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L25:
                    kotlin.ResultKt.m(r10)
                    goto La9
                L2a:
                    r8 = 2
                    kotlin.ResultKt.m(r10)
                    r8 = 3
                    goto L48
                L30:
                    kotlin.ResultKt.m(r10)
                    com.planner5d.library.dgenerator.interactor.p r10 = r9.f160514b
                    org.json.JSONObject r1 = r9.f160515c
                    if (r1 != 0) goto L3c
                    kotlin.Unit r9 = kotlin.Unit.f312394a
                    return r9
                L3c:
                    com.planner5d.library.database.model.AutoStyle r5 = r9.f160516d
                    r9.f160513a = r4
                    java.lang.Object r10 = com.planner5d.library.dgenerator.interactor.p.k(r10, r1, r5, r9)
                    if (r10 != r0) goto L48
                    r8 = 0
                    goto Lb7
                L48:
                    r8 = 2
                    org.json.JSONObject r10 = r9.f160515c
                    com.planner5d.library.services.r r1 = com.planner5d.library.services.r.rabbitMQStatusProgress
                    java.lang.String r1 = r1.f224891a
                    r8 = 7
                    r4 = 0
                    float r10 = com.planner5d.library.services.utility.k1.i(r10, r1, r4)
                    timber.log.b$b r1 = timber.log.b.f381052a
                    com.planner5d.library.database.model.AutoStyle r4 = r9.f160516d
                    java.lang.Long r4 = r4.getId()
                    com.planner5d.library.database.model.AutoStyle r5 = r9.f160516d
                    r8 = 5
                    int r5 = r5.t()
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r7 = "AutoStyle "
                    r8 = 4
                    r6.append(r7)
                    r6.append(r4)
                    java.lang.String r4 = "susta t "
                    java.lang.String r4 = " status "
                    r8 = 7
                    r6.append(r4)
                    r6.append(r5)
                    java.lang.String r4 = " opmesrrsg"
                    java.lang.String r4 = " progress "
                    r6.append(r4)
                    r8 = 3
                    r6.append(r10)
                    r8 = 5
                    java.lang.String r4 = r6.toString()
                    r5 = 0
                    r8 = 5
                    java.lang.Object[] r5 = new java.lang.Object[r5]
                    r1.a(r4, r5)
                    com.planner5d.library.dgenerator.interactor.p r1 = r9.f160514b
                    r8 = 4
                    com.planner5d.library.database.model.AutoStyle r4 = r9.f160516d
                    com.planner5d.library.database.model.a r5 = com.planner5d.library.database.model.a.InProgress
                    java.lang.Float r10 = kotlin.coroutines.jvm.internal.b.e(r10)
                    r8 = 1
                    r9.f160513a = r3
                    java.lang.Object r10 = com.planner5d.library.dgenerator.interactor.p.m(r1, r4, r5, r10, r9)
                    if (r10 != r0) goto La9
                    goto Lb7
                La9:
                    kotlinx.coroutines.channels.l0<com.planner5d.library.database.model.AutoStyle> r10 = r9.f160517e
                    r8 = 4
                    com.planner5d.library.database.model.AutoStyle r1 = r9.f160516d
                    r9.f160513a = r2
                    java.lang.Object r9 = r10.G(r1, r9)
                    r8 = 5
                    if (r9 != r0) goto Lb8
                Lb7:
                    return r0
                Lb8:
                    kotlin.Unit r9 = kotlin.Unit.f312394a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.dgenerator.interactor.p.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(AutoStyle autoStyle, l0<? super AutoStyle> l0Var, Function1<? super Exception, Unit> function1, Function0<Unit> function0) {
            this.f160504b = autoStyle;
            this.f160505c = l0Var;
            this.f160506d = function1;
            this.f160507e = function0;
        }

        @Override // pe.e
        public void a(JSONObject jSONObject) {
        }

        @Override // pe.e
        public void b(JSONObject jSONObject) {
            p pVar = p.this;
            pVar.s(new c(pVar, jSONObject, this.f160504b, this.f160505c, null));
        }

        @Override // pe.e
        public void c(JSONObject jSONObject) {
            p.this.s(new C1542b(this.f160507e, null));
        }

        @Override // pe.e
        public void d(JSONObject jSONObject) {
            int i10 = 6 >> 0;
            p.this.s(new a(this.f160506d, jSONObject, null));
        }
    }

    public static final class c implements pe.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Exception, Unit> f160519b;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.StartNewAutoStyleInteractor$createRabbitMqClient$2$handleErrorMessage$1", f = "StartNewAutoStyleInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f160520a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<Exception, Unit> f160521b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f160522c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super Exception, Unit> function1, String str, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f160521b = function1;
                this.f160522c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f160521b, this.f160522c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f160520a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f160521b.invoke(new IOException(this.f160522c));
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super Exception, Unit> function1) {
            this.f160519b = function1;
        }

        @Override // pe.b
        public void a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            p.this.s(new a(this.f160519b, message, null));
        }
    }

    public static final class d implements com.planner5d.library.rabbitmq.h {
        d() {
        }

        @Override // com.planner5d.library.rabbitmq.h
        public Object a(kotlin.coroutines.d<? super String> dVar) {
            return p.this.f160495c.f(dVar);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.StartNewAutoStyleInteractor$downloadAutoStyleImages$2", f = "StartNewAutoStyleInteractor.kt", i = {0}, l = {99, 100}, m = "invokeSuspend", n = {"clientResult"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f160524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f160525b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AutoStyle f160527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l0<AutoStyle> f160528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f160529f;

        /* synthetic */ class a extends kotlin.jvm.internal.a implements Function1<Throwable, Unit> {
            a(Object obj) {
                super(1, obj, kotlinx.coroutines.channels.p.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
            }

            public final void c(Throwable th2) {
                ((kotlinx.coroutines.channels.p) this.receiver).F(th2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                c(th2);
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(AutoStyle autoStyle, l0<? super AutoStyle> l0Var, String str, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f160527d = autoStyle;
            this.f160528e = l0Var;
            this.f160529f = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(kotlinx.coroutines.channels.p pVar) {
            Unit unit = Unit.f312394a;
            pVar.p(unit);
            int i10 = 3 & 0;
            o0.a.a(pVar, null, 1, null);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return p.this.new e(this.f160527d, this.f160528e, this.f160529f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            final kotlinx.coroutines.channels.p pVarD;
            Closeable closeable;
            Throwable th2;
            Closeable closeable2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160525b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    pVarD = s.d(0, null, null, 7, null);
                    com.planner5d.library.rabbitmq.g gVarN = p.this.n(this.f160527d, this.f160528e, new Function0() { // from class: com.planner5d.library.dgenerator.interactor.q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return p.e.m(pVarD);
                        }
                    }, new a(pVarD));
                    p pVar = p.this;
                    String str = this.f160529f;
                    AutoStyle autoStyle = this.f160527d;
                    this.f160524a = pVarD;
                    this.f160525b = 1;
                    obj = pVar.p(str, autoStyle, gVarN, this);
                    if (obj != objL) {
                    }
                    return objL;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable2 = (Closeable) this.f160524a;
                    try {
                        ResultKt.m(obj);
                        Unit unit = Unit.f312394a;
                        kotlin.io.c.a(closeable2, null);
                        return unit;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            kotlin.io.c.a(closeable2, th2);
                            throw th4;
                        }
                    }
                }
                pVarD = (kotlinx.coroutines.channels.p) this.f160524a;
                ResultKt.m(obj);
                this.f160524a = closeable;
                this.f160525b = 2;
                if (pVarD.j(this) != objL) {
                    closeable2 = closeable;
                    Unit unit2 = Unit.f312394a;
                    kotlin.io.c.a(closeable2, null);
                    return unit2;
                }
                return objL;
            } catch (Throwable th5) {
                th2 = th5;
                closeable2 = closeable;
                throw th2;
            }
            closeable = (Closeable) obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.StartNewAutoStyleInteractor", f = "StartNewAutoStyleInteractor.kt", i = {0, 0, 1}, l = {com.planner5d.library.engine.input.f.b.H1, 152}, m = "downloadAutoStyleImagesInternal", n = {"this", "autoStyle", "this"}, s = {"L$0", "L$1", "L$0"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f160530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f160531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f160532c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f160534e;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f160532c = obj;
            this.f160534e |= Integer.MIN_VALUE;
            return p.this.p(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.StartNewAutoStyleInteractor$processResponse$2", f = "StartNewAutoStyleInteractor.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f160535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f160536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f160537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AutoStyle f160538d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(JSONObject jSONObject, p pVar, AutoStyle autoStyle, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f160536b = jSONObject;
            this.f160537c = pVar;
            this.f160538d = autoStyle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(this.f160536b, this.f160537c, this.f160538d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f160535a;
            if (i10 == 0) {
                ResultKt.m(obj);
                JSONObject jSONObject = this.f160536b.getJSONObject(com.planner5d.library.services.r.designGeneratorData.f224891a);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                String strZ = k1.z(jSONObject, com.planner5d.library.services.r.designGeneratorImageUri.f224891a, null, 4, null);
                if (strZ == null) {
                    return null;
                }
                p pVar = this.f160537c;
                AutoStyle autoStyle = this.f160538d;
                a aVar = new a(strZ, k1.v(jSONObject, com.planner5d.library.services.r.designGeneratorRoomStyleId));
                com.planner5d.library.database.manager.a aVar2 = pVar.f160496d;
                String strB = aVar.b();
                Long lA = aVar.a();
                this.f160535a = 1;
                obj = aVar2.k(autoStyle, strB, lA, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return kotlin.coroutines.jvm.internal.b.g(((Number) obj).longValue());
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Long> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.StartNewAutoStyleInteractor$startNewAutoStyle$1", f = "StartNewAutoStyleInteractor.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6}, l = {47, 50, com.planner5d.library.engine.input.f.b.D0, 63, 65, 70, 75, com.planner5d.library.engine.input.f.b.f160705l0}, m = "invokeSuspend", n = {"$this$channelFlow", "autoStyleId", "$this$channelFlow", "autoStyleId", "$this$channelFlow", "autoStyleId", "$this$channelFlow", "autoStyleId", "$this$channelFlow", "autoStyleId", "$this$channelFlow", "autoStyleId", "$this$channelFlow", "autoStyleId"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nStartNewAutoStyleInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartNewAutoStyleInteractor.kt\ncom/planner5d/library/dgenerator/interactor/StartNewAutoStyleInteractor$startNewAutoStyle$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,178:1\n29#2:179\n*S KotlinDebug\n*F\n+ 1 StartNewAutoStyleInteractor.kt\ncom/planner5d/library/dgenerator/interactor/StartNewAutoStyleInteractor$startNewAutoStyle$1\n*L\n51#1:179\n*E\n"})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super AutoStyle>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f160539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f160540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f160541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f160542d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f160543e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f160544f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ AutoStyle f160546h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(AutoStyle autoStyle, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f160546h = autoStyle;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            h hVar = p.this.new h(this.f160546h, dVar);
            hVar.f160544f = obj;
            return hVar;
        }

        /* JADX WARN: Code duplicated, block: B:103:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:38:0x0161 A[PHI: r5 r6 r9
          0x0161: PHI (r5v13 kotlin.jvm.internal.i1$g) = (r5v10 kotlin.jvm.internal.i1$g), (r5v17 kotlin.jvm.internal.i1$g) binds: [B:36:0x015d, B:29:0x00d0] A[DONT_GENERATE, DONT_INLINE]
          0x0161: PHI (r6v20 kotlinx.coroutines.channels.l0) = (r6v17 kotlinx.coroutines.channels.l0), (r6v23 kotlinx.coroutines.channels.l0) binds: [B:36:0x015d, B:29:0x00d0] A[DONT_GENERATE, DONT_INLINE]
          0x0161: PHI (r9v11 com.planner5d.library.dgenerator.interactor.p$h) = (r9v9 com.planner5d.library.dgenerator.interactor.p$h), (r9v12 com.planner5d.library.dgenerator.interactor.p$h) binds: [B:36:0x015d, B:29:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:40:0x0169  */
        /* JADX WARN: Code duplicated, block: B:61:0x01ea  */
        /* JADX WARN: Code duplicated, block: B:62:0x01ec A[Catch: all -> 0x0249, Exception -> 0x0250, PHI: r5 r6 r9 r12 r13 r14
          0x01ec: PHI (r5v22 com.planner5d.library.dgenerator.interactor.p) = (r5v18 com.planner5d.library.dgenerator.interactor.p), (r5v27 com.planner5d.library.dgenerator.interactor.p) binds: [B:60:0x01e8, B:24:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x01ec: PHI (r6v30 com.planner5d.library.database.model.AutoStyle) = (r6v24 com.planner5d.library.database.model.AutoStyle), (r6v35 com.planner5d.library.database.model.AutoStyle) binds: [B:60:0x01e8, B:24:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x01ec: PHI (r9v17 com.planner5d.library.dgenerator.interactor.p$h) = (r9v13 com.planner5d.library.dgenerator.interactor.p$h), (r9v20 com.planner5d.library.dgenerator.interactor.p$h) binds: [B:60:0x01e8, B:24:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x01ec: PHI (r12v13 java.io.Closeable) = (r12v10 java.io.Closeable), (r12v15 java.io.Closeable) binds: [B:60:0x01e8, B:24:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x01ec: PHI (r13v8 kotlinx.coroutines.channels.l0) = (r13v5 kotlinx.coroutines.channels.l0), (r13v10 kotlinx.coroutines.channels.l0) binds: [B:60:0x01e8, B:24:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x01ec: PHI (r14v42 kotlin.jvm.internal.i1$g) = (r14v38 kotlin.jvm.internal.i1$g), (r14v43 kotlin.jvm.internal.i1$g) binds: [B:60:0x01e8, B:24:0x00a6] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {Exception -> 0x0250, blocks: (B:62:0x01ec, B:59:0x01d7), top: B:103:0x01d7 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x020f  */
        /* JADX WARN: Code duplicated, block: B:77:0x0272  */
        /* JADX WARN: Code duplicated, block: B:81:0x029c A[Catch: all -> 0x0249, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0249, blocks: (B:74:0x0253, B:62:0x01ec, B:57:0x01c8, B:59:0x01d7, B:81:0x029c), top: B:114:0x01c8 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x02bd  */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x034b, code lost:
        
            if (r6.G(r14, r9) == r1) goto L113;
         */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0081: MOVE (r6 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:21:0x007f */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0080: MOVE (r12 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:21:0x007f */
        /* JADX WARN: Not initialized variable reg: 7, insn: 0x0083: MOVE (r12 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:21:0x007f */
        /* JADX WARN: Not initialized variable reg: 9, insn: 0x0084: MOVE (r13 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:21:0x007f */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 874
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.dgenerator.interactor.p.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<? super AutoStyle> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public p(@NotNull com.planner5d.library.application.b application, @NotNull nb.g startAutoStyleUseCase, @NotNull com.planner5d.library.model.manager.config.d configManager, @NotNull com.planner5d.library.database.manager.a databaseManager, @NotNull com.planner5d.library.dgenerator.data.a designProcessTracker, @NotNull z2 orderedCoroutinesFactory, @NotNull f1 coroutineScope, @NotNull t coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(startAutoStyleUseCase, "startAutoStyleUseCase");
        Intrinsics.checkNotNullParameter(configManager, "configManager");
        Intrinsics.checkNotNullParameter(databaseManager, "databaseManager");
        Intrinsics.checkNotNullParameter(designProcessTracker, "designProcessTracker");
        Intrinsics.checkNotNullParameter(orderedCoroutinesFactory, "orderedCoroutinesFactory");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f160493a = application;
        this.f160494b = startAutoStyleUseCase;
        this.f160495c = configManager;
        this.f160496d = databaseManager;
        this.f160497e = designProcessTracker;
        this.f160498f = orderedCoroutinesFactory;
        this.f160499g = coroutineScope;
        this.f160500h = coroutineDispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.planner5d.library.rabbitmq.g n(AutoStyle autoStyle, l0<? super AutoStyle> l0Var, Function0<Unit> function0, Function1<? super Exception, Unit> function1) {
        return new com.planner5d.library.rabbitmq.g(new b(autoStyle, l0Var, function1, function0), new c(function1), new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(l0<? super AutoStyle> l0Var, String str, AutoStyle autoStyle, kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        Object objH = kotlinx.coroutines.i.h(this.f160500h.h(), new e(autoStyle, l0Var, str, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object p(String str, AutoStyle autoStyle, com.planner5d.library.rabbitmq.g gVar, kotlin.coroutines.d<? super Closeable> dVar) {
        f fVar;
        p pVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f160534e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f160534e = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        f fVar2 = fVar;
        Object objU = fVar2.f160532c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar2.f160534e;
        try {
            if (i11 == 0) {
                ResultKt.m(objU);
                fVar2.f160530a = this;
                fVar2.f160531b = autoStyle;
                fVar2.f160534e = 1;
                objU = gVar.n(str, fVar2);
                if (objU == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (p) fVar2.f160530a;
                    ResultKt.m(objU);
                    long jLongValue = ((Number) objU).longValue();
                    timber.log.b.f381052a.a("AutoStyle " + jLongValue + " mark as finished with Error 2", new Object[0]);
                    pVar.f160497e.b(jLongValue);
                    return new Closeable() { // from class: com.planner5d.library.dgenerator.interactor.o
                        @Override // java.io.Closeable, java.lang.AutoCloseable
                        public final void close() {
                            p.q();
                        }
                    };
                }
                autoStyle = (AutoStyle) fVar2.f160531b;
                this = (p) fVar2.f160530a;
                ResultKt.m(objU);
            }
            return (Closeable) objU;
        } catch (Exception e10) {
            AutoStyle autoStyle2 = autoStyle;
            timber.log.b.f381052a.e(e10);
            com.planner5d.library.database.model.a aVar = com.planner5d.library.database.model.a.Error;
            fVar2.f160530a = this;
            fVar2.f160531b = null;
            fVar2.f160534e = 2;
            int i12 = 5 << 0;
            int i13 = 4 >> 0;
            p pVar2 = this;
            objU = u(pVar2, autoStyle2, aVar, null, fVar2, 4, null);
            if (objU != objL) {
                pVar = pVar2;
            }
            return objL;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(JSONObject jSONObject, AutoStyle autoStyle, kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(this.f160500h.h(), new g(jSONObject, this, autoStyle, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Function2<? super s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        z2.b(this.f160498f, this.f160499g, this.f160500h.h(), null, function2, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(AutoStyle autoStyle, com.planner5d.library.database.model.a aVar, Float f10, kotlin.coroutines.d<? super Long> dVar) {
        autoStyle.N(aVar.n());
        autoStyle.I(f10);
        return this.f160496d.j(autoStyle, dVar);
    }

    static /* synthetic */ Object u(p pVar, AutoStyle autoStyle, com.planner5d.library.database.model.a aVar, Float f10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = Float.valueOf(0.0f);
        }
        return pVar.t(autoStyle, aVar, f10, dVar);
    }

    @Override // nb.h
    @NotNull
    public kotlinx.coroutines.flow.i<AutoStyle> a(@NotNull AutoStyle autoStyle) {
        Intrinsics.checkNotNullParameter(autoStyle, "autoStyle");
        return kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.x(new h(autoStyle, null)), this.f160500h.h());
    }
}
