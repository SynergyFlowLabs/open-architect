package com.devtodev.analytics.internal.domain.events.abTests;

import com.devtodev.analytics.internal.backend.repository.Parameter;
import com.devtodev.analytics.internal.backend.repository.RemoteConfigSealedClassKt;
import com.devtodev.analytics.internal.backend.repository.json.JsonParser;
import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeBoolean;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeString;
import com.devtodev.analytics.internal.storage.sqlite.ExperimentsEntry;
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
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAbTestsExperiment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbTestsExperiment.kt\ncom/devtodev/analytics/internal/domain/events/abTests/AbTestsExperiment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1#2:115\n*E\n"})
public final class AbTestsExperiment extends DbModel {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private long completionDate;

    @NotNull
    private List<Condition> conditions;
    private long creationDate;
    private long experimentId;
    private long idKey;
    private boolean isTesting;

    @NotNull
    private List<Parameter> parameters;
    private long projectId;
    private long updateDate;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Condition> getAbTestsCondition(String str) {
            return new JsonParser().parseConditionsParamFromBase$DTDAnalytics_androidRelease(new JSONArray(str));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Parameter> getAbTestsParameter(String str) {
            return new JsonParser().parseExperimentsParam$DTDAnalytics_androidRelease(new JSONArray(str));
        }

        @NotNull
        public final List<SelectParameter> getColumnsTypes() {
            ColumnTypeLong columnTypeLong = ColumnTypeLong.INSTANCE;
            SelectParameter selectParameter = new SelectParameter("_id", columnTypeLong);
            SelectParameter selectParameter2 = new SelectParameter("projectId", columnTypeLong);
            SelectParameter selectParameter3 = new SelectParameter("experimentId", columnTypeLong);
            SelectParameter selectParameter4 = new SelectParameter(ExperimentsEntry.creationDate, columnTypeLong);
            SelectParameter selectParameter5 = new SelectParameter(ExperimentsEntry.updateDate, columnTypeLong);
            SelectParameter selectParameter6 = new SelectParameter(ExperimentsEntry.completionDate, columnTypeLong);
            SelectParameter selectParameter7 = new SelectParameter(ExperimentsEntry.isTesting, ColumnTypeBoolean.INSTANCE);
            ColumnTypeString columnTypeString = ColumnTypeString.INSTANCE;
            return CollectionsKt.listOf((Object[]) new SelectParameter[]{selectParameter, selectParameter2, selectParameter3, selectParameter4, selectParameter5, selectParameter6, selectParameter7, new SelectParameter(ExperimentsEntry.parameters, columnTypeString), new SelectParameter(ExperimentsEntry.conditions, columnTypeString)});
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
            SqlValue eventValue3 = records.getEventValue("experimentId");
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong3 = ((SqlValue.Long) eventValue3).getALong();
            SqlValue eventValue4 = records.getEventValue(ExperimentsEntry.creationDate);
            Intrinsics.checkNotNull(eventValue4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong4 = ((SqlValue.Long) eventValue4).getALong();
            SqlValue eventValue5 = records.getEventValue(ExperimentsEntry.updateDate);
            Intrinsics.checkNotNull(eventValue5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong5 = ((SqlValue.Long) eventValue5).getALong();
            SqlValue eventValue6 = records.getEventValue(ExperimentsEntry.completionDate);
            Intrinsics.checkNotNull(eventValue6, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong6 = ((SqlValue.Long) eventValue6).getALong();
            SqlValue eventValue7 = records.getEventValue(ExperimentsEntry.isTesting);
            Intrinsics.checkNotNull(eventValue7, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            boolean aBoolean = ((SqlValue.Boolean) eventValue7).getABoolean();
            SqlValue eventValue8 = records.getEventValue(ExperimentsEntry.parameters);
            Intrinsics.checkNotNull(eventValue8, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            List<Parameter> abTestsParameter = getAbTestsParameter(((SqlValue.String) eventValue8).getString());
            SqlValue eventValue9 = records.getEventValue(ExperimentsEntry.conditions);
            Intrinsics.checkNotNull(eventValue9, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            return new AbTestsExperiment(aLong, aLong2, aLong3, aLong4, aLong5, aLong6, aBoolean, abTestsParameter, getAbTestsCondition(((SqlValue.String) eventValue9).getString()));
        }

        private Companion() {
        }
    }

    public AbTestsExperiment() {
        this(0L, 0L, 0L, 0L, 0L, 0L, false, null, null, 511, null);
    }

    public final long getCompletionDate() {
        return this.completionDate;
    }

    @NotNull
    public final List<Condition> getConditions() {
        return this.conditions;
    }

    public final long getCreationDate() {
        return this.creationDate;
    }

    public final long getExperimentId() {
        return this.experimentId;
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

    @NotNull
    public final List<Parameter> getParameters() {
        return this.parameters;
    }

    public final long getProjectId() {
        return this.projectId;
    }

    public final long getUpdateDate() {
        return this.updateDate;
    }

    public final boolean isTesting() {
        return this.isTesting;
    }

    public final void setCompletionDate(long j10) {
        this.completionDate = j10;
    }

    public final void setConditions(@NotNull List<Condition> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.conditions = list;
    }

    public final void setCreationDate(long j10) {
        this.creationDate = j10;
    }

    public final void setExperimentId(long j10) {
        this.experimentId = j10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public void setIdKey(long j10) {
        this.idKey = j10;
    }

    public final void setParameters(@NotNull List<Parameter> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.parameters = list;
    }

    public final void setProjectId(long j10) {
        this.projectId = j10;
    }

    public final void setTesting(boolean z10) {
        this.isTesting = z10;
    }

    public final void setUpdateDate(long j10) {
        this.updateDate = j10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<EventParam> toList() {
        return CollectionsKt.listOf((Object[]) new EventParam[]{new EventParam("projectId", new SqlValue.Long(this.projectId)), new EventParam("experimentId", new SqlValue.Long(this.experimentId)), new EventParam(ExperimentsEntry.creationDate, new SqlValue.Long(this.creationDate)), new EventParam(ExperimentsEntry.updateDate, new SqlValue.Long(this.updateDate)), new EventParam(ExperimentsEntry.completionDate, new SqlValue.Long(this.completionDate)), new EventParam(ExperimentsEntry.isTesting, new SqlValue.Boolean(this.isTesting)), new EventParam(ExperimentsEntry.parameters, new SqlValue.String(RemoteConfigSealedClassKt.getParameters(this.parameters))), new EventParam(ExperimentsEntry.conditions, new SqlValue.String(RemoteConfigSealedClassKt.getConditions(this.conditions)))});
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
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, "experimentId");
        if (eventParamContainsName2 != null) {
            SqlValue value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            this.experimentId = ((SqlValue.Long) value2).getALong();
        }
        EventParam eventParamContainsName3 = EventParamKt.containsName(list, ExperimentsEntry.creationDate);
        if (eventParamContainsName3 != null) {
            SqlValue value3 = eventParamContainsName3.getValue();
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            this.creationDate = ((SqlValue.Long) value3).getALong();
        }
        EventParam eventParamContainsName4 = EventParamKt.containsName(list, ExperimentsEntry.updateDate);
        if (eventParamContainsName4 != null) {
            SqlValue value4 = eventParamContainsName4.getValue();
            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            this.updateDate = ((SqlValue.Long) value4).getALong();
        }
        EventParam eventParamContainsName5 = EventParamKt.containsName(list, ExperimentsEntry.completionDate);
        if (eventParamContainsName5 != null) {
            SqlValue value5 = eventParamContainsName5.getValue();
            Intrinsics.checkNotNull(value5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            this.completionDate = ((SqlValue.Long) value5).getALong();
        }
        EventParam eventParamContainsName6 = EventParamKt.containsName(list, ExperimentsEntry.isTesting);
        if (eventParamContainsName6 != null) {
            SqlValue value6 = eventParamContainsName6.getValue();
            Intrinsics.checkNotNull(value6, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            this.isTesting = ((SqlValue.Boolean) value6).getABoolean();
        }
        EventParam eventParamContainsName7 = EventParamKt.containsName(list, ExperimentsEntry.parameters);
        if (eventParamContainsName7 != null) {
            Companion companion = Companion;
            SqlValue value7 = eventParamContainsName7.getValue();
            Intrinsics.checkNotNull(value7, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            this.parameters = companion.getAbTestsParameter(((SqlValue.String) value7).getString());
        }
        EventParam eventParamContainsName8 = EventParamKt.containsName(list, ExperimentsEntry.conditions);
        if (eventParamContainsName8 != null) {
            Companion companion2 = Companion;
            SqlValue value8 = eventParamContainsName8.getValue();
            Intrinsics.checkNotNull(value8, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            this.conditions = companion2.getAbTestsCondition(((SqlValue.String) value8).getString());
        }
    }

    public /* synthetic */ AbTestsExperiment(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? -1L : j10, (i10 & 2) != 0 ? -1L : j11, (i10 & 4) != 0 ? -1L : j12, (i10 & 8) != 0 ? 0L : j13, (i10 & 16) == 0 ? j14 : -1L, (i10 & 32) == 0 ? j15 : 0L, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? CollectionsKt.emptyList() : list, (i10 & 256) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public AbTestsExperiment(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, @NotNull List<Parameter> parameters, @NotNull List<Condition> conditions) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        this.idKey = j10;
        this.projectId = j11;
        this.experimentId = j12;
        this.creationDate = j13;
        this.updateDate = j14;
        this.completionDate = j15;
        this.isTesting = z10;
        this.parameters = parameters;
        this.conditions = conditions;
    }
}
