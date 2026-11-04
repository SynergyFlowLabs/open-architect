package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface r0 {
    void a(@NonNull Menu menu, @NonNull MenuInflater menuInflater);

    default void b(@NonNull Menu menu) {
    }

    default void c(@NonNull Menu menu) {
    }

    boolean d(@NonNull MenuItem menuItem);
}
