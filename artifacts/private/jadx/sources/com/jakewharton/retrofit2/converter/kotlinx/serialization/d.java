package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.d0;
import okhttp3.e0;
import okhttp3.x;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes5.dex */
public final class d<T> implements Converter<T, e0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x f131149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d0<T> f131150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final e f131151c;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull x contentType, @NotNull d0<? super T> saver, @NotNull e serializer) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f131149a = contentType;
        this.f131150b = saver;
        this.f131151c = serializer;
    }

    @Override // retrofit2.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e0 convert(T t10) {
        return this.f131151c.d(this.f131149a, this.f131150b, t10);
    }
}
