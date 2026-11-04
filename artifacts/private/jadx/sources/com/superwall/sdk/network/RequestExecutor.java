package com.superwall.sdk.network;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.Either;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nRequestExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestExecutor.kt\ncom/superwall/sdk/network/RequestExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,201:1\n1#2:202\n216#3,2:203\n*S KotlinDebug\n*F\n+ 1 RequestExecutor.kt\ncom/superwall/sdk/network/RequestExecutor\n*L\n132#1:203,2\n*E\n"})
public final class RequestExecutor {

    @NotNull
    private final n<Boolean, String, kotlin.coroutines.d<? super Map<String, String>>, Object> buildHeaders;

    /* JADX INFO: renamed from: com.superwall.sdk.network.RequestExecutor$execute$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.RequestExecutor", f = "RequestExecutor.kt", i = {0, 0}, l = {18, com.planner5d.library.engine.input.f.b.f160707m}, m = "execute", n = {"this", "requestData"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RequestExecutor.this.execute(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RequestExecutor(@NotNull n<? super Boolean, ? super String, ? super kotlin.coroutines.d<? super Map<String, String>>, ? extends Object> buildHeaders) {
        Intrinsics.checkNotNullParameter(buildHeaders, "buildHeaders");
        this.buildHeaders = buildHeaders;
    }

    private final <T> HttpURLConnection buildRequest(NetworkRequestData<T> networkRequestData, Map<String, String> map) throws IOException {
        URL url;
        if (networkRequestData.getComponents() != null) {
            List<URLQueryItem> queryItems = networkRequestData.getComponents().getQueryItems();
            String strJoinToString$default = queryItems != null ? CollectionsKt.joinToString$default(queryItems, "&", null, null, 0, null, new Function1() { // from class: com.superwall.sdk.network.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RequestExecutor.buildRequest$lambda$1((URLQueryItem) obj);
                }
            }, 30, null) : null;
            String scheme = networkRequestData.getComponents().getScheme();
            String host = networkRequestData.getComponents().getHost();
            String path = networkRequestData.getComponents().getPath();
            if (strJoinToString$default == null) {
                strJoinToString$default = "";
            }
            url = new URL(scheme + "://" + host + path + com.planner5d.library.model.payments.a.f222474i + strJoinToString$default);
        } else {
            if (networkRequestData.getUrl() == null) {
                return null;
            }
            url = networkRequestData.getUrl().toURL();
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        httpURLConnection.setDoOutput(Intrinsics.areEqual(networkRequestData.getMethod().getMethod(), NetworkRequestData.HttpMethod.POST.getMethod()));
        NetworkRequestData.Components components = networkRequestData.getComponents();
        if ((components != null ? components.getBodyData() : null) != null) {
            httpURLConnection.setDoInput(true);
        }
        NetworkRequestData.Components components2 = networkRequestData.getComponents();
        if ((components2 != null ? components2.getBodyData() : null) != null) {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(networkRequestData.getComponents().getBodyData());
            outputStream.close();
        }
        httpURLConnection.setRequestMethod(networkRequestData.getMethod().getMethod());
        return httpURLConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence buildRequest$lambda$1(URLQueryItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getName() + "=" + it.getValue();
    }

    private final String getRequestId(HttpURLConnection httpURLConnection, String str, double d10) throws IOException, NetworkError {
        String headerField = httpURLConnection.getHeaderField("x-request-id");
        if (headerField == null) {
            headerField = "unknown";
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 401) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.network, "Unable to Authenticate", MapsKt.mapOf(TuplesKt.to("request", httpURLConnection.toString()), TuplesKt.to("api_key", str), TuplesKt.to("url", httpURLConnection.getURL().toString()), TuplesKt.to("request_id", headerField), TuplesKt.to("request_duration", Double.valueOf(d10))), null, 16, null);
            throw new NetworkError.NotAuthenticated();
        }
        if (responseCode != 404) {
            return headerField;
        }
        Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.network, "Not Found", MapsKt.mapOf(TuplesKt.to("request", httpURLConnection.toString()), TuplesKt.to("api_key", str), TuplesKt.to("url", httpURLConnection.getURL().toString()), TuplesKt.to("request_id", headerField), TuplesKt.to("request_duration", Double.valueOf(d10))), null, 16, null);
        throw new NetworkError.NotFound();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Nullable
    public final Object execute(@NotNull NetworkRequestData<?> networkRequestData, @NotNull kotlin.coroutines.d<? super Either<RequestResult, NetworkError>> dVar) {
        AnonymousClass1 anonymousClass1;
        NetworkRequestData<?> networkRequestData2;
        Map<String, String> map;
        String requestProperty;
        String string;
        String string2;
        NetworkError unknown;
        String string3;
        RequestExecutor requestExecutor = this;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = requestExecutor.new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = requestExecutor.new AnonymousClass1(dVar);
        }
        Object objInvoke = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.m(objInvoke);
                    n<Boolean, String, kotlin.coroutines.d<? super Map<String, String>>, Object> nVar = requestExecutor.buildHeaders;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(networkRequestData.isForDebugging());
                    String requestId = networkRequestData.getRequestId();
                    anonymousClass1.L$0 = requestExecutor;
                    networkRequestData2 = networkRequestData;
                    anonymousClass1.L$1 = networkRequestData2;
                    anonymousClass1.label = 1;
                    objInvoke = nVar.invoke(boolA, requestId, anonymousClass1);
                    if (objInvoke == objL) {
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(objInvoke);
                    return objInvoke;
                }
                NetworkRequestData<?> networkRequestData3 = (NetworkRequestData) anonymousClass1.L$1;
                RequestExecutor requestExecutor2 = (RequestExecutor) anonymousClass1.L$0;
                ResultKt.m(objInvoke);
                networkRequestData2 = networkRequestData3;
                requestExecutor = requestExecutor2;
                HttpURLConnection httpURLConnectionBuildRequest = requestExecutor.buildRequest(networkRequestData2, map);
                if (httpURLConnectionBuildRequest != null && (requestProperty = httpURLConnectionBuildRequest.getRequestProperty("Authorization")) != null) {
                    Logger logger = Logger.INSTANCE;
                    LogLevel logLevel = LogLevel.debug;
                    LogScope logScope = LogScope.network;
                    URL url = httpURLConnectionBuildRequest.getURL();
                    if (url == null || (string = url.toString()) == null) {
                        string = "unknown";
                    }
                    Logger.debug$default(logger, logLevel, logScope, "Request Started", MapsKt.mapOf(TuplesKt.to("url", string)), null, 16, null);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        int responseCode = httpURLConnectionBuildRequest.getResponseCode();
                        if (200 > responseCode || responseCode >= 300) {
                            if (responseCode != 301 && responseCode != 302 && responseCode != 303) {
                                LogLevel logLevel2 = LogLevel.error;
                                String str = "Request failed : " + httpURLConnectionBuildRequest.getResponseCode();
                                Pair pair = TuplesKt.to("request", httpURLConnectionBuildRequest.toString());
                                Pair pair2 = TuplesKt.to("api_key", requestProperty);
                                URL url2 = httpURLConnectionBuildRequest.getURL();
                                if (url2 == null || (string2 = url2.toString()) == null) {
                                    string2 = "unknown";
                                }
                                Logger.debug$default(logger, logLevel2, logScope, str, MapsKt.mapOf(pair, pair2, TuplesKt.to("url", string2)), null, 16, null);
                                httpURLConnectionBuildRequest.disconnect();
                                return new Either.Failure(new NetworkError.Unknown(new Exception("Failed, response code  " + responseCode)));
                            }
                            String headerField = httpURLConnectionBuildRequest.getHeaderField(com.google.common.net.d.f119539t0);
                            httpURLConnectionBuildRequest.disconnect();
                            NetworkRequestData<?> networkRequestDataCopyWithUrl = networkRequestData2.copyWithUrl(new URI(headerField));
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.label = 2;
                            Object objExecute = requestExecutor.execute(networkRequestDataCopyWithUrl, anonymousClass1);
                            return objExecute == objL ? objL : objExecute;
                        }
                        InputStream inputStream = httpURLConnectionBuildRequest.getInputStream();
                        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
                        try {
                            String strK = x.k(bufferedReader);
                            kotlin.io.c.a(bufferedReader, null);
                            httpURLConnectionBuildRequest.disconnect();
                            double dCurrentTimeMillis = (System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d;
                            try {
                                String requestId2 = requestExecutor.getRequestId(httpURLConnectionBuildRequest, requestProperty, dCurrentTimeMillis);
                                Pair pair3 = TuplesKt.to("request", httpURLConnectionBuildRequest.toString());
                                Pair pair4 = TuplesKt.to("api_key", requestProperty);
                                URL url3 = httpURLConnectionBuildRequest.getURL();
                                if (url3 == null || (string3 = url3.toString()) == null) {
                                    string3 = "unknown";
                                }
                                Logger.debug$default(logger, logLevel, logScope, "Request Completed", MapsKt.mapOf(pair3, pair4, TuplesKt.to("url", string3), TuplesKt.to("request_id", requestId2), TuplesKt.to("request_duration", kotlin.coroutines.jvm.internal.b.d(dCurrentTimeMillis))), null, 16, null);
                                return new Either.Success(new RequestResult(requestId2, responseCode, strK, dCurrentTimeMillis, map));
                            } catch (Throwable th2) {
                                if (th2 instanceof NetworkError) {
                                    unknown = th2;
                                } else {
                                    unknown = new NetworkError.Unknown(new Exception("Failed to get request id. " + th2.getMessage()));
                                }
                                return new Either.Failure(unknown);
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                kotlin.io.c.a(bufferedReader, th3);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        th5.printStackTrace();
                        return new Either.Failure(new NetworkError.Unknown(th5));
                    }
                }
                return new Either.Failure(new NetworkError.NotAuthenticated());
            } catch (Throwable th6) {
                return new Either.Failure(new NetworkError.Unknown(th6));
            }
            map = (Map) objInvoke;
        } catch (Throwable th7) {
            return new Either.Failure(new NetworkError.Unknown(th7));
        }
    }

    @NotNull
    public final n<Boolean, String, kotlin.coroutines.d<? super Map<String, String>>, Object> getBuildHeaders() {
        return this.buildHeaders;
    }
}
