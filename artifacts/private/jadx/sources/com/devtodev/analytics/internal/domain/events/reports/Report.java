package com.devtodev.analytics.internal.domain.events.reports;

import com.devtodev.analytics.internal.backend.Identifiers;
import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeString;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeStringOrNull;
import com.devtodev.analytics.internal.storage.sqlite.ReportEntry;
import com.devtodev.analytics.internal.storage.sqlite.SelectParameter;
import com.devtodev.analytics.internal.storage.sqlite.SelectRecords;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import io.sentry.protocol.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Report.kt\ncom/devtodev/analytics/internal/domain/events/reports/Report\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class Report extends DbModel implements IEncodable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private String appKey;
    private long idKey;

    @Nullable
    private Identifiers identifiers;

    @NotNull
    private final List<Package> packages;

    @Nullable
    private String packagesJson;
    private long userId;

    @NotNull
    private String uuid;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SelectParameter> getColumnsTypes() {
            ColumnTypeLong columnTypeLong = ColumnTypeLong.INSTANCE;
            return CollectionsKt.listOf((Object[]) new SelectParameter[]{new SelectParameter("_id", columnTypeLong), new SelectParameter("userId", columnTypeLong), new SelectParameter(ReportEntry.packagesJson, ColumnTypeStringOrNull.INSTANCE), new SelectParameter("uuid", ColumnTypeString.INSTANCE)});
        }

        @NotNull
        public final DbModel init(@NotNull SelectRecords records) throws JSONException {
            Intrinsics.checkNotNullParameter(records, "records");
            ArrayList arrayList = new ArrayList();
            SqlValue eventValue = records.getEventValue(ReportEntry.packagesJson);
            Intrinsics.checkNotNull(eventValue, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            String string = ((SqlValue.StringOrNull) eventValue).getString();
            if (string != null) {
                JSONArray jSONArray = new JSONObject(string).getJSONArray(p.b.f306433c);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj = jSONArray.get(i10);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    arrayList.add(Package.Companion.decode((JSONObject) obj));
                }
            }
            SqlValue eventValue2 = records.getEventValue("_id");
            Intrinsics.checkNotNull(eventValue2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong = ((SqlValue.Long) eventValue2).getALong();
            SqlValue eventValue3 = records.getEventValue("userId");
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong2 = ((SqlValue.Long) eventValue3).getALong();
            SqlValue eventValue4 = records.getEventValue("uuid");
            Intrinsics.checkNotNull(eventValue4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            return new Report(aLong, aLong2, string, arrayList, ((SqlValue.String) eventValue4).getString());
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Report(long j10, long j11, String str, List list, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        j10 = (i10 & 1) != 0 ? -1L : j10;
        j11 = (i10 & 2) != 0 ? -1L : j11;
        str = (i10 & 4) != 0 ? null : str;
        if ((i10 & 16) != 0) {
            str2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str2, "randomUUID().toString()");
        }
        this(j10, j11, str, list, str2);
    }

    @Nullable
    public final String getAppKey() {
        return this.appKey;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getCode() {
        return "";
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public long getIdKey() {
        return this.idKey;
    }

    @Nullable
    public final Identifiers getIdentifiers() {
        return this.identifiers;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getJson() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<Package> it = this.packages.iterator();
        while (it.hasNext()) {
            jSONArray.put(PackageKt.encode(it.next()));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate(p.b.f306433c, jSONArray);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    @NotNull
    public final JSONObject getJson1() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<Package> it = this.packages.iterator();
        while (it.hasNext()) {
            jSONArray.put(PackageKt.encode(it.next()));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate(p.b.f306433c, jSONArray);
        return jSONObject;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<SelectParameter> getModelColumnsTypes() {
        return Companion.getColumnsTypes();
    }

    @NotNull
    public final List<Package> getPackages() {
        return this.packages;
    }

    @Nullable
    public final String getPackagesJson() {
        return this.packagesJson;
    }

    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public final void setAppKey(@Nullable String str) {
        this.appKey = str;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public void setIdKey(long j10) {
        this.idKey = j10;
    }

    public final void setIdentifiers(@Nullable Identifiers identifiers) {
        this.identifiers = identifiers;
    }

    public final void setPackagesJson(@Nullable String str) {
        this.packagesJson = str;
    }

    public final void setUserId(long j10) {
        this.userId = j10;
    }

    public final void setUuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<EventParam> toList() {
        return CollectionsKt.listOf((Object[]) new EventParam[]{new EventParam("userId", new SqlValue.Long(this.userId)), new EventParam(ReportEntry.packagesJson, new SqlValue.StringOrNull(this.packagesJson)), new EventParam("uuid", new SqlValue.String(this.uuid))});
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
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, ReportEntry.packagesJson);
        if (eventParamContainsName2 != null) {
            SqlValue value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.StringOrNull");
            this.packagesJson = ((SqlValue.StringOrNull) value2).getString();
        }
        EventParam eventParamContainsName3 = EventParamKt.containsName(list, "uuid");
        if (eventParamContainsName3 != null) {
            SqlValue value3 = eventParamContainsName3.getValue();
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            this.uuid = ((SqlValue.String) value3).getString();
        }
    }

    public Report(long j10, long j11, @Nullable String str, @NotNull List<Package> packages, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.idKey = j10;
        this.userId = j11;
        this.packagesJson = str;
        this.packages = packages;
        this.uuid = uuid;
    }
}
