package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class l implements androidx.compose.foundation.lazy.layout.y.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f17948e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Function1<Integer, Object> f17949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<Integer, Object> f17950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Function1<Integer, f1> f17951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final pj.o<x, Integer, androidx.compose.runtime.c0, Integer, Unit> f17952d;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> function2, @Nullable Function1<? super Integer, f1> function3, @NotNull pj.o<? super x, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        this.f17949a = function1;
        this.f17950b = function2;
        this.f17951c = function3;
        this.f17952d = oVar;
    }

    @NotNull
    public final pj.o<x, Integer, androidx.compose.runtime.c0, Integer, Unit> a() {
        return this.f17952d;
    }

    @Nullable
    public final Function1<Integer, f1> b() {
        return this.f17951c;
    }

    @Override // androidx.compose.foundation.lazy.layout.y.a
    @NotNull
    public Function1<Integer, Object> c() {
        return this.f17950b;
    }

    @Override // androidx.compose.foundation.lazy.layout.y.a
    @Nullable
    public Function1<Integer, Object> getKey() {
        return this.f17949a;
    }
}
