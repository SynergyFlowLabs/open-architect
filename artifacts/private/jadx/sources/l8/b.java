package l8;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.e;
import com.google.firebase.encoders.g;
import l8.b;

/* JADX INFO: loaded from: classes5.dex */
public interface b<T extends b<T>> {
    @NonNull
    <U> T a(@NonNull Class<U> cls, @NonNull g<? super U> gVar);

    @NonNull
    <U> T b(@NonNull Class<U> cls, @NonNull e<? super U> eVar);
}
