package com.devtodev.analytics.internal.domain.events.correncyPayment;

import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeString;
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
@SourceDebugExtension({"SMAP\nPaymentMark.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMark.kt\ncom/devtodev/analytics/internal/domain/events/correncyPayment/PaymentMark\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
public final class PaymentMark extends DbModel {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private long idKey;

    @NotNull
    private String orderId;
    private long projectId;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SelectParameter> getColumnsTypes() {
            ColumnTypeLong columnTypeLong = ColumnTypeLong.INSTANCE;
            return CollectionsKt.listOf((Object[]) new SelectParameter[]{new SelectParameter("_id", columnTypeLong), new SelectParameter("projectId", columnTypeLong), new SelectParameter("orderId", ColumnTypeString.INSTANCE)});
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
            SqlValue eventValue3 = records.getEventValue("orderId");
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            return new PaymentMark(aLong, aLong2, ((SqlValue.String) eventValue3).getString());
        }

        private Companion() {
        }
    }

    public /* synthetic */ PaymentMark(long j10, long j11, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? -1L : j10, j11, str);
    }

    public static /* synthetic */ PaymentMark copy$default(PaymentMark paymentMark, long j10, long j11, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = paymentMark.getIdKey();
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = paymentMark.projectId;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            str = paymentMark.orderId;
        }
        return paymentMark.copy(j12, j13, str);
    }

    public final long component1() {
        return getIdKey();
    }

    public final long component2() {
        return this.projectId;
    }

    @NotNull
    public final String component3() {
        return this.orderId;
    }

    @NotNull
    public final PaymentMark copy(long j10, long j11, @NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new PaymentMark(j10, j11, orderId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMark)) {
            return false;
        }
        PaymentMark paymentMark = (PaymentMark) obj;
        return getIdKey() == paymentMark.getIdKey() && this.projectId == paymentMark.projectId && Intrinsics.areEqual(this.orderId, paymentMark.orderId);
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
    public final String getOrderId() {
        return this.orderId;
    }

    public final long getProjectId() {
        return this.projectId;
    }

    public int hashCode() {
        return this.orderId.hashCode() + a.a(this.projectId, Long.hashCode(getIdKey()) * 31, 31);
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public void setIdKey(long j10) {
        this.idKey = j10;
    }

    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderId = str;
    }

    public final void setProjectId(long j10) {
        this.projectId = j10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<EventParam> toList() {
        return CollectionsKt.listOf((Object[]) new EventParam[]{new EventParam("projectId", new SqlValue.Long(this.projectId)), new EventParam("orderId", new SqlValue.String(this.orderId))});
    }

    @NotNull
    public String toString() {
        return "PaymentMark(idKey=" + getIdKey() + ", projectId=" + this.projectId + ", orderId=" + this.orderId + ")";
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
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, "orderId");
        if (eventParamContainsName2 != null) {
            SqlValue value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            this.orderId = ((SqlValue.String) value2).getString();
        }
    }

    public PaymentMark(long j10, long j11, @NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.idKey = j10;
        this.projectId = j11;
        this.orderId = orderId;
    }
}
