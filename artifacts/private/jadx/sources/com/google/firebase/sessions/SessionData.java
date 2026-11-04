package com.google.firebase.sessions;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlinx.serialization.b0
public final class SessionData {

    @NotNull
    public static final SessionData$$b Companion = new SessionData$$b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    private static final KSerializer<Object>[] f124825d = {null, null, new kotlinx.serialization.internal.e1(b3.f315897a, ProcessData$$a.f124824a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SessionDetails f124826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Time f124827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Map<String, ProcessData> f124828c;

    public /* synthetic */ SessionData(int i10, SessionDetails sessionDetails, Time time, Map map, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, SessionData$$a.f124829a.getDescriptor());
        }
        this.f124826a = sessionDetails;
        if ((i10 & 2) == 0) {
            this.f124827b = null;
        } else {
            this.f124827b = time;
        }
        if ((i10 & 4) == 0) {
            this.f124828c = null;
        } else {
            this.f124828c = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionData f(SessionData sessionData, SessionDetails sessionDetails, Time time, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sessionDetails = sessionData.f124826a;
        }
        if ((i10 & 2) != 0) {
            time = sessionData.f124827b;
        }
        if ((i10 & 4) != 0) {
            map = sessionData.f124828c;
        }
        return sessionData.e(sessionDetails, time, map);
    }

    @oj.n
    public static final /* synthetic */ void j(SessionData sessionData, kotlinx.serialization.encoding.e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f124825d;
        eVar.encodeSerializableElement(serialDescriptor, 0, SessionDetails$$a.f124834a, sessionData.f124826a);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || sessionData.f124827b != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 1, Time$$a.f124838a, sessionData.f124827b);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 2) || sessionData.f124828c != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], sessionData.f124828c);
        }
    }

    @NotNull
    public final SessionDetails b() {
        return this.f124826a;
    }

    @Nullable
    public final Time c() {
        return this.f124827b;
    }

    @Nullable
    public final Map<String, ProcessData> d() {
        return this.f124828c;
    }

    @NotNull
    public final SessionData e(@NotNull SessionDetails sessionDetails, @Nullable Time time, @Nullable Map<String, ProcessData> map) {
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        return new SessionData(sessionDetails, time, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionData)) {
            return false;
        }
        SessionData sessionData = (SessionData) obj;
        return Intrinsics.areEqual(this.f124826a, sessionData.f124826a) && Intrinsics.areEqual(this.f124827b, sessionData.f124827b) && Intrinsics.areEqual(this.f124828c, sessionData.f124828c);
    }

    @Nullable
    public final Time g() {
        return this.f124827b;
    }

    @Nullable
    public final Map<String, ProcessData> h() {
        return this.f124828c;
    }

    public int hashCode() {
        int iHashCode = this.f124826a.hashCode() * 31;
        Time time = this.f124827b;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (time == null ? 0 : time.hashCode())) * 31;
        Map<String, ProcessData> map = this.f124828c;
        if (map != null) {
            iHashCode2 = map.hashCode();
        }
        return iHashCode3 + iHashCode2;
    }

    @NotNull
    public final SessionDetails i() {
        return this.f124826a;
    }

    @NotNull
    public String toString() {
        return "SessionData(sessionDetails=" + this.f124826a + ", backgroundTime=" + this.f124827b + ", processDataMap=" + this.f124828c + ')';
    }

    public SessionData(@NotNull SessionDetails sessionDetails, @Nullable Time time, @Nullable Map<String, ProcessData> map) {
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        this.f124826a = sessionDetails;
        this.f124827b = time;
        this.f124828c = map;
    }

    public /* synthetic */ SessionData(SessionDetails sessionDetails, Time time, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionDetails, (i10 & 2) != 0 ? null : time, (i10 & 4) != 0 ? null : map);
    }
}
