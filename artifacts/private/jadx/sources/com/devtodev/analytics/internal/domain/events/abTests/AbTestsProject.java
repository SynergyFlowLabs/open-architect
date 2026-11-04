package com.devtodev.analytics.internal.domain.events.abTests;

import com.devtodev.analytics.internal.backend.repository.RemoteConfigSealedClassKt;
import com.devtodev.analytics.internal.backend.repository.UserProperties;
import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.AbTestProjectEntry;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeStringOrNull;
import com.devtodev.analytics.internal.storage.sqlite.SelectParameter;
import com.devtodev.analytics.internal.storage.sqlite.SelectRecords;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
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
@SourceDebugExtension({"SMAP\nAbTestsProject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbTestsProject.kt\ncom/devtodev/analytics/internal/domain/events/abTests/AbTestsProject\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class AbTestsProject extends DbModel {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private long idKey;
    private long projectId;

    @Nullable
    private UserProperties userProperties;
    private long version;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SelectParameter> getColumnsTypes() {
            ColumnTypeLong columnTypeLong = ColumnTypeLong.INSTANCE;
            return CollectionsKt.listOf((Object[]) new SelectParameter[]{new SelectParameter("_id", columnTypeLong), new SelectParameter("projectId", columnTypeLong), new SelectParameter("version", columnTypeLong), new SelectParameter(AbTestProjectEntry.userProperties, ColumnTypeStringOrNull.INSTANCE)});
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
            SqlValue eventValue3 = records.getEventValue("version");
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong3 = ((SqlValue.Long) eventValue3).getALong();
            SqlValue eventValue4 = records.getEventValue(AbTestProjectEntry.userProperties);
            Intrinsics.checkNotNull(eventValue4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            String string = ((SqlValue.StringOrNull) eventValue4).getString();
            return new AbTestsProject(aLong, aLong2, aLong3, string != null ? UserProperties.Companion.fromJson(string) : null);
        }

        private Companion() {
        }
    }

    public AbTestsProject() {
        this(0L, 0L, 0L, null, 15, null);
    }

    public static /* synthetic */ AbTestsProject copy$default(AbTestsProject abTestsProject, long j10, long j11, long j12, UserProperties userProperties, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = abTestsProject.getIdKey();
        }
        long j13 = j10;
        if ((i10 & 2) != 0) {
            j11 = abTestsProject.projectId;
        }
        long j14 = j11;
        if ((i10 & 4) != 0) {
            j12 = abTestsProject.version;
        }
        long j15 = j12;
        if ((i10 & 8) != 0) {
            userProperties = abTestsProject.userProperties;
        }
        return abTestsProject.copy(j13, j14, j15, userProperties);
    }

    public final long component1() {
        return getIdKey();
    }

    public final long component2() {
        return this.projectId;
    }

    public final long component3() {
        return this.version;
    }

    @Nullable
    public final UserProperties component4() {
        return this.userProperties;
    }

    @NotNull
    public final AbTestsProject copy(long j10, long j11, long j12, @Nullable UserProperties userProperties) {
        return new AbTestsProject(j10, j11, j12, userProperties);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbTestsProject)) {
            return false;
        }
        AbTestsProject abTestsProject = (AbTestsProject) obj;
        return getIdKey() == abTestsProject.getIdKey() && this.projectId == abTestsProject.projectId && this.version == abTestsProject.version && Intrinsics.areEqual(this.userProperties, abTestsProject.userProperties);
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

    public final long getProjectId() {
        return this.projectId;
    }

    @Nullable
    public final UserProperties getUserProperties() {
        return this.userProperties;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iA = a.a(this.version, a.a(this.projectId, Long.hashCode(getIdKey()) * 31, 31), 31);
        UserProperties userProperties = this.userProperties;
        return iA + (userProperties == null ? 0 : userProperties.hashCode());
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public void setIdKey(long j10) {
        this.idKey = j10;
    }

    public final void setProjectId(long j10) {
        this.projectId = j10;
    }

    public final void setUserProperties(@Nullable UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    public final void setVersion(long j10) {
        this.version = j10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<EventParam> toList() {
        EventParam eventParam = new EventParam("projectId", new SqlValue.Long(this.projectId));
        EventParam eventParam2 = new EventParam("version", new SqlValue.Long(this.version));
        UserProperties userProperties = this.userProperties;
        return CollectionsKt.listOf((Object[]) new EventParam[]{eventParam, eventParam2, new EventParam(AbTestProjectEntry.userProperties, new SqlValue.StringOrNull(userProperties != null ? RemoteConfigSealedClassKt.getString(userProperties) : null))});
    }

    @NotNull
    public String toString() {
        return "AbTestsProject(idKey=" + getIdKey() + ", projectId=" + this.projectId + ", version=" + this.version + ", userProperties=" + this.userProperties + ")";
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
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, "version");
        if (eventParamContainsName2 != null) {
            SqlValue value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            this.version = ((SqlValue.Long) value2).getALong();
        }
        EventParam eventParamContainsName3 = EventParamKt.containsName(list, AbTestProjectEntry.userProperties);
        if (eventParamContainsName3 != null) {
            SqlValue value3 = eventParamContainsName3.getValue();
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            String string = ((SqlValue.StringOrNull) value3).getString();
            if (string != null) {
                this.userProperties = new UserProperties(string);
            }
        }
    }

    public /* synthetic */ AbTestsProject(long j10, long j11, long j12, UserProperties userProperties, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? -1L : j10, (i10 & 2) != 0 ? -1L : j11, (i10 & 4) != 0 ? 0L : j12, (i10 & 8) != 0 ? null : userProperties);
    }

    public AbTestsProject(long j10, long j11, long j12, @Nullable UserProperties userProperties) {
        this.idKey = j10;
        this.projectId = j11;
        this.version = j12;
        this.userProperties = userProperties;
    }
}
