package com.devtodev.analytics.internal.domain;

import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeBoolean;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeInt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLongOrNull;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeStringOrNull;
import com.devtodev.analytics.internal.storage.sqlite.SelectParameter;
import com.devtodev.analytics.internal.storage.sqlite.SelectRecords;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.rabbitmq.client.r;
import h4.a;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nUser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 User.kt\ncom/devtodev/analytics/internal/domain/User\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
public final class User extends DbModel {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private boolean balanceIsSent;
    private long idKey;
    private boolean isDefaultUser;
    private boolean isResourceAggregationEnable;

    @Nullable
    private Long lastBackgroundTime;

    @Nullable
    private Long lastForegroundTime;
    private int level;

    @Nullable
    private String previousUserId;
    private long projectId;

    @Nullable
    private Long sessionId;

    @Nullable
    private String userId;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SelectParameter> getColumnsTypes() {
            ColumnTypeLong columnTypeLong = ColumnTypeLong.INSTANCE;
            SelectParameter selectParameter = new SelectParameter("_id", columnTypeLong);
            SelectParameter selectParameter2 = new SelectParameter("projectId", columnTypeLong);
            SelectParameter selectParameter3 = new SelectParameter("level", ColumnTypeInt.INSTANCE);
            ColumnTypeLongOrNull columnTypeLongOrNull = ColumnTypeLongOrNull.INSTANCE;
            SelectParameter selectParameter4 = new SelectParameter(UserEntry.sessionId, columnTypeLongOrNull);
            ColumnTypeStringOrNull columnTypeStringOrNull = ColumnTypeStringOrNull.INSTANCE;
            SelectParameter selectParameter5 = new SelectParameter("userId", columnTypeStringOrNull);
            SelectParameter selectParameter6 = new SelectParameter(UserEntry.previousUserId, columnTypeStringOrNull);
            SelectParameter selectParameter7 = new SelectParameter(UserEntry.lastForegroundTime, columnTypeLongOrNull);
            SelectParameter selectParameter8 = new SelectParameter(UserEntry.lastBackgroundTime, columnTypeLongOrNull);
            ColumnTypeBoolean columnTypeBoolean = ColumnTypeBoolean.INSTANCE;
            return CollectionsKt.listOf((Object[]) new SelectParameter[]{selectParameter, selectParameter2, selectParameter3, selectParameter4, selectParameter5, selectParameter6, selectParameter7, selectParameter8, new SelectParameter(UserEntry.isDefaultUser, columnTypeBoolean), new SelectParameter(UserEntry.isResourceAggregationEnable, columnTypeBoolean)});
        }

