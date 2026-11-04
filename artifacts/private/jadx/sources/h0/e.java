package h0;

import androidx.compose.runtime.internal.w0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class e<E> extends d<E> implements Iterator<E>, qj.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f280083i = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c<E> f280084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private E f280085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f280086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f280087h;

    public e(@NotNull c<E> cVar) {
        super(cVar.c(), cVar.i());
        this.f280084e = cVar;
        this.f280087h = cVar.i().b();
    }

    private final void f() {
        if (this.f280084e.i().b() != this.f280087h) {
            throw new ConcurrentModificationException();
        }
    }

    private final void g() {
        if (!this.f280086g) {
            throw new IllegalStateException();
        }
    }

    @Override // h0.d, java.util.Iterator
    public E next() {
        f();
        E e10 = (E) super.next();
        this.f280085f = e10;
        this.f280086g = true;
        return e10;
    }

    @Override // h0.d, java.util.Iterator
    public void remove() {
        g();
        r1.a(this.f280084e).remove(this.f280085f);
        this.f280085f = null;
        this.f280086g = false;
        this.f280087h = this.f280084e.i().b();
        e(c() - 1);
    }
}
