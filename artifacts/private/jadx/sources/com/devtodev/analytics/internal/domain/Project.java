package com.devtodev.analytics.internal.domain;

import com.devtodev.analytics.internal.backend.ConfigEntry;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeBoolean;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLongOrNull;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeString;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeStringOrNull;
import com.devtodev.analytics.internal.storage.sqlite.ProjectEntry;
import com.devtodev.analytics.internal.storage.sqlite.SelectParameter;
import com.devtodev.analytics.internal.storage.sqlite.SelectRecords;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
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
@SourceDebugExtension({"SMAP\nProject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Project.kt\ncom/devtodev/analytics/internal/domain/Project\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
public final class Project extends DbModel {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private Long activeUserId;

    @Nullable
    private String applicationBuildVersion;

    @Nullable
    private String applicationBundle;

    @NotNull
    private final String applicationKey;

    @Nullable
    private String applicationVersion;

    @NotNull
    private ConfigEntry configuration;
    private long idKey;
    private boolean isMigrated;
    private boolean isReferralSent;

    @Nullable
    private Long savedTime;
    private boolean trackingAvailable;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SelectParameter> getColumnsTypes() {
            SelectParameter selectParameter = new SelectParameter("_id", ColumnTypeLong.INSTANCE);
            ColumnTypeString columnTypeString = ColumnTypeString.INSTANCE;
            SelectParameter selectParameter2 = new SelectParameter(ProjectEntry.applicationKey, columnTypeString);
            ColumnTypeLongOrNull columnTypeLongOrNull = ColumnTypeLongOrNull.INSTANCE;
            SelectParameter selectParameter3 = new SelectParameter(ProjectEntry.activeUserId, columnTypeLongOrNull);
            ColumnTypeBoolean columnTypeBoolean = ColumnTypeBoolean.INSTANCE;
            SelectParameter selectParameter4 = new SelectParameter(ProjectEntry.trackingAvailable, columnTypeBoolean);
            ColumnTypeStringOrNull columnTypeStringOrNull = ColumnTypeStringOrNull.INSTANCE;
            return CollectionsKt.listOf((Object[]) new SelectParameter[]{selectParameter, selectParameter2, selectParameter3, selectParameter4, new SelectParameter(ProjectEntry.applicationBundle, columnTypeStringOrNull), new SelectParameter(ProjectEntry.applicationVersion, columnTypeStringOrNull), new SelectParameter(ProjectEntry.applicationBuildVersion, columnTypeStringOrNull), new SelectParameter(ProjectEntry.configuration, columnTypeString), new SelectParameter(ProjectEntry.isReferralSent, columnTypeBoolean), new SelectParameter(ProjectEntry.savedTime, columnTypeLongOrNull), new SelectParameter(ProjectEntry.isMigrated, columnTypeBoolean)});
        }

        @NotNull
        public final DbModel init(@NotNull SelectRecords records) {
            Intrinsics.checkNotNullParameter(records, "records");
            SqlValue eventValue = records.getEventValue("_id");
            Intrinsics.checkNotNull(eventValue, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong = ((SqlValue.Long) eventValue).getALong();
            SqlValue eventValue2 = records.getEventValue(ProjectEntry.applicationKey);
            Intrinsics.checkNotNull(eventValue2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            String string = ((SqlValue.String) eventValue2).getString();
            SqlValue eventValue3 = records.getEventValue(ProjectEntry.activeUserId);
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            Long aLong2 = ((SqlValue.LongOrNull) eventValue3).getALong();
            SqlValue eventValue4 = records.getEventValue(ProjectEntry.trackingAvailable);
            Intrinsics.checkNotNull(eventValue4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            boolean aBoolean = ((SqlValue.Boolean) eventValue4).getABoolean();
            SqlValue eventValue5 = records.getEventValue(ProjectEntry.applicationBundle);
            Intrinsics.checkNotNull(eventValue5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            String string2 = ((SqlValue.StringOrNull) eventValue5).getString();
            SqlValue eventValue6 = records.getEventValue(ProjectEntry.applicationVersion);
            Intrinsics.checkNotNull(eventValue6, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            String string3 = ((SqlValue.StringOrNull) eventValue6).getString();
            SqlValue eventValue7 = records.getEventValue(ProjectEntry.applicationBuildVersion);
            Intrinsics.checkNotNull(eventValue7, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            String string4 = ((SqlValue.StringOrNull) eventValue7).getString();
            ConfigEntry.Companion companion = ConfigEntry.Companion;
            SqlValue eventValue8 = records.getEventValue(ProjectEntry.configuration);
            Intrinsics.checkNotNull(eventValue8, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            ConfigEntry configEntryFromJson = companion.fromJson(((SqlValue.String) eventValue8).getString());
            SqlValue eventValue9 = records.getEventValue(ProjectEntry.isReferralSent);
            Intrinsics.checkNotNull(eventValue9, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            boolean aBoolean2 = ((SqlValue.Boolean) eventValue9).getABoolean();
            SqlValue eventValue10 = records.getEventValue(ProjectEntry.savedTime);
            Intrinsics.checkNotNull(eventValue10, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            Long aLong3 = ((SqlValue.LongOrNull) eventValue10).getALong();
            SqlValue eventValue11 = records.getEventValue(ProjectEntry.isMigrated);
            Intrinsics.checkNotNull(eventValue11, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            return new Project(aLong, string, aLong2, aBoolean, string2, string3, string4, configEntryFromJson, aLong3, aBoolean2, ((SqlValue.Boolean) eventValue11).getABoolean());
        }

        private Companion() {
        }
    }

    public /* synthetic */ Project(long j10, String str, Long l10, boolean z10, String str2, String str3, String str4, ConfigEntry configEntry, Long l11, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? -1L : j10, str, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? ConfigEntry.Companion.setDefaultConfiguration() : configEntry, (i10 & 256) != 0 ? null : l11, (i10 & 512) != 0 ? false : z11, (i10 & 1024) != 0 ? false : z12);
    }

    public static /* synthetic */ Project copy$default(Project project, long j10, String str, Long l10, boolean z10, String str2, String str3, String str4, ConfigEntry configEntry, Long l11, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = project.getIdKey();
        }
        return project.copy(j10, (i10 & 2) != 0 ? project.applicationKey : str, (i10 & 4) != 0 ? project.activeUserId : l10, (i10 & 8) != 0 ? project.trackingAvailable : z10, (i10 & 16) != 0 ? project.applicationBundle : str2, (i10 & 32) != 0 ? project.applicationVersion : str3, (i10 & 64) != 0 ? project.applicationBuildVersion : str4, (i10 & 128) != 0 ? project.configuration : configEntry, (i10 & 256) != 0 ? project.savedTime : l11, (i10 & 512) != 0 ? project.isReferralSent : z11, (i10 & 1024) != 0 ? project.isMigrated : z12);
    }

    public final long component1() {
        return getIdKey();
    }

    public final boolean component10() {
        return this.isReferralSent;
    }

    public final boolean component11() {
        return this.isMigrated;
    }

    @NotNull
    public final String component2() {
        return this.applicationKey;
    }

    @Nullable
    public final Long component3() {
        return this.activeUserId;
    }

    public final boolean component4() {
        return this.trackingAvailable;
    }

    @Nullable
    public final String component5() {
        return this.applicationBundle;
    }

    @Nullable
    public final String component6() {
        return this.applicationVersion;
    }

    @Nullable
    public final String component7() {
        return this.applicationBuildVersion;
    }

    @NotNull
    public final ConfigEntry component8() {
        return this.configuration;
    }

    @Nullable
    public final Long component9() {
        return this.savedTime;
    }

    @NotNull
    public final Project copy(long j10, @NotNull String applicationKey, @Nullable Long l10, boolean z10, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull ConfigEntry configuration, @Nullable Long l11, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(applicationKey, "applicationKey");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new Project(j10, applicationKey, l10, z10, str, str2, str3, configuration, l11, z11, z12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Project)) {
            return false;
        }
        Project project = (Project) obj;
        return getIdKey() == project.getIdKey() && Intrinsics.areEqual(this.applicationKey, project.applicationKey) && Intrinsics.areEqual(this.activeUserId, project.activeUserId) && this.trackingAvailable == project.trackingAvailable && Intrinsics.areEqual(this.applicationBundle, project.applicationBundle) && Intrinsics.areEqual(this.applicationVersion, project.applicationVersion) && Intrinsics.areEqual(this.applicationBuildVersion, project.applicationBuildVersion) && Intrinsics.areEqual(this.configuration, project.configuration) && Intrinsics.areEqual(this.savedTime, project.savedTime) && this.isReferralSent == project.isReferralSent && this.isMigrated == project.isMigrated;
    }

    @Nullable
    public final Long getActiveUserId() {
        return this.activeUserId;
    }

    @Nullable
    public final String getApplicationBuildVersion() {
        return this.applicationBuildVersion;
    }

    @Nullable
    public final String getApplicationBundle() {
        return this.applicationBundle;
    }

    @NotNull
    public final String getApplicationKey() {
        return this.applicationKey;
    }

    @Nullable
    public final String getApplicationVersion() {
        return this.applicationVersion;
    }

    @NotNull
    public final ConfigEntry getConfiguration() {
        return this.configuration;
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
    public final Long getSavedTime() {
        return this.savedTime;
    }

    public final boolean getTrackingAvailable() {
        return this.trackingAvailable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public int hashCode() {
        int iA = b.a(this.applicationKey, Long.hashCode(getIdKey()) * 31, 31);
        Long l10 = this.activeUserId;
        int iHashCode = (iA + (l10 == null ? 0 : l10.hashCode())) * 31;
        boolean z10 = this.trackingAvailable;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        String str = this.applicationBundle;
        int iHashCode2 = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.applicationVersion;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.applicationBuildVersion;
        int iHashCode4 = (this.configuration.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        Long l11 = this.savedTime;
        int iHashCode5 = (iHashCode4 + (l11 != null ? l11.hashCode() : 0)) * 31;
        boolean z11 = this.isReferralSent;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode5 + r11) * 31;
        boolean z12 = this.isMigrated;
        return i11 + (z12 ? 1 : z12);
    }

    public final boolean isMigrated() {
        return this.isMigrated;
    }

    public final boolean isReferralSent() {
        return this.isReferralSent;
    }

    public final void setActiveUserId(@Nullable Long l10) {
        this.activeUserId = l10;
    }

    public final void setApplicationBuildVersion(@Nullable String str) {
        this.applicationBuildVersion = str;
    }

    public final void setApplicationBundle(@Nullable String str) {
        this.applicationBundle = str;
    }

    public final void setApplicationVersion(@Nullable String str) {
        this.applicationVersion = str;
    }

    public final void setConfiguration(@NotNull ConfigEntry configEntry) {
        Intrinsics.checkNotNullParameter(configEntry, "<set-?>");
        this.configuration = configEntry;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public void setIdKey(long j10) {
        this.idKey = j10;
    }

    public final void setMigrated(boolean z10) {
        this.isMigrated = z10;
    }

    public final void setReferralSent(boolean z10) {
        this.isReferralSent = z10;
    }

    public final void setSavedTime(@Nullable Long l10) {
        this.savedTime = l10;
    }

    public final void setTrackingAvailable(boolean z10) {
        this.trackingAvailable = z10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<EventParam> toList() {
        return CollectionsKt.listOf((Object[]) new EventParam[]{new EventParam(ProjectEntry.applicationKey, new SqlValue.String(this.applicationKey)), new EventParam(ProjectEntry.activeUserId, new SqlValue.LongOrNull(this.activeUserId)), new EventParam(ProjectEntry.trackingAvailable, new SqlValue.Boolean(this.trackingAvailable)), new EventParam(ProjectEntry.applicationBundle, new SqlValue.StringOrNull(this.applicationBundle)), new EventParam(ProjectEntry.applicationVersion, new SqlValue.StringOrNull(this.applicationVersion)), new EventParam(ProjectEntry.applicationBuildVersion, new SqlValue.StringOrNull(this.applicationBuildVersion)), new EventParam(ProjectEntry.configuration, new SqlValue.String(this.configuration.getJson())), new EventParam(ProjectEntry.isReferralSent, new SqlValue.Boolean(this.isReferralSent)), new EventParam(ProjectEntry.savedTime, new SqlValue.LongOrNull(this.savedTime)), new EventParam(ProjectEntry.isMigrated, new SqlValue.Boolean(this.isMigrated))});
    }

    @NotNull
    public String toString() {
        return "Project(idKey=" + getIdKey() + ", applicationKey=" + this.applicationKey + ", activeUserId=" + this.activeUserId + ", trackingAvailable=" + this.trackingAvailable + ", applicationBundle=" + this.applicationBundle + ", applicationVersion=" + this.applicationVersion + ", applicationBuildVersion=" + this.applicationBuildVersion + ", configuration=" + this.configuration + ", savedTime=" + this.savedTime + ", isReferralSent=" + this.isReferralSent + ", isMigrated=" + this.isMigrated + ")";
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
        EventParam eventParamContainsName = EventParamKt.containsName(list, ProjectEntry.activeUserId);
        if (eventParamContainsName != null) {
            SqlValue value = eventParamContainsName.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            this.activeUserId = ((SqlValue.LongOrNull) value).getALong();
        }
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, ProjectEntry.trackingAvailable);
        if (eventParamContainsName2 != null) {
            SqlValue value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            this.trackingAvailable = ((SqlValue.Boolean) value2).getABoolean();
        }
        EventParam eventParamContainsName3 = EventParamKt.containsName(list, ProjectEntry.applicationBundle);
        if (eventParamContainsName3 != null) {
            SqlValue value3 = eventParamContainsName3.getValue();
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            this.applicationBundle = ((SqlValue.StringOrNull) value3).getString();
        }
        EventParam eventParamContainsName4 = EventParamKt.containsName(list, ProjectEntry.applicationVersion);
        if (eventParamContainsName4 != null) {
            SqlValue value4 = eventParamContainsName4.getValue();
            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            this.applicationVersion = ((SqlValue.StringOrNull) value4).getString();
        }
        EventParam eventParamContainsName5 = EventParamKt.containsName(list, ProjectEntry.applicationBuildVersion);
        if (eventParamContainsName5 != null) {
            SqlValue value5 = eventParamContainsName5.getValue();
            Intrinsics.checkNotNull(value5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            this.applicationBuildVersion = ((SqlValue.StringOrNull) value5).getString();
        }
        EventParam eventParamContainsName6 = EventParamKt.containsName(list, ProjectEntry.isReferralSent);
        if (eventParamContainsName6 != null) {
            SqlValue value6 = eventParamContainsName6.getValue();
            Intrinsics.checkNotNull(value6, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            this.isReferralSent = ((SqlValue.Boolean) value6).getABoolean();
        }
        EventParam eventParamContainsName7 = EventParamKt.containsName(list, ProjectEntry.savedTime);
        if (eventParamContainsName7 != null) {
            SqlValue value7 = eventParamContainsName7.getValue();
            Intrinsics.checkNotNull(value7, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.LongOrNull");
            this.savedTime = ((SqlValue.LongOrNull) value7).getALong();
        }
        EventParam eventParamContainsName8 = EventParamKt.containsName(list, ProjectEntry.isMigrated);
        if (eventParamContainsName8 != null) {
            SqlValue value8 = eventParamContainsName8.getValue();
            Intrinsics.checkNotNull(value8, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            this.isMigrated = ((SqlValue.Boolean) value8).getABoolean();
        }
    }

    public Project(long j10, @NotNull String applicationKey, @Nullable Long l10, boolean z10, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull ConfigEntry configuration, @Nullable Long l11, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(applicationKey, "applicationKey");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.idKey = j10;
        this.applicationKey = applicationKey;
        this.activeUserId = l10;
        this.trackingAvailable = z10;
        this.applicationBundle = str;
        this.applicationVersion = str2;
        this.applicationBuildVersion = str3;
        this.configuration = configuration;
        this.savedTime = l11;
        this.isReferralSent = z11;
        this.isMigrated = z12;
    }
}
