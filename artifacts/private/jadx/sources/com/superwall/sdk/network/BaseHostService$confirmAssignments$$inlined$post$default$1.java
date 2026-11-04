package com.superwall.sdk.network;

import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.EitherKt;
import com.superwall.sdk.models.assignment.ConfirmedAssignmentResponse;
import com.superwall.sdk.network.session.CustomHttpUrlConnection;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.json.Json;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.BaseHostService$confirmAssignments$$inlined$post$default$1", f = "BaseHostService.kt", i = {0}, l = {35}, m = "invokeSuspend", n = {"requestData"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nCustomURLSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomURLSession.kt\ncom/superwall/sdk/network/session/CustomHttpUrlConnection$request$2\n+ 2 NetworkService.kt\ncom/superwall/sdk/network/NetworkService\n*L\n1#1,65:1\n58#2,7:66\n54#2,12:73\n*E\n"})
public final class BaseHostService$confirmAssignments$$inlined$post$default$1 extends o implements Function1<kotlin.coroutines.d<? super Either<? extends ConfirmedAssignmentResponse, NetworkError>>, Object> {
    final /* synthetic */ byte[] $body$inlined;
    final /* synthetic */ boolean $isForDebugging$inlined;
    final /* synthetic */ String $path$inlined;
    final /* synthetic */ String $requestId$inlined;
    Object L$0;
    int label;
    final /* synthetic */ NetworkService this$0;
    final /* synthetic */ CustomHttpUrlConnection this$0$inline_fun;

    /* JADX INFO: renamed from: com.superwall.sdk.network.BaseHostService$confirmAssignments$$inlined$post$default$1$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends g0 implements n<Boolean, String, kotlin.coroutines.d<? super Map<String, ? extends String>>, Object>, kotlin.coroutines.jvm.internal.n {
        public AnonymousClass1(Object obj) {
            super(3, obj, NetworkService.class, "makeHeaders", "makeHeaders(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, String str, kotlin.coroutines.d<? super Map<String, ? extends String>> dVar) {
            return invoke(bool.booleanValue(), str, (kotlin.coroutines.d<? super Map<String, String>>) dVar);
        }

        public final Object invoke(boolean z10, String str, kotlin.coroutines.d<? super Map<String, String>> dVar) {
            return ((NetworkService) this.receiver).makeHeaders(z10, str, dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseHostService$confirmAssignments$$inlined$post$default$1(CustomHttpUrlConnection customHttpUrlConnection, kotlin.coroutines.d dVar, NetworkService networkService, String str, byte[] bArr, String str2, boolean z10) {
        super(1, dVar);
        this.this$0 = networkService;
        this.$path$inlined = str;
        this.$body$inlined = bArr;
        this.$requestId$inlined = str2;
        this.$isForDebugging$inlined = z10;
        this.this$0$inline_fun = customHttpUrlConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new BaseHostService$confirmAssignments$$inlined$post$default$1(this.this$0$inline_fun, dVar, this.this$0, this.$path$inlined, this.$body$inlined, this.$requestId$inlined, this.$isForDebugging$inlined);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        final NetworkRequestData<?> networkRequestData;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            int i11 = 3 & 0;
            int i12 = 6 | 2;
            NetworkRequestData<?> networkRequestData2 = new NetworkRequestData<>(new NetworkRequestData.Components(null, this.this$0.getHost(), this.this$0.getVersion() + this.$path$inlined, null, this.$body$inlined, 9, null), null, NetworkRequestData.HttpMethod.POST, this.$requestId$inlined, this.$isForDebugging$inlined, new AnonymousClass1(this.this$0), 2, null);
            RequestExecutor requestExecutor = this.this$0$inline_fun.getRequestExecutor();
            this.L$0 = networkRequestData2;
            this.label = 1;
            obj = requestExecutor.execute(networkRequestData2, this);
            if (obj == objL) {
                return objL;
            }
            networkRequestData = networkRequestData2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            networkRequestData = (NetworkRequestData) this.L$0;
            ResultKt.m(obj);
        }
        final CustomHttpUrlConnection customHttpUrlConnection = this.this$0$inline_fun;
        Either map = EitherKt.map((Either) obj, new Function1<RequestResult, RequestResult>() { // from class: com.superwall.sdk.network.BaseHostService$confirmAssignments$$inlined$post$default$1.2
            @Override // kotlin.jvm.functions.Function1
            public final RequestResult invoke(RequestResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (!customHttpUrlConnection.getInterceptors().isEmpty()) {
                    Iterator<T> it2 = customHttpUrlConnection.getInterceptors().iterator();
                    while (it2.hasNext()) {
                        it = (RequestResult) ((Function1) it2.next()).invoke(it);
                    }
                }
                return it;
            }
        });
        final CustomHttpUrlConnection customHttpUrlConnection2 = this.this$0$inline_fun;
        return EitherKt.flatMap(map, new Function1<RequestResult, Either<? extends ConfirmedAssignmentResponse, NetworkError>>() { // from class: com.superwall.sdk.network.BaseHostService$confirmAssignments$$inlined$post$default$1.3
            @Override // kotlin.jvm.functions.Function1
            public final Either<ConfirmedAssignmentResponse, NetworkError> invoke(RequestResult it) {
                String string;
                Intrinsics.checkNotNullParameter(it, "it");
                try {
                    Json json = customHttpUrlConnection2.getJson();
                    String responseMessage = it.getResponseMessage();
                    json.getSerializersModule();
                    return new Either.Success(json.decodeFromString(ConfirmedAssignmentResponse.Companion.serializer(), responseMessage));
                } catch (Throwable th2) {
                    Logger logger = Logger.INSTANCE;
                    LogLevel logLevel = LogLevel.error;
                    LogScope logScope = LogScope.network;
                    Pair pair = TuplesKt.to("request", it.toString());
                    Pair pair2 = TuplesKt.to("api_key", RequestResultKt.authHeader(it));
                    URI url = networkRequestData.getUrl();
                    if (url == null || (string = url.toString()) == null) {
                        string = "unknown";
                    }
                    Logger.debug$default(logger, logLevel, logScope, "Request Error", MapsKt.mapOf(pair, pair2, TuplesKt.to("url", string), TuplesKt.to("message", "Unable to decode response to type " + j1.d(ConfirmedAssignmentResponse.class).Q()), TuplesKt.to("info", it.getResponseMessage()), TuplesKt.to("request_duration", Double.valueOf(it.getDuration()))), null, 16, null);
                    return new Either.Failure(new NetworkError.Decoding(th2));
                }
            }
        });
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Either<? extends ConfirmedAssignmentResponse, NetworkError>> dVar) {
        return ((BaseHostService$confirmAssignments$$inlined$post$default$1) create(dVar)).invokeSuspend(Unit.f312394a);
    }
}
