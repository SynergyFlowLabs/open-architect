package com.superwall.sdk.storage.core_data;

import android.content.Context;
import androidx.room.a2;
import androidx.room.b2;
import androidx.room.m;
import androidx.room.t2;
import com.superwall.sdk.storage.core_data.entities.ManagedEventData;
import com.superwall.sdk.storage.core_data.entities.ManagedEventDataDao;
import com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrence;
import com.superwall.sdk.storage.core_data.entities.ManagedTriggerRuleOccurrenceDao;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@m(entities = {ManagedEventData.class, ManagedTriggerRuleOccurrence.class}, exportSchema = false, version = 1)
@t2({Converters.class})
public abstract class SuperwallDatabase extends b2 {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private static volatile SuperwallDatabase INSTANCE;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SuperwallDatabase getDatabase(@NotNull Context context) {
            SuperwallDatabase superwallDatabase;
            Intrinsics.checkNotNullParameter(context, "context");
            SuperwallDatabase superwallDatabase2 = SuperwallDatabase.INSTANCE;
            if (superwallDatabase2 != null) {
                return superwallDatabase2;
            }
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                superwallDatabase = (SuperwallDatabase) a2.a(applicationContext, SuperwallDatabase.class, "superwall_database").f();
                Companion companion = SuperwallDatabase.Companion;
                SuperwallDatabase.INSTANCE = superwallDatabase;
            }
            return superwallDatabase;
        }

        private Companion() {
        }
    }

    @NotNull
    public abstract ManagedEventDataDao managedEventDataDao();

    @NotNull
    public abstract ManagedTriggerRuleOccurrenceDao managedTriggerRuleOccurrenceDao();
}
