package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WorkDatabase f77249a;

    public l(@NotNull WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.f77249a = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer d(l this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return Integer.valueOf(m.d(this$0.f77249a, m.f77252c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer f(l this$0, int i10, int i11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int iD = m.d(this$0.f77249a, m.f77251b);
        if (i10 > iD || iD > i11) {
            m.e(this$0.f77249a, m.f77251b, i10 + 1);
        } else {
            i10 = iD;
        }
        return Integer.valueOf(i10);
    }

    public final int c() {
        Object objRunInTransaction = this.f77249a.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.utils.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return l.d(this.f77245a);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objRunInTransaction, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) objRunInTransaction).intValue();
    }

    public final int e(final int i10, final int i11) {
        Object objRunInTransaction = this.f77249a.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.utils.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return l.f(this.f77246a, i10, i11);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objRunInTransaction, "workDatabase.runInTransa…            id\n        })");
        return ((Number) objRunInTransaction).intValue();
    }
}
