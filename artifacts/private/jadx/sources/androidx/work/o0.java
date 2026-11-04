package androidx.work;

import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.w0;
import java.time.Duration;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f77421d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f77422e = 30000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e.a({"MinMaxConstant"})
    public static final long f77423f = 18000000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e.a({"MinMaxConstant"})
    public static final long f77424g = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final UUID f77425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.work.impl.model.v f77426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<String> f77427c;

    @SourceDebugExtension({"SMAP\nWorkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkRequest.kt\nandroidx/work/WorkRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,356:1\n1#2:357\n*E\n"})
    public static abstract class a<B extends a<B, ?>, W extends o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Class<? extends u> f77428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f77429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private UUID f77430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private androidx.work.impl.model.v f77431d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final Set<String> f77432e;

        public a(@NotNull Class<? extends u> workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            this.f77428a = workerClass;
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
            this.f77430c = uuidRandomUUID;
            String string = this.f77430c.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            String name = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
            this.f77431d = new androidx.work.impl.model.v(string, name);
            String name2 = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "workerClass.name");
            this.f77432e = SetsKt.mutableSetOf(name2);
        }

        @NotNull
        public final B a(@NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f77432e.add(tag);
            return (B) g();
        }

        @NotNull
        public final W b() {
            W w10 = (W) c();
            e eVar = this.f77431d.f76992j;
            boolean z10 = eVar.e() || eVar.f() || eVar.g() || eVar.h();
            androidx.work.impl.model.v vVar = this.f77431d;
            if (vVar.f76999q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (vVar.f76989g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
            q(uuidRandomUUID);
            return w10;
        }

        @NotNull
        public abstract W c();

        public final boolean d() {
            return this.f77429b;
        }

        @NotNull
        public final UUID e() {
            return this.f77430c;
        }

        @NotNull
        public final Set<String> f() {
            return this.f77432e;
        }

        @NotNull
        public abstract B g();

        @NotNull
        public final androidx.work.impl.model.v h() {
            return this.f77431d;
        }

        @NotNull
        public final Class<? extends u> i() {
            return this.f77428a;
        }

        @NotNull
        public final B j(long j10, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f77431d.f76997o = timeUnit.toMillis(j10);
            return (B) g();
        }

        @w0(26)
        @NotNull
        public final B k(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f77431d.f76997o = androidx.work.impl.utils.c.a(duration);
            return (B) g();
        }

        @NotNull
        public final B l(@NotNull androidx.work.a backoffPolicy, long j10, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f77429b = true;
            androidx.work.impl.model.v vVar = this.f77431d;
            vVar.f76994l = backoffPolicy;
            vVar.K(timeUnit.toMillis(j10));
            return (B) g();
        }

        @w0(26)
        @NotNull
        public final B m(@NotNull androidx.work.a backoffPolicy, @NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f77429b = true;
            androidx.work.impl.model.v vVar = this.f77431d;
            vVar.f76994l = backoffPolicy;
            vVar.K(androidx.work.impl.utils.c.a(duration));
            return (B) g();
        }

        public final void n(boolean z10) {
            this.f77429b = z10;
        }

        @NotNull
        public final B o(@NotNull e constraints) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.f77431d.f76992j = constraints;
            return (B) g();
        }

        @e.a({"MissingGetterMatchingBuilder"})
        @NotNull
        public B p(@NotNull c0 policy) {
            Intrinsics.checkNotNullParameter(policy, "policy");
            androidx.work.impl.model.v vVar = this.f77431d;
            vVar.f76999q = true;
            vVar.f77000r = policy;
            return (B) g();
        }

        @NotNull
        public final B q(@NotNull UUID id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f77430c = id2;
            String string = id2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            this.f77431d = new androidx.work.impl.model.v(string, this.f77431d);
            return (B) g();
        }

        public final void r(@NotNull UUID uuid) {
            Intrinsics.checkNotNullParameter(uuid, "<set-?>");
            this.f77430c = uuid;
        }

        @NotNull
        public B s(long j10, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f77431d.f76989g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f77431d.f76989g) {
                return (B) g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @w0(26)
        @NotNull
        public B t(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f77431d.f76989g = androidx.work.impl.utils.c.a(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f77431d.f76989g) {
                return (B) g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @l1
        @b1({b1.a.LIBRARY_GROUP})
        @NotNull
        public final B u(int i10) {
            this.f77431d.f76993k = i10;
            return (B) g();
        }

        @l1
        @b1({b1.a.LIBRARY_GROUP})
        @NotNull
        public final B v(@NotNull l0.c state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f77431d.f76984b = state;
            return (B) g();
        }

        @NotNull
        public final B w(@NotNull h inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f77431d.f76987e = inputData;
            return (B) g();
        }

        @l1
        @b1({b1.a.LIBRARY_GROUP})
        @NotNull
        public final B x(long j10, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f77431d.f76996n = timeUnit.toMillis(j10);
            return (B) g();
        }

        @l1
        @b1({b1.a.LIBRARY_GROUP})
        @NotNull
        public final B y(long j10, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f77431d.f76998p = timeUnit.toMillis(j10);
            return (B) g();
        }

        public final void z(@NotNull androidx.work.impl.model.v vVar) {
            Intrinsics.checkNotNullParameter(vVar, "<set-?>");
            this.f77431d = vVar;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public o0(@NotNull UUID id2, @NotNull androidx.work.impl.model.v workSpec, @NotNull Set<String> tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f77425a = id2;
        this.f77426b = workSpec;
        this.f77427c = tags;
    }

    @NotNull
    public UUID a() {
        return this.f77425a;
    }

    @b1({b1.a.LIBRARY_GROUP})
    @NotNull
    public final String b() {
        String string = a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
        return string;
    }

    @b1({b1.a.LIBRARY_GROUP})
    @NotNull
    public final Set<String> c() {
        return this.f77427c;
    }

    @b1({b1.a.LIBRARY_GROUP})
    @NotNull
    public final androidx.work.impl.model.v d() {
        return this.f77426b;
    }
}
