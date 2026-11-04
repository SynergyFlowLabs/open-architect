package com.planner5d.library.api.support;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements CallAdapter<com.planner5d.library.api.c, com.planner5d.library.api.c> {

    public static final class a extends CallAdapter.Factory {
        @Override // retrofit2.CallAdapter.Factory
        @Nullable
        public CallAdapter<?, ?> get(@NotNull Type returnType, @NotNull Annotation[] annotations, @NotNull Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(returnType, "returnType");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            boolean zAreEqual = Intrinsics.areEqual(returnType, com.planner5d.library.api.c.class);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (zAreEqual) {
                return new d(defaultConstructorMarker);
            }
            return null;
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // retrofit2.CallAdapter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.api.c adapt(@NotNull Call<com.planner5d.library.api.c> call) throws com.planner5d.library.api.e {
        Intrinsics.checkNotNullParameter(call, "call");
        Response<com.planner5d.library.api.c> responseExecute = null;
        boolean z10 = true;
        try {
            responseExecute = call.execute();
            com.planner5d.library.api.c cVarBody = responseExecute.body();
            if (cVarBody != null) {
                return cVarBody;
            }
            throw new IOException();
        } catch (com.planner5d.library.api.a e10) {
            throw new com.planner5d.library.api.e(com.planner5d.library.api.e.b.CONVERSION, e10, responseExecute);
        } catch (IOException e11) {
            throw new com.planner5d.library.api.e(com.planner5d.library.api.e.b.NETWORK, e11, responseExecute);
        } catch (RuntimeException e12) {
            throw new com.planner5d.library.api.e(com.planner5d.library.api.e.b.UNEXPECTED, e12, responseExecute);
        }
    }

    @Override // retrofit2.CallAdapter
    @NotNull
    public Type responseType() {
        return com.planner5d.library.api.c.class;
    }

    private d() {
    }
}
