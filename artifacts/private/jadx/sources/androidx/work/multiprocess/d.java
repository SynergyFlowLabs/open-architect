package androidx.work.multiprocess;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.work.y;
import com.google.common.util.concurrent.t1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    @b1({b1.a.LIBRARY_GROUP})
    protected d() {
    }

    @NonNull
    public static d a(@NonNull List<d> continuations) {
        return continuations.get(0).b(continuations);
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    protected abstract d b(@NonNull List<d> continuations);

    @NonNull
    public abstract t1<Void> c();

    @NonNull
    public final d d(@NonNull y work) {
        return e(Collections.singletonList(work));
    }

    @NonNull
    public abstract d e(@NonNull List<y> work);
}
