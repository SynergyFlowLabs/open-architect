package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.m1;
import androidx.work.impl.r0;
import androidx.work.l0;
import androidx.work.n0;
import com.google.common.util.concurrent.t1;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class z<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<T> f77286a = androidx.work.impl.utils.futures.c.u();

    class a extends z<List<l0>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0 f77287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f77288c;

        a(final r0 val$workManager, final List val$ids) {
            this.f77287b = val$workManager;
            this.f77288c = val$ids;
        }

        @Override // androidx.work.impl.utils.z
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<l0> g() {
            return androidx.work.impl.model.v.A.apply(this.f77287b.S().k().S(this.f77288c));
        }
    }

    class b extends z<l0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0 f77289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f77290c;

        b(final r0 val$workManager, final UUID val$id) {
            this.f77289b = val$workManager;
            this.f77290c = val$id;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.z
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public l0 g() {
            androidx.work.impl.model.v.c cVarG = this.f77289b.S().k().G(this.f77290c.toString());
            if (cVarG != null) {
                return cVarG.S();
            }
            return null;
        }
    }

    class c extends z<List<l0>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0 f77291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f77292c;

        c(final r0 val$workManager, final String val$tag) {
            this.f77291b = val$workManager;
            this.f77292c = val$tag;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.z
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<l0> g() {
            return androidx.work.impl.model.v.A.apply(this.f77291b.S().k().Q(this.f77292c));
        }
    }

    class d extends z<List<l0>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0 f77293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f77294c;

        d(final r0 val$workManager, final String val$name) {
            this.f77293b = val$workManager;
            this.f77294c = val$name;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.z
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<l0> g() {
            return androidx.work.impl.model.v.A.apply(this.f77293b.S().k().n(this.f77294c));
        }
    }

    class e extends z<List<l0>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0 f77295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0 f77296c;

        e(final r0 val$workManager, final n0 val$querySpec) {
            this.f77295b = val$workManager;
            this.f77296c = val$querySpec;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.z
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<l0> g() {
            return androidx.work.impl.model.v.A.apply(this.f77295b.S().g().a(w.b(this.f77296c)));
        }
    }

    @NonNull
    public static z<List<l0>> a(@NonNull final r0 workManager, @NonNull final List<String> ids) {
        return new a(workManager, ids);
    }

    @NonNull
    public static z<List<l0>> b(@NonNull final r0 workManager, @NonNull final String tag) {
        return new c(workManager, tag);
    }

    @NonNull
    public static z<l0> c(@NonNull final r0 workManager, @NonNull final UUID id2) {
        return new b(workManager, id2);
    }

    @NonNull
    public static z<List<l0>> d(@NonNull final r0 workManager, @NonNull final String name) {
        return new d(workManager, name);
    }

    @NonNull
    public static z<List<l0>> e(@NonNull final r0 workManager, @NonNull final n0 querySpec) {
        return new e(workManager, querySpec);
    }

    @NonNull
    public t1<T> f() {
        return this.f77286a;
    }

    @m1
    abstract T g();

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f77286a.p(g());
        } catch (Throwable th2) {
            this.f77286a.q(th2);
        }
    }
}
