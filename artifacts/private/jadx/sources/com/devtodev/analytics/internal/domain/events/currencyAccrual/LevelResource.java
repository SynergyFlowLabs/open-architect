package com.devtodev.analytics.internal.domain.events.currencyAccrual;

import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.IDeleteByUserId;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.EventParamKt;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeLong;
import com.devtodev.analytics.internal.storage.sqlite.ColumnTypeString;
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
@SourceDebugExtension({"SMAP\nLevelResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelResource.kt\ncom/devtodev/analytics/internal/domain/events/currencyAccrual/LevelResource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public final class LevelResource extends DbModel implements IDeleteByUserId {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private long amount;
    private long idKey;

    @NotNull
    private String name;

    @NotNull
    private final LevelResourceType type;
    private long userId;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<SelectParameter> getColumnsTypes() {
            ColumnTypeLong columnTypeLong = ColumnTypeLong.INSTANCE;
            return CollectionsKt.listOf((Object[]) new SelectParameter[]{new SelectParameter("_id", columnTypeLong), new SelectParameter("userId", columnTypeLong), new SelectParameter("type", columnTypeLong), new SelectParameter("name", ColumnTypeString.INSTANCE), new SelectParameter("amount", columnTypeLong)});
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
            LevelResourceType.Companion companion = LevelResourceType.Companion;
            SqlValue eventValue3 = records.getEventValue("type");
            Intrinsics.checkNotNull(eventValue3, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            LevelResourceType levelResourceTypeFromLong = companion.fromLong(((SqlValue.Long) eventValue3).getALong());
            SqlValue eventValue4 = records.getEventValue("name");
            Intrinsics.checkNotNull(eventValue4, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            String string = ((SqlValue.String) eventValue4).getString();
            SqlValue eventValue5 = records.getEventValue("amount");
            Intrinsics.checkNotNull(eventValue5, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            return new LevelResource(aLong, aLong2, levelResourceTypeFromLong, string, ((SqlValue.Long) eventValue5).getALong());
        }

        private Companion() {
        }
    }

    public /* synthetic */ LevelResource(long j10, long j11, LevelResourceType levelResourceType, String str, long j12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? -1L : j10, (i10 & 2) != 0 ? -1L : j11, levelResourceType, str, j12);
    }

    public static /* synthetic */ LevelResource copy$default(LevelResource levelResource, long j10, long j11, LevelResourceType levelResourceType, String str, long j12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = levelResource.getIdKey();
        }
        long j13 = j10;
        if ((i10 & 2) != 0) {
            j11 = levelResource.getUserId();
        }
        long j14 = j11;
        if ((i10 & 4) != 0) {
            levelResourceType = levelResource.type;
        }
        LevelResourceType levelResourceType2 = levelResourceType;
        if ((i10 & 8) != 0) {
            str = levelResource.name;
        }
        return levelResource.copy(j13, j14, levelResourceType2, str, (i10 & 16) != 0 ? levelResource.amount : j12);
    }

    public final long component1() {
        return getIdKey();
    }

    public final long component2() {
        return getUserId();
    }

    @NotNull
    public final LevelResourceType component3() {
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
    public final LevelResource copy(long j10, long j11, @NotNull LevelResourceType type, @NotNull String name, long j12) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        return new LevelResource(j10, j11, type, name, j12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelResource)) {
            return false;
        }
        LevelResource levelResource = (LevelResource) obj;
        return getIdKey() == levelResource.getIdKey() && getUserId() == levelResource.getUserId() && this.type == levelResource.type && Intrinsics.areEqual(this.name, levelResource.name) && this.amount == levelResource.amount;
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
    public final LevelResourceType getType() {
        return this.type;
    }

    @Override // com.devtodev.analytics.internal.domain.IDeleteByUserId
    public long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Long.hashCode(this.amount) + b.a(this.name, (this.type.hashCode() + ((Long.hashCode(getUserId()) + (Long.hashCode(getIdKey()) * 31)) * 31)) * 31, 31);
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

    @Override // com.devtodev.analytics.internal.domain.IDeleteByUserId
    public void setUserId(long j10) {
        this.userId = j10;
    }

    @Override // com.devtodev.analytics.internal.domain.DbModel
    @NotNull
    public List<EventParam> toList() {
        return CollectionsKt.listOf((Object[]) new EventParam[]{new EventParam("userId", new SqlValue.Long(getUserId())), new EventParam("type", new SqlValue.Long(this.type.getValue())), new EventParam("name", new SqlValue.String(this.name)), new EventParam("amount", new SqlValue.Long(this.amount))});
    }

    @NotNull
    public String toString() {
        return "\t\t \n\tuserId:" + getUserId() + "\n\ttype:" + this.type + "\n\tname:" + this.name + "\n\tamount:" + this.amount;
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
        EventParam eventParamContainsName = EventParamKt.containsName(list, "name");
        if (eventParamContainsName != null) {
            SqlValue value = eventParamContainsName.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.String");
            this.name = ((SqlValue.String) value).getString();
        }
        EventParam eventParamContainsName2 = EventParamKt.containsName(list, "amount");
        if (eventParamContainsName2 != null) {
            SqlValue value2 = eventParamContainsName2.getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type com.devtodev.analytics.internal.storage.sqlite.SqlValue.Long");
            this.amount = ((SqlValue.Long) value2).getALong();
        }
    }

    public LevelResource(long j10, long j11, @NotNull LevelResourceType type, @NotNull String name, long j12) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        this.idKey = j10;
        this.userId = j11;
        this.type = type;
        this.name = name;
        this.amount = j12;
    }
}
