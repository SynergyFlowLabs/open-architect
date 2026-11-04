package io.intercom.android.sdk.api;

import androidx.compose.runtime.internal.w0;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.v;
import okhttp3.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class S3HostRedirectInterceptor implements w {
    public static final int $stable = 0;

    @Override // okhttp3.w
    @NotNull
    public f0 intercept(@NotNull w.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        d0 d0VarRequest = chain.request();
        v vVarQ = d0VarRequest.q();
        if (!Intrinsics.areEqual(vVarQ.F(), "uploads-development.s3.test")) {
            return chain.c(d0VarRequest);
        }
        vVarQ.toString();
        v vVarH = vVarQ.H().x("10.0.2.2").D(80).h();
        d0 d0VarB = d0VarRequest.n().D(vVarH).n(com.google.common.net.d.f119547w, "uploads-development.s3.test").b();
        Objects.toString(vVarH);
        return chain.c(d0VarB);
    }
}
