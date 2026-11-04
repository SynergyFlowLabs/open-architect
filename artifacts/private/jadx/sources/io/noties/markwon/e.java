package io.noties.markwon;

import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e {

    public interface a {
        @NonNull
        a a(@NonNull i iVar);

        @NonNull
        a b(@NonNull Iterable<? extends i> iterable);

        @NonNull
        e build();

        @NonNull
        a c(@NonNull TextView.BufferType bufferType);

        @NonNull
        a d(@NonNull b bVar);

        @NonNull
        a e(boolean z10);
    }

    public interface b {
        void a(@NonNull TextView textView, @NonNull Spanned spanned, @NonNull TextView.BufferType bufferType, @NonNull Runnable runnable);
    }

    @NonNull
    public static a a(@NonNull Context context) {
        return new f(context).a(io.noties.markwon.core.a.s());
    }

    @NonNull
    public static a b(@NonNull Context context) {
        return new f(context);
    }

    @NonNull
    public static e d(@NonNull Context context) {
        return a(context).a(io.noties.markwon.core.a.s()).build();
    }

    @NonNull
    public abstract g c();

    @p0
    public abstract <P extends i> P e(@NonNull Class<P> cls);

    @NonNull
    public abstract List<? extends i> f();

    public abstract boolean g(@NonNull Class<? extends i> cls);

    @NonNull
    public abstract org.commonmark.node.v h(@NonNull String str);

    @NonNull
    public abstract Spanned i(@NonNull org.commonmark.node.v vVar);

    @NonNull
    public abstract <P extends i> P j(@NonNull Class<P> cls);

    public abstract void k(@NonNull TextView textView, @NonNull String str);

    public abstract void l(@NonNull TextView textView, @NonNull Spanned spanned);

    @NonNull
    public abstract Spanned m(@NonNull String str);
}
