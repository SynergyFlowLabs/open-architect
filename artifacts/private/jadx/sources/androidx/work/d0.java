package androidx.work;

import androidx.annotation.w0;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends o0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final b f76532h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e.a({"MinMaxConstant"})
    public static final long f76533i = 900000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e.a({"MinMaxConstant"})
    public static final long f76534j = 300000;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(@NotNull a builder) {
        super(builder.e(), builder.h(), builder.f());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    @SourceDebugExtension({"SMAP\nPeriodicWorkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeriodicWorkRequest.kt\nandroidx/work/PeriodicWorkRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,324:1\n1#2:325\n*E\n"})
    public static final class a extends o0.a<a, d0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Class<? extends u> workerClass, long j10, @NotNull TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            h().O(repeatIntervalTimeUnit.toMillis(j10));
        }

        @Override // androidx.work.o0.a
        @NotNull
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public d0 c() {
            if (d() && h().f76992j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (h().f76999q) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new d0(this);
        }

        @NotNull
        public final a B() {
            h().L(Long.MAX_VALUE);
            h().M(1);
            return this;
        }

        @Override // androidx.work.o0.a
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }

        @NotNull
        public final a D(long j10) {
            if (j10 == Long.MAX_VALUE) {
                throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time");
            }
            h().L(j10);
            int i10 = 3 ^ 1;
            h().M(1);
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @w0(26)
        public a(@NotNull Class<? extends u> workerClass, @NotNull Duration repeatInterval) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatInterval, "repeatInterval");
            h().O(androidx.work.impl.utils.c.a(repeatInterval));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Class<? extends u> workerClass, long j10, @NotNull TimeUnit repeatIntervalTimeUnit, long j11, @NotNull TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            Intrinsics.checkNotNullParameter(flexIntervalTimeUnit, "flexIntervalTimeUnit");
            h().P(repeatIntervalTimeUnit.toMillis(j10), flexIntervalTimeUnit.toMillis(j11));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @w0(26)
        public a(@NotNull Class<? extends u> workerClass, @NotNull Duration repeatInterval, @NotNull Duration flexInterval) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatInterval, "repeatInterval");
            Intrinsics.checkNotNullParameter(flexInterval, "flexInterval");
            h().P(androidx.work.impl.utils.c.a(repeatInterval), androidx.work.impl.utils.c.a(flexInterval));
        }
    }
}
