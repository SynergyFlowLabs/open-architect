package androidx.window.embedding;

import android.app.Activity;
import androidx.annotation.b0;
import androidx.annotation.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.window.core.d
public final class p implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private static volatile p f76314f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f76316h = "EmbeddingBackend";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b0("globalLock")
    @l1
    @Nullable
    private l f76317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<c> f76318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f76319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArraySet<m> f76320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f76313e = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final ReentrantLock f76315g = new ReentrantLock();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final l b() {
            k kVar = null;
            try {
                k.a aVar = k.f76306c;
                if (c(aVar.b()) && aVar.c()) {
                    kVar = new k();
                }
            } catch (Throwable th2) {
                Intrinsics.stringPlus("Failed to load embedding extension: ", th2);
            }
            return kVar;
        }

        @NotNull
        public final p a() {
            if (p.f76314f == null) {
                ReentrantLock reentrantLock = p.f76315g;
                reentrantLock.lock();
                try {
                    if (p.f76314f == null) {
                        p.f76314f = new p(p.f76313e.b());
                    }
                    Unit unit = Unit.f312394a;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            p pVar = p.f76314f;
            Intrinsics.checkNotNull(pVar);
            return pVar;
        }

        @l1
        public final boolean c(@Nullable Integer num) {
            return num != null && num.intValue() >= 1;
        }

        private a() {
        }
    }

    public final class b implements l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private List<t> f76321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f76322b;

        public b(p this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f76322b = this$0;
        }

        @Override // androidx.window.embedding.l.a
        public void a(@NotNull List<t> splitInfo) {
            Intrinsics.checkNotNullParameter(splitInfo, "splitInfo");
            this.f76321a = splitInfo;
            Iterator<c> it = this.f76322b.l().iterator();
            while (it.hasNext()) {
                it.next().b(splitInfo);
            }
        }

        @Nullable
        public final List<t> b() {
            return this.f76321a;
        }

        public final void c(@Nullable List<t> list) {
            this.f76321a = list;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Activity f76323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Executor f76324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final androidx.core.util.e<List<t>> f76325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private List<t> f76326d;

        public c(@NotNull Activity activity, @NotNull Executor executor, @NotNull androidx.core.util.e<List<t>> callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f76323a = activity;
            this.f76324b = executor;
            this.f76325c = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c this$0, List splitsWithActivity) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(splitsWithActivity, "$splitsWithActivity");
            this$0.f76325c.accept(splitsWithActivity);
        }

        public final void b(@NotNull List<t> splitInfoList) {
            Intrinsics.checkNotNullParameter(splitInfoList, "splitInfoList");
            final ArrayList arrayList = new ArrayList();
            for (Object obj : splitInfoList) {
                if (((t) obj).a(this.f76323a)) {
                    arrayList.add(obj);
                }
            }
            if (Intrinsics.areEqual(arrayList, this.f76326d)) {
                return;
            }
            this.f76326d = arrayList;
            this.f76324b.execute(new Runnable() { // from class: androidx.window.embedding.q
                @Override // java.lang.Runnable
                public final void run() {
                    p.c.c(this.f76327a, arrayList);
                }
            });
        }

        @NotNull
        public final androidx.core.util.e<List<t>> d() {
            return this.f76325c;
        }
    }

    @l1
    public p(@Nullable l lVar) {
        this.f76317a = lVar;
        b bVar = new b(this);
        this.f76319c = bVar;
        this.f76318b = new CopyOnWriteArrayList<>();
        l lVar2 = this.f76317a;
        if (lVar2 != null) {
            lVar2.b(bVar);
        }
        this.f76320d = new CopyOnWriteArraySet<>();
    }

    @l1
    public static /* synthetic */ void m() {
    }

    @Override // androidx.window.embedding.j
    public void a(@NotNull Set<? extends m> rules) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.f76320d.clear();
        this.f76320d.addAll(rules);
        l lVar = this.f76317a;
        if (lVar == null) {
            return;
        }
        lVar.a(this.f76320d);
    }

    @Override // androidx.window.embedding.j
    @NotNull
    public Set<m> b() {
        return this.f76320d;
    }

    @Override // androidx.window.embedding.j
    public void c(@NotNull Activity activity, @NotNull Executor executor, @NotNull androidx.core.util.e<List<t>> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = f76315g;
        reentrantLock.lock();
        try {
            if (k() == null) {
                callback.accept(CollectionsKt.emptyList());
                return;
            }
            c cVar = new c(activity, executor, callback);
            l().add(cVar);
            if (this.f76319c.b() != null) {
                List<t> listB = this.f76319c.b();
                Intrinsics.checkNotNull(listB);
                cVar.b(listB);
            } else {
                cVar.b(CollectionsKt.emptyList());
            }
            Unit unit = Unit.f312394a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.j
    public void d(@NotNull androidx.core.util.e<List<t>> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        ReentrantLock reentrantLock = f76315g;
        reentrantLock.lock();
        try {
            for (c cVar : l()) {
                if (Intrinsics.areEqual(cVar.d(), consumer)) {
                    l().remove(cVar);
                    break;
                }
            }
            Unit unit = Unit.f312394a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.j
    public boolean e() {
        return this.f76317a != null;
    }

    @Override // androidx.window.embedding.j
    public void f(@NotNull m rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        if (this.f76320d.contains(rule)) {
            this.f76320d.remove(rule);
            l lVar = this.f76317a;
            if (lVar == null) {
                return;
            }
            lVar.a(this.f76320d);
        }
    }

    @Override // androidx.window.embedding.j
    public void g(@NotNull m rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        if (this.f76320d.contains(rule)) {
            return;
        }
        this.f76320d.add(rule);
        l lVar = this.f76317a;
        if (lVar == null) {
            return;
        }
        lVar.a(this.f76320d);
    }

    @Nullable
    public final l k() {
        return this.f76317a;
    }

    @NotNull
    public final CopyOnWriteArrayList<c> l() {
        return this.f76318b;
    }

    public final void n(@Nullable l lVar) {
        this.f76317a = lVar;
    }
}
