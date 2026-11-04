package com.devtodev.analytics.internal.network.request.platform;

import com.devtodev.analytics.internal.backend.repository.contentbuilder.IContentData;
import com.devtodev.analytics.internal.backend.repository.contentbuilder.IRequestContent;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.network.IRequest;
import com.devtodev.analytics.internal.network.Response;
import com.devtodev.analytics.internal.network.request.RequestType;
import com.devtodev.analytics.internal.utils.JsonPretty;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPlatformRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRequest.kt\ncom/devtodev/analytics/internal/network/request/platform/PlatformRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,191:1\n1#2:192\n125#3:193\n152#3,3:194\n125#3:197\n152#3,3:198\n*S KotlinDebug\n*F\n+ 1 PlatformRequest.kt\ncom/devtodev/analytics/internal/network/request/platform/PlatformRequest\n*L\n115#1:193\n115#1:194,3\n119#1:197\n119#1:198,3\n*E\n"})
public final class PlatformRequest implements IRequest {
    private static final int CONNECTION_TIMEOUT_MS = 60000;

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_BUFFER_SIZE = 4096;

    @NotNull
    private static final String GET_REQUEST = "GET";

    @NotNull
    private static final String POST_REQUEST = "POST";
    private static final int READ_TIMEOUT_MS = 10000;

    @NotNull
    private final IRequestContent requestContent;

    @NotNull
    private final String requestIdentifier;

    @NotNull
    private final RequestType type;

    @NotNull
    private final IUrl urlBuilder;

