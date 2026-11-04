package io.ktor.client.request.forms;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final byte[] f295314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Long f295315b;

    public static final class a extends u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Function0<io.ktor.utils.io.h> f295316c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull byte[] headers, @NotNull Function0<? extends io.ktor.utils.io.h> provider, @Nullable Long l10) {
            super(headers, l10, null);
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.f295316c = provider;
        }

        @NotNull
        public final Function0<io.ktor.utils.io.h> c() {
            return this.f295316c;
        }
    }

    public static final class b extends u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Function0<c0> f295317c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull byte[] headers, @NotNull Function0<? extends c0> provider, @Nullable Long l10) {
            super(headers, l10, null);
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.f295317c = provider;
        }

        @NotNull
        public final Function0<c0> c() {
            return this.f295317c;
        }
    }

    public /* synthetic */ u(byte[] bArr, Long l10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, l10);
    }

    @NotNull
    public final byte[] a() {
        return this.f295314a;
    }

    @Nullable
    public final Long b() {
        return this.f295315b;
    }

    private u(byte[] bArr, Long l10) {
        this.f295314a = bArr;
        this.f295315b = l10;
    }
}
