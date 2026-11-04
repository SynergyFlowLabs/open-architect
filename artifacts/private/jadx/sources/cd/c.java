package cd;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.os.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.planner5d.library.model.manager.statistics.events.h3;
import com.planner5d.library.model.manager.statistics.g0;
import com.planner5d.library.model.manager.statistics.j;
import com.planner5d.library.model.manager.statistics.m;
import ij.f;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@f
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f86900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f86901b;

    @ij.a
    public c(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f86900a = application;
        this.f86901b = application.getResources().getBoolean(b.d.f83168f);
    }

    private final FirebaseAnalytics.a l() {
        return this.f86901b ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED;
    }

    private final FirebaseAnalytics p() {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.f86900a);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
        return firebaseAnalytics;
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void a() {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void b(@NotNull g0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        p().i(String.valueOf(user.a()));
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void c(@Nullable Intent intent) {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void d(@Nullable h3 h3Var) {
        if (h3Var != null) {
            Bundle bundle = new Bundle();
            for (String str : h3Var.c().keySet()) {
                Object obj = h3Var.c().get(str);
                if (obj instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    bundle.putInt(str, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    bundle.putInt(str, (int) ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(str, ((Number) obj).doubleValue());
                } else if (obj instanceof Float) {
                    bundle.putDouble(str, ((Number) obj).floatValue());
                } else {
                    bundle.putString(str, obj != null ? obj.toString() : null);
                }
            }
            p().c(h3Var.b().n(), bundle);
        }
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void e(@Nullable Activity activity) {
        FirebaseAnalytics firebaseAnalyticsP = p();
        firebaseAnalyticsP.d();
        firebaseAnalyticsP.e(false);
        FirebaseAnalytics.b bVar = FirebaseAnalytics.b.ANALYTICS_STORAGE;
        FirebaseAnalytics.a aVar = FirebaseAnalytics.a.DENIED;
        firebaseAnalyticsP.f(MapsKt.mapOf(TuplesKt.to(bVar, aVar), TuplesKt.to(FirebaseAnalytics.b.AD_STORAGE, aVar), TuplesKt.to(FirebaseAnalytics.b.AD_USER_DATA, aVar), TuplesKt.to(FirebaseAnalytics.b.AD_PERSONALIZATION, aVar)));
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void f(@Nullable Activity activity) {
        FirebaseAnalytics firebaseAnalyticsP = p();
        firebaseAnalyticsP.e(this.f86901b);
        firebaseAnalyticsP.f(MapsKt.mapOf(TuplesKt.to(FirebaseAnalytics.b.ANALYTICS_STORAGE, l()), TuplesKt.to(FirebaseAnalytics.b.AD_STORAGE, l()), TuplesKt.to(FirebaseAnalytics.b.AD_USER_DATA, l()), TuplesKt.to(FirebaseAnalytics.b.AD_PERSONALIZATION, l())));
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void g(@Nullable Activity activity, @NotNull j purchase, @NotNull String paymentMethod, @NotNull String placement) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(placement, "placement");
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void h(@Nullable String str) {
        p().c(FirebaseAnalytics.c.A, e.b(TuplesKt.to(FirebaseAnalytics.d.f120670o0, str)));
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void i(@Nullable Activity activity) {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public boolean isEnabled() {
        return this.f86901b;
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void k(@Nullable Activity activity) {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void m() {
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Object n() {
        Result.a aVar = Result.Companion;
        return Result.m785constructorimpl(null);
    }
}
