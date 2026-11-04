package com.planner5d.library.services.backgroundexecutor;

import android.content.Context;
import com.planner5d.library.services.backgroundexecutor.e;

/* JADX INFO: loaded from: classes10.dex */
public interface a<T extends e> {
    boolean a(e message);

    void b(Context context);

    T c(Context context, T message);

    void d(T message);
}
