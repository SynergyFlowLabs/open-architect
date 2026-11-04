package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.g0;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes5.dex */
public final class a<T> implements Converter<g0, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.serialization.e<T> f131145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f131146b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull kotlinx.serialization.e<? extends T> loader, @NotNull e serializer) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f131145a = loader;
        this.f131146b = serializer;
    }

    @Override // retrofit2.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T convert(@NotNull g0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (T) this.f131146b.a(this.f131145a, value);
    }
}
