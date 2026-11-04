package io.ktor.utils.io;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f {
    public static final void b(@NotNull b bVar, @NotNull x job) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(job, "job");
        c(bVar, job.a());
    }

    public static final void c(@NotNull final b bVar, @NotNull p2 job) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(job, "job");
        job.E(new Function1() { // from class: io.ktor.utils.io.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.d(bVar, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(b bVar, Throwable th2) {
        if (th2 != null) {
            bVar.c(th2);
        }
        return Unit.f312394a;
    }
}
