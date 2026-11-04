package com.devtodev.analytics.external.abtest;

import com.devtodev.analytics.internal.core.Core;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.validator.ValidatorRules;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDTDRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DTDRemoteConfig.kt\ncom/devtodev/analytics/external/abtest/DTDRemoteConfig\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,139:1\n215#2,2:140\n215#2,2:142\n*S KotlinDebug\n*F\n+ 1 DTDRemoteConfig.kt\ncom/devtodev/analytics/external/abtest/DTDRemoteConfig\n*L\n123#1:140,2\n133#1:142,2\n*E\n"})
public final class DTDRemoteConfig {

    @NotNull
    public static final DTDRemoteConfig INSTANCE = new DTDRemoteConfig();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DTDRemoteConfigCollection f98007a = new DTDRemoteConfigCollection();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map f98008b = MapsKt.emptyMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f98009c = new Object();

    public static void a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            DTDRemoteConfigCollection dTDRemoteConfigCollection = f98007a;
            ((DTDRemoteConfigValue) dTDRemoteConfigCollection.get(entry.getKey())).setLocalSource$DTDAnalytics_androidRelease(DTDRemoteConfigSource.Remote);
            ((DTDRemoteConfigValue) dTDRemoteConfigCollection.get(entry.getKey())).setValue$DTDAnalytics_androidRelease(entry.getValue());
        }
        int i10 = 2 << 2;
        Logger.info$default(Logger.INSTANCE, "[A/B-Test Module] Remote parameters was applied", null, 2, null);
    }

    public static void b(Map map) {
        f98007a.reset$DTDAnalytics_androidRelease();
        for (Map.Entry entry : map.entrySet()) {
            f98007a.set$DTDAnalytics_androidRelease((String) entry.getKey(), new DTDRemoteConfigValue(entry.getValue(), DTDRemoteConfigSource.Defaults));
        }
        Logger.info$default(Logger.INSTANCE, "[A/B-Test Module] Default parameters was applied", null, 2, null);
    }

    public final void applyConfig() {
        Core core = Core.INSTANCE;
        core.getAbTestProxy().tryStartInvolvedExperiment();
        synchronized (f98009c) {
            try {
                Map<String, Object> config = core.getAbTestProxy().getConfig();
                if (config.isEmpty()) {
                    DTDRemoteConfig dTDRemoteConfig = INSTANCE;
                    Map map = f98008b;
                    dTDRemoteConfig.getClass();
                    b(map);
                } else {
                    INSTANCE.getClass();
                    a(config);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void cacheTestExperiment() {
        Core core = Core.INSTANCE;
        if (core.isInitialized()) {
            Logger.warning$default(Logger.INSTANCE, "[A/B-Test Module] CacheTestExperiment can't be called after SDK has been initialized", null, 2, null);
        } else {
            core.getAbTestInitialData().setCacheTestExperiment(true);
        }
    }

    @NotNull
    public final DTDRemoteConfigCollection getConfig() {
        DTDRemoteConfigCollection dTDRemoteConfigCollection;
        synchronized (f98009c) {
            try {
                dTDRemoteConfigCollection = f98007a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dTDRemoteConfigCollection;
    }

    @NotNull
    public final Map<String, Object> getDefaults() {
        Map<String, Object> map;
        synchronized (f98009c) {
            try {
                map = f98008b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    public final double getGroupDefinitionWaiting() {
        return Core.INSTANCE.getAbTestInitialData().getAbGroupWaiting();
    }

    public final double getRemoteConfigWaiting() {
        return Core.INSTANCE.getAbTestInitialData().getAbConfigWaiting();
    }

    public final void resetConfig() {
        Core.INSTANCE.getAbTestProxy().resetConfig();
        synchronized (f98009c) {
            try {
                DTDRemoteConfig dTDRemoteConfig = INSTANCE;
                Map map = f98008b;
                dTDRemoteConfig.getClass();
                b(map);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setDefaults(@NotNull Map<String, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        f98008b = MapsKt.toMap(value);
        synchronized (f98009c) {
            Core.INSTANCE.getAbTestDefaultParamsCache().setDefaults(f98008b);
            INSTANCE.getClass();
            b(value);
            Unit unit = Unit.f312394a;
        }
    }

    public final void setGroupDefinitionWaiting(double d10) {
        Core core = Core.INSTANCE;
        if (core.isInitialized()) {
            Logger.warning$default(Logger.INSTANCE, "[A/B-Test Module] RemoteConfigWaiting can't be changed after SDK has been initialized", null, 2, null);
            return;
        }
        Double dValidateWaitingValue$DTDAnalytics_androidRelease = ValidatorRules.INSTANCE.validateWaitingValue$DTDAnalytics_androidRelease("groupDefinitionWaiting", 0.1d, d10);
        if (dValidateWaitingValue$DTDAnalytics_androidRelease != null) {
            core.getAbTestInitialData().setAbGroupWaiting(dValidateWaitingValue$DTDAnalytics_androidRelease.doubleValue());
        }
    }

    public final void setRemoteConfigWaiting(double d10) {
        Core core = Core.INSTANCE;
        if (core.isInitialized()) {
            Logger.warning$default(Logger.INSTANCE, "[A/B-Test Module] RemoteConfigWaiting can't be changed after SDK has been initialized", null, 2, null);
            return;
        }
        Double dValidateWaitingValue$DTDAnalytics_androidRelease = ValidatorRules.INSTANCE.validateWaitingValue$DTDAnalytics_androidRelease("setRemoteConfigWaiting", 0.0d, d10);
        if (dValidateWaitingValue$DTDAnalytics_androidRelease != null) {
            core.getAbTestInitialData().setAbConfigWaiting(dValidateWaitingValue$DTDAnalytics_androidRelease.doubleValue());
        }
    }
}
