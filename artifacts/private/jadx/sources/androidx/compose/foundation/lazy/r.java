package androidx.compose.foundation.lazy;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class r implements androidx.compose.foundation.lazy.layout.y.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f17701d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Function1<Integer, Object> f17702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<Integer, Object> f17703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final pj.o<i, Integer, androidx.compose.runtime.c0, Integer, Unit> f17704c;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> function2, @NotNull pj.o<? super i, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        this.f17702a = function1;
        this.f17703b = function2;
        this.f17704c = oVar;
    }

    @NotNull
    public final pj.o<i, Integer, androidx.compose.runtime.c0, Integer, Unit> a() {
        return this.f17704c;
    }

    @Override // androidx.compose.foundation.lazy.layout.y.a
    @NotNull
    public Function1<Integer, Object> c() {
        return this.f17703b;
    }

    @Override // androidx.compose.foundation.lazy.layout.y.a
    @Nullable
    public Function1<Integer, Object> getKey() {
        return this.f17702a;
    }
}
