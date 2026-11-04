package io.intercom.android.sdk.helpcenter.utils.networking;

import androidx.compose.runtime.internal.w0;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class NetworkResponseAdapter<S> implements CallAdapter<S, Call<NetworkResponse<? extends S>>> {
    public static final int $stable = 8;

    @NotNull
    private final Type successType;

    public NetworkResponseAdapter(@NotNull Type successType) {
        Intrinsics.checkNotNullParameter(successType, "successType");
        this.successType = successType;
    }

    @Override // retrofit2.CallAdapter
    @NotNull
    public Type responseType() {
        return this.successType;
    }

    @Override // retrofit2.CallAdapter
    @NotNull
    public Call<NetworkResponse<S>> adapt(@NotNull Call<S> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new NetworkResponseCall(call);
    }
}
