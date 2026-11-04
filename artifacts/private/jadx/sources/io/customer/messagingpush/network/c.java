package io.customer.messagingpush.network;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f288455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f288456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f288457c;

    public c(@NotNull String path, @NotNull Map<String, String> headers, @Nullable String str) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f288455a = path;
        this.f288456b = headers;
        this.f288457c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c e(c cVar, String str, Map map, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cVar.f288455a;
        }
        if ((i10 & 2) != 0) {
            map = cVar.f288456b;
        }
        if ((i10 & 4) != 0) {
            str2 = cVar.f288457c;
        }
        return cVar.d(str, map, str2);
    }

    @NotNull
    public final String a() {
        return this.f288455a;
    }

    @NotNull
    public final Map<String, String> b() {
        return this.f288456b;
    }

    @Nullable
    public final String c() {
        return this.f288457c;
    }

    @NotNull
    public final c d(@NotNull String path, @NotNull Map<String, String> headers, @Nullable String str) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new c(path, headers, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f288455a, cVar.f288455a) && Intrinsics.areEqual(this.f288456b, cVar.f288456b) && Intrinsics.areEqual(this.f288457c, cVar.f288457c);
    }

    @Nullable
    public final String f() {
        return this.f288457c;
    }

    @NotNull
    public final Map<String, String> g() {
        return this.f288456b;
    }

    @NotNull
    public final String h() {
        return this.f288455a;
    }

    public int hashCode() {
        int iHashCode = ((this.f288455a.hashCode() * 31) + this.f288456b.hashCode()) * 31;
        String str = this.f288457c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "HttpRequestParams(path=" + this.f288455a + ", headers=" + this.f288456b + ", body=" + this.f288457c + ")";
    }

    public /* synthetic */ c(String str, Map map, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? MapsKt.emptyMap() : map, (i10 & 4) != 0 ? null : str2);
    }
}
