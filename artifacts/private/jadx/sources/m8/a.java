package m8;

import com.google.firebase.components.i0;

/* JADX INFO: loaded from: classes5.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<T> f322846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f322847b;

    public a(Class<T> cls, T t10) {
        this.f322846a = (Class) i0.b(cls);
        this.f322847b = (T) i0.b(t10);
    }

    public T a() {
        return this.f322847b;
    }

    public Class<T> b() {
        return this.f322846a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f322846a, this.f322847b);
    }
}
