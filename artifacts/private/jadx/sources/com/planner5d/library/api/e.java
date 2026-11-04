package com.planner5d.library.api;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f142252c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f142253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Response<c> f142254b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final e a(@NotNull IOException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new e(b.NETWORK, exception, null);
        }

        @oj.n
        @NotNull
        public final e b(@NotNull Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new e(b.UNEXPECTED, exception, null);
        }

        private a() {
        }
    }

    public enum b {
        NETWORK,
        CONVERSION,
        UNEXPECTED;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f142259e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f142259e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull b kind, @NotNull Throwable cause, @Nullable Response<c> response) {
        super(cause);
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f142253a = kind;
        this.f142254b = response;
    }

    @oj.n
    @NotNull
    public static final e c(@NotNull IOException iOException) {
        return f142252c.a(iOException);
    }

    @oj.n
    @NotNull
    public static final e d(@NotNull Throwable th2) {
        return f142252c.b(th2);
    }

    @NotNull
    public final b a() {
        return this.f142253a;
    }

    @Nullable
    public final Response<c> b() {
        return this.f142254b;
    }
}
