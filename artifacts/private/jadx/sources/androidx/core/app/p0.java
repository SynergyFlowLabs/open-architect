package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 implements Iterable<Intent> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f47157c = "TaskStackBuilder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Intent> f47158a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f47159b;

    public interface a {
        @androidx.annotation.p0
        Intent getSupportParentActivityIntent();
    }

    private p0(Context context) {
        this.f47159b = context;
    }

    @NonNull
    public static p0 m(@NonNull Context context) {
        return new p0(context);
    }

    @Deprecated
    public static p0 p(Context context) {
        return m(context);
    }

    public void A(@androidx.annotation.p0 Bundle bundle) {
        if (this.f47158a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f47158a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (!androidx.core.content.d.z(this.f47159b, intentArr, bundle)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f47159b.startActivity(intent);
        }
    }

    @NonNull
    public p0 c(@NonNull Intent intent) {
        this.f47158a.add(intent);
        return this;
    }

    @NonNull
    public p0 d(@NonNull Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f47159b.getPackageManager());
        }
        if (component != null) {
            k(component);
        }
        c(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public p0 i(@NonNull Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = s.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f47159b.getPackageManager());
            }
            k(component);
            c(supportParentActivityIntent);
        }
        return this;
    }

    @Override // java.lang.Iterable
    @NonNull
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f47158a.iterator();
    }

    @NonNull
    public p0 k(@NonNull ComponentName componentName) {
        int size = this.f47158a.size();
        try {
            Intent intentB = s.b(this.f47159b, componentName);
            while (intentB != null) {
                this.f47158a.add(size, intentB);
                intentB = s.b(this.f47159b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @NonNull
    public p0 l(@NonNull Class<?> cls) {
        return k(new ComponentName(this.f47159b, cls));
    }

    @androidx.annotation.p0
    public Intent n(int i10) {
        return this.f47158a.get(i10);
    }

    @Deprecated
    public Intent r(int i10) {
        return n(i10);
    }

    public int s() {
        return this.f47158a.size();
    }

    @NonNull
    public Intent[] t() {
        int size = this.f47158a.size();
        Intent[] intentArr = new Intent[size];
        if (size != 0) {
            intentArr[0] = new Intent(this.f47158a.get(0)).addFlags(268484608);
            for (int i10 = 1; i10 < size; i10++) {
                intentArr[i10] = new Intent(this.f47158a.get(i10));
            }
        }
        return intentArr;
    }

    @androidx.annotation.p0
    public PendingIntent u(int i10, int i11) {
        return v(i10, i11, null);
    }

    @androidx.annotation.p0
    public PendingIntent v(int i10, int i11, @androidx.annotation.p0 Bundle bundle) {
        if (this.f47158a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        boolean z10 = false & false;
        Intent[] intentArr = (Intent[]) this.f47158a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.f47159b, i10, intentArr, i11, bundle);
    }

    public void w() {
        A(null);
    }
}
