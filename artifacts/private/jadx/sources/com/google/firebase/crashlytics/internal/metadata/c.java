package com.google.firebase.crashlytics.internal.metadata;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f121270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f121271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f121272c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public c(@NotNull String sessionId, long j10) {
        this(sessionId, j10, null, 4, null);
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c e(c cVar, String str, long j10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cVar.f121270a;
        }
        if ((i10 & 2) != 0) {
            j10 = cVar.f121271b;
        }
        if ((i10 & 4) != 0) {
            map = cVar.f121272c;
        }
        return cVar.d(str, j10, map);
    }

    @NotNull
    public final String a() {
        return this.f121270a;
    }

    public final long b() {
        return this.f121271b;
    }

    @NotNull
    public final Map<String, String> c() {
        return this.f121272c;
    }

    @NotNull
    public final c d(@NotNull String sessionId, long j10, @NotNull Map<String, String> additionalCustomKeys) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        return new c(sessionId, j10, additionalCustomKeys);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f121270a, cVar.f121270a) && this.f121271b == cVar.f121271b && Intrinsics.areEqual(this.f121272c, cVar.f121272c);
    }

    @NotNull
    public final Map<String, String> f() {
        return this.f121272c;
    }

    @NotNull
    public final String g() {
        return this.f121270a;
    }

    public final long h() {
        return this.f121271b;
    }

    public int hashCode() {
        return (((this.f121270a.hashCode() * 31) + Long.hashCode(this.f121271b)) * 31) + this.f121272c.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventMetadata(sessionId=" + this.f121270a + ", timestamp=" + this.f121271b + ", additionalCustomKeys=" + this.f121272c + ')';
    }

    @oj.j
    public c(@NotNull String sessionId, long j10, @NotNull Map<String, String> additionalCustomKeys) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        this.f121270a = sessionId;
        this.f121271b = j10;
        this.f121272c = additionalCustomKeys;
    }

    public /* synthetic */ c(String str, long j10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, (i10 & 4) != 0 ? MapsKt.emptyMap() : map);
    }
}
