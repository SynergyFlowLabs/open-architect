package io.noties.markwon;

import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public interface i {

    public interface a<P extends i> {
        void a(@NonNull P p10);
    }

    public interface b {
        @NonNull
        <P extends i> P b(@NonNull Class<P> cls);

        <P extends i> void c(@NonNull Class<P> cls, @NonNull a<? super P> aVar);
    }

    void a(@NonNull b bVar);

    void b(@NonNull org.commonmark.node.v vVar);

    void c(@NonNull TextView textView);

    void d(@NonNull m.b bVar);

    void e(@NonNull k.a aVar);

    void f(@NonNull org.commonmark.parser.d.b bVar);

    void g(@NonNull g.b bVar);

    void h(@NonNull org.commonmark.node.v vVar, @NonNull m mVar);

    @NonNull
    String i(@NonNull String str);

    void j(@NonNull io.noties.markwon.core.c.a aVar);

    void k(@NonNull TextView textView, @NonNull Spanned spanned);
}
