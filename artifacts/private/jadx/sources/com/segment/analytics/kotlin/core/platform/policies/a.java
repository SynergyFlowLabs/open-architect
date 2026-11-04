package com.segment.analytics.kotlin.core.platform.policies;

import com.segment.analytics.kotlin.core.BaseEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f266927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f266928b;

    public a() {
        this(0, 1, null);
    }

    @Override // com.segment.analytics.kotlin.core.platform.policies.b
    public boolean a() {
        return this.f266928b >= this.f266927a;
    }

    @Override // com.segment.analytics.kotlin.core.platform.policies.b
    public void b(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        b.a.b(this, aVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.policies.b
    public void c(@NotNull BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f266928b++;
    }

    @Override // com.segment.analytics.kotlin.core.platform.policies.b
    public void d() {
        b.a.c(this);
    }

    public final int e() {
        return this.f266927a;
    }

    public final void f(int i10) {
        this.f266927a = i10;
    }

    @Override // com.segment.analytics.kotlin.core.platform.policies.b
    public void reset() {
        this.f266928b = 0;
    }

    public a(int i10) {
        this.f266927a = i10;
        this.f266927a = i10 < 1 ? 20 : i10;
    }

    public /* synthetic */ a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 20 : i10);
    }
}
