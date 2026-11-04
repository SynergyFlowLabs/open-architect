package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.backend.Identifiers;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfigService$getBackendIdentifiers$2$1 extends l0 implements Function0<Unit> {
    final /* synthetic */ String $applicationKey;
    final /* synthetic */ Identifiers $identifiers;
    final /* synthetic */ long $lastRequestIdKey;
    final /* synthetic */ long $nextAttempt;
    final /* synthetic */ ConfigService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigService$getBackendIdentifiers$2$1(ConfigService configService, long j10, String str, Identifiers identifiers, long j11) {
        super(0);
        this.this$0 = configService;
        this.$nextAttempt = j10;
        this.$applicationKey = str;
        this.$identifiers = identifiers;
        this.$lastRequestIdKey = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f312394a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getBackendIdentifiers(this.$nextAttempt, this.$applicationKey, this.$identifiers, this.$lastRequestIdKey);
    }
}
