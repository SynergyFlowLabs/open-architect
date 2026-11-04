package io.intercom.android.sdk.helpcenter.utils.networking;

import androidx.compose.runtime.internal.w0;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.d0;
import okio.e1;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class NetworkResponseCall<S> implements Call<NetworkResponse<? extends S>> {
    public static final int $stable = 8;

    @NotNull
    private final Call<S> delegate;

    public NetworkResponseCall(@NotNull Call<S> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // retrofit2.Call
    public void cancel() {
        this.delegate.cancel();
    }

    @Override // retrofit2.Call
    public void enqueue(@NotNull final Callback<NetworkResponse<S>> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.delegate.enqueue(new Callback<S>() { // from class: io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseCall.enqueue.1
            @Override // retrofit2.Callback
            public void onFailure(Call<S> call, Throwable throwable) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                callback.onResponse(this, Response.success(throwable instanceof IOException ? new NetworkResponse.NetworkError((IOException) throwable) : new NetworkResponse.ClientError(throwable)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<S> call, Response<S> response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                S sBody = response.body();
                int iCode = response.code();
                if (!response.isSuccessful()) {
                    callback.onResponse(this, Response.success(new NetworkResponse.ServerError(iCode)));
                } else if (sBody != null) {
                    callback.onResponse(this, Response.success(new NetworkResponse.Success(sBody)));
                } else {
                    callback.onResponse(this, Response.success(new NetworkResponse.ClientError(new Throwable())));
                }
            }
        });
    }

    @Override // retrofit2.Call
    @NotNull
    public Response<NetworkResponse<S>> execute() {
        throw new UnsupportedOperationException("NetworkResponseCall doesn't support execute");
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        return this.delegate.isCanceled();
    }

    @Override // retrofit2.Call
    public boolean isExecuted() {
        return this.delegate.isExecuted();
    }

    @Override // retrofit2.Call
    @NotNull
    public d0 request() {
        d0 d0VarRequest = this.delegate.request();
        Intrinsics.checkNotNullExpressionValue(d0VarRequest, "request(...)");
        return d0VarRequest;
    }

    @Override // retrofit2.Call
    @NotNull
    public e1 timeout() {
        e1 e1VarTimeout = this.delegate.timeout();
        Intrinsics.checkNotNullExpressionValue(e1VarTimeout, "timeout(...)");
        return e1VarTimeout;
    }

    @Override // retrofit2.Call
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public NetworkResponseCall<S> m100clone() {
        Call<S> callM100clone = this.delegate.m100clone();
        Intrinsics.checkNotNullExpressionValue(callM100clone, "clone(...)");
        return new NetworkResponseCall<>(callM100clone);
    }
}
