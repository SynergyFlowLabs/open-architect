package androidx.startup;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface b<T> {
    @NonNull
    T create(@NonNull Context context);

    @NonNull
    List<Class<? extends b<?>>> dependencies();
}
