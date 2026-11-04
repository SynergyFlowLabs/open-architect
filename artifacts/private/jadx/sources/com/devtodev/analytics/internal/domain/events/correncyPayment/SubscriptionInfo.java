package com.devtodev.analytics.internal.domain.events.correncyPayment;

import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeBoolean;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.SelectParameter;
import com.devtodev.analytics.internal.storage.sqlite.SelectRecords;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import com.devtodev.analytics.internal.storage.sqlite.SubscriptionEntry;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSubscriptionInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionInfo.kt\ncom/devtodev/analytics/internal/domain/events/correncyPayment/SubscriptionInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class SubscriptionInfo extends DbModel {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private boolean alreadySendRestoreEvent;
    private long idKey;
    private long projectId;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SelectParameter> getColumnsTypes() {
            ColumnTypeLong columnTypeLong = ColumnTypeLong.INSTANCE;
            return CollectionsKt.listOf((Object[]) new SelectParameter[]{new SelectParameter("_id", columnTypeLong), new SelectParameter("projectId", columnTypeLong), new SelectParameter(SubscriptionEntry.alreadySendRestoreEvent, ColumnTypeBoolean.INSTANCE)});
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
            SqlValue eventValue3 = records.getEventValue(SubscriptionEntry.alreadySendRestoreEvent);
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            return new SubscriptionInfo(aLong, aLong2, ((SqlValue.Boolean) eventValue3).getABoolean());
        }

        private Companion() {
        }
    }

    public /* synthetic */ SubscriptionInfo(long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1L : j10, j11, (i10 & 4) != 0 ? false : z10);
    }

    public final boolean getAlreadySendRestoreEvent() {
        return this.alreadySendRestoreEvent;
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

    public final void setAlreadySendRestoreEvent(boolean z10) {
        this.alreadySendRestoreEvent = z10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public void setIdKey(long j10) {
        this.idKey = j10;
    }

    public final void setProjectId(long j10) {
        this.projectId = j10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<EventParam> toList() {
        return CollectionsKt.listOf((Object[]) new EventParam[]{new EventParam("projectId", new SqlValue.Long(this.projectId)), new EventParam(SubscriptionEntry.alreadySendRestoreEvent, new SqlValue.Boolean(this.alreadySendRestoreEvent))});
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
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, SubscriptionEntry.alreadySendRestoreEvent);
        if (eventParamContainsName2 != null) {
            SqlValue value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Boolean");
            this.alreadySendRestoreEvent = ((SqlValue.Boolean) value2).getABoolean();
        }
    }

    public SubscriptionInfo(long j10, long j11, boolean z10) {
        this.idKey = j10;
        this.projectId = j11;
        this.alreadySendRestoreEvent = z10;
    }
}
