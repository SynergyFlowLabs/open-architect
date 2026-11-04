package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n360#1,4:417\n1#2:421\n1#2:422\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n*L\n341#1:417,4\n341#1:421\n*E\n"})
abstract class z0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l0<K, V> f36630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Iterator<Map.Entry<K, V>> f36631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Map.Entry<? extends K, ? extends V> f36633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Map.Entry<? extends K, ? extends V> f36634e;

    /* JADX WARN: Multi-variable type inference failed */
    public z0(@NotNull l0<K, V> l0Var, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.f36630a = l0Var;
        this.f36631b = it;
        this.f36632c = l0Var.j();
        d();
    }

    protected final void d() {
        this.f36633d = this.f36634e;
        this.f36634e = this.f36631b.hasNext() ? this.f36631b.next() : null;
    }

    @Nullable
    protected final Map.Entry<K, V> e() {
        return this.f36633d;
    }

    @NotNull
    public final Iterator<Map.Entry<K, V>> f() {
        return this.f36631b;
    }

    @NotNull
    public final l0<K, V> g() {
        return this.f36630a;
    }

    protected final int h() {
        return this.f36632c;
    }

    public final boolean hasNext() {
        return this.f36634e != null;
    }

    @Nullable
    protected final Map.Entry<K, V> i() {
        return this.f36634e;
    }

    protected final <T> T j(@NotNull Function0<? extends T> function0) {
        if (g().j() != this.f36632c) {
            throw new ConcurrentModificationException();
        }
        T tInvoke = function0.invoke();
        this.f36632c = g().j();
        return tInvoke;
    }

    protected final void k(@Nullable Map.Entry<? extends K, ? extends V> entry) {
        this.f36633d = entry;
    }

    protected final void l(int i10) {
        this.f36632c = i10;
    }

    protected final void m(@Nullable Map.Entry<? extends K, ? extends V> entry) {
        this.f36634e = entry;
    }

    public final void remove() {
        if (g().j() != this.f36632c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.f36633d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.f36630a.remove(entry.getKey());
        this.f36633d = null;
        Unit unit = Unit.f312394a;
        this.f36632c = g().j();
    }
}
