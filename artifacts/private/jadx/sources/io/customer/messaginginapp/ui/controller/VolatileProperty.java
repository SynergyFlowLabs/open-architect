package io.customer.messaginginapp.ui.controller;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
final class VolatileProperty<T> implements kotlin.properties.f<Object, T> {

    @Nullable
    private volatile T value;

    public VolatileProperty(@Nullable T t10) {
        this.value = t10;
    }

    @Override // kotlin.properties.f, kotlin.properties.e
    @Nullable
    public T getValue(@Nullable Object obj, @NotNull o<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.value;
    }

    @Override // kotlin.properties.f
    public void setValue(@Nullable Object obj, @NotNull o<?> property, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.value = t10;
    }
}
