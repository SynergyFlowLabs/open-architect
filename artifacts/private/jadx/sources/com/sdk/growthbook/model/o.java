package com.sdk.growthbook.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class o extends q {

    @NotNull
    private static final a Companion = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double f266375b = 1.0E7d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f266376c = 9.0E-8d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Number f266377a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NotNull Number value) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f266377a = value;
    }

    private final boolean k() {
        Number number = this.f266377a;
        return (number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        if (k()) {
            o oVar = (o) obj;
            if (oVar.k() && this.f266377a.longValue() == oVar.f266377a.longValue()) {
                return true;
            }
        }
        if (!k()) {
            o oVar2 = (o) obj;
            if (!oVar2.k() && (this.f266377a.doubleValue() == oVar2.f266377a.doubleValue() || Math.abs(this.f266377a.doubleValue() - oVar2.f266377a.doubleValue()) < f266376c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k() ? Long.hashCode(this.f266377a.longValue()) : Double.hashCode(kotlin.math.b.M0(this.f266377a.doubleValue() * f266375b) / f266375b);
    }

    @NotNull
    public final Number i() {
        return this.f266377a;
    }

    @NotNull
    public String toString() {
        return "GBNumber(value=" + this.f266377a + ")";
    }
}
