package com.devtodev.analytics.internal.domain;

import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeBoolean;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLongOrNull;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeString;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeStringOrNull;
import com.devtodev.analytics.internal.storage.sqlite.IdentifiersEntry;
import com.devtodev.analytics.internal.storage.sqlite.SelectParameter;
import com.devtodev.analytics.internal.storage.sqlite.SelectRecords;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import h4.a;
import h4.b;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDeviceIdentifiers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceIdentifiers.kt\ncom/devtodev/analytics/internal/domain/DeviceIdentifiers\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
public final class DeviceIdentifiers extends DbModel {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private Long crossPlatformDevtodevId;

    @NotNull
    private String deviceIdentifier;

    @Nullable
    private Long devtodevId;

    @Nullable
    private Long devtodevIdTimestamp;
    private long idKey;
    private boolean isValid;

    @Nullable
    private String previousDeviceIdentifier;
    private long projectId;

    @NotNull
    private String uuid;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SelectParameter> getColumnsTypes() {
            ColumnTypeLong columnTypeLong = ColumnTypeLong.INSTANCE;
            SelectParameter selectParameter = new SelectParameter("_id", columnTypeLong);
            SelectParameter selectParameter2 = new SelectParameter("projectId", columnTypeLong);
            ColumnTypeString columnTypeString = ColumnTypeString.INSTANCE;
            SelectParameter selectParameter3 = new SelectParameter(IdentifiersEntry.deviceIdentifier, columnTypeString);
            SelectParameter selectParameter4 = new SelectParameter(IdentifiersEntry.previousDeviceIdentifier, ColumnTypeStringOrNull.INSTANCE);
            ColumnTypeLongOrNull columnTypeLongOrNull = ColumnTypeLongOrNull.INSTANCE;
            return CollectionsKt.listOf((Object[]) new SelectParameter[]{selectParameter, selectParameter2, selectParameter3, selectParameter4, new SelectParameter(IdentifiersEntry.devtodevId, columnTypeLongOrNull), new SelectParameter(IdentifiersEntry.crossPlatformDevtodevId, columnTypeLongOrNull), new SelectParameter(IdentifiersEntry.devtodevIdTimestamp, columnTypeLongOrNull), new SelectParameter("uuid", columnTypeString), new SelectParameter(IdentifiersEntry.isValid, ColumnTypeBoolean.INSTANCE)});
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
            SqlValue eventValue3 = records.getEventValue(IdentifiersEntry.deviceIdentifier);
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            String string = ((SqlValue.String) eventValue3).getString();
            SqlValue eventValue4 = records.getEventValue(IdentifiersEntry.previousDeviceIdentifier);
            Intrinsics.checkNotNull(eventValue4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            String string2 = ((SqlValue.StringOrNull) eventValue4).getString();
            SqlValue eventValue5 = records.getEventValue(IdentifiersEntry.devtodevId);
            Intrinsics.checkNotNull(eventValue5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            Long aLong3 = ((SqlValue.LongOrNull) eventValue5).getALong();
            SqlValue eventValue6 = records.getEventValue(IdentifiersEntry.crossPlatformDevtodevId);
            Intrinsics.checkNotNull(eventValue6, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            Long aLong4 = ((SqlValue.LongOrNull) eventValue6).getALong();
            SqlValue eventValue7 = records.getEventValue(IdentifiersEntry.devtodevIdTimestamp);
            Intrinsics.checkNotNull(eventValue7, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            Long aLong5 = ((SqlValue.LongOrNull) eventValue7).getALong();
            SqlValue eventValue8 = records.getEventValue("uuid");
            Intrinsics.checkNotNull(eventValue8, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            String string3 = ((SqlValue.String) eventValue8).getString();
            SqlValue eventValue9 = records.getEventValue(IdentifiersEntry.isValid);
            Intrinsics.checkNotNull(eventValue9, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            return new DeviceIdentifiers(aLong, aLong2, string, string2, aLong3, aLong4, aLong5, string3, ((SqlValue.Boolean) eventValue9).getABoolean());
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeviceIdentifiers(long j10, long j11, String str, String str2, Long l10, Long l11, Long l12, String str3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? -1L : j10, j11, str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : l10, (i10 & 32) != 0 ? null : l11, (i10 & 64) != 0 ? null : l12, str3, (i10 & 256) != 0 ? true : z10);
    }

    public static /* synthetic */ DeviceIdentifiers copy$default(DeviceIdentifiers deviceIdentifiers, long j10, long j11, String str, String str2, Long l10, Long l11, Long l12, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = deviceIdentifiers.getIdKey();
        }
        return deviceIdentifiers.copy(j10, (i10 & 2) != 0 ? deviceIdentifiers.projectId : j11, (i10 & 4) != 0 ? deviceIdentifiers.deviceIdentifier : str, (i10 & 8) != 0 ? deviceIdentifiers.previousDeviceIdentifier : str2, (i10 & 16) != 0 ? deviceIdentifiers.devtodevId : l10, (i10 & 32) != 0 ? deviceIdentifiers.crossPlatformDevtodevId : l11, (i10 & 64) != 0 ? deviceIdentifiers.devtodevIdTimestamp : l12, (i10 & 128) != 0 ? deviceIdentifiers.uuid : str3, (i10 & 256) != 0 ? deviceIdentifiers.isValid : z10);
    }

    public final long component1() {
        return getIdKey();
    }

    public final long component2() {
        return this.projectId;
    }

    @NotNull
    public final String component3() {
        return this.deviceIdentifier;
    }

    @Nullable
    public final String component4() {
        return this.previousDeviceIdentifier;
    }

    @Nullable
    public final Long component5() {
        return this.devtodevId;
    }

    @Nullable
    public final Long component6() {
        return this.crossPlatformDevtodevId;
    }

    @Nullable
    public final Long component7() {
        return this.devtodevIdTimestamp;
    }

    @NotNull
    public final String component8() {
        return this.uuid;
    }

    public final boolean component9() {
        return this.isValid;
    }

    @NotNull
    public final DeviceIdentifiers copy(long j10, long j11, @NotNull String deviceIdentifier, @Nullable String str, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @NotNull String uuid, boolean z10) {
        Intrinsics.checkNotNullParameter(deviceIdentifier, "deviceIdentifier");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new DeviceIdentifiers(j10, j11, deviceIdentifier, str, l10, l11, l12, uuid, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceIdentifiers)) {
            return false;
        }
        DeviceIdentifiers deviceIdentifiers = (DeviceIdentifiers) obj;
        return getIdKey() == deviceIdentifiers.getIdKey() && this.projectId == deviceIdentifiers.projectId && Intrinsics.areEqual(this.deviceIdentifier, deviceIdentifiers.deviceIdentifier) && Intrinsics.areEqual(this.previousDeviceIdentifier, deviceIdentifiers.previousDeviceIdentifier) && Intrinsics.areEqual(this.devtodevId, deviceIdentifiers.devtodevId) && Intrinsics.areEqual(this.crossPlatformDevtodevId, deviceIdentifiers.crossPlatformDevtodevId) && Intrinsics.areEqual(this.devtodevIdTimestamp, deviceIdentifiers.devtodevIdTimestamp) && Intrinsics.areEqual(this.uuid, deviceIdentifiers.uuid) && this.isValid == deviceIdentifiers.isValid;
    }

    @Nullable
    public final Long getCrossPlatformDevtodevId() {
        return this.crossPlatformDevtodevId;
    }

    @NotNull
    public final String getDeviceIdentifier() {
        return this.deviceIdentifier;
    }

    @Nullable
    public final Long getDevtodevId() {
        return this.devtodevId;
    }

    @Nullable
    public final Long getDevtodevIdTimestamp() {
        return this.devtodevIdTimestamp;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public long getIdKey() {
        return this.idKey;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<SelectParameter> getModelColumnsTypes() {
        return Companion.getColumnsTypes();
    }

    @Nullable
    public final String getPreviousDeviceIdentifier() {
        return this.previousDeviceIdentifier;
    }

    public final long getProjectId() {
        return this.projectId;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public int hashCode() {
        int iA = b.a(this.deviceIdentifier, a.a(this.projectId, Long.hashCode(getIdKey()) * 31, 31), 31);
        String str = this.previousDeviceIdentifier;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.devtodevId;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.crossPlatformDevtodevId;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.devtodevIdTimestamp;
        int iA2 = b.a(this.uuid, (iHashCode3 + (l12 != null ? l12.hashCode() : 0)) * 31, 31);
        boolean z10 = this.isValid;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iA2 + r10;
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final void setCrossPlatformDevtodevId(@Nullable Long l10) {
        this.crossPlatformDevtodevId = l10;
    }

    public final void setDeviceIdentifier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceIdentifier = str;
    }

    public final void setDevtodevId(@Nullable Long l10) {
        this.devtodevId = l10;
    }

    public final void setDevtodevIdTimestamp(@Nullable Long l10) {
        this.devtodevIdTimestamp = l10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public void setIdKey(long j10) {
        this.idKey = j10;
    }

    public final void setPreviousDeviceIdentifier(@Nullable String str) {
        this.previousDeviceIdentifier = str;
    }

    public final void setProjectId(long j10) {
        this.projectId = j10;
    }

    public final void setUuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }

    public final void setValid(boolean z10) {
        this.isValid = z10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<EventParam> toList() {
        return CollectionsKt.listOf((Object[]) new EventParam[]{new EventParam("projectId", new SqlValue.Long(this.projectId)), new EventParam(IdentifiersEntry.deviceIdentifier, new SqlValue.String(this.deviceIdentifier)), new EventParam(IdentifiersEntry.previousDeviceIdentifier, new SqlValue.StringOrNull(this.previousDeviceIdentifier)), new EventParam(IdentifiersEntry.devtodevId, new SqlValue.LongOrNull(this.devtodevId)), new EventParam(IdentifiersEntry.crossPlatformDevtodevId, new SqlValue.LongOrNull(this.crossPlatformDevtodevId)), new EventParam(IdentifiersEntry.devtodevIdTimestamp, new SqlValue.LongOrNull(this.devtodevIdTimestamp)), new EventParam("uuid", new SqlValue.String(this.uuid)), new EventParam(IdentifiersEntry.isValid, new SqlValue.Boolean(this.isValid))});
    }

    @NotNull
    public String toString() {
        return "DeviceIdentifiers(idKey=" + getIdKey() + ", projectId=" + this.projectId + ", deviceIdentifier=" + this.deviceIdentifier + ", previousDeviceIdentifier=" + this.previousDeviceIdentifier + ", devtodevId=" + this.devtodevId + ", crossPlatformDevtodevId=" + this.crossPlatformDevtodevId + ", devtodevIdTimestamp=" + this.devtodevIdTimestamp + ", uuid=" + this.uuid + ", isValid=" + this.isValid + ")";
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
        EventParam eventParamContainsName = EventParamKt.containsName(list, "projectId");
        if (eventParamContainsName != null) {
            SqlValue value = eventParamContainsName.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            this.projectId = ((SqlValue.Long) value).getALong();
        }
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, IdentifiersEntry.deviceIdentifier);
        if (eventParamContainsName2 != null) {
            SqlValue value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            this.deviceIdentifier = ((SqlValue.String) value2).getString();
        }
        EventParam eventParamContainsName3 = EventParamKt.containsName(list, IdentifiersEntry.previousDeviceIdentifier);
        if (eventParamContainsName3 != null) {
            SqlValue value3 = eventParamContainsName3.getValue();
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            this.previousDeviceIdentifier = ((SqlValue.StringOrNull) value3).getString();
        }
        EventParam eventParamContainsName4 = EventParamKt.containsName(list, IdentifiersEntry.devtodevId);
        if (eventParamContainsName4 != null) {
            SqlValue value4 = eventParamContainsName4.getValue();
            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            this.devtodevId = ((SqlValue.LongOrNull) value4).getALong();
        }
        EventParam eventParamContainsName5 = EventParamKt.containsName(list, IdentifiersEntry.crossPlatformDevtodevId);
        if (eventParamContainsName5 != null) {
            SqlValue value5 = eventParamContainsName5.getValue();
            Intrinsics.checkNotNull(value5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            this.crossPlatformDevtodevId = ((SqlValue.LongOrNull) value5).getALong();
        }
        EventParam eventParamContainsName6 = EventParamKt.containsName(list, IdentifiersEntry.devtodevIdTimestamp);
        if (eventParamContainsName6 != null) {
            SqlValue value6 = eventParamContainsName6.getValue();
            Intrinsics.checkNotNull(value6, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            this.devtodevIdTimestamp = ((SqlValue.LongOrNull) value6).getALong();
        }
        EventParam eventParamContainsName7 = EventParamKt.containsName(list, "uuid");
        if (eventParamContainsName7 != null) {
            SqlValue value7 = eventParamContainsName7.getValue();
            Intrinsics.checkNotNull(value7, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            this.uuid = ((SqlValue.String) value7).getString();
        }
        EventParam eventParamContainsName8 = EventParamKt.containsName(list, IdentifiersEntry.isValid);
        if (eventParamContainsName8 != null) {
            SqlValue value8 = eventParamContainsName8.getValue();
            Intrinsics.checkNotNull(value8, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            this.isValid = ((SqlValue.Boolean) value8).getABoolean();
        }
    }

    public DeviceIdentifiers(long j10, long j11, @NotNull String deviceIdentifier, @Nullable String str, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @NotNull String uuid, boolean z10) {
        Intrinsics.checkNotNullParameter(deviceIdentifier, "deviceIdentifier");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.idKey = j10;
        this.projectId = j11;
        this.deviceIdentifier = deviceIdentifier;
        this.previousDeviceIdentifier = str;
        this.devtodevId = l10;
        this.crossPlatformDevtodevId = l11;
        this.devtodevIdTimestamp = l12;
        this.uuid = uuid;
        this.isValid = z10;
    }
}
