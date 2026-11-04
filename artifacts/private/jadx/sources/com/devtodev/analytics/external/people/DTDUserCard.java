package com.devtodev.analytics.external.people;

import a.a;
import com.devtodev.analytics.internal.core.Core;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterBoolean;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterDouble;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterLong;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterString;
import com.devtodev.analytics.internal.modues.people.PeopleReservedKeys;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DTDUserCard {

    @NotNull
    public static final DTDUserCard INSTANCE = new DTDUserCard();

    public final void clearUser() {
        Core.INSTANCE.getPeopleProxy().clearUser("clearUser");
    }

    public final void getValue(@NotNull String key, @NotNull Function1<Object, Unit> handler) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Core.INSTANCE.getPeopleProxy().getValue("getValue", key, new a(handler));
    }

    public final void increment(@NotNull String key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Core.INSTANCE.getPeopleProxy().increment("increment", key, new PeopleParameterLong(j10));
    }

    public final void set(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Core.INSTANCE.getPeopleProxy().setValue("set", key, new PeopleParameterString(value));
    }

    public final void setCheater(boolean z10) {
        Core.INSTANCE.getPeopleProxy().setReservedValue("setCheater", PeopleReservedKeys.Cheater.getValue(), new PeopleParameterBoolean(z10));
    }

    public final void setTester(boolean z10) {
        Core.INSTANCE.getPeopleProxy().setReservedValue("setTester", PeopleReservedKeys.Tester.getValue(), new PeopleParameterBoolean(z10));
    }

    public final void unset(@NotNull String property) {
        Intrinsics.checkNotNullParameter(property, "property");
        Core.INSTANCE.getPeopleProxy().unset("unset", CollectionsKt.listOf(property));
    }

    public final void increment(@NotNull String key, double d10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Core.INSTANCE.getPeopleProxy().increment("increment", key, new PeopleParameterDouble(d10));
    }

    public final void set(@NotNull String key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Core.INSTANCE.getPeopleProxy().setValue("set", key, new PeopleParameterBoolean(z10));
    }

    public final void unset(@NotNull List<String> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        Core.INSTANCE.getPeopleProxy().unset("unset", property);
    }

    public final void set(@NotNull String key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Core.INSTANCE.getPeopleProxy().setValue("set", key, new PeopleParameterLong(j10));
    }

    public final void set(@NotNull String key, double d10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Core.INSTANCE.getPeopleProxy().setValue("set", key, new PeopleParameterDouble(d10));
    }
}
