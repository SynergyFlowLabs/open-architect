package androidx.compose.foundation.lazy.grid;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class q implements androidx.compose.foundation.lazy.layout.y.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16975e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Function1<Integer, Object> f16976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<h0, Integer, c> f16977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<Integer, Object> f16978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final pj.o<f0, Integer, androidx.compose.runtime.c0, Integer, Unit> f16979d;

    /* JADX WARN: Multi-variable type inference failed */
    public q(@Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function2<? super h0, ? super Integer, c> function2, @NotNull Function1<? super Integer, ? extends Object> function3, @NotNull pj.o<? super f0, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        this.f16976a = function1;
        this.f16977b = function2;
        this.f16978c = function3;
        this.f16979d = oVar;
    }

    @NotNull
    public final pj.o<f0, Integer, androidx.compose.runtime.c0, Integer, Unit> a() {
        return this.f16979d;
    }

    @NotNull
    public final Function2<h0, Integer, c> b() {
        return this.f16977b;
    }

    @Override // androidx.compose.foundation.lazy.layout.y.a
    @NotNull
    public Function1<Integer, Object> c() {
        return this.f16978c;
    }

    @Override // androidx.compose.foundation.lazy.layout.y.a
    @Nullable
    public Function1<Integer, Object> getKey() {
        return this.f16976a;
    }
}
