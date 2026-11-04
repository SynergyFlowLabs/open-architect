package kotlin;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class z<T> implements f0<T>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f313462a;

    public z(T t10) {
        this.f313462a = t10;
    }

    @Override // kotlin.f0
    public boolean Z() {
        return true;
    }

    @Override // kotlin.f0
    public T getValue() {
        return this.f313462a;
    }

    @NotNull
    public String toString() {
        return String.valueOf(getValue());
    }
}
