package io.ktor.client.engine.android;

import fi.z;
import io.ktor.client.plugins.e1;
import io.ktor.client.plugins.f1;
import io.ktor.client.plugins.i1;
import io.ktor.http.l1;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.h4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAndroidURLConnectionUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidURLConnectionUtils.kt\nio/ktor/client/engine/android/AndroidURLConnectionUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
public final class i {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.engine.android.AndroidURLConnectionUtilsKt", f = "AndroidURLConnectionUtils.kt", i = {0, 0}, l = {61}, m = "timeoutAwareConnection", n = {"request", "cause"}, s = {"L$0", "L$1"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f294317d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294316c = obj;
            this.f294317d |= Integer.MIN_VALUE;
            return i.e(null, null, null, this);
        }
    }

    @NotNull
    public static final io.ktor.utils.io.h a(@NotNull HttpURLConnection httpURLConnection, int i10, @NotNull CoroutineContext callContext) {
        io.ktor.utils.io.h hVarA;
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        l1.a aVar = l1.f295939c;
        if (CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(aVar.B().H0()), Integer.valueOf(aVar.w().H0())}).contains(Integer.valueOf(i10))) {
            return io.ktor.utils.io.h.f296881a.a();
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
            }
        } catch (IOException unused) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                bufferedInputStream = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
            }
        }
        if (bufferedInputStream == null || (hVarA = io.ktor.utils.io.jvm.javaio.c.a(bufferedInputStream, callContext, io.ktor.util.cio.a.a())) == null) {
            hVarA = io.ktor.utils.io.h.f296881a.a();
        }
        return hVarA;
    }

    private static final boolean b(Throwable th2) {
        if (th2 instanceof SocketTimeoutException) {
            return true;
        }
        if (th2 instanceof ConnectException) {
            String message = th2.getMessage();
            if (message != null ? StringsKt.V2(message, "timed out", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    private static final void c(HttpURLConnection httpURLConnection, f1 f1Var) {
        Long lD = f1Var.d();
        if (lD != null) {
            long jLongValue = lD.longValue();
            if (jLongValue != Long.MAX_VALUE && (httpURLConnection.getConnectTimeout() == 0 || httpURLConnection.getConnectTimeout() > jLongValue)) {
                httpURLConnection.setConnectTimeout(i1.q(jLongValue));
            }
        }
    }

    public static final void d(@NotNull HttpURLConnection httpURLConnection, @NotNull z requestData) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        f1 f1Var = (f1) requestData.c(e1.f294787a);
        if (f1Var != null) {
            Long lC = f1Var.c();
            if (lC != null) {
                httpURLConnection.setConnectTimeout(i1.q(lC.longValue()));
            }
            Long lE = f1Var.e();
            if (lE != null) {
                httpURLConnection.setReadTimeout(i1.q(lE.longValue()));
            }
            c(httpURLConnection, f1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public static final <T> Object e(@NotNull HttpURLConnection httpURLConnection, @NotNull z zVar, @NotNull Function1<? super HttpURLConnection, ? extends T> function1, @NotNull kotlin.coroutines.d<? super T> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f294317d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f294317d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f294316c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f294317d;
        if (i11 == 0) {
            ResultKt.m(obj);
            try {
                return function1.invoke(httpURLConnection);
            } catch (Throwable th2) {
                th = th2;
                aVar.f294314a = zVar;
                aVar.f294315b = th;
                aVar.f294317d = 1;
                if (h4.a(aVar) == objL) {
                    return objL;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th = (Throwable) aVar.f294315b;
            zVar = (z) aVar.f294314a;
            ResultKt.m(obj);
        }
        if (b(th)) {
            throw i1.c(zVar, th);
        }
        throw th;
    }
}
