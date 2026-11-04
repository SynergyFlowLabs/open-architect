package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends Converter.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x f131147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f131148b;

    public b(@NotNull x contentType, @NotNull e serializer) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f131147a = contentType;
        this.f131148b = serializer;
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<?, e0> requestBodyConverter(@NotNull Type type, @NotNull Annotation[] parameterAnnotations, @NotNull Annotation[] methodAnnotations, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        Intrinsics.checkNotNullParameter(methodAnnotations, "methodAnnotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return new d(this.f131147a, this.f131148b.c(type), this.f131148b);
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<g0, ?> responseBodyConverter(@NotNull Type type, @NotNull Annotation[] annotations, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return new a(this.f131148b.c(type), this.f131148b);
    }
}
