package androidx.databinding;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface y<T> extends List<T> {

    public static abstract class a<T extends y> {
        public abstract void a(T sender);

        public abstract void c(T sender, int positionStart, int itemCount);

        public abstract void f(T sender, int positionStart, int itemCount);

        public abstract void g(T sender, int fromPosition, int toPosition, int itemCount);

        public abstract void h(T sender, int positionStart, int itemCount);
    }

    void X2(a<? extends y<T>> callback);

    void f3(a<? extends y<T>> callback);
}
