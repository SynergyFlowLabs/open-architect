package com.superwall.sdk.config;

import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.config.ConfigManager", f = "ConfigManager.kt", i = {0, 0, 0}, l = {408, 411}, m = "refreshConfiguration$superwall_release", n = {"this", "retryCount", "startTime"}, s = {"L$0", "L$1", "J$0"})
final class ConfigManager$refreshConfiguration$1 extends kotlin.coroutines.jvm.internal.d {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigManager$refreshConfiguration$1(ConfigManager configManager, kotlin.coroutines.d<? super ConfigManager$refreshConfiguration$1> dVar) {
        super(dVar);
        this.this$0 = configManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.refreshConfiguration$superwall_release(this);
    }
}
