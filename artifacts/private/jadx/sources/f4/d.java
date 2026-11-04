package f4;

import androidx.work.u;
import androidx.work.v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f274936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f274937b = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";

    static {
        String strI = v.i("ConstraintTrkngWrkr");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        f274936a = strI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(androidx.work.impl.utils.futures.c<u.a> cVar) {
        return cVar.p(u.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(androidx.work.impl.utils.futures.c<u.a> cVar) {
        return cVar.p(u.a.d());
    }
}
