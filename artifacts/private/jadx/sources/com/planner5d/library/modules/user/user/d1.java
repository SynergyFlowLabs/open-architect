package com.planner5d.library.modules.user.user;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.planner5d.library.services.utility.c2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class d1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f223000e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f223001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c2 f223002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f223003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f223004d;

    public d1(@NotNull y0 userRemember, @NotNull c2 networkStateUtility) {
        Intrinsics.checkNotNullParameter(userRemember, "userRemember");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        this.f223001a = userRemember;
        this.f223002b = networkStateUtility;
        this.f223003c = new Object();
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this.f223003c) {
            try {
                if (!this.f223004d) {
                    com.planner5d.library.services.network.b.f224451h.a(context, this);
                    this.f223004d = true;
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this.f223003c) {
            try {
                if (this.f223004d) {
                    context.unregisterReceiver(this);
                    this.f223004d = false;
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (this.f223002b.d(context)) {
            b(context);
            this.f223001a.n();
        }
    }
}
