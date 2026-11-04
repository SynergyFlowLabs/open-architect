package com.devtodev.analytics.internal.domain.events.currencyAccrual;

import com.devtodev.analytics.external.analytics.DTDAccrualType;
import com.devtodev.analytics.external.analytics.DTDAccrualTypeKt;
import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.IDeleteByUserId;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeString;
import com.devtodev.analytics.internal.storage.sqlite.SelectParameter;
import com.devtodev.analytics.internal.storage.sqlite.SelectRecords;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import h4.a;
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
@SourceDebugExtension({"SMAP\nCurrencyAccrualResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurrencyAccrualResource.kt\ncom/devtodev/analytics/internal/domain/events/currencyAccrual/CurrencyAccrualResource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
public final class CurrencyAccrualResource extends DbModel implements IDeleteByUserId {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private long amount;
    private long idKey;

    @NotNull
    private String name;

    @NotNull
    private String source;
    private long timestamp;

    @NotNull
    private final DTDAccrualType type;
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
            SelectParameter selectParameter3 = new SelectParameter("type", columnTypeLong);
            ColumnTypeString columnTypeString = ColumnTypeString.INSTANCE;
            return CollectionsKt.listOf((Object[]) new SelectParameter[]{selectParameter, selectParameter2, selectParameter3, new SelectParameter("name", columnTypeString), new SelectParameter("amount", columnTypeLong), new SelectParameter("source", columnTypeString), new SelectParameter("timestamp", columnTypeLong)});
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
            SqlValue eventValue3 = records.getEventValue("type");
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            DTDAccrualType accrualType = DTDAccrualTypeKt.getAccrualType(((SqlValue.Long) eventValue3).getALong());
            SqlValue eventValue4 = records.getEventValue("name");
            Intrinsics.checkNotNull(eventValue4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            String string = ((SqlValue.String) eventValue4).getString();
            SqlValue eventValue5 = records.getEventValue("amount");
            Intrinsics.checkNotNull(eventValue5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            long aLong3 = ((SqlValue.Long) eventValue5).getALong();
            SqlValue eventValue6 = records.getEventValue("source");
            Intrinsics.checkNotNull(eventValue6, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            String string2 = ((SqlValue.String) eventValue6).getString();
            SqlValue eventValue7 = records.getEventValue("timestamp");
            Intrinsics.checkNotNull(eventValue7, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            return new CurrencyAccrualResource(aLong, aLong2, accrualType, string, aLong3, string2, ((SqlValue.Long) eventValue7).getALong());
        }

        private Companion() {
        }
    }

    public /* synthetic */ CurrencyAccrualResource(long j10, long j11, DTDAccrualType dTDAccrualType, String str, long j12, String str2, long j13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? -1L : j10, (i10 & 2) != 0 ? -1L : j11, dTDAccrualType, str, j12, str2, (i10 & 64) != 0 ? System.currentTimeMillis() : j13);
    }

    public static /* synthetic */ CurrencyAccrualResource copy$default(CurrencyAccrualResource currencyAccrualResource, long j10, long j11, DTDAccrualType dTDAccrualType, String str, long j12, String str2, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = currencyAccrualResource.getIdKey();
        }
        return currencyAccrualResource.copy(j10, (i10 & 2) != 0 ? currencyAccrualResource.getUserId() : j11, (i10 & 4) != 0 ? currencyAccrualResource.type : dTDAccrualType, (i10 & 8) != 0 ? currencyAccrualResource.name : str, (i10 & 16) != 0 ? currencyAccrualResource.amount : j12, (i10 & 32) != 0 ? currencyAccrualResource.source : str2, (i10 & 64) != 0 ? currencyAccrualResource.timestamp : j13);
    }

    public final long component1() {
        return getIdKey();
    }

    public final long component2() {
        return getUserId();
    }

    @NotNull
    public final DTDAccrualType component3() {
        return this.type;
    }

    @NotNull
    public final String component4() {
        return this.name;
    }

    public final long component5() {
        return this.amount;
    }

    @NotNull
    public final String component6() {
        return this.source;
    }

    public final long component7() {
        return this.timestamp;
    }

    @NotNull
    public final CurrencyAccrualResource copy(long j10, long j11, @NotNull DTDAccrualType type, @NotNull String name, long j12, @NotNull String source, long j13) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(source, "source");
        return new CurrencyAccrualResource(j10, j11, type, name, j12, source, j13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyAccrualResource)) {
            return false;
        }
        CurrencyAccrualResource currencyAccrualResource = (CurrencyAccrualResource) obj;
        return getIdKey() == currencyAccrualResource.getIdKey() && getUserId() == currencyAccrualResource.getUserId() && this.type == currencyAccrualResource.type && Intrinsics.areEqual(this.name, currencyAccrualResource.name) && this.amount == currencyAccrualResource.amount && Intrinsics.areEqual(this.source, currencyAccrualResource.source) && this.timestamp == currencyAccrualResource.timestamp;
    }

    public final long getAmount() {
        return this.amount;
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
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final DTDAccrualType getType() {
        return this.type;
    }

    @Override // com.devtodev.analytics.internal.domain.IDeleteByUserId
    public long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + b.a(this.source, a.a(this.amount, b.a(this.name, (this.type.hashCode() + ((Long.hashCode(getUserId()) + (Long.hashCode(getIdKey()) * 31)) * 31)) * 31, 31), 31), 31);
    }

    public final void setAmount(long j10) {
        this.amount = j10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    public void setIdKey(long j10) {
        this.idKey = j10;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source = str;
    }

    public final void setTimestamp(long j10) {
        this.timestamp = j10;
    }

    @Override // com.devtodev.analytics.internal.domain.IDeleteByUserId
    public void setUserId(long j10) {
        this.userId = j10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<EventParam> toList() {
        return CollectionsKt.listOf((Object[]) new EventParam[]{new EventParam("userId", new SqlValue.Long(getUserId())), new EventParam("type", new SqlValue.Long(this.type.getValue())), new EventParam("name", new SqlValue.String(this.name)), new EventParam("amount", new SqlValue.Long(this.amount)), new EventParam("source", new SqlValue.String(this.source)), new EventParam("timestamp", new SqlValue.Long(this.timestamp))});
    }

    @NotNull
    public String toString() {
        return "\t\t \n\tuserId:" + getUserId() + "\n\ttype:" + this.type + "\n\tname:" + this.name + "\n\tamount:" + this.amount + "\n\tsource:" + this.source;
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
            setUserId(((SqlValue.Long) value).getALong());
        }
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, "name");
        if (eventParamContainsName2 != null) {
            SqlValue value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            this.name = ((SqlValue.String) value2).getString();
        }
        EventParam eventParamContainsName3 = EventParamKt.containsName(list, "amount");
        if (eventParamContainsName3 != null) {
            SqlValue value3 = eventParamContainsName3.getValue();
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            this.amount = ((SqlValue.Long) value3).getALong();
        }
        EventParam eventParamContainsName4 = EventParamKt.containsName(list, "source");
        if (eventParamContainsName4 != null) {
            SqlValue value4 = eventParamContainsName4.getValue();
            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            this.source = ((SqlValue.String) value4).getString();
        }
        EventParam eventParamContainsName5 = EventParamKt.containsName(list, "timestamp");
        if (eventParamContainsName5 != null) {
            SqlValue value5 = eventParamContainsName5.getValue();
            Intrinsics.checkNotNull(value5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            this.timestamp = ((SqlValue.Long) value5).getALong();
        }
    }

    public CurrencyAccrualResource(long j10, long j11, @NotNull DTDAccrualType type, @NotNull String name, long j12, @NotNull String source, long j13) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(source, "source");
        this.idKey = j10;
        this.userId = j11;
        this.type = type;
        this.name = name;
        this.amount = j12;
        this.source = source;
        this.timestamp = j13;
    }
}
