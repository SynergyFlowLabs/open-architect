package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.work.d0;
import androidx.work.h;
import androidx.work.impl.r0;
import androidx.work.k0;
import androidx.work.l;
import androidx.work.l0;
import androidx.work.m;
import androidx.work.n;
import androidx.work.n0;
import androidx.work.o0;
import androidx.work.y;
import com.google.common.util.concurrent.t1;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    @b1({b1.a.LIBRARY_GROUP})
    protected e() {
    }

    @NonNull
    public static e o(@NonNull Context context) {
        e eVarP = r0.M(context).P();
        if (eVarP != null) {
            return eVarP;
        }
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }

    @NonNull
    public final d a(@NonNull String uniqueWorkName, @NonNull m existingWorkPolicy, @NonNull y work) {
        return b(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @NonNull
    public abstract d b(@NonNull String uniqueWorkName, @NonNull m existingWorkPolicy, @NonNull List<y> work);

    @NonNull
    public final d c(@NonNull y work) {
        return d(Collections.singletonList(work));
    }

    @NonNull
    public abstract d d(@NonNull List<y> work);

    @NonNull
    public abstract t1<Void> e();

    @NonNull
    public abstract t1<Void> f(@NonNull String tag);

    @NonNull
    public abstract t1<Void> g(@NonNull String uniqueWorkName);

    @NonNull
    public abstract t1<Void> h(@NonNull UUID id2);

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public abstract t1<Void> i(@NonNull k0 continuation);

    @NonNull
    public abstract t1<Void> j(@NonNull o0 request);

    @NonNull
    public abstract t1<Void> k(@NonNull List<o0> requests);

    @NonNull
    public abstract t1<Void> l(@NonNull String uniqueWorkName, @NonNull l existingPeriodicWorkPolicy, @NonNull d0 periodicWork);

    @NonNull
    public final t1<Void> m(@NonNull String uniqueWorkName, @NonNull m existingWorkPolicy, @NonNull y work) {
        return n(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @NonNull
    public abstract t1<Void> n(@NonNull String uniqueWorkName, @NonNull m existingWorkPolicy, @NonNull List<y> work);

    @NonNull
    public abstract t1<List<l0>> p(@NonNull n0 workQuery);

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public abstract t1<Void> q(@NonNull String id2, @NonNull n foregroundInfo);

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public abstract t1<Void> r(@NonNull UUID id2, @NonNull h data);
}
