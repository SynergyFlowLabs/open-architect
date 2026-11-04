package io.customer.messagingpush.network;

import android.util.Base64;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.customer.sdk.data.model.Settings;
import io.customer.sdk.data.store.g;
import io.customer.sdk.data.store.j;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.io.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HTTPClient.kt\nio/customer/messagingpush/network/HttpClientImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
public final class b implements io.customer.messagingpush.network.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f288449a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f288450b = 10000;

    @f(c = "io.customer.messagingpush.network.HttpClientImpl$request$1", f = "HTTPClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f288451a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f288453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Result<String>, Unit> f288454d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c cVar, Function1<? super Result<String>, Unit> function1, d<? super a> dVar) {
            super(2, dVar);
            this.f288453c = cVar;
            this.f288454d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return b.this.new a(this.f288453c, this.f288454d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f288451a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f288454d.invoke(Result.a(b.this.c(this.f288453c)));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.StringBuilder] */
    public final Object c(c cVar) {
        Object objM785constructorimpl;
        InputStream errorStream;
        String strK;
        Settings settingsE = f().e();
        if (settingsE == null) {
            Result.a aVar = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(new IllegalStateException("Setting not available")));
        }
        String strE = settingsE.e();
        String strF = settingsE.f();
        ?? H = StringsKt.u2(cVar.h(), "/", false, 2, null) ? cVar.h() : "/" + cVar.h();
        String str = "https://" + strE + H;
        try {
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
                Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                H = (HttpURLConnection) uRLConnection;
                try {
                    H.setConnectTimeout(this.f288449a);
                    H.setReadTimeout(this.f288450b);
                    H.setRequestMethod("POST");
                    H.setRequestProperty(com.google.common.net.d.P, d().toString());
                    byte[] bytes = (strF + ":").getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    H.setRequestProperty("Authorization", "Basic " + Base64.encodeToString(bytes, 2));
                    for (Map.Entry<String, String> entry : cVar.g().entrySet()) {
                        H.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    String strF2 = cVar.f();
                    if (strF2 != null) {
                        H.setDoOutput(true);
                        OutputStream outputStream = H.getOutputStream();
                        try {
                            byte[] bytes2 = strF2.getBytes(Charsets.UTF_8);
                            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                            outputStream.write(bytes2);
                            Unit unit = Unit.f312394a;
                            kotlin.io.c.a(outputStream, null);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                kotlin.io.c.a(outputStream, th2);
                                throw th3;
                            }
                        }
                    }
                    int responseCode = H.getResponseCode();
                    try {
                        errorStream = H.getInputStream();
                    } catch (IOException unused) {
                        errorStream = H.getErrorStream();
                    }
                    if (errorStream != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
                        try {
                            strK = x.k(bufferedReader);
                            kotlin.io.c.a(bufferedReader, null);
                            if (strK == null) {
                                strK = "";
                            }
                            H.disconnect();
                            return objM785constructorimpl;
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                kotlin.io.c.a(bufferedReader, th4);
                                throw th5;
                            }
                        }
                    }
                    strK = "";
                    if (200 > responseCode || responseCode >= 300) {
                        Result.a aVar2 = Result.Companion;
                        objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(new IOException("HTTP " + responseCode + ": " + strK)));
                    } else {
                        Result.a aVar3 = Result.Companion;
                        objM785constructorimpl = Result.m785constructorimpl(strK);
                    }
                } catch (IOException e10) {
                    Result.a aVar4 = Result.Companion;
                    objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(e10));
                }
                H.disconnect();
                return objM785constructorimpl;
            } catch (Throwable th6) {
                H.disconnect();
                throw th6;
            }
        } catch (MalformedURLException e11) {
            Result.a aVar5 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(new IOException("Malformed URL: " + str, e11)));
        } catch (IOException e12) {
            Result.a aVar6 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(e12));
        }
    }

    private final g d() {
        return eh.d.f274883c.q().u();
    }

    private final ih.b e() {
        return eh.d.f274883c.u();
    }

    private final j f() {
        return eh.d.f274883c.q().w();
    }

    @Override // io.customer.messagingpush.network.a
    public void a(@NotNull c params, @NotNull Function1<? super Result<String>, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        k.f(t0.a(e().c()), null, null, new a(params, onComplete, null), 3, null);
    }
}
