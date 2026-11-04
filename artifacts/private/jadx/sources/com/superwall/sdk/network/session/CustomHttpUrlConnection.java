package com.superwall.sdk.network.session;

import com.devtodev.core.network.Response;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.EitherKt;
import com.superwall.sdk.misc.Task_RetryingKt;
import com.superwall.sdk.network.NetworkError;
import com.superwall.sdk.network.NetworkRequestData;
import com.superwall.sdk.network.RequestExecutor;
import com.superwall.sdk.network.RequestResult;
import com.superwall.sdk.network.RequestResultKt;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.q0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class CustomHttpUrlConnection {

    @NotNull
    private final List<Function1<RequestResult, RequestResult>> interceptors;

    @NotNull
    private final Json json;

    @NotNull
    private final RequestExecutor requestExecutor;

    /* JADX INFO: Add missing generic type declarations: [Response] */
    /* JADX INFO: renamed from: com.superwall.sdk.network.session.CustomHttpUrlConnection$request$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.network.session.CustomHttpUrlConnection$request$2", f = "CustomURLSession.kt", i = {1}, l = {33, 35}, m = "invokeSuspend", n = {"requestData"}, s = {"L$0"})
    public static final class AnonymousClass2<Response> extends o implements Function1<d<? super Either<? extends Response, NetworkError>>, Object> {
        final /* synthetic */ Function1<d<? super NetworkRequestData<Response>>, Object> $buildRequestData;
        Object L$0;
        int label;
        final /* synthetic */ CustomHttpUrlConnection this$0;

        /* JADX INFO: renamed from: com.superwall.sdk.network.session.CustomHttpUrlConnection$request$2$1, reason: invalid class name */
        @SourceDebugExtension({"SMAP\nCustomURLSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomURLSession.kt\ncom/superwall/sdk/network/session/CustomHttpUrlConnection$request$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1797#2,3:69\n*S KotlinDebug\n*F\n+ 1 CustomURLSession.kt\ncom/superwall/sdk/network/session/CustomHttpUrlConnection$request$2$1\n*L\n38#1:69,3\n*E\n"})
        public static final class AnonymousClass1 implements Function1<RequestResult, RequestResult> {
            final /* synthetic */ CustomHttpUrlConnection this$0;

            public AnonymousClass1(CustomHttpUrlConnection customHttpUrlConnection) {
                this.this$0 = customHttpUrlConnection;
            }

            @Override // kotlin.jvm.functions.Function1
            public final RequestResult invoke(RequestResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (!this.this$0.getInterceptors().isEmpty()) {
                    Iterator<T> it2 = this.this$0.getInterceptors().iterator();
                    while (it2.hasNext()) {
                        it = (RequestResult) ((Function1) it2.next()).invoke(it);
                    }
                }
                return it;
            }
        }

        /* JADX INFO: renamed from: com.superwall.sdk.network.session.CustomHttpUrlConnection$request$2$2, reason: invalid class name and collision with other inner class name */
        @SourceDebugExtension({"SMAP\nCustomURLSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomURLSession.kt\ncom/superwall/sdk/network/session/CustomHttpUrlConnection$request$2$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,68:1\n147#2:69\n*S KotlinDebug\n*F\n+ 1 CustomURLSession.kt\ncom/superwall/sdk/network/session/CustomHttpUrlConnection$request$2$2\n*L\n45#1:69\n*E\n"})
        public static final class C18762 implements Function1<RequestResult, Either<? extends Response, NetworkError>> {
            final /* synthetic */ NetworkRequestData<Response> $requestData;
            final /* synthetic */ CustomHttpUrlConnection this$0;

            public C18762(CustomHttpUrlConnection customHttpUrlConnection, NetworkRequestData<Response> networkRequestData) {
                this.this$0 = customHttpUrlConnection;
                this.$requestData = networkRequestData;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Either<Response, NetworkError> invoke(RequestResult it) {
                String string;
                Intrinsics.checkNotNullParameter(it, "it");
                try {
                    Json json = this.this$0.getJson();
                    String responseMessage = it.getResponseMessage();
                    kotlinx.serialization.modules.f serializersModule = json.getSerializersModule();
                    Intrinsics.reifiedOperationMarker(6, Response.TAG);
                    q0.n("kotlinx.serialization.serializer.withModule");
                    return new Either.Success(json.decodeFromString(m0.o(serializersModule, null), responseMessage));
                } catch (Throwable th2) {
                    Logger logger = Logger.INSTANCE;
                    LogLevel logLevel = LogLevel.error;
                    LogScope logScope = LogScope.network;
                    Pair pair = TuplesKt.to("request", it.toString());
                    Pair pair2 = TuplesKt.to("api_key", RequestResultKt.authHeader(it));
                    URI url = this.$requestData.getUrl();
                    if (url == null || (string = url.toString()) == null) {
                        string = "unknown";
                    }
                    Pair pair3 = TuplesKt.to("url", string);
                    Intrinsics.reifiedOperationMarker(4, Response.TAG);
                    Logger.debug$default(logger, logLevel, logScope, "Request Error", MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("message", "Unable to decode response to type " + j1.d(Object.class).Q()), TuplesKt.to("info", it.getResponseMessage()), TuplesKt.to("request_duration", Double.valueOf(it.getDuration()))), null, 16, null);
                    return new Either.Failure(new NetworkError.Decoding(th2));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super d<? super NetworkRequestData<Response>>, ? extends Object> function1, CustomHttpUrlConnection customHttpUrlConnection, d<? super AnonymousClass2> dVar) {
            super(1, dVar);
            this.$buildRequestData = function1;
            this.this$0 = customHttpUrlConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(d<?> dVar) {
            Intrinsics.needClassReification();
            return new AnonymousClass2(this.$buildRequestData, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            NetworkRequestData<?> networkRequestData;
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function1<d<? super NetworkRequestData<Response>>, Object> function1 = this.$buildRequestData;
                this.label = 1;
                obj = function1.invoke(this);
                if (obj == objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                ResultKt.m(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                networkRequestData = (NetworkRequestData) this.L$0;
                ResultKt.m(obj);
            }
            Either map = EitherKt.map((Either) obj, new AnonymousClass1(this.this$0));
            Intrinsics.needClassReification();
            return EitherKt.flatMap(map, new C18762(this.this$0, networkRequestData));
            NetworkRequestData<?> networkRequestData2 = (NetworkRequestData) obj;
            RequestExecutor requestExecutor = this.this$0.getRequestExecutor();
            this.L$0 = networkRequestData2;
            this.label = 2;
            Object objExecute = requestExecutor.execute(networkRequestData2, this);
            if (objExecute != objL) {
                networkRequestData = networkRequestData2;
                obj = objExecute;
                Either map2 = EitherKt.map((Either) obj, new AnonymousClass1(this.this$0));
                Intrinsics.needClassReification();
                return EitherKt.flatMap(map2, new C18762(this.this$0, networkRequestData));
            }
            return objL;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            NetworkRequestData<?> networkRequestData = (NetworkRequestData) this.$buildRequestData.invoke(this);
            RequestExecutor requestExecutor = this.this$0.getRequestExecutor();
            h0.e(0);
            Object objExecute = requestExecutor.execute(networkRequestData, this);
            h0.e(1);
            Either map = EitherKt.map((Either) objExecute, new AnonymousClass1(this.this$0));
            Intrinsics.needClassReification();
            return EitherKt.flatMap(map, new C18762(this.this$0, networkRequestData));
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(d<? super Either<? extends Response, NetworkError>> dVar) {
            return ((AnonymousClass2) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomHttpUrlConnection(@NotNull Json json, @NotNull RequestExecutor requestExecutor, @NotNull List<? extends Function1<? super RequestResult, RequestResult>> interceptors) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.json = json;
        this.requestExecutor = requestExecutor;
        this.interceptors = interceptors;
    }

    public static /* synthetic */ Object request$default(CustomHttpUrlConnection customHttpUrlConnection, Function1 function1, int i10, Function1 function2, d dVar, int i11, Object obj) throws NetworkError {
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        Intrinsics.needClassReification();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(function1, customHttpUrlConnection, null);
        h0.e(0);
        Object objRetrying = Task_RetryingKt.retrying(i10, function2, anonymousClass2, dVar);
        h0.e(1);
        return objRetrying;
    }

    @NotNull
    public final List<Function1<RequestResult, RequestResult>> getInterceptors() {
        return this.interceptors;
    }

    @NotNull
    public final Json getJson() {
        return this.json;
    }

    @NotNull
    public final RequestExecutor getRequestExecutor() {
        return this.requestExecutor;
    }

    public final /* synthetic */ <Response> Object request(Function1<? super d<? super NetworkRequestData<Response>>, ? extends Object> function1, int i10, Function1<? super d<? super Unit>, ? extends Object> function2, d<? super Either<? extends Response, NetworkError>> dVar) throws NetworkError {
        Intrinsics.needClassReification();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(function1, this, null);
        h0.e(0);
        Object objRetrying = Task_RetryingKt.retrying(i10, function2, anonymousClass2, dVar);
        h0.e(1);
        return objRetrying;
    }

    public /* synthetic */ CustomHttpUrlConnection(Json json, RequestExecutor requestExecutor, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, requestExecutor, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }
}
