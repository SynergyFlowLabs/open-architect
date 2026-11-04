package com.sdk.growthbook.network;

import fi.d0;
import fi.y;
import io.ktor.client.plugins.s1;
import io.ktor.http.content.v;
import io.ktor.http.i1;
import io.ktor.http.l1;
import io.ktor.http.m;
import io.ktor.http.w0;
import java.io.IOException;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.reflect.s;
import kotlinx.coroutines.channels.j0;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nGBNetworkDispatcherKtor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GBNetworkDispatcherKtor.kt\ncom/sdk/growthbook/network/GBNetworkDispatcherKtor\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,218:1\n606#2:219\n427#2:220\n607#2,2:221\n609#2:225\n287#2,2:226\n52#2:228\n216#3,2:223\n216#3,2:229\n*S KotlinDebug\n*F\n+ 1 GBNetworkDispatcherKtor.kt\ncom/sdk/growthbook/network/GBNetworkDispatcherKtor\n*L\n98#1:219\n98#1:220\n98#1:221,2\n98#1:225\n98#1:226,2\n98#1:228\n102#1:223,2\n100#1:229,2\n*E\n"})
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.c f266381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f266382b;

    @kotlin.coroutines.jvm.internal.f(c = "com.sdk.growthbook.network.GBNetworkDispatcherKtor$consumeGETRequest$1", f = "GBNetworkDispatcherKtor.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160708m0, com.planner5d.library.engine.input.f.b.f160708m0, 219, 238}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nGBNetworkDispatcherKtor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GBNetworkDispatcherKtor.kt\ncom/sdk/growthbook/network/GBNetworkDispatcherKtor$consumeGETRequest$1\n+ 2 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,218:1\n162#2:219\n162#2:238\n65#3,18:220\n65#3,18:239\n*S KotlinDebug\n*F\n+ 1 GBNetworkDispatcherKtor.kt\ncom/sdk/growthbook/network/GBNetworkDispatcherKtor$consumeGETRequest$1\n*L\n72#1:219\n74#1:238\n72#1:220,18\n74#1:239,18\n*E\n"})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f266383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f266384b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f266386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f266387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Throwable, Unit> f266388f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f266386d = str;
            this.f266387e = function1;
            this.f266388f = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new a(this.f266386d, this.f266387e, this.f266388f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00a3 A[Catch: Exception -> 0x00d4, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x00d4, blocks: (B:64:0x0104, B:65:0x0121, B:66:0x0126, B:52:0x00cc, B:55:0x00d7, B:56:0x00dd, B:41:0x008e, B:44:0x00a3, B:46:0x00b2, B:57:0x00de, B:59:0x00ef), top: B:93:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:48:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:52:0x00cc A[Catch: Exception -> 0x00d4, TryCatch #3 {Exception -> 0x00d4, blocks: (B:64:0x0104, B:65:0x0121, B:66:0x0126, B:52:0x00cc, B:55:0x00d7, B:56:0x00dd, B:41:0x008e, B:44:0x00a3, B:46:0x00b2, B:57:0x00de, B:59:0x00ef), top: B:93:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[Catch: Exception -> 0x00d4, TryCatch #3 {Exception -> 0x00d4, blocks: (B:64:0x0104, B:65:0x0121, B:66:0x0126, B:52:0x00cc, B:55:0x00d7, B:56:0x00dd, B:41:0x008e, B:44:0x00a3, B:46:0x00b2, B:57:0x00de, B:59:0x00ef), top: B:93:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:57:0x00de A[Catch: Exception -> 0x00d4, TRY_LEAVE, TryCatch #3 {Exception -> 0x00d4, blocks: (B:64:0x0104, B:65:0x0121, B:66:0x0126, B:52:0x00cc, B:55:0x00d7, B:56:0x00dd, B:41:0x008e, B:44:0x00a3, B:46:0x00b2, B:57:0x00de, B:59:0x00ef), top: B:93:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:62:0x0101  */
        /* JADX WARN: Code duplicated, block: B:64:0x0104 A[Catch: Exception -> 0x00d4, TryCatch #3 {Exception -> 0x00d4, blocks: (B:64:0x0104, B:65:0x0121, B:66:0x0126, B:52:0x00cc, B:55:0x00d7, B:56:0x00dd, B:41:0x008e, B:44:0x00a3, B:46:0x00b2, B:57:0x00de, B:59:0x00ef), top: B:93:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:65:0x0121 A[Catch: Exception -> 0x00d4, TryCatch #3 {Exception -> 0x00d4, blocks: (B:64:0x0104, B:65:0x0121, B:66:0x0126, B:52:0x00cc, B:55:0x00d7, B:56:0x00dd, B:41:0x008e, B:44:0x00a3, B:46:0x00b2, B:57:0x00de, B:59:0x00ef), top: B:93:0x008e }] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            a aVar;
            IOException iOException;
            s1 s1Var;
            io.ktor.client.plugins.e eVar;
            Exception exc2;
            Function1<String, Unit> function1;
            Function1<Throwable, Unit> function2;
            Exception e10;
            IOException e11;
            s1 e12;
            io.ktor.client.plugins.e e13;
            io.ktor.client.statement.c cVar;
            s sVarA;
            Function1<Throwable, Unit> function3;
            Function1<String, Unit> function4;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266384b;
            if (i10 != 0) {
                try {
                    if (i10 == 1) {
                        ResultKt.m(obj);
                        aVar = this;
                    } else if (i10 != 2) {
                        try {
                            if (i10 == 3) {
                                function1 = (Function1) this.f266383a;
                                ResultKt.m(obj);
                                if (obj == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                function1.invoke((String) obj);
                                return Unit.f312394a;
                            }
                            if (i10 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            function2 = (Function1) this.f266383a;
                            ResultKt.m(obj);
                            if (obj == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Response status in not ok: Response is: ");
                            sb2.append(obj);
                            function2.invoke(new Exception(sb2.toString()));
                            return Unit.f312394a;
                        } catch (Exception e14) {
                            exc2 = e14;
                            aVar = this;
                            aVar.f266388f.invoke(exc2);
                        }
                    } else {
                        ResultKt.m(obj);
                        aVar = this;
                        cVar = (io.ktor.client.statement.c) obj;
                        try {
                            sVarA = null;
                            if (Intrinsics.areEqual(cVar.j(), l1.f295939c.C())) {
                                function4 = aVar.f266387e;
                                io.ktor.client.call.b bVarH = cVar.h();
                                kotlin.reflect.d dVarD = j1.d(String.class);
                                try {
                                    sVarA = j1.A(String.class);
                                } catch (Throwable unused) {
                                }
                                ri.b bVar = new ri.b(dVarD, sVarA);
                                aVar.f266383a = function4;
                                aVar.f266384b = 3;
                                obj = bVarH.e(bVar, aVar);
                                if (obj == objL) {
                                    function1 = function4;
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    function1.invoke((String) obj);
                                    return Unit.f312394a;
                                }
                            } else {
                                function3 = aVar.f266388f;
                                io.ktor.client.call.b bVarH2 = cVar.h();
                                kotlin.reflect.d dVarD2 = j1.d(String.class);
                                try {
                                    sVarA = j1.A(String.class);
                                } catch (Throwable unused2) {
                                }
                                ri.b bVar2 = new ri.b(dVarD2, sVarA);
                                aVar.f266383a = function3;
                                aVar.f266384b = 4;
                                obj = bVarH2.e(bVar2, aVar);
                                if (obj != objL) {
                                    function2 = function3;
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Response status in not ok: Response is: ");
                                    sb3.append(obj);
                                    function2.invoke(new Exception(sb3.toString()));
                                    return Unit.f312394a;
                                }
                            }
                            return objL;
                        } catch (Exception e15) {
                            exc2 = e15;
                            aVar.f266388f.invoke(exc2);
                        }
                    }
                } catch (io.ktor.client.plugins.e e16) {
                    eVar = e16;
                    aVar = this;
                    aVar.f266388f.invoke(eVar);
                } catch (s1 e17) {
                    s1Var = e17;
                    aVar = this;
                    aVar.f266388f.invoke(s1Var);
                } catch (IOException e18) {
                    iOException = e18;
                    aVar = this;
                    aVar.f266388f.invoke(iOException);
                } catch (Exception e19) {
                    exc = e19;
                    aVar = this;
                    aVar.f266388f.invoke(exc);
                }
            } else {
                ResultKt.m(obj);
                try {
                    b bVar3 = b.this;
                    String str = this.f266386d;
                    this.f266384b = 1;
                    aVar = this;
                    try {
                        obj = b.j(bVar3, str, null, null, aVar, 6, null);
                        if (obj == objL) {
                        }
                        return objL;
                    } catch (io.ktor.client.plugins.e e20) {
                        e13 = e20;
                        eVar = e13;
                        aVar.f266388f.invoke(eVar);
                    } catch (s1 e21) {
                        e12 = e21;
                        s1Var = e12;
                        aVar.f266388f.invoke(s1Var);
                    } catch (IOException e22) {
                        e11 = e22;
                        iOException = e11;
                        aVar.f266388f.invoke(iOException);
                    } catch (Exception e23) {
                        e10 = e23;
                        exc = e10;
                        aVar.f266388f.invoke(exc);
                    }
                } catch (io.ktor.client.plugins.e e24) {
                    e13 = e24;
                    aVar = this;
                    eVar = e13;
                    aVar.f266388f.invoke(eVar);
                } catch (s1 e25) {
                    e12 = e25;
                    aVar = this;
                    s1Var = e12;
                    aVar.f266388f.invoke(s1Var);
                } catch (IOException e26) {
                    e11 = e26;
                    aVar = this;
                    iOException = e11;
                    aVar.f266388f.invoke(iOException);
                } catch (Exception e27) {
                    e10 = e27;
                    aVar = this;
                    exc = e10;
                    aVar.f266388f.invoke(exc);
                }
            }
            aVar.f266384b = 2;
            obj = ((io.ktor.client.statement.g) obj).d(aVar);
            if (obj != objL) {
                cVar = (io.ktor.client.statement.c) obj;
                sVarA = null;
                if (Intrinsics.areEqual(cVar.j(), l1.f295939c.C())) {
                    function4 = aVar.f266387e;
                    io.ktor.client.call.b bVarH3 = cVar.h();
                    kotlin.reflect.d dVarD3 = j1.d(String.class);
                    sVarA = j1.A(String.class);
                    ri.b bVar4 = new ri.b(dVarD3, sVarA);
                    aVar.f266383a = function4;
                    aVar.f266384b = 3;
                    obj = bVarH3.e(bVar4, aVar);
                    if (obj == objL) {
                        function1 = function4;
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        function1.invoke((String) obj);
                        return Unit.f312394a;
                    }
                } else {
                    function3 = aVar.f266388f;
                    io.ktor.client.call.b bVarH4 = cVar.h();
                    kotlin.reflect.d dVarD4 = j1.d(String.class);
                    sVarA = j1.A(String.class);
                    ri.b bVar5 = new ri.b(dVarD4, sVarA);
                    aVar.f266383a = function3;
                    aVar.f266384b = 4;
                    obj = bVarH4.e(bVar5, aVar);
                    if (obj != objL) {
                        function2 = function3;
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Response status in not ok: Response is: ");
                        sb4.append(obj);
                        function2.invoke(new Exception(sb4.toString()));
                        return Unit.f312394a;
                    }
                }
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.sdk.growthbook.network.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.sdk.growthbook.network.GBNetworkDispatcherKtor$consumePOSTRequest$1", f = "GBNetworkDispatcherKtor.kt", i = {}, l = {259, com.planner5d.library.engine.input.b.f160571z3}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nGBNetworkDispatcherKtor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GBNetworkDispatcherKtor.kt\ncom/sdk/growthbook/network/GBNetworkDispatcherKtor$consumePOSTRequest$1\n+ 2 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n+ 3 builders.kt\nio/ktor/client/request/BuildersKt\n+ 4 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 6 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n*L\n1#1,218:1\n13#2:219\n512#3:220\n369#3:221\n513#3,2:222\n515#3:256\n217#3,2:257\n43#3:259\n16#4,4:224\n21#4,10:246\n65#5,18:228\n65#5,18:261\n162#6:260\n*S KotlinDebug\n*F\n+ 1 GBNetworkDispatcherKtor.kt\ncom/sdk/growthbook/network/GBNetworkDispatcherKtor$consumePOSTRequest$1\n*L\n140#1:219\n142#1:220\n142#1:221\n142#1:222,2\n142#1:256\n142#1:257,2\n142#1:259\n148#1:224,4\n148#1:246,10\n148#1:228,18\n154#1:261,18\n154#1:260\n*E\n"})
    static final class C1849b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f266389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f266390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f266391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f266392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f266393e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f266395g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f266396h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<Throwable, Unit> f266397i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Map<String, Object> f266398j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1849b(String str, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function2, Map<String, ? extends Object> map, kotlin.coroutines.d<? super C1849b> dVar) {
            super(2, dVar);
            this.f266395g = str;
            this.f266396h = function1;
            this.f266397i = function2;
            this.f266398j = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(w0 w0Var) {
            w0Var.l("Content-Type", "application/json");
            w0Var.l("Accept", "application/json");
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new C1849b(this.f266395g, this.f266396h, this.f266397i, this.f266398j, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:61:0x0175 A[Catch: all -> 0x002f, Exception -> 0x0032, TRY_ENTER, TryCatch #7 {Exception -> 0x0032, blocks: (B:8:0x0029, B:61:0x0175, B:62:0x017c, B:63:0x0185), top: B:83:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x017c A[Catch: all -> 0x002f, Exception -> 0x0032, TryCatch #7 {Exception -> 0x0032, blocks: (B:8:0x0029, B:61:0x0175, B:62:0x017c, B:63:0x0185), top: B:83:0x0029 }] */
        /* JADX WARN: Code duplicated, block: B:68:0x01c9 A[Catch: all -> 0x002f, TryCatch #9 {all -> 0x002f, blocks: (B:8:0x0029, B:61:0x0175, B:70:0x01e6, B:62:0x017c, B:63:0x0185, B:66:0x01c3, B:68:0x01c9, B:69:0x01e3), top: B:86:0x0011 }] */
        /* JADX WARN: Instruction removed from duplicated block: B:68:0x01c9, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.AutoCloseable] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v3 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            AutoCloseable autoCloseable;
            b bVar;
            Exception e10;
            Function1<Throwable, Unit> function1;
            s sVarA;
            AutoCloseable autoCloseable2;
            Function1<String, Unit> function2;
            Function1<Throwable, Unit> function3;
            b bVar2;
            s sVarA2;
            io.ktor.client.statement.c cVar;
            int iH0;
            s sVarA3;
            Function1<String, Unit> function4;
            ?? L = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266393e;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        autoCloseable2 = (AutoCloseable) this.f266392d;
                        bVar2 = (b) this.f266391c;
                        function3 = (Function1) this.f266390b;
                        function2 = (Function1) this.f266389a;
                        try {
                            ResultKt.m(obj);
                            cVar = (io.ktor.client.statement.c) obj;
                            iH0 = cVar.j().H0();
                            if (200 > iH0 && iH0 < 300) {
                                io.ktor.client.call.b bVarH = cVar.h();
                                kotlin.reflect.d dVarD = j1.d(String.class);
                                try {
                                    sVarA3 = j1.A(String.class);
                                } catch (Throwable unused) {
                                    sVarA3 = null;
                                }
                                ri.b bVar3 = new ri.b(dVarD, sVarA3);
                                this.f266389a = function3;
                                this.f266390b = bVar2;
                                this.f266391c = autoCloseable2;
                                this.f266392d = function2;
                                this.f266393e = 2;
                                obj = bVarH.e(bVar3, this);
                                if (obj != L) {
                                    autoCloseable = autoCloseable2;
                                    function4 = function2;
                                    if (obj != null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    function4.invoke((String) obj);
                                }
                                return L;
                            }
                            function3.invoke(new Exception("Response not successful status code is : " + cVar.j().H0() + " and description : " + cVar.j().G0()));
                            autoCloseable = autoCloseable2;
                        } catch (Exception e11) {
                            e10 = e11;
                            autoCloseable = autoCloseable2;
                            bVar = bVar2;
                            function1 = function3;
                            if (bVar.f266382b) {
                                System.out.println((Object) ("exception " + e10));
                            }
                            function1.invoke(e10);
                        } catch (Throwable th2) {
                            th = th2;
                            L = autoCloseable2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                kotlin.jdk7.a.c(L, th);
                                throw th3;
                            }
                        }
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function4 = (Function1) this.f266392d;
                        autoCloseable = (AutoCloseable) this.f266391c;
                        bVar = (b) this.f266390b;
                        function1 = (Function1) this.f266389a;
                        try {
                            ResultKt.m(obj);
                            if (obj != null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            function4.invoke((String) obj);
                        } catch (Exception e12) {
                            e10 = e12;
                            if (bVar.f266382b) {
                                System.out.println((Object) ("exception " + e10));
                            }
                            function1.invoke(e10);
                        }
                    }
                    if (bVar.f266382b) {
                        System.out.println((Object) ("exception " + e10));
                    }
                    function1.invoke(e10);
                } else {
                    ResultKt.m(obj);
                    io.ktor.client.c cVar2 = b.this.f266381a;
                    String str = this.f266395g;
                    Function1<String, Unit> function5 = this.f266396h;
                    Function1<Throwable, Unit> function6 = this.f266397i;
                    b bVar4 = b.this;
                    Map<String, Object> map = this.f266398j;
                    try {
                        y yVar = new y();
                        d0.o(yVar, str);
                        d0.e(yVar, new Function1() { // from class: com.sdk.growthbook.network.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return b.C1849b.m((w0) obj2);
                            }
                        });
                        i1.h(yVar, m.a.f295985a.k());
                        JsonElement jsonElementI = h.i(map);
                        if (jsonElementI == null) {
                            yVar.k(v.f295763a);
                            kotlin.reflect.d dVarD2 = j1.d(JsonElement.class);
                            try {
                                sVarA2 = j1.A(JsonElement.class);
                            } catch (Throwable unused2) {
                                sVarA2 = null;
                            }
                            yVar.l(new ri.b(dVarD2, sVarA2));
                        } else {
                            yVar.k(jsonElementI);
                            kotlin.reflect.d dVarD3 = j1.d(JsonElement.class);
                            try {
                                sVarA = j1.A(JsonElement.class);
                            } catch (Throwable unused3) {
                                sVarA = null;
                            }
                            yVar.l(new ri.b(dVarD3, sVarA));
                        }
                        if (bVar4.f266382b) {
                            System.out.println((Object) ("body = " + yVar.d()));
                        }
                        yVar.p(io.ktor.http.j1.f295897b.g());
                        io.ktor.client.statement.g gVar = new io.ktor.client.statement.g(yVar, cVar2);
                        this.f266389a = function5;
                        this.f266390b = function6;
                        this.f266391c = bVar4;
                        this.f266392d = cVar2;
                        this.f266393e = 1;
                        Object objD = gVar.d(this);
                        if (objD != L) {
                            autoCloseable2 = cVar2;
                            obj = objD;
                            function2 = function5;
                            function3 = function6;
                            bVar2 = bVar4;
                            cVar = (io.ktor.client.statement.c) obj;
                            iH0 = cVar.j().H0();
                            if (200 > iH0) {
                            }
                            function3.invoke(new Exception("Response not successful status code is : " + cVar.j().H0() + " and description : " + cVar.j().G0()));
                            autoCloseable = autoCloseable2;
                        }
                        return L;
                    } catch (Exception e13) {
                        autoCloseable = cVar2;
                        bVar = bVar4;
                        e10 = e13;
                        function1 = function6;
                        if (bVar.f266382b) {
                            System.out.println((Object) ("exception " + e10));
                        }
                        function1.invoke(e10);
                    } catch (Throwable th4) {
                        th = th4;
                        L = cVar2;
                        throw th;
                    }
                }
                Unit unit = Unit.f312394a;
                kotlin.jdk7.a.c(autoCloseable, null);
                return unit;
            } catch (Throwable th5) {
                th = th5;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1849b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.sdk.growthbook.network.GBNetworkDispatcherKtor$consumeSSEConnection$1", f = "GBNetworkDispatcherKtor.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<l0<? super com.sdk.growthbook.utils.s<? extends String>>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f266400b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f266402d;

        @kotlin.coroutines.jvm.internal.f(c = "com.sdk.growthbook.network.GBNetworkDispatcherKtor$consumeSSEConnection$1$1", f = "GBNetworkDispatcherKtor.kt", i = {}, l = {113, 113}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f266403a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f266404b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f266405c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l0<com.sdk.growthbook.utils.s<String>> f266406d;

            /* JADX INFO: renamed from: com.sdk.growthbook.network.b$c$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "com.sdk.growthbook.network.GBNetworkDispatcherKtor$consumeSSEConnection$1$1$1", f = "GBNetworkDispatcherKtor.kt", i = {}, l = {219, 115}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nGBNetworkDispatcherKtor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GBNetworkDispatcherKtor.kt\ncom/sdk/growthbook/network/GBNetworkDispatcherKtor$consumeSSEConnection$1$1$1\n+ 2 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,218:1\n162#2:219\n65#3,18:220\n*S KotlinDebug\n*F\n+ 1 GBNetworkDispatcherKtor.kt\ncom/sdk/growthbook/network/GBNetworkDispatcherKtor$consumeSSEConnection$1$1$1\n*L\n114#1:219\n114#1:220,18\n*E\n"})
            static final class C1850a extends o implements Function2<io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f266407a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f266408b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ l0<com.sdk.growthbook.utils.s<String>> f266409c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1850a(l0<? super com.sdk.growthbook.utils.s<String>> l0Var, kotlin.coroutines.d<? super C1850a> dVar) {
                    super(2, dVar);
                    this.f266409c = l0Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit n(l0 l0Var, com.sdk.growthbook.utils.s sVar) {
                    l0Var.p(sVar);
                    return Unit.f312394a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    C1850a c1850a = new C1850a(this.f266409c, dVar);
                    c1850a.f266408b = obj;
                    return c1850a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
                
                    if (com.sdk.growthbook.utils.u.c((io.ktor.utils.io.h) r8, r3, r7) == r0) goto L20;
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
                        int r1 = r7.f266407a
                        r6 = 0
                        r2 = 2
                        r3 = 1
                        r6 = 3
                        if (r1 == 0) goto L22
                        if (r1 == r3) goto L1d
                        if (r1 != r2) goto L14
                        kotlin.ResultKt.m(r8)
                        goto L68
                    L14:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        r6 = 6
                        throw r7
                    L1d:
                        r6 = 5
                        kotlin.ResultKt.m(r8)
                        goto L4f
                    L22:
                        kotlin.ResultKt.m(r8)
                        java.lang.Object r8 = r7.f266408b
                        io.ktor.client.statement.c r8 = (io.ktor.client.statement.c) r8
                        io.ktor.client.call.b r8 = r8.h()
                        r6 = 1
                        java.lang.Class<io.ktor.utils.io.h> r1 = io.ktor.utils.io.h.class
                        r6 = 7
                        kotlin.reflect.d r4 = kotlin.jvm.internal.j1.d(r1)
                        r6 = 1
                        kotlin.reflect.s r1 = kotlin.jvm.internal.j1.A(r1)     // Catch: java.lang.Throwable -> L3c
                        r6 = 2
                        goto L3e
                    L3c:
                        r1 = 6
                        r1 = 0
                    L3e:
                        ri.b r5 = new ri.b
                        r5.<init>(r4, r1)
                        r7.f266407a = r3
                        r6 = 4
                        java.lang.Object r8 = r8.e(r5, r7)
                        r6 = 6
                        if (r8 != r0) goto L4f
                        r6 = 7
                        goto L66
                    L4f:
                        if (r8 == 0) goto L6c
                        r6 = 2
                        io.ktor.utils.io.h r8 = (io.ktor.utils.io.h) r8
                        kotlinx.coroutines.channels.l0<com.sdk.growthbook.utils.s<java.lang.String>> r1 = r7.f266409c
                        r6 = 7
                        com.sdk.growthbook.network.d r3 = new com.sdk.growthbook.network.d
                        r6 = 5
                        r3.<init>()
                        r7.f266407a = r2
                        java.lang.Object r7 = com.sdk.growthbook.utils.u.c(r8, r3, r7)
                        r6 = 2
                        if (r7 != r0) goto L68
                    L66:
                        r6 = 6
                        return r0
                    L68:
                        kotlin.Unit r7 = kotlin.Unit.f312394a
                        r6 = 3
                        return r7
                    L6c:
                        r6 = 1
                        java.lang.NullPointerException r7 = new java.lang.NullPointerException
                        r6 = 6
                        java.lang.String r8 = "null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel"
                        r7.<init>(r8)
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sdk.growthbook.network.b.c.a.C1850a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public final Object invoke(io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C1850a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b bVar, String str, l0<? super com.sdk.growthbook.utils.s<String>> l0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f266404b = bVar;
                this.f266405c = str;
                this.f266406d = l0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f266404b, this.f266405c, this.f266406d, dVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
            
                if (((io.ktor.client.statement.g) r14).e(r13, r9) == r0) goto L26;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
                /*
                    r13 = this;
                    r12 = 2
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r13.f266403a
                    r2 = 2
                    r3 = 1
                    r12 = 1
                    r4 = 0
                    r12 = 6
                    if (r1 == 0) goto L33
                    r12 = 1
                    if (r1 == r3) goto L2c
                    if (r1 != r2) goto L23
                    kotlin.ResultKt.m(r14)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
                    r9 = r13
                    r12 = 1
                    goto L65
                L19:
                    r0 = move-exception
                    r14 = r0
                    r9 = r13
                    r12 = 0
                    goto L8c
                L1e:
                    r0 = move-exception
                    r14 = r0
                    r9 = r13
                    r12 = 3
                    goto L7c
                L23:
                    r12 = 7
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L2c:
                    kotlin.ResultKt.m(r14)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1e
                    r9 = r13
                    r9 = r13
                    r12 = 5
                    goto L50
                L33:
                    kotlin.ResultKt.m(r14)
                    com.sdk.growthbook.network.b r5 = r13.f266404b     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78
                    r12 = 6
                    java.lang.String r6 = r13.f266405c     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78
                    r13.f266403a = r3     // Catch: java.lang.Throwable -> L74 java.lang.Exception -> L78
                    r7 = 0
                    r12 = r7
                    r8 = 0
                    r12 = r12 ^ r8
                    r10 = 6
                    r12 = r10
                    r11 = 0
                    r9 = r13
                    r9 = r13
                    r12 = 4
                    java.lang.Object r14 = com.sdk.growthbook.network.b.j(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
                    r12 = 5
                    if (r14 != r0) goto L50
                    r12 = 3
                    goto L64
                L50:
                    io.ktor.client.statement.g r14 = (io.ktor.client.statement.g) r14     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
                    r12 = 0
                    com.sdk.growthbook.network.b$c$a$a r13 = new com.sdk.growthbook.network.b$c$a$a     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
                    kotlinx.coroutines.channels.l0<com.sdk.growthbook.utils.s<java.lang.String>> r1 = r9.f266406d     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
                    r13.<init>(r1, r4)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
                    r12 = 1
                    r9.f266403a = r2     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
                    java.lang.Object r13 = r14.e(r13, r9)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
                    r12 = 2
                    if (r13 != r0) goto L65
                L64:
                    return r0
                L65:
                    kotlinx.coroutines.channels.l0<com.sdk.growthbook.utils.s<java.lang.String>> r13 = r9.f266406d
                    r12 = 5
                    kotlinx.coroutines.channels.o0.a.a(r13, r4, r3, r4)
                    r12 = 6
                    goto L88
                L6d:
                    r0 = move-exception
                L6e:
                    r14 = r0
                    goto L8c
                L70:
                    r0 = move-exception
                L71:
                    r14 = r0
                    r14 = r0
                    goto L7c
                L74:
                    r0 = move-exception
                    r9 = r13
                    r12 = 1
                    goto L6e
                L78:
                    r0 = move-exception
                    r9 = r13
                    r9 = r13
                    goto L71
                L7c:
                    kotlinx.coroutines.channels.l0<com.sdk.growthbook.utils.s<java.lang.String>> r13 = r9.f266406d     // Catch: java.lang.Throwable -> L6d
                    com.sdk.growthbook.utils.s$a r0 = new com.sdk.growthbook.utils.s$a     // Catch: java.lang.Throwable -> L6d
                    r12 = 5
                    r0.<init>(r14)     // Catch: java.lang.Throwable -> L6d
                    r13.p(r0)     // Catch: java.lang.Throwable -> L6d
                    goto L65
                L88:
                    kotlin.Unit r13 = kotlin.Unit.f312394a
                    r12 = 7
                    return r13
                L8c:
                    kotlinx.coroutines.channels.l0<com.sdk.growthbook.utils.s<java.lang.String>> r13 = r9.f266406d
                    kotlinx.coroutines.channels.o0.a.a(r13, r4, r3, r4)
                    throw r14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sdk.growthbook.network.b.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f266402d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = b.this.new c(this.f266402d, dVar);
            cVar.f266400b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(l0<? super com.sdk.growthbook.utils.s<? extends String>> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return invoke2((l0<? super com.sdk.growthbook.utils.s<String>>) l0Var, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266399a;
            if (i10 == 0) {
                ResultKt.m(obj);
                l0 l0Var = (l0) this.f266400b;
                k.f(t0.a(com.sdk.growthbook.a.a()), null, null, new a(b.this, this.f266402d, l0Var, null), 3, null);
                this.f266399a = 1;
                if (j0.c(l0Var, null, this, 1, null) == objL) {
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
        public final Object invoke2(l0<? super com.sdk.growthbook.utils.s<String>> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, false, 3, 0 == true ? 1 : 0);
        int i10 = 3 << 3;
    }

    private final void h(y yVar, String str, String str2) {
        if (str2 != null) {
            yVar.i().k().remove(str);
            yVar.i().k().l(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(String str, final Map<String, String> map, Map<String, String> map2, kotlin.coroutines.d<? super io.ktor.client.statement.g> dVar) {
        io.ktor.client.c cVar = this.f266381a;
        y yVar = new y();
        d0.o(yVar, str);
        d0.e(yVar, new Function1() { // from class: com.sdk.growthbook.network.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.k(map, (w0) obj);
            }
        });
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            h(yVar, entry.getKey(), entry.getValue());
        }
        yVar.p(io.ktor.http.j1.f295897b.c());
        return new io.ktor.client.statement.g(yVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object j(b bVar, String str, Map map, Map map2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i10 & 4) != 0) {
            map2 = MapsKt.emptyMap();
        }
        return bVar.i(str, map, map2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Map map, w0 headers) {
        Intrinsics.checkNotNullParameter(headers, "$this$headers");
        for (Map.Entry entry : map.entrySet()) {
            headers.l((String) entry.getKey(), (String) entry.getValue());
        }
        return Unit.f312394a;
    }

    @Override // com.sdk.growthbook.network.i
    public void a(@NotNull String url, @NotNull Map<String, ? extends Object> bodyParams, @NotNull Function1<? super String, Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bodyParams, "bodyParams");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        int i10 = 2 >> 0;
        k.f(t0.a(com.sdk.growthbook.a.a()), null, null, new C1849b(url, onSuccess, onError, bodyParams, null), 3, null);
    }

    @Override // com.sdk.growthbook.network.i
    @NotNull
    public p2 b(@NotNull String request, @NotNull Function1<? super String, Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return k.f(t0.a(com.sdk.growthbook.a.a()), null, null, new a(request, onSuccess, onError, null), 3, null);
    }

    @Override // com.sdk.growthbook.network.i
    @NotNull
    public kotlinx.coroutines.flow.i<com.sdk.growthbook.utils.s<String>> c(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return kotlinx.coroutines.flow.k.t(new c(url, null));
    }

    public final void l(boolean z10) {
        this.f266382b = z10;
    }

    public b(@NotNull io.ktor.client.c client, boolean z10) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f266381a = client;
        this.f266382b = z10;
    }

    public /* synthetic */ b(io.ktor.client.c cVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? h.d() : cVar, (i10 & 2) != 0 ? false : z10);
    }
}