    @Nullable
    private URL urlForLog;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PlatformRequest(@NotNull IUrl urlBuilder, @NotNull RequestType type, @NotNull IRequestContent requestContent, @NotNull String requestIdentifier) {
        Intrinsics.checkNotNullParameter(urlBuilder, "urlBuilder");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestContent, "requestContent");
        Intrinsics.checkNotNullParameter(requestIdentifier, "requestIdentifier");
        this.urlBuilder = urlBuilder;
        this.type = type;
        this.requestContent = requestContent;
        this.requestIdentifier = requestIdentifier;
    }

    private final String aggregateLogString(RequestType requestType, IRequestContent iRequestContent, String str) {
        Map<String, String> header = iRequestContent.getHeader();
        ArrayList arrayList = new ArrayList(header.size());
        for (Map.Entry<String, String> entry : header.entrySet()) {
            arrayList.add("\t\t" + entry.getKey() + ": " + entry.getValue());
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ",\n", null, null, 0, null, null, 62, null);
        Map<String, String> base64Headers = iRequestContent.getBase64Headers();
        ArrayList arrayList2 = new ArrayList(base64Headers.size());
        for (Map.Entry<String, String> entry2 : base64Headers.entrySet()) {
            arrayList2.add("\t\t" + entry2.getKey() + ": " + entry2.getValue());
        }
        return "[Network Module] \n Method: " + requestType.name() + "\n URL: " + this.urlForLog + "\n Content-type: " + str + "\n Headers: \n" + strJoinToString$default + "\n EncodedHeaders: \n" + CollectionsKt.joinToString$default(arrayList2, ",\n", null, null, 0, null, null, 62, null) + "\n" + (this.requestIdentifier.length() > 0 ? " Content UUID: " + this.requestIdentifier + "\n" : "") + " Content: " + JsonPretty.INSTANCE.toPrettyJson(iRequestContent.getPrettyJson()) + "\n";
    }

    private final Response parseResult(InputStream inputStream) {
        try {
            return new Response.ResponseResult(read(inputStream));
        } catch (IOException e10) {
            return new Response.ResponseDataReadError(e10.getMessage());
        }
    }

    private final String read(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
                return new String(byteArray, Charsets.UTF_8);
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    private final void writePostData(HttpURLConnection httpURLConnection, RequestType requestType) throws IOException {
        if (this.requestContent.isEmpty()) {
            return;
        }
        IContentData content = this.requestContent.getContent();
        String exceptionMessage = content.getExceptionMessage();
        if (exceptionMessage != null) {
            Logger.warning$default(Logger.INSTANCE, exceptionMessage + " Try sent raw json", null, 2, null);
        }
        httpURLConnection.setRequestProperty("Content-type", content.getContentType());
        Map<String, String> base64Headers = this.requestContent.getBase64Headers();
        for (String str : base64Headers.keySet()) {
            httpURLConnection.setRequestProperty(str, base64Headers.get(str));
        }
        Logger.debug$default(Logger.INSTANCE, aggregateLogString(requestType, this.requestContent, content.getContentType()), null, 2, null);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.getOutputStream().write(content.getData());
        httpURLConnection.getOutputStream().flush();
        httpURLConnection.getOutputStream().close();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e4 A[Catch: all -> 0x0020, Exception -> 0x0024, TryCatch #4 {Exception -> 0x0024, blocks: (B:3:0x0004, B:5:0x001c, B:11:0x0029, B:13:0x003a, B:15:0x004d, B:17:0x0059, B:28:0x0085, B:30:0x008d, B:32:0x0096, B:43:0x00ce, B:45:0x00d6, B:47:0x00e4, B:14:0x0046, B:49:0x00e8), top: B:91:0x0004, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e8 A[Catch: all -> 0x0020, Exception -> 0x0024, TRY_LEAVE, TryCatch #4 {Exception -> 0x0024, blocks: (B:3:0x0004, B:5:0x001c, B:11:0x0029, B:13:0x003a, B:15:0x004d, B:17:0x0059, B:28:0x0085, B:30:0x008d, B:32:0x0096, B:43:0x00ce, B:45:0x00d6, B:47:0x00e4, B:14:0x0046, B:49:0x00e8), top: B:91:0x0004, outer: #0 }] */
    @Override // com.devtodev.analytics.internal.network.IRequest
    @NotNull
    public Response send() throws IOException {
        Response result;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                URL url = this.urlBuilder.getUrl();
                this.urlForLog = url;
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                httpURLConnection = uRLConnection instanceof HttpURLConnection ? (HttpURLConnection) uRLConnection : null;
                if (httpURLConnection != null) {
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setConnectTimeout(60000);
                    if (this.type == RequestType.POST) {
                        httpURLConnection.setRequestMethod("POST");
                        writePostData(httpURLConnection, this.type);
                    } else {
                        httpURLConnection.setRequestMethod("GET");
                    }
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode() == 422) {
                        Response.DoNotRetryIdentification doNotRetryIdentification = new Response.DoNotRetryIdentification(httpURLConnection.getResponseCode());
                        if (httpURLConnection.getResponseCode() >= 400) {
                            InputStream errorStream = httpURLConnection.getErrorStream();
                            if (errorStream != null) {
                                errorStream.close();
                            }
                        } else {
                            InputStream inputStream = httpURLConnection.getInputStream();
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        }
                        httpURLConnection.disconnect();
                        return doNotRetryIdentification;
                    }
                    if (httpURLConnection.getResponseCode() != 200 && httpURLConnection.getResponseCode() != 202) {
                        int responseCode = httpURLConnection.getResponseCode();
                        String responseMessage = httpURLConnection.getResponseMessage();
                        Intrinsics.checkNotNullExpressionValue(responseMessage, "responseMessage");
                        Response.ResponseError responseError = new Response.ResponseError(responseCode, responseMessage);
                        if (httpURLConnection.getResponseCode() >= 400) {
                            InputStream errorStream2 = httpURLConnection.getErrorStream();
                            if (errorStream2 != null) {
                                errorStream2.close();
                            }
                        } else {
                            InputStream inputStream2 = httpURLConnection.getInputStream();
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                        }
                        httpURLConnection.disconnect();
                        return responseError;
                    }
                    InputStream inputStream3 = httpURLConnection.getInputStream();
                    if (inputStream3 != null) {
                        Intrinsics.checkNotNullExpressionValue(inputStream3, "inputStream");
                        result = parseResult(inputStream3);
                        if (result == null) {
                            result = Response.ResponseInputNull.INSTANCE;
                        }
                    } else {
                        result = Response.ResponseInputNull.INSTANCE;
                    }
                    if (result == null) {
                        result = Response.ResponseConnectionNull.INSTANCE;
                    }
                } else {
                    result = Response.ResponseConnectionNull.INSTANCE;
                }
                if (httpURLConnection != null) {
                    try {
                        if (httpURLConnection.getResponseCode() >= 400) {
                            InputStream errorStream3 = httpURLConnection.getErrorStream();
                            if (errorStream3 != null) {
                                errorStream3.close();
                            }
                        } else {
                            InputStream inputStream4 = httpURLConnection.getInputStream();
                            if (inputStream4 != null) {
                                inputStream4.close();
                            }
                        }
                    } catch (Exception unused) {
                    }
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        if (httpURLConnection.getResponseCode() >= 400) {
                            InputStream errorStream4 = httpURLConnection.getErrorStream();
                            if (errorStream4 != null) {
                                errorStream4.close();
                            }
                        } else {
                            InputStream inputStream5 = httpURLConnection.getInputStream();
                            if (inputStream5 != null) {
                                inputStream5.close();
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    httpURLConnection.disconnect();
                }
                throw th2;
            }
        } catch (Exception e10) {
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            Response.ResponseDataReadError responseDataReadError = new Response.ResponseDataReadError(e10.getMessage());
            if (0 != 0) {
                try {
                    if (httpURLConnection.getResponseCode() >= 400) {
                        InputStream errorStream5 = httpURLConnection.getErrorStream();
                        if (errorStream5 != null) {
                            errorStream5.close();
                        }
                    } else {
                        InputStream inputStream6 = httpURLConnection.getInputStream();
                        if (inputStream6 != null) {
                            inputStream6.close();
                        }
                    }
                } catch (Exception unused3) {
                }
                httpURLConnection.disconnect();
            }
            result = responseDataReadError;
        }
        return result;
    }
}
