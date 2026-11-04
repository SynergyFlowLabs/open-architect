package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlinx.serialization.b0
public final class SessionDetails {

    @NotNull
    public static final SessionDetails$$b Companion = new SessionDetails$$b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f124830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f124831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f124832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f124833d;

    public /* synthetic */ SessionDetails(int i10, String str, String str2, int i11, long j10, v2 v2Var) {
        if (15 != (i10 & 15)) {
            g2.b(i10, 15, SessionDetails$$a.f124834a.getDescriptor());
        }
        this.f124830a = str;
        this.f124831b = str2;
        this.f124832c = i11;
        this.f124833d = j10;
    }

    public static /* synthetic */ SessionDetails f(SessionDetails sessionDetails, String str, String str2, int i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionDetails.f124830a;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionDetails.f124831b;
        }
        if ((i11 & 4) != 0) {
            i10 = sessionDetails.f124832c;
        }
        if ((i11 & 8) != 0) {
            j10 = sessionDetails.f124833d;
        }
        int i12 = i10;
        return sessionDetails.e(str, str2, i12, j10);
    }

    @oj.n
    public static final /* synthetic */ void k(SessionDetails sessionDetails, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, sessionDetails.f124830a);
        eVar.encodeStringElement(serialDescriptor, 1, sessionDetails.f124831b);
        eVar.encodeIntElement(serialDescriptor, 2, sessionDetails.f124832c);
        eVar.encodeLongElement(serialDescriptor, 3, sessionDetails.f124833d);
    }

    @NotNull
    public final String a() {
        return this.f124830a;
    }

    @NotNull
    public final String b() {
        return this.f124831b;
    }

    public final int c() {
        return this.f124832c;
    }

    public final long d() {
        return this.f124833d;
    }

    @NotNull
    public final SessionDetails e(@NotNull String sessionId, @NotNull String firstSessionId, int i10, long j10) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        return new SessionDetails(sessionId, firstSessionId, i10, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) obj;
        return Intrinsics.areEqual(this.f124830a, sessionDetails.f124830a) && Intrinsics.areEqual(this.f124831b, sessionDetails.f124831b) && this.f124832c == sessionDetails.f124832c && this.f124833d == sessionDetails.f124833d;
    }

    @NotNull
    public final String g() {
        return this.f124831b;
    }

    @NotNull
    public final String h() {
        return this.f124830a;
    }

    public int hashCode() {
        return (((((this.f124830a.hashCode() * 31) + this.f124831b.hashCode()) * 31) + Integer.hashCode(this.f124832c)) * 31) + Long.hashCode(this.f124833d);
    }

    public final int i() {
        return this.f124832c;
    }

    public final long j() {
        return this.f124833d;
    }

    @NotNull
    public String toString() {
        return "SessionDetails(sessionId=" + this.f124830a + ", firstSessionId=" + this.f124831b + ", sessionIndex=" + this.f124832c + ", sessionStartTimestampUs=" + this.f124833d + ')';
    }

    public SessionDetails(@NotNull String sessionId, @NotNull String firstSessionId, int i10, long j10) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        this.f124830a = sessionId;
        this.f124831b = firstSessionId;
        this.f124832c = i10;
        this.f124833d = j10;
    }
}
