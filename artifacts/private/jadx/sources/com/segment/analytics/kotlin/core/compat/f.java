package com.segment.analytics.kotlin.core.compat;

import androidx.media3.extractor.y0;
import com.segment.analytics.kotlin.core.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConfigurationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurationBuilder.kt\ncom/segment/analytics/kotlin/core/compat/ConfigurationBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.f f266800a;

    public f(@NotNull String writeKey) {
        Intrinsics.checkNotNullParameter(writeKey, "writeKey");
        this.f266800a = new com.segment.analytics.kotlin.core.f(writeKey, null, null, false, false, false, false, 0, 0, null, null, false, null, null, null, null, y0.f69665l, null);
    }

    @NotNull
    public final com.segment.analytics.kotlin.core.f a() {
        return this.f266800a;
    }

    @NotNull
    public final f b(@NotNull String apiHost) {
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        this.f266800a.J(apiHost);
        return this;
    }

    @NotNull
    public final f c(@Nullable Object obj) {
        this.f266800a.K(obj);
        return this;
    }

    @NotNull
    public final f d(boolean z10) {
        this.f266800a.L(z10);
        return this;
    }

    @NotNull
    public final f e(@NotNull String cdnHost) {
        Intrinsics.checkNotNullParameter(cdnHost, "cdnHost");
        this.f266800a.M(cdnHost);
        return this;
    }

    @NotNull
    public final f f(boolean z10) {
        this.f266800a.N(z10);
        return this;
    }

    @NotNull
    public final f g(int i10) {
        this.f266800a.Q(i10);
        return this;
    }

    @NotNull
    public final f h(int i10) {
        this.f266800a.R(i10);
        return this;
    }

    @NotNull
    public final f i(@NotNull q requestFactory) {
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        this.f266800a.T(requestFactory);
        return this;
    }

    @NotNull
    public final f j(boolean z10) {
        this.f266800a.V(z10);
        return this;
    }

    @NotNull
    public final f k(boolean z10) {
        this.f266800a.W(z10);
        return this;
    }

    @NotNull
    public final f l(boolean z10) {
        this.f266800a.X(z10);
        return this;
    }
}
