package androidx.work;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<UUID> f77413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f77414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f77415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<l0.c> f77416d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<UUID> f77417a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<String> f77418b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<String> f77419c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        List<l0.c> f77420d = new ArrayList();

        private a() {
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public static a f(@NonNull List<UUID> ids) {
            a aVar = new a();
            aVar.a(ids);
            return aVar;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public static a g(@NonNull List<l0.c> states) {
            a aVar = new a();
            aVar.b(states);
            return aVar;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public static a h(@NonNull List<String> tags) {
            a aVar = new a();
            aVar.c(tags);
            return aVar;
        }

        @NonNull
        @e.a({"BuilderSetStyle"})
        public static a i(@NonNull List<String> uniqueWorkNames) {
            a aVar = new a();
            aVar.d(uniqueWorkNames);
            return aVar;
        }

        @NonNull
        public a a(@NonNull List<UUID> ids) {
            this.f77417a.addAll(ids);
            return this;
        }

        @NonNull
        public a b(@NonNull List<l0.c> states) {
            this.f77420d.addAll(states);
            return this;
        }

        @NonNull
        public a c(@NonNull List<String> tags) {
            this.f77419c.addAll(tags);
            return this;
        }

        @NonNull
        public a d(@NonNull List<String> uniqueWorkNames) {
            this.f77418b.addAll(uniqueWorkNames);
            return this;
        }

        @NonNull
        public n0 e() {
            if (this.f77417a.isEmpty() && this.f77418b.isEmpty() && this.f77419c.isEmpty() && this.f77420d.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new n0(this);
        }
    }

    n0(@NonNull a builder) {
        this.f77413a = builder.f77417a;
        this.f77414b = builder.f77418b;
        this.f77415c = builder.f77419c;
        this.f77416d = builder.f77420d;
    }

    @NonNull
    public static n0 a(@NonNull List<UUID> ids) {
        return a.f(ids).e();
    }

    @NonNull
    public static n0 b(@NonNull UUID... ids) {
        return a(Arrays.asList(ids));
    }

    @NonNull
    public static n0 c(@NonNull List<l0.c> states) {
        return a.g(states).e();
    }

    @NonNull
    public static n0 d(@NonNull l0.c... states) {
        return a.g(Arrays.asList(states)).e();
    }

    @NonNull
    public static n0 e(@NonNull List<String> tags) {
        return a.h(tags).e();
    }

    @NonNull
    public static n0 f(@NonNull String... tags) {
        return e(Arrays.asList(tags));
    }

    @NonNull
    public static n0 g(@NonNull List<String> uniqueWorkNames) {
        return a.i(uniqueWorkNames).e();
    }

    @NonNull
    public static n0 h(@NonNull String... uniqueWorkNames) {
        return a.i(Arrays.asList(uniqueWorkNames)).e();
    }

    @NonNull
    public List<UUID> i() {
        return this.f77413a;
    }

    @NonNull
    public List<l0.c> j() {
        return this.f77416d;
    }

    @NonNull
    public List<String> k() {
        return this.f77415c;
    }

    @NonNull
    public List<String> l() {
        return this.f77414b;
    }
}
