package com.superwall.sdk.network;

import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.EitherKt;
import com.superwall.sdk.network.session.CustomHttpUrlConnection;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.q0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.m0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.NetworkService$get$$inlined$request$default$1", f = "NetworkService.kt", i = {0}, l = {35}, m = "invokeSuspend", n = {"requestData"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nCustomURLSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomURLSession.kt\ncom/superwall/sdk/network/session/CustomHttpUrlConnection$request$2\n+ 2 NetworkService.kt\ncom/superwall/sdk/network/NetworkService\n*L\n1#1,65:1\n33#2,7:66\n29#2,12:73\n*E\n"})
public final class NetworkService$get$$inlined$request$default$1<T> extends o implements Function1<kotlin.coroutines.d<? super Either<? extends T, NetworkError>>, Object> {
    final /* synthetic */ boolean $isForDebugging$inlined;
    final /* synthetic */ String $path$inlined;
    final /* synthetic */ List $queryItems$inlined;
    final /* synthetic */ String $requestId$inlined;
    Object L$0;
    int label;
    final /* synthetic */ NetworkService this$0;
    final /* synthetic */ CustomHttpUrlConnection this$0$inline_fun;

    /* JADX INFO: renamed from: com.superwall.sdk.network.NetworkService$get$$inlined$request$default$1$1, reason: invalid class name */
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

    /* JADX INFO: renamed from: com.superwall.sdk.network.NetworkService$get$$inlined$request$default$1$2, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nCustomURLSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomURLSession.kt\ncom/superwall/sdk/network/session/CustomHttpUrlConnection$request$2$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,68:1\n147#2:69\n*S KotlinDebug\n*F\n+ 1 CustomURLSession.kt\ncom/superwall/sdk/network/session/CustomHttpUrlConnection$request$2$2\n*L\n45#1:69\n*E\n"})
    public static final class AnonymousClass2 implements Function1<RequestResult, Either<? extends T, NetworkError>> {
        final /* synthetic */ NetworkRequestData $requestData;
        final /* synthetic */ CustomHttpUrlConnection this$0;

        public AnonymousClass2(CustomHttpUrlConnection customHttpUrlConnection, NetworkRequestData networkRequestData) {
            this.this$0 = customHttpUrlConnection;
            this.$requestData = networkRequestData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Either<T, NetworkError> invoke(RequestResult it) {
            String string;
            Intrinsics.checkNotNullParameter(it, "it");
            try {
                Json json = this.this$0.getJson();
                String responseMessage = it.getResponseMessage();
                kotlinx.serialization.modules.f serializersModule = json.getSerializersModule();
                Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
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
                Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
                Logger.debug$default(logger, logLevel, logScope, "Request Error", MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("message", "Unable to decode response to type " + j1.d(Object.class).Q()), TuplesKt.to("info", it.getResponseMessage()), TuplesKt.to("request_duration", Double.valueOf(it.getDuration()))), null, 16, null);
                return new Either.Failure(new NetworkError.Decoding(th2));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkService$get$$inlined$request$default$1(CustomHttpUrlConnection customHttpUrlConnection, kotlin.coroutines.d dVar, NetworkService networkService, String str, List list, String str2, boolean z10) {
        super(1, dVar);
        this.this$0$inline_fun = customHttpUrlConnection;
        this.this$0 = networkService;
        this.$path$inlined = str;
        this.$queryItems$inlined = list;
        this.$requestId$inlined = str2;
        this.$isForDebugging$inlined = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new NetworkService$get$$inlined$request$default$1(this.this$0$inline_fun, dVar, this.this$0, this.$path$inlined, this.$queryItems$inlined, this.$requestId$inlined, this.$isForDebugging$inlined);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NetworkRequestData<?> networkRequestData;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            NetworkRequestData<?> networkRequestData2 = new NetworkRequestData<>(new NetworkRequestData.Components(null, this.this$0.getHost(), this.this$0.getVersion() + this.$path$inlined, this.$queryItems$inlined, null, 17, null), null, NetworkRequestData.HttpMethod.GET, this.$requestId$inlined, this.$isForDebugging$inlined, new NetworkService$get$2$1(this.this$0), 2, null);
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
        Either map = EitherKt.map((Either) obj, new AnonymousClass1(this.this$0$inline_fun));
        Intrinsics.needClassReification();
        return EitherKt.flatMap(map, new AnonymousClass2(this.this$0$inline_fun, networkRequestData));
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        int i10 = 5 | 0;
        NetworkRequestData<?> networkRequestData = new NetworkRequestData<>(new NetworkRequestData.Components(null, this.this$0.getHost(), this.this$0.getVersion() + this.$path$inlined, this.$queryItems$inlined, null, 17, null), null, NetworkRequestData.HttpMethod.GET, this.$requestId$inlined, this.$isForDebugging$inlined, new NetworkService$get$2$1(this.this$0), 2, null);
        RequestExecutor requestExecutor = this.this$0$inline_fun.getRequestExecutor();
        h0.e(0);
        Object objExecute = requestExecutor.execute(networkRequestData, this);
        h0.e(1);
        Either map = EitherKt.map((Either) objExecute, new AnonymousClass1(this.this$0$inline_fun));
        Intrinsics.needClassReification();
        return EitherKt.flatMap(map, new AnonymousClass2(this.this$0$inline_fun, networkRequestData));
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Either<? extends T, NetworkError>> dVar) {
        return ((NetworkService$get$$inlined$request$default$1) create(dVar)).invokeSuspend(Unit.f312394a);
    }
}
