package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.p;
import com.facebook.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final p<?> f101820a;

    public e(@Nullable p<?> pVar) {
        this.f101820a = pVar;
    }

    public void a(@NotNull com.facebook.internal.b appCall) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        p<?> pVar = this.f101820a;
        if (pVar == null) {
            return;
        }
        pVar.onCancel();
    }

    public void b(@NotNull com.facebook.internal.b appCall, @NotNull u error) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(error, "error");
        p<?> pVar = this.f101820a;
        if (pVar == null) {
            return;
        }
        pVar.a(error);
    }

    public abstract void c(@NotNull com.facebook.internal.b bVar, @Nullable Bundle bundle);
}
