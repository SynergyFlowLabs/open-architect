package uk;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public abstract class e<L, R> implements Map.Entry<L, R>, Comparable<e<L, R>>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f381279a = 4954918890077093841L;

    public static <L, R> e<L, R> n(L l10, R r10) {
        return new a(l10, r10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(e<L, R> eVar) {
        return new org.apache.commons.lang3.builder.b().g(k(), eVar.k()).g(l(), eVar.l()).D();
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final L getKey() {
        return k();
    }

    @Override // java.util.Map.Entry
    public R getValue() {
        return l();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
    }

    public abstract L k();

    public abstract R l();

    public String o(String str) {
        return String.format(str, k(), l());
    }

    public String toString() {
        return "(" + k() + AbstractJsonLexerKt.COMMA + l() + ')';
    }
}
