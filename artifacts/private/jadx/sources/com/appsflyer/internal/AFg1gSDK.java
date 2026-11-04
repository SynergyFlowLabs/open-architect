package com.appsflyer.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAFLoggerBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFLoggerBase.kt\ncom/appsflyer/internal/logger/AFLoggerBase\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n*L\n1#1,69:1\n36#2:70\n*S KotlinDebug\n*F\n+ 1 AFLoggerBase.kt\ncom/appsflyer/internal/logger/AFLoggerBase\n*L\n61#1:70\n*E\n"})
public abstract class AFg1gSDK {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static long getCurrencyIso4217Code = System.currentTimeMillis();
    private final boolean shouldExtendMsg;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void d$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        aFg1gSDK.d(aFg1cSDK, str, z10);
    }

    public static /* synthetic */ void e$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, Throwable th2, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        if ((i10 & 16) != 0) {
            z11 = true;
        }
        if ((i10 & 32) != 0) {
            z12 = true;
        }
        if ((i10 & 64) != 0) {
            z13 = true;
        }
        aFg1gSDK.e(aFg1cSDK, str, th2, z10, z11, z12, z13);
    }

    public static /* synthetic */ void i$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        aFg1gSDK.i(aFg1cSDK, str, z10);
    }

    public static /* synthetic */ void v$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        aFg1gSDK.v(aFg1cSDK, str, z10);
    }

    public static /* synthetic */ void w$default(AFg1gSDK aFg1gSDK, AFg1cSDK aFg1cSDK, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        aFg1gSDK.w(aFg1cSDK, str, z10);
    }

    @oj.j
    public void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    @oj.j
    public void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
    }

    public void force(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    @NotNull
    protected final String getRevenue(@Nullable String str, @NotNull AFg1cSDK aFg1cSDK) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        if (str == null || StringsKt.w3(str)) {
            str = AbstractJsonLexerKt.NULL;
        }
        String strWithTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1cSDK);
        if (!getShouldExtendMsg()) {
            return strWithTag$SDK_prodRelease;
        }
        return "(" + (System.currentTimeMillis() - getCurrencyIso4217Code) + ") [" + Thread.currentThread().getName() + "] " + strWithTag$SDK_prodRelease;
    }

    @oj.i(name = "getShouldExtendMsg")
    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    @oj.j
    public void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    @oj.j
    public void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    @oj.j
    public void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    @NotNull
    public final String withTag$SDK_prodRelease(@NotNull String str, @NotNull AFg1cSDK aFg1cSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        return "[" + aFg1cSDK.getRevenue + "] " + str;
    }

    @oj.j
    public final void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFg1cSDK, str, false, 4, null);
    }

    @oj.j
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1cSDK, str, th2, false, false, false, false, 120, null);
    }

    @oj.j
    public final void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFg1cSDK, str, false, 4, null);
    }

    @oj.j
    public final void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFg1cSDK, str, false, 4, null);
    }

    @oj.j
    public final void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFg1cSDK, str, false, 4, null);
    }

    @oj.j
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1cSDK, str, th2, z10, false, false, false, com.planner5d.library.engine.input.f.b.B, null);
    }

    @oj.j
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1cSDK, str, th2, z10, z11, false, false, 96, null);
    }

    @oj.j
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1cSDK, str, th2, z10, z11, z12, false, 64, null);
    }
}
