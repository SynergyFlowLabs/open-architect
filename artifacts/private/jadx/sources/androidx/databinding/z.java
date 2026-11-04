package androidx.databinding;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface z<K, V> extends Map<K, V> {

    public static abstract class a<T extends z<K, V>, K, V> {
        public abstract void a(T sender, K key);
    }

    void s3(a<? extends z<K, V>, K, V> callback);

    void y2(a<? extends z<K, V>, K, V> callback);
}
