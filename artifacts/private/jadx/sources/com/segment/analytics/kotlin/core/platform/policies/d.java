package com.segment.analytics.kotlin.core.platform.policies;

import com.segment.analytics.kotlin.core.BaseEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f266936a;

    @Override // com.segment.analytics.kotlin.core.platform.policies.b
    public boolean a() {
        if (this.f266936a) {
            return false;
        }
        this.f266936a = true;
        return true;
    }

    @Override // com.segment.analytics.kotlin.core.platform.policies.b
    public void b(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        b.a.b(this, aVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.policies.b
    public void c(@NotNull BaseEvent baseEvent) {
        b.a.d(this, baseEvent);
    }

    @Override // com.segment.analytics.kotlin.core.platform.policies.b
    public void d() {
        b.a.c(this);
    }

    @Override // com.segment.analytics.kotlin.core.platform.policies.b
    public void reset() {
        b.a.a(this);
    }
}
