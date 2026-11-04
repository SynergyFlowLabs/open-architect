package androidx.compose.foundation.pager;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class w implements androidx.compose.foundation.lazy.layout.y.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18481c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Function1<Integer, Object> f18482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final pj.o<v0, Integer, androidx.compose.runtime.c0, Integer, Unit> f18483b;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@Nullable Function1<? super Integer, ? extends Object> function1, @NotNull pj.o<? super v0, ? super Integer, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        this.f18482a = function1;
        this.f18483b = oVar;
    }

    @NotNull
    public final pj.o<v0, Integer, androidx.compose.runtime.c0, Integer, Unit> a() {
        return this.f18483b;
    }

    @Override // androidx.compose.foundation.lazy.layout.y.a
    @Nullable
    public Function1<Integer, Object> getKey() {
        return this.f18482a;
    }
}
