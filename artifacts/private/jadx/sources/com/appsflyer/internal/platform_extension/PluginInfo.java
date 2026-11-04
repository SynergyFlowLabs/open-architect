package com.appsflyer.internal.platform_extension;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class PluginInfo {

    @NotNull
    private final Map<String, String> additionalParams;

    @NotNull
    private final Plugin plugin;

    @NotNull
    private final String version;

    @j
    public PluginInfo(@NotNull Plugin plugin, @NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.plugin = plugin;
        this.version = str;
        this.additionalParams = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PluginInfo copy$default(PluginInfo pluginInfo, Plugin plugin, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            plugin = pluginInfo.plugin;
        }
        if ((i10 & 2) != 0) {
            str = pluginInfo.version;
        }
        if ((i10 & 4) != 0) {
            map = pluginInfo.additionalParams;
        }
        return pluginInfo.copy(plugin, str, map);
    }

    @NotNull
    public final Plugin component1() {
        return this.plugin;
    }

    @NotNull
    public final String component2() {
        return this.version;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.additionalParams;
    }

    @NotNull
    public final PluginInfo copy(@NotNull Plugin plugin, @NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new PluginInfo(plugin, str, map);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginInfo)) {
            return false;
        }
        PluginInfo pluginInfo = (PluginInfo) obj;
        return this.plugin == pluginInfo.plugin && Intrinsics.areEqual(this.version, pluginInfo.version) && Intrinsics.areEqual(this.additionalParams, pluginInfo.additionalParams);
    }

    @i(name = "getAdditionalParams")
    @NotNull
    public final Map<String, String> getAdditionalParams() {
        return this.additionalParams;
    }

    @i(name = "getPlugin")
    @NotNull
    public final Plugin getPlugin() {
        return this.plugin;
    }

    @i(name = "getVersion")
    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public final int hashCode() {
        return (((this.plugin.hashCode() * 31) + this.version.hashCode()) * 31) + this.additionalParams.hashCode();
    }

    @NotNull
    public final String toString() {
        return "PluginInfo(plugin=" + this.plugin + ", version=" + this.version + ", additionalParams=" + this.additionalParams + ")";
    }

    public /* synthetic */ PluginInfo(Plugin plugin, String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(plugin, str, (i10 & 4) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public PluginInfo(@NotNull Plugin plugin, @NotNull String str) {
        this(plugin, str, null, 4, null);
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
    }
}
