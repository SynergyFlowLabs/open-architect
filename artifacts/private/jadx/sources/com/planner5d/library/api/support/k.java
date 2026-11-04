package com.planner5d.library.api.support;

import com.planner5d.library.services.utility.q2;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements Converter<g0, com.planner5d.library.api.c> {

    public static final class a extends Converter.Factory {
        @Override // retrofit2.Converter.Factory
        @Nullable
        public Converter<g0, ?> responseBodyConverter(@NotNull Type type, @NotNull Annotation[] annotations, @NotNull Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            boolean zAreEqual = Intrinsics.areEqual(type, com.planner5d.library.api.c.class);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (zAreEqual) {
                return new k(defaultConstructorMarker);
            }
            return null;
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // retrofit2.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.api.c convert(@NotNull g0 responseBody) throws IOException {
        com.planner5d.library.api.c cVarC;
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        g0 g0Var = responseBody instanceof j ? (j) responseBody : null;
        g0 g0Var2 = (g0) q2.d(responseBody, responseBody.getClass(), "delegate");
        if (g0Var2 instanceof j) {
            g0Var = g0Var2;
        }
        j jVar = (j) g0Var;
        if (jVar == null || (cVarC = jVar.c()) == null) {
            throw new com.planner5d.library.api.a("Invalid response - null");
        }
        if (cVarC.h()) {
            throw new com.planner5d.library.api.d(cVarC);
        }
        return cVarC;
    }

    private k() {
    }
}
