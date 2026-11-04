package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@k8.a
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l f125070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0 f125071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f125072c;

    public q0(@NotNull l eventType, @NotNull x0 sessionData, @NotNull b applicationInfo) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.f125070a = eventType;
        this.f125071b = sessionData;
        this.f125072c = applicationInfo;
    }

    public static /* synthetic */ q0 e(q0 q0Var, l lVar, x0 x0Var, b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = q0Var.f125070a;
        }
        if ((i10 & 2) != 0) {
            x0Var = q0Var.f125071b;
        }
        if ((i10 & 4) != 0) {
            bVar = q0Var.f125072c;
        }
        return q0Var.d(lVar, x0Var, bVar);
    }

    @NotNull
    public final l a() {
        return this.f125070a;
    }

    @NotNull
    public final x0 b() {
        return this.f125071b;
    }

    @NotNull
    public final b c() {
        return this.f125072c;
    }

    @NotNull
    public final q0 d(@NotNull l eventType, @NotNull x0 sessionData, @NotNull b applicationInfo) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        return new q0(eventType, sessionData, applicationInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f125070a == q0Var.f125070a && Intrinsics.areEqual(this.f125071b, q0Var.f125071b) && Intrinsics.areEqual(this.f125072c, q0Var.f125072c);
    }

    @NotNull
    public final b f() {
        return this.f125072c;
    }

    @NotNull
    public final l g() {
        return this.f125070a;
    }

    @NotNull
    public final x0 h() {
        return this.f125071b;
    }

    public int hashCode() {
        return (((this.f125070a.hashCode() * 31) + this.f125071b.hashCode()) * 31) + this.f125072c.hashCode();
    }

    @NotNull
    public String toString() {
        return "SessionEvent(eventType=" + this.f125070a + ", sessionData=" + this.f125071b + ", applicationInfo=" + this.f125072c + ')';
    }
}
