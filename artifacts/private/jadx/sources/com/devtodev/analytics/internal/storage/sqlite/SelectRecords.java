package com.devtodev.analytics.internal.storage.sqlite;

import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.DevToDevUuid;
import com.devtodev.analytics.internal.domain.DeviceIdentifiers;
import com.devtodev.analytics.internal.domain.EventObject;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.SdkTools;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperiment;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsExperimentState;
import com.devtodev.analytics.internal.domain.events.abTests.AbTestsProject;
import com.devtodev.analytics.internal.domain.events.autoPurchases.AutoPurchasesMark;
import com.devtodev.analytics.internal.domain.events.correncyPayment.PaymentMark;
import com.devtodev.analytics.internal.domain.events.correncyPayment.SubscriptionInfo;
import com.devtodev.analytics.internal.domain.events.currencyAccrual.CurrencyAccrualResource;
import com.devtodev.analytics.internal.domain.events.currencyAccrual.LevelResource;
import com.devtodev.analytics.internal.domain.events.people.PeopleCard;
import com.devtodev.analytics.internal.domain.events.reports.Report;
import com.devtodev.analytics.internal.domain.events.tutorial.TutorialMark;
import com.devtodev.analytics.internal.storage.EventParam;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSelectParameter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectParameter.kt\ncom/devtodev/analytics/internal/storage/sqlite/SelectRecords\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
public final class SelectRecords {

    @NotNull
    private final List<EventParam> data;

    public SelectRecords(@NotNull List<EventParam> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectRecords copy$default(SelectRecords selectRecords, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = selectRecords.data;
        }
        return selectRecords.copy(list);
    }

    @NotNull
    public final List<EventParam> component1() {
        return this.data;
    }

    @NotNull
    public final SelectRecords copy(@NotNull List<EventParam> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new SelectRecords(data);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectRecords) && Intrinsics.areEqual(this.data, ((SelectRecords) obj).data);
    }

    @NotNull
    public final List<EventParam> getData() {
        return this.data;
    }

    @Nullable
    public final SqlValue getEventValue(@NotNull String name) {
        Object next;
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<T> it = this.data.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((EventParam) next).getName(), name));
        EventParam eventParam = (EventParam) next;
        if (eventParam != null) {
            return eventParam.getValue();
        }
        return null;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public final DbModel modelCast(@NotNull String tableName) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        if (StringsKt.V2(ProjectEntry.tableName, tableName, false, 2, null)) {
            return Project.Companion.init(this);
        }
        if (StringsKt.V2(UserEntry.tableName, tableName, false, 2, null)) {
            return User.Companion.init(this);
        }
        if (StringsKt.V2(IdentifiersEntry.tableName, tableName, false, 2, null)) {
            return DeviceIdentifiers.Companion.init(this);
        }
        if (StringsKt.V2(EventEntry.tableName, tableName, false, 2, null)) {
            return EventObject.Companion.init(this);
        }
        if (StringsKt.V2(ReportEntry.tableName, tableName, false, 2, null)) {
            return Report.Companion.init(this);
        }
        if (StringsKt.V2(CurrencyAccrualResourcesEntry.tableName, tableName, false, 2, null)) {
            return CurrencyAccrualResource.Companion.init(this);
        }
        if (StringsKt.V2(LevelResourceEntry.tableName, tableName, false, 2, null)) {
            return LevelResource.Companion.init(this);
        }
        if (StringsKt.V2(PaymentMarkEntry.tableName, tableName, false, 2, null)) {
            return PaymentMark.Companion.init(this);
        }
        if (StringsKt.V2(TutorialMarkEntry.tableName, tableName, false, 2, null)) {
            return TutorialMark.Companion.init(this);
        }
        if (StringsKt.V2(PeopleCardEntry.tableName, tableName, false, 2, null)) {
            return PeopleCard.Companion.init(this);
        }
        if (StringsKt.V2(SdkToolsEntry.tableName, tableName, false, 2, null)) {
            return SdkTools.Companion.init(this);
        }
        if (StringsKt.V2(DevToDevUuidEntry.tableName, tableName, false, 2, null)) {
            return DevToDevUuid.Companion.init(this);
        }
        if (StringsKt.V2("subscriptions", tableName, false, 2, null)) {
            return SubscriptionInfo.Companion.init(this);
        }
        if (StringsKt.V2(AbTestProjectEntry.tableName, tableName, false, 2, null)) {
            return AbTestsProject.Companion.init(this);
        }
        if (StringsKt.V2(ExperimentsEntry.tableName, tableName, false, 2, null)) {
            return AbTestsExperiment.Companion.init(this);
        }
        if (StringsKt.V2(ExperimentsStateEntry.tableName, tableName, false, 2, null)) {
            return AbTestsExperimentState.Companion.init(this);
        }
        if (StringsKt.V2(AutoPurchasesMarkEntry.tableName, tableName, false, 2, null)) {
            return AutoPurchasesMark.Companion.init(this);
        }
        throw new UnsupportedOperationException("DbModel with tableName " + tableName + " has no associated object");
    }

    @NotNull
    public String toString() {
        return "SelectRecords(data=" + this.data + ")";
    }
}
