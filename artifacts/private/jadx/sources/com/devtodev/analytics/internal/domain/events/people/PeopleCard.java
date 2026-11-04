package com.devtodev.analytics.internal.domain.events.people;

import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeBoolean;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeString;
import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import com.devtodev.analytics.internal.storage.sqlite.SelectParameter;
import com.devtodev.analytics.internal.storage.sqlite.SelectRecords;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import h4.a;
import h4.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPeopleCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeopleCard.kt\ncom/devtodev/analytics/internal/domain/events/people/PeopleCard\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
public final class PeopleCard extends DbModel {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private List<String> changedKeys;
    private boolean cleared;
    private long idKey;

    @NotNull
    private String json;

    @NotNull
    private Map<String, PeopleParameter> properties;
    private boolean updated;
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
            SelectParameter selectParameter3 = new SelectParameter(PeopleCardEntry.json, columnTypeString);
            SelectParameter selectParameter4 = new SelectParameter(PeopleCardEntry.changedKeys, columnTypeString);
            ColumnTypeBoolean columnTypeBoolean = ColumnTypeBoolean.INSTANCE;
            return CollectionsKt.listOf((Object[]) new SelectParameter[]{selectParameter, selectParameter2, selectParameter3, selectParameter4, new SelectParameter(PeopleCardEntry.updated, columnTypeBoolean), new SelectParameter(PeopleCardEntry.cleared, columnTypeBoolean)});
        }

        @NotNull
        public final DbModel init(@NotNull SelectRecords records) throws JSONException {
            Intrinsics.checkNotNullParameter(records, "records");
            SqlValue eventValue = records.getEventValue(PeopleCardEntry.json);
            Intrinsics.checkNotNull(eventValue, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            String string = ((SqlValue.String) eventValue).getString();
            SqlValue eventValue2 = records.getEventValue(PeopleCardEntry.changedKeys);
            Intrinsics.checkNotNull(eventValue2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            String string2 = ((SqlValue.String) eventValue2).getString();
            SqlValue eventValue3 = records.getEventValue("_id");
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong = ((SqlValue.Long) eventValue3).getALong();
            SqlValue eventValue4 = records.getEventValue("userId");
            Intrinsics.checkNotNull(eventValue4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong2 = ((SqlValue.Long) eventValue4).getALong();
            Map<String, PeopleParameter> mapFromJson = PeopleCardKt.fromJson(string);
            List changedKeys = PeopleCardKt.getChangedKeys(string2);
            SqlValue eventValue5 = records.getEventValue(PeopleCardEntry.updated);
            Intrinsics.checkNotNull(eventValue5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            boolean aBoolean = ((SqlValue.Boolean) eventValue5).getABoolean();
            SqlValue eventValue6 = records.getEventValue(PeopleCardEntry.cleared);
            Intrinsics.checkNotNull(eventValue6, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            return new PeopleCard(aLong, aLong2, string, mapFromJson, changedKeys, aBoolean, ((SqlValue.Boolean) eventValue6).getABoolean());
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PeopleCard() {
        this(0L, 0L, null, null, null, false, false, 127, null);
        boolean z10 = false & false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PeopleCard copy$default(PeopleCard peopleCard, long j10, long j11, String str, Map map, List list, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = peopleCard.getIdKey();
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = peopleCard.userId;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            str = peopleCard.json;
        }
        return peopleCard.copy(j12, j13, str, (i10 & 8) != 0 ? peopleCard.properties : map, (i10 & 16) != 0 ? peopleCard.changedKeys : list, (i10 & 32) != 0 ? peopleCard.updated : z10, (i10 & 64) != 0 ? peopleCard.cleared : z11);
    }

    public final long component1() {
        return getIdKey();
    }

    public final long component2() {
        return this.userId;
    }

    @NotNull
    public final String component3() {
        return this.json;
    }

    @NotNull
    public final Map<String, PeopleParameter> component4() {
        return this.properties;
    }

    @NotNull
    public final List<String> component5() {
        return this.changedKeys;
    }

    public final boolean component6() {
        return this.updated;
    }

    public final boolean component7() {
        return this.cleared;
    }

    @NotNull
    public final PeopleCard copy(long j10, long j11, @NotNull String json, @NotNull Map<String, PeopleParameter> properties, @NotNull List<String> changedKeys, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(changedKeys, "changedKeys");
        return new PeopleCard(j10, j11, json, properties, changedKeys, z10, z11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeopleCard)) {
            return false;
        }
        PeopleCard peopleCard = (PeopleCard) obj;
        return getIdKey() == peopleCard.getIdKey() && this.userId == peopleCard.userId && Intrinsics.areEqual(this.json, peopleCard.json) && Intrinsics.areEqual(this.properties, peopleCard.properties) && Intrinsics.areEqual(this.changedKeys, peopleCard.changedKeys) && this.updated == peopleCard.updated && this.cleared == peopleCard.cleared;
    }

    @NotNull
    public final List<String> getChangedKeys() {
        return this.changedKeys;
    }

    public final boolean getCleared() {
        return this.cleared;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public long getIdKey() {
        return this.idKey;
    }

    @NotNull
    public final String getJson() {
        return this.json;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<SelectParameter> getModelColumnsTypes() {
        return Companion.getColumnsTypes();
    }

    @NotNull
    public final Map<String, PeopleParameter> getProperties() {
        return this.properties;
    }

    public final boolean getUpdated() {
        return this.updated;
    }

    public final long getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public int hashCode() {
        int iHashCode = (this.changedKeys.hashCode() + ((this.properties.hashCode() + b.a(this.json, a.a(this.userId, Long.hashCode(getIdKey()) * 31, 31), 31)) * 31)) * 31;
        boolean z10 = this.updated;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        boolean z11 = this.cleared;
        return i10 + (z11 ? 1 : z11);
    }

    public final void setChangedKeys(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.changedKeys = list;
    }

    public final void setCleared(boolean z10) {
        this.cleared = z10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public void setIdKey(long j10) {
        this.idKey = j10;
    }

    public final void setJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.json = str;
    }

    public final void setProperties(@NotNull Map<String, PeopleParameter> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.properties = map;
    }

    public final void setUpdated(boolean z10) {
        this.updated = z10;
    }

    public final void setUserId(long j10) {
        this.userId = j10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<EventParam> toList() {
        return CollectionsKt.listOf((Object[]) new EventParam[]{new EventParam("userId", new SqlValue.Long(this.userId)), new EventParam(PeopleCardEntry.json, new SqlValue.String(PeopleCardKt.json(this.properties))), new EventParam(PeopleCardEntry.changedKeys, new SqlValue.String(PeopleCardKt.json((List<String>) this.changedKeys))), new EventParam(PeopleCardEntry.updated, new SqlValue.Boolean(this.updated)), new EventParam(PeopleCardEntry.cleared, new SqlValue.Boolean(this.cleared))});
    }

    @NotNull
    public String toString() {
        return "PeopleCard(idKey=" + getIdKey() + ", userId=" + this.userId + ", json=" + this.json + ", properties=" + this.properties + ", changedKeys=" + this.changedKeys + ", updated=" + this.updated + ", cleared=" + this.cleared + ")";
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
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, PeopleCardEntry.json);
        if (eventParamContainsName2 != null) {
            SqlValue value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            this.json = ((SqlValue.String) value2).getString();
        }
        EventParam eventParamContainsName3 = EventParamKt.containsName(list, "userId");
        if (eventParamContainsName3 != null) {
            SqlValue value3 = eventParamContainsName3.getValue();
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            this.userId = ((SqlValue.Long) value3).getALong();
        }
        EventParam eventParamContainsName4 = EventParamKt.containsName(list, PeopleCardEntry.updated);
        if (eventParamContainsName4 != null) {
            SqlValue value4 = eventParamContainsName4.getValue();
            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            this.updated = ((SqlValue.Boolean) value4).getABoolean();
        }
        EventParam eventParamContainsName5 = EventParamKt.containsName(list, PeopleCardEntry.cleared);
        if (eventParamContainsName5 != null) {
            SqlValue value5 = eventParamContainsName5.getValue();
            Intrinsics.checkNotNull(value5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            this.cleared = ((SqlValue.Boolean) value5).getABoolean();
        }
    }

    public /* synthetic */ PeopleCard(long j10, long j11, String str, Map map, List list, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? -1L : j10, (i10 & 2) != 0 ? -1L : j11, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? new LinkedHashMap() : map, (i10 & 16) != 0 ? new ArrayList() : list, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11);
    }

    public PeopleCard(long j10, long j11, @NotNull String json, @NotNull Map<String, PeopleParameter> properties, @NotNull List<String> changedKeys, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(changedKeys, "changedKeys");
        this.idKey = j10;
        this.userId = j11;
        this.json = json;
        this.properties = properties;
        this.changedKeys = changedKeys;
        this.updated = z10;
        this.cleared = z11;
    }
}
