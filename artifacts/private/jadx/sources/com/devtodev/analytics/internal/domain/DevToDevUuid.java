package com.devtodev.analytics.internal.domain;

import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeString;
import com.devtodev.analytics.internal.storage.sqlite.SelectParameter;
import com.devtodev.analytics.internal.storage.sqlite.SelectRecords;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDevToDevUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DevToDevUuid.kt\ncom/devtodev/analytics/internal/domain/DevToDevUuid\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
public final class DevToDevUuid extends DbModel {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private String devToDevUUID;
    private long idKey;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SelectParameter> getColumnsTypes() {
            return CollectionsKt.listOf((Object[]) new SelectParameter[]{new SelectParameter("_id", ColumnTypeLong.INSTANCE), new SelectParameter("uuid", ColumnTypeString.INSTANCE)});
        }

        @NotNull
        public final DbModel init(@NotNull SelectRecords records) {
            Intrinsics.checkNotNullParameter(records, "records");
            SqlValue eventValue = records.getEventValue("_id");
            Intrinsics.checkNotNull(eventValue, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong = ((SqlValue.Long) eventValue).getALong();
            SqlValue eventValue2 = records.getEventValue("uuid");
            Intrinsics.checkNotNull(eventValue2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            return new DevToDevUuid(aLong, ((SqlValue.String) eventValue2).getString());
        }

        private Companion() {
        }
    }

    public /* synthetic */ DevToDevUuid(long j10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? -1L : j10, str);
    }

    public static /* synthetic */ DevToDevUuid copy$default(DevToDevUuid devToDevUuid, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = devToDevUuid.getIdKey();
        }
        if ((i10 & 2) != 0) {
            str = devToDevUuid.devToDevUUID;
        }
        return devToDevUuid.copy(j10, str);
    }

    public final long component1() {
        return getIdKey();
    }

    @NotNull
    public final String component2() {
        return this.devToDevUUID;
    }

    @NotNull
    public final DevToDevUuid copy(long j10, @NotNull String devToDevUUID) {
        Intrinsics.checkNotNullParameter(devToDevUUID, "devToDevUUID");
        return new DevToDevUuid(j10, devToDevUUID);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevToDevUuid)) {
            return false;
        }
        DevToDevUuid devToDevUuid = (DevToDevUuid) obj;
        return getIdKey() == devToDevUuid.getIdKey() && Intrinsics.areEqual(this.devToDevUUID, devToDevUuid.devToDevUUID);
    }

    @NotNull
    public final String getDevToDevUUID() {
        return this.devToDevUUID;
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

    public int hashCode() {
        return this.devToDevUUID.hashCode() + (Long.hashCode(getIdKey()) * 31);
    }

    public final void setDevToDevUUID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.devToDevUUID = str;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public void setIdKey(long j10) {
        this.idKey = j10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<EventParam> toList() {
        return CollectionsKt.listOf(new EventParam("uuid", new SqlValue.String(this.devToDevUUID)));
    }

    @NotNull
    public String toString() {
        return "DevToDevUuid(idKey=" + getIdKey() + ", devToDevUUID=" + this.devToDevUUID + ")";
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
        EventParam eventParamContainsName = EventParamKt.containsName(list, "uuid");
        if (eventParamContainsName != null) {
            SqlValue value = eventParamContainsName.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            this.devToDevUUID = ((SqlValue.String) value).getString();
        }
    }

    public DevToDevUuid(long j10, @NotNull String devToDevUUID) {
        Intrinsics.checkNotNullParameter(devToDevUUID, "devToDevUUID");
        this.idKey = j10;
        this.devToDevUUID = devToDevUUID;
    }
}
