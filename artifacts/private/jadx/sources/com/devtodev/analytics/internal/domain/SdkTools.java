package com.devtodev.analytics.internal.domain;

import com.devtodev.analytics.internal.logger.Logger;
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
import okhttp3.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSdkTools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkTools.kt\ncom/devtodev/analytics/internal/domain/SdkTools\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class SdkTools extends DbModel {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private long idKey;

    @NotNull
    private String metadata;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SelectParameter> getColumnsTypes() {
            return CollectionsKt.listOf((Object[]) new SelectParameter[]{new SelectParameter("_id", ColumnTypeLong.INSTANCE), new SelectParameter("metadata", ColumnTypeString.INSTANCE)});
        }

        @NotNull
        public final DbModel init(@NotNull SelectRecords records) {
            Intrinsics.checkNotNullParameter(records, "records");
            SqlValue eventValue = records.getEventValue("_id");
            Intrinsics.checkNotNull(eventValue, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong = ((SqlValue.Long) eventValue).getALong();
            SqlValue eventValue2 = records.getEventValue("metadata");
            Intrinsics.checkNotNull(eventValue2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            return new SdkTools(aLong, ((SqlValue.String) eventValue2).getString());
        }

        private Companion() {
        }
    }

    public SdkTools() {
        this(0L, null, 3, null);
    }

    private final String component2() {
        return this.metadata;
    }

    public static /* synthetic */ SdkTools copy$default(SdkTools sdkTools, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = sdkTools.getIdKey();
        }
        if ((i10 & 2) != 0) {
            str = sdkTools.metadata;
        }
        return sdkTools.copy(j10, str);
    }

    public final long component1() {
        return getIdKey();
    }

    @NotNull
    public final SdkTools copy(long j10, @NotNull String metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new SdkTools(j10, metadata);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkTools)) {
            return false;
        }
        SdkTools sdkTools = (SdkTools) obj;
        return getIdKey() == sdkTools.getIdKey() && Intrinsics.areEqual(this.metadata, sdkTools.metadata);
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public long getIdKey() {
        return this.idKey;
    }

    @NotNull
    public final String getMetadataByKey(@NotNull ToolsKeys dataKey) {
        Intrinsics.checkNotNullParameter(dataKey, "dataKey");
        try {
            JSONArray jSONArray = new JSONArray(this.metadata);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (Intrinsics.areEqual(next, dataKey.getValue())) {
                        String string = jSONObject.getString(next);
                        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                        return string;
                    }
                }
            }
            return "";
        } catch (JSONException e10) {
            Logger.INSTANCE.error("Can't parse response data. Error:", e10);
            return "";
        }
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<SelectParameter> getModelColumnsTypes() {
        return Companion.getColumnsTypes();
    }

    public int hashCode() {
        return this.metadata.hashCode() + (Long.hashCode(getIdKey()) * 31);
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public void setIdKey(long j10) {
        this.idKey = j10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<EventParam> toList() {
        return CollectionsKt.mutableListOf(new EventParam("metadata", new SqlValue.String(this.metadata)));
    }

    @NotNull
    public String toString() {
        return "SdkTools(idKey=" + getIdKey() + ", metadata=" + this.metadata + ")";
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
        EventParam eventParamContainsName = EventParamKt.containsName(list, "metadata");
        if (eventParamContainsName != null) {
            SqlValue value = eventParamContainsName.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            this.metadata = ((SqlValue.String) value).getString();
        }
    }

    public final void updateMetadataByKey(@NotNull ToolsKeys dataKey, @NotNull String newValue) {
        Intrinsics.checkNotNullParameter(dataKey, "dataKey");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        try {
            JSONArray jSONArray = new JSONArray(this.metadata);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (Intrinsics.areEqual(next, dataKey.getValue())) {
                        jSONObject.put(next, newValue);
                    }
                }
            }
            String string = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(string, "jsonArr.toString()");
            this.metadata = string;
        } catch (JSONException e10) {
            Logger.INSTANCE.error("Can't parse response data. Error:", e10);
        }
    }

    public /* synthetic */ SdkTools(long j10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? -1L : j10, (i10 & 2) != 0 ? v.f334777p : str);
    }

    public SdkTools(long j10, @NotNull String metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.idKey = j10;
        this.metadata = metadata;
    }
}
