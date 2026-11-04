package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.lifecycle.w0;
import com.google.common.util.concurrent.t1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 {
    @NonNull
    public static k0 a(@NonNull List<k0> continuations) {
        return continuations.get(0).b(continuations);
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    protected abstract k0 b(@NonNull List<k0> continuations);

    @NonNull
    public abstract a0 c();

    @NonNull
    public abstract t1<List<l0>> d();

    @NonNull
    public abstract w0<List<l0>> e();

    @NonNull
    public final k0 f(@NonNull y work) {
        return g(Collections.singletonList(work));
    }

    @NonNull
    public abstract k0 g(@NonNull List<y> work);
}
