package com.devtodev.analytics.internal.domain.events.abTests;

import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeBoolean;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeStringOrNull;
import com.devtodev.analytics.internal.storage.sqlite.ExperimentsStateEntry;
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
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAbTestsExperimentState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbTestsExperimentState.kt\ncom/devtodev/analytics/internal/domain/events/abTests/AbTestsExperimentState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public final class AbTestsExperimentState extends DbModel {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private long experimentId;
    private long idKey;

    @Nullable
    private ExperimentMarker involvement;
    private boolean runAbility;
    private long userId;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SelectParameter> getColumnsTypes() {
            ColumnTypeLong columnTypeLong = ColumnTypeLong.INSTANCE;
            return CollectionsKt.listOf((Object[]) new SelectParameter[]{new SelectParameter("_id", columnTypeLong), new SelectParameter("userId", columnTypeLong), new SelectParameter("experimentId", columnTypeLong), new SelectParameter(ExperimentsStateEntry.runAbility, ColumnTypeBoolean.INSTANCE), new SelectParameter(ExperimentsStateEntry.involvement, ColumnTypeStringOrNull.INSTANCE)});
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
            SqlValue eventValue3 = records.getEventValue("experimentId");
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong3 = ((SqlValue.Long) eventValue3).getALong();
            SqlValue eventValue4 = records.getEventValue(ExperimentsStateEntry.runAbility);
            Intrinsics.checkNotNull(eventValue4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            boolean aBoolean = ((SqlValue.Boolean) eventValue4).getABoolean();
            ExperimentMarker.Companion companion = ExperimentMarker.Companion;
            SqlValue eventValue5 = records.getEventValue(ExperimentsStateEntry.involvement);
            Intrinsics.checkNotNull(eventValue5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            return new AbTestsExperimentState(aLong, aLong2, aLong3, aBoolean, companion.fromJson(((SqlValue.StringOrNull) eventValue5).getString()));
        }

        private Companion() {
        }
    }

    public /* synthetic */ AbTestsExperimentState(long j10, long j11, long j12, boolean z10, ExperimentMarker experimentMarker, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? -1L : j10, j11, (i10 & 4) != 0 ? -1L : j12, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? null : experimentMarker);
    }

    public final long getExperimentId() {
        return this.experimentId;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public long getIdKey() {
        return this.idKey;
    }

    @Nullable
    public final ExperimentMarker getInvolvement() {
        return this.involvement;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<SelectParameter> getModelColumnsTypes() {
        return Companion.getColumnsTypes();
    }

    public final boolean getRunAbility() {
        return this.runAbility;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setExperimentId(long j10) {
        this.experimentId = j10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public void setIdKey(long j10) {
        this.idKey = j10;
    }

    public final void setInvolvement(@Nullable ExperimentMarker experimentMarker) {
        this.involvement = experimentMarker;
    }

    public final void setRunAbility(boolean z10) {
        this.runAbility = z10;
    }

    public final void setUserId(long j10) {
        this.userId = j10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<EventParam> toList() {
        JSONObject json;
        EventParam eventParam = new EventParam("userId", new SqlValue.Long(this.userId));
        EventParam eventParam2 = new EventParam("experimentId", new SqlValue.Long(this.experimentId));
        EventParam eventParam3 = new EventParam(ExperimentsStateEntry.runAbility, new SqlValue.Boolean(this.runAbility));
        ExperimentMarker experimentMarker = this.involvement;
        return CollectionsKt.listOf((Object[]) new EventParam[]{eventParam, eventParam2, eventParam3, new EventParam(ExperimentsStateEntry.involvement, new SqlValue.StringOrNull((experimentMarker == null || (json = experimentMarker.toJson()) == null) ? null : json.toString()))});
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
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, "experimentId");
        if (eventParamContainsName2 != null) {
            SqlValue value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            this.experimentId = ((SqlValue.Long) value2).getALong();
        }
        EventParam eventParamContainsName3 = EventParamKt.containsName(list, ExperimentsStateEntry.runAbility);
        if (eventParamContainsName3 != null) {
            SqlValue value3 = eventParamContainsName3.getValue();
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            this.runAbility = ((SqlValue.Boolean) value3).getABoolean();
        }
        EventParam eventParamContainsName4 = EventParamKt.containsName(list, ExperimentsStateEntry.involvement);
        if (eventParamContainsName4 != null) {
            ExperimentMarker.Companion companion = ExperimentMarker.Companion;
            SqlValue value4 = eventParamContainsName4.getValue();
            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            this.involvement = companion.fromJson(((SqlValue.StringOrNull) value4).getString());
        }
    }

    public AbTestsExperimentState(long j10, long j11, long j12, boolean z10, @Nullable ExperimentMarker experimentMarker) {
        this.idKey = j10;
        this.userId = j11;
        this.experimentId = j12;
        this.runAbility = z10;
        this.involvement = experimentMarker;
    }
}
