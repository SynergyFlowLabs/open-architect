package tk;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class h<T> implements a<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f381073b = 86241875189L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f381074a;

    public h() {
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() == obj.getClass()) {
            return this.f381074a.equals(((h) obj).f381074a);
        }
        return false;
    }

    @Override // tk.a
    public T getValue() {
        return this.f381074a;
    }

    public int hashCode() {
        T t10 = this.f381074a;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    @Override // tk.a
    public void setValue(T t10) {
        this.f381074a = t10;
    }

    public String toString() {
        T t10 = this.f381074a;
        return t10 == null ? AbstractJsonLexerKt.NULL : t10.toString();
    }

    public h(T t10) {
        this.f381074a = t10;
    }
}
