package io.customer.messaginginapp.ui.controller;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
final class VolatilePropertyWithNotification<T> implements kotlin.properties.f<Object, T> {

    @NotNull
    private final Function2<T, T, Unit> onChange;

    @Nullable
    private volatile T value;

    /* JADX WARN: Multi-variable type inference failed */
    public VolatilePropertyWithNotification(@Nullable T t10, @NotNull Function2<? super T, ? super T, Unit> onChange) {
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        this.onChange = onChange;
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
        T t11 = this.value;
        this.value = t10;
        this.onChange.invoke(t11, t10);
    }
}
