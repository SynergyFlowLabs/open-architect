package com.devtodev.analytics.internal.domain;

import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeString;
import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
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

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nEventObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventObject.kt\ncom/devtodev/analytics/internal/domain/EventObject\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class EventObject extends DbModel implements IEncodable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private String code;

    @NotNull
    private String eventJson;
    private long idKey;
    private long userId;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SelectParameter> getColumnsTypes() {
            ColumnTypeLong columnTypeLong = ColumnTypeLong.INSTANCE;
            SelectParameter selectParameter = new SelectParameter("_id", columnTypeLong);
            SelectParameter selectParameter2 = new SelectParameter("userId", columnTypeLong);
            ColumnTypeString columnTypeString = ColumnTypeString.INSTANCE;
            return CollectionsKt.listOf((Object[]) new SelectParameter[]{selectParameter, selectParameter2, new SelectParameter("code", columnTypeString), new SelectParameter(EventEntry.eventJson, columnTypeString)});
        }

        @NotNull
        public final DbModel init(@NotNull SelectRecords records) {
            Intrinsics.checkNotNullParameter(records, "records");
            SqlValue eventValue = records.getEventValue("_id");
            Intrinsics.checkNotNull(eventValue, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong = ((SqlValue.Long) eventValue).getALong();
            SqlValue eventValue2 = records.getEventValue("userId");
            Intrinsics.checkNotNull(eventValue2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong2 = ((SqlValue.Long) eventValue2).getALong();
            SqlValue eventValue3 = records.getEventValue("code");
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            String string = ((SqlValue.String) eventValue3).getString();
            SqlValue eventValue4 = records.getEventValue(EventEntry.eventJson);
            Intrinsics.checkNotNull(eventValue4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            return new EventObject(aLong, aLong2, string, ((SqlValue.String) eventValue4).getString());
        }

        private Companion() {
        }
    }

    public /* synthetic */ EventObject(long j10, long j11, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? -1L : j10, (i10 & 2) != 0 ? -1L : j11, str, str2);
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getCode() {
        return this.code;
    }

    @NotNull
    public final String getEventJson() {
        return this.eventJson;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public long getIdKey() {
        return this.idKey;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getJson() {
        return this.eventJson;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<SelectParameter> getModelColumnsTypes() {
        return Companion.getColumnsTypes();
    }

    public final long getUserId() {
        return this.userId;
    }

    public void setCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final void setEventJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventJson = str;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public void setIdKey(long j10) {
        this.idKey = j10;
    }

    public final void setUserId(long j10) {
        this.userId = j10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<EventParam> toList() {
        return CollectionsKt.listOf((Object[]) new EventParam[]{new EventParam("userId", new SqlValue.Long(this.userId)), new EventParam("code", new SqlValue.String(getCode())), new EventParam(EventEntry.eventJson, new SqlValue.String(this.eventJson))});
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
        EventParam eventParamContainsName = EventParamKt.containsName(list, "userId");
        if (eventParamContainsName != null) {
            SqlValue value = eventParamContainsName.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            this.userId = ((SqlValue.Long) value).getALong();
        }
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, "code");
        if (eventParamContainsName2 != null) {
            SqlValue value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            setCode(((SqlValue.String) value2).getString());
        }
        EventParam eventParamContainsName3 = EventParamKt.containsName(list, EventEntry.eventJson);
        if (eventParamContainsName3 != null) {
            SqlValue value3 = eventParamContainsName3.getValue();
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            this.eventJson = ((SqlValue.String) value3).getString();
        }
    }

    public EventObject(long j10, long j11, @NotNull String code, @NotNull String eventJson) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(eventJson, "eventJson");
        this.idKey = j10;
        this.userId = j11;
        this.code = code;
        this.eventJson = eventJson;
    }
}