        @NotNull
        public final DbModel init(@NotNull SelectRecords records) {
            Intrinsics.checkNotNullParameter(records, "records");
            SqlValue eventValue = records.getEventValue("_id");
            Intrinsics.checkNotNull(eventValue, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong = ((SqlValue.Long) eventValue).getALong();
            SqlValue eventValue2 = records.getEventValue("projectId");
            Intrinsics.checkNotNull(eventValue2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong2 = ((SqlValue.Long) eventValue2).getALong();
            SqlValue eventValue3 = records.getEventValue("level");
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Int");
            int anInt = ((SqlValue.Int) eventValue3).getAnInt();
            SqlValue eventValue4 = records.getEventValue(UserEntry.sessionId);
            Intrinsics.checkNotNull(eventValue4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            Long aLong3 = ((SqlValue.LongOrNull) eventValue4).getALong();
            SqlValue eventValue5 = records.getEventValue("userId");
            Intrinsics.checkNotNull(eventValue5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            String string = ((SqlValue.StringOrNull) eventValue5).getString();
            SqlValue eventValue6 = records.getEventValue(UserEntry.previousUserId);
            Intrinsics.checkNotNull(eventValue6, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            String string2 = ((SqlValue.StringOrNull) eventValue6).getString();
            SqlValue eventValue7 = records.getEventValue(UserEntry.lastForegroundTime);
            Intrinsics.checkNotNull(eventValue7, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            Long aLong4 = ((SqlValue.LongOrNull) eventValue7).getALong();
            SqlValue eventValue8 = records.getEventValue(UserEntry.lastBackgroundTime);
            Intrinsics.checkNotNull(eventValue8, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            Long aLong5 = ((SqlValue.LongOrNull) eventValue8).getALong();
            SqlValue eventValue9 = records.getEventValue(UserEntry.isDefaultUser);
            Intrinsics.checkNotNull(eventValue9, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            boolean aBoolean = ((SqlValue.Boolean) eventValue9).getABoolean();
            SqlValue eventValue10 = records.getEventValue(UserEntry.isResourceAggregationEnable);
            Intrinsics.checkNotNull(eventValue10, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            return new User(aLong, aLong2, anInt, aLong3, string, string2, aLong4, aLong5, aBoolean, ((SqlValue.Boolean) eventValue10).getABoolean(), false, 1024, null);
        }

        private Companion() {
        }
    }

    public User() {
        this(0L, 0L, 0, null, null, null, null, null, false, false, false, r.f265987x3, null);
    }

    public final long component1() {
        return getIdKey();
    }

    public final boolean component10() {
        return this.isResourceAggregationEnable;
    }

    public final boolean component11() {
        return this.balanceIsSent;
    }

    public final long component2() {
        return this.projectId;
    }

    public final int component3() {
        return this.level;
    }

    @Nullable
    public final Long component4() {
        return this.sessionId;
    }

    @Nullable
    public final String component5() {
        return this.userId;
    }

    @Nullable
    public final String component6() {
        return this.previousUserId;
    }

    @Nullable
    public final Long component7() {
        return this.lastForegroundTime;
    }

    @Nullable
    public final Long component8() {
        return this.lastBackgroundTime;
    }

    public final boolean component9() {
        return this.isDefaultUser;
    }

    @NotNull
    public final User copy(long j10, long j11, int i10, @Nullable Long l10, @Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable Long l12, boolean z10, boolean z11, boolean z12) {
        return new User(j10, j11, i10, l10, str, str2, l11, l12, z10, z11, z12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return getIdKey() == user.getIdKey() && this.projectId == user.projectId && this.level == user.level && Intrinsics.areEqual(this.sessionId, user.sessionId) && Intrinsics.areEqual(this.userId, user.userId) && Intrinsics.areEqual(this.previousUserId, user.previousUserId) && Intrinsics.areEqual(this.lastForegroundTime, user.lastForegroundTime) && Intrinsics.areEqual(this.lastBackgroundTime, user.lastBackgroundTime) && this.isDefaultUser == user.isDefaultUser && this.isResourceAggregationEnable == user.isResourceAggregationEnable && this.balanceIsSent == user.balanceIsSent;
    }

    public final boolean getBalanceIsSent() {
        return this.balanceIsSent;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public long getIdKey() {
        return this.idKey;
    }

    @Nullable
    public final Long getLastBackgroundTime() {
        return this.lastBackgroundTime;
    }

    @Nullable
    public final Long getLastForegroundTime() {
        return this.lastForegroundTime;
    }

    public final int getLevel() {
        return this.level;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<SelectParameter> getModelColumnsTypes() {
        return Companion.getColumnsTypes();
    }

    @Nullable
    public final String getPreviousUserId() {
        return this.previousUserId;
    }

    public final long getProjectId() {
        return this.projectId;
    }

    @Nullable
    public final Long getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = (Integer.hashCode(this.level) + a.a(this.projectId, Long.hashCode(getIdKey()) * 31, 31)) * 31;
        Long l10 = this.sessionId;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.userId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.previousUserId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.lastForegroundTime;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.lastBackgroundTime;
        int iHashCode6 = (iHashCode5 + (l12 != null ? l12.hashCode() : 0)) * 31;
        boolean z10 = this.isDefaultUser;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode6 + r10) * 31;
        boolean z11 = this.isResourceAggregationEnable;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z12 = this.balanceIsSent;
        return i11 + (z12 ? 1 : z12);
    }

    public final boolean isDefaultUser() {
        return this.isDefaultUser;
    }

    public final boolean isResourceAggregationEnable() {
        return this.isResourceAggregationEnable;
    }

    public final void setBalanceIsSent(boolean z10) {
        this.balanceIsSent = z10;
    }

    public final void setDefaultUser(boolean z10) {
        this.isDefaultUser = z10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public void setIdKey(long j10) {
        this.idKey = j10;
    }

    public final void setLastBackgroundTime(@Nullable Long l10) {
        this.lastBackgroundTime = l10;
    }

    public final void setLastForegroundTime(@Nullable Long l10) {
        this.lastForegroundTime = l10;
    }

    public final void setLevel(int i10) {
        this.level = i10;
    }

    public final void setPreviousUserId(@Nullable String str) {
        this.previousUserId = str;
    }

    public final void setProjectId(long j10) {
        this.projectId = j10;
    }

    public final void setResourceAggregationEnable(boolean z10) {
        this.isResourceAggregationEnable = z10;
    }

    public final void setSessionId(@Nullable Long l10) {
        this.sessionId = l10;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<EventParam> toList() {
        return CollectionsKt.listOf((Object[]) new EventParam[]{new EventParam("projectId", new SqlValue.Long(this.projectId)), new EventParam("level", new SqlValue.Int(this.level)), new EventParam(UserEntry.sessionId, new SqlValue.LongOrNull(this.sessionId)), new EventParam("userId", new SqlValue.StringOrNull(this.userId)), new EventParam(UserEntry.previousUserId, new SqlValue.StringOrNull(this.previousUserId)), new EventParam(UserEntry.lastForegroundTime, new SqlValue.LongOrNull(this.lastForegroundTime)), new EventParam(UserEntry.lastBackgroundTime, new SqlValue.LongOrNull(this.lastBackgroundTime)), new EventParam(UserEntry.isDefaultUser, new SqlValue.Boolean(this.isDefaultUser)), new EventParam(UserEntry.isResourceAggregationEnable, new SqlValue.Boolean(this.isResourceAggregationEnable))});
    }

    @NotNull
    public String toString() {
        return "User(idKey=" + getIdKey() + ", projectId=" + this.projectId + ", level=" + this.level + ", sessionId=" + this.sessionId + ", userId=" + this.userId + ", previousUserId=" + this.previousUserId + ", lastForegroundTime=" + this.lastForegroundTime + ", lastBackgroundTime=" + this.lastBackgroundTime + ", isDefaultUser=" + this.isDefaultUser + ", isResourceAggregationEnable=" + this.isResourceAggregationEnable + ", balanceIsSent=" + this.balanceIsSent + ")";
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public void updateData(@NotNull List<EventParam> eventParams) {
        Object next;
        Intrinsics.checkNotNullParameter(eventParams, "eventParams");
        List<EventParam> list = toList();
        for (EventParam eventParam : eventParams) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                EventParam eventParam2 = (EventParam) next;
                if (Intrinsics.areEqual(eventParam2.getName(), eventParam.getName()) && !Intrinsics.areEqual(eventParam2.getValue(), eventParam.getValue())) {
                    break;
                }
            }
            EventParam eventParam3 = (EventParam) next;
            if (eventParam3 != null) {
                eventParam3.setValue(eventParam.getValue());
            }
        }
        EventParam eventParamContainsName = EventParamKt.containsName(list, "level");
        if (eventParamContainsName != null) {
            SqlValue value = eventParamContainsName.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Int");
            this.level = ((SqlValue.Int) value).getAnInt();
        }
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, UserEntry.sessionId);
        if (eventParamContainsName2 != null) {
            SqlValue value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            this.sessionId = ((SqlValue.LongOrNull) value2).getALong();
        }
        EventParam eventParamContainsName3 = EventParamKt.containsName(list, "userId");
        if (eventParamContainsName3 != null) {
            SqlValue value3 = eventParamContainsName3.getValue();
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            this.userId = ((SqlValue.StringOrNull) value3).getString();
        }
        EventParam eventParamContainsName4 = EventParamKt.containsName(list, UserEntry.previousUserId);
        if (eventParamContainsName4 != null) {
            SqlValue value4 = eventParamContainsName4.getValue();
            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            this.previousUserId = ((SqlValue.StringOrNull) value4).getString();
        }
        EventParam eventParamContainsName5 = EventParamKt.containsName(list, UserEntry.lastForegroundTime);
        if (eventParamContainsName5 != null) {
            SqlValue value5 = eventParamContainsName5.getValue();
            Intrinsics.checkNotNull(value5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            this.lastForegroundTime = ((SqlValue.LongOrNull) value5).getALong();
        }
        EventParam eventParamContainsName6 = EventParamKt.containsName(list, UserEntry.lastBackgroundTime);
        if (eventParamContainsName6 != null) {
            SqlValue value6 = eventParamContainsName6.getValue();
            Intrinsics.checkNotNull(value6, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            this.lastBackgroundTime = ((SqlValue.LongOrNull) value6).getALong();
        }
        EventParam eventParamContainsName7 = EventParamKt.containsName(list, UserEntry.isDefaultUser);
        if (eventParamContainsName7 != null) {
            SqlValue value7 = eventParamContainsName7.getValue();
            Intrinsics.checkNotNull(value7, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            this.isDefaultUser = ((SqlValue.Boolean) value7).getABoolean();
        }
        EventParam eventParamContainsName8 = EventParamKt.containsName(list, UserEntry.isResourceAggregationEnable);
        if (eventParamContainsName8 != null) {
            SqlValue value8 = eventParamContainsName8.getValue();
            Intrinsics.checkNotNull(value8, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            this.isResourceAggregationEnable = ((SqlValue.Boolean) value8).getABoolean();
        }
    }

    public /* synthetic */ User(long j10, long j11, int i10, Long l10, String str, String str2, Long l11, Long l12, boolean z10, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? -1L : j10, (i11 & 2) == 0 ? j11 : -1L, (i11 & 4) != 0 ? 1 : i10, (i11 & 8) != 0 ? null : l10, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : l11, (i11 & 128) == 0 ? l12 : null, (i11 & 256) != 0 ? false : z10, (i11 & 512) == 0 ? z11 : true, (i11 & 1024) != 0 ? false : z12);
    }

    public User(long j10, long j11, int i10, @Nullable Long l10, @Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable Long l12, boolean z10, boolean z11, boolean z12) {
        this.idKey = j10;
        this.projectId = j11;
        this.level = i10;
        this.sessionId = l10;
        this.userId = str;
        this.previousUserId = str2;
        this.lastForegroundTime = l11;
        this.lastBackgroundTime = l12;
        this.isDefaultUser = z10;
        this.isResourceAggregationEnable = z11;
        this.balanceIsSent = z12;
    }
}
