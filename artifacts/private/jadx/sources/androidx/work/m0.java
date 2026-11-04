package androidx.work;

import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.lifecycle.w0;
import androidx.work.impl.r0;
import com.google.common.util.concurrent.t1;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"AddedAbstractMethod"})
public abstract class m0 {

    public enum a {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN;

        static {
            int i10 = 7 ^ 2;
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    protected m0() {
    }

    public static void F(@NonNull Context context, @NonNull c configuration) {
        r0.F(context, configuration);
    }

    public static boolean G() {
        return r0.G();
    }

    @NonNull
    @Deprecated
    public static m0 p() {
        r0 r0VarL = r0.L();
        if (r0VarL != null) {
            return r0VarL;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    @NonNull
    public static m0 q(@NonNull Context context) {
        return r0.M(context);
    }

    @NonNull
    public abstract kotlinx.coroutines.flow.i<List<l0>> A(@NonNull n0 workQuery);

    @NonNull
    public abstract t1<List<l0>> B(@NonNull String uniqueWorkName);

    @NonNull
    public abstract kotlinx.coroutines.flow.i<List<l0>> C(@NonNull String uniqueWorkName);

    @NonNull
    public abstract w0<List<l0>> D(@NonNull String uniqueWorkName);

    @NonNull
    public abstract w0<List<l0>> E(@NonNull n0 workQuery);

    @NonNull
    public abstract a0 H();

    @NonNull
    public abstract t1<a> I(@NonNull o0 request);

    @NonNull
    public final k0 a(@NonNull String uniqueWorkName, @NonNull m existingWorkPolicy, @NonNull y work) {
        return b(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @NonNull
    public abstract k0 b(@NonNull String uniqueWorkName, @NonNull m existingWorkPolicy, @NonNull List<y> work);

    @NonNull
    public final k0 c(@NonNull y work) {
        return d(Collections.singletonList(work));
    }

    @NonNull
    public abstract k0 d(@NonNull List<y> work);

    @NonNull
    public abstract a0 e();

    @NonNull
    public abstract a0 f(@NonNull String tag);

    @NonNull
    public abstract a0 g(@NonNull String uniqueWorkName);

    @NonNull
    public abstract a0 h(@NonNull UUID id2);

    @NonNull
    public abstract PendingIntent i(@NonNull UUID id2);

    @NonNull
    public final a0 j(@NonNull o0 workRequest) {
        return k(Collections.singletonList(workRequest));
    }

    @NonNull
    public abstract a0 k(@NonNull List<? extends o0> requests);

    @NonNull
    public abstract a0 l(@NonNull String uniqueWorkName, @NonNull l existingPeriodicWorkPolicy, @NonNull d0 periodicWork);

    @NonNull
    public a0 m(@NonNull String uniqueWorkName, @NonNull m existingWorkPolicy, @NonNull y work) {
        return n(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @NonNull
    public abstract a0 n(@NonNull String uniqueWorkName, @NonNull m existingWorkPolicy, @NonNull List<y> work);

    @NonNull
    public abstract c o();

    @NonNull
    public abstract t1<Long> r();

    @NonNull
    public abstract w0<Long> s();

    @NonNull
    public abstract t1<l0> t(@NonNull UUID id2);

    @NonNull
    public abstract kotlinx.coroutines.flow.i<l0> u(@NonNull UUID id2);

    @NonNull
    public abstract w0<l0> v(@NonNull UUID id2);

    @NonNull
    public abstract t1<List<l0>> w(@NonNull n0 workQuery);

    @NonNull
    public abstract t1<List<l0>> x(@NonNull String tag);

    @NonNull
    public abstract kotlinx.coroutines.flow.i<List<l0>> y(@NonNull String tag);

    @NonNull
    public abstract w0<List<l0>> z(@NonNull String tag);
}
