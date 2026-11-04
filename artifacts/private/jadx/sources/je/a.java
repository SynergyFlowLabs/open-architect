package je;

import android.app.Application;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.d;
import androidx.media3.common.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f307427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f307428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Application f307429c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f307427a = callback;
        this.f307428b = new Object();
    }

    private final String b(Context context) {
        return context.getApplicationContext().getPackageName() + "/" + a.class.getName() + "_ACTION";
    }

    private final ComponentName c(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 33) {
            if (bundle != null) {
                return (ComponentName) bundle.getParcelable("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class);
            }
            return null;
        }
        if (bundle != null) {
            return (ComponentName) bundle.getParcelable("android.intent.extra.CHOSEN_COMPONENT");
        }
        return null;
    }

    private final void d(Context context) {
        synchronized (this.f307428b) {
            try {
                e();
                Context applicationContext = context.getApplicationContext();
                d.w(applicationContext, this, new IntentFilter(b(context)), 4);
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                this.f307429c = (Application) applicationContext;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void e() {
        synchronized (this.f307428b) {
            try {
                Application application = this.f307429c;
                if (application != null) {
                    application.unregisterReceiver(this);
                }
                this.f307429c = null;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final IntentSender a(@NotNull Context activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent(b(activity));
        intent.setPackage(activity.getPackageName());
        d(activity);
        Unit unit = Unit.f312394a;
        IntentSender intentSender = PendingIntent.getBroadcast(activity, 6, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : j.W0).getIntentSender();
        Intrinsics.checkNotNullExpressionValue(intentSender, "getIntentSender(...)");
        return intentSender;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        e();
        ComponentName componentNameC = c(intent != null ? intent.getExtras() : null);
        if (componentNameC != null) {
            Function1<String, Unit> function1 = this.f307427a;
            String string = componentNameC.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            function1.invoke(string);
        }
    }
}
