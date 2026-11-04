package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.login.CustomTabLoginMethodHandler;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f100022c = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Uri a(@NotNull String action, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.areEqual(action, CustomTabLoginMethodHandler.X)) {
                e1 e1Var = e1.f99794a;
                z0 z0Var = z0.f100267a;
                return e1.g(z0.k(), z0.f100268a0, bundle);
            }
            e1 e1Var2 = e1.f99794a;
            z0 z0Var2 = z0.f100267a;
            String strK = z0.k();
            StringBuilder sb2 = new StringBuilder();
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            sb2.append(com.facebook.g0.B());
            sb2.append("/dialog/");
            sb2.append(action);
            return e1.g(strK, sb2.toString(), bundle);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(@NotNull String action, @Nullable Bundle bundle) {
        super(action, bundle);
        Intrinsics.checkNotNullParameter(action, "action");
        d(f100022c.a(action, bundle == null ? new Bundle() : bundle));
    }
}
