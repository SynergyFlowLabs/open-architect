package com.planner5d.library.activity.fragment.dialog.premiumfeature;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import com.planner5d.library.model.manager.statistics.events.l2;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class b extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f132233a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f132234b = 0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @NotNull
        public final Bundle a(@NotNull y3.c source, @Nullable String str) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new i().j(r.catalogItemId, str).t(r.source, source).a();
        }

        private a() {
        }
    }

    @ij.a
    public b() {
    }

    @n
    @NotNull
    public static final Bundle U(@NotNull y3.c cVar, @Nullable String str) {
        return f132233a.a(cVar, str);
    }

    public final void V(@NotNull y3.c source) {
        Intrinsics.checkNotNullParameter(source, "source");
        l2.f217094b.f(source);
    }
}
