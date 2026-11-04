package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.w0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public class i<K, V> implements Iterator<a<V>>, qj.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f35741g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Object f35742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d<K, V> f35743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Object f35744c = i0.c.f286699a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35747f;

    public i(@Nullable Object obj, @NotNull d<K, V> dVar) {
        this.f35742a = obj;
        this.f35743b = dVar;
        this.f35746e = dVar.b().b();
    }

    private final void b() {
        if (this.f35743b.b().b() != this.f35746e) {
            throw new ConcurrentModificationException();
        }
    }

    private final void c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void d() {
        if (!this.f35745d) {
            throw new IllegalStateException();
        }
    }

    @NotNull
    public final d<K, V> e() {
        return this.f35743b;
    }

    public final int f() {
        return this.f35747f;
    }

    @Nullable
    public final Object g() {
        return this.f35744c;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a<V> next() {
        b();
        c();
        this.f35744c = this.f35742a;
        this.f35745d = true;
        this.f35747f++;
        a<V> aVar = this.f35743b.b().get(this.f35742a);
        if (aVar != null) {
            a<V> aVar2 = aVar;
            this.f35742a = aVar2.c();
            return aVar2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f35742a + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f35747f < this.f35743b.size();
    }

    public final void i(int i10) {
        this.f35747f = i10;
    }

    public final void j(@Nullable Object obj) {
        this.f35744c = obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        d();
        r1.k(this.f35743b).remove(this.f35744c);
        this.f35744c = null;
        this.f35745d = false;
        this.f35746e = this.f35743b.b().b();
        this.f35747f--;
    }
}
