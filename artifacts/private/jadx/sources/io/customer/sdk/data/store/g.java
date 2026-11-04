package io.customer.sdk.data.store;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f288525c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f288526d = "Android";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f288527e = "io.customer.sdk.android.core.SDK_SOURCE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f288528f = "io.customer.sdk.android.core.SDK_VERSION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f288529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f288530b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final g a(@Nullable Bundle bundle) {
            String string = bundle != null ? bundle.getString(g.f288527e) : null;
            String string2 = bundle != null ? bundle.getString(g.f288528f) : null;
            return (string == null || StringsKt.w3(string) || string2 == null || StringsKt.w3(string2)) ? new g(g.f288526d, io.customer.sdk.n.f288632b) : new g(string, string2);
        }

        private a() {
        }
    }

    public g(@NotNull String source, @NotNull String sdkVersion) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.f288529a = source;
        this.f288530b = sdkVersion;
    }

    @NotNull
    public final String a() {
        return this.f288530b;
    }

    @NotNull
    public final String b() {
        return this.f288529a;
    }

    @NotNull
    public String toString() {
        return this.f288529a + " Client/" + this.f288530b;
    }
}
