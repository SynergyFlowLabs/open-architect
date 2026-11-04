package com.superwall.sdk.paywall.presentation.rule_logic.cel;

import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue;
import com.superwall.sdk.storage.core_data.CoreDataManager;
import com.superwall.supercel.HostContext;
import com.superwall.supercel.ResultCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.j;
import kotlinx.serialization.internal.f;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSuperscriptHostContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuperscriptHostContext.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/SuperscriptHostContext\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n147#2:79\n147#2:82\n113#3:80\n113#3:81\n113#3:83\n113#3:84\n1557#4:85\n1628#4,3:86\n*S KotlinDebug\n*F\n+ 1 SuperscriptHostContext.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/SuperscriptHostContext\n*L\n28#1:79\n56#1:82\n31#1:80\n47#1:81\n59#1:83\n75#1:84\n17#1:85\n17#1:86,3\n*E\n"})
public final class SuperscriptHostContext implements HostContext {

    @NotNull
    public static final ComputedProperties ComputedProperties = new ComputedProperties(null);

    @NotNull
    private static final List<String> availableComputedProperties;

    @NotNull
    private static final List<String> availableDeviceProperties;

    @NotNull
    private final Json json;

    @NotNull
    private final CoreDataManager storage;

    public static final class ComputedProperties {
        public /* synthetic */ ComputedProperties(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<String> getAvailableComputedProperties() {
            return SuperscriptHostContext.availableComputedProperties;
        }

        @NotNull
        public final List<String> getAvailableDeviceProperties() {
            return SuperscriptHostContext.availableDeviceProperties;
        }

        private ComputedProperties() {
        }
    }

    static {
        kotlin.enums.a<SuperscriptExposedFunction.Names> entries = SuperscriptExposedFunction.Names.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
        Iterator<SuperscriptExposedFunction.Names> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getRawName());
        }
        availableComputedProperties = arrayList;
        availableDeviceProperties = arrayList;
    }

    public SuperscriptHostContext(@NotNull Json json, @NotNull CoreDataManager storage) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.json = json;
        this.storage = storage;
    }

    @Override // com.superwall.supercel.HostContext
    public void computedProperty(@NotNull String name, @NotNull String args, @NotNull ResultCallback callback) {
        PassableValue passableValue;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Json json = this.json;
        json.getSerializersModule();
        PassableValue.Companion companion = PassableValue.Companion;
        List list = (List) json.decodeFromString(new f(companion.serializer()), args);
        if (!availableComputedProperties.contains(name)) {
            Json json2 = this.json;
            PassableValue.BoolValue boolValue = new PassableValue.BoolValue(false);
            json2.getSerializersModule();
            callback.onResult(json2.encodeToString(companion.serializer(), boolValue));
            return;
        }
        Integer num = (Integer) j.b(null, new SuperscriptHostContext$computedProperty$res$1(name, list, this, null), 1, null);
        Json json3 = this.json;
        if (num == null || (passableValue = SuperscriptEvaluatorKt.toPassableValue(num)) == null) {
            passableValue = PassableValue.NullValue.INSTANCE;
        }
        json3.getSerializersModule();
        callback.onResult(json3.encodeToString(companion.serializer(), passableValue));
    }

    @Override // com.superwall.supercel.HostContext
    public void deviceProperty(@NotNull String name, @NotNull String args, @NotNull ResultCallback callback) {
        PassableValue passableValue;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Json json = this.json;
        json.getSerializersModule();
        PassableValue.Companion companion = PassableValue.Companion;
        List list = (List) json.decodeFromString(new f(companion.serializer()), args);
        if (!availableDeviceProperties.contains(name)) {
            Json json2 = this.json;
            PassableValue.BoolValue boolValue = new PassableValue.BoolValue(false);
            json2.getSerializersModule();
            callback.onResult(json2.encodeToString(companion.serializer(), boolValue));
            return;
        }
        Integer num = (Integer) j.b(null, new SuperscriptHostContext$deviceProperty$res$1(name, list, this, null), 1, null);
        Json json3 = this.json;
        if (num == null || (passableValue = SuperscriptEvaluatorKt.toPassableValue(num)) == null) {
            passableValue = PassableValue.NullValue.INSTANCE;
        }
        json3.getSerializersModule();
        callback.onResult(json3.encodeToString(companion.serializer(), passableValue));
    }
}
