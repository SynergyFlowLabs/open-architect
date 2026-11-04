package b8;

import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static final void a(@NonNull FirebaseAnalytics analytics, @NonNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (com.google.firebase.analytics.a.c()) {
            FirebaseAnalytics firebaseAnalyticsA = com.google.firebase.analytics.a.a();
            com.google.firebase.analytics.a.e(analytics);
            try {
                block.invoke();
                com.google.firebase.analytics.a.e(firebaseAnalyticsA);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                com.google.firebase.analytics.a.e(firebaseAnalyticsA);
                throw th2;
            }
        }
    }
}
