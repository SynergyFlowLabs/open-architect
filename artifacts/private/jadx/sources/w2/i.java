package w2;

import androidx.annotation.l0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n+ 2 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,132:1\n38#2:133\n38#2:135\n38#2:137\n38#2:139\n23#3:134\n23#3:136\n23#3:138\n23#3:140\n*S KotlinDebug\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n*L\n80#1:133\n103#1:135\n117#1:137\n122#1:139\n80#1:134\n103#1:136\n117#1:138\n122#1:140\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f385878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, AutoCloseable> f385879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<AutoCloseable> f385880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f385881d;

    public i() {
        this.f385878a = new f();
        this.f385879b = new LinkedHashMap();
        this.f385880c = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                androidx.documentfile.provider.b.a(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void d(@NotNull AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.f385881d) {
            g(closeable);
            return;
        }
        synchronized (this.f385878a) {
            try {
                this.f385880c.add(closeable);
                Unit unit = Unit.f312394a;
            } finally {
            }
        }
    }

    public final void e(@NotNull String key, @NotNull AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.f385881d) {
            g(closeable);
            return;
        }
        synchronized (this.f385878a) {
            try {
                autoCloseable = (AutoCloseable) this.f385879b.put(key, closeable);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g(autoCloseable);
    }

    @l0
    public final void f() {
        if (this.f385881d) {
            return;
        }
        this.f385881d = true;
        synchronized (this.f385878a) {
            try {
                Iterator it = this.f385879b.values().iterator();
                while (it.hasNext()) {
                    g((AutoCloseable) it.next());
                }
                Iterator it2 = this.f385880c.iterator();
                while (it2.hasNext()) {
                    g((AutoCloseable) it2.next());
                }
                this.f385880c.clear();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public final <T extends AutoCloseable> T h(@NotNull String key) {
        T t10;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f385878a) {
            try {
                t10 = (T) this.f385879b.get(key);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public i(@NotNull s0 viewModelScope) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        this.f385878a = new f();
        this.f385879b = new LinkedHashMap();
        this.f385880c = new LinkedHashSet();
        e(c.f385875a, c.a(viewModelScope));
    }

    public i(@NotNull AutoCloseable... closeables) {
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.f385878a = new f();
        this.f385879b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f385880c = linkedHashSet;
        CollectionsKt.addAll(linkedHashSet, closeables);
    }

    public i(@NotNull s0 viewModelScope, @NotNull AutoCloseable... closeables) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.f385878a = new f();
        this.f385879b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f385880c = linkedHashSet;
        e(c.f385875a, c.a(viewModelScope));
        CollectionsKt.addAll(linkedHashSet, closeables);
    }
}
