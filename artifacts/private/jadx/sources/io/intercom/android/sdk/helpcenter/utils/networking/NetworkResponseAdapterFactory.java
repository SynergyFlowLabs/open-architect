package io.intercom.android.sdk.helpcenter.utils.networking;

import androidx.compose.runtime.internal.w0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class NetworkResponseAdapterFactory extends CallAdapter.Factory {
    public static final int $stable = 0;

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    public CallAdapter<?, ?> get(@NotNull Type returnType, @NotNull Annotation[] annotations, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (!Intrinsics.areEqual(Call.class, CallAdapter.Factory.getRawType(returnType))) {
            return null;
        }
        if (!(returnType instanceof ParameterizedType)) {
            throw new IllegalStateException("return type must be parameterized as Call<NetworkResponse<<Foo>>");
        }
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) returnType);
        if (!Intrinsics.areEqual(CallAdapter.Factory.getRawType(parameterUpperBound), NetworkResponse.class)) {
            return null;
        }
        if (!(parameterUpperBound instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as NetworkResponse<Foo> or NetworkResponse<out Foo>");
        }
        Type parameterUpperBound2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
        Intrinsics.checkNotNull(parameterUpperBound2);
        return new NetworkResponseAdapter(parameterUpperBound2);
    }
}
