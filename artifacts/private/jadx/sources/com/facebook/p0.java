package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends AbstractList<GraphRequest> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final b f101730g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final AtomicInteger f101731h = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Handler f101732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f101733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f101734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private List<GraphRequest> f101735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private List<a> f101736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f101737f;

    public interface a {
        void a(@NotNull p0 p0Var);
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public interface c extends a {
        void b(@NotNull p0 p0Var, long j10, long j11);
    }

    public p0() {
        this.f101734c = String.valueOf(Integer.valueOf(f101731h.incrementAndGet()));
        this.f101736e = new ArrayList();
        this.f101735d = new ArrayList();
    }

    private final List<q0> m() {
        return GraphRequest.f98518n.j(this);
    }

    private final o0 p() {
        return GraphRequest.f98518n.m(this);
    }

    public int A() {
        return this.f101735d.size();
    }

    public final int B() {
        return this.f101733b;
    }

    public /* bridge */ int C(GraphRequest graphRequest) {
        return super.indexOf(graphRequest);
    }

    public /* bridge */ int D(GraphRequest graphRequest) {
        return super.lastIndexOf(graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ GraphRequest remove(int i10) {
        return J(i10);
    }

    public /* bridge */ boolean G(GraphRequest graphRequest) {
        return super.remove(graphRequest);
    }

    @NotNull
    public GraphRequest J(int i10) {
        return this.f101735d.remove(i10);
    }

    public final void K(@NotNull a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f101736e.remove(callback);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public GraphRequest set(int i10, @NotNull GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f101735d.set(i10, element);
    }

    public final void M(@Nullable String str) {
        this.f101737f = str;
    }

    public final void N(@Nullable Handler handler) {
        this.f101732a = handler;
    }

    public final void O(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Argument timeoutInMilliseconds must be >= 0.");
        }
        this.f101733b = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, @NotNull GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.f101735d.add(i10, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f101735d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return k((GraphRequest) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(@NotNull GraphRequest element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f101735d.add(element);
    }

    public final void i(@NotNull a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.f101736e.contains(callback)) {
            this.f101736e.add(callback);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return C((GraphRequest) obj);
        }
        return -1;
    }

    public /* bridge */ boolean k(GraphRequest graphRequest) {
        return super.contains(graphRequest);
    }

    @NotNull
    public final List<q0> l() {
        return m();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return D((GraphRequest) obj);
        }
        return -1;
    }

    @NotNull
    public final o0 n() {
        return p();
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public GraphRequest get(int i10) {
        return this.f101735d.get(i10);
    }

    @Nullable
    public final String s() {
        return this.f101737f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return A();
    }

    @Nullable
    public final Handler t() {
        return this.f101732a;
    }

    @NotNull
    public final List<a> u() {
        return this.f101736e;
    }

    @NotNull
    public final String v() {
        return this.f101734c;
    }

    @NotNull
    public final List<GraphRequest> w() {
        return this.f101735d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return G((GraphRequest) obj);
        }
        return false;
    }

    public p0(@NotNull Collection<GraphRequest> requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f101734c = String.valueOf(Integer.valueOf(f101731h.incrementAndGet()));
        this.f101736e = new ArrayList();
        this.f101735d = new ArrayList(requests);
    }

    public p0(@NotNull GraphRequest... requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f101734c = String.valueOf(Integer.valueOf(f101731h.incrementAndGet()));
        this.f101736e = new ArrayList();
        this.f101735d = new ArrayList(ArraysKt.asList(requests));
    }

    public p0(@NotNull p0 requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f101734c = String.valueOf(Integer.valueOf(f101731h.incrementAndGet()));
        this.f101736e = new ArrayList();
        this.f101735d = new ArrayList(requests);
        this.f101732a = requests.f101732a;
        this.f101733b = requests.f101733b;
        this.f101736e = new ArrayList(requests.f101736e);
    }
}
