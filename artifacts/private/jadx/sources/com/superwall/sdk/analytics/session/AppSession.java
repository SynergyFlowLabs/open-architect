package com.superwall.sdk.analytics.session;

import com.superwall.sdk.models.serialization.DateSerializer;
import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class AppSession {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private Date endAt;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private String f267356id;

    @NotNull
    private Date startAt;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<AppSession> serializer() {
            return AppSession$$serializer.INSTANCE;
        }

        @NotNull
        public final AppSession stub() {
            return new AppSession((String) null, (Date) null, (Date) null, 7, (DefaultConstructorMarker) null);
        }

        private Companion() {
        }
    }

    public AppSession() {
        this((String) null, (Date) null, (Date) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AppSession copy$default(AppSession appSession, String str, Date date, Date date2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appSession.f267356id;
        }
        if ((i10 & 2) != 0) {
            date = appSession.startAt;
        }
        if ((i10 & 4) != 0) {
            date2 = appSession.endAt;
        }
        return appSession.copy(str, date, date2);
    }

    @b0(with = DateSerializer.class)
    @a0("app_session_end_ts")
    public static /* synthetic */ void getEndAt$annotations() {
    }

    @a0("app_session_id")
    public static /* synthetic */ void getId$annotations() {
    }

    @b0(with = DateSerializer.class)
    @a0("app_session_start_ts")
    public static /* synthetic */ void getStartAt$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(AppSession appSession, e eVar, SerialDescriptor serialDescriptor) {
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.areEqual(appSession.f267356id, UUID.randomUUID().toString())) {
            eVar.encodeStringElement(serialDescriptor, 0, appSession.f267356id);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.areEqual(appSession.startAt, new Date())) {
            eVar.encodeSerializableElement(serialDescriptor, 1, DateSerializer.INSTANCE, appSession.startAt);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 2) || appSession.endAt != null) {
            eVar.encodeNullableSerializableElement(serialDescriptor, 2, DateSerializer.INSTANCE, appSession.endAt);
        }
    }

    @NotNull
    public final String component1() {
        return this.f267356id;
    }

    @NotNull
    public final Date component2() {
        return this.startAt;
    }

    @Nullable
    public final Date component3() {
        return this.endAt;
    }

    @NotNull
    public final AppSession copy(@NotNull String id2, @NotNull Date startAt, @Nullable Date date) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        return new AppSession(id2, startAt, date);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSession)) {
            return false;
        }
        AppSession appSession = (AppSession) obj;
        return Intrinsics.areEqual(this.f267356id, appSession.f267356id) && Intrinsics.areEqual(this.startAt, appSession.startAt) && Intrinsics.areEqual(this.endAt, appSession.endAt);
    }

    @Nullable
    public final Date getEndAt() {
        return this.endAt;
    }

    @NotNull
    public final String getId() {
        return this.f267356id;
    }

    @NotNull
    public final Date getStartAt() {
        return this.startAt;
    }

    public int hashCode() {
        int iHashCode = ((this.f267356id.hashCode() * 31) + this.startAt.hashCode()) * 31;
        Date date = this.endAt;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public final void setEndAt(@Nullable Date date) {
        this.endAt = date;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f267356id = str;
    }

    public final void setStartAt(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.startAt = date;
    }

    @NotNull
    public String toString() {
        return "AppSession(id=" + this.f267356id + ", startAt=" + this.startAt + ", endAt=" + this.endAt + ")";
    }

    public /* synthetic */ AppSession(int i10, String str, Date date, Date date2, v2 v2Var) {
        this.f267356id = (i10 & 1) == 0 ? UUID.randomUUID().toString() : str;
        if ((i10 & 2) == 0) {
            this.startAt = new Date();
        } else {
            this.startAt = date;
        }
        if ((i10 & 4) == 0) {
            this.endAt = null;
        } else {
            this.endAt = date2;
        }
    }

    public AppSession(@NotNull String id2, @NotNull Date startAt, @Nullable Date date) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        this.f267356id = id2;
        this.startAt = startAt;
        this.endAt = date;
    }

    public /* synthetic */ AppSession(String str, Date date, Date date2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? UUID.randomUUID().toString() : str, (i10 & 2) != 0 ? new Date() : date, (i10 & 4) != 0 ? null : date2);
    }
}
