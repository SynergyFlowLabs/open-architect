package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.r3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final CoroutineContext f315107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object[] f315108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final r3<Object>[] f315109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f315110d;

    public o1(@NotNull CoroutineContext coroutineContext, int i10) {
        this.f315107a = coroutineContext;
        this.f315108b = new Object[i10];
        this.f315109c = new r3[i10];
    }

    public final void a(@NotNull r3<?> r3Var, @Nullable Object obj) {
        Object[] objArr = this.f315108b;
        int i10 = this.f315110d;
        objArr[i10] = obj;
        r3<Object>[] r3VarArr = this.f315109c;
        this.f315110d = i10 + 1;
        Intrinsics.checkNotNull(r3Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        r3VarArr[i10] = r3Var;
    }

    public final void b(@NotNull CoroutineContext coroutineContext) {
        int length = this.f315109c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            r3<Object> r3Var = this.f315109c[length];
            Intrinsics.checkNotNull(r3Var);
            r3Var.I(coroutineContext, this.f315108b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
