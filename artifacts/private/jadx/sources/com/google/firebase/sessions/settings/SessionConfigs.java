package com.google.firebase.sessions.settings;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.e0;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.k1;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@b0
public final class SessionConfigs {

    @NotNull
    public static final SessionConfigs$$b Companion = new SessionConfigs$$b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f125079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Double f125080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Integer f125081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Integer f125082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Long f125083e;

    public /* synthetic */ SessionConfigs(int i10, Boolean bool, Double d10, Integer num, Integer num2, Long l10, v2 v2Var) {
        if (31 != (i10 & 31)) {
            g2.b(i10, 31, SessionConfigs$$a.f125084a.getDescriptor());
        }
        this.f125079a = bool;
        this.f125080b = d10;
        this.f125081c = num;
        this.f125082d = num2;
        this.f125083e = l10;
    }

    public static /* synthetic */ SessionConfigs g(SessionConfigs sessionConfigs, Boolean bool, Double d10, Integer num, Integer num2, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = sessionConfigs.f125079a;
        }
        if ((i10 & 2) != 0) {
            d10 = sessionConfigs.f125080b;
        }
        if ((i10 & 4) != 0) {
            num = sessionConfigs.f125081c;
        }
        if ((i10 & 8) != 0) {
            num2 = sessionConfigs.f125082d;
        }
        if ((i10 & 16) != 0) {
            l10 = sessionConfigs.f125083e;
        }
        Long l11 = l10;
        Integer num3 = num;
        return sessionConfigs.f(bool, d10, num3, num2, l11);
    }

    @oj.n
    public static final /* synthetic */ void m(SessionConfigs sessionConfigs, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeNullableSerializableElement(serialDescriptor, 0, kotlinx.serialization.internal.i.f315935a, sessionConfigs.f125079a);
        eVar.encodeNullableSerializableElement(serialDescriptor, 1, e0.f315908a, sessionConfigs.f125080b);
        y0 y0Var = y0.f316055a;
        eVar.encodeNullableSerializableElement(serialDescriptor, 2, y0Var, sessionConfigs.f125081c);
        eVar.encodeNullableSerializableElement(serialDescriptor, 3, y0Var, sessionConfigs.f125082d);
        eVar.encodeNullableSerializableElement(serialDescriptor, 4, k1.f315958a, sessionConfigs.f125083e);
    }

    @Nullable
    public final Boolean a() {
        return this.f125079a;
    }

    @Nullable
    public final Double b() {
        return this.f125080b;
    }

    @Nullable
    public final Integer c() {
        return this.f125081c;
    }

    @Nullable
    public final Integer d() {
        return this.f125082d;
    }

    @Nullable
    public final Long e() {
        return this.f125083e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) obj;
        return Intrinsics.areEqual(this.f125079a, sessionConfigs.f125079a) && Intrinsics.areEqual((Object) this.f125080b, (Object) sessionConfigs.f125080b) && Intrinsics.areEqual(this.f125081c, sessionConfigs.f125081c) && Intrinsics.areEqual(this.f125082d, sessionConfigs.f125082d) && Intrinsics.areEqual(this.f125083e, sessionConfigs.f125083e);
    }

    @NotNull
    public final SessionConfigs f(@Nullable Boolean bool, @Nullable Double d10, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l10) {
        return new SessionConfigs(bool, d10, num, num2, l10);
    }

    @Nullable
    public final Integer h() {
        return this.f125082d;
    }

    public int hashCode() {
        Boolean bool = this.f125079a;
        int iHashCode = 0;
        int iHashCode2 = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f125080b;
        int iHashCode3 = (iHashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f125081c;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f125082d;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f125083e;
        if (l10 != null) {
            iHashCode = l10.hashCode();
        }
        return iHashCode5 + iHashCode;
    }

    @Nullable
    public final Long i() {
        return this.f125083e;
    }

    @Nullable
    public final Double j() {
        return this.f125080b;
    }

    @Nullable
    public final Integer k() {
        return this.f125081c;
    }

    @Nullable
    public final Boolean l() {
        return this.f125079a;
    }

    @NotNull
    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f125079a + ", sessionSamplingRate=" + this.f125080b + ", sessionTimeoutSeconds=" + this.f125081c + ", cacheDurationSeconds=" + this.f125082d + ", cacheUpdatedTimeSeconds=" + this.f125083e + ')';
    }

    public SessionConfigs(@Nullable Boolean bool, @Nullable Double d10, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l10) {
        this.f125079a = bool;
        this.f125080b = d10;
        this.f125081c = num;
        this.f125082d = num2;
        this.f125083e = l10;
    }
}
