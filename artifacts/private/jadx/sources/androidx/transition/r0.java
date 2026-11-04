package androidx.transition;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public interface r0 {
    @androidx.annotation.g0(from = 0)
    long a();

    void c(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10);

    void d(@NonNull androidx.core.util.e<r0> eVar);

    @androidx.annotation.g0(from = 0)
    long e();

    void f();

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    float getCurrentFraction();

    void h(@NonNull androidx.core.util.e<r0> eVar);

    void i(@NonNull androidx.core.util.e<r0> eVar);

    boolean isReady();

    void l(@androidx.annotation.g0(from = 0) long j10);

    void n(@NonNull androidx.core.util.e<r0> eVar);

    void p(@NonNull Runnable runnable);
}
