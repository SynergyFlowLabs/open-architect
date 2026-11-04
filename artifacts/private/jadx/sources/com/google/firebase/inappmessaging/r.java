package com.google.firebase.inappmessaging;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes5.dex */
public interface r {

    public enum a {
        UNKNOWN_DISMISS_TYPE,
        AUTO,
        CLICK,
        SWIPE
    }

    public enum b {
        UNSPECIFIED_RENDER_ERROR,
        IMAGE_FETCH_ERROR,
        IMAGE_DISPLAY_ERROR,
        IMAGE_UNSUPPORTED_FORMAT;

        static {
            int i10 = 0 >> 1;
        }
    }

    @NonNull
    Task<Void> a(@NonNull com.google.firebase.inappmessaging.model.a aVar);

    @NonNull
    Task<Void> b(@NonNull b bVar);

    @NonNull
    Task<Void> c();

    @NonNull
    Task<Void> d(@NonNull a aVar);
}
